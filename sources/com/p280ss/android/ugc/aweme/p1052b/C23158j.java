package com.p280ss.android.ugc.aweme.p1052b;

import com.p280ss.android.ugc.aweme.legoImp.inflate.C32348g;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.b.j */
public final class C23158j {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f61107a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23158j.class), "X2C_MODE", "getX2C_MODE()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23158j.class), "isX2COpen", "isX2COpen()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23158j.class), "isX2CAsyncInflateOpen", "isX2CAsyncInflateOpen()Z"))};

    /* renamed from: b */
    public static final C23158j f61108b = new C23158j();

    /* renamed from: c */
    private static final C7541d f61109c = C7546e.m23568a(LazyThreadSafetyMode.NONE, C23159a.f61112a);

    /* renamed from: d */
    private static final C7541d f61110d = C7546e.m23568a(LazyThreadSafetyMode.NONE, C23161c.f61114a);

    /* renamed from: e */
    private static final C7541d f61111e = C7546e.m23568a(LazyThreadSafetyMode.NONE, C23160b.f61113a);

    /* renamed from: com.ss.android.ugc.aweme.b.j$a */
    static final class C23159a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C23159a f61112a = new C23159a();

        C23159a() {
            super(0);
        }

        /* renamed from: a */
        private static int m76079a() {
            return C32348g.m104915a();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m76079a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.j$b */
    static final class C23160b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C23160b f61113a = new C23160b();

        C23160b() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m76080a() {
            if (C23158j.f61108b.mo60299a() == 2) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m76080a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.j$c */
    static final class C23161c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C23161c f61114a = new C23161c();

        C23161c() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m76081a() {
            if (C23158j.f61108b.mo60299a() == 1) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m76081a());
        }
    }

    private C23158j() {
    }

    /* renamed from: a */
    public final int mo60299a() {
        return ((Number) f61109c.getValue()).intValue();
    }

    /* renamed from: b */
    public final boolean mo60300b() {
        return ((Boolean) f61110d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60301c() {
        return ((Boolean) f61111e.getValue()).booleanValue();
    }
}
