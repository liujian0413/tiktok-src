package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.following.model.C29565b;
import com.p280ss.android.ugc.aweme.following.p1264a.C29561a;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerListFragment */
public class FollowerListFragment extends SimpleUserFragment {

    /* renamed from: e */
    public C29561a f78050e;
    ImageView imgAddFriends;
    View viewFansDivider;

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo75645f() {
        return R.layout.o8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo75646g() {
        super.mo75646g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo75647i() {
        return "fans_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C25674b mo75653o() {
        return this.f78050e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo75648j() {
        return mo75651m() ? R.drawable.ax1 : R.drawable.ax1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo75652n() {
        if (mo75651m()) {
            return R.string.b95;
        }
        return R.string.b96;
    }

    /* renamed from: r */
    private boolean m97229r() {
        if (C6399b.m19944t() || !C36337ai.m117567a(this.f78185h.getUser()) || this.f78185h.getPageType() != PageType.follower) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo75649k() {
        if (mo75651m()) {
            if (C6399b.m19944t()) {
                return R.string.b97;
            }
            return R.string.fi6;
        } else if (C6399b.m19944t()) {
            return R.string.b97;
        } else {
            return R.string.fim;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo75651m() {
        return C21115b.m71197a().getCurUserId().equals(this.f78185h.getUid());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo75644e() {
        this.f78050e = new C29561a();
        this.f78050e.mo66537a(this);
        this.f78050e.mo66536a(new C29565b(this.f78185h.getUid(), this.f78185h.getSecUid()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo75650l() {
        if (mo75651m()) {
            if (C6399b.m19944t()) {
                return R.string.b98;
            }
            return R.string.fi7;
        } else if (C6399b.m19944t()) {
            return R.string.b99;
        } else {
            return R.string.fin;
        }
    }

    public void onViewClicked() {
        int i;
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f78100b;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), i, 6, "", "fans");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).mo75662a();
            }
        }
        C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "fans").f60753a);
    }

    /* renamed from: a */
    public static SimpleUserFragment m97227a(Bundle bundle) {
        FollowerListFragment followerListFragment = new FollowerListFragment();
        followerListFragment.setArguments(bundle);
        return followerListFragment;
    }

    /* renamed from: a */
    private static boolean m97228a(User user) {
        int i;
        if (user == null) {
            return false;
        }
        if (C36337ai.m117567a(user)) {
            i = user.getFansCount();
        } else {
            i = user.getFollowerCount();
        }
        if (C6399b.m19946v() || i < 10000) {
            return false;
        }
        return true;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        super.mo59105a_(exc);
        if (C22814a.m75241a((Throwable) exc) instanceof ApiServerException) {
            this.f78183f.mo61147b();
        }
    }

    /* renamed from: b */
    public final void mo25896b(View view) {
        String str = (String) SharePrefCache.inst().getSyncToTTUrl().mo59877d();
        Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        User user = this.f78185h.getUser();
        if (user != null) {
            if (C36337ai.m117567a(user)) {
                this.mTitleBar.setBackgroundColor(C0683b.m2912c(getContext(), R.color.a7f));
                this.mTitleBar.getEndText().setVisibility(0);
            } else {
                this.mTitleBar.getEndText().setVisibility(8);
                this.viewFansDivider.setVisibility(8);
            }
            if (mo75651m()) {
                this.imgAddFriends.setVisibility(0);
                this.mTitleBar.getEndText().setVisibility(8);
            } else {
                this.imgAddFriends.setVisibility(8);
            }
        } else {
            this.mTitleBar.getEndText().setVisibility(8);
            C23487o.m77146a(!C43122ff.m136767b(), this.imgAddFriends);
        }
        if (m97229r() || m97228a(user)) {
            this.f78183f.mo61149c_(C29765j.m97497a(getContext(), this.mListView, this.f78185h).mo75642b());
        }
        C43064dn.m136622b(this.mListView);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
