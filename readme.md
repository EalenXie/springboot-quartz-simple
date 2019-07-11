SpringBoot整合Quartz简单完整例子
=====

由于之前有许多小伙伴因为看过我的这篇《SpringBoot整合Quartz作为调度中心使用完整实例》 : https://www.cnblogs.com/ealenxie/p/9134602.html

问过我如何写个定时任务，里面写上逻辑自己的逻辑。故做此例子进行了实现说明。


#### 本例是SpringBoot完全整合Quartz的一个完整例子,基本不需要其他过多配置,基于SpringBoot 2.1.6.RELEASE

#### 1. 基本的实现效果: 对定时任务的 自定义逻辑,启动,暂停,恢复,删除,修改。

#### 2. 本例子中的测试url:
    
   1. 访问localhost:8080/startHelloWorldJob 启动一个名为HelloWorld,组名为GroupOne的定时任务，每隔2秒打印 "hello world"
   
   2. 访问localhost:8080/pauseHelloWorldJob 暂停这个HelloWorld 的定时任务
   
   3. 访问localhost:8080/resumeHelloWorldJob 恢复这个HelloWorld 的定时任务
   
   4. 访问localhost:8080/deleteHelloWorldJob 删除这个HelloWorld 的定时任务
   
   5. 访问localhost:8080/modifyHelloWorldJobCron 修改这个HelloWorld 的定时任务,修改之后,每隔5秒打印 "hello world"

#### 3. 在你启动该应用之前: 
    
   1. 请自行修改数据库配置: /application.yml  

   2. 请准备Quartz的元数据表 : quartz_innodb.sql
        
        
    