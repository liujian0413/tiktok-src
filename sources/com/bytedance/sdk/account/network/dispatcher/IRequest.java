package com.bytedance.sdk.account.network.dispatcher;

public interface IRequest {

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* renamed from: d */
    Priority mo31367d();

    /* renamed from: e */
    int mo31368e();
}
