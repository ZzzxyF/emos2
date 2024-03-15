package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbCity;
import com.zxy.emos.wx.db.service.TbCityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 疫情城市列表(TbCity)表控制层
 *
 * @author makejava
 * @since 2024-03-13 14:57:12
 */
@RestController
@RequestMapping("tbCity")
public class TbCityController {
    /**
     * 服务对象
     */
    @Resource
    private TbCityService tbCityService;

    /**
     * 分页查询
     *
     * @param tbCity 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbCity>> queryByPage(TbCity tbCity, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbCityService.queryByPage(tbCity, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbCity> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbCityService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbCity 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbCity> add(TbCity tbCity) {
        return ResponseEntity.ok(this.tbCityService.insert(tbCity));
    }

    /**
     * 编辑数据
     *
     * @param tbCity 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbCity> edit(TbCity tbCity) {
        return ResponseEntity.ok(this.tbCityService.update(tbCity));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbCityService.deleteById(id));
    }

}

