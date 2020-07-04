package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.p058a.C1789b;
import com.facebook.appevents.C13192m;
import com.facebook.internal.C13926o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.ai */
final class C1717ai {
    /* renamed from: a */
    static ShapeTrimPath m8259a(JsonReader jsonReader, C1757f fVar) throws IOException {
        String str = null;
        Type type = null;
        C1789b bVar = null;
        C1789b bVar2 = null;
        C1789b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 3;
                            }
                        } else if (nextName.equals("s")) {
                            c = 0;
                        }
                    } else if (nextName.equals(C13926o.f36856a)) {
                        c = 2;
                    }
                } else if (nextName.equals(C13192m.f34940a)) {
                    c = 4;
                }
            } else if (nextName.equals("e")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    bVar = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 1:
                    bVar2 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 2:
                    bVar3 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    type = Type.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        ShapeTrimPath shapeTrimPath = new ShapeTrimPath(str, type, bVar, bVar2, bVar3);
        return shapeTrimPath;
    }
}
