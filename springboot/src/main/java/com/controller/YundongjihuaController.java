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

import com.entity.YundongjihuaEntity;
import com.entity.view.YundongjihuaView;

import com.service.YundongjihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运动计划
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@RestController
@RequestMapping("/yundongjihua")
public class YundongjihuaController {
    @Autowired
    private YundongjihuaService yundongjihuaService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundongjihuaEntity yundongjihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongjihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongjihuaEntity> ew = new EntityWrapper<YundongjihuaEntity>();

		PageUtils page = yundongjihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundongjihuaEntity yundongjihua, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongjihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongjihuaEntity> ew = new EntityWrapper<YundongjihuaEntity>();

		PageUtils page = yundongjihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongjihua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundongjihuaEntity yundongjihua){
       	EntityWrapper<YundongjihuaEntity> ew = new EntityWrapper<YundongjihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundongjihua, "yundongjihua")); 
        return R.ok().put("data", yundongjihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundongjihuaEntity yundongjihua){
        EntityWrapper< YundongjihuaEntity> ew = new EntityWrapper< YundongjihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundongjihua, "yundongjihua")); 
		YundongjihuaView yundongjihuaView =  yundongjihuaService.selectView(ew);
		return R.ok("查询运动计划成功").put("data", yundongjihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundongjihuaEntity yundongjihua = yundongjihuaService.selectById(id);
        return R.ok().put("data", yundongjihua);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundongjihuaEntity yundongjihua = yundongjihuaService.selectById(id);
        return R.ok().put("data", yundongjihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundongjihuaEntity yundongjihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjihua);
        yundongjihuaService.insert(yundongjihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundongjihuaEntity yundongjihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongjihua);
    	yundongjihua.setUserid((Long)request.getSession().getAttribute("userId"));
        yundongjihuaService.insert(yundongjihua);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YundongjihuaEntity yundongjihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundongjihua);
        yundongjihuaService.updateById(yundongjihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundongjihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
