package com.wiwei.util;
import com.alibaba.fastjson.JSON;
import com.wiwei.dao.*;
import com.wiwei.model.*;
public class JsonTest {

	public static void main(String[] args) {
		//���л� �־û�		
//		Goods goods = new Goods("�㽶","����",23,2343);
//		String json = JSON.toJSONString(goods);
//		System.out.println(json);
		//�����л� Ҳ����json�Ľ���
		
		String s = "{\"des\":\"����\",\"inventory\":2343,\"name\":\"�㽶\",\"price\":23}";
		Goods goods = JSON.parseObject(s,Goods.class);
		System.out.println(goods.getName());
		System.out.println(goods.getPrice());
		System.out.println(goods.getDes());
		System.out.println(goods.getInventory());
	}
}
