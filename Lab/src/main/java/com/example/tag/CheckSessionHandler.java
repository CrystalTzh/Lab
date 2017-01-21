package com.example.tag;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by Crystal on 2017/1/4.
 */
public class CheckSessionHandler extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        int result=0;
        HttpSession session=pageContext.getSession();
        String loginInfo=(String)session.getAttribute("username");
        if(loginInfo==null){
            result=SKIP_BODY;
            try {
                HttpServletResponse response=(HttpServletResponse)pageContext.getResponse();
                response.sendRedirect("/index.jsp");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            result=EVAL_BODY_INCLUDE;
        }
        return result;
    }
}
