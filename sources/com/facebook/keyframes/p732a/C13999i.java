package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14045g;
import com.facebook.keyframes.model.C14045g.C14046a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.i */
public final class C13999i {

    /* renamed from: a */
    static final C13982a<C14045g> f36980a = new C13982a<C14045g>() {
        /* renamed from: c */
        private static C14045g m41337c(JsonReader jsonReader) throws IOException {
            return C13999i.m41336a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41337c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14045g m41336a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14046a aVar = new C14046a();
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
                    aVar.f37105a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37106b = C13983b.f36971a.mo33648a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33698a();
    }
}
