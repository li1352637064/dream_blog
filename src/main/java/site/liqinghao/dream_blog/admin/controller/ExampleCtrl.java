package site.liqinghao.dream_blog.admin.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.log.StaticLog;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import site.liqinghao.dream_blog.generator.domain.Example;
import site.liqinghao.dream_blog.generator.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/example")
@RequiredArgsConstructor
public class ExampleCtrl {
	private final ExampleService exampleSrv;

	@GetMapping("/index")
	public String index() {
		StaticLog.info("访问首页");
		return RandomUtil.randomString(10);
	}

	@GetMapping("/get")
	public Example get() {
		Example data = exampleSrv.getBaseMapper()
		                         .selectOne(
				                         new LambdaQueryWrapper<Example>()
						                         .orderByAsc(Example::getId)
						                         .last("LIMIT 1")
		                                   );
		StaticLog.info("获取数据: {}", data);
		return data;
	}
}
