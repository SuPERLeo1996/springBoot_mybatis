package com.Leo.demo.dao;

import com.Leo.demo.entity.Area;

import java.util.List;

/**
 * @Auther: Leo
 * @Date: 2018/8/28
 * @Description:
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据id列出具体区域
     * @param areaId
     * @return area
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     *删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
