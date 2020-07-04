package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import com.p280ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref.IntRef;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CommerceDelegate$updateFragment$8 */
public final class CommerceDelegate$updateFragment$8 extends SimpleOnPageChangeListener {

    /* renamed from: a */
    final /* synthetic */ C23800o f62554a;

    /* renamed from: b */
    final /* synthetic */ IntRef f62555b;

    /* renamed from: c */
    private int f62556c;

    public final void onPageSelected(int i) {
        Fragment a = this.f62554a.mo61847b().mo2423a(i);
        if (!(a instanceof CommerceChallengeFragment)) {
            a = null;
        }
        if (a != null) {
            if (a != null) {
                ((CommerceChallengeFragment) a).mo63414f();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
            }
        }
        Fragment a2 = this.f62554a.mo61847b().mo2423a(this.f62556c);
        if (!(a2 instanceof CommerceChallengeFragment)) {
            a2 = null;
        }
        if (a2 != null) {
            if (a2 != null) {
                ((CommerceChallengeFragment) a2).mo63413e();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
            }
        }
        this.f62556c = i;
    }

    CommerceDelegate$updateFragment$8(C23800o oVar, IntRef intRef) {
        this.f62554a = oVar;
        this.f62555b = intRef;
        this.f62556c = intRef.element;
    }
}
