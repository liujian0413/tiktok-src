package com.p280ss.android.ugc.aweme.shortvideo.widget.animation;

import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator.VpaListenerAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.TranslateFadeInOutAnimator$animateAddImpl$$inlined$let$lambda$1 */
public final class TranslateFadeInOutAnimator$animateAddImpl$$inlined$let$lambda$1 extends VpaListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0998y f108491a;

    /* renamed from: b */
    final /* synthetic */ TranslateFadeInOutAnimator f108492b;

    /* renamed from: c */
    final /* synthetic */ C1293v f108493c;

    /* renamed from: a */
    public final void mo3626a(View view) {
        C7573i.m23587b(view, "view");
    }

    /* renamed from: c */
    public final void mo3628c(View view) {
        C7573i.m23587b(view, "view");
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: b */
    public final void mo3627b(View view) {
        C7573i.m23587b(view, "view");
        this.f108491a.mo3800a((C1002z) null);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        this.f108492b.mo6005j(this.f108493c);
        this.f108492b.f108449d.remove(this.f108493c);
        this.f108492b.mo5333c();
    }

    TranslateFadeInOutAnimator$animateAddImpl$$inlined$let$lambda$1(C0998y yVar, TranslateFadeInOutAnimator translateFadeInOutAnimator, C1293v vVar) {
        this.f108491a = yVar;
        this.f108492b = translateFadeInOutAnimator;
        this.f108493c = vVar;
    }
}
