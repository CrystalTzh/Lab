package com.example.servlet;


import com.example.pojo.user.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by Crystal on 2016/12/19.
 */
@WebServlet("/LoginServlet")
public class login extends HttpServlet {

    /**
     * Constructor of the object.
     */
    public login() {
        super();
    }

    /**
     * Destruction of the servlet. <br>
     */
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
     * The doGet method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to get.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Add some codes
        doPost(request,response);
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getParameter("userId");
        request.getParameter("password");
        request.getSession().setAttribute("user", request.getParameter("userId"));      //将user放在Attribute中

        User user1=new User();
        user1.setUserName(request.getParameter("userId"));
        user1.setPassword(request.getParameter("password"));

        ServletContext context = request.getServletContext();
        context.setAttribute("count", 0);

        System.out.println(request.getParameter("userId")+request.getParameter("password"));
//        UserService userService = new UserServiceImpl();
        boolean isValidUser = user1.validate(request.getParameter("userId"), request.getParameter("password"));

        if(isValidUser)
        {
            System.out.println("true");


//            HttpSession session = request.getSession(false);
//            OnlineUserBindingListener listener = new OnlineUserBindingListener(request.getParameter("userId"));
//            session.setAttribute("listener", listener);
//            session.setAttribute("user", user1);
//            session.setAttribute("type", "user");
//            session.setMaxInactiveInterval(300);


            request.getRequestDispatcher("scores.jsp").forward(request, response); //校验用户名密码正确，跳转到scores.jsp


        }
        else
        {
            System.out.println("false");

//            HttpSession session = request.getSession(false);
//            if(session==null || session.getAttribute("type")==null) {
//
//                int custNum = ((Integer) request.getServletContext().getAttribute("custNum")).intValue();
//                custNum++;
//                request.getServletContext().setAttribute("custNum", custNum);
//
//
//                try {
//                    counter.updateCustNum(custNum);
//                } catch (Exception e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
//                session = request.getSession(true);
//                session.setAttribute("type", "cust");
//                session.setMaxInactiveInterval(600);
//
//
//            }
            request.getRequestDispatcher("index.jsp").forward(request, response);  //校验用户名密码不正确，跳转到index.jsp


        }

    }
    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
    public void init() throws ServletException {
        // Put your code here
    }

}
