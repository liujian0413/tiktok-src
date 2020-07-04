package com.bytedance.widget.ext.list;

import com.bytedance.widget.C13031a;
import java.util.List;

/* renamed from: com.bytedance.widget.ext.list.d */
public final class C13042d {

    /* renamed from: a */
    private final List<ItemWidget<?, ?>> f34497a;

    /* renamed from: b */
    private final C13031a f34498b;

    /* renamed from: a */
    public final int mo31612a() {
        return this.f34497a.size();
    }

    /* renamed from: b */
    public final void mo31616b() {
        if (this.f34497a.size() != 0) {
            for (ItemWidget itemWidget : this.f34497a) {
                if (itemWidget != null) {
                    this.f34498b.mo31607b(itemWidget);
                }
            }
            this.f34497a.clear();
        }
    }

    /* renamed from: b */
    private final void m38055b(int i) {
        this.f34497a.add(i, null);
    }

    /* renamed from: a */
    public final void mo31613a(int i) {
        if (i < this.f34497a.size()) {
            ItemWidget itemWidget = (ItemWidget) this.f34497a.remove(i);
            if (itemWidget != null) {
                this.f34498b.mo31607b(itemWidget);
            }
        }
    }

    /* renamed from: a */
    public final void mo31615a(int i, ItemWidget<?, ?> itemWidget) {
        if (i >= 0 && i <= this.f34497a.size()) {
            m38055b(i);
        }
    }

    /* renamed from: a */
    public final void mo31614a(int i, int i2) {
        List<ItemWidget<?, ?>> list = this.f34497a;
        if (i < list.size() && i2 < list.size()) {
            ItemWidget itemWidget = (ItemWidget) list.get(i);
            list.set(i, list.get(i2));
            list.set(i2, itemWidget);
        }
    }
}
