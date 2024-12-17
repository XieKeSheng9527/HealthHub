package com.entity.view;

import com.entity.JiankangtixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 健康提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@TableName("jiankangtixing")
public class JiankangtixingView  extends JiankangtixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangtixingView(){
	}
 
 	public JiankangtixingView(JiankangtixingEntity jiankangtixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangtixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
