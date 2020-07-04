package com.p280ss.ttvideoengine.p1814g;

import com.p280ss.ttvideoengine.Resolution;
import java.util.ArrayList;

/* renamed from: com.ss.ttvideoengine.g.a */
public final class C46109a {

    /* renamed from: a */
    public String f117982a;

    /* renamed from: b */
    public String f117983b;

    /* renamed from: c */
    public String f117984c;

    /* renamed from: d */
    public String f117985d;

    /* renamed from: e */
    public int f117986e;

    /* renamed from: f */
    public long f117987f;

    /* renamed from: g */
    public long f117988g;

    /* renamed from: a */
    public final Resolution[] mo112281a() {
        ArrayList arrayList = new ArrayList();
        if ((this.f117988g & 2) == 2) {
            arrayList.add(Resolution.Standard);
        }
        if ((this.f117988g & 4) == 4) {
            arrayList.add(Resolution.High);
        }
        if ((this.f117988g & 8) == 8) {
            arrayList.add(Resolution.SuperHigh);
        }
        if ((this.f117988g & 16) == 16) {
            arrayList.add(Resolution.ExtremelyHigh);
        }
        if ((this.f117988g & 32) == 32) {
            arrayList.add(Resolution.FourK);
        }
        return (Resolution[]) arrayList.toArray(new Resolution[arrayList.size()]);
    }
}
