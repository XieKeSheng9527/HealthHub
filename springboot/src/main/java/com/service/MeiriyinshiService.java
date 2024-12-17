package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeiriyinshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeiriyinshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeiriyinshiView;


/**
 * 每日饮食
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface MeiriyinshiService extends IService<MeiriyinshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiriyinshiVO> selectListVO(Wrapper<MeiriyinshiEntity> wrapper);
   	
   	MeiriyinshiVO selectVO(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
   	
   	List<MeiriyinshiView> selectListView(Wrapper<MeiriyinshiEntity> wrapper);
   	
   	MeiriyinshiView selectView(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiriyinshiEntity> wrapper);
   	

}

