package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14050i;
import com.facebook.keyframes.model.C14050i.C14051a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.j */
public final class C14001j {
    /* renamed from: a */
    public static C14050i m41339a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14051a aVar = new C14051a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1530780935) {
                if (hashCode == 594928386 && nextName.equals("key_values")) {
                    c = 0;
                }
            } else if (nextName.equals("timing_curves")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    aVar.f37114a = C13994f.f36978a.mo33648a(jsonReader);
                    break;
                case 1:
                    aVar.f37115b = C13983b.m41310b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33701a();
    }
}
