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


import com.dao.MeiriyinshiDao;
import com.entity.MeiriyinshiEntity;
import com.service.MeiriyinshiService;
import com.entity.vo.MeiriyinshiVO;
import com.entity.view.MeiriyinshiView;

@Service("meiriyinshiService")
public class MeiriyinshiServiceImpl extends ServiceImpl<MeiriyinshiDao, MeiriyinshiEntity> implements MeiriyinshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiriyinshiEntity> page = this.selectPage(
                new Query<MeiriyinshiEntity>(params).getPage(),
                new EntityWrapper<MeiriyinshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiriyinshiEntity> wrapper) {
		  Page<MeiriyinshiView> page =new Query<MeiriyinshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeiriyinshiVO> selectListVO(Wrapper<MeiriyinshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeiriyinshiVO selectVO(Wrapper<MeiriyinshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeiriyinshiView> selectListView(Wrapper<MeiriyinshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiriyinshiView selectView(Wrapper<MeiriyinshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
