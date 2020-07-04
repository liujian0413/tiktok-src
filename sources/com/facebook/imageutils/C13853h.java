package com.facebook.imageutils;

import android.util.Pair;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.h */
public final class C13853h {
    /* renamed from: h */
    private static short m40910h(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & NormalGiftView.ALPHA_255);
    }

    /* renamed from: i */
    private static byte m40911i(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & NormalGiftView.ALPHA_255);
    }

    /* renamed from: a */
    private static String m40902a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append((char) bArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static Pair<Integer, Integer> m40906d(InputStream inputStream) throws IOException {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(m40909g(inputStream) + 1), Integer.valueOf(m40909g(inputStream) + 1));
    }

    /* renamed from: f */
    private static int m40908f(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: g */
    private static int m40909g(InputStream inputStream) throws IOException {
        byte i = m40911i(inputStream);
        return ((m40911i(inputStream) << 16) & 16711680) | ((m40911i(inputStream) << 8) & 65280) | (i & 255);
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m40904b(InputStream inputStream) throws IOException {
        inputStream.skip(7);
        short h = m40910h(inputStream);
        short h2 = m40910h(inputStream);
        short h3 = m40910h(inputStream);
        if (h == 157 && h2 == 1 && h3 == 42) {
            return new Pair<>(Integer.valueOf(m40908f(inputStream)), Integer.valueOf(m40908f(inputStream)));
        }
        return null;
    }

    /* renamed from: e */
    private static int m40907e(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0066, code lost:
        if (r3 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r3.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m40901a(java.io.InputStream r3) {
        /*
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = 0
            r3.read(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r2 = "RIFF"
            boolean r2 = m40903a(r0, r2)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r2 != 0) goto L_0x0015
            if (r3 == 0) goto L_0x0014
            r3.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r1
        L_0x0015:
            m40907e(r3)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            r3.read(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r2 = "WEBP"
            boolean r2 = m40903a(r0, r2)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r2 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x0028
            r3.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r1
        L_0x0029:
            r3.read(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r0 = m40902a(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            java.lang.String r2 = "VP8 "
            boolean r2 = r2.equals(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r2 == 0) goto L_0x0042
            android.util.Pair r0 = m40904b(r3)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r0
        L_0x0042:
            java.lang.String r2 = "VP8L"
            boolean r2 = r2.equals(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r2 == 0) goto L_0x0054
            android.util.Pair r0 = m40905c(r3)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r0
        L_0x0054:
            java.lang.String r2 = "VP8X"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r0 == 0) goto L_0x0066
            android.util.Pair r0 = m40906d(r3)     // Catch:{ IOException -> 0x0073, all -> 0x006c }
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r0
        L_0x0066:
            if (r3 == 0) goto L_0x0077
        L_0x0068:
            r3.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0077
        L_0x006c:
            r0 = move-exception
            if (r3 == 0) goto L_0x0072
            r3.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r0
        L_0x0073:
            if (r3 == 0) goto L_0x0077
            goto L_0x0068
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.C13853h.m40901a(java.io.InputStream):android.util.Pair");
    }

    /* renamed from: c */
    private static Pair<Integer, Integer> m40905c(InputStream inputStream) throws IOException {
        m40907e(inputStream);
        if (m40911i(inputStream) != 47) {
            return null;
        }
        byte read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: a */
    private static boolean m40903a(byte[] bArr, String str) {
        if (4 != str.length()) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
