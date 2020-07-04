package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.C1806b;
import com.airbnb.lottie.model.content.C1814j;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.c.af */
final class C1714af {
    /* renamed from: a */
    static C1814j m8256a(JsonReader jsonReader, C1757f fVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3371) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("it")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C1806b a = C1724g.m8278a(jsonReader, fVar);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1814j(str, arrayList);
    }
}
