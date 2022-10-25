package site.liqinghao.dream_blog;

import cn.hutool.log.StaticLog;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("site.liqinghao.dream_blog.generator.mapper")
public class DreamBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamBlogApplication.class, args);
	}

}
