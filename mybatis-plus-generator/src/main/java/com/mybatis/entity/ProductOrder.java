package com.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 刘文成
 * @since 2023-05-25
 */
@Getter
@Setter
  @TableName("product_order")
public class ProductOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderName;

    private Double price;

    private Integer enumType;

    private String isDel;

    private String transactionId;


}
