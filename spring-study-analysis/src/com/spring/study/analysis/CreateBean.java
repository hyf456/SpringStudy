package com.spring.study.analysis;

/**
 * @Author: hanyf
 * @Description: 调用全过程还原，定位、载入、注册
 * @Date: 2019/1/9 9:33
 */
public class CreateBean {
    //根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
    // ClassPathResource resource = new ClassPathResource("application-context.xml");
    //创建DefaultListableBeanFactory
    //DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    //创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。之所以需要BeanFactory作为参数，是因为会将读取的信息回调配置给factory
    // XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    //XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册。
    // 完成后Bean就成功的放置到IOC容器当中，以后我们就可以从中取得Bean来使用
    // reader.loadBeanDefinitions(resource);
}
