package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.taobao.android.dexposed.ClassUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.d */
public final class C31740d {
    /* renamed from: a */
    public static SpannableString m103076a(int i, String str, String str2, int i2) {
        if (str2.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            str2 = str2.replace(ClassUtils.PACKAGE_SEPARATOR, "\\.");
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Matcher matcher = Pattern.compile(str2).matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i2) {
                    spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                }
            }
            return spannableString;
        } catch (PatternSyntaxException unused) {
            return spannableString;
        }
    }
}
