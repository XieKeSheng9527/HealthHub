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

import com.entity.YundongrizhiEntity;
import com.entity.view.YundongrizhiView;

import com.service.YundongrizhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运动日志
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@RestController
@RequestMapping("/yundongrizhi")
public class YundongrizhiController {
    @Autowired
    private YundongrizhiService yundongrizhiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundongrizhiEntity yundongrizhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongrizhi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongrizhiEntity> ew = new EntityWrapper<YundongrizhiEntity>();

		PageUtils page = yundongrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongrizhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundongrizhiEntity yundongrizhi, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yundongrizhi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundongrizhiEntity> ew = new EntityWrapper<YundongrizhiEntity>();

		PageUtils page = yundongrizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundongrizhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundongrizhiEntity yundongrizhi){
       	EntityWrapper<YundongrizhiEntity> ew = new EntityWrapper<YundongrizhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundongrizhi, "yundongrizhi")); 
        return R.ok().put("data", yundongrizhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundongrizhiEntity yundongrizhi){
        EntityWrapper< YundongrizhiEntity> ew = new EntityWrapper< YundongrizhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundongrizhi, "yundongrizhi")); 
		YundongrizhiView yundongrizhiView =  yundongrizhiService.selectView(ew);
		return R.ok("查询运动日志成功").put("data", yundongrizhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundongrizhiEntity yundongrizhi = yundongrizhiService.selectById(id);
        return R.ok().put("data", yundongrizhi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundongrizhiEntity yundongrizhi = yundongrizhiService.selectById(id);
        return R.ok().put("data", yundongrizhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundongrizhiEntity yundongrizhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongrizhi);
        yundongrizhiService.insert(yundongrizhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundongrizhiEntity yundongrizhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yundongrizhi);
    	yundongrizhi.setUserid((Long)request.getSession().getAttribute("userId"));
        yundongrizhiService.insert(yundongrizhi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YundongrizhiEntity yundongrizhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundongrizhi);
        yundongrizhiService.updateById(yundongrizhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundongrizhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
