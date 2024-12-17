package com.dao;

import com.entity.DiscussjiankangzhishikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangzhishikuVO;
import com.entity.view.DiscussjiankangzhishikuView;


/**
 * 健康知识库评论表
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:13
 */
public interface DiscussjiankangzhishikuDao extends BaseMapper<DiscussjiankangzhishikuEntity> {
	
	List<DiscussjiankangzhishikuVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
	
	DiscussjiankangzhishikuVO selectVO(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
	
	List<DiscussjiankangzhishikuView> selectListView(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);

	List<DiscussjiankangzhishikuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
	
	DiscussjiankangzhishikuView selectView(@Param("ew") Wrapper<DiscussjiankangzhishikuEntity> wrapper);
	

}
