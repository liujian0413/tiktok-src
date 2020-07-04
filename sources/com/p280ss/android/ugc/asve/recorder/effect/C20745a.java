package com.p280ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.FaceBeautyInvoker;
import com.p280ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.p880b.C19623c;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20762d;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20852c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45404o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7506ac;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.a */
public final class C20745a implements C20749b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56022a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20745a.class), "slamDetectListenerMap", "getSlamDetectListenerMap()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private final C7541d f56023b = C7546e.m23569a(C20748c.f56028a);

    /* renamed from: d */
    private final C20762d f56024d = new C20762d(this.f56025e);

    /* renamed from: e */
    private final C19764d f56025e;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$a */
    static final class C20746a implements C19623c {

        /* renamed from: a */
        final /* synthetic */ C45404o f56026a;

        C20746a(C45404o oVar) {
            this.f56026a = oVar;
        }

        /* renamed from: a */
        public final void mo52206a(boolean z) {
            this.f56026a.mo56377a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$b */
    static final class C20747b implements EffectAlgorithmCallback {

        /* renamed from: a */
        final /* synthetic */ C45398i f56027a;

        C20747b(C45398i iVar) {
            this.f56027a = iVar;
        }

        public final void onResult(int[] iArr, long[] jArr, float f) {
            SparseArray sparseArray = new SparseArray();
            C7573i.m23582a((Object) iArr, "algorithmType");
            Iterator it = C7519g.m23439b(iArr).iterator();
            while (it.hasNext()) {
                int a = ((C7506ac) it).mo19392a();
                sparseArray.put(iArr[a], Long.valueOf(jArr[a]));
            }
            this.f56027a.mo56379a(sparseArray, f);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$c */
    static final class C20748c extends Lambda implements C7561a<HashMap<C45404o, C19623c>> {

        /* renamed from: a */
        public static final C20748c f56028a = new C20748c();

        C20748c() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<C45404o, C19623c> m69077a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m69077a();
        }
    }

    /* renamed from: f */
    private final HashMap<C45404o, C19623c> m68981f() {
        return (HashMap) this.f56023b.getValue();
    }

    /* renamed from: a */
    public final int mo56035a(int i, int i2) {
        return -1;
    }

    /* renamed from: e */
    public final void mo56111e(int i) {
    }

    /* renamed from: a */
    public final void mo56059a(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56025e.mo52983b(rVar);
    }

    /* renamed from: a */
    public final void mo56064a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f56025e.mo52947a(str, str2);
    }

    /* renamed from: a */
    public final void mo56061a(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        FaceBeautyInvoker.removeSlamDetectListener((C19623c) m68981f().get(oVar));
        m68981f().remove(oVar);
    }

    /* renamed from: b */
    public final void mo56086b(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        m68981f().put(oVar, new C20746a(oVar));
        FaceBeautyInvoker.addSlamDetectListener((C19623c) m68981f().get(oVar));
    }

    /* renamed from: a */
    public final void mo56053a(C1944a aVar) {
        this.f56025e.mo52932a(aVar);
    }

    /* renamed from: a */
    public final void mo56048a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        this.f56025e.mo52926a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56056a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "callback");
        this.f56025e.mo52934a(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo56075a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56025e.mo52958a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo56058a(C21062a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f56025e.mo52954a(true, C20852c.m69861b(aVar));
    }

    /* renamed from: a */
    public final void mo56071a(boolean z) {
        this.f56025e.mo53040k(z);
    }

    /* renamed from: b */
    public final void mo56090b(boolean z) {
        this.f56025e.mo53067y(z);
    }

    /* renamed from: a */
    public final void mo56046a(int i) {
        this.f56025e.mo53033i(i);
    }

    /* renamed from: a */
    public final void mo56057a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56025e.mo52941a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo56062a(String str) {
        this.f56025e.mo53026h(str);
    }

    /* renamed from: a */
    public final void mo56051a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56025e.mo52966b(context);
    }

    /* renamed from: a */
    public final void mo56072a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C7573i.m23587b(str2, "phoneParamPath");
        this.f56025e.mo52910a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo56073a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56025e.mo52911a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo56074a(double[] dArr, double d) {
        C7573i.m23587b(dArr, "wRbs");
        this.f56025e.mo52912a(dArr, d);
    }

    /* renamed from: a */
    public final void mo56044a(float f, float f2) {
        this.f56025e.mo52965b(f, f2);
    }

    /* renamed from: a */
    public final void mo56047a(int i, float f, float f2, int i2) {
        this.f56025e.mo52888a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo56045a(float f, float f2, float f3, float f4, float f5) {
        this.f56025e.mo52886a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo56063a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str2, "arg3");
        this.f56025e.mo52971b(str, i, i2, str2);
    }

    /* renamed from: b */
    public final void mo56087b(String str) {
        C7573i.m23587b(str, "language");
        this.f56025e.mo53020g(str);
    }

    /* renamed from: a */
    public final void mo56055a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "callback");
        this.f56025e.mo52897a(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo56054a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "callback");
        this.f56025e.mo52896a(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo56050a(int i, String str, float f, float f2) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56025e.mo52927a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo56049a(int i, String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56025e.mo52981b(i, str);
    }

    /* renamed from: a */
    public final void mo56070a(Map<Integer, Float> map) {
        C7573i.m23587b(map, "intensityDict");
        this.f56025e.mo52952a(map);
    }

    /* renamed from: a */
    public final void mo56067a(String str, Map<Integer, Float> map) {
        C7573i.m23587b(str, "resourcePath");
        C7573i.m23587b(map, "intensityDict");
        this.f56025e.mo52951a(str, map);
    }

    /* renamed from: b */
    public final void mo56088b(String str, float f) {
        C19764d dVar = this.f56025e;
        if (str == null) {
            str = "";
        }
        dVar.mo52984b(str, f);
    }

    /* renamed from: a */
    public final void mo56065a(String str, String str2, float f) {
        C19764d dVar = this.f56025e;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        dVar.mo52948a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo56066a(String str, String str2, float f, float f2, float f3) {
        C19764d dVar = this.f56025e;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "";
        }
        dVar.mo52949a(str3, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo56068a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56024d.mo56068a(list, i);
    }

    /* renamed from: b */
    public final void mo56089b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56024d.mo56089b(list, i);
    }

    /* renamed from: a */
    public final void mo56069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        this.f56024d.mo56069a(list, list2, i);
    }

    /* renamed from: a */
    public final void mo56052a(Context context, String str, String str2, String str3) {
        this.f56025e.mo52930a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo56060a(C45398i iVar) {
        C7573i.m23587b(iVar, "callback");
        this.f56025e.mo52933a((EffectAlgorithmCallback) new C20747b(iVar));
    }

    /* renamed from: b */
    public final void mo56085b(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56025e.mo52946a(rVar);
    }

    /* renamed from: c */
    public final void mo56092c() {
        this.f56025e.mo53062u();
    }

    /* renamed from: d */
    public final C20761c mo56102d() {
        return this.f56024d.mo56102d();
    }

    /* renamed from: e */
    public final void mo56109e() {
        this.f56025e.mo53059s();
    }

    /* renamed from: b */
    public final void mo56079b() {
        this.f56025e.mo53055r();
    }

    /* renamed from: a */
    public final void mo56040a() {
        this.f56024d.mo56040a();
    }

    /* renamed from: c */
    public final int mo56091c(float f) {
        return this.f56025e.mo53012f(f);
    }

    /* renamed from: d */
    public final int mo56100d(float f) {
        return this.f56025e.mo53018g(f);
    }

    /* renamed from: e */
    public final int mo56107e(float f) {
        return this.f56025e.mo53024h(f);
    }

    /* renamed from: f */
    public final int mo56113f(float f) {
        return this.f56025e.mo53030i(f);
    }

    /* renamed from: g */
    public final int mo56117g(float f) {
        return this.f56025e.mo53036j(f);
    }

    /* renamed from: h */
    public final void mo56121h(boolean z) {
        this.f56025e.f53657n = z;
    }

    /* renamed from: i */
    public final void mo56122i(boolean z) {
        this.f56025e.mo53065w(z);
    }

    /* renamed from: j */
    public final boolean mo56123j(boolean z) {
        return this.f56025e.mo53046m(z);
    }

    /* renamed from: k */
    public final void mo56124k(boolean z) {
        this.f56025e.mo53052p(z);
    }

    /* renamed from: l */
    public final void mo56125l(boolean z) {
        this.f56025e.mo53054q(z);
    }

    /* renamed from: m */
    public final void mo56126m(boolean z) {
        this.f56025e.mo53056r(z);
    }

    /* renamed from: n */
    public final void mo56127n(boolean z) {
        this.f56024d.mo56127n(z);
    }

    /* renamed from: a */
    public final int mo56036a(Bitmap bitmap) {
        return this.f56025e.mo52892a(bitmap);
    }

    /* renamed from: d */
    public final int mo56101d(String str) {
        C7573i.m23587b(str, "strResPath");
        return this.f56025e.mo52969b(str);
    }

    /* renamed from: e */
    public final int mo56108e(String str) {
        C7573i.m23587b(str, "strRes");
        return this.f56025e.mo52989c(str);
    }

    /* renamed from: g */
    public final void mo56118g(String str) {
        C19764d dVar = this.f56025e;
        if (str == null) {
            str = "";
        }
        dVar.mo53008e(str);
    }

    /* renamed from: h */
    public final float mo56120h(String str) {
        C7573i.m23587b(str, "filterPath");
        return this.f56025e.mo53011f(str);
    }

    public C20745a(C19764d dVar) {
        C7573i.m23587b(dVar, "mediaRecordPresenter");
        this.f56025e = dVar;
    }

    /* renamed from: f */
    public final int mo56114f(String str) {
        C7573i.m23587b(str, "resourcePath");
        return this.f56025e.mo52998d(str);
    }

    /* renamed from: g */
    public final void mo56119g(boolean z) {
        this.f56025e.mo53064v(z);
    }

    /* renamed from: c */
    public final void mo56095c(int i) {
        this.f56025e.mo53022g(i);
    }

    /* renamed from: d */
    public final void mo56104d(int i) {
        this.f56025e.mo53028h(i);
    }

    /* renamed from: e */
    public final void mo56112e(boolean z) {
        this.f56025e.mo53061t(z);
    }

    /* renamed from: f */
    public final void mo56116f(boolean z) {
        this.f56025e.mo53063u(z);
    }

    /* renamed from: b */
    public final void mo56081b(float f) {
        this.f56025e.mo53006e(f);
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
        this.f56025e.mo52977b(d);
    }

    /* renamed from: d */
    public final void mo56106d(boolean z) {
        this.f56025e.mo53058s(z);
    }

    /* renamed from: b */
    public final void mo56083b(int i) {
        this.f56025e.mo52993c(i);
    }

    /* renamed from: c */
    public final void mo56098c(boolean z) {
        this.f56025e.mo53068z(z);
    }

    /* renamed from: a */
    public final void mo56043a(float f) {
        this.f56025e.mo52999d(f);
    }

    /* renamed from: b */
    public final void mo56084b(Context context) {
        C7573i.m23587b(context, "context");
        this.f56025e.mo52928a(context);
    }

    /* renamed from: a */
    public final int mo56034a(int i, float f) {
        return this.f56025e.mo52887a(i, f);
    }

    /* renamed from: a */
    public final int mo56037a(String str, float f) {
        C7573i.m23587b(str, "strRes");
        return this.f56025e.mo52900a(str, f);
    }

    /* renamed from: b */
    public final int mo56078b(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "imagePath");
        return this.f56025e.mo52990c(str, str2);
    }

    /* renamed from: c */
    public final void mo56094c(float f, float f2) {
        this.f56025e.mo52997d(f, f2);
    }

    /* renamed from: d */
    public final void mo56103d(float f, float f2) {
        this.f56025e.mo53004e(f, f2);
    }

    /* renamed from: e */
    public final void mo56110e(float f, float f2) {
        this.f56025e.mo53013f(f, f2);
    }

    /* renamed from: f */
    public final void mo56115f(float f, float f2) {
        this.f56025e.mo52921a(f, f2);
    }

    /* renamed from: d */
    public final void mo56105d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56024d.mo56105d(list, i);
    }

    /* renamed from: b */
    public final void mo56082b(float f, float f2) {
        this.f56025e.mo52987c(f, f2);
    }

    /* renamed from: c */
    public final void mo56097c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56024d.mo56097c(list, i);
    }

    /* renamed from: c */
    public final int[] mo56099c(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "nodeKey");
        int[] b = this.f56025e.mo52985b(str, str2);
        C7573i.m23582a((Object) b, "mediaRecordPresenter.che…lusion(nodePath, nodeKey)");
        return b;
    }

    /* renamed from: b */
    public final int mo56076b(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56025e.mo52970b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo56038a(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56025e.mo52901a(str, f, f2);
    }

    /* renamed from: b */
    public final int mo56077b(String str, int i, int i2, String str2) {
        return this.f56025e.mo52902a(str, i, i2, str2);
    }

    /* renamed from: c */
    public final void mo56093c(double d, double d2, double d3, double d4) {
        this.f56025e.mo52986c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo56039a(String str, int i, int i2, boolean z) {
        return this.f56025e.mo52903a(str, i, i2, z);
    }

    /* renamed from: b */
    public final void mo56080b(double d, double d2, double d3, double d4) {
        this.f56025e.mo52964b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo56042a(double d, double d2, double d3, double d4) {
        this.f56025e.mo52883a(d, d2, d3, d4);
    }
}
