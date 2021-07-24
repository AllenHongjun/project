package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 1开始配置失败的原因
 * 可能是jar的的位置没有放在 WEB-INF下面 也有可能是代码的链接写错了
 * java也是每次修改都要重新编译 打包。 这个就是没有脚本文件
 * 如何热部署 就好像前端代码一样。。修改之后就会自动编译。。部分编译
 * 不会重新编译整个项目。。也不要重新启动项目。。？ 这个要研究一下。
 *
 */
public class IndexController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("index.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}