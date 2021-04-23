SpringBoot整合Quartz简单完整例子
=====

由于之前有许多小伙伴因为看过我的这篇[《SpringBoot整合Quartz作为调度中心使用完整实例》](https://www.cnblogs.com/ealenxie/p/9134602.html)

问过我如何写个定时任务，里面写上逻辑自己的逻辑。故做此例子进行了实现说明。

#### 本例是SpringBoot完全整合Quartz的一个完整例子,基本不需要其他过多配置,基于SpringBoot 2.1.6.RELEASE

#### 1. 基本的实现效果: 对定时任务的 自定义逻辑,启动,暂停,恢复,删除,修改。

#### 2. 直接启动本例进行测试:

- 启动 : `localhost:8080/start` 启动一个名为HelloWorld,组名为GroupOne的定时任务，每隔2秒打印 "hello world"
- 暂停 : `localhost:8080/pause` 暂停HelloWorld定时任务
- 恢复 : `localhost:8080/resume` 恢复HelloWorld定时任务
- 删除 : `localhost:8080/delete` 删除HelloWorld定时任务
- 修改 : `localhost:8080/modifyCron`  修改HelloWorld定时任务,修改之后,每隔5秒打印 "hello world"
 

    