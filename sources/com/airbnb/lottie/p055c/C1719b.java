package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.p058a.C1788a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1798k;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.b */
public final class C1719b {
    /* renamed from: a */
    public static C1798k m8261a(JsonReader jsonReader, C1757f fVar) throws IOException {
        jsonReader.beginObject();
        C1798k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 97 && nextName.equals("a")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                kVar = m8262b(jsonReader, fVar);
            }
        }
        jsonReader.endObject();
        if (kVar == null) {
            return new C1798k(null, null, null, null);
        }
        return kVar;
    }

    /* renamed from: b */
    private static C1798k m8262b(JsonReader jsonReader, C1757f fVar) throws IOException {
        jsonReader.beginObject();
        C1788a aVar = null;
        C1788a aVar2 = null;
        C1789b bVar = null;
        C1789b bVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName.equals("sw")) {
                            c = 2;
                        }
                    } else if (nextName.equals("sc")) {
                        c = 1;
                    }
                } else if (nextName.equals("fc")) {
                    c = 0;
                }
            } else if (nextName.equals("t")) {
                c = 3;
            }
            switch (c) {
                case 0:
                    aVar = C1721d.m8274g(jsonReader, fVar);
                    break;
                case 1:
                    aVar2 = C1721d.m8274g(jsonReader, fVar);
                    break;
                case 2:
                    bVar = C1721d.m8264a(jsonReader, fVar);
                    break;
                case 3:
                    bVar2 = C1721d.m8264a(jsonReader, fVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C1798k(aVar, aVar2, bVar, bVar2);
    }
}
