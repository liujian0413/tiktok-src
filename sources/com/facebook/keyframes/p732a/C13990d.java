package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14032b;
import com.facebook.keyframes.model.C14032b.C14034a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.d */
public final class C13990d {

    /* renamed from: a */
    static final C13982a<C14032b> f36976a = new C13982a<C14032b>() {
        /* renamed from: c */
        private static C14032b m41324c(JsonReader jsonReader) throws IOException {
            return C13990d.m41323a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41324c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14032b m41323a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14034a aVar = new C14034a();
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
                    aVar.f37058a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37059b = C13983b.m41308a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33690a();
    }
}
