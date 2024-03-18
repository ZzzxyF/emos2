package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.entity.TbFaceModel;
import com.zxy.emos.wx.db.service.TbFaceModelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbFaceModel)表控制层
 *
 * @author makejava
 * @since 2024-03-16 21:03:26
 */
@RestController
@RequestMapping("tbFaceModel")
public class TbFaceModelController {
    /**
     * 服务对象
     */
    @Resource
    private TbFaceModelService tbFaceModelService;

    /**
     * 分页查询
     *
     * @param tbFaceModel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbFaceModel>> queryByPage(TbFaceModel tbFaceModel, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbFaceModelService.queryByPage(tbFaceModel, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbFaceModel> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbFaceModelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbFaceModel 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbFaceModel> add(TbFaceModel tbFaceModel) {
        return ResponseEntity.ok(this.tbFaceModelService.insert(tbFaceModel));
    }

    /**
     * 编辑数据
     *
     * @param tbFaceModel 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbFaceModel> edit(TbFaceModel tbFaceModel) {
        return ResponseEntity.ok(this.tbFaceModelService.update(tbFaceModel));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbFaceModelService.deleteById(id));
    }

}

