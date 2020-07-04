package com.p280ss.android.ugc.aweme.video.local;

import com.bytedance.keva.Keva;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.video.local.g */
public final class C7277g {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f20351a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C7277g.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C7277g f20352b;

    /* renamed from: c */
    private static final C7541d f20353c = C7546e.m23569a(C7278a.f20355a);

    /* renamed from: d */
    private static boolean f20354d;

    /* renamed from: com.ss.android.ugc.aweme.video.local.g$a */
    static final class C7278a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C7278a f20355a = new C7278a();

        C7278a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m22832a() {
            return Keva.getRepoSync("player_setting", 0);
        }

        public final /* synthetic */ Object invoke() {
            return m22832a();
        }
    }

    private C7277g() {
    }

    /* renamed from: a */
    public static final boolean m22829a() {
        return f20354d;
    }

    /* renamed from: b */
    private final Keva m22830b() {
        return (Keva) f20353c.getValue();
    }

    /* renamed from: c */
    private void m22831c() {
        f20354d = m22830b().getBoolean("useSurfaceView", false);
    }

    static {
        C7277g gVar = new C7277g();
        f20352b = gVar;
        gVar.m22831c();
    }

    /* renamed from: a */
    public static final void m22828a(boolean z) {
        f20352b.m22830b().storeBoolean("useSurfaceView", z);
    }
}
