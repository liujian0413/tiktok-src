package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.C23657a;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.l */
public final class C39879l extends C23657a {

    /* renamed from: b */
    public boolean f103617b;

    /* renamed from: c */
    private TextPaint f103618c;

    /* renamed from: d */
    private int f103619d;

    /* renamed from: e */
    private int f103620e = 4;

    /* renamed from: f */
    private boolean f103621f;

    /* renamed from: g */
    private String f103622g;

    /* renamed from: a */
    private int m127619a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (char a : str.toCharArray()) {
            if (m127620a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m127620a(char c) {
        return Pattern.compile("[一-龥]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: a */
    public final SpannableString mo61574a(SpannableString spannableString) {
        if (!this.f103621f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f103618c, this.f103619d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f103620e) {
            return spannableString;
        }
        int i = 1;
        this.f103617b = true;
        TextPaint textPaint = this.f103618c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f103622g);
        float measureText = textPaint.measureText(sb.toString()) + C9738o.m28708b(C6399b.m19921a(), 13.0f) + C9738o.m28708b(C6399b.m19921a(), 12.0f);
        int lineStart = dynamicLayout.getLineStart(this.f103620e) - 1;
        int i2 = (int) (((float) this.f103619d) - measureText);
        float measureText2 = this.f103618c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f103620e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f103618c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
                i++;
            }
        } else {
            i = 0;
        }
        if (!C6399b.m19944t()) {
            int a = m127619a(spannableString.subSequence(lineStart - i, lineStart).toString());
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

    public C39879l(TextPaint textPaint, int i, boolean z, String str) {
        this.f103618c = textPaint;
        this.f103619d = i;
        this.f103622g = str;
        this.f103621f = z;
    }
}
