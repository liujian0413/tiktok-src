package com.bytedance.android.livesdk.log.p405b;

/* renamed from: com.bytedance.android.livesdk.log.b.g */
public class C8435g {

    /* renamed from: a */
    public long f23065a;

    /* renamed from: b */
    public long f23066b;

    /* renamed from: c */
    public String f23067c;

    /* renamed from: d */
    public String f23068d;

    /* renamed from: e */
    public String f23069e;

    /* renamed from: f */
    public String f23070f;

    /* renamed from: g */
    public long f23071g;

    /* renamed from: h */
    public String f23072h;

    /* renamed from: i */
    public String f23073i;

    /* renamed from: j */
    public int f23074j;

    /* renamed from: k */
    public String f23075k;

    /* renamed from: a */
    public final C8435g mo21590a(int i) {
        this.f23074j = i;
        return this;
    }

    /* renamed from: b */
    public final C8435g mo21594b(long j) {
        this.f23065a = j;
        return this;
    }

    /* renamed from: c */
    public final C8435g mo21596c(long j) {
        this.f23066b = j;
        return this;
    }

    /* renamed from: a */
    public final C8435g mo21593a(String str) {
        this.f23068d = str;
        return this;
    }

    /* renamed from: b */
    public final C8435g mo21595b(String str) {
        this.f23073i = str;
        return this;
    }

    /* renamed from: c */
    public final C8435g mo21597c(String str) {
        this.f23067c = str;
        return this;
    }

    /* renamed from: a */
    public final C8435g mo21592a(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        this.f23070f = str;
        return this;
    }

    /* renamed from: a */
    public final C8435g mo21591a(long j) {
        String str;
        String[] strArr = {"mutual_follow", "recommend", "recent", "other_follow"};
        int i = ((int) j) - 1;
        if (i >= 4 || i < 0) {
            str = "";
        } else {
            str = strArr[i];
        }
        this.f23069e = str;
        return this;
    }
}
