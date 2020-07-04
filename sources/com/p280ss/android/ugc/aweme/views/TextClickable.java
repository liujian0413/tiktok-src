package com.p280ss.android.ugc.aweme.views;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.views.TextClickable */
public final class TextClickable {

    /* renamed from: a */
    public static final Pattern f112300a = Pattern.compile("(#|＃)([0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*[a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc][0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*)");

    /* renamed from: d */
    private static final Pattern f112301d = Pattern.compile("@([\\u4e00-\\u9fa5\\w\\.]{1,19}[\\u4e00-\\u9fa5\\w])");

    /* renamed from: b */
    public C43354a f112302b;

    /* renamed from: c */
    public Typeface f112303c;

    /* renamed from: e */
    private int f112304e = 2;

    /* renamed from: f */
    private int f112305f = 1;

    /* renamed from: g */
    private Pattern f112306g = f112300a;

    /* renamed from: h */
    private Pattern f112307h = f112301d;

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$CustomTypefaceSpan */
    static class CustomTypefaceSpan extends TypefaceSpan {

        /* renamed from: a */
        private final Typeface f112310a;

        public void updateDrawState(TextPaint textPaint) {
            m137617a(textPaint, this.f112310a);
        }

        public void updateMeasureState(TextPaint textPaint) {
            m137617a(textPaint, this.f112310a);
        }

        CustomTypefaceSpan(String str, Typeface typeface) {
            super(str);
            this.f112310a = typeface;
        }

        /* renamed from: a */
        private static void m137617a(Paint paint, Typeface typeface) {
            int i;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 == null) {
                i = 0;
            } else {
                i = typeface2.getStyle();
            }
            int style = i & (typeface.getStyle() ^ -1);
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$a */
    public interface C43354a {
        /* renamed from: a */
        void mo93279a(TextPaint textPaint);

        /* renamed from: a */
        void mo93280a(View view, String str, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$b */
    class C43355b extends ClickableSpan {

        /* renamed from: b */
        private String f112312b;

        /* renamed from: c */
        private int f112313c;

        public final void updateDrawState(TextPaint textPaint) {
            if (TextClickable.this.f112302b != null) {
                TextClickable.this.f112302b.mo93279a(textPaint);
            }
        }

        public final void onClick(View view) {
            if (TextClickable.this.f112302b != null) {
                TextClickable.this.f112302b.mo93280a(view, this.f112312b, this.f112313c);
            }
        }

        private C43355b(String str, int i) {
            this.f112312b = str;
            this.f112313c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo105216a(TextView textView) {
        if (textView == null) {
            return false;
        }
        final SpannableString spannableString = new SpannableString(textView.getText());
        if (!m137614a((Spannable) spannableString)) {
            return false;
        }
        textView.setText(spannableString);
        textView.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                TextView textView = (TextView) view;
                if (motionEvent.getAction() == 1) {
                    int x = (int) motionEvent.getX();
                    int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                    int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    if (layout == null) {
                        return false;
                    }
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0) {
                        clickableSpanArr[0].onClick(textView);
                    }
                }
                return true;
            }
        });
        return true;
    }

    /* renamed from: a */
    private boolean m137614a(Spannable spannable) {
        String obj = spannable.toString();
        Matcher matcher = this.f112306g.matcher(obj);
        Matcher matcher2 = this.f112307h.matcher(obj);
        boolean z = false;
        while (matcher2.find()) {
            spannable.setSpan(new C43355b(matcher2.group(this.f112305f), 1), matcher2.start(), matcher2.end(), 33);
            m137613a(spannable, matcher2.start(), matcher2.end());
            z = true;
        }
        while (matcher.find()) {
            spannable.setSpan(new C43355b(matcher.group(this.f112304e), 0), matcher.start(), matcher.end(), 33);
            m137613a(spannable, matcher.start(), matcher.end());
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo105215a(Pattern pattern, int i) {
        this.f112306g = pattern;
        this.f112304e = 0;
    }

    /* renamed from: a */
    private void m137613a(Spannable spannable, int i, int i2) {
        if (this.f112303c != null) {
            spannable.setSpan(new CustomTypefaceSpan("", this.f112303c), i, i2, 0);
        }
    }
}
