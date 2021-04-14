package com.github.domain.execute;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by EalenXie on 2019/7/10 15:30.
 * <p>
 * Job 是 定时任务的具体执行逻辑
 * JobDetail 是 定时任务的定义
 */
@DisallowConcurrentExecution
public class SayHelloJobLogic implements Job {
    private static final Logger log = LoggerFactory.getLogger(SayHelloJobLogic.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //写你自己的逻辑
        log.info("SayHelloJob.execute , hello world  ! ");

    }
}
