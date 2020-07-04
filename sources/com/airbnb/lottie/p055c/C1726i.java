package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.i */
public final class C1726i implements C1718aj<Float> {

    /* renamed from: a */
    public static final C1726i f6277a = new C1726i();

    private C1726i() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7163a(JsonReader jsonReader, float f) throws IOException {
        return m8281b(jsonReader, f);
    }

    /* renamed from: b */
    private static Float m8281b(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(C1733p.m8295b(jsonReader) * f);
    }
}
