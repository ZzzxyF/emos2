package com.zxy.emos.wx.db.service;

import com.zxy.emos.wx.db.pojo.TbModule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 模块资源表(TbModule)表服务接口
 *
 * @author makejava
 * @since 2024-03-13 15:10:39
 */
public interface TbModuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbModule queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tbModule 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbModule> queryByPage(TbModule tbModule, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    TbModule insert(TbModule tbModule);

    /**
     * 修改数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    TbModule update(TbModule tbModule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
