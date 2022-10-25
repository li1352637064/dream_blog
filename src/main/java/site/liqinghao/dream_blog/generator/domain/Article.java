package site.liqinghao.dream_blog.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName article
 */
@TableName(value ="article")
@Data
public class Article implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String cover;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Integer classifyid;

    /**
     * 
     */
    private Integer viewcount;

    /**
     * 
     */
    private String createtime;

    /**
     * 
     */
    private String updatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}