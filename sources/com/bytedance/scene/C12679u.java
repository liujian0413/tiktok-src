package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.C12675t.C12677a;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.u */
public final class C12679u extends Fragment implements C12677a {

    /* renamed from: a */
    private final C12675t f33656a = C12675t.f33650a.mo31128a();

    /* renamed from: a */
    public final C12675t mo31128a() {
        return this.f33656a;
    }

    /* renamed from: b */
    private static C12679u m36865b() {
        return new C12679u();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: a */
    public static C12679u m36864a(Activity activity, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_ScopeHolderFragment");
        String sb2 = sb.toString();
        FragmentManager fragmentManager = activity.getFragmentManager();
        C12679u uVar = (C12679u) fragmentManager.findFragmentByTag(sb2);
        if (uVar != null && z) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(uVar);
            C12700j.m36910a(fragmentManager, beginTransaction, z2);
            uVar = null;
        }
        if (uVar != null) {
            return uVar;
        }
        C12679u b = m36865b();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(b, sb2);
        C12700j.m36910a(fragmentManager, beginTransaction2, z2);
        return b;
    }
}
