package com.airbnb.lottie.p055c;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.y */
public final class C1743y implements C1718aj<PointF> {

    /* renamed from: a */
    public static final C1743y f6284a = new C1743y();

    private C1743y() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7163a(JsonReader jsonReader, float f) throws IOException {
        return m8320b(jsonReader, f);
    }

    /* renamed from: b */
    private static PointF m8320b(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C1733p.m8296b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C1733p.m8296b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder("Cannot convert json to point. Next token is ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }
}
