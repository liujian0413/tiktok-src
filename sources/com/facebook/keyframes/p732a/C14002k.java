package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14048h;
import com.facebook.keyframes.model.C14048h.C14049a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.k */
public final class C14002k {

    /* renamed from: a */
    static final C13982a<C14048h> f36981a = new C13982a<C14048h>() {
        /* renamed from: c */
        private static C14048h m41341c(JsonReader jsonReader) throws IOException {
            return C14002k.m41340a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41341c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14048h m41340a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14049a aVar = new C14049a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 1324875910) {
                if (hashCode == 1981251071 && nextName.equals("color_end")) {
                    c = 1;
                }
            } else if (nextName.equals("color_start")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aVar.f37110a = C14001j.m41339a(jsonReader);
                    break;
                case 1:
                    aVar.f37111b = C14001j.m41339a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33700a();
    }
}
