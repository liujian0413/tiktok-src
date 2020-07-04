package com.bytedance.android.livesdk.app.dataholder;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.a */
public abstract class C3909a<T> {

    /* renamed from: a */
    protected List<WeakReference<C3915g<T>>> f11698a = new ArrayList();

    /* renamed from: b */
    public T f11699b;

    /* renamed from: c */
    private boolean f11700c = true;

    /* renamed from: a */
    private void m13788a() {
        Iterator it = this.f11698a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else {
                ((C3915g) weakReference.get()).mo9832a(this.f11699b);
            }
        }
    }

    /* renamed from: a */
    public void mo11452a(T t) {
        if (t != this.f11699b) {
            this.f11699b = t;
            m13788a();
        }
    }

    /* renamed from: b */
    public final void mo11453b(C3915g<T> gVar) {
        Iterator it = this.f11698a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == gVar) {
                it.remove();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo11451a(C3915g<T> gVar) {
        if (gVar != null) {
            Iterator it = this.f11698a.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == gVar) {
                    return;
                }
            }
            this.f11698a.add(new WeakReference(gVar));
            if (this.f11700c) {
                gVar.mo9832a(this.f11699b);
            }
        }
    }
}
