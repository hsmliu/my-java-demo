package com.mybatis.service.impl;

import com.mybatis.entity.ProductOrder;
import com.mybatis.mapper.ProductOrderMapper;
import com.mybatis.service.IProductOrderService;
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
public class ProductOrderServiceImpl extends ServiceImpl<ProductOrderMapper, ProductOrder> implements IProductOrderService {

}
