package com.wiwei.dao;
import java.util.List;

import com.wiwei.dao.*;
import com.wiwei.model.Goods;
import com.wiwei.util.DBUtil;
public class GoodsDao {

	public List<Goods> getAllGoods(){
		return DBUtil.goodslist;
	}
}
