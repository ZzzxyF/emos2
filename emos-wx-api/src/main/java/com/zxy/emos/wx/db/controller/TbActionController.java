package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbAction;
import com.zxy.emos.wx.db.service.TbActionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 行为表(TbAction)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:31:01
 */
@RestController
@RequestMapping("tbAction")
public class TbActionController {
    /**
     * 服务对象
     */
    @Resource
    private TbActionService tbActionService;

    /**
     * 分页查询
     *
     * @param tbAction 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbAction>> queryByPage(TbAction tbAction, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbActionService.queryByPage(tbAction, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbAction> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbActionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbAction 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbAction> add(TbAction tbAction) {
        return ResponseEntity.ok(this.tbActionService.insert(tbAction));
    }

    /**
     * 编辑数据
     *
     * @param tbAction 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbAction> edit(TbAction tbAction) {
        return ResponseEntity.ok(this.tbActionService.update(tbAction));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbActionService.deleteById(id));
    }

}

