package com.p280ss.android.ugc.aweme.discover.helper;

import android.animation.TimeInterpolator;
import android.support.transition.C0476c;
import android.support.transition.C0488d;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.j */
public final class C26662j {

    /* renamed from: a */
    private final ViewGroup f70297a;

    /* renamed from: b */
    private final View f70298b;

    /* renamed from: c */
    private final View f70299c;

    /* renamed from: a */
    public final void mo68367a() {
        m87605a(true);
    }

    /* renamed from: b */
    public final void mo68368b() {
        m87605a(false);
    }

    /* renamed from: a */
    private final void m87605a(boolean z) {
        C0520q qVar = new C0520q();
        qVar.mo2151a(new C0488d().mo2131b(this.f70298b));
        qVar.mo2151a(new C0476c().mo2131b(this.f70299c));
        qVar.mo2116a((TimeInterpolator) new LinearInterpolator());
        qVar.mo2115a(100);
        C0516o.m2171a(this.f70297a, qVar);
        if (z) {
            this.f70298b.setVisibility(8);
            LayoutParams layoutParams = this.f70299c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = C23486n.m77122a(16.0d);
                this.f70299c.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        this.f70298b.setVisibility(0);
        LayoutParams layoutParams2 = this.f70299c.getLayoutParams();
        if (layoutParams2 != null) {
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
            marginLayoutParams2.leftMargin = C23486n.m77122a(0.0d);
            this.f70299c.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C26662j(ViewGroup viewGroup, View view, View view2) {
        C7573i.m23587b(viewGroup, "sceneRoot");
        C7573i.m23587b(view, "scanView");
        C7573i.m23587b(view2, "inputContainer");
        this.f70297a = viewGroup;
        this.f70298b = view;
        this.f70299c = view2;
    }
}
