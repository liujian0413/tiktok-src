package com.p280ss.android.ugc.aweme.challenge.p1083b;

import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.b.a */
public final class C23668a {

    /* renamed from: a */
    public static final C23668a f62419a = new C23668a();

    private C23668a() {
    }

    /* renamed from: a */
    public static C23669b m77605a(TextView textView, CharSequence charSequence) {
        C7573i.m23587b(textView, "protoView");
        C7573i.m23587b(charSequence, "text");
        if (textView.getWidth() <= 0) {
            C23669b bVar = new C23669b(null, null, null, 7, null);
            return bVar;
        }
        DmtTextView dmtTextView = new DmtTextView(textView.getContext());
        dmtTextView.setTextSize(0, textView.getTextSize());
        dmtTextView.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        dmtTextView.setTypeface(textView.getTypeface());
        dmtTextView.setIncludeFontPadding(textView.getIncludeFontPadding());
        dmtTextView.setText(charSequence);
        dmtTextView.measure(MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        return new C23669b(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
    }
}
