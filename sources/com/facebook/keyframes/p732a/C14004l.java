package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import com.facebook.keyframes.model.C14052j;
import com.facebook.keyframes.model.C14052j.C14054a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.facebook.keyframes.a.l */
public final class C14004l {
    /* renamed from: a */
    public static C14052j m41344a(InputStream inputStream) throws IOException {
        return m41343a(new JsonReader(new InputStreamReader(inputStream)));
    }

    /* renamed from: a */
    private static C14052j m41343a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14054a aVar = new C14054a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1872643448:
                    if (nextName.equals("canvas_size")) {
                        c = 4;
                        break;
                    }
                    break;
                case -290659267:
                    if (nextName.equals("features")) {
                        c = 2;
                        break;
                    }
                    break;
                case -270583694:
                    if (nextName.equals("frame_rate")) {
                        c = 0;
                        break;
                    }
                    break;
                case 106079:
                    if (nextName.equals("key")) {
                        c = 5;
                        break;
                    }
                    break;
                case 511278831:
                    if (nextName.equals("animation_groups")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1301359490:
                    if (nextName.equals("animation_frame_count")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f37122a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37123b = jsonReader.nextInt();
                    break;
                case 2:
                    aVar.f37124c = C13996g.f36979a.mo33648a(jsonReader);
                    break;
                case 3:
                    aVar.f37125d = C13992e.f36977a.mo33648a(jsonReader);
                    break;
                case 4:
                    aVar.f37126e = C13983b.m41308a(jsonReader);
                    break;
                case 5:
                    aVar.f37127f = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo33703a();
    }
}
