package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel */
public final class FriendTabViewModel extends C0063u {

    /* renamed from: c */
    public static final C34155a f89045c = new C34155a(null);

    /* renamed from: a */
    public final C0052o<C34170d> f89046a = new C0052o<>();

    /* renamed from: b */
    public final C0052o<C34171e> f89047b = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel$a */
    public static final class C34155a {
        private C34155a() {
        }

        public /* synthetic */ C34155a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FriendTabViewModel m110120a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(FriendTabViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…TabViewModel::class.java)");
            return (FriendTabViewModel) a;
        }
    }

    /* renamed from: a */
    public static final FriendTabViewModel m110119a(FragmentActivity fragmentActivity) {
        return C34155a.m110120a(fragmentActivity);
    }
}
