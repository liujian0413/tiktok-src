package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;

@C6505uv
public final class bur {

    /* renamed from: a */
    public int f43631a = 0;

    /* renamed from: b */
    public int f43632b = 0;

    /* renamed from: c */
    public int f43633c;

    /* renamed from: d */
    public String f43634d = "";

    /* renamed from: e */
    public String f43635e = "";

    /* renamed from: f */
    public String f43636f = "";

    /* renamed from: g */
    private final int f43637g;

    /* renamed from: h */
    private final int f43638h;

    /* renamed from: i */
    private final int f43639i;

    /* renamed from: j */
    private final bve f43640j;

    /* renamed from: k */
    private final bvn f43641k;

    /* renamed from: l */
    private final Object f43642l = new Object();

    /* renamed from: m */
    private ArrayList<String> f43643m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<String> f43644n = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<bvc> f43645o = new ArrayList<>();

    /* renamed from: p */
    private int f43646p = 0;

    public bur(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f43637g = i;
        this.f43638h = i2;
        this.f43639i = i3;
        this.f43640j = new bve(i4);
        this.f43641k = new bvn(i5, i6, i7);
    }

    /* renamed from: a */
    public final boolean mo41347a() {
        boolean z;
        synchronized (this.f43642l) {
            z = this.f43646p == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo41348b() {
        synchronized (this.f43642l) {
            this.f43633c -= 100;
        }
    }

    /* renamed from: c */
    public final void mo41350c() {
        synchronized (this.f43642l) {
            this.f43646p--;
        }
    }

    /* renamed from: d */
    public final void mo41351d() {
        synchronized (this.f43642l) {
            this.f43646p++;
        }
    }

    /* renamed from: a */
    public final void mo41346a(String str, boolean z, float f, float f2, float f3, float f4) {
        m50116c(str, z, f, f2, f3, f4);
        synchronized (this.f43642l) {
            if (this.f43646p < 0) {
                acd.m45777b("ActivityContent: negative number of WebViews.");
            }
            mo41352e();
        }
    }

    /* renamed from: b */
    public final void mo41349b(String str, boolean z, float f, float f2, float f3, float f4) {
        m50116c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    private final void m50116c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f43639i) {
            synchronized (this.f43642l) {
                this.f43643m.add(str);
                this.f43631a += str.length();
                if (z) {
                    this.f43644n.add(str);
                    ArrayList<bvc> arrayList = this.f43645o;
                    bvc bvc = new bvc(f, f2, f3, f4, this.f43644n.size() - 1);
                    arrayList.add(bvc);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo41352e() {
        synchronized (this.f43642l) {
            int i = (this.f43631a * this.f43637g) + (this.f43632b * this.f43638h);
            if (i > this.f43633c) {
                this.f43633c = i;
                if (!C14793ay.m42898d().mo39100j().mo39146c()) {
                    this.f43634d = this.f43640j.mo41386a(this.f43643m);
                    this.f43635e = this.f43640j.mo41386a(this.f43644n);
                }
                if (!C14793ay.m42898d().mo39100j().mo39150e()) {
                    this.f43636f = this.f43641k.mo41393a(this.f43644n, this.f43645o);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m50115a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.f43632b;
        int i2 = this.f43633c;
        int i3 = this.f43631a;
        String a = m50115a(this.f43643m, 100);
        String a2 = m50115a(this.f43644n, 100);
        String str = this.f43634d;
        String str2 = this.f43635e;
        String str3 = this.f43636f;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bur)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bur bur = (bur) obj;
        return bur.f43634d != null && bur.f43634d.equals(this.f43634d);
    }

    public final int hashCode() {
        return this.f43634d.hashCode();
    }
}
