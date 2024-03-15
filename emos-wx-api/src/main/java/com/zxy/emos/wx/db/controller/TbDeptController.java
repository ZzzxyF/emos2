package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbDept;
import com.zxy.emos.wx.db.service.TbDeptService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbDept)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:57:26
 */
@RestController
@RequestMapping("tbDept")
public class TbDeptController {
    /**
     * 服务对象
     */
    @Resource
    private TbDeptService tbDeptService;

    /**
     * 分页查询
     *
     * @param tbDept 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbDept>> queryByPage(TbDept tbDept, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbDeptService.queryByPage(tbDept, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbDept> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbDeptService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbDept 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbDept> add(TbDept tbDept) {
        return ResponseEntity.ok(this.tbDeptService.insert(tbDept));
    }

    /**
     * 编辑数据
     *
     * @param tbDept 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbDept> edit(TbDept tbDept) {
        return ResponseEntity.ok(this.tbDeptService.update(tbDept));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbDeptService.deleteById(id));
    }

}

