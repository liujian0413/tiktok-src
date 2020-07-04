package com.facebook.network.connectionclass;

import com.taobao.android.dexposed.ClassUtils;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.network.connectionclass.a */
final class C14142a {

    /* renamed from: a */
    private byte[] f37369a;

    /* renamed from: b */
    private int f37370b;

    /* renamed from: c */
    private int f37371c;

    /* renamed from: d */
    private char f37372d;

    /* renamed from: e */
    private boolean f37373e;

    C14142a() {
    }

    /* renamed from: c */
    private void m41747c() {
        if (this.f37369a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* renamed from: d */
    private void m41748d() {
        if (!this.f37373e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    /* renamed from: b */
    public final void mo33899b() throws NoSuchElementException {
        m41747c();
        m41748d();
        m41749e();
    }

    /* renamed from: a */
    public final int mo33895a() throws NoSuchElementException {
        m41747c();
        m41748d();
        int i = this.f37370b;
        return m41745a(this.f37369a, i, m41749e() + i);
    }

    /* renamed from: e */
    private int m41749e() throws NoSuchElementException {
        m41747c();
        m41748d();
        if (this.f37371c > this.f37370b) {
            int a = m41746a(this.f37369a, this.f37370b, this.f37371c, this.f37372d);
            if (a == -1) {
                int i = this.f37371c - this.f37370b;
                this.f37370b = this.f37371c;
                return i;
            }
            int i2 = a - this.f37370b;
            this.f37370b = a + 1;
            return i2;
        }
        StringBuilder sb = new StringBuilder("Reading past end of input stream at ");
        sb.append(this.f37370b);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        throw new NoSuchElementException(sb.toString());
    }

    /* renamed from: a */
    public final C14142a mo33896a(char c) {
        m41747c();
        this.f37372d = ' ';
        this.f37373e = true;
        return this;
    }

    /* renamed from: a */
    public final boolean mo33898a(String str) throws NoSuchElementException {
        int i = this.f37370b;
        if (str.length() != m41749e()) {
            return false;
        }
        int i2 = i;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) != this.f37369a[i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public final C14142a mo33897a(byte[] bArr, int i) {
        this.f37369a = bArr;
        this.f37370b = 0;
        this.f37371c = i;
        this.f37373e = false;
        return this;
    }

    /* renamed from: a */
    private static int m41745a(byte[] bArr, int i, int i2) throws NumberFormatException {
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int i5 = bArr[i] - 48;
            if (i5 < 0 || i5 > 9) {
                StringBuilder sb = new StringBuilder("Invalid int in buffer at ");
                sb.append(i4 - 1);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new NumberFormatException(sb.toString());
            }
            i3 = (i3 * 10) + i5;
            i = i4;
        }
        return i3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=byte, for r4v0, types: [byte, char] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m41746a(byte[] r1, int r2, int r3, byte r4) {
        /*
        L_0x0000:
            if (r2 >= r3) goto L_0x000a
            byte r0 = r1[r2]
            if (r0 != r4) goto L_0x0007
            return r2
        L_0x0007:
            int r2 = r2 + 1
            goto L_0x0000
        L_0x000a:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.network.connectionclass.C14142a.m41746a(byte[], int, int, char):int");
    }
}
