package com.dao;

import com.entity.JiankangzhishikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangzhishikuVO;
import com.entity.view.JiankangzhishikuView;


/**
 * 健康知识库
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface JiankangzhishikuDao extends BaseMapper<JiankangzhishikuEntity> {
	
	List<JiankangzhishikuVO> selectListVO(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
	
	JiankangzhishikuVO selectVO(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
	
	List<JiankangzhishikuView> selectListView(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);

	List<JiankangzhishikuView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
	
	JiankangzhishikuView selectView(@Param("ew") Wrapper<JiankangzhishikuEntity> wrapper);
	

}
