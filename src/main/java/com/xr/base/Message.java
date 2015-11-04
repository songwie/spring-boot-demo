package com.xr.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Message {
	/**
	 * 存储头部信息
	 */
	private Map<String, Object> head;
	/**
	 * 存储内容信息
	 */
	private Map<String, Object> body;

	private Message() {
	}

	/**
	 * 构造器
	 * 
	 * @param head
	 * @param body
	 */
	private Message(Map<String, Object> head, Map<String, Object> body) {
		this.head = head;
		this.body = body;
	}

	/**
	 * 获取一个Message 实例
	 * 
	 * @return 一个新的 Message 实例
	 */
	private static Message getInstance() {
		return new Message(new HashMap<String, Object>(),
				new HashMap<String, Object>());
	}

	/**
	 * 获取一个 成功的 Message 实例
	 * 
	 * @return 一个新的 Message 实例 包含一个成功头部
	 */
	public static Message getInstanceContainSuccessHeader() {
		return getInstance().addHeadStatus(1).addHeadRemark("success");
	}

	/**
	 * 获取一个 成功的 Message 实例
	 * 
	 * @return 一个新的 Message 实例 包含一个成功头部和body
	 */
	public static Message getInstanceContainSuccessHeaderAndBody() {
		return getInstanceContainSuccessHeader().addBodyKeyAndValue("tip",
				"操作成功");
	}

	/**
	 * 获取一个 失败 Message 实例
	 * 
	 * @param cause
	 *            失败原因
	 * @return 一个新的 Message 实例 包含一个失败头部
	 */
	public static Message getInstanceContainFailHeader(String cause) {
		return getInstance().addHeadStatus(0).addHeadRemark(cause);
	}

	/**
	 * 往头部增加状态
	 * 
	 * @param key
	 * @param value
	 *            0 失败<br/>
	 *            1 成功 <br/>
	 *            2 无权限
	 * @return
	 */
	public Message addHeadStatus(int value) {
		head.put("status", value);
		return this;
	}
	public static final String HEAD_STATUS = "status";
	public static final String HEAD_CAUSE = "cause";

	public Integer getHeadStatus(){
		return (Integer)head.get("status");
	}
	/**
	 * 往头部增加原因
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Message addHeadRemark(String value) {
		head.put("cause", value);
		return this;
	}

	/**
	 * 往内容区增加错误code
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	private Message addBodyErrorCode(int value) {
		body.put("errCode", value);
		return this;
	}

	/**
	 * 往内容区增加错误原因
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	private Message addBodyErrorCause(String value) {
		body.put("errMessage", value);
		return this;
	}

	public Message addBodyErrorMessage(String key) {

		for (MessageErrorType error : errors) {
			if (key.equals(error.getKey())) {
				addBodyErrorCode(error.getCode());
				addBodyErrorCause(error.getDescription());
				break;
			}
		}

		return this;
	}

	/**
	 * 往头部移除数据
	 * 
	 * @param key
	 * @return
	 */
	public Message removeHeadByKey(String key) {
		head.remove(key);
		return this;
	}

	/**
	 * 往内容区增加数据
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Message addBodyKeyAndValue(String key, Object value) {
		value = value == null ? "" : value;
		body.put(key, value);
		return this;
	}

	/**
	 * 往内容区增加数据
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Message addBodyKeyAndValue(Map<String, Object> map) {
		body.putAll(map);
		return this;
	}

	/**
	 * 往内容区移除数据
	 * 
	 * @param key
	 * @return
	 */
	public Message removeBodyByKey(String key) {
		body.remove(key);
		return this;
	}

	public Map<String, Object> getHead() {
		return head;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	private static List<MessageErrorType> errors = new ArrayList<Message.MessageErrorType>();

	public static void addMessageErrorType(String key, int code,
			String description) {
		errors.add(new MessageErrorType(key, code, description));
	}

	private static class MessageErrorType {
		private String key;
		private int code;
		private String description;

		public MessageErrorType(String key, int code, String description) {
			this.key = key;
			this.code = code;
			this.description = description;
		}

		public String getKey() {
			return key;
		}

		public int getCode() {
			return code;
		}

		public String getDescription() {
			return description;
		}

	}
	
}