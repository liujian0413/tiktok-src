package com.bytedance.sdk.account.utils;

import com.bytedance.sdk.account.network.dispatcher.C12901c;
import com.bytedance.sdk.account.network.dispatcher.IRequest.Priority;

/* renamed from: com.bytedance.sdk.account.utils.a */
public abstract class C12908a extends C12901c {
    protected C12908a() {
        this(null, Priority.NORMAL);
    }

    private C12908a(String str, Priority priority) {
        super(null, priority);
    }
}
