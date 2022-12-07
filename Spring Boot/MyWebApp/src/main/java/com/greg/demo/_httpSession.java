/*
 * package com.greg.demo;
 * 
 * import org.springframework.stereotype.Controller;
 * import org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * import jakarta.servlet.http.HttpSession;
 * 
 * // ======================================= Using Servlet functions
 * 
 * @Controller
 * public class HomeController
 * {
 * 
 * @RequestMapping("home")
 * public String home(HttpServletRequest req) // HttpServletRequest allows you
 * to request dynamic data from a web server
 * // don't need it here, but you can also add ", HttpServletResponse res" after
 * "HttpServletRequest req";
 * {
 * HttpSession session = req.getSession(); // grabs the current session object
 * 
 * String name = req.getParameter("name");
 * System.out.println(name);
 * session.setAttribute("name", name); // needed to pass to home.jsp... sets a
 * key/value pair
 * 
 * 
 * //System.out.println("You rang?");
 * return "home";
 * }
 * }
 * 
 * // ======================================= Using httpSession functions
 * 
 * @Controller
 * public class HomeController
 * {
 * 
 * @RequestMapping("home")
 * public String home(@RequestParam("name") String myName, HttpSession
 * session)//assigns name to myName
 * //public String home(String name, HttpSession session) //will grab name
 * {
 * 
 * System.out.println(myName);
 * session.setAttribute("name", myName); // needed to pass to home.jsp... sets a
 * key/value pair
 * 
 * return "home";
 * }
 * 
 * }
 */