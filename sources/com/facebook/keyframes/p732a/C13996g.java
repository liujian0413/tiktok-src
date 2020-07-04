package com.facebook.keyframes.p732a;

import android.graphics.Color;
import android.graphics.Paint.Cap;
import android.util.JsonReader;
import com.facebook.keyframes.model.C14040e;
import com.facebook.keyframes.model.C14040e.C14041a;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.facebook.keyframes.a.g */
public final class C13996g {

    /* renamed from: a */
    static final C13982a<C14040e> f36979a = new C13982a<C14040e>() {
        /* renamed from: c */
        private static C14040e m41333c(JsonReader jsonReader) throws IOException {
            return C13996g.m41332a(jsonReader);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo33649b(JsonReader jsonReader) throws IOException {
            return m41333c(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14040e m41332a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14041a aVar = new C14041a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1923169788:
                    if (nextName.equals("animation_group")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1833928446:
                    if (nextName.equals("effects")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1806353256:
                    if (nextName.equals("from_frame")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1530780935:
                    if (nextName.equals("timing_curves")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1446309207:
                    if (nextName.equals("to_frame")) {
                        c = 5;
                        break;
                    }
                    break;
                case -259686756:
                    if (nextName.equals("stroke_color")) {
                        c = 2;
                        break;
                    }
                    break;
                case -247981657:
                    if (nextName.equals("fill_color")) {
                        c = 1;
                        break;
                    }
                    break;
                case -241402625:
                    if (nextName.equals("stroke_width")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 94742904:
                    if (nextName.equals("class")) {
                        c = 12;
                        break;
                    }
                    break;
                case 152226438:
                    if (nextName.equals("key_frames")) {
                        c = 6;
                        break;
                    }
                    break;
                case 574151256:
                    if (nextName.equals("feature_animations")) {
                        c = 9;
                        break;
                    }
                    break;
                case 725843758:
                    if (nextName.equals("stroke_line_cap")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f37087a = jsonReader.nextString();
                    break;
                case 1:
                    aVar.f37088b = Color.parseColor(jsonReader.nextString());
                    break;
                case 2:
                    aVar.f37089c = Color.parseColor(jsonReader.nextString());
                    break;
                case 3:
                    aVar.f37090d = (float) jsonReader.nextDouble();
                    break;
                case 4:
                    aVar.f37091e = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    aVar.f37092f = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    aVar.f37093g = C13999i.f36980a.mo33648a(jsonReader);
                    break;
                case 7:
                    aVar.f37094h = C13983b.m41310b(jsonReader);
                    break;
                case 8:
                    aVar.f37095i = jsonReader.nextInt();
                    break;
                case 9:
                    aVar.f37097k = C13988c.f36975a.mo33648a(jsonReader);
                    break;
                case 10:
                    aVar.f37099m = C13998h.m41335a(jsonReader);
                    break;
                case 11:
                    aVar.f37096j = Cap.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                    break;
                case 12:
                    aVar.f37100n = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33696a();
    }
}
