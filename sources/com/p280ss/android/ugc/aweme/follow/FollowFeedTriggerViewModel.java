package com.p280ss.android.ugc.aweme.follow;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34137a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel */
public final class FollowFeedTriggerViewModel extends C0063u {

    /* renamed from: b */
    public static final C29435a f77627b = new C29435a(null);

    /* renamed from: a */
    public int f77628a = 1;

    /* renamed from: c */
    private Integer f77629c = Integer.valueOf(3);

    /* renamed from: d */
    private Integer f77630d = Integer.valueOf(4);

    /* renamed from: com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel$a */
    public static final class C29435a {
        private C29435a() {
        }

        public /* synthetic */ C29435a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedTriggerViewModel m96855a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo148a("tag_follow_feed_trigger", FollowFeedTriggerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders\n     …gerViewModel::class.java]");
            return (FollowFeedTriggerViewModel) a;
        }
    }

    /* renamed from: a */
    public static final FollowFeedTriggerViewModel m96852a(FragmentActivity fragmentActivity) {
        return C29435a.m96855a(fragmentActivity);
    }

    /* renamed from: a */
    private final void m96853a() {
        this.f77629c = Integer.valueOf(3);
    }

    /* renamed from: a */
    public final void mo75342a(boolean z, boolean z2) {
        if (!C6399b.m19944t()) {
            C34137a.m109961a(C34137a.m109959a(this.f77629c), z, z2);
            m96853a();
        }
    }
}
