package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.experiment.EnablePushGuideExperiment;
import com.p280ss.android.ugc.aweme.following.model.C29568d;
import com.p280ss.android.ugc.aweme.following.p1264a.C29562b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.C34161a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.EnterFrom;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingListFragment */
public class FollowingListFragment extends SimpleUserFragment {

    /* renamed from: e */
    public C29562b f78108e;
    ImageView imgAddFriends;

    /* renamed from: k */
    private boolean f78109k = true;

    /* renamed from: l */
    private NotificationPushGuide f78110l;
    NoticeView mEnablePushNoticeView;
    View mVSpit;

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo75645f() {
        return R.layout.o_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo75647i() {
        return "following_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C25674b mo75653o() {
        return this.f78108e;
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
            return R.string.b8m;
        }
        return R.string.b8n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo75649k() {
        if (mo75651m()) {
            if (C6399b.m19944t()) {
                return R.string.b9e;
            }
            return R.string.fi8;
        } else if (C6399b.m19944t()) {
            return R.string.b9e;
        } else {
            return R.string.fik;
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
        this.f78108e = new C29562b();
        this.f78108e.mo66537a(this);
        this.f78108e.mo66536a(new C29568d(this.f78185h.getUid(), this.f78185h.getSecUid(), mo75651m()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo75646g() {
        super.mo75646g();
        if (this.mVSpit != null) {
            this.mVSpit.setVisibility(8);
        }
        if (!mo75651m() || C43122ff.m136767b()) {
            this.imgAddFriends.setVisibility(8);
        }
        m97302r();
        this.f78110l = new NotificationPushGuide(this.mEnablePushNoticeView, new C34161a() {
            /* renamed from: a */
            public final void mo75676a(Context context) {
                C43033cw.m136552b(context);
            }

            /* renamed from: b */
            public final boolean mo75677b(Context context) {
                return C43034cx.m136550a(context);
            }
        });
        this.f78110l.f89060c = EnterFrom.Follow;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo75650l() {
        if (mo75651m()) {
            if (C6399b.m19944t()) {
                return R.string.b9f;
            }
            return R.string.fi9;
        } else if (C6399b.m19944t()) {
            return R.string.b9g;
        } else {
            return R.string.fil;
        }
    }

    /* renamed from: r */
    private void m97302r() {
        this.mEnablePushNoticeView.setIconImage((int) R.drawable.adu);
        SpannableString spannableString = new SpannableString(C23481i.m77091b(R.string.b9h));
        String b = C23481i.m77091b(R.string.b9i);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        if (getContext() != null) {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.w)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        this.mEnablePushNoticeView.setTitleText((CharSequence) spannableStringBuilder);
    }

    public void onViewClicked() {
        int i;
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f78100b;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(getActivity(), i, 5, "", "following");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).mo75662a();
            }
        }
        C6907h.m21524a("click_add_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "following").f60753a);
    }

    /* renamed from: a */
    public static SimpleUserFragment m97301a(Bundle bundle) {
        FollowingListFragment followingListFragment = new FollowingListFragment();
        followingListFragment.setArguments(bundle);
        return followingListFragment;
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        super.mo59099a(list, z);
        if (C6399b.m19946v() && mo75651m()) {
            if (this.mEnablePushNoticeView != null && this.f78109k && C6384b.m19835a().mo15287a(EnablePushGuideExperiment.class, true, "push_guide_type", C6384b.m19835a().mo15295d().push_guide_type, 0) == 1) {
                this.f78110l.mo86880a();
            }
            this.f78109k = false;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
