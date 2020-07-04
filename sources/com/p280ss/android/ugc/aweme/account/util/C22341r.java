package com.p280ss.android.ugc.aweme.account.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;

/* renamed from: com.ss.android.ugc.aweme.account.util.r */
public final class C22341r {

    /* renamed from: com.ss.android.ugc.aweme.account.util.r$a */
    public static class C22342a extends ClickableSpan {

        /* renamed from: a */
        private int f59608a;

        public C22342a(int i) {
            this.f59608a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f59608a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getHighlightColor() != 0) {
                    textView.setHighlightColor(0);
                }
            }
            view.setTag(Boolean.valueOf(true));
            ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a(view.getContext(), C22340q.m73949a("privacy-policy"), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.util.r$b */
    public static class C22343b extends ClickableSpan {

        /* renamed from: a */
        private int f59609a;

        public C22343b(int i) {
            this.f59609a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f59609a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getHighlightColor() != 0) {
                    textView.setHighlightColor(0);
                }
            }
            view.setTag(Boolean.valueOf(true));
            ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a(view.getContext(), C22340q.m73949a("terms-of-use"), true);
        }
    }

    /* renamed from: a */
    public static C22343b m73950a(int i) {
        return new C22343b(i);
    }

    /* renamed from: b */
    public static C22342a m73951b(int i) {
        return new C22342a(i);
    }
}
