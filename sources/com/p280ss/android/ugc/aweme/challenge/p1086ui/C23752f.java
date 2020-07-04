package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.C23657a;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.f */
public final class C23752f extends C23657a {

    /* renamed from: b */
    public boolean f62659b;

    /* renamed from: c */
    private TextPaint f62660c;

    /* renamed from: d */
    private int f62661d;

    /* renamed from: e */
    private int f62662e = 4;

    /* renamed from: f */
    private boolean f62663f;

    /* renamed from: g */
    private String f62664g;

    /* renamed from: a */
    private int m77882a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (char a : str.toCharArray()) {
            if (m77883a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m77883a(char c) {
        return Pattern.compile("[一-龥]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: a */
    public final SpannableString mo61574a(SpannableString spannableString) {
        if (!this.f62663f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f62660c, this.f62661d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f62662e) {
            return spannableString;
        }
        int i = 1;
        this.f62659b = true;
        TextPaint textPaint = this.f62660c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f62664g);
        float measureText = textPaint.measureText(sb.toString()) + 45.0f + C9738o.m28708b(C6399b.m19921a(), 0.0f);
        int lineStart = dynamicLayout.getLineStart(this.f62662e) - 1;
        int i2 = (int) (((float) this.f62661d) - measureText);
        float measureText2 = this.f62660c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f62662e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f62660c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
                i++;
            }
        } else {
            i = 0;
        }
        if (!C6399b.m19944t()) {
            int a = m77882a(spannableString.subSequence(lineStart - i, lineStart).toString());
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

    public C23752f(TextPaint textPaint, int i, boolean z, String str, int i2) {
        this.f62660c = textPaint;
        this.f62661d = i;
        this.f62664g = str;
        this.f62663f = z;
        this.f62662e = i2;
    }
}
