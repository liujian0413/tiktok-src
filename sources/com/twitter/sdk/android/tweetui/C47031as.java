package com.twitter.sdk.android.tweetui;

/* renamed from: com.twitter.sdk.android.tweetui.as */
final class C47031as {
    /* renamed from: a */
    private static CharSequence m147054a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence != null ? charSequence : charSequence2;
    }

    /* renamed from: a */
    private static String m147057a(String str, String str2) {
        return str != null ? str : str2;
    }

    /* renamed from: a */
    static CharSequence m147053a(CharSequence charSequence) {
        return m147054a(charSequence, (CharSequence) "");
    }

    /* renamed from: a */
    static String m147056a(String str) {
        return m147057a(str, "");
    }

    /* renamed from: a */
    static Long m147055a(String str, long j) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return Long.valueOf(-1);
        }
    }
}
