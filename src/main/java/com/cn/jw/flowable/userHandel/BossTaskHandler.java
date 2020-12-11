package com.cn.jw.flowable.userHandel;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * 项目名: flowabledemo
 * 文件名: ManagerTaskHandler
 * 创建者: wangpu
 * 创建时间:2020/12/11 10:17
 * 描述: TODO
 */
public class BossTaskHandler implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
            delegateTask.setAssignee("老板");
    }
}
