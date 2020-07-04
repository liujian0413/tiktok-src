package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.model.C1803c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.k */
final class C1728k {
    /* renamed from: a */
    static C1803c m8284a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1866931350) {
                if (hashCode != -1408684838) {
                    if (hashCode != -1294566165) {
                        if (hashCode == 96619537 && nextName.equals("fName")) {
                            c = 1;
                        }
                    } else if (nextName.equals("fStyle")) {
                        c = 2;
                    }
                } else if (nextName.equals("ascent")) {
                    c = 3;
                }
            } else if (nextName.equals("fFamily")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str3 = jsonReader.nextString();
                    break;
                case 3:
                    f = (float) jsonReader.nextDouble();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C1803c(str, str2, str3, f);
    }
}
