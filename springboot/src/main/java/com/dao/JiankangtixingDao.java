package com.dao;

import com.entity.JiankangtixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangtixingVO;
import com.entity.view.JiankangtixingView;


/**
 * 健康提醒
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface JiankangtixingDao extends BaseMapper<JiankangtixingEntity> {
	
	List<JiankangtixingVO> selectListVO(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
	
	JiankangtixingVO selectVO(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
	
	List<JiankangtixingView> selectListView(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);

	List<JiankangtixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
	
	JiankangtixingView selectView(@Param("ew") Wrapper<JiankangtixingEntity> wrapper);
	

}
