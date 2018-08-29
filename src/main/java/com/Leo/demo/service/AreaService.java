package com.Leo.demo.service;

import com.Leo.demo.entity.Area;

import java.util.List;

/**
 * @Auther: Leo
 * @Date: 2018/8/29
 * @Description:
 */
public interface AreaService {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> getArea();

    /**
     * 根据id列出具体区域
     * @param areaId
     * @return area
     */
    Area getAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     *删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
