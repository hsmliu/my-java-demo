package com.mybatis.controller;


import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import com.mybatis.utils.JsonData;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.mybatis.service.IProductOrderService;
import com.mybatis.entity.ProductOrder;
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
@RequestMapping("/product-order")
public class ProductOrderController {

    @Resource
    private IProductOrderService productOrderService;

    /**
     * 查询所有接口
     * @return
     */
    @GetMapping("/findAll")
    public JsonData findAll() {
        Map<String, Object> result = new TreeMap<>();
        List<ProductOrder> queryResult = productOrderService.list();
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
        return JsonData.buildSuccess(productOrderService.getById(id));
    }
    /**
     * 分页查询接口
     * @param pageNum 页码
     * @param pageSize 每页最大数
     * @return
     */
    @GetMapping("/page")
    public JsonData findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize) {
        QueryWrapper<ProductOrder> queryWrapper = new QueryWrapper<>();
        return JsonData.buildSuccess(productOrderService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }
    /**
     * 新增和更新接口
     * @param productOrder 
     * @return
     */
    @PostMapping("/save")
    public JsonData save(@RequestBody ProductOrder productOrder) {
        productOrderService.saveOrUpdate(productOrder);
        return JsonData.buildSuccess();
    }
    /**
     * 删除接口
     * @param id 主键
     * @return
     */
    @DeleteMapping("/{id}")
    public JsonData delete(@PathVariable Integer id) {
        productOrderService.removeById(id);
        return JsonData.buildSuccess();
    }
    /**
     * 批量删除接口
     * @param ids 主键集合
     * @return
     */
    @PostMapping("/del/batch")
    public JsonData deleteBatch(@RequestBody List<Integer> ids) {
        productOrderService.removeByIds(ids);
        return JsonData.buildSuccess();
    }

}
