package com.ohgiraffers.gittest.menu.model.dao;

import com.ohgiraffers.gittest.menu.model.dto.CategoryDTO;
import com.ohgiraffers.gittest.menu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<MenuDTO> findAllMenu();

    List<CategoryDTO> findAllCategory();

    MenuDTO findMenuByCode(int code);

    void registNewMenu(MenuDTO newMenu);

    void deleteMenu(int code);

    void updateMenu(MenuDTO menu);
}
