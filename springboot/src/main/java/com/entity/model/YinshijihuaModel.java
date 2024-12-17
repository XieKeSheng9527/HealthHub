package com.entity.model;

import com.entity.YinshijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public class YinshijihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 脂肪类
	 */
	
	private String zhifanglei;
		
	/**
	 * 蛋白类
	 */
	
	private String danbailei;
		
	/**
	 * 蔬果类
	 */
	
	private String shuguolei;
		
	/**
	 * 饮食建议
	 */
	
	private String yinshijianyi;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：脂肪类
	 */
	 
	public void setZhifanglei(String zhifanglei) {
		this.zhifanglei = zhifanglei;
	}
	
	/**
	 * 获取：脂肪类
	 */
	public String getZhifanglei() {
		return zhifanglei;
	}
				
	
	/**
	 * 设置：蛋白类
	 */
	 
	public void setDanbailei(String danbailei) {
		this.danbailei = danbailei;
	}
	
	/**
	 * 获取：蛋白类
	 */
	public String getDanbailei() {
		return danbailei;
	}
				
	
	/**
	 * 设置：蔬果类
	 */
	 
	public void setShuguolei(String shuguolei) {
		this.shuguolei = shuguolei;
	}
	
	/**
	 * 获取：蔬果类
	 */
	public String getShuguolei() {
		return shuguolei;
	}
				
	
	/**
	 * 设置：饮食建议
	 */
	 
	public void setYinshijianyi(String yinshijianyi) {
		this.yinshijianyi = yinshijianyi;
	}
	
	/**
	 * 获取：饮食建议
	 */
	public String getYinshijianyi() {
		return yinshijianyi;
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
