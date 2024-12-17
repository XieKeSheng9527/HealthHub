package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongrizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongrizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongrizhiView;


/**
 * 运动日志
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface YundongrizhiService extends IService<YundongrizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongrizhiVO> selectListVO(Wrapper<YundongrizhiEntity> wrapper);
   	
   	YundongrizhiVO selectVO(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
   	
   	List<YundongrizhiView> selectListView(Wrapper<YundongrizhiEntity> wrapper);
   	
   	YundongrizhiView selectView(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongrizhiEntity> wrapper);
   	

}

