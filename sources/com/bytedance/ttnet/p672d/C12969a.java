package com.bytedance.ttnet.p672d;

import java.util.Map;

/* renamed from: com.bytedance.ttnet.d.a */
public final class C12969a {

    /* renamed from: a */
    public boolean f34325a;

    /* renamed from: b */
    public boolean f34326b = true;

    /* renamed from: c */
    public Map<String, Integer> f34327c;

    /* renamed from: d */
    public Map<String, String> f34328d;

    /* renamed from: e */
    public int f34329e = 10;

    /* renamed from: f */
    public int f34330f = 3;

    /* renamed from: g */
    public int f34331g = 3;

    /* renamed from: h */
    public int f34332h = 10;

    /* renamed from: i */
    public int f34333i = 3;

    /* renamed from: j */
    public int f34334j = 3;

    /* renamed from: k */
    public int f34335k = 900;

    /* renamed from: l */
    public int f34336l = 120;

    /* renamed from: m */
    public String f34337m;

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f34325a);
        sb.append(" probeEnable: ");
        sb.append(this.f34326b);
        sb.append(" hostFilter: ");
        int i2 = 0;
        if (this.f34327c != null) {
            i = this.f34327c.size();
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(" hostMap: ");
        if (this.f34328d != null) {
            i2 = this.f34328d.size();
        }
        sb.append(i2);
        sb.append(" reqTo: ");
        sb.append(this.f34329e);
        sb.append("#");
        sb.append(this.f34330f);
        sb.append("#");
        sb.append(this.f34331g);
        sb.append(" reqErr: ");
        sb.append(this.f34332h);
        sb.append("#");
        sb.append(this.f34333i);
        sb.append("#");
        sb.append(this.f34334j);
        sb.append(" updateInterval: ");
        sb.append(this.f34335k);
        sb.append(" updateRandom: ");
        sb.append(this.f34336l);
        sb.append(" httpBlack: ");
        sb.append(this.f34337m);
        return sb.toString();
    }
}
