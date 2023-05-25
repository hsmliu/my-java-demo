package com.mybatis.controller;


import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.mybatis.utils.JsonData;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.mybatis.service.IIdSegmentService;
import com.mybatis.entity.IdSegment;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘文成
 * @since 2023-05-25
 */
@RestController
@RequestMapping("/id-segment")
public class IdSegmentController {

    @Resource
    private IIdSegmentService idSegmentService;

    /**
     * 查询所有接口
     * @return
     */
    @GetMapping("/findAll")
    public JsonData findAll() {
        Map<String, Object> result = new TreeMap<>();
        List<IdSegment> queryResult = idSegmentService.list();
        result.put("total", queryResult.size());
        result.put("list", queryResult);
        return JsonData.buildSuccess(result);
    }
    /**
     * 根据id查询数据接口
     * @param id 主键
     * @return
     */
    @GetMapping("/{id}")
    public JsonData findOne(@PathVariable Integer id) {
        return JsonData.buildSuccess(idSegmentService.getById(id));
    }
    /**
     * 分页查询接口
     * @param pageNum 页码
     * @param pageSize 每页最大数
     * @return
     */
    @GetMapping("/page")
    public JsonData findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize) {
        QueryWrapper<IdSegment> queryWrapper = new QueryWrapper<>();
        return JsonData.buildSuccess(idSegmentService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }
    /**
     * 新增和更新接口
     * @param idSegment 
     * @return
     */
    @PostMapping("/save")
    public JsonData save(@RequestBody IdSegment idSegment) {
        idSegmentService.saveOrUpdate(idSegment);
        return JsonData.buildSuccess();
    }
    /**
     * 删除接口
     * @param id 主键
     * @return
     */
    @DeleteMapping("/{id}")
    public JsonData delete(@PathVariable Integer id) {
        idSegmentService.removeById(id);
        return JsonData.buildSuccess();
    }
    /**
     * 批量删除接口
     * @param ids 主键集合
     * @return
     */
    @PostMapping("/del/batch")
    public JsonData deleteBatch(@RequestBody List<Integer> ids) {
        idSegmentService.removeByIds(ids);
        return JsonData.buildSuccess();
    }

}
