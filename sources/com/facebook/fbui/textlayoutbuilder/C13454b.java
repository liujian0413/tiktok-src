package com.facebook.fbui.textlayoutbuilder;

import android.support.p022v4.p026d.C0712d;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.facebook.fbui.textlayoutbuilder.p700b.C13455a;
import java.lang.reflect.Field;

/* renamed from: com.facebook.fbui.textlayoutbuilder.b */
final class C13454b {
    /* renamed from: a */
    private static boolean m39532a(StaticLayout staticLayout) {
        int lineStart = staticLayout.getLineStart(0);
        int lineCount = staticLayout.getLineCount();
        int i = lineStart;
        int i2 = 0;
        while (i2 < lineCount) {
            int lineEnd = staticLayout.getLineEnd(i2);
            if (lineEnd < i) {
                try {
                    Field declaredField = StaticLayout.class.getDeclaredField("mLines");
                    declaredField.setAccessible(true);
                    Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
                    declaredField2.setAccessible(true);
                    int[] iArr = (int[]) declaredField.get(staticLayout);
                    int i3 = declaredField2.getInt(staticLayout);
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = (i3 * i2) + i4;
                        m39531a(iArr, i5, i5 + i3);
                    }
                    return false;
                } catch (Exception unused) {
                }
            } else {
                i2++;
                i = lineEnd;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m39531a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* renamed from: a */
    private static StaticLayout m39529a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i4) {
        StaticLayout staticLayout = new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        return staticLayout;
    }

    /* renamed from: b */
    private static StaticLayout m39533b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i4, int i5, C0712d dVar) {
        try {
            return C13455a.m39534a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
        } catch (LinkageError unused) {
            return m39529a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    /* renamed from: a */
    public static StaticLayout m39530a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i4, int i5, C0712d dVar) {
        CharSequence charSequence2 = charSequence;
        int i6 = i5;
        StaticLayout b = m39533b(charSequence, 0, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
        if (i6 > 0) {
            int i7 = i2;
            while (b.getLineCount() > i6) {
                int lineStart = b.getLineStart(i6);
                if (lineStart >= i7) {
                    break;
                }
                int i8 = lineStart;
                while (i8 > 0 && Character.isSpace(charSequence2.charAt(i8 - 1))) {
                    i8--;
                }
                b = m39533b(charSequence, 0, i8, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
                if (b.getLineCount() >= i6 && b.getEllipsisCount(i6 - 1) == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(charSequence2.subSequence(0, i8));
                    sb.append(" …");
                    String sb2 = sb.toString();
                    b = m39533b(sb2, 0, sb2.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
                }
                i7 = i8;
            }
        }
        do {
        } while (!m39532a(b));
        return b;
    }
}
