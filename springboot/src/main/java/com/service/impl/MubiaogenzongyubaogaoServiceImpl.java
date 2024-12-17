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


import com.dao.MubiaogenzongyubaogaoDao;
import com.entity.MubiaogenzongyubaogaoEntity;
import com.service.MubiaogenzongyubaogaoService;
import com.entity.vo.MubiaogenzongyubaogaoVO;
import com.entity.view.MubiaogenzongyubaogaoView;

@Service("mubiaogenzongyubaogaoService")
public class MubiaogenzongyubaogaoServiceImpl extends ServiceImpl<MubiaogenzongyubaogaoDao, MubiaogenzongyubaogaoEntity> implements MubiaogenzongyubaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MubiaogenzongyubaogaoEntity> page = this.selectPage(
                new Query<MubiaogenzongyubaogaoEntity>(params).getPage(),
                new EntityWrapper<MubiaogenzongyubaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MubiaogenzongyubaogaoEntity> wrapper) {
		  Page<MubiaogenzongyubaogaoView> page =new Query<MubiaogenzongyubaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MubiaogenzongyubaogaoVO> selectListVO(Wrapper<MubiaogenzongyubaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MubiaogenzongyubaogaoVO selectVO(Wrapper<MubiaogenzongyubaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MubiaogenzongyubaogaoView> selectListView(Wrapper<MubiaogenzongyubaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MubiaogenzongyubaogaoView selectView(Wrapper<MubiaogenzongyubaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
