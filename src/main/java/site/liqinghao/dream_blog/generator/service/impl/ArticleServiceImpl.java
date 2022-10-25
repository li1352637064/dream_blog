package site.liqinghao.dream_blog.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import site.liqinghao.dream_blog.generator.domain.Article;
import site.liqinghao.dream_blog.generator.service.ArticleService;
import site.liqinghao.dream_blog.generator.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description 针对表【article】的数据库操作Service实现
 * @createDate 2022-10-23 16:00:41
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}




