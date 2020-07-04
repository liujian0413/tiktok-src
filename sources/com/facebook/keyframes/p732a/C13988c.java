package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.KFAnimation;
import com.facebook.keyframes.model.KFAnimation.C14030a;
import com.facebook.keyframes.model.KFAnimation.PropertyType;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.facebook.keyframes.a.c */
public final class C13988c {

    /* renamed from: a */
    static final C13982a<KFAnimation> f36975a = new C13982a<KFAnimation>() {
        /* renamed from: c */
        private static KFAnimation m41321c(JsonReader jsonReader) throws IOException {
            return C13988c.m41320a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41321c(jsonReader);
        }
    };

    /* renamed from: a */
    public static KFAnimation m41320a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14030a aVar = new C14030a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1530780935) {
                if (hashCode != -1413299531) {
                    if (hashCode != -993141291) {
                        if (hashCode == 594928386 && nextName.equals("key_values")) {
                            c = 1;
                        }
                    } else if (nextName.equals("property")) {
                        c = 0;
                    }
                } else if (nextName.equals("anchor")) {
                    c = 3;
                }
            } else if (nextName.equals("timing_curves")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    aVar.f37052a = PropertyType.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                    break;
                case 1:
                    aVar.f37053b = C13990d.f36976a.mo33648a(jsonReader);
                    break;
                case 2:
                    aVar.f37054c = C13983b.m41310b(jsonReader);
                    break;
                case 3:
                    aVar.f37055d = C13983b.m41308a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33688a();
    }
}
