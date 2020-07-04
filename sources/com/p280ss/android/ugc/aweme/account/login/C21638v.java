package com.p280ss.android.ugc.aweme.account.login;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.v */
public final class C21638v {
    /* renamed from: a */
    public static boolean m72447a(String str) {
        return Pattern.compile("^[a-zA-Z0-9~!@#\\$%\\^&\\*\\(\\)_\\+\\-=\\?]{1,}$").matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m72448b(String str) {
        return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", 2).matcher(str).matches();
    }
}
