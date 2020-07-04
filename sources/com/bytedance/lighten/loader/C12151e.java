package com.bytedance.lighten.loader;

import com.facebook.common.p686c.C13286a;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p703b.C13470b;
import com.facebook.fresco.animation.p703b.p705b.C13471a;
import com.facebook.fresco.animation.p703b.p705b.C13472b;
import com.facebook.fresco.animation.p703b.p705b.C13475d;

/* renamed from: com.bytedance.lighten.loader.e */
final class C12151e implements C13471a {

    /* renamed from: a */
    private static final Class<?> f32377a = C13475d.class;

    /* renamed from: b */
    private final int f32378b;

    /* renamed from: c */
    private int[] f32379c;

    /* renamed from: d */
    private C12152f f32380d;

    public C12151e(int[] iArr, C12152f fVar) {
        this(3, iArr, fVar);
    }

    private C12151e(int i, int[] iArr, C12152f fVar) {
        this.f32378b = 3;
        this.f32379c = iArr;
        this.f32380d = fVar;
    }

    /* renamed from: a */
    public final void mo29881a(C13472b bVar, C13470b bVar2, C13460a aVar, int i) {
        for (int i2 = 1; i2 <= this.f32378b; i2++) {
            int i3 = this.f32379c[(this.f32380d.f32381a + i2) % this.f32379c.length];
            if (i3 >= this.f32380d.mo29885b()) {
                C13286a.m38859c(f32377a, "Preparing frame %d, last drawn: %d, but preparing frame is out of bounds", Integer.valueOf(i3), Integer.valueOf(i));
                return;
            }
            if (C13286a.m38846a(2)) {
                C13286a.m38836a(f32377a, "Preparing frame %d, last drawn: %d", (Object) Integer.valueOf(i3), (Object) Integer.valueOf(i));
            }
            bVar.mo33008a(bVar2, aVar, i3);
        }
    }
}
