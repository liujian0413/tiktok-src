package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

public class OkHttp3Instrumentation {
    public static OkHttpClient init() {
        return new Builder().addInterceptor(new AddHeaderInterceptor()).eventListenerFactory(new OkHttpEventFactory(null)).build();
    }

    public static OkHttpClient build(Builder builder) {
        return builder.addInterceptor(new AddHeaderInterceptor()).eventListenerFactory(new OkHttpEventFactory(builder.build().eventListenerFactory)).build();
    }
}
