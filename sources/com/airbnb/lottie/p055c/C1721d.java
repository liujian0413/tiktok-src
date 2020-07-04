package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.p058a.C1788a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1790c;
import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.model.p058a.C1793f;
import com.airbnb.lottie.model.p058a.C1794g;
import com.airbnb.lottie.model.p058a.C1795h;
import com.airbnb.lottie.model.p058a.C1797j;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1753a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.d */
public final class C1721d {
    /* renamed from: a */
    public static C1789b m8264a(JsonReader jsonReader, C1757f fVar) throws IOException {
        return m8265a(jsonReader, fVar, true);
    }

    /* renamed from: b */
    static C1791d m8269b(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1791d(m8268a(jsonReader, fVar, (C1718aj<T>) C1732o.f6279a));
    }

    /* renamed from: c */
    static C1793f m8270c(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1793f(m8267a(jsonReader, C1751f.m8367a(), fVar, C1743y.f6284a));
    }

    /* renamed from: d */
    static C1794g m8271d(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1794g(m8268a(jsonReader, fVar, (C1718aj<T>) C1711ac.f6273a));
    }

    /* renamed from: e */
    static C1795h m8272e(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1795h(m8267a(jsonReader, C1751f.m8367a(), fVar, C1712ad.f6274a));
    }

    /* renamed from: f */
    static C1797j m8273f(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1797j(m8268a(jsonReader, fVar, (C1718aj<T>) C1725h.f6276a));
    }

    /* renamed from: g */
    static C1788a m8274g(JsonReader jsonReader, C1757f fVar) throws IOException {
        return new C1788a(m8268a(jsonReader, fVar, (C1718aj<T>) C1723f.f6275a));
    }

    /* renamed from: a */
    static C1790c m8266a(JsonReader jsonReader, C1757f fVar, int i) throws IOException {
        return new C1790c(m8268a(jsonReader, fVar, (C1718aj<T>) new C1729l<T>(i)));
    }

    /* renamed from: a */
    public static C1789b m8265a(JsonReader jsonReader, C1757f fVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = C1751f.m8367a();
        } else {
            f = 1.0f;
        }
        return new C1789b(m8267a(jsonReader, f, fVar, C1726i.f6277a));
    }

    /* renamed from: a */
    private static <T> List<C1753a<T>> m8268a(JsonReader jsonReader, C1757f fVar, C1718aj<T> ajVar) throws IOException {
        return C1736r.m8306a(jsonReader, fVar, 1.0f, ajVar);
    }

    /* renamed from: a */
    private static <T> List<C1753a<T>> m8267a(JsonReader jsonReader, float f, C1757f fVar, C1718aj<T> ajVar) throws IOException {
        return C1736r.m8306a(jsonReader, fVar, f, ajVar);
    }
}
