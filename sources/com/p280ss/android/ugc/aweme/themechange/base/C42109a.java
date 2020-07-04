package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.a */
public final class C42109a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109608a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42109a.class), "TEX_VIEW_WIDTH", "getTEX_VIEW_WIDTH()F"))};

    /* renamed from: b */
    public static final C42109a f109609b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int f109610c = C39805en.m127447b(C35574k.m114861b());

    /* renamed from: d */
    private static final float f109611d = C9738o.m28708b((Context) C35574k.m114861b(), 12.0f);

    /* renamed from: e */
    private static final float f109612e = C9738o.m28708b((Context) C35574k.m114861b(), 20.0f);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final float f109613f = C9738o.m28708b((Context) C35574k.m114861b(), 56.0f);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final float f109614g = C9738o.m28708b((Context) C35574k.m114861b(), 80.0f);

    /* renamed from: h */
    private static final C7541d f109615h = C7546e.m23569a(C42110a.f109617a);

    /* renamed from: i */
    private static final float f109616i;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.a$a */
    static final class C42110a extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        public static final C42110a f109617a = new C42110a();

        C42110a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m134047a());
        }

        /* renamed from: a */
        private static float m134047a() {
            double a = (double) ((((float) C42109a.f109610c) - C42109a.m134042b()) - (C42109a.m134040a() * 5.0f));
            Double.isNaN(a);
            float f = (float) (a / 5.3d);
            if (f < C42109a.f109613f) {
                return C42109a.f109613f;
            }
            if (f > C42109a.f109614g) {
                return C42109a.f109614g;
            }
            return f;
        }
    }

    private C42109a() {
    }

    /* renamed from: a */
    public static float m134040a() {
        return f109611d;
    }

    /* renamed from: b */
    public static float m134042b() {
        return f109612e;
    }

    /* renamed from: d */
    public static float m134045d() {
        return f109616i;
    }

    /* renamed from: c */
    public final float mo103540c() {
        return ((Number) f109615h.getValue()).floatValue();
    }

    static {
        C42109a aVar = new C42109a();
        f109609b = aVar;
        f109616i = aVar.mo103540c() + f109611d;
    }
}
