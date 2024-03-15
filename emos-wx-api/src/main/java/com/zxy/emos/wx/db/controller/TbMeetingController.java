package com.zxy.emos.wx.db.controller;

import com.zxy.emos.wx.db.pojo.TbMeeting;
import com.zxy.emos.wx.db.service.TbMeetingService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会议表(TbMeeting)表控制层
 *
 * @author makejava
 * @since 2024-03-13 15:10:24
 */
@RestController
@RequestMapping("tbMeeting")
public class TbMeetingController {
    /**
     * 服务对象
     */
    @Resource
    private TbMeetingService tbMeetingService;

    /**
     * 分页查询
     *
     * @param tbMeeting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TbMeeting>> queryByPage(TbMeeting tbMeeting, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tbMeetingService.queryByPage(tbMeeting, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbMeeting> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.tbMeetingService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbMeeting 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbMeeting> add(TbMeeting tbMeeting) {
        return ResponseEntity.ok(this.tbMeetingService.insert(tbMeeting));
    }

    /**
     * 编辑数据
     *
     * @param tbMeeting 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbMeeting> edit(TbMeeting tbMeeting) {
        return ResponseEntity.ok(this.tbMeetingService.update(tbMeeting));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.tbMeetingService.deleteById(id));
    }

}

