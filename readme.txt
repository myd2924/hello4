1、自定义校验
2、java发送请求 OkHttpClient

3、全局异常校验--业务异常全局统一处理，将控制层的异常包装到自定义的异常中
为了优雅，将code，msg，data统一封装到结构体重

4、注解地方
@Validated：可以用在类型、方法和方法参数上。但是不能用在成员属性（字段）上；可分组；
@Valid：可以用在方法、构造函数、方法参数和成员属性（字段）上；暂未吸收分组功能；

@Validated：用在方法入参上无法单独提供嵌套验证功能。不能用在成员属性（字段）上，也无法提示框架进行嵌套验证。能配合嵌套验证注解@Valid进行嵌套验证。
@Valid：用在方法入参上无法单独提供嵌套验证功能。能够用在成员属性（字段）上，提示验证框架进行嵌套验证。能配合嵌套验证注解@Valid进行嵌套验证。

5、通配符T与占位符?

6、读取属性文件==方式有很多

7、BeanFactoryPostProcessor、BeanPostProcessor的使用

8、ImportBeanDefinitionRegistrar动态的创建bean到spring中
