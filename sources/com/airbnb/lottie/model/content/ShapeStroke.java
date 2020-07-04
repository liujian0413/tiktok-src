package com.airbnb.lottie.model.content;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1788a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1685q;
import java.util.List;

public final class ShapeStroke implements C1806b {

    /* renamed from: a */
    public final String f6483a;

    /* renamed from: b */
    public final C1789b f6484b;

    /* renamed from: c */
    public final List<C1789b> f6485c;

    /* renamed from: d */
    public final C1788a f6486d;

    /* renamed from: e */
    public final C1791d f6487e;

    /* renamed from: f */
    public final C1789b f6488f;

    /* renamed from: g */
    public final LineCapType f6489g;

    /* renamed from: h */
    public final LineJoinType f6490h;

    /* renamed from: i */
    public final float f6491i;

    public enum LineCapType {
        Butt,
        Round,
        Unknown;

        public final Cap toPaintCap() {
            switch (this) {
                case Butt:
                    return Cap.BUTT;
                case Round:
                    return Cap.ROUND;
                default:
                    return Cap.SQUARE;
            }
        }
    }

    public enum LineJoinType {
        Miter,
        Round,
        Bevel;

        public final Join toPaintJoin() {
            switch (this) {
                case Bevel:
                    return Join.BEVEL;
                case Miter:
                    return Join.MITER;
                case Round:
                    return Join.ROUND;
                default:
                    return null;
            }
        }
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1685q(hVar, aVar, this);
    }

    public ShapeStroke(String str, C1789b bVar, List<C1789b> list, C1788a aVar, C1791d dVar, C1789b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f) {
        this.f6483a = str;
        this.f6484b = bVar;
        this.f6485c = list;
        this.f6486d = aVar;
        this.f6487e = dVar;
        this.f6488f = bVar2;
        this.f6489g = lineCapType;
        this.f6490h = lineJoinType;
        this.f6491i = f;
    }
}
