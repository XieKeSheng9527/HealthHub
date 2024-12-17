package com.dao;

import com.entity.ShishibushuhehuodongzhuizongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShishibushuhehuodongzhuizongVO;
import com.entity.view.ShishibushuhehuodongzhuizongView;


/**
 * 实时步数和活动追踪
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface ShishibushuhehuodongzhuizongDao extends BaseMapper<ShishibushuhehuodongzhuizongEntity> {
	
	List<ShishibushuhehuodongzhuizongVO> selectListVO(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
	
	ShishibushuhehuodongzhuizongVO selectVO(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
	
	List<ShishibushuhehuodongzhuizongView> selectListView(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);

	List<ShishibushuhehuodongzhuizongView> selectListView(Pagination page,@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
	
	ShishibushuhehuodongzhuizongView selectView(@Param("ew") Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper);
	

}
