package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.TextPaint;
import java.util.regex.Pattern;

public class TextMeshUtils {
    private static float getDeviceDpi() {
        return (float) Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9 A[SYNTHETIC, Splitter:B:44:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0 A[SYNTHETIC, Splitter:B:52:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getAndroidSystemFontPaths() {
        /*
            r0 = 0
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x00cd, all -> 0x00c4 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00cd, all -> 0x00c4 }
            java.lang.String r3 = "/system/etc/fonts.xml"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cd, all -> 0x00c4 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cd, all -> 0x00c4 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00cd, all -> 0x00c4 }
            java.lang.String r2 = "utf-8"
            r1.setInput(r3, r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            int r2 = r1.getEventType()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r4.<init>()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r5.<init>()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r6 = r0
        L_0x0025:
            r7 = 1
            if (r2 == r7) goto L_0x00b5
            switch(r2) {
                case 2: goto L_0x00a0;
                case 3: goto L_0x0034;
                case 4: goto L_0x002d;
                default: goto L_0x002b;
            }     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
        L_0x002b:
            goto L_0x00af
        L_0x002d:
            java.lang.String r2 = r1.getText()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
        L_0x0031:
            r6 = r2
            goto L_0x00af
        L_0x0034:
            java.lang.String r2 = "family"
            java.lang.String r7 = r1.getName()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r2 == 0) goto L_0x0081
            r2 = -1
            r7 = 0
            r8 = 0
        L_0x0043:
            int r9 = r5.size()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r8 >= r9) goto L_0x005c
            java.lang.Object r9 = r5.get(r8)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r10 = "Regular"
            boolean r9 = r9.contains(r10)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r9 == 0) goto L_0x0059
            r2 = r8
            goto L_0x005c
        L_0x0059:
            int r8 = r8 + 1
            goto L_0x0043
        L_0x005c:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r9 = "/system/fonts/"
            r8.<init>(r9)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r2 < 0) goto L_0x0073
            java.lang.Object r2 = r5.get(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r2 = r8.concat(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r4.add(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            goto L_0x00af
        L_0x0073:
            java.lang.Object r2 = r5.get(r7)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String r2 = r8.concat(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r4.add(r2)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            goto L_0x00af
        L_0x0081:
            java.lang.String r2 = "font"
            java.lang.String r7 = r1.getName()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r2 == 0) goto L_0x0091
            r5.add(r6)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            goto L_0x00af
        L_0x0091:
            java.lang.String r2 = "familyset"
            java.lang.String r7 = r1.getName()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r2 == 0) goto L_0x00af
            java.lang.String r2 = "ending"
            goto L_0x0031
        L_0x00a0:
            java.lang.String r2 = "family"
            java.lang.String r7 = r1.getName()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            if (r2 == 0) goto L_0x00af
            r5.clear()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
        L_0x00af:
            int r2 = r1.next()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            goto L_0x0025
        L_0x00b5:
            int r1 = r4.size()     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r4.toArray(r1)     // Catch:{ Exception -> 0x00ce, all -> 0x00c2 }
            r3.close()     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            return r1
        L_0x00c2:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c4:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x00c7:
            if (r3 == 0) goto L_0x00cc
            r3.close()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            throw r0
        L_0x00cd:
            r3 = r0
        L_0x00ce:
            if (r3 == 0) goto L_0x00d3
            r3.close()     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.utils.TextMeshUtils.getAndroidSystemFontPaths():java.lang.String[]");
    }

    public static boolean isNumOrLetters(String str) {
        return Pattern.compile("^[A-Za-z0-9_]+$").matcher(str).matches();
    }

    private static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Style.FILL);
        textPaint.setTextAlign(Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(str, (float) (-rect.left), (float) (-rect.top), textPaint);
        canvas.save(31);
        canvas.restore();
        return createBitmap;
    }

    private static int drawKernedText(Canvas canvas, String str, float f, float f2, Paint paint, int i) {
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        String str2 = str;
        float f3 = f2;
        Paint paint2 = paint;
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", new Object[]{Integer.valueOf(i)});
        System.out.printf("the text length is: %d\n", new Object[]{Integer.valueOf(str.length())});
        float f4 = f;
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            char charAt = str2.charAt(i4);
            String valueOf = String.valueOf(charAt);
            Math.round(paint2.measureText(String.valueOf(charAt)));
            if (charAt > 55296) {
                i4++;
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(charAt));
                sb.append(str2.charAt(i4));
                String sb2 = sb.toString();
                if (i4 != 1) {
                    paint2.getTextBounds(str2, i4, i4 + 1, rect);
                    rect.width();
                }
                int width = rect.width() + (i / 2);
                f4 += (float) width;
                i5 += width;
                if (canvas2 != null) {
                    canvas2.drawText(sb2, f4, f3, paint2);
                }
            } else {
                if (charAt == ' ') {
                    i2 = Math.round(paint2.measureText(String.valueOf(str2.charAt(i4)))) + i;
                } else {
                    paint2.getTextBounds(str2, i4, i4 + 1, rect);
                    if (charAt >= 128) {
                        i3 = rect.width() + (i / 2);
                        System.out.printf("%s is not NumOrLetters\n", new Object[]{Character.valueOf(charAt)});
                    } else if (isNumOrLetters(valueOf)) {
                        i3 = rect.width() + i;
                        System.out.printf("%s is NumOrLetters\n", new Object[]{Character.valueOf(charAt)});
                    } else {
                        i2 = rect.width() + (i * 2);
                        System.out.printf("%s is: %d, space is: %d, text is %d\n", new Object[]{Character.valueOf(str2.charAt(i4)), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(rect.width())});
                    }
                    i2 = i3;
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", new Object[]{Character.valueOf(str2.charAt(i4)), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(rect.width())});
                }
                f4 += (float) i2;
                i5 += i2;
                if (canvas2 != null) {
                    canvas2.drawText(String.valueOf(str2.charAt(i4)), f4, f3, paint2);
                }
            }
            i4++;
        }
        return i5;
    }

    private static float[] generateImageSize(String str, float f, String str2, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Style.FILL);
        textPaint.setTextAlign(Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[3];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        float f6 = 0.0f;
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f4 = 0.0f;
        } else {
            f6 = f3;
        }
        return new float[]{(float) rect.left, (float) rect.right, (float) (-rect.bottom), (float) (-rect.top), fArr[0], (f2 + Math.max(Math.abs(f6), Math.abs(f4))) * f};
    }

    private static Bitmap generateImage(String str, float f, String str2, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Style.FILL);
        textPaint.setTextAlign(Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[3]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        float max = Math.max(Math.abs(f3), Math.abs(f4)) + f2;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Style.STROKE);
            textPaint2.setTextAlign(Align.LEFT);
            textPaint2.setStrokeWidth(f2 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f5 * f, f3 * f, f4 * f, i3);
            }
        }
        float f6 = 2.0f * max * f;
        Bitmap createBitmap = Bitmap.createBitmap((int) (((float) rect.width()) + f6), (int) (((float) rect.height()) + f6), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z || z2) {
            float f7 = max * f;
            canvas.drawText(str2, ((float) (-rect.left)) + f7, ((float) (-rect.top)) + f7, textPaint2);
        }
        float f8 = max * f;
        canvas.drawText(str2, ((float) (-rect.left)) + f8, ((float) (-rect.top)) + f8, textPaint);
        canvas.save(31);
        canvas.restore();
        return createBitmap;
    }

    private static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        int i10;
        float f6;
        float f7;
        FontMetrics fontMetrics;
        float f8;
        Bitmap bitmap;
        int i11;
        int i12;
        Canvas canvas;
        int i13;
        float f9;
        int i14;
        TextPaint textPaint;
        int i15;
        int i16 = i;
        int i17 = i3;
        int i18 = i7;
        int i19 = i8;
        int i20 = i9;
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i19, i20);
        Bitmap createBitmap = Bitmap.createBitmap(i19, i20, Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Style.FILL);
        Canvas canvas2 = new Canvas(createBitmap);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setColor(i2);
        float f10 = (float) i16;
        textPaint2.setTextSize(f10);
        textPaint2.setAntiAlias(true);
        textPaint2.setStyle(Style.FILL);
        if (i18 == 0) {
            textPaint2.setTextAlign(Align.LEFT);
        } else if (i18 == 1) {
            textPaint2.setTextAlign(Align.CENTER);
        } else {
            textPaint2.setTextAlign(Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint2.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint2.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint2.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint2.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint2.setShadowLayer(f3, f4, f5, i6);
        }
        FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        float f11 = fontMetrics2.top;
        float f12 = fontMetrics2.bottom;
        String[] split = str2.split("\n");
        int length = split.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint3 = new TextPaint();
            textPaint3.setColor(i5);
            textPaint3.setTextSize(textPaint2.getTextSize());
            textPaint3.setAntiAlias(textPaint2.isAntiAlias());
            textPaint3.setStyle(Style.STROKE);
            textPaint3.setStrokeWidth((5.0f * f2) / f10);
            textPaint3.setTextAlign(textPaint2.getTextAlign());
            textPaint3.setTextSkewX(textPaint2.getTextSkewX());
            textPaint2.setFakeBoldText(false);
            textPaint3.setFakeBoldText(true);
            float f13 = ((float) i17) / f10;
            bitmap = createBitmap;
            f8 = f10;
            float f14 = (-fontMetrics2.ascent) + fontMetrics2.descent;
            float f15 = f14 * 0.1f;
            fontMetrics = fontMetrics2;
            int i21 = 0;
            while (i21 < length) {
                float f16 = f11;
                float f17 = f12;
                double centerY = (double) ((int) ((((float) rect.centerY()) - (f11 / 2.0f)) - (f12 / 2.0f)));
                double d = (double) (length - 1);
                Double.isNaN(d);
                double d2 = d * 0.5d;
                int i22 = length;
                TextPaint textPaint4 = textPaint2;
                double d3 = (double) i21;
                Double.isNaN(d3);
                double d4 = d2 - d3;
                double d5 = (double) (f15 + f14);
                Double.isNaN(d5);
                double d6 = d4 * d5;
                Double.isNaN(centerY);
                int i23 = (int) (centerY - d6);
                if (VERSION.SDK_INT >= 21) {
                    textPaint3.setLetterSpacing(f13);
                    if (i18 == 0) {
                        canvas2.drawText(split[i21], (float) rect.left, (float) i23, textPaint3);
                    } else if (i18 == 1) {
                        canvas2.drawText(split[i21], (float) rect.centerX(), (float) i23, textPaint3);
                    } else {
                        canvas2.drawText(split[i21], (float) rect.right, (float) i23, textPaint3);
                    }
                    f9 = f14;
                    textPaint = textPaint4;
                } else {
                    Rect rect2 = new Rect();
                    textPaint = textPaint4;
                    textPaint.getTextBounds(split[i21], 0, split[i21].length(), rect2);
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < split[i21].length()) {
                        float f18 = f14;
                        if (split[i21].charAt(i24) > 55296) {
                            i24++;
                            i25++;
                        }
                        i24++;
                        f14 = f18;
                    }
                    f9 = f14;
                    if (i18 == 0) {
                        drawKernedText(canvas2, split[i21], 0.0f, (float) i23, textPaint3, i3);
                    } else {
                        if (i18 == 1) {
                            i14 = i;
                            i15 = i3;
                            drawKernedText(canvas2, split[i21], (float) ((((rect.width() - rect2.width()) + (i25 * i14)) - ((str2.length() - 1) * i15)) / 2), (float) i23, textPaint3, i3);
                        } else {
                            i15 = i3;
                            i14 = i;
                            drawKernedText(canvas2, split[i21], (float) (((rect.width() - rect2.width()) + (i25 * i14)) - ((str2.length() - 1) * i15)), (float) i23, textPaint3, i3);
                        }
                        i21++;
                        i17 = i15;
                        textPaint2 = textPaint;
                        i16 = i14;
                        f11 = f16;
                        f12 = f17;
                        length = i22;
                        f14 = f9;
                    }
                }
                i15 = i3;
                i14 = i;
                i21++;
                i17 = i15;
                textPaint2 = textPaint;
                i16 = i14;
                f11 = f16;
                f12 = f17;
                length = i22;
                f14 = f9;
            }
            i11 = i16;
            i12 = i17;
            i10 = length;
            f7 = f11;
            f6 = f12;
        } else {
            i11 = i16;
            bitmap = createBitmap;
            i10 = length;
            f8 = f10;
            fontMetrics = fontMetrics2;
            f7 = f11;
            f6 = f12;
            i12 = i17;
        }
        TextPaint textPaint5 = textPaint2;
        float f19 = ((float) i12) / f8;
        FontMetrics fontMetrics3 = fontMetrics;
        float f20 = (-fontMetrics3.ascent) + fontMetrics3.descent;
        float f21 = 0.1f * f20;
        int i26 = i10;
        int i27 = 0;
        while (i27 < i26) {
            double centerY2 = (double) ((int) ((((float) rect.centerY()) - (f7 / 2.0f)) - (f6 / 2.0f)));
            double d7 = (double) (i26 - 1);
            Double.isNaN(d7);
            double d8 = d7 * 0.5d;
            Canvas canvas3 = canvas2;
            double d9 = (double) i27;
            Double.isNaN(d9);
            double d10 = d8 - d9;
            double d11 = (double) (f21 + f20);
            Double.isNaN(d11);
            double d12 = d10 * d11;
            Double.isNaN(centerY2);
            int i28 = (int) (centerY2 - d12);
            if (VERSION.SDK_INT >= 21) {
                textPaint5.setLetterSpacing(f19);
                if (i18 == 0) {
                    canvas = canvas3;
                    canvas.drawText(split[i27], (float) rect.left, (float) i28, textPaint5);
                } else {
                    canvas = canvas3;
                    if (i18 == 1) {
                        canvas.drawText(split[i27], (float) rect.centerX(), (float) i28, textPaint5);
                    } else {
                        canvas.drawText(split[i27], (float) rect.right, (float) i28, textPaint5);
                    }
                }
                i13 = i3;
            } else {
                canvas = canvas3;
                Rect rect3 = new Rect();
                textPaint5.getTextBounds(split[i27], 0, split[i27].length(), rect3);
                int i29 = 0;
                int i30 = 0;
                while (i29 < split[i27].length()) {
                    if (split[i27].charAt(i29) > 55296) {
                        i29++;
                        i30++;
                    }
                    i29++;
                }
                if (i18 == 0) {
                    drawKernedText(canvas, split[i27], 0.0f, (float) i28, textPaint5, i3);
                    i13 = i3;
                } else {
                    if (i18 == 1) {
                        i13 = i3;
                        drawKernedText(canvas, split[i27], (float) ((((rect.width() - rect3.width()) + (i30 * i11)) - ((str2.length() - 1) * i13)) / 2), (float) i28, textPaint5, i3);
                    } else {
                        i13 = i3;
                        drawKernedText(canvas, split[i27], (float) (((rect.width() - rect3.width()) + (i30 * i11)) - ((str2.length() - 1) * i13)), (float) i28, textPaint5, i3);
                    }
                    i27++;
                    int i31 = i13;
                    canvas2 = canvas;
                }
            }
            i27++;
            int i312 = i13;
            canvas2 = canvas;
        }
        Canvas canvas4 = canvas2;
        canvas4.save(31);
        canvas4.restore();
        return bitmap;
    }
}
