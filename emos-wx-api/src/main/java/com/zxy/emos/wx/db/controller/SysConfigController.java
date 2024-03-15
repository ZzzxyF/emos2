package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.SysConfig;
import com.zxy.emos.wx.db.service.SysConfigService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysConfig)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:30:36
 */
@RestController
@RequestMapping("sysConfig")
public class SysConfigController {
    /**
     * 服务对象
     */
    @Resource
    private SysConfigService sysConfigService;

    /**
     * 分页查询
     *
     * @param sysConfig 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SysConfig>> queryByPage(SysConfig sysConfig, PageRequest pageRequest) {
        return ResponseEntity.ok(this.sysConfigService.queryByPage(sysConfig, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SysConfig> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.sysConfigService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param sysConfig 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SysConfig> add(SysConfig sysConfig) {
        return ResponseEntity.ok(this.sysConfigService.insert(sysConfig));
    }

    /**
     * 编辑数据
     *
     * @param sysConfig 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SysConfig> edit(SysConfig sysConfig) {
        return ResponseEntity.ok(this.sysConfigService.update(sysConfig));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.sysConfigService.deleteById(id));
    }

}

