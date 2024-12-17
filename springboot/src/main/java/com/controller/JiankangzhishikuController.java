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

import com.entity.JiankangzhishikuEntity;
import com.entity.view.JiankangzhishikuView;

import com.service.JiankangzhishikuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 健康知识库
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@RestController
@RequestMapping("/jiankangzhishiku")
public class JiankangzhishikuController {
    @Autowired
    private JiankangzhishikuService jiankangzhishikuService;

    @Autowired
    private StoreupService storeupService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangzhishikuEntity jiankangzhishiku,
		HttpServletRequest request){
        EntityWrapper<JiankangzhishikuEntity> ew = new EntityWrapper<JiankangzhishikuEntity>();

		PageUtils page = jiankangzhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangzhishiku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangzhishikuEntity jiankangzhishiku, 
		HttpServletRequest request){
        EntityWrapper<JiankangzhishikuEntity> ew = new EntityWrapper<JiankangzhishikuEntity>();

		PageUtils page = jiankangzhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangzhishiku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangzhishikuEntity jiankangzhishiku){
       	EntityWrapper<JiankangzhishikuEntity> ew = new EntityWrapper<JiankangzhishikuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangzhishiku, "jiankangzhishiku")); 
        return R.ok().put("data", jiankangzhishikuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangzhishikuEntity jiankangzhishiku){
        EntityWrapper< JiankangzhishikuEntity> ew = new EntityWrapper< JiankangzhishikuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangzhishiku, "jiankangzhishiku")); 
		JiankangzhishikuView jiankangzhishikuView =  jiankangzhishikuService.selectView(ew);
		return R.ok("查询健康知识库成功").put("data", jiankangzhishikuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangzhishikuEntity jiankangzhishiku = jiankangzhishikuService.selectById(id);
        return R.ok().put("data", jiankangzhishiku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangzhishikuEntity jiankangzhishiku = jiankangzhishikuService.selectById(id);
        return R.ok().put("data", jiankangzhishiku);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JiankangzhishikuEntity jiankangzhishiku = jiankangzhishikuService.selectById(id);
        if(type.equals("1")) {
        	jiankangzhishiku.setThumbsupnum(jiankangzhishiku.getThumbsupnum()+1);
        } else {
        	jiankangzhishiku.setCrazilynum(jiankangzhishiku.getCrazilynum()+1);
        }
        jiankangzhishikuService.updateById(jiankangzhishiku);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangzhishikuEntity jiankangzhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangzhishiku);
        jiankangzhishikuService.insert(jiankangzhishiku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangzhishikuEntity jiankangzhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankangzhishiku);
        jiankangzhishikuService.insert(jiankangzhishiku);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangzhishikuEntity jiankangzhishiku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangzhishiku);
        jiankangzhishikuService.updateById(jiankangzhishiku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangzhishikuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
