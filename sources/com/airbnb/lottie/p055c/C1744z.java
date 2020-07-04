package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1800m;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.z */
final class C1744z {
    /* renamed from: a */
    static PolystarShape m8322a(JsonReader jsonReader, C1757f fVar) throws IOException {
        String str = null;
        Type type = null;
        C1789b bVar = null;
        C1800m mVar = null;
        C1789b bVar2 = null;
        C1789b bVar3 = null;
        C1789b bVar4 = null;
        C1789b bVar5 = null;
        C1789b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        c = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals(C40427a.f105096d)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type = Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 3:
                    mVar = C1708a.m8248b(jsonReader, fVar);
                    break;
                case 4:
                    bVar2 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 5:
                    bVar4 = C1721d.m8264a(jsonReader, fVar);
                    break;
                case 6:
                    bVar6 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                case 7:
                    bVar3 = C1721d.m8264a(jsonReader, fVar);
                    break;
                case 8:
                    bVar5 = C1721d.m8265a(jsonReader, fVar, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PolystarShape polystarShape = new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
        return polystarShape;
    }
}
