package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@C6505uv
public final class bus {

    /* renamed from: a */
    private final Object f43647a = new Object();

    /* renamed from: b */
    private int f43648b;

    /* renamed from: c */
    private List<bur> f43649c = new LinkedList();

    /* renamed from: a */
    public final bur mo41356a() {
        synchronized (this.f43647a) {
            bur bur = null;
            if (this.f43649c.size() == 0) {
                acd.m45777b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f43649c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (bur bur2 : this.f43649c) {
                    int i4 = bur2.f43633c;
                    if (i4 > i2) {
                        i = i3;
                        bur = bur2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f43649c.remove(i);
                return bur;
            }
            bur bur3 = (bur) this.f43649c.get(0);
            bur3.mo41348b();
            return bur3;
        }
    }

    /* renamed from: a */
    public final boolean mo41357a(bur bur) {
        synchronized (this.f43647a) {
            if (this.f43649c.contains(bur)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo41358b(bur bur) {
        synchronized (this.f43647a) {
            Iterator it = this.f43649c.iterator();
            while (it.hasNext()) {
                bur bur2 = (bur) it.next();
                if (!C14793ay.m42898d().mo39100j().mo39146c()) {
                    if (bur != bur2 && bur2.f43634d.equals(bur.f43634d)) {
                        it.remove();
                        return true;
                    }
                } else if (!C14793ay.m42898d().mo39100j().mo39150e() && bur != bur2 && bur2.f43636f.equals(bur.f43636f)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo41359c(bur bur) {
        synchronized (this.f43647a) {
            if (this.f43649c.size() >= 10) {
                int size = this.f43649c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                acd.m45777b(sb.toString());
                this.f43649c.remove(0);
            }
            int i = this.f43648b;
            this.f43648b = i + 1;
            bur.f43632b = i;
            this.f43649c.add(bur);
        }
    }
}
