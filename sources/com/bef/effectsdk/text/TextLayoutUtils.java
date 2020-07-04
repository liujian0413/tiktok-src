package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class TextLayoutUtils {
    private static final int FONT_SIZE_INCREMENT = 2;
    private static final int FONT_SIZE_INIT = 10;
    private static final int MAX_BITMAP_HEIGHT = 2048;
    private static final int MAX_BITMAP_WIDTH = 2048;

    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1 */
    static /* synthetic */ class C19501 {

        /* renamed from: b */
        static final /* synthetic */ int[] f6989b = new int[C1951a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        static {
            /*
                com.bef.effectsdk.text.TextLayoutUtils$a[] r0 = com.bef.effectsdk.text.TextLayoutUtils.C1951a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6989b = r0
                r0 = 1
                int[] r1 = f6989b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bef.effectsdk.text.TextLayoutUtils$a r2 = com.bef.effectsdk.text.TextLayoutUtils.C1951a.COLOR_TYPE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f6989b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bef.effectsdk.text.TextLayoutUtils$a r3 = com.bef.effectsdk.text.TextLayoutUtils.C1951a.COLOR_TYPE_RGBA     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.bef.effectsdk.text.data.BitmapType[] r2 = com.bef.effectsdk.text.data.BitmapType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6988a = r2
                int[] r2 = f6988a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.bef.effectsdk.text.data.BitmapType r3 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_SHAKE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f6988a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.bef.effectsdk.text.data.BitmapType r2 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_NEON_ALPHA     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.C19501.<clinit>():void");
        }
    }

    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$a */
    enum C1951a {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA
    }

    public static String[] splitLyric(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i3 % 5) % 3 == 0) {
                i = 6;
            } else {
                i = 10;
            }
            int i4 = 0;
            while (i2 < split.length && (split[i2].length() + i4 + 1 <= i || i4 <= 3)) {
                i4 += split[i2].length() + 1;
                int i5 = i2 + 1;
                sb.append(split[i2]);
                sb.append(" ");
                if (i5 == split.length - 1 && split[i5].length() < 3) {
                    sb.append(split[i5]);
                }
                i2 = i5;
            }
            i3++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < split.length) {
            if (!split[i2].isEmpty()) {
                int length = sb.toString().length();
                if (length == 0) {
                    if (split[i2].length() < 10) {
                        sb.append(split[i2]);
                    } else if (split[i2].length() == 10) {
                        arrayList.add(split[i2]);
                    } else {
                        arrayList.add(split[i2].substring(0, 10));
                        if ((split[i2].length() - 10) % 9 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i = (split[i2].length() - 10) / 9;
                        } else {
                            i = ((split[i2].length() - 10) / 9) + 1;
                        }
                        for (int i3 = 0; i3 < i; i3++) {
                            if (i3 != 0) {
                                int i4 = ((i3 - 1) * 9) + 19;
                                if (i3 < i - 1) {
                                    int i5 = (i3 * 9) + 19;
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, i5));
                                    String sb2 = sb.toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else if (z) {
                                    int i6 = (i3 * 9) + 19;
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, i6));
                                    String sb3 = sb.toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                } else {
                                    int length2 = split[i2].length();
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, length2));
                                }
                            } else if (z) {
                                sb.append("-");
                                sb.append(split[i2].substring(10, 19));
                                String sb4 = sb.toString();
                                arrayList.add(sb4);
                                sb.delete(0, sb4.length());
                            } else if (i == 1) {
                                int length3 = split[i2].length();
                                sb.append("-");
                                sb.append(split[i2].substring(10, length3));
                            } else {
                                sb.append("-");
                                sb.append(split[i2].substring(10, 19));
                                String sb5 = sb.toString();
                                arrayList.add(sb5);
                                sb.delete(0, sb5.length());
                            }
                        }
                    }
                } else if (sb.toString().length() + split[i2].length() + 1 <= 10) {
                    sb.append(" ");
                    sb.append(split[i2]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length);
                    i2--;
                }
            }
            i2++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, C1951a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, C1951a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, C1951a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, C1951a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, C1951a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, C1951a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, C1951a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, C1951a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        switch (BitmapType.valueOf(textLayoutParam.bitmapType)) {
            case TEXT_BITMAP_SHAKE_ALPHA:
                return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
            case TEXT_BITMAP_NEON_ALPHA:
                return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
            default:
                return null;
        }
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        int[] iArr;
        float f;
        FontMetrics fontMetrics;
        StaticLayout staticLayout;
        Canvas canvas;
        float f2;
        float f3;
        float f4;
        TextLayoutParam textLayoutParam2 = textLayoutParam;
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam2 == null) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam2.familyName) && !TextUtils.isEmpty(textLayoutParam2.fontPath)) {
            textPaint.setTypeface(Typeface.createFromFile(new File(textLayoutParam2.fontPath, textLayoutParam2.familyName)));
        }
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr2 = new int[splitLyric.length];
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < splitLyric.length; i++) {
            int i2 = 10;
            String str2 = splitLyric[i];
            textPaint.setTextSize(10.0f);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= ((float) textLayoutParam2.lineWidth); measureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize((float) i2);
            }
            iArr2[i] = i2 - 2;
            textPaint.setTextSize((float) iArr2[i]);
            FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (z) {
                f3 = fontMetrics2.bottom;
                f4 = fontMetrics2.top;
            } else {
                f3 = fontMetrics2.descent;
                f4 = fontMetrics2.ascent;
            }
            f6 += f3 - f4;
        }
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam2.lineWidth, (int) f6, Config.ALPHA_8);
        Canvas canvas2 = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i3 = 0;
        float f7 = 0.0f;
        while (i3 < splitLyric.length) {
            String str3 = splitLyric[i3];
            textPaint.setTextSize((float) iArr2[i3]);
            FontMetrics fontMetrics3 = textPaint.getFontMetrics();
            if (VERSION.SDK_INT >= 23) {
                staticLayout = Builder.obtain(str3, z2 ? 1 : 0, str3.length(), textPaint, canvas2.getWidth()).setAlignment(Alignment.ALIGN_NORMAL).setLineSpacing(f5, 1.0f).setIncludePad(z2).build();
                fontMetrics = fontMetrics3;
                canvas = canvas2;
                f = f6;
                iArr = iArr2;
            } else {
                fontMetrics = fontMetrics3;
                Canvas canvas3 = canvas2;
                f = f6;
                iArr = iArr2;
                StaticLayout staticLayout2 = new StaticLayout(str3, 0, str3.length(), textPaint, canvas2.getWidth(), Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                staticLayout = staticLayout2;
                canvas = canvas3;
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                f2 = fontMetrics.bottom - fontMetrics.top;
                charLayout.baseline = (f7 - fontMetrics.top) / f;
            } else {
                f2 = fontMetrics.descent - fontMetrics.ascent;
                charLayout.baseline = (f7 - fontMetrics.ascent) / f;
            }
            charLayout.top = f7 / f;
            f7 += f2;
            charLayout.bottom = f7 / f;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i3] = charLayout;
            canvas.translate(0.0f, f2);
            i3++;
            canvas2 = canvas;
            f6 = f;
            iArr2 = iArr;
            f5 = 0.0f;
            z2 = false;
        }
        return textBitmapResult;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        String[] strArr;
        TextPaint textPaint;
        ArrayList arrayList;
        int i;
        float f;
        int i2;
        float f2;
        FontMetrics fontMetrics;
        StaticLayout staticLayout;
        TextLayoutParam textLayoutParam2 = textLayoutParam;
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam2.familyName) && !TextUtils.isEmpty(textLayoutParam2.fontPath)) {
            textPaint2.setTypeface(Typeface.createFromFile(new File(textLayoutParam2.fontPath, textLayoutParam2.familyName)));
        }
        textPaint2.setTextSize(textLayoutParam2.fontSize);
        boolean z2 = false;
        if (textPaint2.getFontMetrics().top < textPaint2.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        ArrayList arrayList2 = new ArrayList();
        float f3 = (float) textLayoutParam2.lineWidth;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        while (i4 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i4];
            if (VERSION.SDK_INT >= 23) {
                staticLayout = Builder.obtain(str2, z2 ? 1 : 0, str2.length(), textPaint2, (int) f3).setAlignment(Alignment.ALIGN_OPPOSITE).setLineSpacing(f4, 1.0f).setIncludePad(z2).build();
                f2 = f5;
                i = i3;
                i2 = i4;
                f = f3;
                arrayList = arrayList2;
                textPaint = textPaint2;
                fontMetrics = fontMetrics2;
            } else {
                f2 = f5;
                i = i3;
                i2 = i4;
                f = f3;
                arrayList = arrayList2;
                textPaint = textPaint2;
                fontMetrics = fontMetrics2;
                staticLayout = new StaticLayout(str2, 0, str2.length(), textPaint2, (int) f3, Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            i3 = i + staticLayout.getLineCount();
            ArrayList arrayList3 = arrayList;
            arrayList3.add(staticLayout);
            float height = ((float) staticLayout.getHeight()) + f2;
            i4 = i2 + 1;
            arrayList2 = arrayList3;
            fontMetrics2 = fontMetrics;
            f3 = f;
            textPaint2 = textPaint;
            f4 = 0.0f;
            z2 = false;
            f5 = height;
        }
        float f6 = f5;
        int i5 = i3;
        float f7 = f3;
        ArrayList arrayList4 = arrayList2;
        FontMetrics fontMetrics3 = fontMetrics2;
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i5;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i5];
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam2.lineWidth, (int) f6, Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i6 = 0;
        float f8 = 0.0f;
        int i7 = 0;
        while (i6 < lyricShakeSplit.length) {
            float height2 = (float) ((StaticLayout) arrayList4.get(i6)).getHeight();
            float lineCount = height2 / ((float) ((StaticLayout) arrayList4.get(i6)).getLineCount());
            int i8 = i7;
            float f9 = f8;
            int i9 = 0;
            while (i9 < ((StaticLayout) arrayList4.get(i6)).getLineCount()) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((StaticLayout) arrayList4.get(i6)).getLineWidth(i9);
                if (z) {
                    strArr = lyricShakeSplit;
                    charLayout.baseline = (f9 - fontMetrics3.top) / f6;
                } else {
                    strArr = lyricShakeSplit;
                    charLayout.baseline = (f9 - fontMetrics3.ascent) / f6;
                }
                charLayout.top = f9 / f6;
                f9 += lineCount;
                float f10 = lineCount;
                charLayout.bottom = (f9 - (Math.abs(fontMetrics3.bottom - fontMetrics3.descent) / 2.0f)) / f6;
                if (textLayoutParam2.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f7 - lineWidth) / f7;
                } else {
                    charLayout.left = (f7 - lineWidth) / f7;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i8] = charLayout;
                i8++;
                i9++;
                lyricShakeSplit = strArr;
                lineCount = f10;
            }
            String[] strArr2 = lyricShakeSplit;
            ((StaticLayout) arrayList4.get(i6)).draw(canvas);
            canvas.translate(0.0f, height2 * ((float) ((StaticLayout) arrayList4.get(i6)).getLineCount()));
            i6++;
            f8 = f9;
            i7 = i8;
            lyricShakeSplit = strArr2;
        }
        return textBitmapResult;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.text.Layout] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.text.StaticLayout] */
    /* JADX WARNING: type inference failed for: r20v2, types: [android.text.StaticLayout] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19, types: [android.text.BoringLayout] */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v18
      assigns: []
      uses: []
      mth insns count: 320
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r26, com.bef.effectsdk.text.data.TextLayoutParam r27, com.bef.effectsdk.text.TextLayoutUtils.C1951a r28) {
        /*
            r1 = r26
            r12 = r27
            boolean r0 = r26.isEmpty()
            r13 = 0
            if (r0 == 0) goto L_0x000c
            return r13
        L_0x000c:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            java.lang.String r2 = r12.familyName
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = r12.familyName
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x003c
            java.lang.String r0 = r12.fontPath
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r12.fontPath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r12.fontPath
            java.lang.String r3 = r12.familyName
            r0.<init>(r2, r3)
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r0)
            goto L_0x003c
        L_0x0034:
            java.lang.String r0 = r12.familyName
            int r2 = r12.fontStyle
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
        L_0x003c:
            int r2 = r12.textColor
            int r3 = r12.backColor
            int r4 = r12.shadowColor
            int[] r5 = com.bef.effectsdk.text.TextLayoutUtils.C19501.f6989b
            int r6 = r28.ordinal()
            r5 = r5[r6]
            r14 = 1
            if (r5 == r14) goto L_0x006a
            r5 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            int r2 = r2 >> 8
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r6
            int r5 = r5 + r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r3 = r3 >> 8
            r3 = r3 & r6
            int r2 = r2 + r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            int r4 = r4 >> 8
            r4 = r4 & r6
            int r3 = r3 + r4
        L_0x0068:
            r15 = r2
            goto L_0x0077
        L_0x006a:
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r2 << 24
            r2 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r3 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            goto L_0x0068
        L_0x0077:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            int r4 = r12.paintStyle
            r16 = 0
            switch(r4) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0087;
                case 2: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            r4 = 0
            goto L_0x008f
        L_0x0082:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            float r4 = r12.strokeWidth
            goto L_0x008f
        L_0x0087:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            float r4 = r12.strokeWidth
            goto L_0x008f
        L_0x008c:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            goto L_0x0080
        L_0x008f:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r7 = r12.textAlign
            switch(r7) {
                case 0: goto L_0x009d;
                case 1: goto L_0x009a;
                case 2: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x009f
        L_0x0097:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x009f
        L_0x009a:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x009f
        L_0x009d:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x009f:
            int r7 = r12.maxLine
            int r8 = r12.lineWidth
            int r9 = r12.lineWidth
            r10 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L_0x00b1
            r7 = 1
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 2048(0x800, float:2.87E-42)
            r17 = 0
            goto L_0x00b3
        L_0x00b1:
            r17 = 1
        L_0x00b3:
            if (r7 != r14) goto L_0x00ca
            int r13 = r12.lineBreakMode
            switch(r13) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00be;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            r13 = 0
        L_0x00bb:
            r17 = 0
            goto L_0x00cb
        L_0x00be:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.END
            goto L_0x00bb
        L_0x00c1:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00bb
        L_0x00c4:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.START
            goto L_0x00bb
        L_0x00c7:
            android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x00bb
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            if (r9 <= r10) goto L_0x00cf
            r9 = 2048(0x800, float:2.87E-42)
        L_0x00cf:
            if (r8 <= r10) goto L_0x00d3
            r8 = 2048(0x800, float:2.87E-42)
        L_0x00d3:
            if (r7 != 0) goto L_0x00d8
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d8:
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>(r14)
            if (r0 == 0) goto L_0x00e2
            r11.setTypeface(r0)
        L_0x00e2:
            r11.setColor(r5)
            r11.setStyle(r2)
            r11.setStrokeWidth(r4)
            float r0 = r12.fontSize
            r11.setTextSize(r0)
            float r0 = r12.shadowRadius
            float r2 = r12.shadowDx
            float r4 = r12.shadowDy
            r11.setShadowLayer(r0, r2, r4, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x0104
            float r0 = r12.letterSpacing
            r11.setLetterSpacing(r0)
        L_0x0104:
            android.text.BoringLayout$Metrics r19 = android.text.BoringLayout.isBoring(r1, r11)
            if (r7 != r14) goto L_0x0138
            if (r19 == 0) goto L_0x0138
            android.text.BoringLayout r20 = new android.text.BoringLayout
            float r5 = r12.lineSpacingMult
            float r4 = r12.lineSpacingAdd
            r21 = 1
            r0 = r20
            r1 = r26
            r2 = r11
            r3 = r8
            r22 = r4
            r4 = r6
            r6 = r22
            r23 = r7
            r7 = r19
            r14 = r8
            r8 = r21
            r24 = r9
            r9 = r13
            r13 = 2048(0x800, float:2.87E-42)
            r10 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13 = r11
            r25 = r14
            r21 = r24
        L_0x0135:
            r14 = 0
            goto L_0x019d
        L_0x0138:
            r23 = r7
            r14 = r8
            r24 = r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0173
            int r0 = r26.length()
            r9 = 0
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r1, r9, r0, r11, r14)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r6)
            float r1 = r12.lineSpacingAdd
            float r2 = r12.lineSpacingMult
            android.text.StaticLayout$Builder r0 = r0.setLineSpacing(r1, r2)
            r1 = 1
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r1)
            android.text.StaticLayout$Builder r0 = r0.setEllipsize(r13)
            r8 = r24
            android.text.StaticLayout$Builder r0 = r0.setEllipsizedWidth(r8)
            android.text.StaticLayout r20 = r0.build()
            r21 = r8
            r13 = r11
            r25 = r14
            r0 = r20
            goto L_0x0135
        L_0x0173:
            r8 = r24
            r9 = 0
            android.text.StaticLayout r18 = new android.text.StaticLayout
            r2 = 0
            int r3 = r26.length()
            float r7 = r12.lineSpacingMult
            float r5 = r12.lineSpacingAdd
            r19 = 1
            r0 = r18
            r1 = r26
            r4 = r11
            r20 = r5
            r5 = r14
            r21 = r8
            r8 = r20
            r20 = 0
            r9 = r19
            r10 = r13
            r13 = r11
            r25 = r14
            r14 = 0
            r11 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x019d:
            int r1 = r0.getLineCount()
            r7 = r23
            int r1 = java.lang.Math.min(r1, r7)
            if (r1 != 0) goto L_0x01ab
            r2 = 0
            return r2
        L_0x01ab:
            if (r17 == 0) goto L_0x01af
            r21 = r25
        L_0x01af:
            r3 = r21
            r2 = 0
            r4 = 0
            r10 = 0
        L_0x01b4:
            if (r2 >= r1) goto L_0x01dd
            int r5 = r0.getLineBottom(r2)
            int r5 = java.lang.Math.max(r5, r10)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 > r6) goto L_0x01df
            float r5 = r0.getLineRight(r2)
            float r7 = r0.getLineLeft(r2)
            float r5 = r5 - r7
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r5, r3)
            int r5 = r0.getLineBottom(r2)
            int r10 = java.lang.Math.max(r5, r10)
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x01b4
        L_0x01dd:
            r6 = 2048(0x800, float:2.87E-42)
        L_0x01df:
            if (r3 <= r6) goto L_0x01e3
            r3 = 2048(0x800, float:2.87E-42)
        L_0x01e3:
            int r1 = r0.getLineBottom(r14)
            if (r1 != 0) goto L_0x01eb
            r1 = 0
            return r1
        L_0x01eb:
            if (r4 != 0) goto L_0x01ef
            r4 = 1
            goto L_0x01f0
        L_0x01ef:
            r6 = r10
        L_0x01f0:
            int r1 = r0.getLineCount()
            if (r4 != r1) goto L_0x0226
            android.graphics.Paint$FontMetrics r1 = r13.getFontMetrics()
            float r2 = r12.lineSpacingAdd
            float r5 = r12.lineSpacingMult
            float r7 = r1.descent
            float r8 = r1.ascent
            float r8 = java.lang.Math.abs(r8)
            float r7 = r7 + r8
            float r1 = r1.leading
            float r7 = r7 + r1
            float r5 = r5 * r7
            float r2 = r2 + r5
            int r1 = r4 + -1
            int r5 = r0.getLineBottom(r1)
            int r1 = r0.getLineTop(r1)
            int r5 = r5 - r1
            float r1 = (float) r5
            float r2 = r2 - r1
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0226
            r1 = 1056964608(0x3f000000, float:0.5)
            float r16 = r2 + r1
            float r1 = (float) r6
            float r1 = r1 + r16
            int r6 = (int) r1
        L_0x0226:
            com.bef.effectsdk.text.data.TextBitmapResult r1 = new com.bef.effectsdk.text.data.TextBitmapResult
            r1.<init>()
            r2 = 4
            r1.channel = r2
            r1.lineCount = r4
            r5 = 1
            r1.type = r5
            com.bef.effectsdk.text.data.CharLayout[] r5 = new com.bef.effectsdk.text.data.CharLayout[r4]
            r1.charLayouts = r5
            r5 = 0
        L_0x0238:
            if (r5 >= r4) goto L_0x02bb
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            com.bef.effectsdk.text.data.CharLayout r8 = new com.bef.effectsdk.text.data.CharLayout
            r8.<init>()
            r7[r5] = r8
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            int r8 = r0.getLineBaseline(r5)
            float r8 = (float) r8
            float r9 = (float) r6
            float r8 = r8 / r9
            r7.baseline = r8
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            com.bef.effectsdk.text.data.CharLayout[] r8 = r1.charLayouts
            r8 = r8[r5]
            float r10 = r0.getLineLeft(r5)
            float r11 = (float) r3
            float r10 = r10 / r11
            r8.left = r10
            r7.pos_left = r10
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            com.bef.effectsdk.text.data.CharLayout[] r8 = r1.charLayouts
            r8 = r8[r5]
            int r10 = r0.getLineTop(r5)
            float r10 = (float) r10
            float r10 = r10 / r9
            r8.top = r10
            r7.pos_top = r10
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            com.bef.effectsdk.text.data.CharLayout[] r8 = r1.charLayouts
            r8 = r8[r5]
            float r10 = r0.getLineRight(r5)
            float r10 = r10 / r11
            r8.right = r10
            r7.pos_right = r10
            int r7 = r4 + -1
            if (r5 != r7) goto L_0x029e
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            com.bef.effectsdk.text.data.CharLayout[] r8 = r1.charLayouts
            r8 = r8[r5]
            int r10 = r0.getLineBottom(r5)
            float r10 = (float) r10
            float r10 = r10 + r16
            float r10 = r10 / r9
            r8.bottom = r10
            r7.pos_bottom = r10
            goto L_0x02b0
        L_0x029e:
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            com.bef.effectsdk.text.data.CharLayout[] r8 = r1.charLayouts
            r8 = r8[r5]
            int r10 = r0.getLineBottom(r5)
            float r10 = (float) r10
            float r10 = r10 / r9
            r8.bottom = r10
            r7.pos_bottom = r10
        L_0x02b0:
            com.bef.effectsdk.text.data.CharLayout[] r7 = r1.charLayouts
            r7 = r7[r5]
            r8 = -2
            r7.charCode = r8
            int r5 = r5 + 1
            goto L_0x0238
        L_0x02bb:
            int[] r4 = com.bef.effectsdk.text.TextLayoutUtils.C19501.f6989b
            int r5 = r28.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x02cf
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r6, r4)
            r1.channel = r2
            goto L_0x02d7
        L_0x02cf:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r6, r2)
            r1.channel = r5
        L_0x02d7:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 19
            if (r2 < r7) goto L_0x02e0
            r4.setPremultiplied(r5)
        L_0x02e0:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r4)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r5.setColor(r15)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14, r14, r3, r6)
            r2.drawRect(r7, r5)
            r0.draw(r2)
            r1.bitmap = r4
            r0 = 0
            r2.setBitmap(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$a):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    private static TextBitmapResult generateBitmapAtlasUTF8(String str, TextLayoutParam textLayoutParam, C1951a aVar) {
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList<Rect> arrayList2;
        int i4;
        Bitmap bitmap;
        ArrayList arrayList3;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i8;
        int i9;
        int i10;
        String str2 = str;
        TextLayoutParam textLayoutParam2 = textLayoutParam;
        if (str.isEmpty()) {
            return null;
        }
        Typeface typeface = Typeface.DEFAULT;
        if (textLayoutParam2.familyName != null && !textLayoutParam2.familyName.isEmpty()) {
            typeface = (textLayoutParam2.fontPath == null || textLayoutParam2.fontPath.isEmpty()) ? Typeface.create(textLayoutParam2.familyName, textLayoutParam2.fontStyle) : Typeface.createFromFile(new File(textLayoutParam2.fontPath, textLayoutParam2.familyName));
        }
        int i11 = textLayoutParam2.textColor;
        int i12 = textLayoutParam2.backColor;
        int i13 = textLayoutParam2.shadowColor;
        if (C19501.f6989b[aVar.ordinal()] != 1) {
            i = ((i11 & NormalGiftView.ALPHA_255) << 24) + ((i11 >> 8) & 16777215);
            i3 = ((i12 & NormalGiftView.ALPHA_255) << 24) + ((i12 >> 8) & 16777215);
            i2 = ((i13 & NormalGiftView.ALPHA_255) << 24) + ((i13 >> 8) & 16777215);
        } else {
            i = (i11 & NormalGiftView.ALPHA_255) << 24;
            i3 = (i12 & NormalGiftView.ALPHA_255) << 24;
            i2 = (i13 & NormalGiftView.ALPHA_255) << 24;
        }
        Style style = Style.FILL;
        switch (textLayoutParam2.paintStyle) {
            case 0:
                style = Style.FILL;
                break;
            case 1:
                style = Style.STROKE;
                f = textLayoutParam2.strokeWidth;
                break;
            case 2:
                style = Style.FILL_AND_STROKE;
                f = textLayoutParam2.strokeWidth;
                break;
        }
        f = 0.0f;
        TextPaint textPaint2 = new TextPaint(1);
        if (typeface != null) {
            textPaint2.setTypeface(typeface);
        }
        textPaint2.setColor(i);
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(f);
        textPaint2.setTextSize(textLayoutParam2.fontSize);
        textPaint2.setShadowLayer(textLayoutParam2.shadowRadius, textLayoutParam2.shadowDx, textLayoutParam2.shadowDy, i2);
        int i14 = textLayoutParam2.lineWidth;
        if (i14 > 2048 || i14 == 0) {
            i14 = 2048;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 4;
        textBitmapResult.lineCount = 0;
        textBitmapResult.type = 1;
        ArrayList arrayList6 = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        float abs = Math.abs(textLayoutParam2.shadowDx) + (textLayoutParam2.shadowRadius / 2.0f);
        float abs2 = Math.abs(textLayoutParam2.shadowDy) + (textLayoutParam2.shadowRadius / 2.0f);
        if (textLayoutParam2.letterSpacing > 0.0f) {
            f2 = textLayoutParam2.letterSpacing;
        } else {
            f2 = 0.0f;
        }
        int i15 = (int) f2;
        if (textLayoutParam2.lineSpacingAdd > 0.0f) {
            f3 = textLayoutParam2.lineSpacingAdd;
        } else {
            f3 = 0.0f;
        }
        int i16 = (int) f3;
        int i17 = i3;
        TextBitmapResult textBitmapResult2 = textBitmapResult;
        int max = ((int) Math.max((-textLayoutParam2.shadowDx) + (textLayoutParam2.shadowRadius / 2.0f), 0.0f)) + i15 + 1;
        int max2 = ((int) (Math.max((-textLayoutParam2.shadowDy) + (textLayoutParam2.shadowRadius / 2.0f), 0.0f) + textLayoutParam2.fontSize)) + i16 + 1;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 < str.length()) {
                CharLayout charLayout = new CharLayout();
                ArrayList arrayList8 = arrayList6;
                charLayout.charCode = 0;
                charLayout.isEmoji = false;
                int i20 = i19 + 1;
                charLayout.charId = i19;
                int i21 = i20;
                short s = 1;
                while (true) {
                    arrayList3 = arrayList7;
                    int i22 = s + i18;
                    i5 = i16;
                    int i23 = i22 + 1;
                    if (str.length() > i23) {
                        String substring = str2.substring(i22 - 1, i22);
                        String substring2 = str2.substring(i22, i23);
                        if (substring.compareTo("?") >= 0 && substring.compareTo("?") <= 0 && substring2.compareTo("?") >= 0 && substring2.compareTo("?") <= 0) {
                            charLayout.isEmoji = true;
                            s = (short) (s + 1);
                            if (str.length() < i18 + 3) {
                            }
                        }
                        int i24 = i18 + s;
                        int i25 = i24 + 1;
                        String substring3 = str2.substring(i24, i25);
                        String substring4 = str2.substring(i25, i24 + 2);
                        if (substring3.compareTo("‍") == 0 && substring4.compareTo("?") >= 0 && substring4.compareTo("?") <= 0) {
                            s = (short) (s + 2);
                            arrayList7 = arrayList3;
                            i16 = i5;
                        }
                    }
                }
                if (!charLayout.isEmoji) {
                    byte[] bytes = str2.substring(i18, i18 + s).getBytes();
                    charLayout.charCode = 0;
                    int i26 = 0;
                    while (i26 < bytes.length) {
                        float f4 = abs2;
                        int i27 = max2;
                        charLayout.charCode += (bytes[i26] & 255) << (((bytes.length - i26) - 1) * 8);
                        i26++;
                        abs2 = f4;
                        max2 = i27;
                    }
                }
                int i28 = max2;
                float f5 = abs2;
                CharLayout charLayout2 = (CharLayout) hashMap.get(Integer.valueOf(charLayout.charCode));
                if (charLayout2 == null || charLayout.isEmoji) {
                    Rect rect = new Rect();
                    int i29 = i18 + s;
                    textPaint2.getTextBounds(str2, i18, i29, rect);
                    rect.left = (int) (((float) rect.left) + Math.min(textLayoutParam2.shadowDx - (textLayoutParam2.shadowRadius / 2.0f), 0.0f));
                    rect.right = (int) (((float) rect.right) + Math.max(textLayoutParam2.shadowDx + (textLayoutParam2.shadowRadius / 2.0f), 0.0f));
                    rect.bottom = (int) (((float) rect.bottom) + Math.max(textLayoutParam2.shadowDy + (textLayoutParam2.shadowRadius / 2.0f), 0.0f));
                    rect.top = (int) (((float) rect.top) + Math.min(textLayoutParam2.shadowDy - (textLayoutParam2.shadowRadius / 2.0f), 0.0f));
                    float measureText = textPaint2.measureText(str2, i18, i29);
                    charLayout.advance = measureText;
                    float f6 = (float) i15;
                    int i30 = max;
                    if (((float) max) + measureText + abs + f6 + 1.0f >= ((float) i14)) {
                        i7 = i15;
                        int max3 = ((int) Math.max((-textLayoutParam2.shadowDx) + (textLayoutParam2.shadowRadius / 2.0f), 0.0f)) + i15 + 1;
                        textPaint = textPaint2;
                        i9 = i5;
                        int i31 = (int) (((float) i28) + textLayoutParam2.fontSize + f5 + ((float) i9) + 1.0f);
                        if (i31 < 4194304 / i14) {
                            i8 = i31;
                            i10 = max3;
                        } else {
                            i4 = i31;
                            arrayList = arrayList8;
                            arrayList2 = arrayList3;
                        }
                    } else {
                        i7 = i15;
                        textPaint = textPaint2;
                        i9 = i5;
                        i8 = i28;
                        i10 = i30;
                    }
                    Rect rect2 = new Rect(i18, i29, i10, i8);
                    arrayList4 = arrayList3;
                    arrayList4.add(rect2);
                    charLayout.baseline = (float) i8;
                    float f7 = (float) i10;
                    charLayout.origin = f7;
                    i6 = i9;
                    charLayout.pos_left = (float) rect.left;
                    charLayout.pos_top = (float) rect.top;
                    charLayout.pos_right = (float) rect.right;
                    charLayout.pos_bottom = (float) rect.bottom;
                    charLayout.left = (float) (rect.left + i10);
                    charLayout.top = (float) (rect.top + i8);
                    charLayout.right = (float) (rect.right + i10);
                    charLayout.bottom = (float) (rect.bottom + i8);
                    hashMap.put(Integer.valueOf(charLayout.charCode), charLayout);
                    max = (int) (f7 + measureText + abs + f6 + 1.0f);
                    max2 = i8;
                    arrayList5 = arrayList8;
                } else {
                    charLayout.pos_left = charLayout2.pos_left;
                    charLayout.pos_top = charLayout2.pos_top;
                    charLayout.pos_right = charLayout2.pos_right;
                    charLayout.pos_bottom = charLayout2.pos_bottom;
                    charLayout.left = charLayout2.left;
                    charLayout.top = charLayout2.top;
                    charLayout.right = charLayout2.right;
                    charLayout.bottom = charLayout2.bottom;
                    charLayout.baseline = charLayout2.baseline;
                    charLayout.origin = charLayout2.origin;
                    charLayout.advance = charLayout2.advance;
                    i7 = i15;
                    textPaint = textPaint2;
                    arrayList5 = arrayList8;
                    arrayList4 = arrayList3;
                    i6 = i5;
                    max2 = i28;
                }
                arrayList5.add(charLayout);
                i18 += s;
                arrayList7 = arrayList4;
                i19 = i21;
                abs2 = f5;
                textPaint2 = textPaint;
                i16 = i6;
                arrayList6 = arrayList5;
                i15 = i7;
            } else {
                arrayList = arrayList6;
                textPaint = textPaint2;
                arrayList2 = arrayList7;
                i4 = max2;
            }
        }
        TextBitmapResult textBitmapResult3 = textBitmapResult2;
        textBitmapResult3.charLayouts = (CharLayout[]) arrayList.toArray(new CharLayout[0]);
        int i32 = i4 + ((int) textLayoutParam2.fontSize);
        if (C19501.f6989b[aVar.ordinal()] != 1) {
            bitmap = Bitmap.createBitmap(i14, i32, Config.ARGB_8888);
            textBitmapResult3.channel = 4;
        } else {
            bitmap = Bitmap.createBitmap(i14, i32, Config.ALPHA_8);
            textBitmapResult3.channel = 1;
        }
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i17);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawRect(new Rect(0, 0, i14, i32), paint);
        for (Rect rect3 : arrayList2) {
            canvas.drawText(str2.substring(rect3.left, rect3.top), (float) rect3.right, (float) rect3.bottom, textPaint);
        }
        textBitmapResult3.bitmap = bitmap;
        for (int i33 = 0; i33 < textBitmapResult3.charLayouts.length; i33++) {
            CharLayout charLayout3 = textBitmapResult3.charLayouts[i33];
            float f8 = (float) i32;
            charLayout3.bottom /= f8;
            CharLayout charLayout4 = textBitmapResult3.charLayouts[i33];
            charLayout4.top /= f8;
            CharLayout charLayout5 = textBitmapResult3.charLayouts[i33];
            float f9 = (float) i14;
            charLayout5.left /= f9;
            CharLayout charLayout6 = textBitmapResult3.charLayouts[i33];
            charLayout6.right /= f9;
        }
        canvas.setBitmap(null);
        return textBitmapResult3;
    }
}
