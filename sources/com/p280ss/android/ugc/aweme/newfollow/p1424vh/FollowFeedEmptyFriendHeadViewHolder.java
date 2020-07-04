package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a.C34113a;
import com.p280ss.android.ugc.aweme.profile.C35744e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyFriendHeadViewHolder */
public final class FollowFeedEmptyFriendHeadViewHolder extends C1293v {

    /* renamed from: a */
    public C35744e f89253a;

    /* renamed from: b */
    public final Activity f89254b;

    /* renamed from: c */
    public final String f89255c;

    /* renamed from: d */
    public final C34271f f89256d;

    /* renamed from: e */
    public final FollowFeedAdapter f89257e;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyFriendHeadViewHolder$a */
    static final class C34225a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowFeedEmptyFriendHeadViewHolder f89258a;

        C34225a(FollowFeedEmptyFriendHeadViewHolder followFeedEmptyFriendHeadViewHolder) {
            this.f89258a = followFeedEmptyFriendHeadViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34110a.m109789a(this.f89258a.f89254b, (C34113a) new C34113a(this) {

                /* renamed from: a */
                final /* synthetic */ C34225a f89259a;

                {
                    this.f89259a = r1;
                }

                /* renamed from: a */
                public final void mo86760a() {
                    this.f89259a.f89258a.f89256d.mo87045m();
                    this.f89259a.f89258a.f89257e.f88893P = false;
                }
            });
        }
    }

    /* renamed from: a */
    private void m110549a() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isContactsUploaded = inst.getIsContactsUploaded();
        C7573i.m23582a((Object) isContactsUploaded, "SharePrefCache.inst().isContactsUploaded");
        Object d = isContactsUploaded.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().isContactsUploaded.cache");
        if (((Boolean) d).booleanValue()) {
            this.f89257e.f88893P = false;
            this.f89256d.mo87045m();
            return;
        }
        this.f89257e.f88893P = true;
        this.f89256d.mo87045m();
        new C34225a(this);
    }

    /* renamed from: a */
    public final void mo86974a(boolean z) {
        if (z) {
            m110549a();
        }
    }

    public FollowFeedEmptyFriendHeadViewHolder(View view, Activity activity, String str, C34271f fVar, FollowFeedAdapter followFeedAdapter) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "mTabType");
        C7573i.m23587b(fVar, "followFeedViewHolder");
        C7573i.m23587b(followFeedAdapter, "adapter");
        super(view);
        this.f89254b = activity;
        this.f89255c = str;
        this.f89256d = fVar;
        this.f89257e = followFeedAdapter;
        C35744e createThirdPartyAddFriendView = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createThirdPartyAddFriendView(this.f89254b);
        C7573i.m23582a((Object) createThirdPartyAddFriendView, "ServiceManager.get().get…tyAddFriendView(activity)");
        this.f89253a = createThirdPartyAddFriendView;
        ((ViewGroup) view).addView(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createFollowFeedEmptyHeadView(this.f89254b, this.f89255c, this.f89253a));
    }
}
