

spring 專案練習
==============

### 技術:
>1.springframework 5  
>2.angularJs 1  
>3.html
>4.css  
>5.java 8 
>6.tomcat 8 
>7.maven project  
>8.logback 日誌 

### 開發歷程

>1.使用tomcat-embed來啟動server  
>2.引入springframework  
>3.大部分使用java config代替web.xml設定  
>4.引入WebApplicationInitializer,server啟動會從onStartup注入設定  
>5.改成AbstractAnnotationConfigDispatcherServletInitializer 
>該類繼承引入WebApplicationInitializer提供部分設定跟method簡化設定難度 
>RootConfig注入controller以外spring容器 
>WebConfig注入controller容器,Web設定由此類設定  
>6.WebConfig加上@EnableWebMvc跟繼承WebMvcConfigurer介面  
>configureDefaultServletHandling設定基本servletHandl  
>addResourceHandlers設定靜態資源目錄  
>addViewControllers設定預設index.html 
>7.AnnotationConfigDispatcherServletInitializer複寫registerContextLoaderListener方法  
>加入contextLoader之前插入logListener引入指定路徑logback.xml檔案  



