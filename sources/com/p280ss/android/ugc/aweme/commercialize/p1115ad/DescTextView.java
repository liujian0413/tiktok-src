package com.p280ss.android.ugc.aweme.commercialize.p1115ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p262ui.common.C10773a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.widget.C29053f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.DescTextView */
public final class DescTextView extends DmtTextView {

    /* renamed from: b */
    private String f64689b;

    /* renamed from: c */
    private boolean f64690c;

    /* renamed from: d */
    private int f64691d;

    /* renamed from: e */
    private String f64692e;

    /* renamed from: f */
    private int f64693f;

    public DescTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DescTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getImageSpanXAxisAdjust() {
        return this.f64693f;
    }

    public final String getMoreString() {
        return this.f64692e;
    }

    /* renamed from: a */
    public final void mo1061a() {
        this.f64689b = "... ";
        this.f64690c = true;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.f64689b);
    }

    private final int getSpanWidth() {
        Drawable drawable;
        if (C6399b.m19944t()) {
            drawable = new C29053f(getContext(), R.color.en, this.f64692e, R.drawable.aod).mo74464a();
        } else {
            drawable = new C10773a(getContext(), this.f64691d).getDrawable();
        }
        C7573i.m23582a((Object) drawable, "drawable");
        return drawable.getIntrinsicWidth();
    }

    public final void setDescLightDrawable(int i) {
        this.f64691d = i;
    }

    public final void setImageSpanXAxisAdjust(int i) {
        this.f64693f = i;
    }

    public final void setMoreString(String str) {
        C7573i.m23587b(str, "value");
        this.f64692e = str;
        invalidate();
    }

    public final void setViewLineHeight(int i) {
        if (i >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                setLineSpacing((float) (i - fontMetricsInt), 1.0f);
            }
        }
    }

    /* renamed from: a */
    private final SpannableString m80505a(String str) {
        ReplacementSpan replacementSpan;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(C7634n.m23778d(str).toString());
            sb.append(' ');
            String sb2 = sb.toString();
            if (this.f64690c) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(' ');
                sb2 = sb3.toString();
            }
            SpannableString spannableString = new SpannableString(sb2);
            if (C6399b.m19944t()) {
                replacementSpan = new C29053f(getContext(), R.color.en, this.f64692e, R.drawable.aod);
            } else {
                C10773a aVar = new C10773a(getContext(), this.f64691d);
                aVar.f28888a = this.f64693f;
                replacementSpan = aVar;
            }
            spannableString.setSpan(replacementSpan, sb2.length() - 1, sb2.length(), 33);
            return spannableString;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final String m80506a(String str, int i) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), i, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        if (str != null) {
            String substring = str.substring(0, lineStart);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    private final int m80508c(String str, int i) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), i, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        return staticLayout.getLineCount();
    }

    /* renamed from: b */
    private final String m80507b(String str, int i) {
        StaticLayout staticLayout = new StaticLayout(m80509d(str, i), getPaint(), (i - getDotWidth()) - getSpanWidth(), Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(0);
        int lineEnd = staticLayout.getLineEnd(0);
        StringBuilder sb = new StringBuilder();
        String d = m80509d(str, i);
        if (d != null) {
            String substring = d.substring(lineStart, lineEnd);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(this.f64689b);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    private final String m80509d(String str, int i) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), i, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        int lineEnd = staticLayout.getLineEnd(getMaxLines() - 1);
        if (str != null) {
            String substring = str.substring(lineStart, lineEnd);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void onMeasure(int i, int i2) {
        SpannableString spannableString;
        int size = MeasureSpec.getSize(i);
        if (m80508c(getText().toString(), size) < getMaxLines()) {
            spannableString = m80505a(getText().toString());
        } else {
            if (((float) size) > ((float) getSpanWidth()) + getPaint().measureText(m80509d(getText().toString(), size))) {
                spannableString = m80505a(getText().toString());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(m80506a(getText().toString(), size));
                sb.append(m80507b(getText().toString(), size));
                spannableString = m80505a(sb.toString());
            }
        }
        setText(spannableString);
        super.onMeasure(i, i2);
    }

    public DescTextView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f64689b = "...";
        if (C6399b.m19944t()) {
            i2 = R.drawable.aod;
        } else {
            i2 = R.drawable.z1;
        }
        this.f64691d = i2;
        this.f64692e = "";
    }

    public /* synthetic */ DescTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
