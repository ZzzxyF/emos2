package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbRole;
import com.zxy.emos.wx.db.service.TbRoleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色表(TbRole)表控制层
 *
 * @author makejava
 * @since 2024-03-13 15:14:07
 */
@RestController
@RequestMapping("tbRole")
public class TbRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleService tbRoleService;

    /**
     * 分页查询
     *
     * @param tbRole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbRole>> queryByPage(TbRole tbRole, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbRoleService.queryByPage(tbRole, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbRole> add(TbRole tbRole) {
        return ResponseEntity.ok(this.tbRoleService.insert(tbRole));
    }

    /**
     * 编辑数据
     *
     * @param tbRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbRole> edit(TbRole tbRole) {
        return ResponseEntity.ok(this.tbRoleService.update(tbRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbRoleService.deleteById(id));
    }

}

