package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbHolidays;
import com.zxy.emos.wx.db.service.TbHolidaysService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 节假日表(TbHolidays)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:58:23
 */
@RestController
@RequestMapping("tbHolidays")
public class TbHolidaysController {
    /**
     * 服务对象
     */
    @Resource
    private TbHolidaysService tbHolidaysService;

    /**
     * 分页查询
     *
     * @param tbHolidays 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbHolidays>> queryByPage(TbHolidays tbHolidays, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbHolidaysService.queryByPage(tbHolidays, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbHolidays> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbHolidaysService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbHolidays 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbHolidays> add(TbHolidays tbHolidays) {
        return ResponseEntity.ok(this.tbHolidaysService.insert(tbHolidays));
    }

    /**
     * 编辑数据
     *
     * @param tbHolidays 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbHolidays> edit(TbHolidays tbHolidays) {
        return ResponseEntity.ok(this.tbHolidaysService.update(tbHolidays));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbHolidaysService.deleteById(id));
    }

}

