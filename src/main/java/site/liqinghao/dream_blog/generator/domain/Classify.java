package site.liqinghao.dream_blog.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName classify
 */
@TableName(value ="classify")
@Data
public class Classify implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String name;

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