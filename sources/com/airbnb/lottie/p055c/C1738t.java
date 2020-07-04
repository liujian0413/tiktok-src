package com.airbnb.lottie.p055c;

import android.support.p022v4.util.C0893e;
import android.support.p022v4.util.C0905l;
import android.util.JsonReader;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.C1803c;
import com.airbnb.lottie.model.C1816d;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.c.t */
public final class C1738t {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.C1757f m8310a(android.util.JsonReader r28) throws java.io.IOException {
        /*
            r0 = r28
            float r1 = com.airbnb.lottie.p056d.C1751f.m8367a()
            android.support.v4.util.e r8 = new android.support.v4.util.e
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            android.support.v4.util.l r11 = new android.support.v4.util.l
            r11.<init>()
            com.airbnb.lottie.f r13 = new com.airbnb.lottie.f
            r13.<init>()
            r28.beginObject()
            r2 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r14 = 0
        L_0x0032:
            boolean r15 = r28.hasNext()
            if (r15 == 0) goto L_0x0139
            java.lang.String r15 = r28.nextName()
            r16 = -1
            int r17 = r15.hashCode()
            r18 = 2
            r19 = 1
            switch(r17) {
                case -1408207997: goto L_0x00a7;
                case -1109732030: goto L_0x009d;
                case 104: goto L_0x0093;
                case 118: goto L_0x0089;
                case 119: goto L_0x007f;
                case 3276: goto L_0x0075;
                case 3367: goto L_0x006b;
                case 3553: goto L_0x0061;
                case 94623709: goto L_0x0056;
                case 97615364: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x00b1
        L_0x004b:
            java.lang.String r3 = "fonts"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 8
            goto L_0x00b2
        L_0x0056:
            java.lang.String r3 = "chars"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 9
            goto L_0x00b2
        L_0x0061:
            java.lang.String r3 = "op"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 3
            goto L_0x00b2
        L_0x006b:
            java.lang.String r3 = "ip"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 2
            goto L_0x00b2
        L_0x0075:
            java.lang.String r3 = "fr"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 4
            goto L_0x00b2
        L_0x007f:
            java.lang.String r3 = "w"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 0
            goto L_0x00b2
        L_0x0089:
            java.lang.String r3 = "v"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 5
            goto L_0x00b2
        L_0x0093:
            java.lang.String r3 = "h"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x009d:
            java.lang.String r3 = "layers"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 6
            goto L_0x00b2
        L_0x00a7:
            java.lang.String r3 = "assets"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 7
            goto L_0x00b2
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            switch(r3) {
                case 0: goto L_0x012f;
                case 1: goto L_0x0125;
                case 2: goto L_0x0116;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00c9;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00c1;
                case 9: goto L_0x00bd;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            r27 = r11
            r26 = r12
            r28.skipValue()
            goto L_0x011f
        L_0x00bd:
            m8311a(r0, r13, r11)
            goto L_0x00cc
        L_0x00c1:
            m8314a(r0, r12)
            goto L_0x00cc
        L_0x00c5:
            m8313a(r0, r13, r9, r10)
            goto L_0x00cc
        L_0x00c9:
            m8312a(r0, r13, r7, r8)
        L_0x00cc:
            r27 = r11
            r26 = r12
            goto L_0x011f
        L_0x00d1:
            java.lang.String r3 = r28.nextString()
            java.lang.String r15 = "\\."
            java.lang.String[] r3 = r3.split(r15)
            r15 = 0
            r16 = r3[r15]
            int r20 = java.lang.Integer.parseInt(r16)
            r15 = r3[r19]
            int r21 = java.lang.Integer.parseInt(r15)
            r3 = r3[r18]
            int r22 = java.lang.Integer.parseInt(r3)
            r23 = 4
            r24 = 4
            r25 = 0
            boolean r3 = com.airbnb.lottie.p056d.C1751f.m8374a(r20, r21, r22, r23, r24, r25)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = "Lottie only supports bodymovin >= 4.4.0"
            r13.mo7211a(r3)
            goto L_0x00cc
        L_0x0100:
            double r14 = r28.nextDouble()
            float r14 = (float) r14
            goto L_0x0032
        L_0x0107:
            r27 = r11
            r26 = r12
            double r11 = r28.nextDouble()
            float r3 = (float) r11
            r6 = 1008981770(0x3c23d70a, float:0.01)
            float r6 = r3 - r6
            goto L_0x011f
        L_0x0116:
            r27 = r11
            r26 = r12
            double r11 = r28.nextDouble()
            float r5 = (float) r11
        L_0x011f:
            r12 = r26
            r11 = r27
            goto L_0x0032
        L_0x0125:
            r27 = r11
            r26 = r12
            int r4 = r28.nextInt()
            goto L_0x0032
        L_0x012f:
            r27 = r11
            r26 = r12
            int r2 = r28.nextInt()
            goto L_0x0032
        L_0x0139:
            r27 = r11
            r26 = r12
            r28.endObject()
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (int) r0
            float r2 = (float) r4
            float r2 = r2 * r1
            int r1 = (int) r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            r2 = r13
            r4 = r5
            r5 = r6
            r6 = r14
            r2.mo7210a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1738t.m8310a(android.util.JsonReader):com.airbnb.lottie.f");
    }

    /* renamed from: a */
    private static void m8314a(JsonReader jsonReader, Map<String, C1803c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 3322014 && nextName.equals("list")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C1803c a = C1728k.m8284a(jsonReader);
                    map.put(a.f6466b, a);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: a */
    private static void m8311a(JsonReader jsonReader, C1757f fVar, C0905l<C1816d> lVar) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C1816d a = C1727j.m8283a(jsonReader, fVar);
            lVar.mo3437b(a.hashCode(), a);
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    private static void m8312a(JsonReader jsonReader, C1757f fVar, List<Layer> list, C0893e<Layer> eVar) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer a = C1737s.m8308a(jsonReader, fVar);
            if (a.f6563e == LayerType.Image) {
                i++;
            }
            list.add(a);
            eVar.mo3333b(a.f6562d, a);
            if (i > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                C1745d.m8323a(sb.toString());
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8313a(android.util.JsonReader r12, com.airbnb.lottie.C1757f r13, java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.model.layer.Layer>> r14, java.util.Map<java.lang.String, com.airbnb.lottie.C1780i> r15) throws java.io.IOException {
        /*
            r12.beginArray()
        L_0x0003:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.support.v4.util.e r1 = new android.support.v4.util.e
            r1.<init>()
            r12.beginObject()
            r2 = 0
            r3 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r5 = 0
            r6 = 0
        L_0x001d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r12.nextName()
            r4 = -1
            int r10 = r3.hashCode()
            r11 = -1109732030(0xffffffffbddad542, float:-0.10685207)
            if (r10 == r11) goto L_0x0078
            r11 = 104(0x68, float:1.46E-43)
            if (r10 == r11) goto L_0x006e
            r11 = 112(0x70, float:1.57E-43)
            if (r10 == r11) goto L_0x0064
            r11 = 117(0x75, float:1.64E-43)
            if (r10 == r11) goto L_0x005a
            r11 = 119(0x77, float:1.67E-43)
            if (r10 == r11) goto L_0x0050
            r11 = 3355(0xd1b, float:4.701E-42)
            if (r10 == r11) goto L_0x0046
            goto L_0x0082
        L_0x0046:
            java.lang.String r10 = "id"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 0
            goto L_0x0083
        L_0x0050:
            java.lang.String r10 = "w"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 2
            goto L_0x0083
        L_0x005a:
            java.lang.String r10 = "u"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 5
            goto L_0x0083
        L_0x0064:
            java.lang.String r10 = "p"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x006e:
            java.lang.String r10 = "h"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 3
            goto L_0x0083
        L_0x0078:
            java.lang.String r10 = "layers"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = -1
        L_0x0083:
            switch(r3) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x009f;
                case 2: goto L_0x0099;
                case 3: goto L_0x0094;
                case 4: goto L_0x008f;
                case 5: goto L_0x008a;
                default: goto L_0x0086;
            }
        L_0x0086:
            r12.skipValue()
            goto L_0x001d
        L_0x008a:
            java.lang.String r9 = r12.nextString()
            goto L_0x001d
        L_0x008f:
            java.lang.String r8 = r12.nextString()
            goto L_0x001d
        L_0x0094:
            int r6 = r12.nextInt()
            goto L_0x001d
        L_0x0099:
            int r5 = r12.nextInt()
            goto L_0x001d
        L_0x009f:
            r12.beginArray()
        L_0x00a2:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00b5
            com.airbnb.lottie.model.layer.Layer r3 = com.airbnb.lottie.p055c.C1737s.m8308a(r12, r13)
            long r10 = r3.f6562d
            r1.mo3333b(r10, r3)
            r0.add(r3)
            goto L_0x00a2
        L_0x00b5:
            r12.endArray()
            goto L_0x001d
        L_0x00ba:
            java.lang.String r7 = r12.nextString()
            goto L_0x001d
        L_0x00c0:
            r12.endObject()
            if (r8 == 0) goto L_0x00d2
            com.airbnb.lottie.i r0 = new com.airbnb.lottie.i
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r1 = r0.f6396c
            r15.put(r1, r0)
            goto L_0x0003
        L_0x00d2:
            r14.put(r7, r0)
            goto L_0x0003
        L_0x00d7:
            r12.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1738t.m8313a(android.util.JsonReader, com.airbnb.lottie.f, java.util.Map, java.util.Map):void");
    }
}
