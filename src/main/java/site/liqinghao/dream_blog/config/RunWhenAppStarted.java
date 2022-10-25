package site.liqinghao.dream_blog.config;

import cn.hutool.log.StaticLog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Service;

/**
 * 应用启动后运行
 */
@Service
public class RunWhenAppStarted implements ApplicationRunner {
	@Value("${server.address}")
	private String address;
	@Value("${server.port}")
	private String port;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		StaticLog.info("运行成功,访问首页:http://{}:{}", address, port);
	}
}
