package com.wiwei.service;

import java.util.List;

import com.wiwei.dao.GoodsDao;
import com.wiwei.model.Goods;

public class GoodsService {

	public List<Goods> selectAllGoods(){
			return new GoodsDao().getAllGoods();
	}
}