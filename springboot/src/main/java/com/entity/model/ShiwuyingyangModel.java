package com.entity.model;

import com.entity.ShiwuyingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食物营养
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
public class ShiwuyingyangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 蛋白质
	 */
	
	private String danbaizhi;
		
	/**
	 * 热量
	 */
	
	private String reliang;
		
	/**
	 * 脂肪
	 */
	
	private String zhifang;
		
	/**
	 * 碳水化合物
	 */
	
	private String tanshuihuahewu;
		
	/**
	 * 矿物质
	 */
	
	private String kuangwuzhi;
		
	/**
	 * 维生素
	 */
	
	private String weishengsu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：蛋白质
	 */
	 
	public void setDanbaizhi(String danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：蛋白质
	 */
	public String getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：热量
	 */
	 
	public void setReliang(String reliang) {
		this.reliang = reliang;
	}
	
	/**
	 * 获取：热量
	 */
	public String getReliang() {
		return reliang;
	}
				
	
	/**
	 * 设置：脂肪
	 */
	 
	public void setZhifang(String zhifang) {
		this.zhifang = zhifang;
	}
	
	/**
	 * 获取：脂肪
	 */
	public String getZhifang() {
		return zhifang;
	}
				
	
	/**
	 * 设置：碳水化合物
	 */
	 
	public void setTanshuihuahewu(String tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	
	/**
	 * 获取：碳水化合物
	 */
	public String getTanshuihuahewu() {
		return tanshuihuahewu;
	}
				
	
	/**
	 * 设置：矿物质
	 */
	 
	public void setKuangwuzhi(String kuangwuzhi) {
		this.kuangwuzhi = kuangwuzhi;
	}
	
	/**
	 * 获取：矿物质
	 */
	public String getKuangwuzhi() {
		return kuangwuzhi;
	}
				
	
	/**
	 * 设置：维生素
	 */
	 
	public void setWeishengsu(String weishengsu) {
		this.weishengsu = weishengsu;
	}
	
	/**
	 * 获取：维生素
	 */
	public String getWeishengsu() {
		return weishengsu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
