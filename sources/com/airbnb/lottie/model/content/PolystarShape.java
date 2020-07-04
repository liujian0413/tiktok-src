package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1800m;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1680m;

public final class PolystarShape implements C1806b {

    /* renamed from: a */
    public final String f6474a;

    /* renamed from: b */
    public final Type f6475b;

    /* renamed from: c */
    public final C1789b f6476c;

    /* renamed from: d */
    public final C1800m<PointF, PointF> f6477d;

    /* renamed from: e */
    public final C1789b f6478e;

    /* renamed from: f */
    public final C1789b f6479f;

    /* renamed from: g */
    public final C1789b f6480g;

    /* renamed from: h */
    public final C1789b f6481h;

    /* renamed from: i */
    public final C1789b f6482i;

    public enum Type {
        Star(1),
        Polygon(2);
        
        private final int value;

        public static Type forValue(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1680m(hVar, aVar, this);
    }

    public PolystarShape(String str, Type type, C1789b bVar, C1800m<PointF, PointF> mVar, C1789b bVar2, C1789b bVar3, C1789b bVar4, C1789b bVar5, C1789b bVar6) {
        this.f6474a = str;
        this.f6475b = type;
        this.f6476c = bVar;
        this.f6477d = mVar;
        this.f6478e = bVar2;
        this.f6479f = bVar3;
        this.f6480g = bVar4;
        this.f6481h = bVar5;
        this.f6482i = bVar6;
    }
}
