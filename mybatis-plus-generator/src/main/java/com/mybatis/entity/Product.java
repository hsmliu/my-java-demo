package com.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
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
  public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String coverImg;

    private String detail;

    private Integer amount;

    private Integer stock;

    private LocalDateTime createTime;


}
