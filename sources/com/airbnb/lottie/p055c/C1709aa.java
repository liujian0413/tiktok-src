package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.C1810f;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1793f;
import com.airbnb.lottie.model.p058a.C1800m;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.aa */
final class C1709aa {
    /* renamed from: a */
    static C1810f m8249a(JsonReader jsonReader, C1757f fVar) throws IOException {
        String str = null;
        C1800m mVar = null;
        C1793f fVar2 = null;
        C1789b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals("r")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals("s")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("p")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mVar = C1708a.m8248b(jsonReader, fVar);
                    break;
                case 2:
                    fVar2 = C1721d.m8270c(jsonReader, fVar);
                    break;
                case 3:
                    bVar = C1721d.m8264a(jsonReader, fVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C1810f(str, mVar, fVar2, bVar);
    }
}
