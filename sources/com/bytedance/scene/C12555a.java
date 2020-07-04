package com.bytedance.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Intent;
import com.bytedance.scene.C12634k.C12635a;
import com.bytedance.scene.p642b.C12582a;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.a */
public final class C12555a {
    /* renamed from: a */
    private static C12634k m36463a(Activity activity) {
        C12634k kVar = (C12634k) activity.getFragmentManager().findFragmentByTag(C12634k.class.getName());
        if (kVar != null) {
            return kVar;
        }
        C12634k a = C12634k.m36703a();
        C12700j.m36910a(activity.getFragmentManager(), activity.getFragmentManager().beginTransaction().add(a, C12634k.class.getName()), false);
        return a;
    }

    /* renamed from: a */
    public static boolean m36465a(Activity activity, C0043i iVar) {
        if (C12700j.m36913a(activity) && iVar.getLifecycle().mo54a() != State.DESTROYED) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m36464a(Activity activity, C0043i iVar, Intent intent, int i, C12582a aVar) {
        C12699i.m36905a();
        if (!m36465a(activity, iVar)) {
            C12634k a = m36463a(activity);
            if (a.isAdded()) {
                a.mo31023a(iVar, intent, i, aVar);
                return;
            }
            final C12634k kVar = a;
            final Activity activity2 = activity;
            final C0043i iVar2 = iVar;
            final Intent intent2 = intent;
            final int i2 = i;
            final C12582a aVar2 = aVar;
            C125561 r1 = new C12635a() {
                /* renamed from: a */
                public final void mo30834a() {
                    kVar.mo31025b(this);
                    if (!C12555a.m36465a(activity2, iVar2)) {
                        kVar.mo31023a(iVar2, intent2, i2, aVar2);
                    }
                }
            };
            a.mo31024a((C12635a) r1);
        }
    }
}
