package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.p058a.C1792e;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1753a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.c.a */
public final class C1708a {
    /* renamed from: a */
    public static C1792e m8247a(JsonReader jsonReader, C1757f fVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C1741w.m8317a(jsonReader, fVar));
            }
            jsonReader.endArray();
            C1736r.m8307a(arrayList);
        } else {
            arrayList.add(new C1753a(C1733p.m8296b(jsonReader, C1751f.m8367a())));
        }
        return new C1792e(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[PHI: r1 
      PHI: (r1v4 boolean) = (r1v2 boolean), (r1v5 boolean) binds: [B:16:0x0042, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.p058a.C1800m<android.graphics.PointF, android.graphics.PointF> m8248b(android.util.JsonReader r10, com.airbnb.lottie.C1757f r11) throws java.io.IOException {
        /*
            r10.beginObject()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
            r1 = 0
        L_0x0009:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.END_OBJECT
            if (r5 == r6) goto L_0x006c
            java.lang.String r5 = r10.nextName()
            r6 = -1
            int r7 = r5.hashCode()
            r8 = 107(0x6b, float:1.5E-43)
            r9 = 1
            if (r7 == r8) goto L_0x0037
            switch(r7) {
                case 120: goto L_0x002d;
                case 121: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0041
        L_0x0023:
            java.lang.String r7 = "y"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r7 = "x"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0037:
            java.lang.String r7 = "k"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0041
            r5 = 0
            goto L_0x0042
        L_0x0041:
            r5 = -1
        L_0x0042:
            switch(r5) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0054;
                case 2: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0068
        L_0x0046:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            com.airbnb.lottie.model.a.b r4 = com.airbnb.lottie.p055c.C1721d.m8264a(r10, r11)
            goto L_0x0009
        L_0x0054:
            android.util.JsonToken r5 = r10.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L_0x005e
        L_0x005c:
            r1 = 1
            goto L_0x0068
        L_0x005e:
            com.airbnb.lottie.model.a.b r3 = com.airbnb.lottie.p055c.C1721d.m8264a(r10, r11)
            goto L_0x0009
        L_0x0063:
            com.airbnb.lottie.model.a.e r2 = m8247a(r10, r11)
            goto L_0x0009
        L_0x0068:
            r10.skipValue()
            goto L_0x0009
        L_0x006c:
            r10.endObject()
            if (r1 == 0) goto L_0x0076
            java.lang.String r10 = "Lottie doesn't support expressions."
            r11.mo7211a(r10)
        L_0x0076:
            if (r2 == 0) goto L_0x0079
            return r2
        L_0x0079:
            com.airbnb.lottie.model.a.i r10 = new com.airbnb.lottie.model.a.i
            r10.<init>(r3, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1708a.m8248b(android.util.JsonReader, com.airbnb.lottie.f):com.airbnb.lottie.model.a.m");
    }
}
