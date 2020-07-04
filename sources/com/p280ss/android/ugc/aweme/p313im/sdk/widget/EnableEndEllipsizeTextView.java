package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.EnableEndEllipsizeTextView */
public class EnableEndEllipsizeTextView extends DmtTextView {
    public EnableEndEllipsizeTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        CharSequence text = getText();
        if (getLineCount() > getMaxLines()) {
            int lineEnd = getLayout().getLineEnd(getMaxLines() - 1);
            if (text.length() > lineEnd) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text.subSequence(0, lineEnd - 3)).append("...");
                setText(spannableStringBuilder);
            }
        }
        super.onDraw(canvas);
    }

    public EnableEndEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EnableEndEllipsizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
