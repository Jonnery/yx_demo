package com.yx_demo.intercetor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * 拦截器配置
 * @author Guilin
 * @version 1.0
 * @date 2021/1/6 18:01
 */
@Configuration
public class SessionInterceptor implements WebMvcConfigurer {

    /**
     * 自定义拦截器，添加拦截路径和排除拦截路径
     * addPathPatterns():添加需要拦截的路径
     * excludePathPatterns():添加不需要拦截的路径
     */
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List list = new ArrayList();
        list.add("/user/toIndex");
        list.add("/user/loginUser");
        list.add("/user/toRegister");
        list.add("/user/register");
        list.add("/user/*.html");
        list.add("/user/js/*.js");
        list.add("/user/css/*.css");
        list.add("/user/woff/*.woff");
        list.add("/user/ttf/*.ttf");
        //第一种定义的拦截器
        //registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);
        //第二种定义拦截器
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
        //所有路径都被拦截
        registration.addPathPatterns("/**");
        //添加不拦截路径
        registration.excludePathPatterns(list);
    }
}
