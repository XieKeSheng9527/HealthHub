package com.entity.vo;

import com.entity.JiankangtixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康提醒
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public class JiankangtixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 提醒项目
	 */
	
	private String tixingxiangmu;
		
	/**
	 * 提醒内容
	 */
	
	private String tixingneirong;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：提醒项目
	 */
	 
	public void setTixingxiangmu(String tixingxiangmu) {
		this.tixingxiangmu = tixingxiangmu;
	}
	
	/**
	 * 获取：提醒项目
	 */
	public String getTixingxiangmu() {
		return tixingxiangmu;
	}
				
	
	/**
	 * 设置：提醒内容
	 */
	 
	public void setTixingneirong(String tixingneirong) {
		this.tixingneirong = tixingneirong;
	}
	
	/**
	 * 获取：提醒内容
	 */
	public String getTixingneirong() {
		return tixingneirong;
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
