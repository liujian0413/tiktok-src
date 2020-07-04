package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.HashMap;
import java.util.Map;

class DefaultTaskExecutor implements TaskExecutor {
    private final Map<TaskTraits, TaskRunner> mTraitsToRunnerMap = new HashMap();

    public boolean canRunTaskImmediately(TaskTraits taskTraits) {
        return false;
    }

    DefaultTaskExecutor() {
    }

    private synchronized ChoreographerTaskRunner createChoreographerTaskRunner() {
        return (ChoreographerTaskRunner) ThreadUtils.runOnUiThreadBlockingNoException(DefaultTaskExecutor$$Lambda$0.$instance);
    }

    static final /* synthetic */ ChoreographerTaskRunner lambda$createChoreographerTaskRunner$0$DefaultTaskExecutor() throws Exception {
        return new ChoreographerTaskRunner(Choreographer.getInstance());
    }

    public SequencedTaskRunner createSequencedTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new SequencedTaskRunnerImpl(taskTraits);
    }

    public SingleThreadTaskRunner createSingleThreadTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new SingleThreadTaskRunnerImpl(null, taskTraits);
    }

    public TaskRunner createTaskRunner(TaskTraits taskTraits) {
        if (taskTraits.mIsChoreographerFrame) {
            return createChoreographerTaskRunner();
        }
        return new TaskRunnerImpl(taskTraits);
    }

    public synchronized void postDelayedTask(TaskTraits taskTraits, Runnable runnable, long j) {
        if (taskTraits.hasExtension()) {
            TaskRunner createTaskRunner = createTaskRunner(taskTraits);
            createTaskRunner.postDelayedTask(runnable, j);
            createTaskRunner.destroy();
            return;
        }
        TaskRunner taskRunner = (TaskRunner) this.mTraitsToRunnerMap.get(taskTraits);
        if (taskRunner == null) {
            taskRunner = createTaskRunner(taskTraits);
            taskRunner.disableLifetimeCheck();
            this.mTraitsToRunnerMap.put(taskTraits, taskRunner);
        }
        taskRunner.postDelayedTask(runnable, j);
    }
}
