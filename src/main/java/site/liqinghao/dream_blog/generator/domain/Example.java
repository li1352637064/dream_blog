package site.liqinghao.dream_blog.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;

/**
 * @TableName example
 */
@TableName(value = "example")
@Data
public class Example implements Serializable {
    @TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Integer id;

	/**
	 *
	 */
	private String name;
}