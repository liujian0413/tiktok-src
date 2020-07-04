package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1788a;
import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1672f;

/* renamed from: com.airbnb.lottie.model.content.i */
public final class C1813i implements C1806b {

    /* renamed from: a */
    public final FillType f6537a;

    /* renamed from: b */
    public final String f6538b;

    /* renamed from: c */
    public final C1788a f6539c;

    /* renamed from: d */
    public final C1791d f6540d;

    /* renamed from: e */
    private final boolean f6541e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.f6541e);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1672f(hVar, aVar, this);
    }

    public C1813i(String str, boolean z, FillType fillType, C1788a aVar, C1791d dVar) {
        this.f6538b = str;
        this.f6541e = z;
        this.f6537a = fillType;
        this.f6539c = aVar;
        this.f6540d = dVar;
    }
}
