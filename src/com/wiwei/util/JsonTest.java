package com.wiwei.util;
import com.alibaba.fastjson.JSON;
import com.wiwei.dao.*;
import com.wiwei.model.*;
public class JsonTest {

	public static void main(String[] args) {
		//序列化 持久化		
//		Goods goods = new Goods("香蕉","云南",23,2343);
//		String json = JSON.toJSONString(goods);
//		System.out.println(json);
		//反序列化 也就是json的解析
		
		String s = "{\"des\":\"云南\",\"inventory\":2343,\"name\":\"香蕉\",\"price\":23}";
		Goods goods = JSON.parseObject(s,Goods.class);
		System.out.println(goods.getName());
		System.out.println(goods.getPrice());
		System.out.println(goods.getDes());
		System.out.println(goods.getInventory());
	}
}
