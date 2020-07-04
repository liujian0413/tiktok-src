package com.p280ss.android.ugc.aweme.base.widget.recyclerview;

import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.widget.RecyclerView.C1293v;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.FadeInAnimator */
public class FadeInAnimator extends BaseItemAnimator {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61157c(C1293v vVar) {
        C0991u.m4205c(vVar.itemView, 0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo61158k(C1293v vVar) {
        C0991u.m4238q(vVar.itemView).mo3797a(0.0f).mo3798a(this.f4941j).mo3801a(this.f62042n).mo3800a((C1002z) new DefaultRemoveVpaListener(vVar)).mo3803b(mo61161n(vVar)).mo3806c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo61159l(C1293v vVar) {
        C0991u.m4238q(vVar.itemView).mo3797a(1.0f).mo3798a(this.f4940i).mo3801a(this.f62042n).mo3800a((C1002z) new DefaultAddVpaListener(vVar)).mo3803b(mo61162o(vVar)).mo3806c();
    }
}
