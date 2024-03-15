package com.zxy.emos.wx.db.service;

import com.zxy.emos.wx.db.pojo.TbCity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 疫情城市列表(TbCity)表服务接口
 *
 * @author makejava
 * @since 2024-03-13 14:57:12
 */
public interface TbCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbCity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tbCity 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbCity> queryByPage(TbCity tbCity, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    TbCity insert(TbCity tbCity);

    /**
     * 修改数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    TbCity update(TbCity tbCity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
