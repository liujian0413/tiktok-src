package com.facebook.keyframes.p732a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.keyframes.a.a */
public abstract class C13982a<T> {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo33649b(JsonReader jsonReader) throws IOException;

    /* renamed from: a */
    public final List<T> mo33648a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(mo33649b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
