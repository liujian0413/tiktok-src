package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.drawee.generic.c */
public final class C13440c {
    /* renamed from: a */
    private static RoundingParams m39475a(C13439b bVar) {
        if (bVar.f35644t == null) {
            bVar.mo32915a(new RoundingParams());
        }
        return bVar.f35644t;
    }

    /* renamed from: a */
    public static C13439b m39476a(Context context, AttributeSet attributeSet) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        C13439b a = m39477a(new C13439b(context.getResources()), context, attributeSet);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return a;
    }

    /* renamed from: a */
    private static C13423b m39474a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return C13423b.f35593a;
            case 1:
                return C13423b.f35594b;
            case 2:
                return C13423b.f35595c;
            case 3:
                return C13423b.f35596d;
            case 4:
                return C13423b.f35597e;
            case 5:
                return C13423b.f35598f;
            case 6:
                return C13423b.f35599g;
            case 7:
                return C13423b.f35600h;
            case 8:
                return C13423b.f35601i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: a */
    private static Drawable m39473a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ce, code lost:
        if (r14 != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e9, code lost:
        if (r15 != false) goto L_0x01ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.drawee.generic.C13439b m39477a(com.facebook.drawee.generic.C13439b r18, android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            if (r2 == 0) goto L_0x0206
            int[] r6 = com.facebook.drawee.R$styleable.GenericDraweeHierarchy
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r6)
            int r7 = r2.getIndexCount()     // Catch:{ all -> 0x01f0 }
            r5 = 0
            r6 = 1
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 0
        L_0x001e:
            if (r8 >= r7) goto L_0x019c
            int r3 = r2.getIndex(r8)     // Catch:{ all -> 0x01f0 }
            if (r3 != 0) goto L_0x0032
            com.facebook.drawee.drawable.p$b r3 = m39474a(r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32927e(r3)     // Catch:{ all -> 0x01f0 }
        L_0x002d:
            r17 = r16
        L_0x002f:
            r4 = 0
            goto L_0x0194
        L_0x0032:
            r4 = 6
            if (r3 != r4) goto L_0x003d
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32913a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x003d:
            r4 = 8
            if (r3 != r4) goto L_0x0049
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32929g(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0049:
            r4 = 10
            if (r3 != r4) goto L_0x0055
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32924d(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0055:
            r4 = 2
            if (r3 != r4) goto L_0x0061
            r4 = 0
            int r3 = r2.getInt(r3, r4)     // Catch:{ all -> 0x01f0 }
            r0.mo32910a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0061:
            r4 = 28
            if (r3 != r4) goto L_0x006e
            r4 = 0
            float r3 = r2.getFloat(r3, r4)     // Catch:{ all -> 0x01f0 }
            r0.mo32909a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x006e:
            r4 = 7
            if (r3 != r4) goto L_0x0079
            com.facebook.drawee.drawable.p$b r3 = m39474a(r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32914a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0079:
            r4 = 12
            if (r3 != r4) goto L_0x0085
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32918b(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0085:
            r4 = 13
            if (r3 != r4) goto L_0x0091
            com.facebook.drawee.drawable.p$b r3 = m39474a(r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32919b(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x0091:
            r4 = 3
            if (r3 != r4) goto L_0x009c
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32921c(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x009c:
            r4 = 4
            if (r3 != r4) goto L_0x00a7
            com.facebook.drawee.drawable.p$b r3 = m39474a(r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32922c(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x00a7:
            r4 = 11
            if (r3 != r4) goto L_0x00b4
            com.facebook.drawee.drawable.p$b r3 = m39474a(r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32925d(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x00b4:
            r4 = 9
            if (r3 != r4) goto L_0x00bf
            int r5 = r2.getInteger(r3, r5)     // Catch:{ all -> 0x01f0 }
        L_0x00bc:
            r4 = 0
            goto L_0x0196
        L_0x00bf:
            r4 = 1
            if (r3 != r4) goto L_0x00cb
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32926e(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x00cb:
            r4 = 5
            if (r3 != r4) goto L_0x00d7
            android.graphics.drawable.Drawable r3 = m39473a(r1, r2, r3)     // Catch:{ all -> 0x01f0 }
            r0.mo32928f(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x00d7:
            r4 = 14
            if (r3 != r4) goto L_0x00e9
            com.facebook.drawee.generic.RoundingParams r4 = m39475a(r18)     // Catch:{ all -> 0x01f0 }
            r1 = 0
            boolean r3 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x01f0 }
            r4.mo32884a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002d
        L_0x00e9:
            r1 = 24
            if (r3 != r1) goto L_0x00f4
            r4 = r16
            int r16 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01f0 }
            goto L_0x00bc
        L_0x00f4:
            r4 = r16
            r1 = 20
            if (r3 != r1) goto L_0x0102
            boolean r1 = r2.getBoolean(r3, r9)     // Catch:{ all -> 0x01f0 }
            r9 = r1
        L_0x00ff:
            r16 = r4
            goto L_0x00bc
        L_0x0102:
            r1 = 21
            if (r3 != r1) goto L_0x010c
            boolean r1 = r2.getBoolean(r3, r12)     // Catch:{ all -> 0x01f0 }
            r12 = r1
            goto L_0x00ff
        L_0x010c:
            r1 = 16
            if (r3 != r1) goto L_0x0116
            boolean r1 = r2.getBoolean(r3, r6)     // Catch:{ all -> 0x01f0 }
            r6 = r1
            goto L_0x00ff
        L_0x0116:
            r1 = 17
            if (r3 != r1) goto L_0x0120
            boolean r1 = r2.getBoolean(r3, r13)     // Catch:{ all -> 0x01f0 }
            r13 = r1
            goto L_0x00ff
        L_0x0120:
            r1 = 22
            if (r3 != r1) goto L_0x012a
            boolean r1 = r2.getBoolean(r3, r10)     // Catch:{ all -> 0x01f0 }
            r10 = r1
            goto L_0x00ff
        L_0x012a:
            r1 = 19
            if (r3 != r1) goto L_0x0134
            boolean r1 = r2.getBoolean(r3, r11)     // Catch:{ all -> 0x01f0 }
            r11 = r1
            goto L_0x00ff
        L_0x0134:
            r1 = 18
            if (r3 != r1) goto L_0x013e
            boolean r1 = r2.getBoolean(r3, r15)     // Catch:{ all -> 0x01f0 }
            r15 = r1
            goto L_0x00ff
        L_0x013e:
            r1 = 15
            if (r3 != r1) goto L_0x0148
            boolean r1 = r2.getBoolean(r3, r14)     // Catch:{ all -> 0x01f0 }
            r14 = r1
            goto L_0x00ff
        L_0x0148:
            r1 = 23
            if (r3 != r1) goto L_0x015c
            com.facebook.drawee.generic.RoundingParams r1 = m39475a(r18)     // Catch:{ all -> 0x01f0 }
            r17 = r4
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x01f0 }
            r1.mo32881a(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002f
        L_0x015c:
            r17 = r4
            r1 = 27
            if (r3 != r1) goto L_0x0171
            com.facebook.drawee.generic.RoundingParams r1 = m39475a(r18)     // Catch:{ all -> 0x01f0 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01f0 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f0 }
            r1.mo32886c(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002f
        L_0x0171:
            r1 = 25
            if (r3 != r1) goto L_0x0183
            com.facebook.drawee.generic.RoundingParams r1 = m39475a(r18)     // Catch:{ all -> 0x01f0 }
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x01f0 }
            r1.mo32885b(r3)     // Catch:{ all -> 0x01f0 }
            goto L_0x002f
        L_0x0183:
            r1 = 26
            if (r3 != r1) goto L_0x002f
            com.facebook.drawee.generic.RoundingParams r1 = m39475a(r18)     // Catch:{ all -> 0x01f0 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x01f0 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f0 }
            r1.mo32887d(r3)     // Catch:{ all -> 0x01f0 }
        L_0x0194:
            r16 = r17
        L_0x0196:
            int r8 = r8 + 1
            r1 = r19
            goto L_0x001e
        L_0x019c:
            r17 = r16
            r4 = 0
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x01d1
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01d2
            if (r9 == 0) goto L_0x01bd
            if (r11 == 0) goto L_0x01bd
            r1 = 1
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            if (r12 == 0) goto L_0x01c4
            if (r10 == 0) goto L_0x01c4
            r3 = 1
            goto L_0x01c5
        L_0x01c4:
            r3 = 0
        L_0x01c5:
            if (r13 == 0) goto L_0x01cb
            if (r15 == 0) goto L_0x01cb
            r7 = 1
            goto L_0x01cc
        L_0x01cb:
            r7 = 0
        L_0x01cc:
            if (r6 == 0) goto L_0x01ec
            if (r14 == 0) goto L_0x01ec
            goto L_0x01ed
        L_0x01d1:
            r2 = 1
        L_0x01d2:
            if (r9 == 0) goto L_0x01d8
            if (r10 == 0) goto L_0x01d8
            r1 = 1
            goto L_0x01d9
        L_0x01d8:
            r1 = 0
        L_0x01d9:
            if (r12 == 0) goto L_0x01df
            if (r11 == 0) goto L_0x01df
            r3 = 1
            goto L_0x01e0
        L_0x01df:
            r3 = 0
        L_0x01e0:
            if (r13 == 0) goto L_0x01e6
            if (r14 == 0) goto L_0x01e6
            r7 = 1
            goto L_0x01e7
        L_0x01e6:
            r7 = 0
        L_0x01e7:
            if (r6 == 0) goto L_0x01ec
            if (r15 == 0) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r2 = 0
        L_0x01ed:
            r4 = r17
            goto L_0x020c
        L_0x01f0:
            r0 = move-exception
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x0205
            android.content.res.Resources r1 = r19.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r1.getLayoutDirection()
        L_0x0205:
            throw r0
        L_0x0206:
            r2 = 1
            r4 = 0
            r1 = 1
            r3 = 1
            r5 = 0
            r7 = 1
        L_0x020c:
            android.graphics.drawable.Drawable r6 = r0.f35636l
            if (r6 == 0) goto L_0x021c
            if (r5 <= 0) goto L_0x021c
            com.facebook.drawee.drawable.b r6 = new com.facebook.drawee.drawable.b
            android.graphics.drawable.Drawable r8 = r0.f35636l
            r6.<init>(r8, r5)
            r0.mo32924d(r6)
        L_0x021c:
            if (r4 <= 0) goto L_0x0239
            com.facebook.drawee.generic.RoundingParams r5 = m39475a(r18)
            if (r1 == 0) goto L_0x0226
            float r1 = (float) r4
            goto L_0x0227
        L_0x0226:
            r1 = 0
        L_0x0227:
            if (r3 == 0) goto L_0x022b
            float r3 = (float) r4
            goto L_0x022c
        L_0x022b:
            r3 = 0
        L_0x022c:
            if (r7 == 0) goto L_0x0230
            float r6 = (float) r4
            goto L_0x0231
        L_0x0230:
            r6 = 0
        L_0x0231:
            if (r2 == 0) goto L_0x0235
            float r2 = (float) r4
            goto L_0x0236
        L_0x0235:
            r2 = 0
        L_0x0236:
            r5.mo32880a(r1, r3, r6, r2)
        L_0x0239:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.C13440c.m39477a(com.facebook.drawee.generic.b, android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.b");
    }
}
