package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14042f;
import com.facebook.keyframes.model.C14042f.C14044a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.h */
public final class C13998h {
    /* renamed from: a */
    public static C14042f m41335a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14044a aVar = new C14044a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 89650992 && nextName.equals("gradient")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                aVar.f37102a = C14002k.m41340a(jsonReader);
            }
        }
        jsonReader.endObject();
        return aVar.mo33697a();
    }
}
