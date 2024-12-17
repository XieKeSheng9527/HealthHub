package com.entity.model;

import com.entity.ShishibushuhehuodongzhuizongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实时步数和活动追踪
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public class ShishibushuhehuodongzhuizongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动项目
	 */
	
	private String huodongxiangmu;
		
	/**
	 * 活动步数
	 */
	
	private String huodongbushu;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：活动项目
	 */
	 
	public void setHuodongxiangmu(String huodongxiangmu) {
		this.huodongxiangmu = huodongxiangmu;
	}
	
	/**
	 * 获取：活动项目
	 */
	public String getHuodongxiangmu() {
		return huodongxiangmu;
	}
				
	
	/**
	 * 设置：活动步数
	 */
	 
	public void setHuodongbushu(String huodongbushu) {
		this.huodongbushu = huodongbushu;
	}
	
	/**
	 * 获取：活动步数
	 */
	public String getHuodongbushu() {
		return huodongbushu;
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
