package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.C0905l;
import com.airbnb.lottie.model.C1803c;
import com.airbnb.lottie.model.C1816d;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.f */
public final class C1757f {

    /* renamed from: a */
    public final C1838o f6332a = new C1838o();

    /* renamed from: b */
    public Map<String, C1780i> f6333b;

    /* renamed from: c */
    public Map<String, C1803c> f6334c;

    /* renamed from: d */
    public C0905l<C1816d> f6335d;

    /* renamed from: e */
    public List<Layer> f6336e;

    /* renamed from: f */
    public Rect f6337f;

    /* renamed from: g */
    public float f6338g;

    /* renamed from: h */
    public float f6339h;

    /* renamed from: i */
    public float f6340i;

    /* renamed from: j */
    private final HashSet<String> f6341j = new HashSet<>();

    /* renamed from: k */
    private Map<String, List<Layer>> f6342k;

    /* renamed from: l */
    private C0893e<Layer> f6343l;

    /* renamed from: com.airbnb.lottie.f$a */
    public static class C1759a {

        /* renamed from: com.airbnb.lottie.f$a$a */
        static final class C1760a implements C1664a, C1781j<C1757f> {

            /* renamed from: a */
            private final C1833n f6344a;

            /* renamed from: b */
            private boolean f6345b;

            private C1760a(C1833n nVar) {
                this.f6344a = nVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo7127a(C1757f fVar) {
                if (!this.f6345b) {
                    this.f6344a.mo7330a(fVar);
                }
            }
        }

        /* renamed from: a */
        public static C1664a m8390a(Context context, String str, C1833n nVar) {
            C1760a aVar = new C1760a(nVar);
            C1761g.m8406c(context, str).mo7275a((C1781j<T>) aVar);
            return aVar;
        }
    }

    /* renamed from: b */
    public final float mo7213b() {
        return this.f6339h - this.f6338g;
    }

    /* renamed from: a */
    public final float mo7208a() {
        return (float) ((long) ((mo7213b() / this.f6340i) * 1000.0f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer a : this.f6336e) {
            sb.append(a.mo7323a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo7211a(String str) {
        this.f6341j.add(str);
    }

    /* renamed from: b */
    public final List<Layer> mo7214b(String str) {
        return (List) this.f6342k.get(str);
    }

    /* renamed from: a */
    public final Layer mo7209a(long j) {
        return (Layer) this.f6343l.mo3327a(j);
    }

    /* renamed from: a */
    public final void mo7212a(boolean z) {
        this.f6332a.f6643a = z;
    }

    /* renamed from: a */
    public final void mo7210a(Rect rect, float f, float f2, float f3, List<Layer> list, C0893e<Layer> eVar, Map<String, List<Layer>> map, Map<String, C1780i> map2, C0905l<C1816d> lVar, Map<String, C1803c> map3) {
        this.f6337f = rect;
        this.f6338g = f;
        this.f6339h = f2;
        this.f6340i = f3;
        this.f6336e = list;
        this.f6343l = eVar;
        this.f6342k = map;
        this.f6333b = map2;
        this.f6335d = lVar;
        this.f6334c = map3;
    }
}
