package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangtixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangtixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangtixingView;


/**
 * 健康提醒
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface JiankangtixingService extends IService<JiankangtixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangtixingVO> selectListVO(Wrapper<JiankangtixingEntity> wrapper);
   	
   	JiankangtixingVO selectVO(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
   	
   	List<JiankangtixingView> selectListView(Wrapper<JiankangtixingEntity> wrapper);
   	
   	JiankangtixingView selectView(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangtixingEntity> wrapper);
   	

}

