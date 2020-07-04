package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.helper.C28425m;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.adapter.FlowFeedAdapter;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p280ss.android.ugc.aweme.follow.p1263ui.HeaderViewHolder;
import com.p280ss.android.ugc.aweme.follow.presenter.C29463i;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30179z;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactViewHolder;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendsTitleHolder;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.newfollow.model.C34148e;
import com.p280ss.android.ugc.aweme.newfollow.model.C34149f;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34121a;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34122b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34271f;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioFollowImageViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioFollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioForwardDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioImageForwardFeedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioVideoForwardFeedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedEmptyFriendHeadViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedEmptyItemViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedEmptyRecommendViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedLastWatchItemViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedLastWatchItemViewHolder.C34231a;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowFeedStatusItemViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolderPlanA;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolderPlanB;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolderPlanC;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowImageViewHolderPlanD;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowLiveViewHolderA;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowLiveViewHolderB;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowLiveViewHolderD;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanA;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanB;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanC;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanD;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardImageViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardImageViewHolderPlanA;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardImageViewHolderPlanB;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardImageViewHolderPlanC;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardImageViewHolderPlanD;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolderPlanA;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolderPlanB;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolderPlanC;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolderPlanD;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentFollowFeedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentForwardDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentForwardFeedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.RecommendUserViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.StoryHeaderViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.UpLoadItemViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.UpLoadRecoverItemViewHolder;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.story.api.C41974f;
import com.p280ss.android.ugc.aweme.story.api.model.C41979d;
import com.p280ss.android.ugc.aweme.story.api.p1653a.C41969b;
import com.p280ss.android.ugc.aweme.story.api.userstory.C41981a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter */
public class FollowFeedAdapter extends FlowFeedAdapter<FollowFeed> {

    /* renamed from: J */
    public static int f88882J = ((int) C9738o.m28708b(C6399b.m19921a(), 52.0f));

    /* renamed from: E */
    public boolean f88883E = (!C6399b.m19944t());

    /* renamed from: F */
    public C41981a f88884F;

    /* renamed from: G */
    public String f88885G;

    /* renamed from: H */
    public String f88886H;

    /* renamed from: I */
    public boolean f88887I;

    /* renamed from: K */
    public boolean f88888K = false;

    /* renamed from: L */
    public C34122b f88889L;

    /* renamed from: M */
    public C34121a f88890M;

    /* renamed from: N */
    public C23267h<User> f88891N;

    /* renamed from: O */
    public C30016a f88892O;

    /* renamed from: P */
    public boolean f88893P = true;

    /* renamed from: Q */
    private final Fragment f88894Q;

    /* renamed from: R */
    private FollowFeed f88895R;

    /* renamed from: S */
    private FollowFeed f88896S;

    /* renamed from: T */
    private FollowFeed f88897T;

    /* renamed from: U */
    private FollowFeed f88898U;

    /* renamed from: V */
    private FollowFeed f88899V;

    /* renamed from: W */
    private C34148e f88900W;

    /* renamed from: X */
    private C34149f f88901X;

    /* renamed from: Y */
    private FollowFeed f88902Y;

    /* renamed from: Z */
    private RecommendUserViewHolder f88903Z;

    /* renamed from: aa */
    private C34271f f88904aa;

    /* renamed from: ab */
    private HashMap<String, Boolean> f88905ab = new HashMap<>();

    /* renamed from: ac */
    private boolean f88906ac = false;

    public final void aW_() {
        super.aW_();
    }

    /* renamed from: b */
    public final void mo58051b(View view) {
    }

