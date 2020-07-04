package com.p280ss.android.ugc.aweme.filter;

import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f.C39373a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.DefaultFilterSwitcher$init$1 */
public final class DefaultFilterSwitcher$init$1 extends SimpleOnPageChangeListener {

    /* renamed from: a */
    final /* synthetic */ C29269c f76903a;

    DefaultFilterSwitcher$init$1(C29269c cVar) {
        this.f76903a = cVar;
    }

    public final void onPageSelected(int i) {
        if (i < this.f76903a.mo74922a().mo74664a().size()) {
            C29296g gVar = (C29296g) this.f76903a.mo74922a().mo74664a().get(i);
            C39373a aVar = this.f76903a.f77231e;
            if (aVar != null) {
                C7573i.m23582a((Object) gVar, "filterBean");
                aVar.mo74916a(gVar, this.f76903a.mo74922a().f76930e);
            }
            if (i < this.f76903a.mo74922a().getCount() - 1) {
                this.f76903a.f77228b = false;
            }
        }
    }
}
