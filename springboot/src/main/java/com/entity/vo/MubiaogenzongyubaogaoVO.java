package com.entity.vo;

import com.entity.MubiaogenzongyubaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 目标跟踪与报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
public class MubiaogenzongyubaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 目标体重
	 */
	
	private String mubiaotizhong;
		
	/**
	 * 当前体重
	 */
	
	private String dangqiantizhong;
		
	/**
	 * 进展情况
	 */
	
	private String jinzhanqingkuang;
		
	/**
	 * 用户
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：目标体重
	 */
	 
	public void setMubiaotizhong(String mubiaotizhong) {
		this.mubiaotizhong = mubiaotizhong;
	}
	
	/**
	 * 获取：目标体重
	 */
	public String getMubiaotizhong() {
		return mubiaotizhong;
	}
				
	
	/**
	 * 设置：当前体重
	 */
	 
	public void setDangqiantizhong(String dangqiantizhong) {
		this.dangqiantizhong = dangqiantizhong;
	}
	
	/**
	 * 获取：当前体重
	 */
	public String getDangqiantizhong() {
		return dangqiantizhong;
	}
				
	
	/**
	 * 设置：进展情况
	 */
	 
	public void setJinzhanqingkuang(String jinzhanqingkuang) {
		this.jinzhanqingkuang = jinzhanqingkuang;
	}
	
	/**
	 * 获取：进展情况
	 */
	public String getJinzhanqingkuang() {
		return jinzhanqingkuang;
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
