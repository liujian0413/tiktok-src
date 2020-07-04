package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@C6505uv
final class alv {

    /* renamed from: a */
    private final ArrayList<bri> f40612a = new ArrayList<>();

    /* renamed from: b */
    private long f40613b;

    alv() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo39675a() {
        Iterator it = this.f40612a.iterator();
        while (it.hasNext()) {
            Map c = ((bri) it.next()).mo41199c();
            if (c != null) {
                for (Entry entry : c.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f40613b = Math.max(this.f40613b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f40613b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39676a(bri bri) {
        this.f40612a.add(bri);
    }
}
