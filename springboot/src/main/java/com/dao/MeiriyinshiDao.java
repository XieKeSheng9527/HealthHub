package com.dao;

import com.entity.MeiriyinshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeiriyinshiVO;
import com.entity.view.MeiriyinshiView;


/**
 * 每日饮食
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface MeiriyinshiDao extends BaseMapper<MeiriyinshiEntity> {
	
	List<MeiriyinshiVO> selectListVO(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
	
	MeiriyinshiVO selectVO(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
	
	List<MeiriyinshiView> selectListView(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);

	List<MeiriyinshiView> selectListView(Pagination page,@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
	
	MeiriyinshiView selectView(@Param("ew") Wrapper<MeiriyinshiEntity> wrapper);
	

}
