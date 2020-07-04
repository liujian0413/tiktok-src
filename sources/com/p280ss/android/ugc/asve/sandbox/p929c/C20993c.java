package com.p280ss.android.ugc.asve.sandbox.p929c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21020e;
import com.p280ss.android.ugc.asve.sandbox.C21032i;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20852c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x.C20975a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z.C20981a;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45404o;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.c */
public final class C20993c implements C20749b {

    /* renamed from: a */
    private final Map<C45404o, C20974x> f56435a = new LinkedHashMap();

    /* renamed from: b */
    private C45398i f56436b;

    /* renamed from: d */
    private C21062a f56437d;

    /* renamed from: e */
    private final C21032i f56438e;

    /* renamed from: f */
    private OnARTextCountCallback f56439f;

    /* renamed from: g */
    private OnARTextContentCallback f56440g;

    /* renamed from: h */
    private IStickerRequestCallback f56441h;

    /* renamed from: i */
    private OnCherEffectParmaCallback f56442i;

    /* renamed from: j */
    private C1944a f56443j;

    /* renamed from: k */
    private final Map<C45336r, C20980z> f56444k;

    /* renamed from: b */
    public final void mo56084b(Context context) {
        C7573i.m23587b(context, "context");
    }

    /* renamed from: a */
    public final void mo56052a(Context context, String str, String str2, String str3) {
        this.f56438e.mo56587a(str, str2, str3);
    }

    /* renamed from: b */
    public final void mo56088b(String str, float f) {
        this.f56438e.mo56607b(str, f);
    }

    /* renamed from: a */
    public final void mo56066a(String str, String str2, float f, float f2, float f3) {
        this.f56438e.mo56586a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo56061a(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        C20974x xVar = (C20974x) this.f56435a.get(oVar);
        if (xVar != null) {
            this.f56438e.mo56580a(xVar);
            this.f56435a.remove(oVar);
        }
    }

    /* renamed from: b */
    public final void mo56086b(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        if (this.f56435a.get(oVar) != null) {
            this.f56438e.mo56605b((C20974x) this.f56435a.get(oVar));
            return;
        }
        C20975a a = C20852c.m69848a(oVar);
        this.f56435a.put(oVar, a);
        this.f56438e.mo56605b((C20974x) a);
    }

    /* renamed from: a */
    public final void mo56063a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str2, "arg3");
        this.f56438e.mo56584a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo56060a(C45398i iVar) {
        C7573i.m23587b(iVar, "callback");
        this.f56436b = iVar;
        this.f56438e.mo56576a((C20953q) C20852c.m69844a(iVar));
    }

    /* renamed from: a */
    public final void mo56058a(C21062a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f56437d = aVar;
        this.f56438e.mo56577a((C20959s) C20852c.m69845a(aVar));
    }

    /* renamed from: a */
    public final void mo56050a(int i, String str, float f, float f2) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56438e.mo56573a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo56049a(int i, String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56438e.mo56572a(i, str);
    }

    /* renamed from: a */
    public final void mo56043a(float f) {
        this.f56438e.mo56566a(f);
    }

    /* renamed from: a */
    public final void mo56070a(Map<Integer, Float> map) {
        C7573i.m23587b(map, "intensityDict");
        this.f56438e.mo56591a((Map) map);
    }

    /* renamed from: a */
    public final void mo56067a(String str, Map<Integer, Float> map) {
        C7573i.m23587b(str, "resourcePath");
        C7573i.m23587b(map, "intensityDict");
        this.f56438e.mo56588a(str, (Map) map);
    }

    /* renamed from: a */
    public final void mo56065a(String str, String str2, float f) {
        this.f56438e.mo56585a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo56072a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C7573i.m23587b(str2, "phoneParamPath");
        this.f56438e.mo56592a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo56073a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56438e.mo56593a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo56074a(double[] dArr, double d) {
        C7573i.m23587b(dArr, "wRbs");
        this.f56438e.mo56594a(dArr, d);
    }

    /* renamed from: a */
    public final void mo56044a(float f, float f2) {
        this.f56438e.mo56603b(f, f2);
    }

    /* renamed from: a */
    public final void mo56047a(int i, float f, float f2, int i2) {
        this.f56438e.mo56570a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo56045a(float f, float f2, float f3, float f4, float f5) {
        this.f56438e.mo56568a(f, f2, f3, f4, f5);
    }

    /* renamed from: b */
    public final void mo56087b(String str) {
        C7573i.m23587b(str, "language");
        this.f56438e.mo56641g(str);
    }

    /* renamed from: a */
    public final void mo56055a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "callback");
        this.f56439f = onARTextCountCallback;
        this.f56438e.mo56579a((C20971w) C20852c.m69847a(onARTextCountCallback));
    }

