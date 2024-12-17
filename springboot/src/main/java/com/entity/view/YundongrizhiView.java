package com.entity.view;

import com.entity.YundongrizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 运动日志
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:11
 */
@TableName("yundongrizhi")
public class YundongrizhiView  extends YundongrizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YundongrizhiView(){
	}
 
 	public YundongrizhiView(YundongrizhiEntity yundongrizhiEntity){
 	try {
			BeanUtils.copyProperties(this, yundongrizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
