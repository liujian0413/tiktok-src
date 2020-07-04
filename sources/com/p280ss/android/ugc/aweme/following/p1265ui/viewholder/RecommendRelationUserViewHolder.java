package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView.C30136a;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36030i;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p280ss.android.ugc.aweme.user.repository.UserState;
import com.p280ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder */
public final class RecommendRelationUserViewHolder extends JediBaseViewHolder<RecommendRelationUserViewHolder, C29575j> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f78339g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendRelationUserViewHolder.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: j */
    private final C7541d f78340j;

    /* renamed from: k */
    private final RecommendUserItemView f78341k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$a */
    static final class C29790a extends Lambda implements C7563m<Integer, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationUserViewHolder f78342a;

        /* renamed from: b */
        final /* synthetic */ User f78343b;

        C29790a(RecommendRelationUserViewHolder recommendRelationUserViewHolder, User user) {
            this.f78342a = recommendRelationUserViewHolder;
            this.f78343b = user;
            super(2);
        }

        /* renamed from: a */
        private void m97544a(int i, String str) {
            C7573i.m23587b(str, "extra");
            this.f78342a.mo75765a(this.f78343b, i, str);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97544a(((Number) obj).intValue(), (String) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$b */
    static final class C29791b extends Lambda implements C7562b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C29791b f78344a = new C29791b();

        C29791b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97545a((RecommendUserListState) obj);
        }

        /* renamed from: a */
        private static String m97545a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f97284a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$c */
    static final class C29792c extends Lambda implements C7562b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C29792c f78345a = new C29792c();

        C29792c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97546a((RecommendUserListState) obj);
        }

        /* renamed from: a */
        private static String m97546a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f97286c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$d */
    static final class C29793d extends Lambda implements C7562b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C29793d f78346a = new C29793d();

        C29793d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97547a((RecommendUserListState) obj);
        }

        /* renamed from: a */
        private static String m97547a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f97285b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$e */
    static final class C29794e extends Lambda implements C7562b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationUserViewHolder f78347a;

        C29794e(RecommendRelationUserViewHolder recommendRelationUserViewHolder) {
            this.f78347a = recommendRelationUserViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UserState invoke(UserState userState) {
            C7573i.m23587b(userState, "$receiver");
            return UserState.copy$default(userState, ((C29575j) this.f78347a.mo29309o()).f77949b, false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$f */
    static final class C29795f extends Lambda implements C7563m<RecommendRelationUserViewHolder, User, C7581n> {

        /* renamed from: a */
        public static final C29795f f78348a = new C29795f();

        C29795f() {
            super(2);
        }

        /* renamed from: a */
        private static void m97549a(RecommendRelationUserViewHolder recommendRelationUserViewHolder, User user) {
            C7573i.m23587b(recommendRelationUserViewHolder, "$receiver");
            C7573i.m23587b(user, "user");
            recommendRelationUserViewHolder.mo75764a(user);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97549a((RecommendRelationUserViewHolder) obj, (User) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$g */
    static final class C29796g extends Lambda implements C7563m<RecommendRelationUserViewHolder, Throwable, C7581n> {

        /* renamed from: a */
        public static final C29796g f78349a = new C29796g();

        C29796g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97550a((RecommendRelationUserViewHolder) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m97550a(RecommendRelationUserViewHolder recommendRelationUserViewHolder, Throwable th) {
            C7573i.m23587b(recommendRelationUserViewHolder, "$receiver");
            C7573i.m23587b(th, "throwable");
            View view = recommendRelationUserViewHolder.itemView;
            C7573i.m23582a((Object) view, "itemView");
            C22814a.m75245a(view.getContext(), th, R.string.b82);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$h */
    static final class C29797h extends Lambda implements C7562b<RecommendUserListState, Integer> {

        /* renamed from: a */
        public static final C29797h f78350a = new C29797h();

        C29797h() {
            super(1);
        }

        /* renamed from: a */
        private static int m97551a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "it");
            return recommendUserListState.getRecommendUserType();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m97551a((RecommendUserListState) obj));
        }
    }

    /* renamed from: q */
    private final RecommendUserListViewModel m97538q() {
        return (RecommendUserListViewModel) this.f78340j.getValue();
    }

    /* renamed from: r */
    private final String m97539r() {
        return (String) mo29066a(m97538q(), (C7562b<? super S1, ? extends R>) C29792c.f78345a);
    }

    /* renamed from: s */
    private final String m97540s() {
        return (String) mo29066a(m97538q(), (C7562b<? super S1, ? extends R>) C29793d.f78346a);
    }

    /* renamed from: t */
    private final String m97541t() {
        return (String) mo29066a(m97538q(), (C7562b<? super S1, ? extends R>) C29791b.f78344a);
    }

    public final void bA_() {
        super.bA_();
        mo29062a(m97537p(), C29803c.f78360a, C11640h.m34110a(), C29795f.f78348a);
        C11503a.m33919a(this, m97537p(), C29804d.f78361a, null, C29796g.f78349a, null, null, 26, null);
        mo75765a(((C29575j) mo29309o()).f77949b, C30136a.m98753e(), "");
    }

    /* renamed from: p */
    private final UserViewModel m97537p() {
        C7562b eVar = new C29794e(this);
        Class<UserViewModel> cls = UserViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(UserViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(eVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: a */
    public final void mo75764a(User user) {
        this.f78341k.mo75741a(user);
        this.f78341k.setAdapterPosition(getAdapterPosition());
        this.f78341k.setActionEventListener(new C29790a(this, user));
    }

    public RecommendRelationUserViewHolder(RecommendUserItemView recommendUserItemView) {
        C7573i.m23587b(recommendUserItemView, "recommendView");
        super(recommendUserItemView);
        this.f78341k = recommendUserItemView;
        C7584c a = C7575l.m23595a(RecommendUserListViewModel.class);
        this.f78340j = C7546e.m23569a(new C29798xbe6ec6ab(this, a, a));
    }

    /* renamed from: b */
    private final void m97535b(User user) {
        new C33276r().mo85322o(user.getUid()).mo85310b(m97541t()).mo85319i(m97540s()).mo85252e();
    }

    /* renamed from: c */
    private final void m97536c(User user) {
        String str;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        new C33280v(str).mo85345e(m97540s()).mo85341b(m97541t()).mo85343c("follow_button").mo85348g(user.getUid()).mo85252e();
    }

    /* renamed from: a */
    private final void m97534a(User user, String str, int i) {
        new C33238ak(null, 1, null).mo85095a(user.getUid()).mo85097b(m97541t()).mo85098c(str).mo85093a(i).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason()).mo85101f("total").mo85102g(m97539r()).mo85252e();
    }

    /* renamed from: a */
    public final void mo75765a(User user, int i, String str) {
        String str2;
        user.setRequestId(((C29575j) mo29309o()).f77951d);
        int intValue = ((Number) mo29066a(m97538q(), (C7562b<? super S1, ? extends R>) C29797h.f78350a)).intValue();
        if (i == C30136a.m98753e()) {
            m97534a(user, "impression", ((C29575j) mo29309o()).f77950c);
            C34202f.m110435a().mo86948a(intValue, user.getUid());
            RecommendUserListViewModel q = m97538q();
            C34202f a = C34202f.m110435a();
            C7573i.m23582a((Object) a, "RecUserImpressionReporter.getInstance()");
            String b = a.mo86949b();
            C7573i.m23582a((Object) b, "RecUserImpressionReporte…getInstance().toReportIds");
            q.mo93674a(b);
            return;
        }
        int i2 = 1;
        if (i == 0 || i == C30136a.m98749a()) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            UserProfileActivity.m117386a(view.getContext(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from", m97541t()).mo104633a("enter_from_request_id", user.getRequestId()).mo104630a("need_track_compare_recommend_reason", 1).mo104630a("from_recommend_card", 1).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").mo104633a("extra_previous_page_position", "recommend_card").f111445a);
            m97535b(user);
            m97534a(user, "enter_profile", ((C29575j) mo29309o()).f77950c);
            return;
        }
        if (i == C30136a.m98750b()) {
            if (user.getFollowStatus() != 0) {
                i2 = 0;
            }
            UserViewModel p = m97537p();
            C36030i a2 = new C36034a().mo91684a(user.getUid()).mo91686b(user.getSecUid()).mo91682a(i2).mo91688c(m97541t()).mo91685b(12).mo91681a();
            C7573i.m23582a((Object) a2, "FollowPresenter.FollowPa…                 .build()");
            p.mo104547a(a2);
            m97536c(user);
            if (user.getFollowStatus() == 0) {
                str2 = "follow";
            } else {
                str2 = "follow_cancel";
            }
            if (user.getFollowStatus() == 0) {
                m97534a(user, str2, ((C29575j) mo29309o()).f77950c);
            }
        } else if (i == C30136a.m98751c()) {
            m97538q().mo93672a(((C29575j) mo29309o()).f77949b);
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            C10761a.m31409e(view2.getContext(), (int) R.string.tu).mo25750a();
            m97534a(user, "delete", ((C29575j) mo29309o()).f77950c);
        }
    }
}
