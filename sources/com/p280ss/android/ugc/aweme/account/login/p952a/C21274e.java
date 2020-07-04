package com.p280ss.android.ugc.aweme.account.login.p952a;

import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21340q;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.e */
public abstract class C21274e extends C21340q {
    /* renamed from: a */
    public abstract void mo57259a(int i, String str);

    /* renamed from: b */
    public abstract void mo57261b(int i, String str);

    /* renamed from: b */
    public abstract void mo57262b(C12710e<C12832o> eVar);

    public C21274e(C21336m mVar) {
        super(mVar);
    }

    public void onSuccess(C12710e<C12832o> eVar) {
        super.onSuccess(eVar);
        mo57262b(eVar);
    }

    /* renamed from: a */
    public final void mo57260a(C12710e<C12832o> eVar) {
        C21671bd.m72522a(1, 3, (Object) eVar.f33703c);
        if (eVar.f33702b == 1202) {
            mo57259a(eVar.f33702b, eVar.f33703c);
            return;
        }
        if (eVar.f33702b != 1011) {
            mo57261b(eVar.f33702b, eVar.f33703c);
        }
    }
}
