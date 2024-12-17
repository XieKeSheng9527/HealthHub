package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShishibushuhehuodongzhuizongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShishibushuhehuodongzhuizongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShishibushuhehuodongzhuizongView;


/**
 * 实时步数和活动追踪
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface ShishibushuhehuodongzhuizongService extends IService<ShishibushuhehuodongzhuizongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShishibushuhehuodongzhuizongVO> selectListVO(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
   	
   	ShishibushuhehuodongzhuizongVO selectVO(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
   	
   	List<ShishibushuhehuodongzhuizongView> selectListView(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
   	
   	ShishibushuhehuodongzhuizongView selectView(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
   	

}

