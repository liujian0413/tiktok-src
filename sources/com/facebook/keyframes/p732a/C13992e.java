package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14035c;
import com.facebook.keyframes.model.C14035c.C14036a;
import java.io.IOException;

/* renamed from: com.facebook.keyframes.a.e */
public final class C13992e {

    /* renamed from: a */
    static final C13982a<C14035c> f36977a = new C13982a<C14035c>() {
        /* renamed from: c */
        private static C14035c m41327c(JsonReader jsonReader) throws IOException {
            return C13992e.m41326a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41327c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14035c m41326a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14036a aVar = new C14036a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 314070383) {
                if (hashCode != 506361563) {
                    if (hashCode == 1394981546 && nextName.equals("parent_group")) {
                        c = 1;
                    }
                } else if (nextName.equals("group_id")) {
                    c = 0;
                }
            } else if (nextName.equals("animations")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    aVar.f37064a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37065b = jsonReader.nextInt();
                    break;
                case 2:
                    aVar.f37066c = C13988c.f36975a.mo33648a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33692a();
    }
}
