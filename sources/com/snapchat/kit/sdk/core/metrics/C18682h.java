package com.snapchat.kit.sdk.core.metrics;

import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.h */
public final class C18682h implements C47373d<ScheduledExecutorService> {

    /* renamed from: a */
    private static final C18682h f50468a = new C18682h();

    /* renamed from: a */
    public static C47373d<ScheduledExecutorService> m61222a() {
        return f50468a;
    }

    public final /* synthetic */ Object get() {
        return m61223b();
    }

    /* renamed from: b */
    private static ScheduledExecutorService m61223b() {
        return (ScheduledExecutorService) C47375f.m147940a(C18677c.m61214a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
