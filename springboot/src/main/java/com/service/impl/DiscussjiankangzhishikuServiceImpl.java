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


import com.dao.DiscussjiankangzhishikuDao;
import com.entity.DiscussjiankangzhishikuEntity;
import com.service.DiscussjiankangzhishikuService;
import com.entity.vo.DiscussjiankangzhishikuVO;
import com.entity.view.DiscussjiankangzhishikuView;

@Service("discussjiankangzhishikuService")
public class DiscussjiankangzhishikuServiceImpl extends ServiceImpl<DiscussjiankangzhishikuDao, DiscussjiankangzhishikuEntity> implements DiscussjiankangzhishikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangzhishikuEntity> page = this.selectPage(
                new Query<DiscussjiankangzhishikuEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangzhishikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangzhishikuEntity> wrapper) {
		  Page<DiscussjiankangzhishikuView> page =new Query<DiscussjiankangzhishikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangzhishikuVO> selectListVO(Wrapper<DiscussjiankangzhishikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangzhishikuVO selectVO(Wrapper<DiscussjiankangzhishikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangzhishikuView> selectListView(Wrapper<DiscussjiankangzhishikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangzhishikuView selectView(Wrapper<DiscussjiankangzhishikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
