package com.google.gson.internal.bind.p279a;

import java.util.TimeZone;

/* renamed from: com.google.gson.internal.bind.a.a */
public final class C6637a {

    /* renamed from: a */
    private static final TimeZone f19048a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    private static int m20581a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01a8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m20583a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r3 = r0 + 4
            int r0 = m20582a(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r4 = 45
            boolean r5 = m20584a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m20582a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            boolean r6 = m20584a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m20582a(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r7 = 84
            boolean r7 = m20584a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            if (r7 == 0) goto L_0x00b9
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m20582a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r12 = 58
            boolean r13 = m20584a(r1, r7, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r13 == 0) goto L_0x0061
            int r7 = r7 + 1
        L_0x0061:
            int r13 = r7 + 2
            int r7 = m20582a(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            boolean r12 = m20584a(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r12 == 0) goto L_0x006f
            int r13 = r13 + 1
        L_0x006f:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r12 <= r13) goto L_0x00bc
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r12 == r10) goto L_0x00bc
            if (r12 == r9) goto L_0x00bc
            if (r12 == r4) goto L_0x00bc
            int r12 = r13 + 2
            int r13 = m20582a(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r14 = 59
            if (r13 <= r14) goto L_0x008e
            r15 = 63
            if (r13 >= r15) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r14 = r13
        L_0x008f:
            r13 = 46
            boolean r13 = m20584a(r1, r12, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r13 == 0) goto L_0x00b6
            int r12 = r12 + 1
            int r13 = r12 + 1
            int r13 = m20581a(r1, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r15 = r12 + 3
            int r15 = java.lang.Math.min(r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r16 = m20582a(r1, r12, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r15 = r15 - r12
            switch(r15) {
                case 1: goto L_0x00b1;
                case 2: goto L_0x00ae;
                default: goto L_0x00ad;
            }     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x00ad:
            goto L_0x00b3
        L_0x00ae:
            int r16 = r16 * 10
            goto L_0x00b3
        L_0x00b1:
            int r16 = r16 * 100
        L_0x00b3:
            r12 = r16
            goto L_0x00be
        L_0x00b6:
            r13 = r12
            r12 = 0
            goto L_0x00be
        L_0x00b9:
            r13 = r6
            r6 = 0
            r7 = 0
        L_0x00bc:
            r12 = 0
            r14 = 0
        L_0x00be:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r15 <= r13) goto L_0x01a0
            char r15 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r11 = 5
            if (r15 != r10) goto L_0x00d0
            java.util.TimeZone r4 = f19048a     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r13 = r13 + r8
            goto L_0x016f
        L_0x00d0:
            if (r15 == r9) goto L_0x00ee
            if (r15 != r4) goto L_0x00d5
            goto L_0x00ee
        L_0x00d5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r3.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x00ee:
            java.lang.String r4 = r1.substring(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r9 < r11) goto L_0x00f9
            goto L_0x010a
        L_0x00f9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x010a:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r13 = r13 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r9 != 0) goto L_0x016d
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r9 == 0) goto L_0x0120
            goto L_0x016d
        L_0x0120:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r10 = "GMT"
            r9.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            boolean r15 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r15 != 0) goto L_0x016b
            java.lang.String r15 = ":"
            java.lang.String r11 = ""
            java.lang.String r10 = r10.replace(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            if (r10 == 0) goto L_0x014b
            goto L_0x016b
        L_0x014b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x016b:
            r4 = r9
            goto L_0x016f
        L_0x016d:
            java.util.TimeZone r4 = f19048a     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x016f:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r0 = 14
            r9.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            return r0
        L_0x01a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01ac, NumberFormatException -> 0x01aa, IllegalArgumentException -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            goto L_0x01ad
        L_0x01aa:
            r0 = move-exception
            goto L_0x01ad
        L_0x01ac:
            r0 = move-exception
        L_0x01ad:
            if (r1 != 0) goto L_0x01b1
            r1 = 0
            goto L_0x01c4
        L_0x01b1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01c4:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01d0
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01eb
        L_0x01d0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01eb:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.p279a.C6637a.m20583a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: a */
    private static boolean m20584a(String str, int i, char c) {
        if (i >= str.length() || str.charAt(i) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static int m20582a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }
}