    /* renamed from: a */
    public final void mo58039a(String str) {
        if (!C6307b.m19566a((Collection<T>) this.f67539l) && !TextUtils.isEmpty(str)) {
            int i = -1;
            for (int size = this.f67539l.size() - 1; size >= 0; size--) {
                FollowFeed followFeed = (FollowFeed) this.f67539l.get(size);
                if (followFeed != null) {
                    if (followFeed.getFeedType() == 65280) {
                        if (followFeed.getAweme() != null && str.equals(followFeed.getAweme().getAuthorUid())) {
                            this.f67539l.remove(size);
                            notifyItemRemoved(size);
                        }
                    } else if (!(followFeed.getFeedType() != 65298 || followFeed.getRoomStruct() == null || followFeed.getRoomStruct().f77715a == null || followFeed.getRoomStruct().f77715a.owner == null || !TextUtils.equals(str, followFeed.getRoomStruct().f77715a.owner.getUid()))) {
                        this.f67539l.remove(size);
                        notifyItemRemoved(size);
                    }
                    i = size;
                }
            }
            if (i != -1) {
                notifyItemRangeChanged(i, Math.max(1, (this.f67539l.size() - 1) - i));
            }
        }
    }

    /* renamed from: a */
    public final void mo86764a(FollowFeed followFeed, boolean z) {
        if (z) {
            if (this.f67539l != null && this.f67539l.contains(this.f88900W)) {
                int indexOf = this.f67539l.indexOf(this.f88900W);
                mo58055c(indexOf);
                mo62316a(followFeed, indexOf);
            }
        } else if (this.f67539l != null && this.f67539l.contains(this.f88900W)) {
            mo58055c(this.f67539l.indexOf(this.f88900W));
        }
        this.f58241e.mo75114a(500);
    }

    /* renamed from: a */
    public final void mo86763a(C27311c cVar, boolean z) {
        if (this.f67539l == null || !this.f67539l.contains(this.f88901X)) {
            this.f88901X = new C34149f();
            if (!this.f88883E || this.f67539l == null || this.f67539l.size() <= 0) {
                mo62316a(this.f88901X, 0);
            } else {
                mo62316a(this.f88901X, 1);
            }
            if (this.f58248w != null) {
                this.f58248w.mo5541b(0);
            }
            this.f58241e.mo75114a(500);
        }
        this.f88901X.f88992a = cVar;
        this.f88901X.f88993b = z;
    }

    /* renamed from: a */
    public final void mo86766a(boolean z) {
        if (this.f67539l != null && this.f67539l.contains(this.f88901X)) {
            mo58055c(this.f67539l.indexOf(this.f88901X));
            if (z) {
                C10761a.m31399c(this.f58247k.mo58074c(), (int) R.string.ow).mo25750a();
            }
        }
        this.f58241e.mo75114a(500);
    }

