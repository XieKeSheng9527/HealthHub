package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 饮食计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@TableName("yinshijihua")
public class YinshijihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinshijihuaEntity() {
		
	}
	
	public YinshijihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
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
