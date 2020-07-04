package com.p280ss.android.ugc.trill.share.helo.p1769b;

import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.trill.share.helo.b.b */
public final class C45144b {

    /* renamed from: a */
    public static final C7541d f115996a = C7546e.m23569a(C45146b.f115999a);

    /* renamed from: b */
    public static final C45145a f115997b = new C45145a(null);

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.b$a */
    public static final class C45145a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f115998a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45145a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/helper/UserHeloCache;"))};

        private C45145a() {
        }

        /* renamed from: a */
        public static C45144b m142328a() {
            return (C45144b) C45144b.f115996a.getValue();
        }

        public /* synthetic */ C45145a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.b$b */
    static final class C45146b extends Lambda implements C7561a<C45144b> {

        /* renamed from: a */
        public static final C45146b f115999a = new C45146b();

        C45146b() {
            super(0);
        }

        /* renamed from: a */
        private static C45144b m142329a() {
            return new C45144b(null);
        }

        public final /* synthetic */ Object invoke() {
            return m142329a();
        }
    }

    private C45144b() {
    }

    /* renamed from: c */
    public static final C45144b m142321c() {
        return C45145a.m142328a();
    }

    /* renamed from: a */
    public final boolean mo107694a() {
        return C23338f.m76562a().mo60627a(m142322d(), false);
    }

    /* renamed from: b */
    public final boolean mo107696b() {
        return C23338f.m76562a().mo60627a(m142323e(), false);
    }

    /* renamed from: d */
    private static String m142322d() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        StringBuilder sb = new StringBuilder("user_bind_and_accredit_helo");
        C7573i.m23582a((Object) iUserService, "service");
        sb.append(iUserService.getCurrentUserID());
        return sb.toString();
    }

    /* renamed from: e */
    private static String m142323e() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        StringBuilder sb = new StringBuilder("last_selected_helo");
        C7573i.m23582a((Object) iUserService, "service");
        sb.append(iUserService.getCurrentUserID());
        return sb.toString();
    }

    public /* synthetic */ C45144b(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final void mo107693a(boolean z) {
        C23338f.m76562a().mo60634b(m142322d(), z);
    }

    /* renamed from: b */
    public final void mo107695b(boolean z) {
        C23338f.m76562a().mo60634b(m142323e(), z);
    }
}
