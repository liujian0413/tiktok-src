package com.p280ss.android.ugc.aweme.notification.util;

/* renamed from: com.ss.android.ugc.aweme.notification.util.c */
public final class C34614c {

    /* renamed from: a */
    public static final C34614c f90356a = new C34614c();

    private C34614c() {
    }

    /* renamed from: a */
    public static String m111858a(int i) {
        if (i == 7) {
            return "follow";
        }
        if (i == 26) {
            return "mentions";
        }
        if (i == 36) {
            return "all";
        }
        switch (i) {
            case 2:
                return "comment";
            case 3:
                return "like";
            default:
                return "official";
        }
    }

    /* renamed from: b */
    public static String m111859b(int i) {
        switch (i) {
            case 1:
                return "today";
            case 2:
                return "yesterday";
            case 3:
                return "this_week";
            case 4:
                return "this_month";
            case 5:
                return "earlier";
            default:
                return "new";
        }
    }
}
