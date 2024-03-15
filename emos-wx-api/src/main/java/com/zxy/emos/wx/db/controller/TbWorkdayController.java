package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbWorkday;
import com.zxy.emos.wx.db.service.TbWorkdayService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbWorkday)表控制层
 *
 * @author makejava
 * @since 2024-03-13 15:14:42
 */
@RestController
@RequestMapping("tbWorkday")
public class TbWorkdayController {
    /**
     * 服务对象
     */
    @Resource
    private TbWorkdayService tbWorkdayService;

    /**
     * 分页查询
     *
     * @param tbWorkday 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbWorkday>> queryByPage(TbWorkday tbWorkday, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbWorkdayService.queryByPage(tbWorkday, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbWorkday> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbWorkdayService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbWorkday 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbWorkday> add(TbWorkday tbWorkday) {
        return ResponseEntity.ok(this.tbWorkdayService.insert(tbWorkday));
    }

    /**
     * 编辑数据
     *
     * @param tbWorkday 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbWorkday> edit(TbWorkday tbWorkday) {
        return ResponseEntity.ok(this.tbWorkdayService.update(tbWorkday));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbWorkdayService.deleteById(id));
    }

}

