package com.bytedance.lighten.loader;

import com.facebook.common.memory.C13317b;
import com.facebook.common.memory.C13318c;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.lighten.loader.q */
public final class C12176q implements C13318c {

    /* renamed from: a */
    private CopyOnWriteArraySet<C13317b> f32424a;

    /* renamed from: com.bytedance.lighten.loader.q$a */
    static class C12178a {

        /* renamed from: a */
        public static C12176q f32425a = new C12176q();
    }

    /* renamed from: a */
    public static C12176q m35423a() {
        return C12178a.f32425a;
    }

    private C12176q() {
        this.f32424a = new CopyOnWriteArraySet<>();
    }

    /* renamed from: a */
    public final void mo29905a(C13317b bVar) {
        this.f32424a.add(bVar);
    }

    /* renamed from: a */
    public final void mo29904a(MemoryTrimType memoryTrimType) {
        try {
            Iterator it = this.f32424a.iterator();
            while (it.hasNext()) {
                ((C13317b) it.next()).mo32580a(memoryTrimType);
            }
        } catch (Exception unused) {
        }
    }
}
