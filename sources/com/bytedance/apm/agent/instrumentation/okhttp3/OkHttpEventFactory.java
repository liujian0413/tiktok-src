package com.bytedance.apm.agent.instrumentation.okhttp3;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.EventListener.Factory;

public class OkHttpEventFactory implements Factory {
    public Factory originFactory;

    public OkHttpEventFactory(Factory factory) {
        this.originFactory = factory;
    }

    public EventListener create(Call call) {
        EventListener eventListener;
        if (this.originFactory != null) {
            eventListener = this.originFactory.create(call);
        } else {
            eventListener = null;
        }
        return new OkHttpEventListener(eventListener);
    }
}
