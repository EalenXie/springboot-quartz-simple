package com.github.domain.entity;


import org.quartz.Job;
import org.quartz.JobKey;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * Created by EalenXie on 2019/7/10 16:28.
 * Quartz 里面 一个最简单,最基本的定时任务 应该包含以下必要基本属性
 * 注意 : 这里只是方便演示,故写此类进行简单说明, 可针对自身业务对此类进行扩展
 */
public class TaskDefine {

    /**
     * 定时任务 的名字和分组名 JobKey,{@link org.quartz.JobKey}
     */
    @NotNull(message = "定时任务的 名字 和 组名 坚决不为空")
    private JobKey jobKey;
    /**
     * 定时任务 的描述(可以定时任务本身的描述,也可以是触发器的)
     * {@link org.quartz.JobDetail} description ; {@link org.quartz.Trigger} description
     */
    private String description;
    /**
     * 定时任务 的执行cron (Trigger的CronScheduleBuilder 的cronExpression)
     * {@link org.quartz.Trigger} CronScheduleBuilder {@link org.quartz.CronScheduleBuilder}
     */
    @NotEmpty(message = "定时任务的执行cron 不能为空")
    private String cronExpression;
    /**
     * 定时任务 的元数据
     * {@link org.quartz.JobDataMap}
     */
    private Map<?, ?> jobDataMap;
    /**
     * 定时任务 的 具体执行逻辑类
     * {@link org.quartz.Job}
     */
    @NotNull(message = "定时任务的具体执行逻辑类 坚决不能为空")
    private Class<? extends Job> jobClass;


    public TaskDefine() {
    }

    public TaskDefine(JobKey jobKey, String description, String cronExpression, Map<?, ?> jobDataMap, Class<? extends Job> jobClass) {
        this.jobKey = jobKey;
        this.description = description;
        this.cronExpression = cronExpression;
        this.jobDataMap = jobDataMap;
        this.jobClass = jobClass;
    }

    public JobKey getJobKey() {
        return jobKey;
    }

    public void setJobKey(JobKey jobKey) {
        this.jobKey = jobKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Map<?, ?> getJobDataMap() {
        return jobDataMap;
    }

    public void setJobDataMap(Map<?, ?> jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    public Class<? extends Job> getJobClass() {
        return jobClass;
    }

    public void setJobClass(Class<? extends Job> jobClass) {
        this.jobClass = jobClass;
    }
}
