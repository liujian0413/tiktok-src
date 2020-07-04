package com.p280ss.android.ugc.asve.sandbox.p930d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.sandbox.C21020e;
import com.p280ss.android.ugc.asve.sandbox.C21032i.C21033a;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20852c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20902a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20947o;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20959s;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20968v;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20971w;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45404o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.c */
public final class C21001c extends C21033a {

    /* renamed from: a */
    private final Map<IBinder, C45336r> f56468a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<IBinder, C45404o> f56469b = new LinkedHashMap();

    /* renamed from: c */
    private final C20749b f56470c;

    /* renamed from: e */
    public final void mo56631e(int i) {
    }

    /* renamed from: a */
    public final void mo56587a(String str, String str2, String str3) {
        this.f56470c.mo56052a((Context) null, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo56583a(String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56470c.mo56096c(str);
    }

    /* renamed from: b */
    public final void mo56607b(String str, float f) {
        this.f56470c.mo56088b(str, f);
    }

    /* renamed from: a */
    public final void mo56585a(String str, String str2, float f) {
        this.f56470c.mo56065a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo56586a(String str, String str2, float f, float f2, float f3) {
        this.f56470c.mo56066a(str, str2, f, f2, f3);
    }

    /* renamed from: b */
    public final void mo56606b(C20980z zVar) {
        C7573i.m23587b(zVar, "landmarkListener");
        C45336r rVar = (C45336r) this.f56468a.get(zVar.asBinder());
        if (rVar != null) {
            this.f56470c.mo56059a(rVar);
            this.f56468a.remove(zVar.asBinder());
        }
    }

    /* renamed from: a */
    public final void mo56589a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56470c.mo56068a(list, i);
    }

    /* renamed from: b */
    public final void mo56609b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56470c.mo56089b(list, i);
    }

    /* renamed from: a */
    public final void mo56573a(int i, String str, float f, float f2) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56470c.mo56050a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo56572a(int i, String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56470c.mo56049a(i, str);
    }

    /* renamed from: a */
    public final void mo56567a(float f, float f2) {
        this.f56470c.mo56115f(f, f2);
    }

    /* renamed from: a */
    public final void mo56566a(float f) {
        this.f56470c.mo56043a(f);
    }

    /* renamed from: a */
    public final boolean mo56596a(boolean z) {
        return this.f56470c.mo56123j(z);
    }

    /* renamed from: b */
    public final void mo56610b(boolean z) {
        this.f56470c.mo56124k(z);
    }

    /* renamed from: a */
    public final void mo56591a(Map<Object, Object> map) {
        C7573i.m23587b(map, "intensityDict");
        this.f56470c.mo56070a(map);
    }

    /* renamed from: a */
    public final void mo56588a(String str, Map<Object, Object> map) {
        C7573i.m23587b(str, "resourcePath");
        C20749b bVar = this.f56470c;
        if (map != null) {
            bVar.mo56067a(str, map);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, kotlin.Float>");
    }

    /* renamed from: a */
    public final void mo56569a(int i) {
        this.f56470c.mo56111e(i);
    }

    /* renamed from: a */
    public final void mo56580a(C20974x xVar) {
        IBinder iBinder = null;
        C45404o oVar = (C45404o) this.f56469b.get(xVar != null ? xVar.asBinder() : null);
        if (oVar != null) {
            this.f56470c.mo56061a(oVar);
            Map<IBinder, C45404o> map = this.f56469b;
            if (xVar != null) {
                iBinder = xVar.asBinder();
            }
            if (map != null) {
                C7577n.m23626f(map).remove(iBinder);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    /* renamed from: a */
    public final void mo56592a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C7573i.m23587b(str2, "phoneParamPath");
        this.f56470c.mo56072a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo56593a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56470c.mo56073a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo56565a(double d, double d2, double d3, double d4) {
        this.f56470c.mo56042a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo56594a(double[] dArr, double d) {
        C7573i.m23587b(dArr, "wRbs");
        this.f56470c.mo56074a(dArr, d);
    }

    /* renamed from: a */
    public final void mo56570a(int i, float f, float f2, int i2) {
        this.f56470c.mo56047a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo56568a(float f, float f2, float f3, float f4, float f5) {
        this.f56470c.mo56045a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo56584a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str, "inputext");
        C7573i.m23587b(str2, "var4");
        this.f56470c.mo56063a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo56579a(C20971w wVar) {
        C7573i.m23587b(wVar, "callback");
        this.f56470c.mo56055a(C20852c.m69837a(wVar));
    }

    /* renamed from: a */
    public final void mo56574a(C20902a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f56470c.mo56054a(C20852c.m69836a(aVar));
    }

    /* renamed from: a */
    public final void mo56581a(C20977y yVar) {
        this.f56470c.mo56057a(yVar != null ? C20852c.m69839a(yVar) : null);
    }

    /* renamed from: a */
    public final void mo56576a(C20953q qVar) {
        C7573i.m23587b(qVar, "callback");
        this.f56470c.mo56060a(C20852c.m69857a(qVar));
    }

    /* renamed from: a */
    public final void mo56575a(C20947o oVar) {
        C7573i.m23587b(oVar, "callback");
        this.f56470c.mo56056a(C20852c.m69838a(oVar));
    }

    /* renamed from: a */
    public final void mo56595a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56470c.mo56075a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo56577a(C20959s sVar) {
        C7573i.m23587b(sVar, "listener");
        this.f56470c.mo56058a(C20852c.m69855a(sVar));
    }

    /* renamed from: a */
    public final void mo56571a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        this.f56470c.mo56048a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56578a(C20968v vVar) {
        this.f56470c.mo56053a(vVar != null ? C20852c.m69835a(vVar) : null);
    }

    /* renamed from: b */
    public final void mo56608b(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f56470c.mo56064a(str, str2);
    }

    /* renamed from: a */
    public final void mo56582a(C20980z zVar) {
        C7573i.m23587b(zVar, "landmarkListener");
        C45336r a = C20852c.m69856a(zVar);
        Map<IBinder, C45336r> map = this.f56468a;
        IBinder asBinder = zVar.asBinder();
        C7573i.m23582a((Object) asBinder, "landmarkListener.asBinder()");
        map.put(asBinder, a);
        this.f56470c.mo56085b(a);
    }

    /* renamed from: a */
    public final void mo56590a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        this.f56470c.mo56069a(list, list2, i);
    }

    /* renamed from: f */
    public final void mo56634f() {
        this.f56470c.mo56040a();
    }

    /* renamed from: g */
    public final C21020e mo56640g() {
        return C20852c.m69852a(this.f56470c.mo56102d());
    }

    /* renamed from: c */
    public final void mo56613c() {
        this.f56470c.mo56109e();
    }

    /* renamed from: d */
    public final void mo56622d() {
        this.f56470c.mo56079b();
    }

    /* renamed from: e */
    public final void mo56629e() {
        this.f56470c.mo56051a((Context) C6855a.m21308b());
    }

    /* renamed from: b */
    public final void mo56600b() {
        this.f56470c.mo56092c();
    }

    /* renamed from: a */
    public final void mo56563a() {
        this.f56470c.mo56084b((Context) C6855a.m21308b());
    }

    /* renamed from: c */
    public final int mo56611c(float f) {
        return this.f56470c.mo56091c(f);
    }

    /* renamed from: d */
    public final int mo56620d(float f) {
        return this.f56470c.mo56100d(f);
    }

    /* renamed from: e */
    public final int mo56628e(float f) {
        return this.f56470c.mo56107e(f);
    }

    /* renamed from: f */
    public final int mo56633f(float f) {
        return this.f56470c.mo56113f(f);
    }

    /* renamed from: g */
    public final int mo56639g(float f) {
        return this.f56470c.mo56117g(f);
    }

    /* renamed from: h */
    public final void mo56643h(String str) {
        this.f56470c.mo56062a(str);
    }

    /* renamed from: i */
    public final void mo56645i(boolean z) {
        this.f56470c.mo56121h(z);
    }

    /* renamed from: j */
    public final void mo56646j(boolean z) {
        this.f56470c.mo56122i(z);
    }

    /* renamed from: k */
    public final void mo56647k(boolean z) {
        this.f56470c.mo56071a(z);
    }

    /* renamed from: l */
    public final void mo56648l(boolean z) {
        this.f56470c.mo56090b(z);
    }

    /* renamed from: m */
    public final void mo56649m(boolean z) {
        this.f56470c.mo56098c(z);
    }

    /* renamed from: n */
    public final void mo56650n(boolean z) {
        this.f56470c.mo56127n(z);
    }

    /* renamed from: b */
    public final int mo56597b(String str) {
        C7573i.m23587b(str, "strResPath");
        return this.f56470c.mo56101d(str);
    }

    /* renamed from: c */
    public final int mo56612c(String str) {
        C7573i.m23587b(str, "strRes");
        return this.f56470c.mo56108e(str);
    }

    /* renamed from: d */
    public final int mo56621d(String str) {
        C7573i.m23587b(str, "resourcePath");
        return this.f56470c.mo56114f(str);
    }

    /* renamed from: e */
    public final float mo56627e(String str) {
        C7573i.m23587b(str, "path");
        return this.f56470c.mo56120h(str);
    }

    /* renamed from: h */
    public final void mo56644h(boolean z) {
        this.f56470c.mo56119g(z);
    }

    public C21001c(C20749b bVar) {
        C7573i.m23587b(bVar, "effectController");
        this.f56470c = bVar;
    }

    /* renamed from: a */
    public final int mo56558a(Bitmap bitmap) {
        return this.f56470c.mo56036a(bitmap);
    }

    /* renamed from: g */
    public final void mo56641g(String str) {
        C7573i.m23587b(str, "language");
        this.f56470c.mo56087b(str);
    }

    /* renamed from: f */
    public final void mo56636f(int i) {
        this.f56470c.mo56046a(i);
    }

    /* renamed from: g */
    public final void mo56642g(boolean z) {
        this.f56470c.mo56116f(z);
    }

    /* renamed from: d */
    public final void mo56624d(int i) {
        this.f56470c.mo56083b(i);
    }

    /* renamed from: e */
    public final void mo56632e(boolean z) {
        this.f56470c.mo56106d(z);
    }

    /* renamed from: f */
    public final void mo56637f(String str) {
        this.f56470c.mo56118g(str);
    }

    /* renamed from: b */
    public final void mo56602b(float f) {
        this.f56470c.mo56081b(f);
    }

    /* renamed from: c */
    public final void mo56616c(int i) {
        this.f56470c.mo56104d(i);
    }

    /* renamed from: f */
    public final void mo56638f(boolean z) {
        this.f56470c.mo56112e(z);
    }

    /* renamed from: d */
    public final void mo56626d(boolean z) {
        this.f56470c.mo56126m(z);
    }

    /* renamed from: b */
    public final void mo56604b(int i) {
        this.f56470c.mo56095c(i);
    }

    /* renamed from: c */
    public final void mo56618c(boolean z) {
        this.f56470c.mo56125l(z);
    }

    /* renamed from: a */
    public final void mo56564a(double d) {
        this.f56470c.mo56041a(d);
    }

    /* renamed from: b */
    public final void mo56605b(C20974x xVar) {
        C7573i.m23587b(xVar, "listener");
        C45404o a = C20852c.m69858a(xVar);
        Map<IBinder, C45404o> map = this.f56469b;
        IBinder asBinder = xVar.asBinder();
        C7573i.m23582a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, a);
        this.f56470c.mo56086b(a);
    }

    /* renamed from: a */
    public final int mo56556a(int i, float f) {
        return this.f56470c.mo56034a(i, f);
    }

    /* renamed from: a */
    public final int mo56557a(int i, int i2) {
        return this.f56470c.mo56035a(i, i2);
    }

    /* renamed from: f */
    public final void mo56635f(float f, float f2) {
        this.f56470c.mo56110e(f, f2);
    }

    /* renamed from: a */
    public final int mo56559a(String str, float f) {
        C7573i.m23587b(str, "strRes");
        return this.f56470c.mo56037a(str, f);
    }

    /* renamed from: d */
    public final void mo56623d(float f, float f2) {
        this.f56470c.mo56094c(f, f2);
    }

    /* renamed from: e */
    public final void mo56630e(float f, float f2) {
        this.f56470c.mo56103d(f, f2);
    }

    /* renamed from: c */
    public final void mo56615c(float f, float f2) {
        this.f56470c.mo56082b(f, f2);
    }

    /* renamed from: d */
    public final void mo56625d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56470c.mo56097c(list, i);
    }

    /* renamed from: a */
    public final int mo56562a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "imagePath");
        return this.f56470c.mo56078b(str, str2);
    }

    /* renamed from: b */
    public final void mo56603b(float f, float f2) {
        this.f56470c.mo56044a(f, f2);
    }

    /* renamed from: c */
    public final void mo56617c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "list");
        this.f56470c.mo56105d(list, i);
    }

    /* renamed from: c */
    public final int[] mo56619c(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "nodeKey");
        return this.f56470c.mo56099c(str, str2);
    }

    /* renamed from: b */
    public final int mo56598b(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56470c.mo56076b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo56560a(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56470c.mo56038a(str, f, f2);
    }

    /* renamed from: b */
    public final int mo56599b(String str, int i, int i2, String str2) {
        return this.f56470c.mo56077b(str, i, i2, str2);
    }

    /* renamed from: c */
    public final void mo56614c(double d, double d2, double d3, double d4) {
        this.f56470c.mo56093c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo56601b(double d, double d2, double d3, double d4) {
        this.f56470c.mo56080b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo56561a(String str, int i, int i2, boolean z) {
        return this.f56470c.mo56039a(str, i, i2, z);
    }
}
