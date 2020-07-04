package com.facebook.keyframes.p732a;

import android.graphics.Color;
import android.util.JsonReader;
import com.facebook.keyframes.model.C14037d;
import com.facebook.keyframes.model.C14037d.C14039a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.f */
public final class C13994f {

    /* renamed from: a */
    static final C13982a<C14037d> f36978a = new C13982a<C14037d>() {
        /* renamed from: c */
        private static C14037d m41330c(JsonReader jsonReader) throws IOException {
            return C13994f.m41329a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41330c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14037d m41329a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14039a aVar = new C14039a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1535541424) {
                if (hashCode == 3076010 && nextName.equals("data")) {
                    c = 1;
                }
            } else if (nextName.equals("start_frame")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aVar.f37069a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37070b = Color.parseColor(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33693a();
    }
}
