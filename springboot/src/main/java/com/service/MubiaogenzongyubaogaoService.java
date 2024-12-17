package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MubiaogenzongyubaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MubiaogenzongyubaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MubiaogenzongyubaogaoView;


/**
 * 目标跟踪与报告
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface MubiaogenzongyubaogaoService extends IService<MubiaogenzongyubaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MubiaogenzongyubaogaoVO> selectListVO(Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
   	
   	MubiaogenzongyubaogaoVO selectVO(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
   	
   	List<MubiaogenzongyubaogaoView> selectListView(Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
   	
   	MubiaogenzongyubaogaoView selectView(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
   	

}

