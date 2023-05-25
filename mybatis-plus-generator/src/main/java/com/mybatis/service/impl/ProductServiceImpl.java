package com.mybatis.service.impl;

import com.mybatis.entity.Product;
import com.mybatis.mapper.ProductMapper;
import com.mybatis.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 刘文成
 * @since 2023-05-25
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
