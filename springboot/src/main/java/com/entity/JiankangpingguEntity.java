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
 * 健康评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@TableName("jiankangpinggu")
public class JiankangpingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangpingguEntity() {
		
	}
	
	public JiankangpingguEntity(T t) {
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
					
	private String riqi;
	
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
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public String getRiqi() {
		return riqi;
	}
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
