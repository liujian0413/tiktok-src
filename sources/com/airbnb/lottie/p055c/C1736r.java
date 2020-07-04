package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.p057e.C1753a;
import com.p280ss.android.vesdk.C45323k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.r */
final class C1736r {
    /* renamed from: a */
    public static void m8307a(List<? extends C1753a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1753a aVar = (C1753a) list.get(i2);
            i2++;
            aVar.f6315f = Float.valueOf(((C1753a) list.get(i2)).f6314e);
        }
        C1753a aVar2 = (C1753a) list.get(i);
        if (aVar2.f6311b == null) {
            list.remove(aVar2);
        }
    }

    /* renamed from: a */
    static <T> List<C1753a<T>> m8306a(JsonReader jsonReader, C1757f fVar, float f, C1718aj<T> ajVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            fVar.mo7211a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals(C45323k.f116730a)) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C1735q.m8302a(jsonReader, fVar, f, ajVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C1735q.m8302a(jsonReader, fVar, f, ajVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C1735q.m8302a(jsonReader, fVar, f, ajVar, false));
            }
        }
        jsonReader.endObject();
        m8307a(arrayList);
        return arrayList;
    }
}
