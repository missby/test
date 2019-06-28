package buy.practice.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangby
 * @Classname MyInterceptors
 * @Description TODO
 * @Date 2019/6/24 16:28
 */
@Slf4j
public class MyInterceptors implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("MyInterceptors-preHandle拦截到此url：{}",request.getRequestURI());
        return true ;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("MyInterceptors-postHandle接口已返回：{}",request.getRequestURI());
//        log.error("抛出异常：{}",request.getRequestURI());
//        throw new RuntimeException("sdfdf ");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("MyInterceptors-afterCompletion。postHandle正常：{}",request.getRequestURI());
    }
}
