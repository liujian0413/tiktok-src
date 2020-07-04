package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.FansAdapter;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerCardViewHolder */
public class FollowerCardViewHolder extends C1293v {

    /* renamed from: a */
    private FansAdapter f78041a;

    /* renamed from: b */
    private boolean f78042b;

    /* renamed from: c */
    private Context f78043c;

    /* renamed from: d */
    private FollowingFollowerPageParam f78044d;

    /* renamed from: e */
    private User f78045e;

    /* renamed from: f */
    private int f78046f;
    RecyclerView fansRecyclerView;

    /* renamed from: g */
    private List<FollowerDetail> f78047g;

    /* renamed from: h */
    private boolean f78048h;
    DmtTextView tvFansSum;

    /* renamed from: b */
    public final View mo75642b() {
        return this.itemView;
    }

    /* renamed from: d */
    private boolean m97221d() {
        return C21115b.m71197a().getCurUserId().equals(this.f78044d.getUid());
    }

    /* renamed from: e */
    private boolean m97222e() {
        if (C6399b.m19944t() || !C36337ai.m117567a(this.f78044d.getUser()) || this.f78044d.getPageType() != PageType.follower) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo75643c() {
        if (!this.f78048h || this.f78045e == null || this.f78045e.isBlock() || this.f78045e.isBlocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m97223f() {
        int i;
        if (this.f78045e != null) {
            if (C36337ai.m117567a(this.f78045e)) {
                i = this.f78045e.getFansCount();
            } else {
                i = this.f78045e.getFollowerCount();
            }
            if (i >= 10000) {
                this.tvFansSum.setVisibility(0);
                if (!C6399b.m19944t()) {
                    String format = new DecimalFormat("#,####").format((long) i);
                    this.tvFansSum.setText(this.f78043c.getString(R.string.b49, new Object[]{format}));
                } else if (C6399b.m19947w()) {
                    String a = C1642a.m8035a(Locale.getDefault(), "%,d", new Object[]{Integer.valueOf(i)});
                    this.tvFansSum.setText(this.f78043c.getString(R.string.b49, new Object[]{a}));
                }
                this.f78048h = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo75641a() {
        if (this.f78045e != null) {
            if (m97222e()) {
                if (this.f78041a == null) {
                    FansAdapter fansAdapter = new FansAdapter(this.f78043c, this.f78046f, this.f78047g, this.f78042b, this.f78045e);
                    this.f78041a = fansAdapter;
                    this.fansRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this.f78043c, 0, false));
                    this.fansRecyclerView.setAdapter(this.f78041a);
                }
                this.f78041a.notifyDataSetChanged();
                C6907h.onEvent(MobClick.obtain().setEventName("fans_show_from_fans_power").setLabelName("others_fans_page"));
                this.f78048h = true;
            }
            if (m97221d() && !C6399b.m19946v()) {
                m97223f();
            }
        }
    }

    public FollowerCardViewHolder(View view, FollowingFollowerPageParam followingFollowerPageParam) {
        int i;
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f78043c = view.getContext();
        this.f78044d = followingFollowerPageParam;
        this.f78045e = followingFollowerPageParam.getUser();
        this.f78042b = followingFollowerPageParam.isMine();
        if (this.f78045e != null) {
            this.f78047g = C36337ai.m117566a(this.f78045e.getFollowerDetailList());
        }
        if (C6307b.m19566a((Collection<T>) this.f78047g)) {
            i = 0;
        } else {
            i = this.f78047g.size() + 3;
        }
        this.f78046f = i;
    }
}
