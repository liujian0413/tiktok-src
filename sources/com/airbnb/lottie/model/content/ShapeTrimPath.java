package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1686r;

public final class ShapeTrimPath implements C1806b {

    /* renamed from: a */
    public final String f6494a;

    /* renamed from: b */
    public final Type f6495b;

    /* renamed from: c */
    public final C1789b f6496c;

    /* renamed from: d */
    public final C1789b f6497d;

    /* renamed from: e */
    public final C1789b f6498e;

    public enum Type {
        Simultaneously,
        Individually;

        public static Type forId(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    StringBuilder sb = new StringBuilder("Unknown trim path type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.f6496c);
        sb.append(", end: ");
        sb.append(this.f6497d);
        sb.append(", offset: ");
        sb.append(this.f6498e);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1686r(aVar, this);
    }

    public ShapeTrimPath(String str, Type type, C1789b bVar, C1789b bVar2, C1789b bVar3) {
        this.f6494a = str;
        this.f6495b = type;
        this.f6496c = bVar;
        this.f6497d = bVar2;
        this.f6498e = bVar3;
    }
}
