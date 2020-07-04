package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectTextView */
public class SearchCorrectTextView extends DmtTextView {

    /* renamed from: b */
    private static final String f71864b;

    /* renamed from: c */
    private static final String f71865c;

    /* renamed from: d */
    private String f71866d;

    /* renamed from: e */
    private String f71867e;

    /* renamed from: f */
    private int f71868f;

    /* renamed from: g */
    private boolean f71869g;

    static {
        String str;
        String str2;
        if (C6399b.m19944t()) {
            str = "";
        } else {
            str = "“";
        }
        f71864b = str;
        if (C6399b.m19944t()) {
            str2 = "";
        } else {
            str2 = "”";
        }
        f71865c = str2;
    }

    /* renamed from: a */
    private void m89317a() {
        if (getLayout().getEllipsisCount(getLineCount() - 1) > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(this.f71867e, getPaint(), (float) ((int) (((float) getMeasuredWidth()) - getPaint().measureText(this.f71866d))), TruncateAt.END);
            String str = this.f71866d;
            StringBuilder sb = new StringBuilder();
            sb.append(f71864b);
            sb.append(ellipsize);
            sb.append(f71865c);
            String a = C1642a.m8034a(str, new Object[]{sb.toString()});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ellipsize);
            m89318a(a, sb2.toString());
        }
    }

    public SearchCorrectTextView(Context context) {
        this(context, null);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (C6399b.m19944t()) {
            this.f71869g = true;
            m89317a();
        }
    }

    public SearchCorrectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71868f = -1;
        if (C6399b.m19944t()) {
            setMaxLines(1);
        }
        setEllipsize(TruncateAt.END);
    }

    /* renamed from: a */
    private void m89318a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.f71868f != -1) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f71868f), indexOf, length, 33);
            if (C6399b.m19944t()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 33);
            }
        }
        setText(spannableStringBuilder);
    }

    /* renamed from: b */
    public final void mo70060b(int i, String str, int i2) {
        this.f71866d = getResources().getString(R.string.djr);
        this.f71867e = str;
        this.f71868f = i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(R.string.djr, new Object[]{str}));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 18);
        setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public final void mo70058a(int i, String str, int i2) {
        this.f71866d = getResources().getString(i);
        this.f71867e = str;
        this.f71868f = i2;
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(f71864b);
        sb.append(str);
        sb.append(f71865c);
        m89318a(resources.getString(i, new Object[]{sb.toString()}), str);
        if (this.f71869g) {
            m89317a();
        }
    }

    /* renamed from: a */
    public final void mo70059a(int i, String str, String str2, int i2) {
        this.f71866d = getResources().getString(R.string.dko);
        this.f71867e = str;
        this.f71868f = i2;
        Resources resources = getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(f71864b);
        sb.append(str);
        sb.append(f71865c);
        m89318a(resources.getString(R.string.dko, new Object[]{sb.toString(), str2}), str);
        if (this.f71869g) {
            m89317a();
        }
    }
}
