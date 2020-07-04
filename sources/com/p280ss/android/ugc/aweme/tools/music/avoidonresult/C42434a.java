package com.p280ss.android.ugc.aweme.tools.music.avoidonresult;

import android.content.Intent;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.tools.music.avoidonresult.a */
public final class C42434a {

    /* renamed from: a */
    public static final C42436b f110332a = new C42436b(null);

    /* renamed from: c */
    private static final String f110333c = f110333c;

    /* renamed from: b */
    private AvoidOnResultFragment f110334b;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.avoidonresult.a$a */
    public interface C42435a {
        /* renamed from: a */
        void mo103870a(int i, Intent intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.avoidonresult.a$b */
    public static final class C42436b {
        private C42436b() {
        }

        public /* synthetic */ C42436b(C7571f fVar) {
            this();
        }
    }

    public C42434a(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            this.f110334b = m134888a(fragmentActivity);
        }
    }

    /* renamed from: b */
    private static AvoidOnResultFragment m134889b(FragmentActivity fragmentActivity) {
        Fragment a = fragmentActivity.getSupportFragmentManager().mo2644a(f110333c);
        if (a == null) {
            return null;
        }
        C7573i.m23582a((Object) a, "activity.supportFragment…ByTag(TAG) ?: return null");
        if (a != null) {
            return (AvoidOnResultFragment) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment");
    }

    /* renamed from: a */
    private final AvoidOnResultFragment m134888a(FragmentActivity fragmentActivity) {
        AvoidOnResultFragment b = m134889b(fragmentActivity);
        if (b == null) {
            b = new AvoidOnResultFragment();
            C0608j supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.mo2645a().mo2588a((Fragment) b, f110333c).mo2606d();
            if (supportFragmentManager != null) {
                supportFragmentManager.mo2654b();
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo103947a(int i, C7562b<? super Fragment, C7581n> bVar, C42435a aVar) {
        C7573i.m23587b(bVar, "runnable");
        C7573i.m23587b(aVar, "callback");
        AvoidOnResultFragment avoidOnResultFragment = this.f110334b;
        if (avoidOnResultFragment == null) {
            C7573i.m23583a("mAvoidOnResultFragment");
        }
        avoidOnResultFragment.mo103946a(i, bVar, aVar);
    }
}
