package com.zxy.emos.wx.db.service;

import com.zxy.emos.wx.db.pojo.TbMeeting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会议表(TbMeeting)表服务接口
 *
 * @author makejava
 * @since 2024-03-13 15:10:24
 */
public interface TbMeetingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbMeeting queryById(Long id);

    /**
     * 分页查询
     *
     * @param tbMeeting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbMeeting> queryByPage(TbMeeting tbMeeting, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    TbMeeting insert(TbMeeting tbMeeting);

    /**
     * 修改数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    TbMeeting update(TbMeeting tbMeeting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
