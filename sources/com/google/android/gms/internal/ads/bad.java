package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class bad implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f41303a;

    /* renamed from: b */
    private boolean f41304b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f41305c;

    /* renamed from: d */
    private final /* synthetic */ azv f41306d;

    private bad(azv azv) {
        this.f41306d = azv;
        this.f41303a = -1;
    }

    public final boolean hasNext() {
        if (this.f41303a + 1 < this.f41306d.f41288c.size() || (!this.f41306d.f41289d.isEmpty() && m48067a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f41304b) {
            this.f41304b = false;
            this.f41306d.m48042e();
            if (this.f41303a < this.f41306d.f41288c.size()) {
                azv azv = this.f41306d;
                int i = this.f41303a;
                this.f41303a = i - 1;
                azv.m48039c(i);
                return;
            }
            m48067a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m48067a() {
        if (this.f41305c == null) {
            this.f41305c = this.f41306d.f41289d.entrySet().iterator();
        }
        return this.f41305c;
    }

    public final /* synthetic */ Object next() {
        this.f41304b = true;
        int i = this.f41303a + 1;
        this.f41303a = i;
        if (i < this.f41306d.f41288c.size()) {
            return (Entry) this.f41306d.f41288c.get(this.f41303a);
        }
        return (Entry) m48067a().next();
    }

    /* synthetic */ bad(azv azv, azw azw) {
        this(azv);
    }
}
