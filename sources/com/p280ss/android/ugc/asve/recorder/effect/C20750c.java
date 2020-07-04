package com.p280ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20763e;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20852c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z;
import com.p280ss.android.vesdk.C45382z.C45392d;
import com.p280ss.android.vesdk.C45382z.C45397h;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.p280ss.android.vesdk.VECherEffectParam;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.c */
public final class C20750c implements C20749b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56029a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20750c.class), "recorderComposer", "getRecorderComposer()Lcom/ss/android/ugc/asve/recorder/effect/composer/VERecorderComposer;"))};

    /* renamed from: b */
    public final C45382z f56030b;

    /* renamed from: d */
    private final C7541d f56031d = C7546e.m23569a(new C20751a(this));

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$a */
    static final class C20751a extends Lambda implements C7561a<C20763e> {

        /* renamed from: a */
        final /* synthetic */ C20750c f56032a;

        C20751a(C20750c cVar) {
            this.f56032a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C20763e invoke() {
            return new C20763e(this.f56032a.f56030b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$b */
    static final class C20752b implements C45397h {

        /* renamed from: a */
        final /* synthetic */ OnCherEffectParmaCallback f56033a;

        C20752b(OnCherEffectParmaCallback onCherEffectParmaCallback) {
            this.f56033a = onCherEffectParmaCallback;
        }

        /* renamed from: a */
        public final void mo56128a(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f56033a.onCherEffect(strArr, dArr, zArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$c */
    public static final class C20753c implements C45392d {

        /* renamed from: a */
        final /* synthetic */ OnARTextCountCallback f56034a;

        /* renamed from: a */
        public final void mo56130a(String[] strArr) {
        }

        C20753c(OnARTextCountCallback onARTextCountCallback) {
            this.f56034a = onARTextCountCallback;
        }

        /* renamed from: a */
        public final void mo56129a(int i) {
            this.f56034a.onResult(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$d */
    public static final class C20754d implements C45392d {

        /* renamed from: a */
        final /* synthetic */ OnARTextContentCallback f56035a;

        /* renamed from: a */
        public final void mo56129a(int i) {
        }

        C20754d(OnARTextContentCallback onARTextContentCallback) {
            this.f56035a = onARTextContentCallback;
        }

        /* renamed from: a */
        public final void mo56130a(String[] strArr) {
            this.f56035a.onResult(strArr);
        }
    }

    /* renamed from: f */
    private final C20763e m69164f() {
        return (C20763e) this.f56031d.getValue();
    }

    /* renamed from: a */
    public final int mo56035a(int i, int i2) {
        return -1;
    }

    /* renamed from: a */
    public final void mo56071a(boolean z) {
    }

    /* renamed from: b */
    public final void mo56083b(int i) {
    }

    /* renamed from: b */
    public final void mo56084b(Context context) {
        C7573i.m23587b(context, "context");
    }

    /* renamed from: e */
    public final void mo56111e(int i) {
    }

    /* renamed from: b */
    public final void mo56088b(String str, float f) {
        this.f56030b.mo108628a(str, f);
    }

    /* renamed from: a */
    public final void mo56066a(String str, String str2, float f, float f2, float f3) {
        this.f56030b.mo108675a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo56050a(int i, String str, float f, float f2) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        mo56049a(i, str);
        mo56115f(f, f2);
    }

    /* renamed from: a */
    public final void mo56049a(int i, String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56030b.mo108621a(i, str);
    }

    /* renamed from: a */
    public final void mo56070a(Map<Integer, Float> map) {
        C7573i.m23587b(map, "intensityDict");
        this.f56030b.mo108635a(map);
    }

    /* renamed from: a */
    public final void mo56067a(String str, Map<Integer, Float> map) {
        C7573i.m23587b(str, "resourcePath");
        C7573i.m23587b(map, "intensityDict");
        this.f56030b.mo108633a(str, map);
    }

    /* renamed from: a */
    public final void mo56065a(String str, String str2, float f) {
        this.f56030b.mo108674a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo56052a(Context context, String str, String str2, String str3) {
        this.f56030b.mo108676a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo56061a(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        this.f56030b.mo108699b(oVar);
    }

    /* renamed from: b */
    public final void mo56086b(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        this.f56030b.mo108670a(oVar);
    }

    /* renamed from: a */
    public final void mo56072a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C7573i.m23587b(str2, "phoneParamPath");
        this.f56030b.mo108636a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo56073a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56030b.mo108637a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo56074a(double[] dArr, double d) {
        C7573i.m23587b(dArr, "wRbs");
        this.f56030b.mo108638a(dArr, d);
    }

    /* renamed from: a */
    public final void mo56044a(float f, float f2) {
        this.f56030b.mo108704c(f, f2);
    }

    /* renamed from: a */
    public final void mo56047a(int i, float f, float f2, int i2) {
        this.f56030b.mo108620a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo56045a(float f, float f2, float f3, float f4, float f5) {
        this.f56030b.mo108618a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo56063a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str2, "arg3");
        this.f56030b.mo108690b(str, i, i2, str2);
    }

    /* renamed from: b */
    public final void mo56087b(String str) {
        C7573i.m23587b(str, "language");
        this.f56030b.mo108721f(str);
    }

    /* renamed from: a */
    public final void mo56055a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "callback");
        this.f56030b.mo108626a((C45392d) new C20753c(onARTextCountCallback));
    }

    /* renamed from: a */
    public final void mo56054a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "callback");
        this.f56030b.mo108688b((C45392d) new C20754d(onARTextContentCallback));
    }

    /* renamed from: a */
    public final void mo56051a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56030b.mo108747s(true);
    }

    /* renamed from: a */
    public final void mo56057a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56030b.mo108654a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo56062a(String str) {
        this.f56030b.mo108724g(str);
    }

    /* renamed from: a */
    public final void mo56060a(C45398i iVar) {
        C7573i.m23587b(iVar, "callback");
        this.f56030b.mo108668a(iVar);
    }

    /* renamed from: a */
    public final void mo56056a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "callback");
        this.f56030b.mo108667a((C45397h) new C20752b(onCherEffectParmaCallback));
    }

    /* renamed from: a */
    public final void mo56075a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56030b.mo108656a(new VECherEffectParam(strArr, dArr, zArr));
    }

    /* renamed from: a */
    public final void mo56058a(C21062a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f56030b.mo108669a(C20852c.m69862c(aVar));
    }

    /* renamed from: b */
    public final void mo56090b(boolean z) {
        this.f56030b.mo108749u(z);
    }

    /* renamed from: a */
    public final void mo56046a(int i) {
        this.f56030b.mo108708c(i);
    }

    /* renamed from: a */
    public final void mo56048a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        this.f56030b.mo108649a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56053a(C1944a aVar) {
        this.f56030b.mo108653a(aVar);
    }

    /* renamed from: a */
    public final void mo56064a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f56030b.mo108673a(str, str2);
    }

    /* renamed from: a */
    public final void mo56059a(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56030b.mo108698b(rVar);
    }

    /* renamed from: a */
    public final void mo56068a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        m69164f().mo56068a(list, i);
    }

    /* renamed from: b */
    public final void mo56089b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        m69164f().mo56089b(list, i);
    }

    /* renamed from: a */
    public final void mo56069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        m69164f().mo56069a(list, list2, i);
    }

    /* renamed from: e */
    public final void mo56109e() {
        this.f56030b.mo108743p();
    }

    /* renamed from: c */
    public final void mo56092c() {
        this.f56030b.mo108747s(false);
    }

    /* renamed from: d */
    public final C20761c mo56102d() {
        return m69164f().mo56102d();
    }

    /* renamed from: b */
    public final void mo56079b() {
        this.f56030b.mo108740o();
    }

    /* renamed from: a */
    public final void mo56040a() {
        m69164f().mo56040a();
    }

    /* renamed from: c */
    public final int mo56091c(float f) {
        return this.f56030b.mo108619a(4, f);
    }

    /* renamed from: d */
    public final int mo56100d(float f) {
        return this.f56030b.mo108619a(5, f);
    }

    /* renamed from: g */
    public final int mo56117g(float f) {
        return this.f56030b.mo108686b(f);
    }

    /* renamed from: h */
    public final void mo56121h(boolean z) {
        this.f56030b.mo108741o(z);
    }

    /* renamed from: i */
    public final void mo56122i(boolean z) {
        this.f56030b.mo108735l(z);
    }

    /* renamed from: j */
    public final boolean mo56123j(boolean z) {
        return this.f56030b.mo108733k(z);
    }

    /* renamed from: k */
    public final void mo56124k(boolean z) {
        this.f56030b.mo108731j(z);
    }

    /* renamed from: l */
    public final void mo56125l(boolean z) {
        this.f56030b.mo108727h(z);
    }

    /* renamed from: m */
    public final void mo56126m(boolean z) {
        this.f56030b.mo108729i(z);
    }

    /* renamed from: n */
    public final void mo56127n(boolean z) {
        m69164f().mo56127n(z);
    }

    /* renamed from: a */
    public final int mo56036a(Bitmap bitmap) {
        return this.f56030b.mo108622a(bitmap);
    }

    /* renamed from: d */
    public final int mo56101d(String str) {
        C7573i.m23587b(str, "strResPath");
        return this.f56030b.mo108713d(str);
    }

    /* renamed from: e */
    public final int mo56107e(float f) {
        return this.f56030b.mo108619a(17, f);
    }

    /* renamed from: g */
    public final void mo56118g(String str) {
        this.f56030b.mo108627a(str);
    }

    /* renamed from: h */
    public final float mo56120h(String str) {
        C7573i.m23587b(str, "filterPath");
        return this.f56030b.mo108684b(str);
    }

    public C20750c(C45382z zVar) {
        C7573i.m23587b(zVar, "recoder");
        this.f56030b = zVar;
    }

    /* renamed from: e */
    public final int mo56108e(String str) {
        C7573i.m23587b(str, "strRes");
        return this.f56030b.mo108717e(str);
    }

    /* renamed from: f */
    public final int mo56113f(float f) {
        return this.f56030b.mo108619a(18, f);
    }

    /* renamed from: g */
    public final void mo56119g(boolean z) {
        this.f56030b.mo108739n(z);
    }

    /* renamed from: f */
    public final int mo56114f(String str) {
        C7573i.m23587b(str, "resourcePath");
        return this.f56030b.mo108706c(str);
    }

    /* renamed from: c */
    public final void mo56095c(int i) {
        this.f56030b.mo108695b(i);
    }

    /* renamed from: d */
    public final void mo56104d(int i) {
        this.f56030b.mo108646a(i);
    }

    /* renamed from: e */
    public final void mo56112e(boolean z) {
        this.f56030b.mo108745q(z);
    }

    /* renamed from: f */
    public final void mo56116f(boolean z) {
        this.f56030b.mo108746r(z);
    }

    /* renamed from: b */
    public final void mo56081b(float f) {
        this.f56030b.mo108619a(1, f);
    }

    /* renamed from: c */
    public final void mo56096c(String str) {
        boolean z;
        int i;
        C7573i.m23587b(str, "strBeautyFaceRes");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        mo56049a(i, str);
    }

    /* renamed from: a */
    public final void mo56041a(double d) {
        this.f56030b.mo108642a(d);
    }

    /* renamed from: d */
    public final void mo56106d(boolean z) {
        this.f56030b.mo108742p(z);
    }

    /* renamed from: c */
    public final void mo56098c(boolean z) {
        this.f56030b.mo108748t(z);
    }

    /* renamed from: a */
    public final void mo56043a(float f) {
        this.f56030b.mo108619a(2, f);
    }

    /* renamed from: b */
    public final void mo56085b(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56030b.mo108664a(rVar);
    }

    /* renamed from: a */
    public final int mo56034a(int i, float f) {
        return this.f56030b.mo108619a(i, f);
    }

    /* renamed from: f */
    public final void mo56115f(float f, float f2) {
        this.f56030b.mo108617a(f, f2);
    }

    /* renamed from: a */
    public final int mo56037a(String str, float f) {
        C7573i.m23587b(str, "strRes");
        return this.f56030b.mo108629a(str, f, f);
    }

    /* renamed from: b */
    public final int mo56078b(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "imagePath");
        return this.f56030b.mo108707c(str, str2);
    }

    /* renamed from: c */
    public final void mo56094c(float f, float f2) {
        this.f56030b.mo108712d(f, f2);
    }

    /* renamed from: d */
    public final void mo56103d(float f, float f2) {
        this.f56030b.mo108716e(f, f2);
    }

    /* renamed from: e */
    public final void mo56110e(float f, float f2) {
        this.f56030b.mo108720f(f, f2);
    }

    /* renamed from: d */
    public final void mo56105d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        m69164f().mo56105d(list, i);
    }

    /* renamed from: b */
    public final void mo56082b(float f, float f2) {
        this.f56030b.mo108687b(f, f2);
    }

    /* renamed from: c */
    public final void mo56097c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        m69164f().mo56097c(list, i);
    }

    /* renamed from: c */
    public final int[] mo56099c(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "nodeKey");
        int[] b = this.f56030b.mo108702b(str, str2);
        C7573i.m23582a((Object) b, "recoder.checkComposerNod…lusion(nodePath, nodeKey)");
        return b;
    }

    /* renamed from: b */
    public final int mo56076b(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56030b.mo108689b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo56038a(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56030b.mo108629a(str, f, f2);
    }

    /* renamed from: b */
    public final int mo56077b(String str, int i, int i2, String str2) {
        return this.f56030b.mo108631a(str, i, i2, str2);
    }

    /* renamed from: c */
    public final void mo56093c(double d, double d2, double d3, double d4) {
        this.f56030b.mo108703c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo56039a(String str, int i, int i2, boolean z) {
        return this.f56030b.mo108632a(str, i, i2, z);
    }

    /* renamed from: b */
    public final void mo56080b(double d, double d2, double d3, double d4) {
        this.f56030b.mo108685b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo56042a(double d, double d2, double d3, double d4) {
        this.f56030b.mo108615a(d, d2, d3, d4);
    }
}
