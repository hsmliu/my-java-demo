package com.mybatis.entity;

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
  public class World implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String continent;

    private Integer area;

    private Integer population;

    private Integer gdp;


}
