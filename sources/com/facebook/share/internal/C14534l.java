package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C13498g;
import com.facebook.FacebookException;
import com.facebook.internal.C13861a;

/* renamed from: com.facebook.share.internal.l */
public abstract class C14534l {

    /* renamed from: a */
    private C13498g f37555a;

    /* renamed from: a */
    public abstract void mo36686a(C13861a aVar, Bundle bundle);

    public C14534l(C13498g gVar) {
        this.f37555a = gVar;
    }

    /* renamed from: a */
    public void mo36685a(C13861a aVar) {
        if (this.f37555a != null) {
            this.f37555a.mo29948n_();
        }
    }

    /* renamed from: a */
    public void mo36687a(C13861a aVar, FacebookException facebookException) {
        if (this.f37555a != null) {
            this.f37555a.mo29946a(facebookException);
        }
    }
}
