package com.p280ss.android.ugc.asve.recorder;

import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.vesdk.C45378w;
import com.p280ss.android.vesdk.C45378w.C45379a;
import com.p280ss.android.vesdk.VEAudioEncodeSettings;
import com.p280ss.android.vesdk.VEAudioEncodeSettings.C45170a;
import com.p280ss.android.vesdk.VESize;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.i */
public final class C20776i {
    /* renamed from: a */
    public static final VEAudioEncodeSettings m69340a() {
        VEAudioEncodeSettings a = new C45170a().mo107763a();
        C7573i.m23582a((Object) a, "VEAudioEncodeSettings\n  …pply {\n\n        }.Build()");
        return a;
    }

    /* renamed from: b */
    public static final C45378w m69342b(C15432h hVar) {
        C7573i.m23587b(hVar, "recorderContext");
        C45379a aVar = new C45379a();
        aVar.mo108609a(hVar.mo38934q());
        aVar.mo108611c(true);
        aVar.mo108612d(true);
        aVar.mo108613e(true);
        aVar.mo108610b(hVar.mo38925h());
        if (hVar.mo38930m().mo38917h().length == 2) {
            aVar.mo108608a(new VESize(hVar.mo38930m().mo38917h()[0], hVar.mo38930m().mo38917h()[1]));
        }
        aVar.mo108614f(hVar.mo38933p());
        C45378w wVar = aVar.f116894a;
        C7573i.m23582a((Object) wVar, "VEPreviewSettings\n      …Buffer)\n        }.build()");
        return wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.vesdk.VEVideoEncodeSettings m69341a(com.p280ss.android.ugc.asve.context.C15432h r5) {
        /*
            java.lang.String r0 = "recorderContext"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            com.ss.android.vesdk.VEVideoEncodeSettings$a r0 = new com.ss.android.vesdk.VEVideoEncodeSettings$a
            r1 = 1
            r0.<init>(r1)
            com.ss.android.ugc.asve.context.f r2 = r5.mo38927j()
            java.lang.String r2 = r2.mo38972c()
            com.ss.android.ugc.asve.context.f r3 = r5.mo38927j()
            java.lang.String r3 = r3.mo38971b()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r4 = 0
            if (r2 <= 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0037
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            com.ss.android.ugc.asve.context.d r2 = r5.mo38929l()
            boolean r2 = r2.mo38938d()
            r0.mo108168c(r2)
            kotlin.Pair r2 = r5.mo38922e()
            com.ss.android.ugc.asve.context.d r3 = r5.mo38929l()
            float r3 = r3.mo38937c()
            r4 = 1149239296(0x44800000, float:1024.0)
            float r3 = r3 * r4
            float r3 = r3 * r4
            int r3 = (int) r3
            r0.mo108164b(r3)
            com.ss.android.ugc.asve.context.d r3 = r5.mo38929l()
            com.ss.android.ugc.asve.constant.AS_ENCODE_PROFILE r3 = r3.mo38940f()
            com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_PROFILE r3 = com.p280ss.android.ugc.asve.constant.C15418l.m45063a(r3)
            r0.mo108155a(r3)
            com.ss.android.ugc.asve.context.d r3 = r5.mo38929l()
            int r3 = r3.mo38939e()
            r0.mo108169d(r3)
            java.lang.Object r3 = r2.getFirst()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r2.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 / 2
            goto L_0x0096
        L_0x008c:
            java.lang.Object r1 = r2.getSecond()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0096:
            r0.mo108149a(r3, r1)
            com.ss.android.ugc.asve.context.d r1 = r5.mo38929l()
            boolean r1 = r1.mo38941g()
            r0.mo108170d(r1)
            com.ss.android.ugc.asve.context.d r5 = r5.mo38929l()
            java.lang.String r5 = r5.mo38942h()
            r0.mo108165b(r5)
            com.ss.android.vesdk.VEVideoEncodeSettings r5 = r0.mo108162a()
            java.lang.String r0 = "VEVideoEncodeSettings\n  …iption)\n        }.build()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.C20776i.m69341a(com.ss.android.ugc.asve.context.h):com.ss.android.vesdk.VEVideoEncodeSettings");
    }
}
