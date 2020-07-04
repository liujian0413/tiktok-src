package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.C1811g;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1799l;
import com.facebook.internal.C13926o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.ab */
final class C1710ab {
    /* renamed from: a */
    static C1811g m8250a(JsonReader jsonReader, C1757f fVar) throws IOException {
        String str = null;
        C1789b bVar = null;
        C1789b bVar2 = null;
        C1799l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710 && nextName.equals("tr")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals(C13926o.f36856a)) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    bVar = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 2:
                    bVar2 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 3:
                    lVar = C1720c.m8263a(jsonReader, fVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1811g(str, bVar, bVar2, lVar);
    }
}
