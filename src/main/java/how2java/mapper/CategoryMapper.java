package how2java.mapper;
 
import java.util.List;

import how2java.pojo.Category;
import how2java.util.Page;
 
public interface CategoryMapper {
 
      
    public int add(Category category);  
       
      
    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
      
}