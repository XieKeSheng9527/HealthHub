package com.entity.view;

import com.entity.DiscussjiankangzhishikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 健康知识库评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-15 15:41:13
 */
@TableName("discussjiankangzhishiku")
public class DiscussjiankangzhishikuView  extends DiscussjiankangzhishikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiankangzhishikuView(){
	}
 
 	public DiscussjiankangzhishikuView(DiscussjiankangzhishikuEntity discussjiankangzhishikuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiankangzhishikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
