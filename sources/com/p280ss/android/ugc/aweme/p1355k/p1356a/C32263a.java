package com.p280ss.android.ugc.aweme.p1355k.p1356a;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.k.a.a */
public final class C32263a {

    /* renamed from: a */
    public static final C32264a f84322a = new C32264a(null);

    /* renamed from: com.ss.android.ugc.aweme.k.a.a$a */
    public static final class C32264a {
        private C32264a() {
        }

        /* renamed from: a */
        public final IIMService mo83487a() {
            return m104777a(true);
        }

        /* renamed from: b */
        public static boolean m104778b() {
            if (((C34320a) C34324a.m111010a(C34320a.class)).mo60334a(1) == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C32264a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static IIMService m104777a(boolean z) {
            IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
            C7573i.m23582a((Object) iIMService, "imService");
            return iIMService;
        }
    }

    /* renamed from: a */
    public static final IIMService m104774a() {
        return f84322a.mo83487a();
    }

    /* renamed from: a */
    public static final IIMService m104775a(boolean z) {
        return C32264a.m104777a(false);
    }

    /* renamed from: b */
    public static final boolean m104776b() {
        return C32264a.m104778b();
    }
}
