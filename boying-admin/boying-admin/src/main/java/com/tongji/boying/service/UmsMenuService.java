package com.tongji.boying.service;


import com.tongji.boying.dto.UmsMenuParam;
import com.tongji.boying.model.Menu;

import java.util.List;
import java.util.Map;

/**
 * 后台菜单管理Service
 */
public interface UmsMenuService
{
    /**
     * 创建后台菜单
     *
     * @param param
     */
    int create(UmsMenuParam param);

    /**
     * 修改后台菜单
     */
    int update(Integer id, UmsMenuParam param);

    /**
     * 根据ID获取菜单详情
     */
    Menu getItem(Integer id);

    /**
     * 根据ID删除菜单
     */
    int delete(Integer id);

    /**
     * 分页查询后台菜单
     */
    List<Menu> list(Integer parentId, Integer pageSize, Integer pageNum);


    /**
     * 树形结构返回所有菜单列表
     *
     * @return
     */
    Map<Menu, List<Menu>> categoryMap();


    /**
     * 树形结构返回某个用户的所有菜单列表,不包括隐藏的,sort为0的
     *
     * @return
     */
    Map<Menu, List<Menu>> categoryMap(Integer adminId);
    /**
     * 修改菜单显示状态
     */
    int updateHidden(Integer id, Boolean hidden);
}
