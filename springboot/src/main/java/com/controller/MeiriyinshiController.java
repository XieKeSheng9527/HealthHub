package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MeiriyinshiEntity;
import com.entity.view.MeiriyinshiView;

import com.service.MeiriyinshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 每日饮食
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@RestController
@RequestMapping("/meiriyinshi")
public class MeiriyinshiController {
    @Autowired
    private MeiriyinshiService meiriyinshiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeiriyinshiEntity meiriyinshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			meiriyinshi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MeiriyinshiEntity> ew = new EntityWrapper<MeiriyinshiEntity>();

		PageUtils page = meiriyinshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiriyinshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeiriyinshiEntity meiriyinshi, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			meiriyinshi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MeiriyinshiEntity> ew = new EntityWrapper<MeiriyinshiEntity>();

		PageUtils page = meiriyinshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiriyinshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeiriyinshiEntity meiriyinshi){
       	EntityWrapper<MeiriyinshiEntity> ew = new EntityWrapper<MeiriyinshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meiriyinshi, "meiriyinshi")); 
        return R.ok().put("data", meiriyinshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeiriyinshiEntity meiriyinshi){
        EntityWrapper< MeiriyinshiEntity> ew = new EntityWrapper< MeiriyinshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meiriyinshi, "meiriyinshi")); 
		MeiriyinshiView meiriyinshiView =  meiriyinshiService.selectView(ew);
		return R.ok("查询每日饮食成功").put("data", meiriyinshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeiriyinshiEntity meiriyinshi = meiriyinshiService.selectById(id);
        return R.ok().put("data", meiriyinshi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeiriyinshiEntity meiriyinshi = meiriyinshiService.selectById(id);
        return R.ok().put("data", meiriyinshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeiriyinshiEntity meiriyinshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(meiriyinshi);
        meiriyinshiService.insert(meiriyinshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeiriyinshiEntity meiriyinshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(meiriyinshi);
    	meiriyinshi.setUserid((Long)request.getSession().getAttribute("userId"));
        meiriyinshiService.insert(meiriyinshi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MeiriyinshiEntity meiriyinshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meiriyinshi);
        meiriyinshiService.updateById(meiriyinshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meiriyinshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
