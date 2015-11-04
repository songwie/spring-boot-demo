package com.xr;

import java.util.Collections;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan//组件扫描     
@Configuration//配置控制     
@EnableAutoConfiguration//启用自动配置     
//@ImportResource({"classpath:dubbo-context.xml"}) //加入spring的bean的xml文件
@SpringBootApplication
public class RootApplication implements  ServletContextInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	   servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
	   SessionCookieConfig sessionCookieConfig=servletContext.getSessionCookieConfig();
	   sessionCookieConfig.setHttpOnly(true);
	}
}
