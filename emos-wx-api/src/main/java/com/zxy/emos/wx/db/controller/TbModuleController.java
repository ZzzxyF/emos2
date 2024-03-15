package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbModule;
import com.zxy.emos.wx.db.service.TbModuleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 模块资源表(TbModule)表控制层
 *
 * @author makejava
 * @since 2024-03-13 15:10:39
 */
@RestController
@RequestMapping("tbModule")
public class TbModuleController {
    /**
     * 服务对象
     */
    @Resource
    private TbModuleService tbModuleService;

    /**
     * 分页查询
     *
     * @param tbModule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbModule>> queryByPage(TbModule tbModule, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbModuleService.queryByPage(tbModule, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbModule> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbModuleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbModule 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbModule> add(TbModule tbModule) {
        return ResponseEntity.ok(this.tbModuleService.insert(tbModule));
    }

    /**
     * 编辑数据
     *
     * @param tbModule 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbModule> edit(TbModule tbModule) {
        return ResponseEntity.ok(this.tbModuleService.update(tbModule));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbModuleService.deleteById(id));
    }

}

