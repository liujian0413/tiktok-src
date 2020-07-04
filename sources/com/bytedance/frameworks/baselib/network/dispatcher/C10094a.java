package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.a */
public final class C10094a extends C10095b {

    /* renamed from: a */
    public final boolean f27457a;

    /* renamed from: b */
    public final String f27458b;

    /* renamed from: g */
    private final Runnable f27459g;

    /* renamed from: h */
    private final Priority f27460h;

    /* renamed from: a */
    public final Priority mo24744a() {
        return this.f27460h;
    }

    /* renamed from: b */
    public final int mo24745b() {
        return this.f27464f;
    }

    public final void run() {
        if (this.f27459g != null && !mo24749c()) {
            this.f27459g.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C10094a mo24746a(int i) {
        this.f27464f = i;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(IRequest iRequest) {
        Priority a = mo24744a();
        Priority a2 = iRequest.mo24744a();
        if (a == null) {
            a = Priority.NORMAL;
        }
        if (a2 == null) {
            a2 = Priority.NORMAL;
        }
        if (a == a2) {
            return mo24745b() - iRequest.mo24745b();
        }
        return a2.ordinal() - a.ordinal();
    }

    public C10094a(String str, Priority priority, int i, Runnable runnable, boolean z) {
        this.f27460h = priority;
        if (C6319n.m19593a(str)) {
            str = getClass().getSimpleName();
        }
        this.f27463e = i;
        this.f27458b = str;
        this.f27459g = runnable;
        this.f27457a = z;
    }
}
