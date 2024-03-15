package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbPermission;
import com.zxy.emos.wx.db.service.TbPermissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbPermission)表控制层
 *
 * @author makejava
 * @since 2024-03-13 15:10:56
 */
@RestController
@RequestMapping("tbPermission")
public class TbPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TbPermissionService tbPermissionService;

    /**
     * 分页查询
     *
     * @param tbPermission 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbPermission>> queryByPage(TbPermission tbPermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbPermissionService.queryByPage(tbPermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbPermission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbPermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbPermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbPermission> add(TbPermission tbPermission) {
        return ResponseEntity.ok(this.tbPermissionService.insert(tbPermission));
    }

    /**
     * 编辑数据
     *
     * @param tbPermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbPermission> edit(TbPermission tbPermission) {
        return ResponseEntity.ok(this.tbPermissionService.update(tbPermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbPermissionService.deleteById(id));
    }

}

