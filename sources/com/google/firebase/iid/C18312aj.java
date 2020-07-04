package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;

/* renamed from: com.google.firebase.iid.aj */
public final class C18312aj extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzb f49776a;

    C18312aj(zzb zzb) {
        this.f49776a = zzb;
    }

    /* renamed from: a */
    public final void mo47222a(C18310ah ahVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        } else if (this.f49776a.zzc(ahVar.f49770a)) {
            ahVar.mo47220a();
        } else {
            this.f49776a.zzi.execute(new C18313ak(this, ahVar));
        }
    }
}
