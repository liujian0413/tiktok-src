package dmt.p1861av.video;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import java.util.ArrayList;

/* renamed from: dmt.av.video.g */
public final class C47458g<T> extends C0052o<T> {

    /* renamed from: a */
    public final ArrayList<T> f121859a = new ArrayList<>();

    public final void setValue(T t) {
        super.setValue(t);
        this.f121859a.add(t);
    }

    public final void observe(C0043i iVar, final C0053p<T> pVar) {
        super.observe(iVar, new C0053p<T>() {

            /* renamed from: a */
            boolean f121860a;

            public final void onChanged(T t) {
                if (this.f121860a || C47458g.this.f121859a.isEmpty()) {
                    pVar.onChanged(t);
                } else {
                    for (int i = 0; i < C47458g.this.f121859a.size(); i++) {
                        pVar.onChanged(C47458g.this.f121859a.get(i));
                    }
                }
                this.f121860a = true;
            }
        });
    }
}
