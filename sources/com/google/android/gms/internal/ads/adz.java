package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class adz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f40085a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f40086b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f40087c = new ArrayList();

    /* renamed from: a */
    public final adz mo39244a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f40085a.size()) {
            double doubleValue = ((Double) this.f40087c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f40086b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f40085a.add(i, str);
        this.f40087c.add(i, Double.valueOf(d));
        this.f40086b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: a */
    public final adw mo39243a() {
        return new adw(this);
    }
}
