package com.p280ss.android.socialbase.downloader.utils;

/* renamed from: com.ss.android.socialbase.downloader.utils.g */
public final class C20401g {
    /* renamed from: a */
    private static StringBuilder m67702a(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb;
    }

    /* renamed from: a */
    private static StringBuilder m67701a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    /* renamed from: b */
    private static StringBuilder m67706b(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            m67702a(sb, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static String m67699a(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder("\"");
        sb.append(str);
        sb.append('\"');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("DELETE FROM ");
        sb3.append(sb2);
        if (strArr != null && strArr.length > 0) {
            sb3.append(" WHERE ");
            m67704a(sb3, sb2, strArr);
        }
        return sb3.toString();
    }

    /* renamed from: a */
    private static StringBuilder m67705a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"');
            sb.append(strArr[i]);
            sb.append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static String m67698a(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('\"');
        sb.append(str2);
        sb.append('\"');
        sb.append(" (");
        m67705a(sb, strArr);
        sb.append(") VALUES (");
        m67701a(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public static String m67700a(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = new StringBuilder("\"");
        sb.append(str);
        sb.append('\"');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("UPDATE ");
        sb3.append(sb2);
        sb3.append(" SET ");
        m67706b(sb3, strArr);
        if (strArr2 != null && strArr2.length > 0) {
            sb3.append(" WHERE ");
            m67704a(sb3, sb2, strArr2);
        }
        return sb3.toString();
    }

    /* renamed from: a */
    private static StringBuilder m67703a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append('\"');
        return sb;
    }

    /* renamed from: a */
    private static StringBuilder m67704a(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            m67703a(sb, str, strArr[i]).append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
