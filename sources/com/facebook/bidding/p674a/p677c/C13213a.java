package com.facebook.bidding.p674a.p677c;

import java.security.SecureRandom;

/* renamed from: com.facebook.bidding.a.c.a */
public final class C13213a {

    /* renamed from: a */
    private static final SecureRandom f35011a = new SecureRandom();

    /* renamed from: a */
    public static String m38611a() {
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < 20; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(f35011a.nextInt(62)));
        }
        return sb.toString();
    }
}
