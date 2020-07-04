package com.p280ss.android.ugc.aweme.feed.model;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.video.C43222g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel */
public final class FeedSharePlayerViewModel extends C0063u {
    public static final Companion Companion = new Companion(null);
    public boolean hasBindCover;
    public C43222g player;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final C43222g getPlayerManager(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            return getViewModel(fragmentActivity).player;
        }

        public final FeedSharePlayerViewModel getViewModel(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(FeedSharePlayerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…yerViewModel::class.java)");
            return (FeedSharePlayerViewModel) a;
        }
    }

    public static final C43222g getPlayerManager(FragmentActivity fragmentActivity) {
        return Companion.getPlayerManager(fragmentActivity);
    }

    public static final FeedSharePlayerViewModel getViewModel(FragmentActivity fragmentActivity) {
        return Companion.getViewModel(fragmentActivity);
    }
}
