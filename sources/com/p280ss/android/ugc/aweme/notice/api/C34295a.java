package com.p280ss.android.ugc.aweme.notice.api;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notice.api.a */
public final class C34295a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89439a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34295a.class), "livePushService", "getLivePushService()Lcom/ss/android/ugc/aweme/notice/api/LivePushService;"))};

    /* renamed from: b */
    public static final C34295a f89440b = new C34295a();

    /* renamed from: c */
    private static final C7541d f89441c = C7546e.m23569a(C34296a.f89442a);

    /* renamed from: com.ss.android.ugc.aweme.notice.api.a$a */
    static final class C34296a extends Lambda implements C7561a<C34301b> {

        /* renamed from: a */
        public static final C34296a f89442a = new C34296a();

        C34296a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m110943a();
        }

        /* renamed from: a */
        private static C34301b m110943a() {
            return (C34301b) ServiceManager.get().getService(C34301b.class);
        }
    }

    private C34295a() {
    }

    /* renamed from: b */
    private final C34301b m110942b() {
        return (C34301b) f89441c.getValue();
    }

    /* renamed from: a */
    public static final C34301b m110941a() {
        return f89440b.m110942b();
    }
}
