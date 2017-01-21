package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.List;

/**
 * Created by Crystal on 2016/12/25.
 */
public class SessionListener implements HttpSessionListener {

    public SessionListener(String userId) {

    }

    public void sessionCreated(HttpSessionEvent event) {
//        System.out.println("创建session......");
//        HttpSession session = event.getSession();
//        ServletContext application = session.getServletContext();
//
//        // 在application范围由一个HashSet集保存所有的session
//        HashSet sessions = (HashSet) application.getAttribute("sessions");
//        if (sessions == null) {
//            sessions = new HashSet();
//            application.setAttribute("sessions", sessions);
//        }
//
//        // 新创建的session均添加到HashSet集中
//        sessions.add(session);
//        // 可以在别处从application范围中取出sessions集合
//        // 然后使用sessions.size()获取当前活动的session数，即为“在线人数”

        System.out.println("创建session......");
//        ServletContext context=event.getSession().getServletContext();
//        Integer count=(Integer)context.getAttribute("count");
//        if(count==null){
//            count=new Integer(1);
//        }else{
//            int co = count.intValue( );
//            count= new Integer(co+1);
//        }
//        System.out.println("当前用户人数："+count);
//        context.setAttribute("count", count);//保存人数
        System.out.println("新建session:" + event.getSession().getId());

    }

    public void sessionDestroyed(HttpSessionEvent event) {
//        System.out.println("销毁session......");
//        HttpSession session = event.getSession();
//        ServletContext application = session.getServletContext();
//        HashSet sessions = (HashSet) application.getAttribute("sessions");
//
//        // 销毁的session均从HashSet集中移除
//        sessions.remove(session);

//        System.out.println("销毁session......");
//        ServletContext context=event.getSession().getServletContext();
//        Integer count=(Integer)context.getAttribute("count");
//        int co=count.intValue();
//        count=new Integer(co-1);
//        context.setAttribute("count", count);
//        System.out.println("当前用户人数："+count);

        HttpSession session = event.getSession();
        ServletContext application = session.getServletContext();
        // 取得登录的用户名
        String userId = (String) session.getAttribute("userId");
        // 从在线列表中删除用户名
        List onlineUserList = (List) application.getAttribute("onlineUserList");
        onlineUserList.remove(userId);
        System.out.println(userId+"已经退出！");
    }

}
