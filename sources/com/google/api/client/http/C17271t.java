package com.google.api.client.http;

/* renamed from: com.google.api.client.http.t */
public final class C17271t {
    /* renamed from: a */
    public static boolean m57459a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    public static boolean m57460b(int i) {
        if (i != 307) {
            switch (i) {
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
