package com.entity.model;

import com.entity.MeiriyinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 每日饮食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public class MeiriyinshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 早餐
	 */
	
	private String zaocan;
		
	/**
	 * 晚餐
	 */
	
	private String wancan;
		
	/**
	 * 中餐
	 */
	
	private String zhongcan;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：早餐
	 */
	 
	public void setZaocan(String zaocan) {
		this.zaocan = zaocan;
	}
	
	/**
	 * 获取：早餐
	 */
	public String getZaocan() {
		return zaocan;
	}
				
	
	/**
	 * 设置：晚餐
	 */
	 
	public void setWancan(String wancan) {
		this.wancan = wancan;
	}
	
	/**
	 * 获取：晚餐
	 */
	public String getWancan() {
		return wancan;
	}
				
	
	/**
	 * 设置：中餐
	 */
	 
	public void setZhongcan(String zhongcan) {
		this.zhongcan = zhongcan;
	}
	
	/**
	 * 获取：中餐
	 */
	public String getZhongcan() {
		return zhongcan;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：用户
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
