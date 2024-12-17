package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangzhishikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangzhishikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangzhishikuView;


/**
 * 健康知识库评论表
 *
 * @author 
 * @email 
 * @date 2023-12-15 15:41:13
 */
public interface DiscussjiankangzhishikuService extends IService<DiscussjiankangzhishikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangzhishikuVO> selectListVO(Wrapper<DiscussjiankangzhishikuEntity> wrapper);
   	
   	DiscussjiankangzhishikuVO selectVO(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
   	
   	List<DiscussjiankangzhishikuView> selectListView(Wrapper<DiscussjiankangzhishikuEntity> wrapper);
   	
   	DiscussjiankangzhishikuView selectView(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangzhishikuEntity> wrapper);
   	

}