    /* renamed from: a */
    public final void mo56054a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "callback");
        this.f56440g = onARTextContentCallback;
        this.f56438e.mo56574a((C20902a) C20852c.m69841a(onARTextContentCallback));
    }

    /* renamed from: a */
    public final void mo56051a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56438e.mo56629e();
    }

    /* renamed from: a */
    public final void mo56057a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56441h = iStickerRequestCallback;
        this.f56438e.mo56581a((C20977y) iStickerRequestCallback != null ? C20852c.m69849a(iStickerRequestCallback) : null);
    }

    /* renamed from: a */
    public final void mo56062a(String str) {
        this.f56438e.mo56643h(str);
    }

    /* renamed from: a */
    public final void mo56056a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "callback");
        this.f56442i = onCherEffectParmaCallback;
        this.f56438e.mo56575a((C20947o) C20852c.m69843a(onCherEffectParmaCallback));
    }

    /* renamed from: a */
    public final void mo56075a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56438e.mo56595a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo56071a(boolean z) {
        this.f56438e.mo56647k(z);
    }

    /* renamed from: b */
    public final void mo56090b(boolean z) {
        this.f56438e.mo56648l(z);
    }

    /* renamed from: a */
    public final void mo56046a(int i) {
        this.f56438e.mo56636f(i);
    }

    /* renamed from: a */
    public final void mo56048a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        this.f56438e.mo56571a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56053a(C1944a aVar) {
        this.f56443j = aVar;
        this.f56438e.mo56578a((C20968v) aVar != null ? C20852c.m69846a(aVar) : null);
    }

    /* renamed from: a */
    public final void mo56064a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f56438e.mo56608b(str, str2);
    }

    /* renamed from: b */
    public final void mo56085b(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        if (this.f56444k.get(rVar) != null) {
            this.f56438e.mo56582a((C20980z) this.f56444k.get(rVar));
            return;
        }
        C20981a a = C20852c.m69850a(rVar);
        this.f56444k.put(rVar, a);
        this.f56438e.mo56582a((C20980z) a);
    }

    /* renamed from: a */
    public final void mo56059a(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        if (((C20980z) this.f56444k.get(rVar)) != null) {
            this.f56438e.mo56606b((C20980z) this.f56444k.get(rVar));
            this.f56444k.remove(rVar);
        }
    }

    /* renamed from: a */
    public final void mo56068a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56438e.mo56589a(list, i);
    }

    /* renamed from: b */
    public final void mo56089b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56438e.mo56609b(list, i);
    }

    /* renamed from: a */
    public final void mo56069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        this.f56438e.mo56590a(list, list2, i);
    }

    /* renamed from: c */
    public final void mo56092c() {
        this.f56438e.mo56600b();
    }

    /* renamed from: d */
    public final C20761c mo56102d() {
        C21020e g = this.f56438e.mo56640g();
        if (g == null) {
            g = C20852c.m69851a();
        }
        return C20852c.m69840a(g);
    }

    /* renamed from: e */
    public final void mo56109e() {
        this.f56438e.mo56613c();
    }

    /* renamed from: f */
    public final void mo56498f() {
        this.f56444k.clear();
        this.f56435a.clear();
        this.f56439f = null;
        this.f56441h = null;
        this.f56436b = null;
        this.f56442i = null;
        this.f56443j = null;
        this.f56437d = null;
        this.f56440g = null;
    }

    /* renamed from: b */
    public final void mo56079b() {
        this.f56438e.mo56622d();
    }

    /* renamed from: a */
    public final void mo56040a() {
        this.f56438e.mo56634f();
    }

    /* renamed from: c */
    public final int mo56091c(float f) {
        return this.f56438e.mo56611c(f);
    }

    /* renamed from: d */
    public final int mo56100d(float f) {
        return this.f56438e.mo56620d(f);
    }

    /* renamed from: e */
    public final int mo56107e(float f) {
        return this.f56438e.mo56628e(f);
    }

    /* renamed from: f */
    public final int mo56113f(float f) {
        return this.f56438e.mo56633f(f);
    }

    /* renamed from: g */
    public final int mo56117g(float f) {
        return this.f56438e.mo56639g(f);
    }

    /* renamed from: h */
    public final void mo56121h(boolean z) {
        this.f56438e.mo56645i(z);
    }

    /* renamed from: i */
    public final void mo56122i(boolean z) {
        this.f56438e.mo56646j(z);
    }

    /* renamed from: j */
    public final boolean mo56123j(boolean z) {
        return this.f56438e.mo56596a(z);
    }

    /* renamed from: k */
    public final void mo56124k(boolean z) {
        this.f56438e.mo56610b(z);
    }

    /* renamed from: l */
    public final void mo56125l(boolean z) {
        this.f56438e.mo56618c(z);
    }

    /* renamed from: m */
    public final void mo56126m(boolean z) {
        this.f56438e.mo56626d(z);
    }

    /* renamed from: n */
    public final void mo56127n(boolean z) {
        this.f56438e.mo56650n(z);
    }

    /* renamed from: d */
    public final int mo56101d(String str) {
        C7573i.m23587b(str, "strResPath");
        return this.f56438e.mo56597b(str);
    }

    /* renamed from: e */
    public final int mo56108e(String str) {
        C7573i.m23587b(str, "strRes");
        return this.f56438e.mo56612c(str);
    }

    /* renamed from: f */
    public final int mo56114f(String str) {
        C7573i.m23587b(str, "resourcePath");
        return this.f56438e.mo56621d(str);
    }

    /* renamed from: g */
    public final void mo56118g(String str) {
        this.f56438e.mo56637f(str);
    }

    /* renamed from: h */
    public final float mo56120h(String str) {
        C7573i.m23587b(str, "filterPath");
        return this.f56438e.mo56627e(str);
    }

    /* renamed from: a */
    public final int mo56036a(Bitmap bitmap) {
        return this.f56438e.mo56558a(bitmap);
    }

    /* renamed from: g */
    public final void mo56119g(boolean z) {
        this.f56438e.mo56644h(z);
    }

    public C20993c(C21032i iVar) {
        Object newProxyInstance = Proxy.newProxyInstance(C21032i.class.getClassLoader(), new Class[]{C21032i.class}, new C20996d(iVar));
        if (newProxyInstance != null) {
            this.f56438e = (C21032i) newProxyInstance;
            this.f56444k = new LinkedHashMap();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
    }

    /* renamed from: c */
    public final void mo56095c(int i) {
        this.f56438e.mo56604b(i);
    }

    /* renamed from: d */
    public final void mo56104d(int i) {
        this.f56438e.mo56616c(i);
    }

    /* renamed from: e */
    public final void mo56111e(int i) {
        this.f56438e.mo56569a(i);
    }

    /* renamed from: f */
    public final void mo56116f(boolean z) {
        this.f56438e.mo56642g(z);
    }

    /* renamed from: b */
    public final void mo56081b(float f) {
        this.f56438e.mo56602b(f);
    }

    /* renamed from: c */
    public final void mo56096c(String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56438e.mo56583a(str);
    }

    /* renamed from: e */
    public final void mo56112e(boolean z) {
        this.f56438e.mo56638f(z);
    }

    /* renamed from: d */
    public final void mo56106d(boolean z) {
        this.f56438e.mo56632e(z);
    }

    /* renamed from: a */
    public final void mo56041a(double d) {
        this.f56438e.mo56564a(d);
    }

    /* renamed from: b */
    public final void mo56083b(int i) {
        this.f56438e.mo56624d(i);
    }

    /* renamed from: c */
    public final void mo56098c(boolean z) {
        this.f56438e.mo56649m(z);
    }

    /* renamed from: a */
    public final int mo56034a(int i, float f) {
        return this.f56438e.mo56556a(i, f);
    }

    /* renamed from: a */
    public final int mo56035a(int i, int i2) {
        return this.f56438e.mo56557a(i, i2);
    }

    /* renamed from: b */
    public final int mo56078b(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "imagePath");
        return this.f56438e.mo56562a(str, str2);
    }

    /* renamed from: a */
    public final int mo56037a(String str, float f) {
        C7573i.m23587b(str, "strRes");
        return this.f56438e.mo56559a(str, f);
    }

    /* renamed from: c */
    public final void mo56094c(float f, float f2) {
        this.f56438e.mo56623d(f, f2);
    }

    /* renamed from: d */
    public final void mo56103d(float f, float f2) {
        this.f56438e.mo56630e(f, f2);
    }

    /* renamed from: e */
    public final void mo56110e(float f, float f2) {
        this.f56438e.mo56635f(f, f2);
    }

    /* renamed from: f */
    public final void mo56115f(float f, float f2) {
        this.f56438e.mo56567a(f, f2);
    }

    /* renamed from: d */
    public final void mo56105d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56438e.mo56617c(list, i);
    }

    /* renamed from: b */
    public final void mo56082b(float f, float f2) {
        this.f56438e.mo56615c(f, f2);
    }

    /* renamed from: c */
    public final void mo56097c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56438e.mo56625d(list, i);
    }

    /* renamed from: c */
    public final int[] mo56099c(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "nodeKey");
        int[] c = this.f56438e.mo56619c(str, str2);
        C7573i.m23582a((Object) c, "safeRemoteEffectControll…lusion(nodePath, nodeKey)");
        return c;
    }

    /* renamed from: b */
    public final int mo56076b(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56438e.mo56598b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo56038a(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56438e.mo56560a(str, f, f2);
    }

    /* renamed from: b */
    public final int mo56077b(String str, int i, int i2, String str2) {
        return this.f56438e.mo56599b(str, i, i2, str2);
    }

    /* renamed from: c */
    public final void mo56093c(double d, double d2, double d3, double d4) {
        this.f56438e.mo56614c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo56080b(double d, double d2, double d3, double d4) {
        this.f56438e.mo56601b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo56039a(String str, int i, int i2, boolean z) {
        return this.f56438e.mo56561a(str, i, i2, z);
    }

    /* renamed from: a */
    public final void mo56042a(double d, double d2, double d3, double d4) {
        this.f56438e.mo56565a(d, d2, d3, d4);
    }
}
