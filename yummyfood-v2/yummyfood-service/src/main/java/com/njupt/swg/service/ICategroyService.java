package com.njupt.swg.service;

import com.njupt.swg.pojo.Category;
import com.njupt.swg.vo.CategoryVO;

import java.util.List;

/**
 * @Author swg.
 * @Date 2020/5/1 15:19
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public interface ICategroyService {

    List<Category> queryAllRootLevelCat();

    List<CategoryVO> getSubCatList(Integer rootCatId);
}
