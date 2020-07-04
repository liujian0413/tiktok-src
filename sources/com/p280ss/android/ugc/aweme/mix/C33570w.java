package com.p280ss.android.ugc.aweme.mix;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.w */
public final class C33570w extends ClickableSpan {
    public final void onClick(View view) {
        C7573i.m23587b(view, "widget");
    }

    public final void updateDrawState(TextPaint textPaint) {
        C7573i.m23587b(textPaint, "ds");
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
