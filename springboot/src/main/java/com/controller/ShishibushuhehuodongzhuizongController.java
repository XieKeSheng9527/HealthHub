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

import com.entity.ShishibushuhehuodongzhuizongEntity;
import com.entity.view.ShishibushuhehuodongzhuizongView;

import com.service.ShishibushuhehuodongzhuizongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实时步数和活动追踪
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@RestController
@RequestMapping("/shishibushuhehuodongzhuizong")
public class ShishibushuhehuodongzhuizongController {
    @Autowired
    private ShishibushuhehuodongzhuizongService shishibushuhehuodongzhuizongService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shishibushuhehuodongzhuizong.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShishibushuhehuodongzhuizongEntity> ew = new EntityWrapper<ShishibushuhehuodongzhuizongEntity>();

		PageUtils page = shishibushuhehuodongzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shishibushuhehuodongzhuizong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shishibushuhehuodongzhuizong.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShishibushuhehuodongzhuizongEntity> ew = new EntityWrapper<ShishibushuhehuodongzhuizongEntity>();

		PageUtils page = shishibushuhehuodongzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shishibushuhehuodongzhuizong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong){
       	EntityWrapper<ShishibushuhehuodongzhuizongEntity> ew = new EntityWrapper<ShishibushuhehuodongzhuizongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shishibushuhehuodongzhuizong, "shishibushuhehuodongzhuizong")); 
        return R.ok().put("data", shishibushuhehuodongzhuizongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong){
        EntityWrapper< ShishibushuhehuodongzhuizongEntity> ew = new EntityWrapper< ShishibushuhehuodongzhuizongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shishibushuhehuodongzhuizong, "shishibushuhehuodongzhuizong")); 
		ShishibushuhehuodongzhuizongView shishibushuhehuodongzhuizongView =  shishibushuhehuodongzhuizongService.selectView(ew);
		return R.ok("查询实时步数和活动追踪成功").put("data", shishibushuhehuodongzhuizongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong = shishibushuhehuodongzhuizongService.selectById(id);
        return R.ok().put("data", shishibushuhehuodongzhuizong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong = shishibushuhehuodongzhuizongService.selectById(id);
        return R.ok().put("data", shishibushuhehuodongzhuizong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shishibushuhehuodongzhuizong);
        shishibushuhehuodongzhuizongService.insert(shishibushuhehuodongzhuizong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shishibushuhehuodongzhuizong);
    	shishibushuhehuodongzhuizong.setUserid((Long)request.getSession().getAttribute("userId"));
        shishibushuhehuodongzhuizongService.insert(shishibushuhehuodongzhuizong);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShishibushuhehuodongzhuizongEntity shishibushuhehuodongzhuizong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shishibushuhehuodongzhuizong);
        shishibushuhehuodongzhuizongService.updateById(shishibushuhehuodongzhuizong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shishibushuhehuodongzhuizongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
