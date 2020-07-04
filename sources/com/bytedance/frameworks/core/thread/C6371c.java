package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority.Priority;
import java.util.UUID;

/* renamed from: com.bytedance.frameworks.core.thread.c */
public abstract class C6371c implements TTPriority, Comparable<C6371c>, Runnable {

    /* renamed from: a */
    private Priority f18660a;

    /* renamed from: i */
    public String f18661i;

    /* renamed from: a */
    private Priority m19805a() {
        return this.f18660a;
    }

    public C6371c() {
        this.f18660a = Priority.NORMAL;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append("-");
        sb.append(String.valueOf(System.nanoTime()));
        this.f18661i = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C6371c cVar) {
        if (m19805a().getValue() < cVar.m19805a().getValue()) {
            return 1;
        }
        if (m19805a().getValue() > cVar.m19805a().getValue()) {
            return -1;
        }
        return 0;
    }

    public C6371c(Priority priority) {
        if (priority == null) {
            priority = Priority.NORMAL;
        }
        this.f18660a = priority;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append("-");
        sb.append(String.valueOf(System.nanoTime()));
        this.f18661i = sb.toString();
    }
}
