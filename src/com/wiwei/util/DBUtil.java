package com.wiwei.util;
import com.wiwei.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {

    public static Map<String, User> userMap = new HashMap<String, User>();
    
    public static List<Goods> goodslist = new ArrayList<Goods>();
    
    static {
    	//静态代码块当项目被启动的时候就会被执行的代码
    	addUser(new User("wiwei","123","famel",20,true));
    	addUser(new User("weiyun","456","famel",20,true));
    	
    	goodslist.add(new Goods("香蕉","韩国",12,1233));
    	goodslist.add(new Goods("苹果","韩国",12,1233));
    	goodslist.add(new Goods("荔枝","德国",12,34));
    	goodslist.add(new Goods("菠萝","英国",12,143));
    	goodslist.add(new Goods("花生","日本",12,1233));
    	goodslist.add(new Goods("橘子","中国",12,1533));
    	goodslist.add(new Goods("傻逼","美国",12,1233));
    	goodslist.add(new Goods("憨批","韩国",12,1233));
    	goodslist.add(new Goods("香蕉","韩国",12,1233));
    	
    }
    
    private static void addUser(User user) {
    	userMap.put(user.getUsername(),user);
    }
    
}
