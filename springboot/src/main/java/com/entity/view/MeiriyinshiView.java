package com.entity.view;

import com.entity.MeiriyinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 每日饮食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@TableName("meiriyinshi")
public class MeiriyinshiView  extends MeiriyinshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeiriyinshiView(){
	}
 
 	public MeiriyinshiView(MeiriyinshiEntity meiriyinshiEntity){
 	try {
			BeanUtils.copyProperties(this, meiriyinshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
