package com.airbnb.lottie.model.layer;

import com.C1642a;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.C1806b;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1797j;
import com.airbnb.lottie.model.p058a.C1798k;
import com.airbnb.lottie.model.p058a.C1799l;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;
import java.util.Locale;

public final class Layer {

    /* renamed from: a */
    public final List<C1806b> f6559a;

    /* renamed from: b */
    public final C1757f f6560b;

    /* renamed from: c */
    public final String f6561c;

    /* renamed from: d */
    public final long f6562d;

    /* renamed from: e */
    public final LayerType f6563e;

    /* renamed from: f */
    public final long f6564f;

    /* renamed from: g */
    public final String f6565g;

    /* renamed from: h */
    public final List<Mask> f6566h;

    /* renamed from: i */
    public final C1799l f6567i;

    /* renamed from: j */
    public final int f6568j;

    /* renamed from: k */
    public final int f6569k;

    /* renamed from: l */
    public final int f6570l;

    /* renamed from: m */
    public final float f6571m;

    /* renamed from: n */
    public final int f6572n;

    /* renamed from: o */
    public final int f6573o;

    /* renamed from: p */
    public final C1797j f6574p;

    /* renamed from: q */
    public final C1798k f6575q;

    /* renamed from: r */
    public final C1789b f6576r;

    /* renamed from: s */
    public final List<C1753a<Float>> f6577s;

    /* renamed from: t */
    public final MatteType f6578t;

    /* renamed from: u */
    private final float f6579u;

    public enum LayerType {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    public enum MatteType {
        None,
        Add,
        Invert,
        Unknown
    }

    public final String toString() {
        return mo7323a("");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo7322a() {
        return this.f6579u / this.f6560b.mo7213b();
    }

    /* renamed from: a */
    public final String mo7323a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f6561c);
        sb.append("\n");
        Layer a = this.f6560b.mo7209a(this.f6564f);
        if (a != null) {
            sb.append("\t\tParents: ");
            sb.append(a.f6561c);
            Layer a2 = this.f6560b.mo7209a(a.f6564f);
            while (a2 != null) {
                sb.append("->");
                sb.append(a2.f6561c);
                a2 = this.f6560b.mo7209a(a2.f6564f);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f6566h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f6566h.size());
            sb.append("\n");
        }
        if (!(this.f6568j == 0 || this.f6569k == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(C1642a.m8035a(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f6568j), Integer.valueOf(this.f6569k), Integer.valueOf(this.f6570l)}));
        }
        if (!this.f6559a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : this.f6559a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public Layer(List<C1806b> list, C1757f fVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C1799l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C1797j jVar, C1798k kVar, List<C1753a<Float>> list3, MatteType matteType, C1789b bVar) {
        this.f6559a = list;
        this.f6560b = fVar;
        this.f6561c = str;
        this.f6562d = j;
        this.f6563e = layerType;
        this.f6564f = j2;
        this.f6565g = str2;
        this.f6566h = list2;
        this.f6567i = lVar;
        this.f6568j = i;
        this.f6569k = i2;
        this.f6570l = i3;
        this.f6571m = f;
        this.f6579u = f2;
        this.f6572n = i4;
        this.f6573o = i5;
        this.f6574p = jVar;
        this.f6575q = kVar;
        this.f6577s = list3;
        this.f6578t = matteType;
        this.f6576r = bVar;
    }
}
