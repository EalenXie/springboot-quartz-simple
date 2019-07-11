package name.ealen.domain.execute;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by EalenXie on 2019/7/10 15:30.
 * <p>
 * Job 是 定时任务的具体执行逻辑
 * JobDetail 是 定时任务的定义
 */
@Slf4j
@DisallowConcurrentExecution
public class SayHelloJobLogic implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String time = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        //写你自己的逻辑
        log.info(time + " : SayHelloJob.execute , hello world  ! ");

    }
}
