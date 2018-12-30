package com.beng.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.beng.model.Person;

@Configuration
public class MainConfigure2 {

    // scope 作用域
    // singleton 单实例（默认值） ioc启动容器调用方法创建对象，以后每次获取从 ioc 容器中拿
    // prototype 多实例 ioc 容器不会创建对象，在调用的时候再去创建对象
    // request 同一次请求创建一个实例
    // session 同一个session创建一个实例

    // 懒加载：
    // 单实例的bean，ioc容器启动的时候创建对象；
    // 懒加载，ioc容器启动时不创建对象，第一次使用（获取）bean 创建对象，并初始化
    @Bean
    @Lazy
    // @Scope("prototype")
    public Person person() {
        System.out.println("给容器添加 Person...");
        return new Person("Jane", 20);
    }

}
