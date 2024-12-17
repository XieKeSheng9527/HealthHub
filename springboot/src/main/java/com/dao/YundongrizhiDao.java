package com.dao;

import com.entity.YundongrizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongrizhiVO;
import com.entity.view.YundongrizhiView;


/**
 * 运动日志
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public interface YundongrizhiDao extends BaseMapper<YundongrizhiEntity> {
	
	List<YundongrizhiVO> selectListVO(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
	
	YundongrizhiVO selectVO(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
	
	List<YundongrizhiView> selectListView(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);

	List<YundongrizhiView> selectListView(Pagination page,@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
	
	YundongrizhiView selectView(@Param("ew") Wrapper<YundongrizhiEntity> wrapper);
	

}
