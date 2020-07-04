package com.p280ss.android.ttve.common;

import com.p280ss.android.vesdk.C45251ab;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.common.k */
public final class C20454k {

    /* renamed from: a */
    private int f55244a = -1;

    /* renamed from: b */
    private int f55245b = -1;

    /* renamed from: c */
    private List<Integer> f55246c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f55247d = new ArrayList();

    /* renamed from: a */
    public final void mo55061a() {
        this.f55244a = -1;
        this.f55245b = -1;
        this.f55246c.clear();
        this.f55247d.clear();
    }

    /* renamed from: b */
    public final void mo55062b(int i, int i2) {
        if (!C45251ab.m142756b()) {
            this.f55246c.remove(Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final int mo55060a(int i, int i2) {
        if (C45251ab.m142756b()) {
            return i2;
        }
        if (this.f55244a == -1) {
            this.f55244a = i2;
        }
        if (this.f55246c.size() > 0) {
            i2 = ((Integer) this.f55246c.get(this.f55246c.size() - 1)).intValue() + 1;
        }
        this.f55246c.add(Integer.valueOf(i2));
        return i2;
    }

    /* renamed from: c */
    public final int mo55063c(int i, int i2) {
        if (C45251ab.m142756b()) {
            return i2;
        }
        int i3 = 0;
        switch (i) {
            case 1:
                if (i2 >= this.f55244a && this.f55244a != -1) {
                    while (i3 < this.f55246c.size()) {
                        if (i2 == ((Integer) this.f55246c.get(i3)).intValue()) {
                            return i3 + this.f55244a;
                        }
                        i3++;
                    }
                    break;
                } else {
                    return i2;
                }
                break;
            case 2:
                if (i2 >= this.f55245b && this.f55245b != -1) {
                    while (i3 < this.f55247d.size()) {
                        if (i2 == ((Integer) this.f55247d.get(i3)).intValue()) {
                            return i3 + this.f55245b;
                        }
                        i3++;
                    }
                    break;
                } else {
                    return i2;
                }
                break;
        }
        return i2;
    }
}
