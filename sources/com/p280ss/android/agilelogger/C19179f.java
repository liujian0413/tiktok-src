package com.p280ss.android.agilelogger;

/* renamed from: com.ss.android.agilelogger.f */
public final class C19179f {
    /* renamed from: a */
    public static String m62885a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            default:
                if (i < 2) {
                    StringBuilder sb = new StringBuilder("V-");
                    sb.append(2 - i);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder("E+");
                sb2.append(i - 6);
                return sb2.toString();
        }
    }
}
