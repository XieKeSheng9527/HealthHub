package com.entity.view;

import com.entity.MubiaogenzongyubaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 目标跟踪与报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:12
 */
@TableName("mubiaogenzongyubaogao")
public class MubiaogenzongyubaogaoView  extends MubiaogenzongyubaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MubiaogenzongyubaogaoView(){
	}
 
 	public MubiaogenzongyubaogaoView(MubiaogenzongyubaogaoEntity mubiaogenzongyubaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, mubiaogenzongyubaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
