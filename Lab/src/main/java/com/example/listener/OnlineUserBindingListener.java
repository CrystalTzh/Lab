//package com.example.listener;
//
//import com.example.service.bean.CounterService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionBindingEvent;
//import javax.servlet.http.HttpSessionBindingListener;
//
//
//public class OnlineUserBindingListener implements HttpSessionBindingListener {
//
//
//	/**
//     * Default constructor.
//     */
//	private CounterService counter;
//
//    public OnlineUserBindingListener() {
//        // TODO Auto-generated constructor stub
//    }
//
//    /**
//     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
//     */
//    public void valueBound(HttpSessionBindingEvent event)  {
//         // TODO Auto-generated method stub
//    	HttpSession session = event.getSession();
//    	ServletContext application = session.getServletContext();
//		ApplicationContext ctx =WebApplicationContextUtils.getRequiredWebApplicationContext(application);
//		counter=(CounterService)ctx.getBean("counterService");
//
//    	int custNum = ((Integer)application.getAttribute("custNum")).intValue();
//   		custNum--;
//   		application.setAttribute("custNum", custNum);
//
//    	int userNum = ((Integer)application.getAttribute("userNum")).intValue();
//    	userNum++;
//   		application.setAttribute("userNum", userNum);
//
//   		try {
//   			if(counter==null){
//   				System.out.println("出现意外");
//   			}
//			counter.updateCustNum(custNum);
//			counter.updateUserNum(userNum);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//    }
//
//	/**
//     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
//     */
//    public void valueUnbound(HttpSessionBindingEvent event)  {
//    }
//
//
//
//}
