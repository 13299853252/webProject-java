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
    	//��̬����鵱��Ŀ��������ʱ��ͻᱻִ�еĴ���
    	addUser(new User("wiwei","123","famel",20,true));
    	addUser(new User("weiyun","456","famel",20,true));
    	
    	goodslist.add(new Goods("�㽶","����",12,1233));
    	goodslist.add(new Goods("ƻ��","����",12,1233));
    	goodslist.add(new Goods("��֦","�¹�",12,34));
    	goodslist.add(new Goods("����","Ӣ��",12,143));
    	goodslist.add(new Goods("����","�ձ�",12,1233));
    	goodslist.add(new Goods("����","�й�",12,1533));
    	goodslist.add(new Goods("ɵ��","����",12,1233));
    	goodslist.add(new Goods("����","����",12,1233));
    	goodslist.add(new Goods("�㽶","����",12,1233));
    	
    }
    
    private static void addUser(User user) {
    	userMap.put(user.getUsername(),user);
    }
    
}
