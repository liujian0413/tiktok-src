package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23658a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.feed.C28204ah;
import com.p280ss.android.ugc.aweme.following.C29560a;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendListAdapter;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.main.C32981dh;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.ImportFromMailListView;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.utils.permission.PermissionStateReporter;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment */
public final class RecommendUserFragment extends AmeBaseFragment implements C23267h<User>, C6905a, C29560a, C30016a, C36042p {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f95230e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendUserFragment.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/friends/adapter/RecommendListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendUserFragment.class), "mRecommendCommonUserPresenter", "getMRecommendCommonUserPresenter()Lcom/ss/android/ugc/aweme/profile/presenter/RecommendCommonUserPresenter;"))};

    /* renamed from: f */
    public String f95231f;

    /* renamed from: g */
    public String f95232g;

    /* renamed from: h */
    public int f95233h;

    /* renamed from: i */
    private String f95234i;

    /* renamed from: j */
    private String f95235j;

    /* renamed from: k */
    private String f95236k;

    /* renamed from: l */
    private boolean f95237l;

    /* renamed from: m */
    private final C7541d f95238m = C7546e.m23569a(new C36297c(this));

    /* renamed from: n */
    private final C7541d f95239n = C7546e.m23569a(new C36298d(this));

    /* renamed from: o */
    private HashMap f95240o;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment$a */
    static final class C36295a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f95241a;

        C36295a(String str) {
            this.f95241a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                DiscoverApi.m87297b(this.f95241a);
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment$b */
    static final class C36296b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserFragment f95242a;

        C36296b(RecommendUserFragment recommendUserFragment) {
            this.f95242a = recommendUserFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f95242a.mo92335a((int) R.id.dav)).mo25942f();
            this.f95242a.mo92336d().mo91632a(30, this.f95242a.f95231f, this.f95242a.f95233h, C43161e.m136882a(), (String) null, C43161e.m136884b(), this.f95242a.f95232g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment$c */
    static final class C36297c extends Lambda implements C7561a<RecommendListAdapter> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserFragment f95243a;

        C36297c(RecommendUserFragment recommendUserFragment) {
            this.f95243a = recommendUserFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendListAdapter invoke() {
            return new RecommendListAdapter(this.f95243a.getContext(), !C6399b.m19944t());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserFragment$d */
    static final class C36298d extends Lambda implements C7561a<C36004ad> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserFragment f95244a;

        C36298d(RecommendUserFragment recommendUserFragment) {
            this.f95244a = recommendUserFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C36004ad invoke() {
            return new C36004ad(new RecommendCommonUserModel(), this.f95244a);
        }
    }

    /* renamed from: e */
    private final RecommendListAdapter m117286e() {
        return (RecommendListAdapter) this.f95238m.getValue();
    }

    /* renamed from: k */
    private void m117290k() {
        if (this.f95240o != null) {
            this.f95240o.clear();
        }
    }

    /* renamed from: a */
    public final View mo92335a(int i) {
        if (this.f95240o == null) {
            this.f95240o = new HashMap();
        }
        View view = (View) this.f95240o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f95240o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean aU_() {
        return this.f95237l;
    }

    /* renamed from: d */
    public final C36004ad mo92336d() {
        return (C36004ad) this.f95239n.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m117290k();
    }

    public final void aV_() {
        if (isViewValid()) {
            m117289j();
            this.f95237l = false;
        }
    }

    public final void onStop() {
        super.onStop();
        C34202f.m110435a().mo86951d();
    }

    /* renamed from: f */
    private final void m117287f() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f95231f = arguments.getString("uid");
            this.f95232g = arguments.getString(C22689a.f60407a);
            this.f95233h = arguments.getInt("type", 1);
            this.f95235j = arguments.getString("enter_from");
            this.f95234i = arguments.getString("extra_previous_page");
            this.f95236k = arguments.getString("request_id");
        }
    }

    /* renamed from: j */
    private final void m117289j() {
        mo92336d().mo91632a(30, this.f95231f, this.f95233h, C43161e.m136882a(), (String) null, C43161e.m136884b(), this.f95232g);
        ((DmtStatusView) mo92335a((int) R.id.dav)).mo25942f();
    }

    public final void bd_() {
        mo92336d().mo91629a(30, this.f95231f, this.f95233h, C43161e.m136882a(), C43161e.m136884b(), this.f95232g);
        if (this.f95233h == 2) {
            C28204ah.m92703a("api_recommend_user", "recommend_user_activity", "load_more");
        }
        m117286e().ag_();
    }

    /* renamed from: g */
    private final void m117288g() {
        RecyclerView recyclerView = (RecyclerView) mo92335a((int) R.id.cp8);
        C7573i.m23582a((Object) recyclerView, "recommend_list");
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        ((RecyclerView) mo92335a((int) R.id.cp8)).mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(getContext(), 6.0f)));
        m117286e().f78960h = this.f95235j;
        m117286e().f78962j = this.f95231f;
        m117286e().f78961i = this.f95234i;
        m117286e().mo66516d(false);
        m117286e().mo76234c((View) new ImportFromMailListView(getContext()));
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        m117286e().mo76235d(new DmtStatusView(context));
        m117286e().f67550q = getResources().getColor(R.color.a53);
        m117286e().f78959g = this;
        m117286e().f78958f = this;
        m117286e().f78955c = this.f95233h;
        RecyclerView recyclerView2 = (RecyclerView) mo92335a((int) R.id.cp8);
        C7573i.m23582a((Object) recyclerView2, "recommend_list");
        recyclerView2.setAdapter(m117286e());
        if (this.f95233h == 2) {
            C28204ah.m92703a("api_recommend_user", "recommend_user_activity", "refresh");
        }
        ((DmtStatusView) mo92335a((int) R.id.dav)).setBuilder(C10803a.m31631a(getContext()).mo25953a().mo25961a(new C10806a(getContext()).mo25985a((int) R.drawable.b78).mo25990b((int) R.string.b0v).mo25991b("").f29135a).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C36296b(this)));
        if (!this.f95237l) {
            m117289j();
        }
    }

    /* renamed from: a */
    public final void mo75567a(boolean z) {
        this.f95237l = z;
    }

    /* renamed from: a */
    private static void m117285a(String str) {
        C1592h.m7855a((Callable<TResult>) new C36295a<TResult>(str), (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    private final void m117284a(User user) {
        m117286e().mo76233a(user);
        C10761a.m31409e(getContext(), (int) R.string.tu).mo25750a();
    }

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
        C7573i.m23587b(recommendList, "userList");
        if (isViewValid()) {
            m117286e().ai_();
            m117286e().mo76236e(recommendList.getUserList());
            m117286e().mo66516d(true);
            if (!recommendList.hasMore()) {
                m117286e().mo66504a((C6905a) null);
                m117286e().ah_();
            }
        }
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo92335a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            if (dmtStatusView.getVisibility() != 8) {
                ((DmtStatusView) mo92335a((int) R.id.dav)).mo25944h();
            }
            m117286e().mo66507h();
            C22814a.m75244a(getContext(), (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
        C7573i.m23587b(recommendList, "userList");
        if (isViewValid()) {
            if (C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
                ((DmtStatusView) mo92335a((int) R.id.dav)).mo25943g();
                m117286e().ai_();
                return;
            }
            int newUserCount = recommendList.getNewUserCount();
            if (!(newUserCount == -1 || recommendList.getUserList() == null || newUserCount > recommendList.getUserList().size())) {
                for (int i = 0; i < newUserCount; i++) {
                    Object obj = recommendList.getUserList().get(i);
                    C7573i.m23582a(obj, "userList.userList[i]");
                    ((User) obj).setNewRecommend(true);
                }
            }
            DmtStatusView dmtStatusView = (DmtStatusView) mo92335a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
            m117286e().mo58045a(new ArrayList(recommendList.getUserList()));
            m117286e().mo66516d(true);
            if (recommendList.hasMore()) {
                m117286e().mo66504a((C6905a) this);
                return;
            }
            m117286e().mo66504a((C6905a) null);
            m117286e().ah_();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m117287f();
        m117288g();
    }

    /* renamed from: a_ */
    public final void mo76228a_(String str, int i) {
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "find_friends").mo18695a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.qe, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        if (i == 1) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (iArr[0] == 0) {
                    Context context = getContext();
                    if (context == null) {
                        C7573i.m23580a();
                    }
                    startActivity(ContactsActivity.m98571a(context, null, true));
                    PermissionStateReporter.m136859d().mo104772e();
                    return;
                }
                C9738o.m28693a(getContext(), (int) R.string.i2);
                ((C32981dh) C23336d.m76560a(getContext(), C32981dh.class)).mo60487b(true);
                return;
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60535a(int i, User user, int i2, View view, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "enterMethod");
        if (isViewValid()) {
            int i3 = 1;
            switch (i) {
                case 100:
                    if (!C36441dy.m117660a(getContext())) {
                        C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
                        return;
                    }
                    if (user.getFollowStatus() == 0) {
                        i3 = 0;
                    }
                    C42961az.m136380a(new C23658a(i3 ^ 1, user));
                    if (i3 == 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("rec_uid", user.getUid());
                            if (C7573i.m23585a((Object) "others_homepage", (Object) this.f95234i)) {
                                jSONObject.put("profile_uid", this.f95231f);
                            }
                            jSONObject.put("enter_from", this.f95235j);
                            jSONObject.put("previous_page", this.f95234i);
                            jSONObject.put("event_type", "follow");
                            jSONObject.put("impr_order", i2);
                            RecommendList d = mo92336d().mo91636d();
                            C7573i.m23582a((Object) d, "mRecommendCommonUserPresenter.data");
                            jSONObject.put("req_id", d.getRid());
                            jSONObject.put("trigger_reason", "friend_rec_message");
                            jSONObject.put("rec_reason", user.getRecommendReason());
                            String str7 = "card_type";
                            if (user.isNewRecommend()) {
                                str3 = "new";
                            } else {
                                str3 = "past";
                            }
                            jSONObject.put(str7, str3);
                            jSONObject.put("rec_user_type", C21718a.m72637a(user));
                        } catch (Exception unused) {
                        }
                        C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                        C6907h.m21525a("follow_card", jSONObject);
                        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(user.getUid().toString()));
                    }
                    if (i3 == 0) {
                        str2 = "follow";
                    } else {
                        str2 = "follow_cancel";
                    }
                    C33280v vVar = new C33280v(str2);
                    String str8 = this.f95235j;
                    if (str8 == null) {
                        C7573i.m23580a();
                    }
                    vVar.mo85341b(str8).mo85343c("follow_button").mo85352o(this.f95236k).mo85345e(this.f95234i).mo85347f("other_places").mo85348g(user.getUid()).mo85350j(C21718a.m72637a(user)).mo85252e();
                    return;
                case BaseNotice.HASHTAG /*101*/:
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("rec_uid", user.getUid());
                        if (C7573i.m23585a((Object) "others_homepage", (Object) this.f95234i)) {
                            jSONObject2.put("profile_uid", this.f95231f);
                        }
                        jSONObject2.put("enter_from", this.f95235j);
                        jSONObject2.put("previous_page", this.f95234i);
                        jSONObject2.put("event_type", "enter_profile");
                        jSONObject2.put("impr_order", i2);
                        RecommendList d2 = mo92336d().mo91636d();
                        C7573i.m23582a((Object) d2, "mRecommendCommonUserPresenter.data");
                        jSONObject2.put("req_id", d2.getRid());
                        jSONObject2.put("trigger_reason", "friend_rec_message");
                        jSONObject2.put("rec_reason", user.getRecommendReason());
                        String str9 = "card_type";
                        if (user.isNewRecommend()) {
                            str5 = "new";
                        } else {
                            str5 = "past";
                        }
                        jSONObject2.put(str9, str5);
                        jSONObject2.put("rec_user_type", C21718a.m72637a(user));
                    } catch (Exception unused2) {
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
                    C6907h.m21525a("follow_card", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    String str10 = "request_id";
                    try {
                        RecommendList d3 = mo92336d().mo91636d();
                        C7573i.m23582a((Object) d3, "mRecommendCommonUserPresenter.data");
                        jSONObject3.put(str10, d3.getRid());
                        jSONObject3.put("enter_method", "click_head");
                    } catch (Exception unused3) {
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("to_user_id", user.getUid());
                        RecommendList d4 = mo92336d().mo91636d();
                        C7573i.m23582a((Object) d4, "mRecommendCommonUserPresenter.data");
                        jSONObject4.put("request_id", d4.getRid());
                    } catch (Exception unused4) {
                    }
                    if (C7573i.m23585a((Object) "click_name", (Object) str)) {
                        str4 = "name";
                    } else {
                        str4 = "head";
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName(str4).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject4));
                    C33276r o = new C33276r().mo85322o(user.getUid());
                    String str11 = this.f95235j;
                    if (str11 == null) {
                        C7573i.m23580a();
                    }
                    ((C33276r) o.mo85310b(str11).mo85048a(str)).mo85323p(this.f95236k).mo85324q(C21718a.m72637a(user)).mo85252e();
                    UserProfileActivity.m117386a(getContext(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104630a("from_recommend_card", 1).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from", this.f95235j).mo104633a("enter_from_request_id", user.getRequestId()).mo104633a("extra_previous_page_position", "main_head").mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
                    return;
                case 102:
                    if (C36441dy.m117660a(getContext())) {
                        if (!(user instanceof RecommendContact)) {
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("rec_uid", user.getUid());
                                jSONObject5.put("enter_from", m117286e().f78960h);
                                jSONObject5.put("event_type", "delete");
                                jSONObject5.put("impr_order", i2);
                                jSONObject5.put("req_id", this.f95236k);
                                jSONObject5.put("trigger_reason", "friend_rec_message");
                                jSONObject5.put("rec_reason", user.getRecommendReason());
                                String str12 = "card_type";
                                if (user.isNewRecommend()) {
                                    str6 = "new";
                                } else {
                                    str6 = "past";
                                }
                                jSONObject5.put(str12, str6);
                                jSONObject5.put("rec_user_type", C21718a.m72637a(user));
                            } catch (Exception unused5) {
                            }
                            C6907h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                            C6907h.m21525a("follow_card", jSONObject5);
                            String uid = user.getUid();
                            C7573i.m23582a((Object) uid, "user.uid");
                            m117285a(uid);
                            m117284a(user);
                            break;
                        } else {
                            m117284a(user);
                            return;
                        }
                    } else {
                        C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
                        return;
                    }
            }
        }
    }
}
