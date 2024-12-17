package com.entity.model;

import com.entity.JiankangpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康评估
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public class JiankangpingguModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 评估等级
	 */
	
	private String pinggudengji;
		
	/**
	 * 评估报告
	 */
	
	private String pinggubaogao;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：评估等级
	 */
	 
	public void setPinggudengji(String pinggudengji) {
		this.pinggudengji = pinggudengji;
	}
	
	/**
	 * 获取：评估等级
	 */
	public String getPinggudengji() {
		return pinggudengji;
	}
				
	
	/**
	 * 设置：评估报告
	 */
	 
	public void setPinggubaogao(String pinggubaogao) {
		this.pinggubaogao = pinggubaogao;
	}
	
	/**
	 * 获取：评估报告
	 */
	public String getPinggubaogao() {
		return pinggubaogao;
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