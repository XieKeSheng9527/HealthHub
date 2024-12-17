package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinshijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinshijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinshijihuaView;


/**
 * 饮食计划
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface YinshijihuaService extends IService<YinshijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinshijihuaVO> selectListVO(Wrapper<YinshijihuaEntity> wrapper);
   	
   	YinshijihuaVO selectVO(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);
   	
   	List<YinshijihuaView> selectListView(Wrapper<YinshijihuaEntity> wrapper);
   	
   	YinshijihuaView selectView(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinshijihuaEntity> wrapper);
   	

}

