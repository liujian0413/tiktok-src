package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.View;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23658a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.follow.C29446c;
import com.p280ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.p280ss.android.ugc.aweme.follow.presenter.C29457e;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardVideoViewHolder;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.C30179z;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendItemViewV2Holder;
import com.p280ss.android.ugc.aweme.main.story.C33075f;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.C34109a;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedDisplayStyleExperiment;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.newfollow.p1420c.C34123a;
import com.p280ss.android.ugc.aweme.newfollow.p1421d.C34126b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34137a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34168b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34170d;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FollowFeedFragment;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FriendTabViewModel;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1609b.C40717a;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p280ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.f */
public final class C34271f extends C29383a<FollowFeedAdapter, FollowFeed> implements C23267h<User>, C30016a, C33075f, C34168b {

    /* renamed from: I */
    private static final int f89385I = ((int) C9738o.m28708b(C6399b.m19921a(), 52.0f));

    /* renamed from: r */
    public static final int f89386r = ((int) C9738o.m28708b(C6399b.m19921a(), 16.0f));

    /* renamed from: s */
    public static final int f89387s = ((int) C9738o.m28708b(C6399b.m19921a(), 16.0f));

    /* renamed from: t */
    public static final int f89388t = ((int) C9738o.m28708b(C6399b.m19921a(), 0.5f));

    /* renamed from: u */
    public static final int f89389u = ((int) C9738o.m28708b(C6399b.m19921a(), -10.0f));

    /* renamed from: A */
    private User f89390A;

    /* renamed from: B */
    private C30179z f89391B;

    /* renamed from: C */
    private int f89392C = -1;

    /* renamed from: D */
    private boolean f89393D;

    /* renamed from: E */
    private boolean f89394E;

    /* renamed from: F */
    private boolean f89395F;

    /* renamed from: G */
    private LiveTagViewModel f89396G;

    /* renamed from: H */
    private Map<String, Integer> f89397H = new HashMap();

    /* renamed from: J */
    private List<String> f89398J;

    /* renamed from: K */
    private Integer f89399K = Integer.valueOf(3);

    /* renamed from: L */
    private Integer f89400L = Integer.valueOf(4);

    /* renamed from: k */
    public FollowFeedFragment f89401k;

    /* renamed from: l */
    public String f89402l;

    /* renamed from: m */
    public String f89403m;

    /* renamed from: n */
    C34123a f89404n;

    /* renamed from: o */
    public boolean f89405o;

    /* renamed from: p */
    public String f89406p;

    /* renamed from: q */
    public String f89407q;

    /* renamed from: v */
    public boolean f89408v = false;

    /* renamed from: w */
    private DraftListener f89409w;

    /* renamed from: x */
    private C34126b f89410x;

    /* renamed from: y */
    private boolean f89411y;

    /* renamed from: z */
    private C34109a f89412z;

    /* renamed from: a */
    public final void mo87038a(boolean z, int i, int i2, boolean z2, boolean z3) {
        C34170d dVar = new C34170d(z, i, i2, z2, z3);
        FriendTabViewModel.m110119a(this.f89401k.getActivity()).f89046a.setValue(dVar);
    }

