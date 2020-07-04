package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.c */
public final class C11723c {

    /* renamed from: a */
    private final List<Boolean> f31501a = new ArrayList();

    /* renamed from: a */
    public final int mo29290a() {
        return this.f31501a.size();
    }

    /* renamed from: b */
    public final void mo29294b() {
        if (this.f31501a.size() != 0) {
            this.f31501a.clear();
        }
    }

    /* renamed from: d */
    private final void m34371d(int i) {
        this.f31501a.add(i, Boolean.valueOf(false));
    }

    /* renamed from: c */
    private final void m34370c(int i) {
        if (i < this.f31501a.size()) {
            this.f31501a.set(i, Boolean.valueOf(true));
        } else {
            this.f31501a.add(i, Boolean.valueOf(true));
        }
    }

    /* renamed from: b */
    public final void mo29295b(int i) {
        if (i < this.f31501a.size()) {
            this.f31501a.remove(i);
        }
    }

    /* renamed from: a */
    public final boolean mo29293a(int i) {
        if (i < 0 || i >= this.f31501a.size()) {
            return false;
        }
        return ((Boolean) this.f31501a.get(i)).booleanValue();
    }

    /* renamed from: a */
    public final void mo29292a(int i, boolean z) {
        if (i >= 0 && i <= this.f31501a.size()) {
            if (z) {
                m34370c(i);
            } else {
                m34371d(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo29291a(int i, int i2) {
        List<Boolean> list = this.f31501a;
        if (i < list.size() && i2 < list.size()) {
            boolean booleanValue = ((Boolean) list.get(i)).booleanValue();
            list.set(i, list.get(i2));
            list.set(i2, Boolean.valueOf(booleanValue));
        }
    }
}
