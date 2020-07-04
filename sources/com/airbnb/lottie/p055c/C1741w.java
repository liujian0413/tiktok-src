package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.p051a.p053b.C1695h;
import com.airbnb.lottie.p056d.C1751f;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.w */
final class C1741w {
    /* renamed from: a */
    static C1695h m8317a(JsonReader jsonReader, C1757f fVar) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new C1695h(fVar, C1735q.m8302a(jsonReader, fVar, C1751f.m8367a(), C1742x.f6283a, z));
    }
}
