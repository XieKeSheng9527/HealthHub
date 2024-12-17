package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YundongrizhiDao;
import com.entity.YundongrizhiEntity;
import com.service.YundongrizhiService;
import com.entity.vo.YundongrizhiVO;
import com.entity.view.YundongrizhiView;

@Service("yundongrizhiService")
public class YundongrizhiServiceImpl extends ServiceImpl<YundongrizhiDao, YundongrizhiEntity> implements YundongrizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongrizhiEntity> page = this.selectPage(
                new Query<YundongrizhiEntity>(params).getPage(),
                new EntityWrapper<YundongrizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongrizhiEntity> wrapper) {
		  Page<YundongrizhiView> page =new Query<YundongrizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongrizhiVO> selectListVO(Wrapper<YundongrizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongrizhiVO selectVO(Wrapper<YundongrizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongrizhiView> selectListView(Wrapper<YundongrizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongrizhiView selectView(Wrapper<YundongrizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
