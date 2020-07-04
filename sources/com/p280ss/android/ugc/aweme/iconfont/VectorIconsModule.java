package com.p280ss.android.ugc.aweme.iconfont;

import android.graphics.Typeface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.iconfont.VectorIconsModule */
public class VectorIconsModule extends ReactContextBaseJavaModule {
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public String getName() {
        return "RNVectorIconsModule";
    }

    VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x014c A[SYNTHETIC, Splitter:B:27:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015e A[SYNTHETIC, Splitter:B:35:0x015e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0165 A[SYNTHETIC, Splitter:B:41:0x0165] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0151=Splitter:B:32:0x0151, B:24:0x013f=Splitter:B:24:0x013f} */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getImageForFont(java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, com.facebook.react.bridge.Callback r13) {
        /*
            r8 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r8.getReactApplicationContext()
            java.io.File r1 = r0.getCacheDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "@"
            r3.<init>(r4)
            int r4 = (int) r2
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0039
            java.lang.String r4 = java.lang.Integer.toString(r4)
            goto L_0x003d
        L_0x0039:
            java.lang.String r4 = java.lang.Float.toString(r2)
        L_0x003d:
            r3.append(r4)
            java.lang.String r4 = "x"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r4 = r11.intValue()
            float r4 = (float) r4
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = ":"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = ":"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            int r4 = r4.hashCode()
            r5 = 32
            java.lang.String r4 = java.lang.Integer.toString(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = "_"
            r5.append(r1)
            int r11 = r11.intValue()
            java.lang.String r11 = java.lang.Integer.toString(r11)
            r5.append(r11)
            r5.append(r3)
            java.lang.String r11 = ".png"
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "file://"
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r11)
            boolean r11 = r3.exists()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r11 == 0) goto L_0x00c8
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r7] = r5
            r9[r6] = r1
            r13.invoke(r9)
            return
        L_0x00c8:
            com.facebook.react.views.text.ReactFontManager r11 = com.facebook.react.views.text.ReactFontManager.getInstance()
            android.content.res.AssetManager r0 = r0.getAssets()
            android.graphics.Typeface r9 = r11.getTypeface(r9, r7, r0)
            android.graphics.Paint r11 = new android.graphics.Paint
            r11.<init>()
            r11.setTypeface(r9)
            int r9 = r12.intValue()
            r11.setColor(r9)
            float r9 = (float) r2
            r11.setTextSize(r9)
            r11.setAntiAlias(r6)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            int r12 = r10.length()
            r11.getTextBounds(r10, r7, r12, r9)
            int r12 = r9.width()
            int r0 = r9.height()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r0, r2)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r12)
            int r2 = r9.left
            int r2 = -r2
            float r2 = (float) r2
            int r9 = r9.top
            int r9 = -r9
            float r9 = (float) r9
            r0.drawText(r10, r2, r9, r11)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            r9.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0138, IOException -> 0x0134, all -> 0x0130 }
            r11 = 100
            r12.compress(r10, r11, r9)     // Catch:{ FileNotFoundException -> 0x0138, IOException -> 0x0134, all -> 0x0130 }
            r9.flush()     // Catch:{ FileNotFoundException -> 0x0138, IOException -> 0x0134, all -> 0x0130 }
            r9.close()     // Catch:{ FileNotFoundException -> 0x0138, IOException -> 0x0134, all -> 0x0130 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            r9[r7] = r5     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            r9[r6] = r1     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            r13.invoke(r9)     // Catch:{ FileNotFoundException -> 0x0150, IOException -> 0x013e }
            return
        L_0x0130:
            r10 = move-exception
            r5 = r9
            r9 = r10
            goto L_0x0163
        L_0x0134:
            r10 = move-exception
            r5 = r9
            r9 = r10
            goto L_0x013f
        L_0x0138:
            r10 = move-exception
            r5 = r9
            r9 = r10
            goto L_0x0151
        L_0x013c:
            r9 = move-exception
            goto L_0x0163
        L_0x013e:
            r9 = move-exception
        L_0x013f:
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x013c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x013c }
            r10[r7] = r9     // Catch:{ all -> 0x013c }
            r13.invoke(r10)     // Catch:{ all -> 0x013c }
            if (r5 == 0) goto L_0x0162
            r5.close()     // Catch:{ IOException -> 0x014f }
        L_0x014f:
            return
        L_0x0150:
            r9 = move-exception
        L_0x0151:
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x013c }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x013c }
            r10[r7] = r9     // Catch:{ all -> 0x013c }
            r13.invoke(r10)     // Catch:{ all -> 0x013c }
            if (r5 == 0) goto L_0x0162
            r5.close()     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            return
        L_0x0162:
            return
        L_0x0163:
            if (r5 == 0) goto L_0x0168
            r5.close()     // Catch:{ IOException -> 0x0168 }
        L_0x0168:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.iconfont.VectorIconsModule.getImageForFont(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.facebook.react.bridge.Callback):void");
    }
}
