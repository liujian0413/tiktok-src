package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C6505uv
public final class ala implements Iterable<aky> {

    /* renamed from: a */
    private final List<aky> f40535a = new ArrayList();

    /* renamed from: a */
    public static boolean m46250a(aik aik) {
        aky b = m46251b(aik);
        if (b == null) {
            return false;
        }
        b.f40531b.mo39647a();
        return true;
    }

    /* renamed from: b */
    static aky m46251b(aik aik) {
        Iterator it = C14793ay.m42912r().iterator();
        while (it.hasNext()) {
            aky aky = (aky) it.next();
            if (aky.f40530a == aik) {
                return aky;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo39644a(aky aky) {
        this.f40535a.add(aky);
    }

    /* renamed from: b */
    public final void mo39645b(aky aky) {
        this.f40535a.remove(aky);
    }

    public final Iterator<aky> iterator() {
        return this.f40535a.iterator();
    }

    /* renamed from: a */
    public final int mo39643a() {
        return this.f40535a.size();
    }
}
