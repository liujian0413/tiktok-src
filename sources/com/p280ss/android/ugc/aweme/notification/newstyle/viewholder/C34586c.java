package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.os.Build.VERSION;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.MTBaseNotificationHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.c */
public final class C34586c {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.c$a */
    static final class C34587a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f90320a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f90321b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f90322c;

        /* renamed from: d */
        final /* synthetic */ int f90323d;

        C34587a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i) {
            this.f90320a = textView;
            this.f90321b = spannableStringBuilder;
            this.f90322c = baseNotice;
            this.f90323d = i;
        }

        public final void run() {
            C34586c.m111818a(this.f90320a, this.f90321b, this.f90322c, this.f90323d, this.f90320a.getWidth());
        }
    }

    /* renamed from: a */
    public static final void m111818a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i, int i2) {
        C7573i.m23587b(textView, "view");
        C7573i.m23587b(spannableStringBuilder, "spannableStringBuilder");
        C7573i.m23587b(baseNotice, "notice");
        if (i2 == 0) {
            textView.post(new C34587a(textView, spannableStringBuilder, baseNotice, i));
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            textView.setBreakStrategy(0);
        }
        String valueOf = String.valueOf(MTBaseNotificationHolder.m111204a(baseNotice, textView.getContext()));
        MTBaseNotificationHolder.m111205a(spannableStringBuilder, baseNotice, textView.getContext());
        TextPaint paint = textView.getPaint();
        C7573i.m23582a((Object) paint, "view.paint");
        textView.setText(m111817a(spannableStringBuilder, paint, i2, i, valueOf.length(), (int) textView.getPaint().measureText(valueOf), true));
    }

    /* renamed from: a */
    private static SpannableStringBuilder m111817a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        C7573i.m23587b(spannableStringBuilder, "spannableStringBuilder");
        C7573i.m23587b(textPaint, "paint");
        CharSequence charSequence = spannableStringBuilder;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "... ";
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
