package how2java.service.impl;

import java.util.List;

import how2java.mapper.CategoryMapper;
import how2java.pojo.Category;
import how2java.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import how2java.mapper.CategoryMapper;
import how2java.pojo.Category;
import how2java.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService {

	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


}
