package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangzhishikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangzhishikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangzhishikuView;


/**
 * 健康知识库
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface JiankangzhishikuService extends IService<JiankangzhishikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangzhishikuVO> selectListVO(Wrapper<JiankangzhishikuEntity> wrapper);
   	
   	JiankangzhishikuVO selectVO(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
   	
   	List<JiankangzhishikuView> selectListView(Wrapper<JiankangzhishikuEntity> wrapper);
   	
   	JiankangzhishikuView selectView(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangzhishikuEntity> wrapper);
   	

}

