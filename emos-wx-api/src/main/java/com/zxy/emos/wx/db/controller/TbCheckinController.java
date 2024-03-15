package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbCheckin;
import com.zxy.emos.wx.db.service.TbCheckinService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 签到表(TbCheckin)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:31:26
 */
@RestController
@RequestMapping("tbCheckin")
public class TbCheckinController {
    /**
     * 服务对象
     */
    @Resource
    private TbCheckinService tbCheckinService;

    /**
     * 分页查询
     *
     * @param tbCheckin 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbCheckin>> queryByPage(TbCheckin tbCheckin, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbCheckinService.queryByPage(tbCheckin, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbCheckin> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbCheckinService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbCheckin 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbCheckin> add(TbCheckin tbCheckin) {
        return ResponseEntity.ok(this.tbCheckinService.insert(tbCheckin));
    }

    /**
     * 编辑数据
     *
     * @param tbCheckin 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbCheckin> edit(TbCheckin tbCheckin) {
        return ResponseEntity.ok(this.tbCheckinService.update(tbCheckin));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbCheckinService.deleteById(id));
    }

}

