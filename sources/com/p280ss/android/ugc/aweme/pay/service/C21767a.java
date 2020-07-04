package com.p280ss.android.ugc.aweme.pay.service;

import android.content.Context;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.pay.service.p972a.C21770a;
import com.p280ss.android.ugc.aweme.pay.service.p972a.C21772b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.pay.service.a */
public final class C21767a implements IPayService {

    /* renamed from: a */
    public static final C21768a f58282a = new C21768a(null);

    /* renamed from: com.ss.android.ugc.aweme.pay.service.a$a */
    public static final class C21768a {
        private C21768a() {
        }

        public /* synthetic */ C21768a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pay.service.a$b */
    public static final class C21769b implements C21770a {
        C21769b() {
        }
    }

    public final void initWalletSDKContext(String str) {
        C7573i.m23587b(str, "wxAppId");
        C2077a.m9159a("EmptyPayService initWalletSDKContext");
    }

    public final C21770a newPayTransaction(WeakReference<Context> weakReference, C21772b bVar) {
        C2077a.m9159a("EmptyPayService newPayTransaction");
        return new C21769b();
    }
}
