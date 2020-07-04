package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p057e.C1756d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.ac */
public final class C1711ac implements C1718aj<C1756d> {

    /* renamed from: a */
    public static final C1711ac f6273a = new C1711ac();

    private C1711ac() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7163a(JsonReader jsonReader, float f) throws IOException {
        return m8251b(jsonReader, f);
    }

    /* renamed from: b */
    private static C1756d m8251b(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C1756d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
