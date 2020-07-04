package com.p280ss.android.ugc.aweme.shortvideo.widget.animation;

import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator.VpaListenerAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.TranslateFadeInOutAnimator$animateRemoveImpl$$inlined$let$lambda$1 */
public final class C41683x195939fd extends VpaListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0998y f108494a;

    /* renamed from: b */
    final /* synthetic */ TranslateFadeInOutAnimator f108495b;

    /* renamed from: c */
    final /* synthetic */ C1293v f108496c;

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
        this.f108494a.mo3800a((C1002z) null);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        this.f108495b.mo6003h(this.f108496c);
        this.f108495b.f108451f.remove(this.f108496c);
        this.f108495b.mo5333c();
    }

    C41683x195939fd(C0998y yVar, TranslateFadeInOutAnimator translateFadeInOutAnimator, C1293v vVar) {
        this.f108494a = yVar;
        this.f108495b = translateFadeInOutAnimator;
        this.f108496c = vVar;
    }
}
