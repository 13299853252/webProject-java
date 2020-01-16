package com.wiwei.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.catalina.User;

import com.wiwei.util.SessionManager;

/**
 * Application Lifecycle Listener implementation class SessionAttributeListener
 *
 */
@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         if(arg0.getName().equals("user")) {
        	 User u =(User)arg0.getValue();
        	 //�ж������ͻ����Ƿ����û���¼
        	 if(SessionManager.sessionMap.containsKey(u.getUsername())) {
        		 //��ȡ��һ���ͻ��˵�session
        		 HttpSession session = SessionManager.sessionMap.get(u.getUsername());
        		 //�ѵ�¼��Ϣ������ͻ����Ƴ�
        		 session.removeAttribute("user");
        		 //��session�����Ƴ���Ӧ���û���
        		 SessionManager.sessionMap.remove(u.getUsername());
        	 }
        	 
        	 SessionManager.sessionMap.put(u.getUsername(),arg0.getSession());
         }
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("attributeRemoved");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("attributeReplaced");
    }
	
}
