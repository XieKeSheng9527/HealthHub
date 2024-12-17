package com.entity.vo;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public class JiankangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 体重(kg)
	 */
	
	private Double tizhong;
		
	/**
	 * 血压(mmHg)
	 */
	
	private Double xueya;
		
	/**
	 * 血脂(mg/dL)
	 */
	
	private Double xuezhi;
		
	/**
	 * 血糖(mg/dL)
	 */
	
	private Double xuetang;
		
	/**
	 * 心率(次/分)
	 */
	
	private Double xinlv;
		
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
	 * 设置：体重(kg)
	 */
	 
	public void setTizhong(Double tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：体重(kg)
	 */
	public Double getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：血压(mmHg)
	 */
	 
	public void setXueya(Double xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压(mmHg)
	 */
	public Double getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：血脂(mg/dL)
	 */
	 
	public void setXuezhi(Double xuezhi) {
		this.xuezhi = xuezhi;
	}
	
	/**
	 * 获取：血脂(mg/dL)
	 */
	public Double getXuezhi() {
		return xuezhi;
	}
				
	
	/**
	 * 设置：血糖(mg/dL)
	 */
	 
	public void setXuetang(Double xuetang) {
		this.xuetang = xuetang;
	}
	
	/**
	 * 获取：血糖(mg/dL)
	 */
	public Double getXuetang() {
		return xuetang;
	}
				
	
	/**
	 * 设置：心率(次/分)
	 */
	 
	public void setXinlv(Double xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率(次/分)
	 */
	public Double getXinlv() {
		return xinlv;
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
