package dmt.p1861av.video;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;

/* renamed from: dmt.av.video.j */
public final class C47462j<T> extends C0052o<T> {

    /* renamed from: a */
    public T f121865a;

    public final void setValue(T t) {
        super.setValue(t);
        this.f121865a = t;
    }

    /* renamed from: a */
    public final void mo119587a(C0043i iVar, final C47441b<T> bVar) {
        super.observe(iVar, new C0053p<T>() {
            public final void onChanged(T t) {
                bVar.mo119580a(C47462j.this.f121865a, t);
            }
        });
    }
}
