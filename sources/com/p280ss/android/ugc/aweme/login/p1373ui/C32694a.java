package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.app.Activity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.p1373ui.LogoutDialogActivity.C32692a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.login.ui.a */
public final class C32694a {

    /* renamed from: a */
    public static final C7541d f85193a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C32696b.f85197a);

    /* renamed from: b */
    public static final C32695a f85194b = new C32695a(null);

    /* renamed from: c */
    private final AtomicBoolean f85195c = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$a */
    public static final class C32695a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f85196a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32695a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/login/ui/LogoutDialogUtils;"))};

        private C32695a() {
        }

        /* renamed from: a */
        public static C32694a m105810a() {
            return (C32694a) C32694a.f85193a.getValue();
        }

        public /* synthetic */ C32695a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.a$b */
    static final class C32696b extends Lambda implements C7561a<C32694a> {

        /* renamed from: a */
        public static final C32696b f85197a = new C32696b();

        C32696b() {
            super(0);
        }

        /* renamed from: a */
        private static C32694a m105811a() {
            return new C32694a();
        }

        public final /* synthetic */ Object invoke() {
            return m105811a();
        }
    }

    /* renamed from: b */
    public final void mo84136b() {
        this.f85195c.set(false);
    }

    /* renamed from: a */
    public final void mo84135a() {
        try {
            if (this.f85195c.compareAndSet(false, true)) {
                Activity g = C6405d.m19984g();
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (g == null || iUserService == null || !iUserService.isLogin()) {
                    mo84136b();
                } else {
                    C32692a.m105807a(g);
                }
            }
        } catch (Exception unused) {
        }
    }
}
