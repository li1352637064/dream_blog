package site.liqinghao.dream_blog.admin.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Dict;
import cn.hutool.extra.template.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.liqinghao.dream_blog.config.RenderEngine;

@RestController("/")
@RequiredArgsConstructor
public class IndexCtrl {

	@GetMapping("/")
	public String index() {
		Template tml = RenderEngine.getTemplate("index.html");
		return tml.render(Dict.create()
		                      .set("name", "梦幻墟都")
		                      .set("nowTime", DateUtil.now())
		                 );
	}

	@GetMapping("/static")
	public String statix(){
		return null;
	}
}
