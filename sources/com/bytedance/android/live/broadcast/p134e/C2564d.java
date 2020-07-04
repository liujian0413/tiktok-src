package com.bytedance.android.live.broadcast.p134e;

import com.bytedance.android.live.broadcast.api.AutoReplyApi;
import com.bytedance.android.live.broadcast.api.BanUserInfoApi;
import com.bytedance.android.live.broadcast.api.BroadcastConfigRetrofitApi;
import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.api.CoverApi;
import com.bytedance.android.live.broadcast.api.DutyGiftAPi;
import com.bytedance.android.live.broadcast.api.StartLiveBannerApi;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.StickerGiftApi;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.live.network.C3458e;
import java.util.concurrent.ConcurrentHashMap;
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

/* renamed from: com.bytedance.android.live.broadcast.e.d */
public final class C2564d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8238a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C2564d.class), "services", "getServices()Ljava/util/concurrent/ConcurrentHashMap;"))};

    /* renamed from: b */
    private final C7541d f8239b;

    /* renamed from: com.bytedance.android.live.broadcast.e.d$a */
    public static final class C2565a implements C2511b<C2564d> {
        /* renamed from: a */
        public final C2512a<C2564d> mo8847a(C2512a<C2564d> aVar) {
            C7573i.m23587b(aVar, "config");
            C2512a<C2564d> a = aVar.mo9081a(new C2564d(null)).mo9080a();
            C7573i.m23582a((Object) a, "config\n                 …           .asSingleton()");
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.e.d$b */
    static final class C2566b extends Lambda implements C7561a<ConcurrentHashMap<Class<?>, Object>> {

        /* renamed from: a */
        public static final C2566b f8240a = new C2566b();

        C2566b() {
            super(0);
        }

        /* renamed from: a */
        private static ConcurrentHashMap<Class<?>, Object> m10551a() {
            return new ConcurrentHashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m10551a();
        }
    }

    /* renamed from: l */
    private final ConcurrentHashMap<Class<?>, Object> m10538l() {
        return (ConcurrentHashMap) this.f8239b.getValue();
    }

    private C2564d() {
        this.f8239b = C7546e.m23569a(C2566b.f8240a);
    }

    /* renamed from: a */
    public final AutoReplyApi mo9166a() {
        return (AutoReplyApi) m10537a(AutoReplyApi.class);
    }

    /* renamed from: b */
    public final BanUserInfoApi mo9167b() {
        return (BanUserInfoApi) m10537a(BanUserInfoApi.class);
    }

    /* renamed from: c */
    public final BroadcastConfigRetrofitApi mo9168c() {
        return (BroadcastConfigRetrofitApi) m10537a(BroadcastConfigRetrofitApi.class);
    }

    /* renamed from: d */
    public final BroadcastRoomApi mo9169d() {
        return (BroadcastRoomApi) m10537a(BroadcastRoomApi.class);
    }

    /* renamed from: e */
    public final BroadcastUserApi mo9170e() {
        return (BroadcastUserApi) m10537a(BroadcastUserApi.class);
    }

    /* renamed from: f */
    public final CoverApi mo9171f() {
        return (CoverApi) m10537a(CoverApi.class);
    }

    /* renamed from: g */
    public final DutyGiftAPi mo9172g() {
        return (DutyGiftAPi) m10537a(DutyGiftAPi.class);
    }

    /* renamed from: h */
    public final StartLiveBannerApi mo9173h() {
        return (StartLiveBannerApi) m10537a(StartLiveBannerApi.class);
    }

    /* renamed from: i */
    public final StatusApi mo9174i() {
        return (StatusApi) m10537a(StatusApi.class);
    }

    /* renamed from: j */
    public final StickerGiftApi mo9175j() {
        return (StickerGiftApi) m10537a(StickerGiftApi.class);
    }

    /* renamed from: k */
    public final StickerReportApi mo9176k() {
        return (StickerReportApi) m10537a(StickerReportApi.class);
    }

    public /* synthetic */ C2564d(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    private final <T> T m10537a(Class<T> cls) {
        if (!m10538l().contains(cls)) {
            ConcurrentHashMap l = m10538l();
            Object a = C3458e.m12798a().mo10440a(cls);
            if (a == null) {
                C7573i.m23580a();
            }
            l.putIfAbsent(cls, a);
        }
        return m10538l().get(cls);
    }
}
