package com.example.domain;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HttpSession httpSession = request.getSession();
		ModelMap modelMap=modelAndView.getModelMap();
		Object userVO = modelMap.get("user");
		
		if(userVO != null) {
			logger.info("new login success");
			httpSession.setAttribute(LOGIN, userVO);
			
			if(request.getParameter("useCookie") != null) {
				logger.info("remember me..");
				Cookie loginCookie = new Cookie("loginCookie", httpSession.getId());
				loginCookie.setPath("/");
				loginCookie.setMaxAge(60*60*24*7);
				
				response.addCookie(loginCookie);
			}
			Object destination = httpSession.getAttribute("destination");
			response.sendRedirect(destination != null ? (String) destination:"/");
		}
		super.postHandle(request, response, handler, modelAndView);
	}

}
