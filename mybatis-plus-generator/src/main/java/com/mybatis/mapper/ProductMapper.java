package com.mybatis.mapper;

import com.mybatis.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 刘文成
 * @since 2023-05-25
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
