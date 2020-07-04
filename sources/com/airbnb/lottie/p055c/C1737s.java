package com.airbnb.lottie.p055c;

import android.graphics.Rect;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import com.airbnb.lottie.model.p058a.C1799l;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.s */
public final class C1737s {
    /* renamed from: a */
    public static Layer m8309a(C1757f fVar) {
        C1757f fVar2 = fVar;
        Rect rect = fVar.f6337f;
        LayerType layerType = LayerType.PreComp;
        List emptyList = Collections.emptyList();
        C1799l lVar = r5;
        C1799l lVar2 = new C1799l();
        Layer layer = new Layer(Collections.emptyList(), fVar2, "__container", -1, layerType, -1, null, emptyList, lVar, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), MatteType.None, null);
        return layer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0259  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.layer.Layer m8308a(android.util.JsonReader r36, com.airbnb.lottie.C1757f r37) throws java.io.IOException {
        /*
            r7 = r37
            com.airbnb.lottie.model.layer.Layer$MatteType r0 = com.airbnb.lottie.model.layer.Layer.MatteType.None
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r36.beginObject()
            r1 = 0
            r11 = 0
            r2 = 0
            r3 = 0
            r5 = -1
            r30 = r0
            r12 = r1
            r13 = r12
            r14 = r13
            r20 = r14
            r21 = r20
            r28 = r21
            r29 = r28
            r31 = r29
            r16 = r3
            r18 = r5
            r0 = 0
            r1 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x003b:
            boolean r3 = r36.hasNext()
            if (r3 == 0) goto L_0x0314
            java.lang.String r3 = r36.nextName()
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case -995424086: goto L_0x013c;
                case -903568142: goto L_0x0131;
                case 104: goto L_0x0126;
                case 116: goto L_0x011b;
                case 119: goto L_0x0110;
                case 3177: goto L_0x0105;
                case 3233: goto L_0x00fa;
                case 3367: goto L_0x00ef;
                case 3432: goto L_0x00e4;
                case 3519: goto L_0x00d9;
                case 3553: goto L_0x00cd;
                case 3664: goto L_0x00c2;
                case 3669: goto L_0x00b7;
                case 3679: goto L_0x00ab;
                case 3681: goto L_0x009f;
                case 3684: goto L_0x0094;
                case 3705: goto L_0x0088;
                case 3712: goto L_0x007c;
                case 3717: goto L_0x0071;
                case 104415: goto L_0x0066;
                case 108390670: goto L_0x005b;
                case 1441620890: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0146
        L_0x004f:
            java.lang.String r4 = "masksProperties"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 10
            goto L_0x0147
        L_0x005b:
            java.lang.String r4 = "refId"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 2
            goto L_0x0147
        L_0x0066:
            java.lang.String r4 = "ind"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0071:
            java.lang.String r4 = "ty"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 3
            goto L_0x0147
        L_0x007c:
            java.lang.String r4 = "tt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 9
            goto L_0x0147
        L_0x0088:
            java.lang.String r4 = "tm"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 20
            goto L_0x0147
        L_0x0094:
            java.lang.String r4 = "sw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 5
            goto L_0x0147
        L_0x009f:
            java.lang.String r4 = "st"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 15
            goto L_0x0147
        L_0x00ab:
            java.lang.String r4 = "sr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 14
            goto L_0x0147
        L_0x00b7:
            java.lang.String r4 = "sh"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 6
            goto L_0x0147
        L_0x00c2:
            java.lang.String r4 = "sc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 7
            goto L_0x0147
        L_0x00cd:
            java.lang.String r4 = "op"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 19
            goto L_0x0147
        L_0x00d9:
            java.lang.String r4 = "nm"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 0
            goto L_0x0147
        L_0x00e4:
            java.lang.String r4 = "ks"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 8
            goto L_0x0147
        L_0x00ef:
            java.lang.String r4 = "ip"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 18
            goto L_0x0147
        L_0x00fa:
            java.lang.String r4 = "ef"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 13
            goto L_0x0147
        L_0x0105:
            java.lang.String r4 = "cl"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 21
            goto L_0x0147
        L_0x0110:
            java.lang.String r4 = "w"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 16
            goto L_0x0147
        L_0x011b:
            java.lang.String r4 = "t"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 12
            goto L_0x0147
        L_0x0126:
            java.lang.String r4 = "h"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 17
            goto L_0x0147
        L_0x0131:
            java.lang.String r4 = "shapes"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 11
            goto L_0x0147
        L_0x013c:
            java.lang.String r4 = "parent"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0146
            r3 = 4
            goto L_0x0147
        L_0x0146:
            r3 = -1
        L_0x0147:
            switch(r3) {
                case 0: goto L_0x030b;
                case 1: goto L_0x0301;
                case 2: goto L_0x02fa;
                case 3: goto L_0x02e2;
                case 4: goto L_0x02d8;
                case 5: goto L_0x02c7;
                case 6: goto L_0x02b6;
                case 7: goto L_0x02ab;
                case 8: goto L_0x02a3;
                case 9: goto L_0x0295;
                case 10: goto L_0x027d;
                case 11: goto L_0x0263;
                case 12: goto L_0x0204;
                case 13: goto L_0x01a9;
                case 14: goto L_0x01a0;
                case 15: goto L_0x0195;
                case 16: goto L_0x0183;
                case 17: goto L_0x0171;
                case 18: goto L_0x0168;
                case 19: goto L_0x015f;
                case 20: goto L_0x0157;
                case 21: goto L_0x0151;
                default: goto L_0x014a;
            }
        L_0x014a:
            r3 = r36
            r36.skipValue()
            goto L_0x0311
        L_0x0151:
            java.lang.String r13 = r36.nextString()
            goto L_0x003b
        L_0x0157:
            r3 = r36
            com.airbnb.lottie.model.a.b r31 = com.airbnb.lottie.p055c.C1721d.m8265a(r3, r7, r2)
            goto L_0x003b
        L_0x015f:
            r3 = r36
            double r4 = r36.nextDouble()
            float r1 = (float) r4
            goto L_0x003b
        L_0x0168:
            r3 = r36
            double r4 = r36.nextDouble()
            float r0 = (float) r4
            goto L_0x003b
        L_0x0171:
            r3 = r36
            int r4 = r36.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.p056d.C1751f.m8367a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r27 = r4
            goto L_0x003b
        L_0x0183:
            r3 = r36
            int r4 = r36.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.p056d.C1751f.m8367a()
            float r4 = r4 * r5
            int r4 = (int) r4
            r26 = r4
            goto L_0x003b
        L_0x0195:
            r3 = r36
            double r4 = r36.nextDouble()
            float r4 = (float) r4
            r25 = r4
            goto L_0x003b
        L_0x01a0:
            r3 = r36
            double r4 = r36.nextDouble()
            float r15 = (float) r4
            goto L_0x003b
        L_0x01a9:
            r3 = r36
            r36.beginArray()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01b3:
            boolean r5 = r36.hasNext()
            if (r5 == 0) goto L_0x01ee
            r36.beginObject()
        L_0x01bc:
            boolean r5 = r36.hasNext()
            if (r5 == 0) goto L_0x01e9
            java.lang.String r5 = r36.nextName()
            int r2 = r5.hashCode()
            r6 = 3519(0xdbf, float:4.931E-42)
            if (r2 == r6) goto L_0x01cf
            goto L_0x01d9
        L_0x01cf:
            java.lang.String r2 = "nm"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x01d9
            r2 = 0
            goto L_0x01da
        L_0x01d9:
            r2 = -1
        L_0x01da:
            if (r2 == 0) goto L_0x01e1
            r36.skipValue()
        L_0x01df:
            r2 = 0
            goto L_0x01bc
        L_0x01e1:
            java.lang.String r2 = r36.nextString()
            r4.add(r2)
            goto L_0x01df
        L_0x01e9:
            r36.endObject()
            r2 = 0
            goto L_0x01b3
        L_0x01ee:
            r36.endArray()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r2.<init>(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.mo7211a(r2)
            goto L_0x0311
        L_0x0204:
            r3 = r36
            r36.beginObject()
        L_0x0209:
            boolean r2 = r36.hasNext()
            if (r2 == 0) goto L_0x025e
            java.lang.String r2 = r36.nextName()
            int r4 = r2.hashCode()
            r6 = 97
            if (r4 == r6) goto L_0x022a
            r6 = 100
            if (r4 == r6) goto L_0x0220
            goto L_0x0234
        L_0x0220:
            java.lang.String r4 = "d"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0234
            r2 = 0
            goto L_0x0235
        L_0x022a:
            java.lang.String r4 = "a"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0234
            r2 = 1
            goto L_0x0235
        L_0x0234:
            r2 = -1
        L_0x0235:
            switch(r2) {
                case 0: goto L_0x0259;
                case 1: goto L_0x023c;
                default: goto L_0x0238;
            }
        L_0x0238:
            r36.skipValue()
            goto L_0x0209
        L_0x023c:
            r36.beginArray()
            boolean r2 = r36.hasNext()
            if (r2 == 0) goto L_0x024b
            com.airbnb.lottie.model.a.k r2 = com.airbnb.lottie.p055c.C1719b.m8261a(r36, r37)
            r29 = r2
        L_0x024b:
            boolean r2 = r36.hasNext()
            if (r2 == 0) goto L_0x0255
            r36.skipValue()
            goto L_0x024b
        L_0x0255:
            r36.endArray()
            goto L_0x0209
        L_0x0259:
            com.airbnb.lottie.model.a.j r28 = com.airbnb.lottie.p055c.C1721d.m8273f(r36, r37)
            goto L_0x0209
        L_0x025e:
            r36.endObject()
            goto L_0x0311
        L_0x0263:
            r3 = r36
            r36.beginArray()
        L_0x0268:
            boolean r2 = r36.hasNext()
            if (r2 == 0) goto L_0x0278
            com.airbnb.lottie.model.content.b r2 = com.airbnb.lottie.p055c.C1724g.m8278a(r36, r37)
            if (r2 == 0) goto L_0x0268
            r8.add(r2)
            goto L_0x0268
        L_0x0278:
            r36.endArray()
            goto L_0x0311
        L_0x027d:
            r3 = r36
            r36.beginArray()
        L_0x0282:
            boolean r2 = r36.hasNext()
            if (r2 == 0) goto L_0x0290
            com.airbnb.lottie.model.content.Mask r2 = com.airbnb.lottie.p055c.C1739u.m8315a(r36, r37)
            r10.add(r2)
            goto L_0x0282
        L_0x0290:
            r36.endArray()
            goto L_0x0311
        L_0x0295:
            r3 = r36
            com.airbnb.lottie.model.layer.Layer$MatteType[] r2 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
            int r4 = r36.nextInt()
            r30 = r2[r4]
            goto L_0x0311
        L_0x02a3:
            r3 = r36
            com.airbnb.lottie.model.a.l r21 = com.airbnb.lottie.p055c.C1720c.m8263a(r36, r37)
            goto L_0x0311
        L_0x02ab:
            r3 = r36
            java.lang.String r2 = r36.nextString()
            int r24 = android.graphics.Color.parseColor(r2)
            goto L_0x0311
        L_0x02b6:
            r3 = r36
            int r2 = r36.nextInt()
            float r2 = (float) r2
            float r4 = com.airbnb.lottie.p056d.C1751f.m8367a()
            float r2 = r2 * r4
            int r2 = (int) r2
            r23 = r2
            goto L_0x0311
        L_0x02c7:
            r3 = r36
            int r2 = r36.nextInt()
            float r2 = (float) r2
            float r4 = com.airbnb.lottie.p056d.C1751f.m8367a()
            float r2 = r2 * r4
            int r2 = (int) r2
            r22 = r2
            goto L_0x0311
        L_0x02d8:
            r3 = r36
            int r2 = r36.nextInt()
            long r4 = (long) r2
            r18 = r4
            goto L_0x0311
        L_0x02e2:
            r3 = r36
            int r2 = r36.nextInt()
            com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown
            int r4 = r4.ordinal()
            if (r2 >= r4) goto L_0x02f7
            com.airbnb.lottie.model.layer.Layer$LayerType[] r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
            r14 = r4[r2]
            goto L_0x0311
        L_0x02f7:
            com.airbnb.lottie.model.layer.Layer$LayerType r14 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown
            goto L_0x0311
        L_0x02fa:
            r3 = r36
            java.lang.String r20 = r36.nextString()
            goto L_0x0311
        L_0x0301:
            r3 = r36
            int r2 = r36.nextInt()
            long r4 = (long) r2
            r16 = r4
            goto L_0x0311
        L_0x030b:
            r3 = r36
            java.lang.String r12 = r36.nextString()
        L_0x0311:
            r2 = 0
            goto L_0x003b
        L_0x0314:
            r3 = r36
            r36.endObject()
            float r32 = r0 / r15
            float r33 = r1 / r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = (r32 > r11 ? 1 : (r32 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0347
            com.airbnb.lottie.e.a r5 = new com.airbnb.lottie.e.a
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r4 = 0
            r34 = 0
            java.lang.Float r35 = java.lang.Float.valueOf(r32)
            r0 = r5
            r1 = r37
            r9 = r5
            r5 = r34
            r11 = r6
            r6 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            goto L_0x0348
        L_0x0347:
            r11 = r6
        L_0x0348:
            r0 = 0
            int r1 = (r33 > r0 ? 1 : (r33 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x034e
            goto L_0x0352
        L_0x034e:
            float r0 = r7.f6339h
            r33 = r0
        L_0x0352:
            com.airbnb.lottie.e.a r9 = new com.airbnb.lottie.e.a
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r33)
            r0 = r9
            r1 = r37
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            com.airbnb.lottie.e.a r9 = new com.airbnb.lottie.e.a
            r0 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r12.endsWith(r0)
            if (r0 != 0) goto L_0x0399
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x039e
        L_0x0399:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.mo7211a(r0)
        L_0x039e:
            com.airbnb.lottie.model.layer.Layer r32 = new com.airbnb.lottie.model.layer.Layer
            r0 = r32
            r1 = r8
            r2 = r37
            r3 = r12
            r4 = r16
            r6 = r14
            r7 = r18
            r9 = r20
            r33 = r11
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r33
            r22 = r30
            r23 = r31
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p055c.C1737s.m8308a(android.util.JsonReader, com.airbnb.lottie.f):com.airbnb.lottie.model.layer.Layer");
    }
}
