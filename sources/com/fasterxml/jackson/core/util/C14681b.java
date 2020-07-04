package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType;
import java.util.ArrayList;

/* renamed from: com.fasterxml.jackson.core.util.b */
public final class C14681b {

    /* renamed from: a */
    static final char[] f37972a = new char[0];

    /* renamed from: b */
    public int f37973b;

    /* renamed from: c */
    private final BufferRecycler f37974c;

    /* renamed from: d */
    private char[] f37975d;

    /* renamed from: e */
    private int f37976e;

    /* renamed from: f */
    private int f37977f;

    /* renamed from: g */
    private ArrayList<char[]> f37978g;

    /* renamed from: h */
    private boolean f37979h;

    /* renamed from: i */
    private int f37980i;

    /* renamed from: j */
    private char[] f37981j;

    /* renamed from: k */
    private String f37982k;

    /* renamed from: l */
    private char[] f37983l;

    public final String toString() {
        return m42486h();
    }

    /* renamed from: f */
    private void m42484f() {
        this.f37979h = false;
        this.f37978g.clear();
        this.f37980i = 0;
        this.f37973b = 0;
    }

    /* renamed from: b */
    public final char[] mo37266b() {
        char[] cArr = this.f37983l;
        if (cArr != null) {
            return cArr;
        }
        char[] i = m42487i();
        this.f37983l = i;
        return i;
    }

    /* renamed from: e */
    private void m42483e() {
        this.f37976e = -1;
        this.f37973b = 0;
        this.f37977f = 0;
        this.f37975d = null;
        this.f37982k = null;
        this.f37983l = null;
        if (this.f37979h) {
            m42484f();
        }
    }

    /* renamed from: g */
    private int m42485g() {
        if (this.f37976e >= 0) {
            return this.f37977f;
        }
        if (this.f37983l != null) {
            return this.f37983l.length;
        }
        if (this.f37982k != null) {
            return this.f37982k.length();
        }
        return this.f37980i + this.f37973b;
    }

    /* renamed from: a */
    public final void mo37265a() {
        if (this.f37974c == null) {
            m42483e();
            return;
        }
        if (this.f37981j != null) {
            m42483e();
            char[] cArr = this.f37981j;
            this.f37981j = null;
            this.f37974c.mo37226a(CharBufferType.TEXT_BUFFER, cArr);
        }
    }

    /* renamed from: c */
    public final char[] mo37267c() {
        this.f37976e = -1;
        this.f37973b = 0;
        this.f37977f = 0;
        this.f37975d = null;
        this.f37982k = null;
        this.f37983l = null;
        if (this.f37979h) {
            m42484f();
        }
        char[] cArr = this.f37981j;
        if (cArr != null) {
            return cArr;
        }
        char[] a = m42481a(0);
        this.f37981j = a;
        return a;
    }

    /* renamed from: d */
    public final char[] mo37268d() {
        if (this.f37978g == null) {
            this.f37978g = new ArrayList<>();
        }
        this.f37979h = true;
        this.f37978g.add(this.f37981j);
        int length = this.f37981j.length;
        this.f37980i += length;
        char[] b = m42482b(Math.min(length + (length >> 1), 262144));
        this.f37973b = 0;
        this.f37981j = b;
        return b;
    }

    /* renamed from: h */
    private String m42486h() {
        String str;
        if (this.f37982k == null) {
            if (this.f37983l != null) {
                this.f37982k = new String(this.f37983l);
            } else if (this.f37976e < 0) {
                int i = this.f37980i;
                int i2 = this.f37973b;
                if (i == 0) {
                    if (i2 == 0) {
                        str = "";
                    } else {
                        str = new String(this.f37981j, 0, i2);
                    }
                    this.f37982k = str;
                } else {
                    StringBuilder sb = new StringBuilder(i + i2);
                    if (this.f37978g != null) {
                        int size = this.f37978g.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            char[] cArr = (char[]) this.f37978g.get(i3);
                            sb.append(cArr, 0, cArr.length);
                        }
                    }
                    sb.append(this.f37981j, 0, this.f37973b);
                    this.f37982k = sb.toString();
                }
            } else if (this.f37977f <= 0) {
                String str2 = "";
                this.f37982k = str2;
                return str2;
            } else {
                this.f37982k = new String(this.f37975d, this.f37976e, this.f37977f);
            }
        }
        return this.f37982k;
    }

    /* renamed from: i */
    private char[] m42487i() {
        char[] cArr;
        int i;
        if (this.f37982k != null) {
            return this.f37982k.toCharArray();
        }
        if (this.f37976e < 0) {
            int g = m42485g();
            if (g <= 0) {
                return f37972a;
            }
            cArr = m42482b(g);
            if (this.f37978g != null) {
                int size = this.f37978g.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    char[] cArr2 = (char[]) this.f37978g.get(i2);
                    int length = cArr2.length;
                    System.arraycopy(cArr2, 0, cArr, i, length);
                    i += length;
                }
            } else {
                i = 0;
            }
            System.arraycopy(this.f37981j, 0, cArr, i, this.f37973b);
        } else if (this.f37977f <= 0) {
            return f37972a;
        } else {
            cArr = m42482b(this.f37977f);
            System.arraycopy(this.f37975d, this.f37976e, cArr, 0, this.f37977f);
        }
        return cArr;
    }

    /* renamed from: b */
    private static char[] m42482b(int i) {
        return new char[i];
    }

    public C14681b(BufferRecycler bufferRecycler) {
        this.f37974c = bufferRecycler;
    }

    /* renamed from: a */
    private char[] m42481a(int i) {
        if (this.f37974c != null) {
            return this.f37974c.mo37229a(CharBufferType.TEXT_BUFFER, 0);
        }
        return new char[Math.max(0, 1000)];
    }
}
