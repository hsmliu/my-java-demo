package com.mybatis.service.impl;

import com.mybatis.entity.World;
import com.mybatis.mapper.WorldMapper;
import com.mybatis.service.IWorldService;
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
public class WorldServiceImpl extends ServiceImpl<WorldMapper, World> implements IWorldService {

}
