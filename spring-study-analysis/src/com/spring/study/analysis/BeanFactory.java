package com.spring.study.analysis;

/**
 * @Author: hanyf
 * @Description: Spring源码BeanFactory解析
 * @Date: 2019/1/8 18:05
 */
public interface BeanFactory {

    //对FactoryBean的转义定义，因为如果使用bean的名字检索FactoryBean得到的对象是工厂生成的对象，
    //如果需要得到工厂本身，需要转义
    String FACTORY_BEAN_PREFIX = "&";
    //根据bean的名字，获取在IOC容器中得到bean实例
    // Object getBean(String name) throws BeansException;
    Object getBean(String name);
    //根据bean的名字和Class类型来得到bean实例，增加了类型安全验证机制。
    // Object getBean(String name, Class requiredType) throws BeansException;
    Object getBean(String name, Class requiredType);
    //提供对bean的检索，看看是否在IOC容器有这个名字的bean
    boolean containsBean(String name);
    //根据bean名字得到bean实例，并同时判断这个bean是不是单例
    // boolean isSingleton(String name) throws NoSuchBeanDefinitionException;
    boolean isSingleton(String name);
    //得到bean实例的Class类型
    // Class getType(String name) throws NoSUchBeanDefinitionException;
    Class getType(String name);
    //得到bean的别名，如果根据别名检索，那么其原名也会被检索出来
    String[] getAliases(String name);
}
