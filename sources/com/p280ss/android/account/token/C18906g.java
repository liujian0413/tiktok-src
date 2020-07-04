package com.p280ss.android.account.token;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.account.token.g */
public final class C18906g {
    /* renamed from: a */
    public static String m61718a(String str) {
        try {
            Matcher matcher = Pattern.compile("[^\\.]+(\\.com\\.cn|\\.net\\.cn|\\.org\\.cn|\\.gov\\.cn|\\.com|\\.net|\\.cn|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.hk|\\.公司|\\.中国|\\.网络|\\.ly)").matcher(new URL(str).getHost().toLowerCase());
            if (matcher.find()) {
                return matcher.group();
            }
        } catch (MalformedURLException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m61719a(String str, Set<String> set) {
        return set.contains(m61718a(str));
    }
}
