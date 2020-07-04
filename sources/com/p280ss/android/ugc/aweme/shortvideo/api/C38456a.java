package com.p280ss.android.ugc.aweme.shortvideo.api;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.api.a */
public final class C38456a {
    /* renamed from: a */
    public static int[] m122938a(String str) {
        try {
            String[] split = str.split(";");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}
