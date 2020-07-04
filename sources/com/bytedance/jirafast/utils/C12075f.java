package com.bytedance.jirafast.utils;

import java.text.DecimalFormat;

/* renamed from: com.bytedance.jirafast.utils.f */
public final class C12075f {
    /* renamed from: a */
    public static String m35226a(long j) {
        if (j < 0) {
            return "0";
        }
        String[] strArr = {"B", "kB", "MB", "GB", "TB"};
        double d = (double) j;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
        double pow = Math.pow(1024.0d, (double) log10);
        Double.isNaN(d);
        sb.append(decimalFormat.format(d / pow));
        sb.append(" ");
        sb.append(strArr[log10]);
        return sb.toString();
    }
}
