package com.bytedance.apm.p245h;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.h.i */
public final class C9608i {

    /* renamed from: a */
    public long f26285a;

    /* renamed from: b */
    public long f26286b;

    /* renamed from: c */
    public long f26287c;

    /* renamed from: d */
    public long f26288d;

    /* renamed from: e */
    public long f26289e;

    /* renamed from: f */
    public long f26290f;

    /* renamed from: g */
    public long f26291g;

    /* renamed from: h */
    public long f26292h;

    /* renamed from: i */
    public long f26293i;

    /* renamed from: j */
    public long f26294j;

    /* renamed from: k */
    public long f26295k;

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrafficEntity{frontWifiSendBytes=");
        sb.append(this.f26285a);
        sb.append(", frontWifiRecBytes=");
        sb.append(this.f26286b);
        sb.append(", frontMobileSendBytes=");
        sb.append(this.f26287c);
        sb.append(", frontMobileRecBytes=");
        sb.append(this.f26288d);
        sb.append(", backWifiSendBytes=");
        sb.append(this.f26289e);
        sb.append(", backWifiRecBytes=");
        sb.append(this.f26290f);
        sb.append(", backMobileSendBytes=");
        sb.append(this.f26291g);
        sb.append(", backMobileRecBytes=");
        sb.append(this.f26292h);
        sb.append(", frontTotalBytes=");
        sb.append(this.f26293i);
        sb.append(", backTotalBytes=");
        sb.append(this.f26294j);
        sb.append("=");
        sb.append(this.f26295k);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final List<C9609j> mo23955a() {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f26288d > 0) {
            C9609j jVar = new C9609j(this.f26288d, 1, 0, 0, currentTimeMillis);
            arrayList.add(jVar);
        }
        if (this.f26287c > 0) {
            C9609j jVar2 = new C9609j(this.f26287c, 1, 0, 1, currentTimeMillis);
            arrayList.add(jVar2);
        }
        if (this.f26286b > 0) {
            C9609j jVar3 = new C9609j(this.f26286b, 1, 1, 0, currentTimeMillis);
            arrayList.add(jVar3);
        }
        if (this.f26285a > 0) {
            C9609j jVar4 = new C9609j(this.f26285a, 1, 1, 1, currentTimeMillis);
            arrayList.add(jVar4);
        }
        if (this.f26292h > 0) {
            C9609j jVar5 = new C9609j(this.f26292h, 0, 0, 0, currentTimeMillis);
            arrayList.add(jVar5);
        }
        if (this.f26291g > 0) {
            C9609j jVar6 = new C9609j(this.f26291g, 0, 0, 1, currentTimeMillis);
            arrayList.add(jVar6);
        }
        if (this.f26290f > 0) {
            C9609j jVar7 = new C9609j(this.f26290f, 0, 1, 0, currentTimeMillis);
            arrayList.add(jVar7);
        }
        if (this.f26289e > 0) {
            C9609j jVar8 = new C9609j(this.f26289e, 0, 1, 1, currentTimeMillis);
            arrayList.add(jVar8);
        }
        return arrayList;
    }
}
