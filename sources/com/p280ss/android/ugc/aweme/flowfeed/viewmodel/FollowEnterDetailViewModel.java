package com.p280ss.android.ugc.aweme.flowfeed.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel */
public final class FollowEnterDetailViewModel extends C0063u {

    /* renamed from: b */
    public static final C29434a f77625b = new C29434a(null);

    /* renamed from: a */
    public boolean f77626a;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel$a */
    public static final class C29434a {
        private C29434a() {
        }

        public /* synthetic */ C29434a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FollowEnterDetailViewModel m96851a(String str, FragmentActivity fragmentActivity) {
            C7573i.m23587b(str, "tag");
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo148a("FollowEnterDetailViewModel", FollowEnterDetailViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (FollowEnterDetailViewModel) a;
        }
    }

    /* renamed from: a */
    public static final FollowEnterDetailViewModel m96850a(String str, FragmentActivity fragmentActivity) {
        return C29434a.m96851a(str, fragmentActivity);
    }
}
