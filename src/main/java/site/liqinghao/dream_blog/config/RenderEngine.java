package site.liqinghao.dream_blog.config;

import cn.hutool.extra.template.Template;
import cn.hutool.extra.template.TemplateConfig;
import cn.hutool.extra.template.TemplateEngine;
import cn.hutool.extra.template.TemplateUtil;

public final class RenderEngine {
	private static final TemplateEngine ENGINE = TemplateUtil.createEngine(
			new TemplateConfig("templates", TemplateConfig.ResourceMode.CLASSPATH)
	                                                                      );

	/**
	 * 获取模板
	 *
	 * @param name 模板文件名
	 */
	public static Template getTemplate(String name) {
		return ENGINE.getTemplate(name);
	}
}
