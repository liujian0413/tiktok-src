package com.p280ss.android.download.p861b;

import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: com.ss.android.download.b.d */
public final class C19407d extends PrintWriter {

    /* renamed from: a */
    private final String f52514a;

    /* renamed from: b */
    private final int f52515b;

    /* renamed from: c */
    private StringBuilder f52516c;

    /* renamed from: d */
    private char[] f52517d;

    /* renamed from: e */
    private int f52518e;

    /* renamed from: f */
    private boolean f52519f;

    /* renamed from: a */
    public final void mo51418a() {
        this.f52516c.append(this.f52514a);
        this.f52517d = null;
    }

    /* renamed from: b */
    public final void mo51420b() {
        this.f52516c.delete(0, this.f52514a.length());
        this.f52517d = null;
    }

    /* renamed from: c */
    private void m63757c() {
        if (this.f52519f) {
            this.f52519f = false;
            if (this.f52516c.length() != 0) {
                if (this.f52517d == null) {
                    this.f52517d = this.f52516c.toString().toCharArray();
                }
                super.write(this.f52517d, 0, this.f52517d.length);
            }
        }
    }

    public C19407d(Writer writer, String str) {
        this(writer, str, -1);
    }

    /* renamed from: a */
    public final void mo51419a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(String.valueOf(obj));
        sb.append(" ");
        print(sb.toString());
    }

    private C19407d(Writer writer, String str, int i) {
        super(writer);
        this.f52516c = new StringBuilder();
        this.f52519f = true;
        this.f52514a = str;
        this.f52515b = -1;
    }

    public final void write(char[] cArr, int i, int i2) {
        int length = this.f52516c.length();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int i5 = i + 1;
            char c = cArr[i];
            this.f52518e++;
            if (c == 10) {
                m63757c();
                super.write(cArr, i4, i5 - i4);
                this.f52519f = true;
                this.f52518e = 0;
                i4 = i5;
            }
            if (this.f52515b > 0 && this.f52518e >= this.f52515b - length) {
                if (!this.f52519f) {
                    super.write(10);
                    this.f52519f = true;
                    this.f52518e = i5 - i4;
                } else {
                    m63757c();
                    super.write(cArr, i4, i5 - i4);
                    super.write(10);
                    this.f52519f = true;
                    this.f52518e = 0;
                    i4 = i5;
                }
            }
            i = i5;
        }
        if (i4 != i) {
            m63757c();
            super.write(cArr, i4, i - i4);
        }
    }
}
