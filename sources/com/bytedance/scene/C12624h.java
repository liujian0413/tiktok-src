package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.scene.C12600g.C12601a;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.h */
final class C12624h implements C12642n {

    /* renamed from: a */
    public final Activity f33503a;

    /* renamed from: b */
    public final C12600g f33504b;

    /* renamed from: c */
    private final C12648d f33505c;

    /* renamed from: d */
    private final C12679u f33506d;

    /* renamed from: e */
    private final Boolean f33507e;

    /* renamed from: f */
    private boolean f33508f;

    /* renamed from: a */
    public final boolean mo30877a() {
        if (this.f33508f || !this.f33505c.mo31069b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo30878b() {
        if (!this.f33508f) {
            this.f33508f = true;
            final View view = this.f33505c.f33523b;
            FragmentManager fragmentManager = this.f33503a.getFragmentManager();
            FragmentTransaction remove = fragmentManager.beginTransaction().remove(this.f33504b).remove(this.f33506d);
            if (this.f33507e.booleanValue()) {
                this.f33504b.f33434a = new C12601a() {
                    /* renamed from: a */
                    public final void mo30892a() {
                        C12626i.m36632b(C12624h.this.f33503a, C12624h.this.f33504b.getTag());
                        if (view != null) {
                            C12700j.m36911a(view);
                        }
                    }
                };
                C12700j.m36910a(fragmentManager, remove, true);
                return;
            }
            C12700j.m36910a(fragmentManager, remove, false);
            C12626i.m36632b(this.f33503a, this.f33504b.getTag());
            if (view != null) {
                C12700j.m36911a(view);
            }
        }
    }

    C12624h(Activity activity, C12648d dVar, C12600g gVar, C12679u uVar, boolean z) {
        this.f33503a = activity;
        this.f33505c = dVar;
        this.f33504b = gVar;
        this.f33506d = uVar;
        this.f33507e = Boolean.valueOf(z);
    }
}
