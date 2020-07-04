package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.o */
public final class C1732o implements C1718aj<Integer> {

    /* renamed from: a */
    public static final C1732o f6279a = new C1732o();

    private C1732o() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7163a(JsonReader jsonReader, float f) throws IOException {
        return m8291b(jsonReader, f);
    }

    /* renamed from: b */
    private static Integer m8291b(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C1733p.m8295b(jsonReader) * f));
    }
}
