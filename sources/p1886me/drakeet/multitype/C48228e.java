package p1886me.drakeet.multitype;

import java.util.ArrayList;
import java.util.List;

/* renamed from: me.drakeet.multitype.e */
public final class C48228e implements C48232i {

    /* renamed from: a */
    private final List<Class<?>> f123132a = new ArrayList();

    /* renamed from: b */
    private final List<C48226c<?, ?>> f123133b = new ArrayList();

    /* renamed from: c */
    private final List<C48227d<?>> f123134c = new ArrayList();

    /* renamed from: a */
    public final C48226c<?, ?> mo120460a(int i) {
        return (C48226c) this.f123133b.get(i);
    }

    /* renamed from: b */
    public final C48227d<?> mo120464b(int i) {
        return (C48227d) this.f123134c.get(i);
    }

    /* renamed from: a */
    public final boolean mo120462a(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f123132a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f123132a.remove(indexOf);
            this.f123133b.remove(indexOf);
            this.f123134c.remove(indexOf);
            z = true;
        }
    }

    /* renamed from: b */
    public final int mo120463b(Class<?> cls) {
        int indexOf = this.f123132a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.f123132a.size(); i++) {
            if (((Class) this.f123132a.get(i)).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final <T> void mo120461a(Class<? extends T> cls, C48226c<T, ?> cVar, C48227d<T> dVar) {
        this.f123132a.add(cls);
        this.f123133b.add(cVar);
        this.f123134c.add(dVar);
    }
}
