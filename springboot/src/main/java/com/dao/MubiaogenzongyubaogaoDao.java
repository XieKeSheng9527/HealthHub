package com.dao;

import com.entity.MubiaogenzongyubaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MubiaogenzongyubaogaoVO;
import com.entity.view.MubiaogenzongyubaogaoView;


/**
 * 目标跟踪与报告
 * 
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public interface MubiaogenzongyubaogaoDao extends BaseMapper<MubiaogenzongyubaogaoEntity> {
	
	List<MubiaogenzongyubaogaoVO> selectListVO(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
	
	MubiaogenzongyubaogaoVO selectVO(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
	
	List<MubiaogenzongyubaogaoView> selectListView(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);

	List<MubiaogenzongyubaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
	
	MubiaogenzongyubaogaoView selectView(@Param("ew") Wrapper<MubiaogenzongyubaogaoEntity> wrapper);
	

}
