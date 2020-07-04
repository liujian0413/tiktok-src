package com.fasterxml.jackson.core.p734a;

import com.fasterxml.jackson.core.p735b.C14655d;
import com.fasterxml.jackson.core.p737io.C14674c;
import com.fasterxml.jackson.core.util.C14681b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.a.b */
public abstract class C14648b extends C14649c {

    /* renamed from: k */
    static final BigInteger f37808k = BigInteger.valueOf(-2147483648L);

    /* renamed from: l */
    static final BigInteger f37809l = BigInteger.valueOf(2147483647L);

    /* renamed from: m */
    static final BigInteger f37810m = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: n */
    static final BigInteger f37811n = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: o */
    static final BigDecimal f37812o = new BigDecimal(f37810m);

    /* renamed from: p */
    static final BigDecimal f37813p = new BigDecimal(f37811n);

    /* renamed from: q */
    static final BigDecimal f37814q = new BigDecimal(f37808k);

    /* renamed from: r */
    static final BigDecimal f37815r = new BigDecimal(f37809l);

    /* renamed from: b */
    protected final C14674c f37816b;

    /* renamed from: c */
    protected boolean f37817c;

    /* renamed from: d */
    protected int f37818d;

    /* renamed from: e */
    protected int f37819e;

    /* renamed from: f */
    protected int f37820f = 1;

    /* renamed from: g */
    public int f37821g = 1;

    /* renamed from: h */
    public C14655d f37822h;

    /* renamed from: i */
    protected final C14681b f37823i;

    /* renamed from: j */
    protected char[] f37824j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37140a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37141b() throws IOException {
        this.f37823i.mo37265a();
        char[] cArr = this.f37824j;
        if (cArr != null) {
            this.f37824j = null;
            this.f37816b.mo37200c(cArr);
        }
    }

    public void close() throws IOException {
        if (!this.f37817c) {
            this.f37817c = true;
            try {
                mo37140a();
            } finally {
                mo37141b();
            }
        }
    }

    protected C14648b(C14674c cVar, int i) {
        this.f37798a = i;
        this.f37816b = cVar;
        this.f37823i = cVar.mo37194a();
        this.f37822h = C14655d.m42382f();
    }
}
