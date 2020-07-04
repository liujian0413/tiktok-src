package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import android.arch.lifecycle.C0043i;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47868q;
import p346io.reactivex.C7490k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.d */
public final class C21904d {
    /* renamed from: a */
    public static final <T> C7490k<T> m73119a(C7490k<T> kVar, AmeBaseFragment ameBaseFragment) {
        C7573i.m23587b(kVar, "$this$bindLifeCycle");
        C7573i.m23587b(ameBaseFragment, "fragment");
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        if (ameBaseFragment.isViewValid()) {
            C0043i viewLifecycleOwner = ameBaseFragment.getViewLifecycleOwner();
            C7573i.m23582a((Object) viewLifecycleOwner, "fragment.viewLifecycleOwner");
            viewLifecycleOwner.getLifecycle().mo55a(maybeBindLifeCycleTransformer);
        } else {
            ameBaseFragment.getLifecycle().mo55a(maybeBindLifeCycleTransformer);
        }
        C7490k<T> a = kVar.mo19268a((C47868q<? super T, ? extends R>) maybeBindLifeCycleTransformer);
        C7573i.m23582a((Object) a, "compose(transformer)");
        return a;
    }
}
