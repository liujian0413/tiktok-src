package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.b.a */
public final class C21369a {
    /* renamed from: a */
    public static boolean m71855a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || !Patterns.EMAIL_ADDRESS.matcher(charSequence).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m71856a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches();
    }
}
