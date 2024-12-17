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

import com.entity.JiankangtixingEntity;
import com.entity.view.JiankangtixingView;

import com.service.JiankangtixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 健康提醒
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@RestController
@RequestMapping("/jiankangtixing")
public class JiankangtixingController {
    @Autowired
    private JiankangtixingService jiankangtixingService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangtixingEntity jiankangtixing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangtixing.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangtixingEntity> ew = new EntityWrapper<JiankangtixingEntity>();

		PageUtils page = jiankangtixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangtixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangtixingEntity jiankangtixing, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangtixing.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangtixingEntity> ew = new EntityWrapper<JiankangtixingEntity>();

		PageUtils page = jiankangtixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangtixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangtixingEntity jiankangtixing){
       	EntityWrapper<JiankangtixingEntity> ew = new EntityWrapper<JiankangtixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangtixing, "jiankangtixing")); 
        return R.ok().put("data", jiankangtixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangtixingEntity jiankangtixing){
        EntityWrapper< JiankangtixingEntity> ew = new EntityWrapper< JiankangtixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangtixing, "jiankangtixing")); 
		JiankangtixingView jiankangtixingView =  jiankangtixingService.selectView(ew);
		return R.ok("查询健康提醒成功").put("data", jiankangtixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangtixingEntity jiankangtixing = jiankangtixingService.selectById(id);
        return R.ok().put("data", jiankangtixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangtixingEntity jiankangtixing = jiankangtixingService.selectById(id);
        return R.ok().put("data", jiankangtixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangtixingEntity jiankangtixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangtixing);
        jiankangtixingService.insert(jiankangtixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangtixingEntity jiankangtixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangtixing);
    	jiankangtixing.setUserid((Long)request.getSession().getAttribute("userId"));
        jiankangtixingService.insert(jiankangtixing);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangtixingEntity jiankangtixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangtixing);
        jiankangtixingService.updateById(jiankangtixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangtixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
