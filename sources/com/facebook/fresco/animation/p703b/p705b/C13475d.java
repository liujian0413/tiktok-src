package com.facebook.fresco.animation.p703b.p705b;

import com.facebook.common.p686c.C13286a;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p703b.C13470b;

/* renamed from: com.facebook.fresco.animation.b.b.d */
public class C13475d implements C13471a {

    /* renamed from: a */
    private static final Class<?> f35737a = C13475d.class;

    /* renamed from: b */
    private final int f35738b;

    public C13475d() {
        this(3);
    }

    public C13475d(int i) {
        this.f35738b = i;
    }

    /* renamed from: a */
    public final void mo29881a(C13472b bVar, C13470b bVar2, C13460a aVar, int i) {
        for (int i2 = 1; i2 <= this.f35738b; i2++) {
            int d = (i + i2) % aVar.mo32995d();
            if (C13286a.m38846a(2)) {
                C13286a.m38836a(f35737a, "Preparing frame %d, last drawn: %d", (Object) Integer.valueOf(d), (Object) Integer.valueOf(i));
            }
            bVar.mo33008a(bVar2, aVar, d);
        }
    }
}
