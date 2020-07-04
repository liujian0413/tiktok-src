package com.p280ss.android.ugc.aweme.main;

/* renamed from: com.ss.android.ugc.aweme.main.do */
public abstract /* synthetic */ class C32993do {
    /* renamed from: a */
    public static String m106643a(String str) {
        try {
            return m106642a(Integer.valueOf(str));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m106642a(Integer num) {
        String str = "";
        switch (num.intValue()) {
            case 0:
                return "HOME";
            case 1:
                return "DISCOVER";
            case 2:
                return "PUBLISH";
            case 3:
                return "NOTIFICATION";
            case 4:
                return "USER";
            case 5:
                return "DISCOVER";
            default:
                return str;
        }
    }
}
