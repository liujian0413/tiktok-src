package com.p280ss.android.ugc.aweme.p332ml;

import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.ml.o */
public final class C33586o {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f87684a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33586o.class), "TRACK_RANGE_N", "getTRACK_RANGE_N()I"))};

    /* renamed from: b */
    public static final C33586o f87685b = new C33586o();

    /* renamed from: c */
    private static final C7541d f87686c = C7546e.m23569a(C33587a.f87687a);

    /* renamed from: com.ss.android.ugc.aweme.ml.o$a */
    static final class C33587a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C33587a f87687a = new C33587a();

        C33587a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m108469a());
        }

        /* renamed from: a */
        private static int m108469a() {
            MLModel a = C7173g.m22395a("playtime_ml");
            if (a == null || a.params == null || a.params.length <= 0) {
                return 5;
            }
            return a.params[0];
        }
    }

    private C33586o() {
    }

    /* renamed from: a */
    public final int mo85915a() {
        return ((Number) f87686c.getValue()).intValue();
    }
}
