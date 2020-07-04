package com.ttnet.org.chromium.base.task;

import java.util.Arrays;

public class TaskTraits {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final TaskTraits BEST_EFFORT;
    public static final TaskTraits BEST_EFFORT_MAY_BLOCK;
    public static final TaskTraits CHOREOGRAPHER_FRAME;
    public static final TaskTraits THREAD_POOL;
    public static final TaskTraits THREAD_POOL_BEST_EFFORT = THREAD_POOL.taskPriority(0);
    public static final TaskTraits THREAD_POOL_USER_BLOCKING;
    public static final TaskTraits THREAD_POOL_USER_VISIBLE = THREAD_POOL.taskPriority(1);
    public static final TaskTraits USER_BLOCKING;
    public static final TaskTraits USER_BLOCKING_MAY_BLOCK;
    public static final TaskTraits USER_VISIBLE;
    public static final TaskTraits USER_VISIBLE_MAY_BLOCK;
    byte[] mExtensionData;
    byte mExtensionId;
    boolean mIsChoreographerFrame;
    boolean mMayBlock;
    int mPriority;
    boolean mPrioritySetExplicitly;
    boolean mUseThreadPool;

    private TaskTraits() {
        this.mPriority = 1;
    }

    public boolean hasExtension() {
        if (this.mExtensionId != 0) {
            return true;
        }
        return false;
    }

    public TaskTraits mayBlock() {
        TaskTraits taskTraits = new TaskTraits(this);
        taskTraits.mMayBlock = true;
        return taskTraits;
    }

    public TaskTraits threadPool() {
        TaskTraits taskTraits = new TaskTraits(this);
        taskTraits.mUseThreadPool = true;
        return taskTraits;
    }

    public int hashCode() {
        return (((((((((((((this.mPrioritySetExplicitly ^ true ? 1 : 0) + true) * 37) + this.mPriority) * 37) + (this.mMayBlock ^ true ? 1 : 0)) * 37) + (this.mUseThreadPool ^ true ? 1 : 0)) * 37) + this.mExtensionId) * 37) + Arrays.hashCode(this.mExtensionData)) * 37) + (this.mIsChoreographerFrame ^ true ? 1 : 0);
    }

    static {
        TaskTraits taskPriority = new TaskTraits().taskPriority(0);
        BEST_EFFORT = taskPriority;
        BEST_EFFORT_MAY_BLOCK = taskPriority.mayBlock();
        TaskTraits taskPriority2 = new TaskTraits().taskPriority(1);
        USER_VISIBLE = taskPriority2;
        USER_VISIBLE_MAY_BLOCK = taskPriority2.mayBlock();
        TaskTraits taskPriority3 = new TaskTraits().taskPriority(2);
        USER_BLOCKING = taskPriority3;
        USER_BLOCKING_MAY_BLOCK = taskPriority3.mayBlock();
        TaskTraits taskTraits = new TaskTraits();
        CHOREOGRAPHER_FRAME = taskTraits;
        taskTraits.mIsChoreographerFrame = true;
        TaskTraits threadPool = new TaskTraits().threadPool();
        THREAD_POOL = threadPool;
        THREAD_POOL_USER_BLOCKING = threadPool.taskPriority(2);
    }

    public TaskTraits taskPriority(int i) {
        TaskTraits taskTraits = new TaskTraits(this);
        taskTraits.mPrioritySetExplicitly = true;
        taskTraits.mPriority = i;
        return taskTraits;
    }

    private TaskTraits(TaskTraits taskTraits) {
        this.mPrioritySetExplicitly = taskTraits.mPrioritySetExplicitly;
        this.mPriority = taskTraits.mPriority;
        this.mMayBlock = taskTraits.mMayBlock;
        this.mUseThreadPool = taskTraits.mUseThreadPool;
        this.mExtensionId = taskTraits.mExtensionId;
        this.mExtensionData = taskTraits.mExtensionData;
    }

    public <Extension> Extension getExtension(TaskTraitsExtensionDescriptor<Extension> taskTraitsExtensionDescriptor) {
        if (this.mExtensionId == taskTraitsExtensionDescriptor.getId()) {
            return taskTraitsExtensionDescriptor.fromSerializedData(this.mExtensionData);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaskTraits)) {
            return false;
        }
        TaskTraits taskTraits = (TaskTraits) obj;
        if (this.mPrioritySetExplicitly == taskTraits.mPrioritySetExplicitly && this.mPriority == taskTraits.mPriority && this.mExtensionId == taskTraits.mExtensionId && Arrays.equals(this.mExtensionData, taskTraits.mExtensionData)) {
            return true;
        }
        return false;
    }

    public <Extension> TaskTraits withExtension(TaskTraitsExtensionDescriptor<Extension> taskTraitsExtensionDescriptor, Extension extension) {
        int id = taskTraitsExtensionDescriptor.getId();
        byte[] serializedData = taskTraitsExtensionDescriptor.toSerializedData(extension);
        TaskTraits taskTraits = new TaskTraits(this);
        taskTraits.mExtensionId = (byte) id;
        taskTraits.mExtensionData = serializedData;
        return taskTraits;
    }
}
