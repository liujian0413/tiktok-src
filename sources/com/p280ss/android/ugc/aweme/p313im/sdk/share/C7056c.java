package com.p280ss.android.ugc.aweme.p313im.sdk.share;

import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.c */
public final class C7056c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f19867a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C7056c.class), "tasks", "getTasks()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C7056c f19868b = new C7056c();

    /* renamed from: c */
    private static final C7541d f19869c = C7546e.m23569a(C7057a.f19872a);

    /* renamed from: d */
    private static int f19870d = -1;

    /* renamed from: e */
    private static volatile boolean f19871e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.c$a */
    static final class C7057a extends Lambda implements C7561a<List<Runnable>> {

        /* renamed from: a */
        public static final C7057a f19872a = new C7057a();

        C7057a() {
            super(0);
        }

        /* renamed from: a */
        private static List<Runnable> m21979a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m21979a();
        }
    }

    private C7056c() {
    }

    /* renamed from: c */
    private final List<Runnable> m21978c() {
        return (List) f19869c.getValue();
    }

    /* renamed from: b */
    public static final boolean m21977b() {
        if (m21973a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m21973a() {
        if (f19870d == -1 || !C7074e.m22066a()) {
            return 0;
        }
        return f19870d;
    }

    /* renamed from: a */
    public static void m21975a(boolean z) {
        f19871e = true;
    }

    /* renamed from: a */
    public static final synchronized void m21974a(Runnable runnable) {
        synchronized (C7056c.class) {
            C7573i.m23587b(runnable, "task");
            if (f19871e && f19870d == -1) {
                if (C7074e.m22066a()) {
                    f19868b.m21978c().add(runnable);
                    return;
                }
            }
            runnable.run();
        }
    }

    /* renamed from: b */
    public static final synchronized void m21976b(boolean z) {
        synchronized (C7056c.class) {
            f19870d = z ? 1 : 0;
            f19871e = false;
            for (Runnable run : f19868b.m21978c()) {
                run.run();
            }
            f19868b.m21978c().clear();
        }
    }
}