    /* renamed from: a */
    public final void mo86765a(FollowStatus followStatus) {
        if (!C6307b.m19566a((Collection<T>) mo62312a())) {
            for (C34145b bVar : mo62312a()) {
                FollowFeed followFeed = (FollowFeed) bVar;
                if (followFeed.getFeedType() == 65281 && !C6307b.m19566a((Collection<T>) followFeed.getUser())) {
                    for (User user : followFeed.getUser()) {
                        if (TextUtils.equals(user.getUid(), followStatus.userId) && user.getFollowStatus() != followStatus.followStatus) {
                            user.setFollowStatus(followStatus.followStatus);
                            user.setWatchStatus(followStatus.watchStatus);
                            m109816g(followFeed.getUser());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58042a(String str, Aweme aweme, int i) {
        mo62316a(new FollowFeed(aweme), i);
        int d = mo58057d(str);
        m72695a(mo58050b(d));
        C1293v f = this.f58248w.mo5575f(d);
        if (f instanceof BaseFollowViewHolder) {
            ((BaseFollowViewHolder) f).mo68532m();
            return;
        }
        if (f instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) f).mo76008E();
        }
    }

    /* renamed from: a */
    public final void mo58036a(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, this.f58251z)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f58248w.getLayoutManager();
            for (FollowFeed followFeed : this.f67539l) {
                if ((followFeed.getAweme() != null && (followFeed.getFeedType() == 65280 || (followFeed.getFeedType() == 65298 && m109812G()))) && TextUtils.equals(followFeed.getAweme().getAid(), aweme.getAid())) {
                    linearLayoutManager.mo5417a(this.f67539l.indexOf(followFeed), f88882J);
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    private FollowFeed m109806A() {
        m109821z();
        if (this.f88895R == null) {
            this.f88895R = new FollowFeed();
            this.f88895R.setFeedType(65283);
        }
        return this.f88895R;
    }

    /* renamed from: B */
    private FollowFeed m109807B() {
        if (this.f88896S == null) {
            this.f88896S = new FollowFeed();
            this.f88896S.setFeedType(65535);
        }
        ah_();
        return this.f88896S;
    }

    /* renamed from: C */
    private FollowFeed m109808C() {
        if (this.f88897T == null) {
            this.f88897T = new FollowFeed();
            this.f88897T.setFeedType(65534);
        }
        return this.f88897T;
    }

    /* renamed from: D */
    private FollowFeed m109809D() {
        if (this.f88898U == null) {
            this.f88898U = new FollowFeed();
            this.f88898U.setFeedType(65532);
        }
        return this.f88898U;
    }

    /* renamed from: E */
    private FollowFeed m109810E() {
        if (this.f88899V == null) {
            this.f88899V = new FollowFeed();
            this.f88899V.setFeedType(65531);
        }
        return this.f88899V;
    }

    /* renamed from: F */
    private String m109811F() {
        if (TextUtils.equals(this.f88885G, "extra_follow_type_friend")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(this.f88885G, "extra_follow_type_follow")) {
            return "homepage_follow";
        }
        return "";
    }

    /* renamed from: w */
    private List<FollowFeed> m109818w() {
        FollowFeed A = m109806A();
        ArrayList arrayList = new ArrayList();
        if (this.f88883E) {
            arrayList.add(A);
        }
        arrayList.add(m109808C());
        mo66516d(false);
        m109814f((List<FollowFeed>) arrayList);
        return arrayList;
    }

    /* renamed from: x */
    private List<FollowFeed> m109819x() {
        FollowFeed A = m109806A();
        ArrayList arrayList = new ArrayList();
        if (this.f88883E) {
            arrayList.add(A);
        }
        arrayList.add(m109809D());
        mo66516d(false);
        m109814f((List<FollowFeed>) arrayList);
        return arrayList;
    }

    /* renamed from: j */
    public final void mo58064j() {
        super.mo58064j();
        if (this.f88884F != null) {
            C0991u.m4170G(this.f88884F.mo103103a());
        }
    }

    /* renamed from: q */
    public final void mo86771q() {
        if (this.f67539l != null && this.f67539l.contains(this.f88896S)) {
            mo58055c(this.f67539l.indexOf(this.f88896S));
            mo66516d(true);
        }
    }

    /* renamed from: r */
    public final void mo86772r() {
        if (this.f67539l != null && this.f67539l.contains(this.f88899V)) {
            mo58055c(this.f67539l.indexOf(this.f88899V));
            mo66516d(true);
        }
    }

    /* renamed from: s */
    public final void mo86773s() {
        if (C6399b.m19947w()) {
            this.f88883E = true;
        }
        this.f67539l = m109818w();
        notifyDataSetChanged();
    }

    /* renamed from: t */
    public final void mo86774t() {
        if (C6399b.m19947w()) {
            this.f88883E = true;
        }
        this.f67539l = m109819x();
        this.f88906ac = true;
        notifyDataSetChanged();
    }

    /* renamed from: u */
    public final void mo86775u() {
        if (C6399b.m19947w()) {
            this.f88883E = true;
        }
        this.f67539l = m109820y();
        notifyDataSetChanged();
    }

    /* renamed from: G */
    private static boolean m109812G() {
        if (!C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false) || !C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private C41979d m109817v() {
        int i;
        C41979d dVar = new C41979d();
        if (TextUtils.equals("extra_follow_type_friend", this.f88885G)) {
            i = 1;
        } else {
            i = 2;
        }
        dVar.f109052a = i;
        dVar.f109053b = this.f58251z;
        dVar.f109054c = this.f88886H;
        dVar.f109055d = this.f88887I;
        dVar.f109056e = 1;
        return dVar;
    }

    /* renamed from: y */
    private List<FollowFeed> m109820y() {
        FollowFeed A = m109806A();
        ArrayList arrayList = new ArrayList();
        if (this.f88883E) {
            arrayList.add(A);
        }
        arrayList.add(m109809D());
        arrayList.add(m109810E());
        mo66516d(false);
        m109814f((List<FollowFeed>) arrayList);
        return arrayList;
    }

    /* renamed from: z */
    private void m109821z() {
        if (this.f88883E && !C6399b.m19944t() && !C6307b.m19566a((Collection<T>) this.f67539l) && this.f67539l.get(0) != null && ((FollowFeed) this.f67539l.get(0)).getFeedType() == 65283) {
            this.f67539l.remove(0);
        }
    }

    /* renamed from: k */
    public final void mo58065k() {
        if (!C6307b.m19566a((Collection<T>) this.f58242f)) {
            for (BaseFollowViewHolder baseFollowViewHolder : this.f58242f) {
                if (baseFollowViewHolder instanceof InsFollowLiveViewHolderA) {
                    baseFollowViewHolder.mo75249Y();
                }
            }
        }
        super.mo58065k();
    }

    /* renamed from: o */
    public final int mo86768o() {
        if (this.f67539l == null || this.f67539l.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.f67539l.size(); i++) {
            if (((FollowFeed) this.f67539l.get(i)).getFeedType() == 65283) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final void mo86770p() {
        if (this.f67539l == null) {
            this.f67539l = new ArrayList();
        }
        if (this.f67539l.size() == 0) {
            if (C6399b.m19944t()) {
                mo62316a(m109807B(), 0);
            }
            mo66516d(false);
            return;
        }
        if (this.f67539l.size() == 1 && (this.f67539l.contains(this.f88895R) || this.f67539l.contains(this.f88900W) || this.f67539l.contains(this.f88901X))) {
            if (C6399b.m19944t()) {
                mo62316a(m109807B(), 1);
            }
            mo66516d(false);
        }
    }

    @C7709l
    public void onStoryListWidgetRefreshEvent(C41969b bVar) {
        notifyItemChanged(0);
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.en);
    }

    /* renamed from: a */
    public final void mo58045a(List<FollowFeed> list) {
        if (C6399b.m19947w()) {
            this.f88883E = true;
        }
        super.mo58045a(list);
    }

    /* renamed from: f */
    private void m109814f(List<FollowFeed> list) {
        if (this.f88901X != null && this.f67539l.contains(this.f88901X)) {
            if (this.f88883E) {
                list.add(1, this.f88901X);
            } else {
                list.add(0, this.f88901X);
            }
        }
        if (this.f88900W != null && this.f67539l.contains(this.f88900W)) {
            if (this.f88883E) {
                list.add(1, this.f88900W);
                return;
            }
            list.add(0, this.f88900W);
        }
    }

    /* renamed from: g */
    private void m109816g(List<User> list) {
        if (this.f88903Z != null && !C6307b.m19566a((Collection<T>) this.f67539l) && this.f67539l.contains(this.f88902Y)) {
            int indexOf = this.f67539l.indexOf(this.f88902Y);
            this.f88903Z.mo87020a(list, this.f88902Y.getRequestId());
            notifyItemChanged(indexOf);
        }
    }

    /* renamed from: a */
    public final void mo86762a(Bitmap bitmap) {
        if (this.f67539l != null && this.f88900W != null && this.f67539l.contains(this.f88900W)) {
            int indexOf = this.f67539l.indexOf(this.f88900W);
            this.f88900W.mo86842a(bitmap);
            notifyItemChanged(indexOf);
        }
    }

    /* renamed from: b */
    public final void mo86767b(boolean z) {
        this.f88883E = false;
        if (this.f67539l == null || !this.f67539l.contains(this.f88895R)) {
            notifyDataSetChanged();
        } else {
            mo58055c(this.f67539l.indexOf(this.f88895R));
        }
    }

    /* renamed from: e */
    public final List<FollowFeed> mo58060e(List<FollowFeed> list) {
        FollowFeed A = m109806A();
        if (C6307b.m19566a((Collection<T>) list)) {
            list = new ArrayList<>();
            if (this.f88883E) {
                list.add(A);
            }
            if (C6399b.m19944t()) {
                list.add(m109807B());
            }
            mo66516d(false);
        } else if (this.f88883E) {
            list.add(0, A);
        }
        m109814f(list);
        return list;
    }

    /* renamed from: g */
    private BaseFollowViewHolder m109815g(ViewGroup viewGroup) {
        BaseFollowViewHolder baseFollowViewHolder;
        int ac = C7213d.m22500a().mo18765ac();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (ac) {
            case 2:
            case 3:
                baseFollowViewHolder = new InsFollowLiveViewHolderA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                break;
            case 4:
                baseFollowViewHolder = new InsFollowLiveViewHolderB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                break;
            case 5:
                baseFollowViewHolder = new InsFollowLiveViewHolderD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                break;
            default:
                baseFollowViewHolder = new InsFollowLiveViewHolderA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                break;
        }
        ((InsFollowLiveViewHolderA) baseFollowViewHolder).mo86997j(this.f88885G);
        return baseFollowViewHolder;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int a = super.mo58029a(i);
        if (a != -1) {
            return a;
        }
        FollowFeed followFeed = (FollowFeed) this.f67539l.get(i);
        if (followFeed == null) {
            return -1;
        }
        if (followFeed.getFeedType() == 65281) {
            return 33;
        }
        if (followFeed.getFeedType() == 65283) {
            return 32;
        }
        if (followFeed.getFeedType() == 65297) {
            return 37;
        }
        if (followFeed.getFeedType() == 65298) {
            return 36;
        }
        if (followFeed.getFeedType() == 65282) {
            return 34;
        }
        if (followFeed.getFeedType() == 65535) {
            return 38;
        }
        if (followFeed.getFeedType() == 65288) {
            return 39;
        }
        if (followFeed.getFeedType() == 65284) {
            return PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        }
        if (followFeed.getFeedType() == 65534) {
            return 40;
        }
        if (followFeed.getFeedType() == 65533) {
            return 41;
        }
        if (followFeed.getFeedType() == 65532) {
            return 48;
        }
        if (followFeed.getFeedType() == 65531) {
            return 49;
        }
        if (followFeed.getFeedType() == 65289) {
            return 50;
        }
        if (followFeed.getFeedType() == 65530) {
            return 51;
        }
        if (followFeed.getFeedType() == 65299) {
            return 52;
        }
        return -1;
    }

    /* renamed from: b */
    public final BaseFollowViewHolder mo58049b(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                return new FixRatioFollowImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 3:
            case 9:
                return new InsFollowImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 4:
                return new InsFollowImageViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 5:
                return new InsFollowImageViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 6:
                return new InsFollowImageViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 7:
                return new InsFollowImageViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            default:
                return new FollowFlowItemImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
        }
    }

    /* renamed from: c */
    public final BaseFollowViewHolder mo58054c(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                FixRatioFollowVideoViewHolder fixRatioFollowVideoViewHolder = new FixRatioFollowVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                fixRatioFollowVideoViewHolder.f77594aT = this;
                return fixRatioFollowVideoViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 3:
            case 9:
                return new InsFollowVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 4:
                return new InsFollowVideoViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 5:
                return new InsFollowVideoViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 6:
                return new InsFollowVideoViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 7:
                return new InsFollowVideoViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            default:
                FollowFlowItemVideoViewHolder followFlowItemVideoViewHolder = new FollowFlowItemVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                followFlowItemVideoViewHolder.f77594aT = this;
                return followFlowItemVideoViewHolder;
        }
    }

    /* renamed from: d */
    public final BaseForwardViewHolder mo58058d(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                FixRatioImageForwardFeedViewHolder fixRatioImageForwardFeedViewHolder = new FixRatioImageForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return fixRatioImageForwardFeedViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                InsForwardImageViewHolder insForwardImageViewHolder = new InsForwardImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insForwardImageViewHolder;
            case 4:
                InsForwardImageViewHolderPlanA insForwardImageViewHolderPlanA = new InsForwardImageViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insForwardImageViewHolderPlanA;
            case 5:
                InsForwardImageViewHolderPlanB insForwardImageViewHolderPlanB = new InsForwardImageViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insForwardImageViewHolderPlanB;
            case 6:
                InsForwardImageViewHolderPlanC insForwardImageViewHolderPlanC = new InsForwardImageViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insForwardImageViewHolderPlanC;
            case 7:
                InsForwardImageViewHolderPlanD insForwardImageViewHolderPlanD = new InsForwardImageViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insForwardImageViewHolderPlanD;
            default:
                FollowFlowItemImageForwardViewHolder followFlowItemImageForwardViewHolder = new FollowFlowItemImageForwardViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, false);
                return followFlowItemImageForwardViewHolder;
        }
    }

    /* renamed from: e */
    public final BaseForwardViewHolder mo58059e(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                FixRatioVideoForwardFeedViewHolder fixRatioVideoForwardFeedViewHolder = new FixRatioVideoForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                fixRatioVideoForwardFeedViewHolder.mo76069a((C21746d) this);
                return fixRatioVideoForwardFeedViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                InsForwardVideoViewHolder insForwardVideoViewHolder = new InsForwardVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                insForwardVideoViewHolder.mo76069a((C21746d) this);
                return insForwardVideoViewHolder;
            case 4:
                InsForwardVideoViewHolderPlanA insForwardVideoViewHolderPlanA = new InsForwardVideoViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                insForwardVideoViewHolderPlanA.mo76069a((C21746d) this);
                return insForwardVideoViewHolderPlanA;
            case 5:
                InsForwardVideoViewHolderPlanB insForwardVideoViewHolderPlanB = new InsForwardVideoViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                insForwardVideoViewHolderPlanB.mo76069a((C21746d) this);
                return insForwardVideoViewHolderPlanB;
            case 6:
                InsForwardVideoViewHolderPlanC insForwardVideoViewHolderPlanC = new InsForwardVideoViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                insForwardVideoViewHolderPlanC.mo76069a((C21746d) this);
                return insForwardVideoViewHolderPlanC;
            case 7:
                InsForwardVideoViewHolderPlanD insForwardVideoViewHolderPlanD = new InsForwardVideoViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                insForwardVideoViewHolderPlanD.mo76069a((C21746d) this);
                return insForwardVideoViewHolderPlanD;
            default:
                FollowFlowItemVideoForwardViewHolder followFlowItemVideoForwardViewHolder = new FollowFlowItemVideoForwardViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                followFlowItemVideoForwardViewHolder.mo76069a((C21746d) this);
                return followFlowItemVideoForwardViewHolder;
        }
    }

    /* renamed from: f */
    public final C1293v mo58062f(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                FixRatioForwardDeletedViewHolder fixRatioForwardDeletedViewHolder = new FixRatioForwardDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return fixRatioForwardDeletedViewHolder;
            case 2:
                MomentForwardDeletedViewHolder momentForwardDeletedViewHolder = new MomentForwardDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardDeletedViewHolder;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
                InsFollowDeletedViewHolder insFollowDeletedViewHolder = new InsFollowDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insFollowDeletedViewHolder;
            default:
                ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return forwardTextViewHolder;
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        String str;
        String str2;
        if (i == 128) {
            return new UpLoadRecoverItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vt, viewGroup, false), (FragmentActivity) this.f58247k.mo58074c());
        }
        int i2 = 1;
        switch (i) {
            case 32:
                if (C6399b.m19944t()) {
                    return new HeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vw, viewGroup, false));
                }
                this.f88884F = ((C41974f) ServiceManager.get().getService(C41974f.class)).mo102995a(viewGroup.getContext(), m109817v(), this.f88894Q);
                LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                linearLayout.setOrientation(1);
                return new StoryHeaderViewHolder(linearLayout, this.f88884F, this.f88894Q);
            case 33:
                RecommendCommonUserView recommendCommonUserView = new RecommendCommonUserView(viewGroup.getContext());
                recommendCommonUserView.setBackgroundResource(R.color.a6c);
                if (TextUtils.equals("extra_follow_type_friend", this.f88885G)) {
                    i2 = 2;
                }
                recommendCommonUserView.setPageType(i2);
                this.f88903Z = new RecommendUserViewHolder(recommendCommonUserView);
                RecommendUserViewHolder recommendUserViewHolder = this.f88903Z;
                if (this.f88888K) {
                    str = "empty";
                } else {
                    str = "nonempty";
                }
                recommendUserViewHolder.f89366d = str;
                this.f88903Z.f89364b = this.f88885G;
                return this.f88903Z;
            case BaseNotice.CHALLENGE /*34*/:
                return new UpLoadItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vt, viewGroup, false));
            default:
                switch (i) {
                    case 36:
                        return m109815g(viewGroup);
                    case 37:
                        return C34231a.m110569a(viewGroup);
                    case 38:
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ms, viewGroup, false);
                        Context c = this.f58247k.mo58074c();
                        if (TextUtils.equals("extra_follow_type_friend", this.f88885G)) {
                            str2 = "homepage_friends";
                        } else {
                            str2 = "homepage_follow";
                        }
                        return new FollowFeedEmptyItemViewHolder(inflate, c, str2);
                    case 39:
                        return new FollowFeedEmptyRecommendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mt, viewGroup, false));
                    case 40:
                        return new FollowFeedStatusItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mu, viewGroup, false), this.f58247k.mo58074c(), 65534);
                    case BaseNotice.LIKE /*41*/:
                        return new FollowFeedStatusItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mu, viewGroup, false), this.f58247k.mo58074c(), 65533);
                    default:
                        switch (i) {
                            case 48:
                                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr, viewGroup, false);
                                this.f88888K = true;
                                FollowFeedEmptyFriendHeadViewHolder followFeedEmptyFriendHeadViewHolder = new FollowFeedEmptyFriendHeadViewHolder(inflate2, (FragmentActivity) this.f58247k.mo58074c(), this.f88885G, this.f88904aa, this);
                                return followFeedEmptyFriendHeadViewHolder;
                            case 49:
                                return new FollowFeedStatusItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mu, viewGroup, false), this.f58247k.mo58074c(), 65531);
                            case 50:
                                C30179z zVar = new C30179z(viewGroup.getContext(), this.f88905ab, true);
                                zVar.setEnterFrom(m109811F());
                                zVar.setListener(this.f88891N);
                                zVar.setRecommendAwemeClickListener(this.f88892O);
                                return new RecommendFriendItemViewV2Holder(zVar);
                            case 51:
                                return new RecommendFriendsTitleHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w7, viewGroup, false));
                            case 52:
                                RecommendContactItemView recommendContactItemView = new RecommendContactItemView(viewGroup.getContext());
                                recommendContactItemView.setEnterFrom(this.f58251z);
                                recommendContactItemView.setDislikeListener(new C7563m<RecommendContact, Integer, C7581n>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public C7581n invoke(RecommendContact recommendContact, Integer num) {
                                        FollowFeedAdapter.this.f88891N.mo60535a(102, recommendContact, num.intValue(), null, "");
                                        return null;
                                    }
                                });
                                return new RecommendContactViewHolder(recommendContactItemView);
                            default:
                                return super.mo58032a(viewGroup, i);
                        }
                }
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int a = mo58029a(i);
        if (a != 41) {
            boolean z = false;
            if (a == 48) {
                ((FollowFeedEmptyFriendHeadViewHolder) vVar).mo86974a(this.f88906ac);
                this.f88906ac = false;
            } else if (a != 128) {
                switch (a) {
                    case 32:
                        if (!C6399b.m19944t()) {
                            ((StoryHeaderViewHolder) vVar).mo87021a();
                            break;
                        } else {
                            HeaderViewHolder headerViewHolder = (HeaderViewHolder) vVar;
                            headerViewHolder.mo75545a(vVar.itemView.getContext(), false);
                            headerViewHolder.mo75544a(vVar.itemView.getContext().getResources().getColor(R.color.a6c));
                            break;
                        }
                    case 33:
                        this.f88902Y = (FollowFeed) this.f67539l.get(i);
                        RecommendUserViewHolder recommendUserViewHolder = (RecommendUserViewHolder) vVar;
                        recommendUserViewHolder.mo87020a(this.f88902Y.getUser(), this.f88902Y.getRequestId());
                        recommendUserViewHolder.f89364b = this.f88885G;
                        break;
                    case BaseNotice.CHALLENGE /*34*/:
                        ((UpLoadItemViewHolder) vVar).mo87023a((FollowFeed) this.f67539l.get(i));
                        break;
                    default:
                        switch (a) {
                            case 36:
                                FollowFeed followFeed = (FollowFeed) this.f67539l.get(i);
                                if (followFeed != null) {
                                    m109813a(vVar, followFeed.getRoomStruct(), followFeed.getRequestId());
                                }
                                ((BaseFollowViewHolder) vVar).f77510Z = this.f58251z;
                                break;
                            case 37:
                                ((FollowFeedLastWatchItemViewHolder) vVar).mo86980a((FollowFeed) this.f67539l.get(i));
                                break;
                            case 38:
                                ((FollowFeedEmptyItemViewHolder) vVar).mo86978a(this.f88889L);
                                break;
                            default:
                                switch (a) {
                                    case 50:
                                        if (vVar instanceof RecommendFriendItemViewV2Holder) {
                                            ((RecommendFriendItemViewV2Holder) vVar).mo76580a((FollowFeed) this.f67539l.get(i), i, false, 2);
                                            break;
                                        }
                                        break;
                                    case 51:
                                        if (vVar instanceof RecommendFriendsTitleHolder) {
                                            ((RecommendFriendsTitleHolder) vVar).mo76584a(false, 2, 0, false, this.f88885G);
                                            break;
                                        }
                                        break;
                                    case 52:
                                        if (vVar instanceof RecommendContactViewHolder) {
                                            ((RecommendContactViewHolder) vVar).mo76572a((RecommendContact) ((FollowFeed) this.f67539l.get(i)).getRecommendUser(), i);
                                            break;
                                        }
                                        break;
                                    default:
                                        if (this.f67539l.get(i) != null) {
                                            FollowFeed followFeed2 = (FollowFeed) this.f67539l.get(i);
                                            if (C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) > 0) {
                                                z = true;
                                            }
                                            followFeed2.setIsMomentStyle(z);
                                        }
                                        super.mo58033a(vVar, i);
                                        break;
                                }
                        }
                }
            } else {
                ((UpLoadRecoverItemViewHolder) vVar).mo87025a((FollowFeed) this.f67539l.get(i));
            }
        } else {
            ((FollowFeedStatusItemViewHolder) vVar).mo86983a(this.f88890M);
        }
        if (C28425m.m93430a() && mo58029a(i) == 16) {
            Aweme aweme = mo58050b(i).getAweme();
            if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                C28425m.m93429a(aweme.getAid());
            }
        }
    }

    /* renamed from: a */
    private void m109813a(C1293v vVar, C29463i iVar, String str) {
        if (iVar != null) {
            iVar.f77715a.setRequestId(str);
            switch (C7213d.m22500a().mo18765ac()) {
                case 2:
                case 3:
                    ((InsFollowLiveViewHolderA) vVar).mo86994a(iVar.f77715a, this.f58244h);
                    return;
                case 4:
                    ((InsFollowLiveViewHolderB) vVar).mo86994a(iVar.f77715a, this.f58244h);
                    return;
                case 5:
                    ((InsFollowLiveViewHolderD) vVar).mo86994a(iVar.f77715a, this.f58244h);
                    return;
                default:
                    ((InsFollowLiveViewHolderA) vVar).mo86994a(iVar.f77715a, this.f58244h);
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo86761a(int i, Bitmap bitmap, boolean z) {
        if (this.f67539l == null || !this.f67539l.contains(this.f88900W)) {
            this.f88900W = new C34148e();
            this.f88900W.setFeedType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            this.f88900W.f88990c = z;
            if (!C6399b.m19944t() || (this.f88883E && this.f67539l != null && this.f67539l.size() > 0)) {
                mo62316a(this.f88900W, 1);
            } else {
                mo62316a(this.f88900W, 0);
            }
            if (this.f58248w != null) {
                this.f58248w.mo5541b(0);
            }
            this.f58241e.mo75114a(500);
        }
        this.f88900W.mo86841a(i);
        this.f88900W.mo86842a(bitmap);
    }

    public FollowFeedAdapter(RecyclerView recyclerView, C29374h hVar, C34271f fVar, Fragment fragment) {
        super(recyclerView, hVar);
        this.f88904aa = fVar;
        this.f88894Q = fragment;
    }
}