    /* renamed from: a */
    public final void mo87034a(FollowFeedFragment followFeedFragment, View view, C34126b bVar, C21743a aVar) {
        this.f89410x = bVar;
        this.f89401k = followFeedFragment;
        mo75135a(followFeedFragment, view, bVar, aVar, followFeedFragment.mo73843v(), followFeedFragment.mo73844w(), "");
        this.f89396G = C29446c.m96872a(this.f89401k.getActivity());
        this.f77422a.mo60699a(false, this.f77422a.getProgressViewStartOffset() + f89385I, this.f77422a.getProgressViewEndOffset());
        this.f77423b.mo5525a((C1272h) new C1272h() {

            /* renamed from: b */
            private Drawable f89417b = C0683b.m2903a(C34271f.this.getContext(), (int) R.color.a4j);

            public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int f = RecyclerView.m5892f(childAt);
                    if (f > 0 && f < recyclerView.getAdapter().getItemCount() && (f >= recyclerView.getAdapter().getItemCount() - 1 || recyclerView.getAdapter().getItemViewType(f + 1) != 37)) {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(f);
                        if (!(itemViewType == 37 || itemViewType == 51 || itemViewType == 50 || itemViewType == 48 || itemViewType == 52)) {
                            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                            int i2 = C34271f.f89388t + bottom;
                            if (C29369d.m96464b()) {
                                this.f89417b.setBounds(childAt.getLeft(), bottom, childAt.getRight(), i2);
                            } else {
                                this.f89417b.setBounds(childAt.getLeft() + C34271f.f89386r, bottom, childAt.getRight() - C34271f.f89387s, i2);
                            }
                            this.f89417b.draw(canvas);
                        }
                    }
                }
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                rect.bottom = C34271f.f89388t;
            }
        });
        ((FollowFeedAdapter) this.f77427f).f88886H = this.f89406p;
        ((FollowFeedAdapter) this.f77427f).f88887I = this.f89395F;
        ((FollowFeedAdapter) this.f77427f).f88889L = bVar;
        ((FollowFeedAdapter) this.f77427f).f88890M = new C34278h(this);
        ((FollowFeedAdapter) this.f77427f).f88891N = this;
        ((FollowFeedAdapter) this.f77427f).f88892O = this;
        this.f89411y = TextUtils.equals(this.f89401k.mo73843v(), "rec_follow");
        if (this.f89411y) {
            ((FollowFeedAdapter) this.f77427f).f88883E = false;
        }
        ((FollowFeedAdapter) this.f77427f).f88885G = this.f89402l;
        ((FollowFeedAdapter) this.f77427f).f88888K = this.f89408v;
        if (!C6399b.m19944t()) {
            ((FollowFeedAdapter) this.f77427f).mo58045a(null);
        }
        this.f89412z = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createRecommendListPresenter();
        m110866q();
    }

    /* renamed from: a */
    public final void mo75152a(List<FollowFeed> list, boolean z) {
        if (TextUtils.equals(this.f89403m, "homepage_follow") && this.f89401k.getActivity() != null) {
            FollowPageFirstFrameViewModel.m136066a(this.f89401k.getActivity()).mo104572b();
        }
        super.mo75152a(list, z);
        C34137a.m109961a(C34137a.m109959a(this.f89399K), true, false);
        m110869t();
        this.f89394E = false;
        C34202f.m110435a().mo86950c();
        m110868s();
        m110872w();
    }

    /* renamed from: a */
    public final void mo61737a(C1293v vVar) {
        super.mo61737a(vVar);
        if (vVar instanceof BaseFollowViewHolder) {
            BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) vVar;
            if (baseFollowViewHolder.f77546j != null && m110863d(baseFollowViewHolder.mo75290r())) {
                C34196c.m110395a(C22704b.f60414c).mo86926b(baseFollowViewHolder.f77546j.getAid());
            }
        }
        if (vVar instanceof BaseForwardViewHolder) {
            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
            if (baseForwardViewHolder.f78552F != null && m110863d(baseForwardViewHolder.mo76044t())) {
                C34196c.m110395a(C22704b.f60414c).mo86926b(baseForwardViewHolder.f78552F.getAid());
            }
        }
        if (vVar instanceof RecommendFriendItemViewV2Holder) {
            User a = ((RecommendFriendItemViewV2Holder) vVar).mo76579a();
            int adapterPosition = vVar.getAdapterPosition() - 2;
            if (this.f89398J == null) {
                this.f89398J = new ArrayList();
            }
            if (a != null && !this.f89398J.contains(a.getUid())) {
                String str = a.isNewRecommend() ? "new" : "past";
                C34202f.m110435a().mo86948a(3, a.getUid());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("rec_uid", a.getUid());
                    jSONObject.put("enter_from", "homepage_friends");
                    jSONObject.put("event_type", "impression");
                    jSONObject.put("impr_order", adapterPosition);
                    jSONObject.put("req_id", a.getRequestId());
                    jSONObject.put("page_status", "empty");
                    jSONObject.put("rec_reason", a.getRecommendReason());
                    jSONObject.put("card_type", str);
                } catch (JSONException unused) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("homepage_follow").setJsonObject(jSONObject));
                C6907h.m21525a("follow_card", jSONObject);
                this.f89398J.add(a.getUid());
            }
        }
    }

    /* renamed from: a */
    public final void mo75145a(Integer num) {
        this.f89400L = num;
        bd_();
    }

    /* renamed from: a */
    public final void mo75141a(C21750a aVar) {
        if (this.f77427f != null) {
            if (aVar.f58255a == 2) {
                ((FollowFeedAdapter) this.f77427f).mo86767b(false);
            } else if (aVar.f58255a == 1) {
                ((FollowFeedAdapter) this.f77427f).mo58055c(aVar.f58256b);
            }
            ((FollowFeedAdapter) this.f77427f).mo86770p();
        }
    }

    /* renamed from: a */
    public final void mo87037a(String str, String str2, String str3) {
        if (this.f89410x != null) {
            C34137a.m109960a(C34137a.m109959a(Integer.valueOf(1)));
            this.f89410x.mo56976a(Integer.valueOf(1), C29457e.m96948a(1, 0, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75460a(Integer.valueOf(this.f89396G.mo75343a())).mo75462b(str).mo75463c(str2).mo75464d(str3).mo75459a());
        }
    }

    /* renamed from: a */
    public final void mo87033a(FollowFeed followFeed, boolean z) {
        if (this.f77427f != null && m110871v()) {
            ((FollowFeedAdapter) this.f77427f).mo86764a(followFeed, z);
            if (z) {
                ((FollowFeedAdapter) this.f77427f).mo86771q();
            } else {
                ((FollowFeedAdapter) this.f77427f).mo86770p();
            }
            mo87044l();
        }
    }

    /* renamed from: a */
    public final void mo87032a(C27311c cVar, boolean z) {
        if (this.f77427f != null && m110871v()) {
            mo75133a(4);
            ((FollowFeedAdapter) this.f77427f).mo86763a(cVar, z);
            C6907h.m21524a("publish_retry_show", (Map) C22984d.m75611a().mo59973a("creation_id", cVar.mo70303y()).f60753a);
            m110859a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo75149a(String str, ForwardDetail forwardDetail) {
        if (forwardDetail != null) {
            ((FollowFeedAdapter) this.f77427f).mo58042a(str, forwardDetail.getAweme(), ((FollowFeedAdapter) this.f77427f).f88883E ? 1 : 0);
            ((FollowFeedAdapter) this.f77427f).mo58041a(str, forwardDetail.getComment());
        }
    }

    /* renamed from: a */
    public final void mo87036a(C40717a aVar) {
        if (aVar != null && this.f77427f != null) {
            for (int i = 0; i < ((FollowFeedAdapter) this.f77427f).getItemCount(); i++) {
                C34145b b = ((FollowFeedAdapter) this.f77427f).mo58050b(i);
                if (b instanceof FollowFeed) {
                    Aweme aweme = b.getAweme();
                    if (aweme != null && TextUtils.equals(aweme.getAid(), aVar.f105853a)) {
                        for (InteractStickerStruct voteStruct : aweme.getInteractStickerStructs()) {
                            VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                            if (voteStruct2 != null && voteStruct2.getOptions() != null) {
                                Iterator it = voteStruct2.getOptions().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((OptionsBean) it.next()).getOptionId() == aVar.f105854b) {
                                            voteStruct2.setSelectOptionId(aVar.f105854b);
                                            m110862c(aweme);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: t */
    private void m110869t() {
        this.f89399K = Integer.valueOf(3);
    }

    /* renamed from: u */
    private void m110870u() {
        this.f89400L = Integer.valueOf(4);
    }

    /* renamed from: y */
    private Activity m110874y() {
        return this.f89401k.getActivity();
    }

    /* renamed from: d */
    public final C21744b mo75166d() {
        return new C21744b() {
            /* renamed from: d */
            public final String mo58075d() {
                return "key_container_follow";
            }

            /* renamed from: e */
            public final Object mo58076e() {
                return C34271f.this.f77427f;
            }

            /* renamed from: a */
            public final boolean mo58072a() {
                if (C34271f.this.f89401k == null || !C34271f.this.f89401k.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo58074c() {
                if (C34271f.this.f89401k != null) {
                    return C34271f.this.f89401k.getActivity();
                }
                return C34271f.this.f77423b.getContext();
            }

            /* renamed from: b */
            public final boolean mo58073b() {
                if (C34271f.this.f89401k == null || !C34271f.this.f89401k.getLifecycle().mo54a().equals(State.RESUMED) || !C34271f.this.f89401k.mUserVisibleHint) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: l */
    public final void mo87044l() {
        m110857a(0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo87046n() {
        ((FollowFeedAdapter) this.f77427f).mo86775u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo87047o() {
        if (this.f89410x != null) {
            mo75167e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public FollowFeedAdapter mo75164c() {
        return new FollowFeedAdapter(this.f77423b, new C29374h() {

            /* renamed from: b */
            private int f89415b;

            /* renamed from: a */
            public final int mo75107a() {
                return 0;
            }

            /* renamed from: a */
            public final void mo75108a(RecyclerView recyclerView, int i) {
                boolean z;
                if (C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 8 || C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 9) {
                    this.f89415b = i;
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (i >= 0 || i <= C34271f.f89389u || recyclerView.getScrollState() == 1) {
                        C34271f fVar = C34271f.this;
                        if (recyclerView.getScrollState() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        fVar.mo87038a(true, i, computeVerticalScrollOffset, true, z);
                    }
                }
            }

            /* renamed from: b */
            public final void mo75109b(RecyclerView recyclerView, int i) {
                if (C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 8 || C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 9) {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (i == 0) {
                        C34271f.this.mo87038a(false, this.f89415b, computeVerticalScrollOffset, false, false);
                    }
                }
            }
        }, this, this.f89401k);
    }

    /* renamed from: s */
    private static void m110868s() {
        C34196c.m110395a(C22704b.f60414c).mo86929d();
    }

    /* renamed from: x */
    private void m110873x() {
        ((FollowFeedAdapter) this.f77427f).mo86772r();
        this.f89393D = false;
    }

    /* renamed from: g */
    public final void mo75169g() {
        super.mo75169g();
        C34196c.m110395a(C22704b.f60414c).mo86930e();
    }

    /* renamed from: q */
    private void m110866q() {
        C23352a.m76612a().mo60651a("refresh_immediate", Boolean.class).observe(this.f89401k, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool != null && bool.booleanValue() && TextUtils.equals(C34271f.this.f89402l, "extra_follow_type_follow")) {
                    C34271f.this.mo75167e();
                }
            }
        });
    }

    /* renamed from: v */
    private boolean m110871v() {
        if (!C6399b.m19944t() || (C6399b.m19944t() && TextUtils.equals(this.f89402l, "extra_follow_type_follow"))) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private String m110875z() {
        if (TextUtils.equals(this.f89402l, "extra_follow_type_friend")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(this.f89402l, "extra_follow_type_follow")) {
            return "homepage_follow";
        }
        return "";
    }

    /* renamed from: m */
    public final void mo87045m() {
        if (this.f89412z != null) {
            this.f77423b.post(new C34279i(this));
            this.f89393D = false;
        }
    }

    /* renamed from: r */
    private boolean m110867r() {
        if (((FollowFeedAdapter) this.f77427f).getItemCount() == 0 || (((FollowFeedAdapter) this.f77427f).getItemCount() == 1 && ((FollowFeedAdapter) this.f77427f).mo58050b(0).getFeedType() == 65283)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo75157b() {
        this.f77424c.setBuilder(C10803a.m31631a(getContext()).mo25964b(C43361b.m137644a(getContext(), new C34277g(this))));
        this.f77424c.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.ml));
    }

    /* renamed from: w */
    private void m110872w() {
        int i;
        if (TextUtils.equals(this.f89402l, "extra_follow_type_friend")) {
            i = 51;
        } else if (TextUtils.equals(this.f89402l, "extra_follow_type_follow")) {
            i = 50;
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (C34315c.m110974a(i) > 0) {
                if (C6384b.m19835a().mo15287a(FollowFeedDisplayStyleExperiment.class, true, "remove_friend_tab", C6384b.m19835a().mo15295d().remove_friend_tab, 0) == 2) {
                    C34315c.m110984c(51);
                }
                C34315c.m110984c(i);
                C42961az.m136380a(new C34314g(i, -1));
            }
        }
    }

    /* renamed from: a */
    public final void mo60744a() {
        int i;
        if (isViewValid()) {
            if (!C34281k.m110922a(this.f89401k.getContext())) {
                mo75153a(false);
                if (this.f89410x != null) {
                    this.f89410x.mo86797t();
                }
                C10761a.m31399c(this.f89401k.getContext(), (int) R.string.cjs).mo25750a();
                return;
            }
            if (this.f89399K == null) {
                i = 3;
            } else {
                i = this.f89399K.intValue();
            }
            this.f89399K = Integer.valueOf(i);
            if (this.f89410x != null) {
                C34137a.m109960a(C34137a.m109959a(this.f89399K));
                mo75167e();
                mo75153a(true);
            }
        }
    }

    public final void bd_() {
        if (isViewValid()) {
            if (3 != this.f89392C || this.f89393D) {
                if (!this.f89410x.mo66539h().isDataEmpty() && this.f89410x != null) {
                    C34137a.m109960a(C34137a.m109962b(this.f89400L));
                    C34196c.m110395a(C22704b.f60414c).mo86925a(m110861c(this.f89401k.mo86856a()));
                    this.f89410x.mo56976a(Integer.valueOf(4), C29457e.m96948a(4, 2, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75461a(C34196c.m110395a(C22704b.f60414c).mo86924a()).mo75459a());
                }
            } else if (this.f89412z != null) {
            }
        }
    }

    /* renamed from: e */
    public final void mo75167e() {
        boolean z;
        if (this.f89410x != null) {
            if (this.f77427f != null) {
                FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) this.f77427f;
                if (C6399b.m19944t() || this.f89411y) {
                    z = false;
                } else {
                    z = true;
                }
                followFeedAdapter.f88883E = z;
            }
            if (!C34196c.m110395a(C22704b.f60414c).mo86927b()) {
                C34196c.m110395a(C22704b.f60414c).f89175b = new HashSet<>(C34196c.m110395a(C22704b.f60414c).f89174a);
            }
            if (this.f89410x != null) {
                this.f89410x.mo56976a(Integer.valueOf(1), C29457e.m96948a(1, 0, 1, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75462b(this.f89407q).mo75459a());
                this.f89396G.f77631a = false;
            }
        }
    }

    /* renamed from: c */
    static final /* synthetic */ Void m110860c(String str) throws Exception {
        try {
            DiscoverApi.m87297b(str);
        } catch (Exception unused) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo87039b(View view) {
        if (this.f89410x != null) {
            mo75167e();
        }
    }

    /* renamed from: e */
    private static void m110864e(String str) {
        C1592h.m7853a((Callable<TResult>) new C34280j<TResult>(str));
    }

    /* renamed from: a */
    public final void mo87035a(FollowStatus followStatus) {
        ((FollowFeedAdapter) this.f77427f).mo86765a(followStatus);
    }

    /* renamed from: b */
    public final void mo87040b(Integer num) {
        this.f89399K = num;
        mo60744a();
    }

    /* renamed from: f */
    public final void mo87043f(boolean z) {
        this.f89395F = z;
        if (this.f77427f != null) {
            ((FollowFeedAdapter) this.f77427f).f88887I = this.f89395F;
        }
    }

    /* renamed from: d */
    private static boolean m110863d(String str) {
        if (TextUtils.equals("homepage_friends", str) || TextUtils.equals("homepage_follow", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo75158b(String str) {
        int d = ((FollowFeedAdapter) this.f77427f).mo58057d(str);
        if (d >= 0) {
            ((FollowFeedAdapter) this.f77427f).mo58055c(d);
            ((FollowFeedAdapter) this.f77427f).mo86770p();
        }
    }

    /* renamed from: a */
    private void m110859a(final C27311c cVar) {
        this.f89409w = new DraftListener() {
            public final void onDraftCheckedChanged(C27311c cVar, boolean z) {
            }

            public final void onDraftClean() {
            }

            public final void onDraftUpdate(C27311c cVar) {
            }

            public final void onDraftDelete(C27311c cVar) {
                if (cVar != null && TextUtils.equals(cVar.mo70221aj(), cVar.mo70221aj())) {
                    C34271f.this.mo87042e(false);
                }
            }
        };
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.f89409w);
    }

    /* renamed from: c */
    private static List<String> m110861c(List<FollowFeed> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme().getAid());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo87041d(boolean z) {
        if (this.f89404n == null) {
            this.f89404n = new C34123a(this.f77425d);
            this.f89404n.f88918b = this.f89410x;
        }
        this.f89404n.mo86790a(z);
    }

    /* renamed from: f_ */
    public final void mo75546f_(boolean z) {
        if (this.f77427f != null) {
            int o = ((FollowFeedAdapter) this.f77427f).mo86768o();
            if (o >= 0) {
                C1293v f = this.f77423b.mo5575f(o);
                if (f != null && C33075f.class.isAssignableFrom(f.getClass())) {
                    ((C33075f) f).mo75546f_(z);
                }
            }
        }
    }

    /* renamed from: c */
    private void m110862c(Aweme aweme) {
        int l = this.f77428g.mo5447l();
        for (int j = this.f77428g.mo5445j(); j <= l; j++) {
            C1293v f = this.f77423b.mo5575f(j);
            if (f instanceof FollowVideoViewHolder) {
                FollowVideoViewHolder followVideoViewHolder = (FollowVideoViewHolder) f;
                if (TextUtils.equals(followVideoViewHolder.f77546j.getAid(), aweme.getAid())) {
                    followVideoViewHolder.f77546j = aweme;
                    followVideoViewHolder.mo75306ae();
                    return;
                }
            }
            if (f instanceof ForwardVideoViewHolder) {
                ForwardVideoViewHolder forwardVideoViewHolder = (ForwardVideoViewHolder) f;
                if (TextUtils.equals(forwardVideoViewHolder.f78552F.getAid(), aweme.getAid())) {
                    forwardVideoViewHolder.f78552F = aweme;
                    forwardVideoViewHolder.mo76061N();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75133a(int i) {
        if (isViewValid()) {
            this.f89392C = i;
            if (!C6399b.m19944t() && i == 1) {
                C34137a.m109961a(C34137a.m109959a(this.f89399K), false, true);
                m110869t();
            }
            if (C6399b.m19944t()) {
                super.mo75133a(i);
                m110874y();
                return;
            }
            switch (i) {
                case 2:
                    if (this.f77427f != null && m110867r()) {
                        if (this.f77424c != null) {
                            this.f77424c.setVisibility(8);
                        }
                        ((FollowFeedAdapter) this.f77427f).mo86773s();
                        return;
                    }
                case 3:
                    if (this.f77424c != null) {
                        this.f77424c.setVisibility(8);
                    }
                    if (this.f77427f != null && !this.f89394E) {
                        ((FollowFeedAdapter) this.f77427f).mo86774t();
                    }
                    m110872w();
                    return;
                default:
                    super.mo75133a(i);
                    break;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo75163b(int i) {
        if (!isViewValid()) {
            return true;
        }
        switch (i) {
            case 1:
                C34137a.m109961a(C34137a.m109962b(this.f89400L), false, true);
                m110873x();
                if (this.f77427f != null) {
                    ((FollowFeedAdapter) this.f77427f).mo66508i();
                }
                return true;
            case 2:
                if (this.f77427f != null) {
                    ((FollowFeedAdapter) this.f77427f).ag_();
                }
                return true;
            case 3:
                if (this.f77427f != null) {
                    ((FollowFeedAdapter) this.f77427f).ah_();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: e */
    public final void mo87042e(boolean z) {
        if (this.f77427f != null && m110871v()) {
            ((FollowFeedAdapter) this.f77427f).mo86766a(z);
            ((FollowFeedAdapter) this.f77427f).mo86770p();
            mo87044l();
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.getPublishService().setUploadRecoverPath(null);
            }
        }
        if (this.f89409w != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.f89409w);
            this.f89409w = null;
        }
    }

    /* renamed from: a */
    public final void mo87031a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled() && this.f77423b != null && this.f77423b.getScrollState() == 0 && !this.f77423b.mo5606i()) {
            ((FollowFeedAdapter) this.f77427f).mo86762a(bitmap);
        }
    }

    /* renamed from: a */
    private void m110857a(int i, int i2) {
        if (this.f77423b != null) {
            ((LinearLayoutManager) this.f77423b.getLayoutManager()).mo5417a(0, 0);
        }
    }

    /* renamed from: a_ */
    public final void mo76228a_(String str, int i) {
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "find_friends").mo18695a());
    }

    /* renamed from: b */
    public final void mo75161b(List<FollowFeed> list, boolean z) {
        super.mo75161b(list, z);
        C34137a.m109961a(C34137a.m109962b(this.f89400L), true, !z);
        m110870u();
        m110868s();
    }

    /* renamed from: a */
    public final void mo87030a(int i, Bitmap bitmap, boolean z) {
        if (this.f77427f != null && m110871v()) {
            mo75133a(4);
            if (this.f77423b != null && this.f77423b.getScrollState() == 0 && !this.f77423b.mo5606i()) {
                ((FollowFeedAdapter) this.f77427f).mo86761a(i, bitmap, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60535a(int i, User user, int i2, View view, String str) {
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4 = 0;
        if (TextUtils.isEmpty(user.getUid()) || this.f89397H.get(user.getUid()) == null) {
            i3 = 0;
        } else {
            i3 = ((Integer) this.f89397H.get(user.getUid())).intValue();
        }
        if (i == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", this.f89412z.mo86759a().getRid());
                jSONObject.put("enter_from", "invite_friend");
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("rec_uid", user.getUid());
                jSONObject2.put("enter_from", m110875z());
                jSONObject2.put("event_type", "enter_profile");
                jSONObject2.put("impr_order", i3);
                jSONObject2.put("req_id", this.f89412z.mo86759a().getRid());
                jSONObject2.put("trigger_reason", "friend_rec_message");
                jSONObject2.put("rec_reason", user.getRecommendReason());
                String str11 = "card_type";
                if (user.isNewRecommend()) {
                    str9 = "new";
                } else {
                    str9 = "past";
                }
                jSONObject2.put(str11, str9);
                String str12 = "page_status";
                if (((FollowFeedAdapter) this.f77427f).f88888K) {
                    str10 = "empty";
                } else {
                    str10 = "nonempty";
                }
                jSONObject2.put(str12, str10);
            } catch (Exception unused2) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
            C6907h.m21525a("follow_card", jSONObject2);
            String str13 = "enter_personal_detail_backup";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", m110875z()).mo59973a("to_user_id", user.getUid()).mo59973a("group_id", "").mo59973a("request_id", this.f89412z.mo86759a().getRid()).mo59973a("enter_method", "click_card");
            String str14 = "page_status";
            if (((FollowFeedAdapter) this.f77427f).f88888K) {
                str7 = "empty";
            } else {
                str7 = "nonempty";
            }
            C6907h.m21524a(str13, (Map) a.mo59973a(str14, str7).f60753a);
            ((C33276r) new C33276r().mo85322o(user.getUid()).mo85310b(m110875z()).mo85048a(str)).mo85323p(this.f89412z.mo86759a().getRid()).mo85252e();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", this.f89412z.mo86759a().getRid());
            } catch (Exception unused3) {
            }
            if ("click_name".equals(str)) {
                str8 = "name";
            } else {
                str8 = "head";
            }
            C6907h.onEvent(MobClick.obtain().setEventName(str8).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            UserProfileActivity.m117386a(getContext(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from_request_id", this.f89412z.mo86759a().getRid()).mo104633a("enter_from", m110875z()).mo104630a("is_cold_launch", 1).mo104630a("from_recommend_card", 1).mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
        } else if (i == 100) {
            if (isViewValid()) {
                if (!C34281k.m110922a(this.f89401k.getActivity())) {
                    C10761a.m31399c((Context) this.f89401k.getActivity(), (int) R.string.cjs).mo25750a();
                    return;
                }
                this.f89390A = user;
                this.f89391B = (C30179z) view;
                if (user.getFollowStatus() != 0) {
                    i4 = 1;
                }
                int i5 = i4 ^ 1;
                C42961az.m136380a(new C23658a(i5, user));
                if (i5 == 0) {
                    C6907h.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(String.valueOf(user.getUid())));
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("request_id", this.f89412z.mo86759a().getRid());
                    } catch (Exception unused4) {
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(String.valueOf(user.getUid())).setJsonObject(jSONObject4));
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("rec_uid", user.getUid());
                        jSONObject5.put("enter_from", m110875z());
                        jSONObject5.put("event_type", "follow");
                        jSONObject5.put("impr_order", i3);
                        jSONObject5.put("req_id", this.f89412z.mo86759a().getRid());
                        jSONObject5.put("trigger_reason", "friend_rec_message");
                        jSONObject5.put("rec_reason", user.getRecommendReason());
                        String str15 = "card_type";
                        if (user.isNewRecommend()) {
                            str5 = "new";
                        } else {
                            str5 = "past";
                        }
                        jSONObject5.put(str15, str5);
                        String str16 = "page_status";
                        if (((FollowFeedAdapter) this.f77427f).f88888K) {
                            str6 = "empty";
                        } else {
                            str6 = "nonempty";
                        }
                        jSONObject5.put(str16, str6);
                    } catch (Exception unused5) {
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                    C6907h.m21525a("follow_card", jSONObject5);
                    C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(String.valueOf(user.getUid())));
                }
                if (i5 == 0) {
                    str3 = "follow_cancel";
                } else {
                    str3 = "follow";
                }
                C33280v b = new C33280v(str3).mo85347f("other_places").mo85341b(m110875z());
                if (((FollowFeedAdapter) this.f77427f).f88888K) {
                    str4 = "empty";
                } else {
                    str4 = "nonempty";
                }
                b.mo85344d(str4).mo85343c("follow_button").mo85352o(user.getRequestId()).mo85348g(user.getUid()).mo85252e();
            }
        } else if (i == 102 && isViewValid()) {
            if (!C34281k.m110922a(this.f89401k.getActivity())) {
                C10761a.m31399c((Context) this.f89401k.getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            int a2 = ((FollowFeedAdapter) this.f77427f).mo58031a(user);
            if (a2 >= 0 && a2 < ((FollowFeedAdapter) this.f77427f).getItemCount()) {
                ((FollowFeedAdapter) this.f77427f).mo58055c(a2);
                if (!(user instanceof RecommendContact)) {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("rec_uid", user.getUid());
                        jSONObject6.put("enter_from", m110875z());
                        jSONObject6.put("event_type", "delete");
                        jSONObject6.put("impr_order", i3);
                        jSONObject6.put("req_id", this.f89412z.mo86759a().getRid());
                        jSONObject6.put("trigger_reason", "friend_rec_message");
                        jSONObject6.put("rec_reason", user.getRecommendReason());
                        String str17 = "card_type";
                        if (user.isNewRecommend()) {
                            str2 = "new";
                        } else {
                            str2 = "past";
                        }
                        jSONObject6.put(str17, str2);
                    } catch (Exception unused6) {
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject6));
                    C6907h.m21528b("follow_card", jSONObject6);
                    m110864e(user.getUid());
                    if (!(this.f89401k == null || this.f89401k.getActivity() == null)) {
                        C10761a.m31409e((Context) this.f89401k.getActivity(), (int) R.string.tu).mo25750a();
                    }
                }
            }
        }
    }
}
