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

import com.entity.MubiaogenzongyubaogaoEntity;
import com.entity.view.MubiaogenzongyubaogaoView;

import com.service.MubiaogenzongyubaogaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 目标跟踪与报告
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@RestController
@RequestMapping("/mubiaogenzongyubaogao")
public class MubiaogenzongyubaogaoController {
    @Autowired
    private MubiaogenzongyubaogaoService mubiaogenzongyubaogaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			mubiaogenzongyubaogao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MubiaogenzongyubaogaoEntity> ew = new EntityWrapper<MubiaogenzongyubaogaoEntity>();

		PageUtils page = mubiaogenzongyubaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mubiaogenzongyubaogao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			mubiaogenzongyubaogao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MubiaogenzongyubaogaoEntity> ew = new EntityWrapper<MubiaogenzongyubaogaoEntity>();

		PageUtils page = mubiaogenzongyubaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mubiaogenzongyubaogao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao){
       	EntityWrapper<MubiaogenzongyubaogaoEntity> ew = new EntityWrapper<MubiaogenzongyubaogaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( mubiaogenzongyubaogao, "mubiaogenzongyubaogao")); 
        return R.ok().put("data", mubiaogenzongyubaogaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao){
        EntityWrapper< MubiaogenzongyubaogaoEntity> ew = new EntityWrapper< MubiaogenzongyubaogaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( mubiaogenzongyubaogao, "mubiaogenzongyubaogao")); 
		MubiaogenzongyubaogaoView mubiaogenzongyubaogaoView =  mubiaogenzongyubaogaoService.selectView(ew);
		return R.ok("查询目标跟踪与报告成功").put("data", mubiaogenzongyubaogaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao = mubiaogenzongyubaogaoService.selectById(id);
        return R.ok().put("data", mubiaogenzongyubaogao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao = mubiaogenzongyubaogaoService.selectById(id);
        return R.ok().put("data", mubiaogenzongyubaogao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(mubiaogenzongyubaogao);
        mubiaogenzongyubaogaoService.insert(mubiaogenzongyubaogao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(mubiaogenzongyubaogao);
    	mubiaogenzongyubaogao.setUserid((Long)request.getSession().getAttribute("userId"));
        mubiaogenzongyubaogaoService.insert(mubiaogenzongyubaogao);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MubiaogenzongyubaogaoEntity mubiaogenzongyubaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(mubiaogenzongyubaogao);
        mubiaogenzongyubaogaoService.updateById(mubiaogenzongyubaogao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        mubiaogenzongyubaogaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
