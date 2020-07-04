package com.facebook.react.bridge.queue;

public interface ReactQueueConfiguration {
    void destroy();

    MessageQueueThread getJSQueueThread();

    MessageQueueThread getLayoutThread();

    MessageQueueThread getNativeModulesQueueThread();

    MessageQueueThread getUIQueueThread();
}
