package com.p280ss.android.ugc.asve.recorder.view;

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
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45398i;
import com.p280ss.android.vesdk.C45382z.C45404o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.view.f */
public final class C20812f implements C20749b {

    /* renamed from: a */
    private final C20749b f56195a;

    /* renamed from: a */
    public final int mo56034a(int i, float f) {
        return this.f56195a.mo56034a(i, f);
    }

    /* renamed from: a */
    public final int mo56035a(int i, int i2) {
        return this.f56195a.mo56035a(i, i2);
    }

    /* renamed from: a */
    public final int mo56036a(Bitmap bitmap) {
        return this.f56195a.mo56036a(bitmap);
    }

    /* renamed from: a */
    public final int mo56037a(String str, float f) {
        C7573i.m23587b(str, "strRes");
        return this.f56195a.mo56037a(str, f);
    }

    /* renamed from: a */
    public final int mo56038a(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56195a.mo56038a(str, f, f2);
    }

    /* renamed from: a */
    public final int mo56039a(String str, int i, int i2, boolean z) {
        return this.f56195a.mo56039a(str, i, i2, z);
    }

    /* renamed from: a */
    public final void mo56040a() {
        this.f56195a.mo56040a();
    }

    /* renamed from: a */
    public final void mo56041a(double d) {
        this.f56195a.mo56041a(d);
    }

