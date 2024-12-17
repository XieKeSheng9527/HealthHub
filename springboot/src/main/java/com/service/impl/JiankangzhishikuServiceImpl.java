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


import com.dao.JiankangzhishikuDao;
import com.entity.JiankangzhishikuEntity;
import com.service.JiankangzhishikuService;
import com.entity.vo.JiankangzhishikuVO;
import com.entity.view.JiankangzhishikuView;

@Service("jiankangzhishikuService")
public class JiankangzhishikuServiceImpl extends ServiceImpl<JiankangzhishikuDao, JiankangzhishikuEntity> implements JiankangzhishikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangzhishikuEntity> page = this.selectPage(
                new Query<JiankangzhishikuEntity>(params).getPage(),
                new EntityWrapper<JiankangzhishikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangzhishikuEntity> wrapper) {
		  Page<JiankangzhishikuView> page =new Query<JiankangzhishikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangzhishikuVO> selectListVO(Wrapper<JiankangzhishikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangzhishikuVO selectVO(Wrapper<JiankangzhishikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangzhishikuView> selectListView(Wrapper<JiankangzhishikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangzhishikuView selectView(Wrapper<JiankangzhishikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
