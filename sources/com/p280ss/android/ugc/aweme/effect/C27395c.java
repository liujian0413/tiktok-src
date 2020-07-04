package com.p280ss.android.ugc.aweme.effect;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27422a;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27424c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.effect.c */
public final class C27395c extends C12629j implements C27422a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f72285i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27395c.class), "effectHelper", "getEffectHelper()Lcom/ss/android/ugc/aweme/effect/VEEffectHelper;"))};

    /* renamed from: j */
    public static final C27396a f72286j = new C27396a(null);

    /* renamed from: k */
    private final C7541d f72287k = C7546e.m23569a(C27397b.f72288a);

    /* renamed from: com.ss.android.ugc.aweme.effect.c$a */
    public static final class C27396a {
        private C27396a() {
        }

        public /* synthetic */ C27396a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c$b */
    static final class C27397b extends Lambda implements C7561a<C27446w> {

        /* renamed from: a */
        public static final C27397b f72288a = new C27397b();

        C27397b() {
            super(0);
        }

        /* renamed from: a */
        private static C27446w m89784a() {
            return new C27446w();
        }

        public final /* synthetic */ Object invoke() {
            return m89784a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c$c */
    static final class C27398c<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C27395c f72289a;

        C27398c(C27395c cVar) {
            this.f72289a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                C27446w a = this.f72289a.mo70495a();
                C7573i.m23582a((Object) num, "it");
                a.mo70586c(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c$d */
    static final class C27399d<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C27395c f72290a;

        C27399d(C27395c cVar) {
            this.f72290a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f72290a.mo70495a().mo70603n();
        }
    }

    /* renamed from: a */
    public final C27446w mo70495a() {
        return (C27446w) this.f72287k.getValue();
    }

    /* renamed from: b */
    public final C12629j mo70497b() {
        return this;
    }

    /* renamed from: c */
    public final void mo70498c() {
        mo70495a().mo70600k();
    }

    /* renamed from: d */
    public final void mo70499d() {
        mo70495a().mo70601l();
    }

    /* renamed from: C */
    public final void mo30995C() {
        super.mo30995C();
        mo70495a().mo70589d();
    }

    /* renamed from: q */
    public final void mo31008q() {
        super.mo31008q();
        mo70495a().mo70592e();
    }

    /* renamed from: z */
    public final void mo31019z() {
        super.mo31019z();
        mo70495a().mo70585c();
    }

    /* renamed from: d */
    public final void mo70500d(int i) {
        mo70495a().mo70590d(i);
    }

    /* renamed from: a */
    public final void mo70496a(C27424c cVar) {
        C7573i.m23587b(cVar, "config");
        mo70495a().mo70567a(cVar);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        C27446w a = mo70495a();
        Activity v = mo31015v();
        if (v != null) {
            C0043i iVar = this;
            a.mo70563a((FragmentActivity) v, iVar);
            mo70495a().mo70564a(mo31002b((int) R.id.cyu));
            mo70495a().f72425z.mo70338d().observe(iVar, new C27398c(this));
            mo70495a().f72425z.mo70342h().observe(iVar, new C27399d(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aii, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…effect, container, false)");
        return inflate;
    }
}
