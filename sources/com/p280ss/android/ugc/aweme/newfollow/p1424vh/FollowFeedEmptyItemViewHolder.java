package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.feed.C28204ah;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34122b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendUserActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView.C36620a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyItemViewHolder */
public class FollowFeedEmptyItemViewHolder extends C1293v implements C25663d<RecommendUserCardViewHolder>, C36042p {

    /* renamed from: a */
    public Context f89260a;

    /* renamed from: b */
    public RecommendCommonUserView f89261b;

    /* renamed from: c */
    public C36004ad f89262c;

    /* renamed from: d */
    public String f89263d;

    /* renamed from: e */
    public String f89264e = "";

    /* renamed from: f */
    private DmtDefaultView f89265f;

    /* renamed from: g */
    private C34122b f89266g;

    /* renamed from: h */
    private List<String> f89267h;

    /* renamed from: i */
    private boolean f89268i;

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
    }

    /* renamed from: b */
    private void m110554b() {
        LayoutParams layoutParams = (LayoutParams) this.f89265f.getLayoutParams();
        layoutParams.height = C29961b.m98232a(this.f89260a, 360.0f);
        this.f89265f.setLayoutParams(layoutParams);
        this.f89265f.setStatus(new C10806a(this.f89260a).mo25985a((int) R.drawable.b78).mo25990b((int) R.string.b8k).mo25991b("").f29135a);
    }

    /* renamed from: c */
    private void m110555c() {
        if (C7213d.m22500a().mo18825y()) {
            if (this.f89262c == null) {
                this.f89262c = new C36004ad(new RecommendCommonUserModel(), this);
            }
            this.f89262c.mo91631a(30, C21115b.m71197a().getCurUserId(), 2, C43161e.m136882a(), (String) null, C43161e.m136884b());
            C28204ah.m92703a("api_recommend_user", "follow_feed_empty_item_view_holder", "refresh");
        }
    }

    /* renamed from: a */
    private void m110552a() {
        if (((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue()) {
            this.f89268i = false;
            m110554b();
            return;
        }
        this.f89268i = true;
        LayoutParams layoutParams = (LayoutParams) this.f89265f.getLayoutParams();
        layoutParams.height = C29961b.m98232a(this.f89260a, 460.0f);
        this.f89265f.setLayoutParams(layoutParams);
        this.f89265f.setStatus(new C10806a(this.f89260a).mo25985a((int) R.drawable.b78).mo25990b((int) R.string.b8k).mo25993c(R.string.b8b).mo25986a(ButtonStyle.SOLID, R.string.agd, new C34270e(this)).f29135a);
    }

    /* renamed from: a */
    public final int mo86976a(User user) {
        if (user != null) {
            return this.f89262c.mo91625a(user.getUid());
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86977a(View view) {
        if (this.f89266g != null) {
            this.f89266g.mo86788a();
        }
    }

    /* renamed from: a */
    public final void mo86978a(C34122b bVar) {
        this.f89266g = bVar;
        m110552a();
        if (!this.f89268i) {
            m110555c();
        } else {
            this.f89261b.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61737a(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f96181a;
            if (user != null) {
                if (this.f89267h == null) {
                    this.f89267h = new ArrayList();
                }
                if (!this.f89267h.contains(user.getUid())) {
                    C34202f.m110435a().mo86948a(2, user.getUid());
                    if (C6399b.m19944t()) {
                        C34138b.m109980a(user, "impression", mo86976a(user), this.f89263d);
                    } else {
                        C34138b.m109982a(user, "impression", mo86976a(user), this.f89263d, "empty", this.f89264e);
                    }
                    this.f89267h.add(user.getUid());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() < 3) {
            this.f89261b.setVisibility(8);
            return;
        }
        this.f89263d = recommendList.getRid();
        boolean z = true;
        this.f89261b.setPageType(1);
        RecommendCommonUserView recommendCommonUserView = this.f89261b;
        if (recommendList.getUserList().size() < 10) {
            z = false;
        }
        recommendCommonUserView.setShowLookMore(z);
        this.f89261b.mo92911a(recommendList.getUserList(), this.f89263d);
        this.f89261b.setOnItemOperationListener(new C36630b() {
            /* renamed from: b */
            public final void mo72051b(User user, int i) {
                FollowFeedEmptyItemViewHolder.this.f89261b.post(new Runnable() {
                    public final void run() {
                        FollowFeedEmptyItemViewHolder.this.f89261b.setVisibility(8);
                    }
                });
            }

            /* renamed from: a */
            public final void mo72050a(User user, int i) {
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "delete", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d);
                } else {
                    C34138b.m109982a(user, "delete", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d, "empty", FollowFeedEmptyItemViewHolder.this.f89264e);
                }
                if (FollowFeedEmptyItemViewHolder.this.f89262c != null) {
                    FollowFeedEmptyItemViewHolder.this.f89262c.mo91633a(user);
                }
            }

            /* renamed from: d */
            public final void mo72053d(User user, int i) {
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "enter_profile", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d);
                    C34138b.m109986a(FollowFeedEmptyItemViewHolder.this.f89263d, user);
                    return;
                }
                C34138b.m109982a(user, "enter_profile", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d, "empty", FollowFeedEmptyItemViewHolder.this.f89264e);
                C34138b.m109990a(user.getUid(), FollowFeedEmptyItemViewHolder.this.f89263d, true);
            }

            /* renamed from: c */
            public final void mo72052c(User user, int i) {
                if (C6399b.m19944t()) {
                    C34138b.m109980a(user, "follow", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d);
                    C34138b.m109979a(user);
                    return;
                }
                C34138b.m109982a(user, "follow", FollowFeedEmptyItemViewHolder.this.mo86976a(user), FollowFeedEmptyItemViewHolder.this.f89263d, "empty", FollowFeedEmptyItemViewHolder.this.f89264e);
                C34138b.m109991a(FollowFeedEmptyItemViewHolder.this.f89263d, user.getUid(), true, user.getFollowStatus(), FollowFeedEmptyItemViewHolder.this.f89264e);
            }
        });
        this.f89261b.setOnLookMoreUserListener(new C36620a() {
            /* renamed from: a */
            public final void mo72054a(String str, boolean z) {
                RecommendUserActivity.m117276a(FollowFeedEmptyItemViewHolder.this.f89260a, C21115b.m71197a().getCurUserId(), 2, "homepage_follow", str);
                if (C6399b.m19944t()) {
                    C34138b.m110009d();
                } else {
                    C34138b.m109992a(true);
                }
            }
        });
        this.f89261b.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        if (exc instanceof JSONParseException) {
            this.f89261b.setVisibility(8);
        } else {
            C22814a.m75244a(this.f89260a, (Throwable) exc);
        }
    }

    public FollowFeedEmptyItemViewHolder(View view, Context context, String str) {
        super(view);
        this.f89264e = str;
        this.f89260a = context;
        this.f89265f = (DmtDefaultView) view.findViewById(R.id.a6y);
        this.f89261b = (RecommendCommonUserView) view.findViewById(R.id.ed6);
        this.f89261b.setBackgroundResource(R.color.ayd);
        this.f89261b.setOnViewAttachedToWindowListener(this);
    }
}