    /* renamed from: a */
    public final void mo56042a(double d, double d2, double d3, double d4) {
        this.f56195a.mo56042a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo56043a(float f) {
        this.f56195a.mo56043a(f);
    }

    /* renamed from: a */
    public final void mo56044a(float f, float f2) {
        this.f56195a.mo56044a(f, f2);
    }

    /* renamed from: a */
    public final void mo56045a(float f, float f2, float f3, float f4, float f5) {
        this.f56195a.mo56045a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo56046a(int i) {
        this.f56195a.mo56046a(i);
    }

    /* renamed from: a */
    public final void mo56047a(int i, float f, float f2, int i2) {
        this.f56195a.mo56047a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo56048a(int i, long j, long j2, String str) {
        C7573i.m23587b(str, "msg");
        this.f56195a.mo56048a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56049a(int i, String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56195a.mo56049a(i, str);
    }

    /* renamed from: a */
    public final void mo56050a(int i, String str, float f, float f2) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56195a.mo56050a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo56051a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56195a.mo56051a(context);
    }

    /* renamed from: a */
    public final void mo56052a(Context context, String str, String str2, String str3) {
        this.f56195a.mo56052a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo56053a(C1944a aVar) {
        this.f56195a.mo56053a(aVar);
    }

    /* renamed from: a */
    public final void mo56054a(OnARTextContentCallback onARTextContentCallback) {
        C7573i.m23587b(onARTextContentCallback, "callback");
        this.f56195a.mo56054a(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo56055a(OnARTextCountCallback onARTextCountCallback) {
        C7573i.m23587b(onARTextCountCallback, "callback");
        this.f56195a.mo56055a(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo56056a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C7573i.m23587b(onCherEffectParmaCallback, "callback");
        this.f56195a.mo56056a(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo56057a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56195a.mo56057a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo56058a(C21062a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f56195a.mo56058a(aVar);
    }

    /* renamed from: a */
    public final void mo56059a(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56195a.mo56059a(rVar);
    }

    /* renamed from: a */
    public final void mo56060a(C45398i iVar) {
        C7573i.m23587b(iVar, "callback");
        this.f56195a.mo56060a(iVar);
    }

    /* renamed from: a */
    public final void mo56061a(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        this.f56195a.mo56061a(oVar);
    }

    /* renamed from: a */
    public final void mo56062a(String str) {
        this.f56195a.mo56062a(str);
    }

    /* renamed from: a */
    public final void mo56063a(String str, int i, int i2, String str2) {
        C7573i.m23587b(str2, "arg3");
        this.f56195a.mo56063a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo56064a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f56195a.mo56064a(str, str2);
    }

    /* renamed from: a */
    public final void mo56065a(String str, String str2, float f) {
        this.f56195a.mo56065a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo56066a(String str, String str2, float f, float f2, float f3) {
        this.f56195a.mo56066a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo56067a(String str, Map<Integer, Float> map) {
        C7573i.m23587b(str, "resourcePath");
        C7573i.m23587b(map, "intensityDict");
        this.f56195a.mo56067a(str, map);
    }

    /* renamed from: a */
    public final void mo56068a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56195a.mo56068a(list, i);
    }

    /* renamed from: a */
    public final void mo56069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        this.f56195a.mo56069a(list, list2, i);
    }

    /* renamed from: a */
    public final void mo56070a(Map<Integer, Float> map) {
        C7573i.m23587b(map, "intensityDict");
        this.f56195a.mo56070a(map);
    }

    /* renamed from: a */
    public final void mo56071a(boolean z) {
        this.f56195a.mo56071a(z);
    }

    /* renamed from: a */
    public final void mo56072a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C7573i.m23587b(str2, "phoneParamPath");
        this.f56195a.mo56072a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo56073a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56195a.mo56073a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo56074a(double[] dArr, double d) {
        C7573i.m23587b(dArr, "wRbs");
        this.f56195a.mo56074a(dArr, d);
    }

    /* renamed from: a */
    public final void mo56075a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56195a.mo56075a(strArr, dArr, zArr);
    }

    /* renamed from: b */
    public final int mo56076b(String str, float f, float f2) {
        C7573i.m23587b(str, "strRes");
        return this.f56195a.mo56076b(str, f, f2);
    }

    /* renamed from: b */
    public final int mo56077b(String str, int i, int i2, String str2) {
        return this.f56195a.mo56077b(str, i, i2, str2);
    }

    /* renamed from: b */
    public final int mo56078b(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "imagePath");
        return this.f56195a.mo56078b(str, str2);
    }

    /* renamed from: b */
    public final void mo56079b() {
        this.f56195a.mo56079b();
    }

    /* renamed from: b */
    public final void mo56080b(double d, double d2, double d3, double d4) {
        this.f56195a.mo56080b(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo56081b(float f) {
        this.f56195a.mo56081b(f);
    }

    /* renamed from: b */
    public final void mo56082b(float f, float f2) {
        this.f56195a.mo56082b(f, f2);
    }

    /* renamed from: b */
    public final void mo56083b(int i) {
        this.f56195a.mo56083b(i);
    }

    /* renamed from: b */
    public final void mo56084b(Context context) {
        C7573i.m23587b(context, "context");
        this.f56195a.mo56084b(context);
    }

    /* renamed from: b */
    public final void mo56085b(C45336r rVar) {
        C7573i.m23587b(rVar, "landmarkListener");
        this.f56195a.mo56085b(rVar);
    }

    /* renamed from: b */
    public final void mo56086b(C45404o oVar) {
        C7573i.m23587b(oVar, "slamDetectListener");
        this.f56195a.mo56086b(oVar);
    }

    /* renamed from: b */
    public final void mo56087b(String str) {
        C7573i.m23587b(str, "language");
        this.f56195a.mo56087b(str);
    }

    /* renamed from: b */
    public final void mo56088b(String str, float f) {
        this.f56195a.mo56088b(str, f);
    }

    /* renamed from: b */
    public final void mo56089b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56195a.mo56089b(list, i);
    }

    /* renamed from: b */
    public final void mo56090b(boolean z) {
        this.f56195a.mo56090b(z);
    }

    /* renamed from: c */
    public final int mo56091c(float f) {
        return this.f56195a.mo56091c(f);
    }

    /* renamed from: c */
    public final void mo56092c() {
        this.f56195a.mo56092c();
    }

    /* renamed from: c */
    public final void mo56093c(double d, double d2, double d3, double d4) {
        this.f56195a.mo56093c(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final void mo56094c(float f, float f2) {
        this.f56195a.mo56094c(f, f2);
    }

    /* renamed from: c */
    public final void mo56095c(int i) {
        this.f56195a.mo56095c(i);
    }

    /* renamed from: c */
    public final void mo56096c(String str) {
        C7573i.m23587b(str, "strBeautyFaceRes");
        this.f56195a.mo56096c(str);
    }

    /* renamed from: c */
    public final void mo56097c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56195a.mo56097c(list, i);
    }

    /* renamed from: c */
    public final void mo56098c(boolean z) {
        this.f56195a.mo56098c(z);
    }

    /* renamed from: c */
    public final int[] mo56099c(String str, String str2) {
        C7573i.m23587b(str, "nodePath");
        C7573i.m23587b(str2, "nodeKey");
        return this.f56195a.mo56099c(str, str2);
    }

    /* renamed from: d */
    public final int mo56100d(float f) {
        return this.f56195a.mo56100d(f);
    }

    /* renamed from: d */
    public final int mo56101d(String str) {
        C7573i.m23587b(str, "strResPath");
        return this.f56195a.mo56101d(str);
    }

    /* renamed from: d */
    public final C20761c mo56102d() {
        return this.f56195a.mo56102d();
    }

    /* renamed from: d */
    public final void mo56103d(float f, float f2) {
        this.f56195a.mo56103d(f, f2);
    }

    /* renamed from: d */
    public final void mo56104d(int i) {
        this.f56195a.mo56104d(i);
    }

    /* renamed from: d */
    public final void mo56105d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56195a.mo56105d(list, i);
    }

    /* renamed from: d */
    public final void mo56106d(boolean z) {
        this.f56195a.mo56106d(z);
    }

    /* renamed from: e */
    public final int mo56107e(float f) {
        return this.f56195a.mo56107e(f);
    }

    /* renamed from: e */
    public final int mo56108e(String str) {
        C7573i.m23587b(str, "strRes");
        return this.f56195a.mo56108e(str);
    }

    /* renamed from: e */
    public final void mo56109e() {
        this.f56195a.mo56109e();
    }

    /* renamed from: e */
    public final void mo56110e(float f, float f2) {
        this.f56195a.mo56110e(f, f2);
    }

    /* renamed from: e */
    public final void mo56111e(int i) {
        this.f56195a.mo56111e(i);
    }

    /* renamed from: e */
    public final void mo56112e(boolean z) {
        this.f56195a.mo56112e(z);
    }

    /* renamed from: f */
    public final int mo56113f(float f) {
        return this.f56195a.mo56113f(f);
    }

    /* renamed from: f */
    public final int mo56114f(String str) {
        C7573i.m23587b(str, "resourcePath");
        return this.f56195a.mo56114f(str);
    }

    /* renamed from: f */
    public final void mo56115f(float f, float f2) {
        this.f56195a.mo56115f(f, f2);
    }

    /* renamed from: f */
    public final void mo56116f(boolean z) {
        this.f56195a.mo56116f(z);
    }

    /* renamed from: g */
    public final int mo56117g(float f) {
        return this.f56195a.mo56117g(f);
    }

    /* renamed from: g */
    public final void mo56118g(String str) {
        this.f56195a.mo56118g(str);
    }

    /* renamed from: g */
    public final void mo56119g(boolean z) {
        this.f56195a.mo56119g(z);
    }

    /* renamed from: h */
    public final float mo56120h(String str) {
        C7573i.m23587b(str, "filterPath");
        return this.f56195a.mo56120h(str);
    }

    /* renamed from: h */
    public final void mo56121h(boolean z) {
        this.f56195a.mo56121h(z);
    }

    /* renamed from: i */
    public final void mo56122i(boolean z) {
        this.f56195a.mo56122i(z);
    }

    /* renamed from: j */
    public final boolean mo56123j(boolean z) {
        return this.f56195a.mo56123j(z);
    }

    /* renamed from: k */
    public final void mo56124k(boolean z) {
        this.f56195a.mo56124k(z);
    }

    /* renamed from: l */
    public final void mo56125l(boolean z) {
        this.f56195a.mo56125l(z);
    }

    /* renamed from: m */
    public final void mo56126m(boolean z) {
        this.f56195a.mo56126m(z);
    }

    /* renamed from: n */
    public final void mo56127n(boolean z) {
        this.f56195a.mo56127n(z);
    }

    public C20812f(C20749b bVar) {
        C7573i.m23587b(bVar, "ctrl");
        this.f56195a = bVar;
    }
}
