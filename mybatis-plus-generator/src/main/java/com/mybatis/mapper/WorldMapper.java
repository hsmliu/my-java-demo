package com.mybatis.mapper;

import com.mybatis.entity.World;
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
public interface WorldMapper extends BaseMapper<World> {

}
