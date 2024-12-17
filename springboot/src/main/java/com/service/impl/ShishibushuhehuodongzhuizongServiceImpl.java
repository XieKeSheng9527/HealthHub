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


import com.dao.ShishibushuhehuodongzhuizongDao;
import com.entity.ShishibushuhehuodongzhuizongEntity;
import com.service.ShishibushuhehuodongzhuizongService;
import com.entity.vo.ShishibushuhehuodongzhuizongVO;
import com.entity.view.ShishibushuhehuodongzhuizongView;

@Service("shishibushuhehuodongzhuizongService")
public class ShishibushuhehuodongzhuizongServiceImpl extends ServiceImpl<ShishibushuhehuodongzhuizongDao, ShishibushuhehuodongzhuizongEntity> implements ShishibushuhehuodongzhuizongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShishibushuhehuodongzhuizongEntity> page = this.selectPage(
                new Query<ShishibushuhehuodongzhuizongEntity>(params).getPage(),
                new EntityWrapper<ShishibushuhehuodongzhuizongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper) {
		  Page<ShishibushuhehuodongzhuizongView> page =new Query<ShishibushuhehuodongzhuizongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShishibushuhehuodongzhuizongVO> selectListVO(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShishibushuhehuodongzhuizongVO selectVO(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShishibushuhehuodongzhuizongView> selectListView(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShishibushuhehuodongzhuizongView selectView(Wrapper<ShishibushuhehuodongzhuizongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
