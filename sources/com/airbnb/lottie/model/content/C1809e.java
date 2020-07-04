package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1790c;
import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.model.p058a.C1793f;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1674h;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.e */
public final class C1809e implements C1806b {

    /* renamed from: a */
    public final String f6514a;

    /* renamed from: b */
    public final GradientType f6515b;

    /* renamed from: c */
    public final C1790c f6516c;

    /* renamed from: d */
    public final C1791d f6517d;

    /* renamed from: e */
    public final C1793f f6518e;

    /* renamed from: f */
    public final C1793f f6519f;

    /* renamed from: g */
    public final C1789b f6520g;

    /* renamed from: h */
    public final LineCapType f6521h;

    /* renamed from: i */
    public final LineJoinType f6522i;

    /* renamed from: j */
    public final float f6523j;

    /* renamed from: k */
    public final List<C1789b> f6524k;

    /* renamed from: l */
    public final C1789b f6525l;

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1674h(hVar, aVar, this);
    }

    public C1809e(String str, GradientType gradientType, C1790c cVar, C1791d dVar, C1793f fVar, C1793f fVar2, C1789b bVar, LineCapType lineCapType, LineJoinType lineJoinType, float f, List<C1789b> list, C1789b bVar2) {
        this.f6514a = str;
        this.f6515b = gradientType;
        this.f6516c = cVar;
        this.f6517d = dVar;
        this.f6518e = fVar;
        this.f6519f = fVar2;
        this.f6520g = bVar;
        this.f6521h = lineCapType;
        this.f6522i = lineJoinType;
        this.f6523j = f;
        this.f6524k = list;
        this.f6525l = bVar2;
    }
}
