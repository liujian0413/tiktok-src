package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.au */
public final class C31875au {

    /* renamed from: a */
    public static final C31875au f83340a = new C31875au();

    private C31875au() {
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m103567a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C7573i.m23587b(spannableStringBuilder, "spannableStringBuilder");
        C7573i.m23587b(textPaint, "paint");
        return m103568a(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    /* renamed from: a */
    private static SpannableStringBuilder m103568a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        C7573i.m23587b(spannableStringBuilder, "spannableStringBuilder");
        C7573i.m23587b(textPaint, "paint");
        CharSequence charSequence = spannableStringBuilder;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "...";
        float measureText = ((float) i) - (textPaint.measureText(str) + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(charSequence, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        C7573i.m23582a((Object) subSequence, "spannableStringBuilder.s…ableStringBuilder.length)");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append(str);
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}
