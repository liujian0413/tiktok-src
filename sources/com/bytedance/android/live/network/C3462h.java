package com.bytedance.android.live.network;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.google.gson.C6600e;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.android.live.network.h */
public final class C3462h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f10280a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C3462h.class), "instance", "getInstance()Lcom/google/gson/Gson;"))};

    /* renamed from: b */
    public static final C3462h f10281b = new C3462h();

    /* renamed from: c */
    private static final C7541d f10282c = C7546e.m23569a(C3463a.f10283a);

    /* renamed from: com.bytedance.android.live.network.h$a */
    static final class C3463a extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C3463a f10283a = new C3463a();

        C3463a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m12824a();
        }

        /* renamed from: a */
        private static C6600e m12824a() {
            C6600e a = C2317a.m9932a();
            return C2317a.m9934c().mo15986a(C3477b.class, new BaseResponseTypeAdapter(a)).mo15986a(C3479d.class, new ResponseTypeAdapter(a)).mo15986a(C3474a.class, new BaseListResponseTypeAdapter(a)).mo15986a(C3478c.class, new ListResponseTypeAdapter(a)).mo15992f();
        }
    }

    private C3462h() {
    }

    /* renamed from: a */
    public final C6600e mo10448a() {
        return (C6600e) f10282c.getValue();
    }
}
