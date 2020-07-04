package com.p280ss.android.ugc.aweme.mix;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.C23657a;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.mix.h */
public final class C33546h extends C23657a {

    /* renamed from: b */
    public boolean f87605b;

    /* renamed from: c */
    private TextPaint f87606c;

    /* renamed from: d */
    private int f87607d;

    /* renamed from: e */
    private int f87608e = 4;

    /* renamed from: f */
    private boolean f87609f;

    /* renamed from: g */
    private String f87610g;

    /* renamed from: a */
    private int m108414a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (char a : str.toCharArray()) {
            if (m108415a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m108415a(char c) {
        return Pattern.compile("[一-龥]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: a */
    public final SpannableString mo61574a(SpannableString spannableString) {
        if (!this.f87609f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f87606c, this.f87607d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f87608e) {
            return spannableString;
        }
        int i = 1;
        this.f87605b = true;
        TextPaint textPaint = this.f87606c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f87610g);
        float measureText = textPaint.measureText(sb.toString()) + 0.0f + C9738o.m28708b(C6399b.m19921a(), 17.0f);
        int lineStart = dynamicLayout.getLineStart(this.f87608e) - 1;
        int i2 = (int) (((float) this.f87607d) - measureText);
        float measureText2 = this.f87606c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f87608e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f87606c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
                i++;
            }
        } else {
            i = 0;
        }
        if (!C6399b.m19944t()) {
            int a = m108414a(spannableString.subSequence(lineStart - i, lineStart).toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(spannableString.subSequence(0, lineStart - ((i + i) - a)));
            sb2.append("...");
            return new SpannableString(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(spannableString.subSequence(0, lineStart - i));
        sb3.append("...");
        return new SpannableString(sb3.toString());
    }

    public C33546h(TextPaint textPaint, int i, boolean z, String str, int i2) {
        this.f87606c = textPaint;
        this.f87607d = i;
        this.f87610g = str;
        this.f87609f = true;
        this.f87608e = 2;
    }
}
