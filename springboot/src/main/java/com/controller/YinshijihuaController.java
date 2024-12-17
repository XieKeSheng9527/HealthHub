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

import com.entity.YinshijihuaEntity;
import com.entity.view.YinshijihuaView;

import com.service.YinshijihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 饮食计划
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@RestController
@RequestMapping("/yinshijihua")
public class YinshijihuaController {
    @Autowired
    private YinshijihuaService yinshijihuaService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinshijihuaEntity yinshijihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yinshijihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YinshijihuaEntity> ew = new EntityWrapper<YinshijihuaEntity>();

		PageUtils page = yinshijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshijihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinshijihuaEntity yinshijihua, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yinshijihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YinshijihuaEntity> ew = new EntityWrapper<YinshijihuaEntity>();

		PageUtils page = yinshijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinshijihua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinshijihuaEntity yinshijihua){
       	EntityWrapper<YinshijihuaEntity> ew = new EntityWrapper<YinshijihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinshijihua, "yinshijihua")); 
        return R.ok().put("data", yinshijihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinshijihuaEntity yinshijihua){
        EntityWrapper< YinshijihuaEntity> ew = new EntityWrapper< YinshijihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinshijihua, "yinshijihua")); 
		YinshijihuaView yinshijihuaView =  yinshijihuaService.selectView(ew);
		return R.ok("查询饮食计划成功").put("data", yinshijihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinshijihuaEntity yinshijihua = yinshijihuaService.selectById(id);
        return R.ok().put("data", yinshijihua);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinshijihuaEntity yinshijihua = yinshijihuaService.selectById(id);
        return R.ok().put("data", yinshijihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinshijihuaEntity yinshijihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yinshijihua);
        yinshijihuaService.insert(yinshijihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinshijihuaEntity yinshijihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yinshijihua);
    	yinshijihua.setUserid((Long)request.getSession().getAttribute("userId"));
        yinshijihuaService.insert(yinshijihua);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YinshijihuaEntity yinshijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinshijihua);
        yinshijihuaService.updateById(yinshijihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinshijihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
