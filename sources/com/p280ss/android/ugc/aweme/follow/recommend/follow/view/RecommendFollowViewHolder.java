package com.p280ss.android.ugc.aweme.follow.recommend.follow.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.C29538a.C29539a;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.C29542b;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderViewModel;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.p1285ui.FansFollowUserBtn;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36030i;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36697a;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.user.repository.UserState;
import com.p280ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder */
public final class RecommendFollowViewHolder extends JediBaseViewHolder<RecommendFollowViewHolder, C29480e> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f77780g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendFollowViewHolder.class), "hostViewModel", "getHostViewModel()Lcom/ss/android/ugc/aweme/follow/recommend/follow/viewModel/RecommendFollowViewModel;"))};

    /* renamed from: j */
    public static final C29504b f77781j = new C29504b(null);

    /* renamed from: A */
    private final View f77782A;

    /* renamed from: B */
    private final View[] f77783B;

    /* renamed from: C */
    private int f77784C;

    /* renamed from: k */
    private final C7541d f77785k;

    /* renamed from: l */
    private final CircleImageView f77786l;

    /* renamed from: m */
    private final AutoRTLImageView f77787m;

    /* renamed from: n */
    private final TextView f77788n;

    /* renamed from: o */
    private final TextView f77789o;

    /* renamed from: p */
    private final ImageView f77790p;

    /* renamed from: q */
    private final FansFollowUserBtn f77791q;

    /* renamed from: r */
    private final LinearLayout f77792r;

    /* renamed from: s */
    private final C36769z f77793s = new C36769z(this.f77792r);

    /* renamed from: t */
    private final LinearLayout f77794t = ((LinearLayout) this.itemView.findViewById(R.id.br1));

    /* renamed from: u */
    private final RemoteImageView f77795u;

    /* renamed from: v */
    private final RemoteImageView f77796v;

    /* renamed from: w */
    private final RemoteImageView f77797w;

    /* renamed from: x */
    private final RemoteImageView[] f77798x;

    /* renamed from: y */
    private final View f77799y;

    /* renamed from: z */
    private final View f77800z;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$a */
    static final class C29502a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f77804a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f77805b;

        /* renamed from: c */
        final /* synthetic */ RecommendFollowViewHolder f77806c;

        C29502a(int i, RemoteImageView remoteImageView, RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f77804a = i;
            this.f77805b = remoteImageView;
            this.f77806c = recommendFollowViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                View view2 = this.f77806c.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                if (!C29512b.m97024a(view2.getContext())) {
                    View view3 = this.f77806c.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    C10761a.m31399c(view3.getContext(), (int) R.string.cjs).mo25750a();
                } else if (this.f77804a < ((C29480e) this.f77806c.mo29309o()).f77739b.size()) {
                    this.f77806c.mo29066a(this.f77806c.mo69906r(), (C7562b<? super S1, ? extends R>) new C7562b<RecommendFollowState, C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C29502a f77807a;

                        {
                            this.f77807a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            m97017a((RecommendFollowState) obj);
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m97017a(RecommendFollowState recommendFollowState) {
                            C7573i.m23587b(recommendFollowState, "state");
                            RecommendFollowViewModel r = this.f77807a.f77806c.mo69906r();
                            RecommendList recommendList = new RecommendList();
                            recommendList.setLogPb(((C29542b) recommendFollowState.getListState().getPayload()).f77851c);
                            recommendList.setCursor(((C29542b) recommendFollowState.getListState().getPayload()).f31255b);
                            recommendList.setHasMore(((C29542b) recommendFollowState.getListState().getPayload()).f31254a.f31214a);
                            recommendList.setRecommendFollowList(recommendFollowState.getListState().getList());
                            RecommendList clone = recommendList.clone();
                            C7573i.m23582a((Object) clone, "RecommendList().apply {\n…                }.clone()");
                            C28503s.m93679a((C25673a) C29539a.m97062a(r, clone));
                            View view = this.f77807a.f77806c.itemView;
                            C7573i.m23582a((Object) view, "itemView");
                            DetailActivity.m86052a(view.getContext(), ((Aweme) ((C29480e) this.f77807a.f77806c.mo29309o()).f77739b.get(this.f77807a.f77804a)).getAid(), "potential_friends", "potential_friends", ((Aweme) ((C29480e) this.f77807a.f77806c.mo29309o()).f77739b.get(this.f77807a.f77804a)).getEnterpriseType(), 17, this.f77807a.f77805b);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$b */
    public static final class C29504b {
        private C29504b() {
        }

        public /* synthetic */ C29504b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$c */
    public static final class C29505c implements C36697a {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f77808a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$c$a */
        static final class C29506a extends Lambda implements C7562b<RecommendFollowViewHolderState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ String f77809a;

            C29506a(String str) {
                this.f77809a = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m97019a((RecommendFollowViewHolderState) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m97019a(RecommendFollowViewHolderState recommendFollowViewHolderState) {
                C7573i.m23587b(recommendFollowViewHolderState, "state");
                if (!C6307b.m19566a((Collection<T>) recommendFollowViewHolderState.getAwemeList())) {
                    for (Aweme author : recommendFollowViewHolderState.getAwemeList()) {
                        User author2 = author.getAuthor();
                        C7573i.m23582a((Object) author2, "aweme.author");
                        author2.setRemarkName(this.f77809a);
                    }
                }
            }
        }

        C29505c(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f77808a = recommendFollowViewHolder;
        }

        /* renamed from: a */
        public final void mo75509a(String str) {
            this.f77808a.mo29066a(this.f77808a.mo69905q(), (C7562b<? super S1, ? extends R>) new C29506a<Object,Object>(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$d */
    static final class C29507d extends Lambda implements C7562b<RecommendFollowViewHolderState, RecommendFollowViewHolderState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f77810a;

        C29507d(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f77810a = recommendFollowViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendFollowViewHolderState invoke(RecommendFollowViewHolderState recommendFollowViewHolderState) {
            C7573i.m23587b(recommendFollowViewHolderState, "$receiver");
            return recommendFollowViewHolderState.copy(((C29480e) this.f77810a.mo29309o()).f77739b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$e */
    static final class C29508e extends Lambda implements C7563m<RecommendFollowViewHolder, List<? extends Aweme>, C7581n> {

        /* renamed from: a */
        public static final C29508e f77811a = new C29508e();

        C29508e() {
            super(2);
        }

        /* renamed from: a */
        private static void m97021a(RecommendFollowViewHolder recommendFollowViewHolder, List<? extends Aweme> list) {
            C7573i.m23587b(recommendFollowViewHolder, "$receiver");
            C7573i.m23587b(list, "list");
            recommendFollowViewHolder.mo75504b(list);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97021a((RecommendFollowViewHolder) obj, (List) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$f */
    static final class C29509f extends Lambda implements C7563m<RecommendFollowViewHolder, User, C7581n> {

        /* renamed from: a */
        public static final C29509f f77812a = new C29509f();

        C29509f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97022a((RecommendFollowViewHolder) obj, (User) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m97022a(RecommendFollowViewHolder recommendFollowViewHolder, User user) {
            C7573i.m23587b(recommendFollowViewHolder, "$receiver");
            C7573i.m23587b(user, "user");
            for (Aweme author : ((C29480e) recommendFollowViewHolder.mo29309o()).f77739b) {
                author.setAuthor(user.clone());
            }
            recommendFollowViewHolder.mo75503a(user);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$g */
    static final class C29510g extends Lambda implements C7562b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f77813a;

        C29510g(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f77813a = recommendFollowViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UserState invoke(UserState userState) {
            C7573i.m23587b(userState, "$receiver");
            return UserState.copy$default(userState, ((C29480e) this.f77813a.mo29309o()).f77740c, false, null, null, 14, null);
        }
    }

    /* renamed from: r */
    public final RecommendFollowViewModel mo69906r() {
        return (RecommendFollowViewModel) this.f77785k.getValue();
    }

    public final void bA_() {
        super.bA_();
        mo29062a(mo69905q(), C29513c.f77815a, C11640h.m34110a(), C29508e.f77811a);
        mo29062a(mo62390p(), C29514d.f77816a, C11640h.m34110a(), C29509f.f77812a);
        m97007a(((C29480e) mo29309o()).f77740c, "impression", ((C29480e) mo29309o()).f77741d);
        C34202f.m110435a().mo86948a(11, ((C29480e) mo29309o()).f77740c.getUid());
    }

    /* renamed from: p */
    public final UserViewModel mo62390p() {
        C7562b gVar = new C29510g(this);
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
            jediViewModel.mo29034a(gVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: q */
    public final RecommendFollowViewHolderViewModel mo69905q() {
        C7562b dVar = new C29507d(this);
        Class<RecommendFollowViewHolderViewModel> cls = RecommendFollowViewHolderViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(RecommendFollowViewHolderViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(dVar);
            return (RecommendFollowViewHolderViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: d */
    private final void m97011d(User user) {
        if (user.getFollowStatus() == 0) {
            this.f77790p.setVisibility(0);
        } else {
            this.f77790p.setVisibility(4);
        }
    }

    /* renamed from: b */
    public static void m97009b(User user) {
        new C33276r().mo85322o(user.getUid()).mo85310b("potential_friends").mo85319i("homepage_hot").mo85318g("1044").mo85252e();
    }

    /* renamed from: c */
    public static void m97010c(User user) {
        String str;
        String str2;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        C33280v c = new C33280v(str).mo85345e("homepage_hot").mo85341b("potential_friends").mo85343c("follow_button");
        if (user.getFollowStatus() == 0) {
            str2 = "1007";
        } else {
            str2 = "1036";
        }
        c.mo85340a(str2).mo85348g(user.getUid()).mo85252e();
    }

    public RecommendFollowViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1h, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…r,\n        parent, false)");
        super(inflate);
        C7584c a = C7575l.m23595a(RecommendFollowViewModel.class);
        this.f77785k = C7546e.m23569a(new RecommendFollowViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
        View findViewById = this.itemView.findViewById(R.id.w8);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.civ_avatar)");
        this.f77786l = (CircleImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.b8s);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_edit_remark)");
        this.f77787m = (AutoRTLImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.dyk);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.tv_nickname)");
        this.f77788n = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.e0c);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_recommend_reason)");
        this.f77789o = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.b8a);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.iv_delete)");
        this.f77790p = (ImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.pd);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.bt_follow)");
        this.f77791q = (FansFollowUserBtn) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bsn);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.ll_tag)");
        this.f77792r = (LinearLayout) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.b7y);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.iv_cover1)");
        this.f77795u = (RemoteImageView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.b7z);
        C7573i.m23582a((Object) findViewById9, "itemView.findViewById(R.id.iv_cover2)");
        this.f77796v = (RemoteImageView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.b80);
        C7573i.m23582a((Object) findViewById10, "itemView.findViewById(R.id.iv_cover3)");
        this.f77797w = (RemoteImageView) findViewById10;
        this.f77798x = new RemoteImageView[]{this.f77795u, this.f77796v, this.f77797w};
        View findViewById11 = this.itemView.findViewById(R.id.dg6);
        C7573i.m23582a((Object) findViewById11, "itemView.findViewById(R.id.tag_photo1)");
        this.f77799y = findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.dg7);
        C7573i.m23582a((Object) findViewById12, "itemView.findViewById(R.id.tag_photo2)");
        this.f77800z = findViewById12;
        View findViewById13 = this.itemView.findViewById(R.id.dg8);
        C7573i.m23582a((Object) findViewById13, "itemView.findViewById(R.id.tag_photo3)");
        this.f77782A = findViewById13;
        this.f77783B = new View[]{this.f77799y, this.f77800z, this.f77782A};
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f77801a;

            {
                this.f77801a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    View view2 = this.f77801a.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    UserProfileActivity.m117386a(view2.getContext(), C42914ab.m136242a().mo104633a("uid", ((C29480e) this.f77801a.mo29309o()).f77740c.getUid()).mo104630a("from_recommend_card", 1).mo104633a("sec_user_id", ((C29480e) this.f77801a.mo29309o()).f77740c.getSecUid()).mo104633a("enter_from_request_id", ((C29480e) this.f77801a.mo29309o()).f77740c.getRequestId()).mo104633a("extra_previous_page_position", "potential_friends").mo104633a("enter_from", "potential_friends").mo104633a("previous_recommend_reason", ((C29480e) this.f77801a.mo29309o()).f77740c.getRecommendReason()).f111445a);
                    RecommendFollowViewHolder.m97009b(((C29480e) this.f77801a.mo29309o()).f77740c);
                    RecommendFollowViewHolder.m97007a(((C29480e) this.f77801a.mo29309o()).f77740c, "enter_profile", ((C29480e) this.f77801a.mo29309o()).f77741d);
                }
            }
        });
        this.f77790p.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f77802a;

            {
                this.f77802a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f77802a.mo69906r().mo75535a(((C29480e) this.f77802a.mo29309o()).f77738a);
                RecommendFollowViewHolder.m97007a(((C29480e) this.f77802a.mo29309o()).f77740c, "delete", ((C29480e) this.f77802a.mo29309o()).f77741d);
            }
        });
        this.f77791q.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f77803a;

            {
                this.f77803a = r1;
            }

            public final void onClick(View view) {
                int i;
                String str;
                ClickInstrumentation.onClick(view);
                if (((C29480e) this.f77803a.mo29309o()).f77740c.getFollowStatus() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                UserViewModel p = this.f77803a.mo62390p();
                C36030i a = new C36034a().mo91684a(((C29480e) this.f77803a.mo29309o()).f77738a).mo91686b(((C29480e) this.f77803a.mo29309o()).f77740c.getSecUid()).mo91682a(i).mo91688c("common_relation").mo91685b(12).mo91681a();
                C7573i.m23582a((Object) a, "FollowPresenter.FollowPa…                 .build()");
                p.mo104547a(a);
                RecommendFollowViewHolder.m97010c(((C29480e) this.f77803a.mo29309o()).f77740c);
                if (((C29480e) this.f77803a.mo29309o()).f77740c.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                RecommendFollowViewHolder.m97007a(((C29480e) this.f77803a.mo29309o()).f77740c, str, ((C29480e) this.f77803a.mo29309o()).f77741d);
            }
        });
        RemoteImageView[] remoteImageViewArr = this.f77798x;
        int length = remoteImageViewArr.length;
        int i2 = 0;
        while (i < length) {
            RemoteImageView remoteImageView = remoteImageViewArr[i];
            int i3 = i2 + 1;
            remoteImageView.setOnClickListener(new C29502a(i2, remoteImageView, this));
            i++;
            i2 = i3;
        }
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        int a2 = C9738o.m28691a(view.getContext());
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        this.f77784C = a2 - ((int) C9738o.m28708b(view2.getContext(), 210.0f));
    }

    /* renamed from: a */
    private final void m97008a(View... viewArr) {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        int a = C9738o.m28691a(view.getContext());
        LinearLayout linearLayout = this.f77794t;
        C7573i.m23582a((Object) linearLayout, "coverContainer");
        int paddingStart = a - linearLayout.getPaddingStart();
        LinearLayout linearLayout2 = this.f77794t;
        C7573i.m23582a((Object) linearLayout2, "coverContainer");
        float paddingEnd = (float) (paddingStart - linearLayout2.getPaddingEnd());
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        float b = (((paddingEnd - (C9738o.m28708b(view2.getContext(), 1.0f) * 2.0f)) / 3.0f) * 4.0f) / 3.0f;
        for (View layoutParams : viewArr) {
            layoutParams.getLayoutParams().height = (int) b;
        }
    }

    /* renamed from: a */
    public final void mo75503a(User user) {
        if (TextUtils.isEmpty(user.getRemarkName()) || user.getFollowStatus() == 0) {
            this.f77788n.setText(user.getNickname());
        } else {
            this.f77788n.setText(user.getRemarkName());
        }
        this.f77786l.mo60860a(user.getAvatarThumb());
        C23323e.m76509a((RemoteImageView) this.f77786l, user.getAvatarThumb(), this.f77786l.getControllerListener());
        this.f77791q.setFollowStatus(user.getFollowStatus());
        m97006a(user, user.getFollowStatus());
        m97011d(user);
        if (TextUtils.isEmpty(user.getRecommendReason())) {
            this.f77789o.setVisibility(8);
        } else {
            this.f77789o.setText(user.getRecommendReason());
        }
    }

    /* renamed from: b */
    public final void mo75504b(List<? extends Aweme> list) {
        if (list == null || list.isEmpty()) {
            LinearLayout linearLayout = this.f77794t;
            C7573i.m23582a((Object) linearLayout, "coverContainer");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = this.f77794t;
        C7573i.m23582a((Object) linearLayout2, "coverContainer");
        linearLayout2.setVisibility(0);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        float b = C9738o.m28708b(view.getContext(), 2.0f);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        RoundingParams b2 = RoundingParams.m39400b(b, 0.0f, 0.0f, C9738o.m28708b(view2.getContext(), 2.0f));
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        float b3 = C9738o.m28708b(view3.getContext(), 2.0f);
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        RoundingParams b4 = RoundingParams.m39400b(0.0f, b3, C9738o.m28708b(view4.getContext(), 2.0f), 0.0f);
        switch (list.size()) {
            case 1:
                RemoteImageView remoteImageView = this.f77795u;
                View view5 = this.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                C13439b bVar = new C13439b(view5.getResources());
                View view6 = this.itemView;
                C7573i.m23582a((Object) view6, "itemView");
                float b5 = C9738o.m28708b(view6.getContext(), 2.0f);
                View view7 = this.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                float b6 = C9738o.m28708b(view7.getContext(), 2.0f);
                View view8 = this.itemView;
                C7573i.m23582a((Object) view8, "itemView");
                float b7 = C9738o.m28708b(view8.getContext(), 2.0f);
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                remoteImageView.setHierarchy(bVar.mo32915a(RoundingParams.m39400b(b5, b6, b7, C9738o.m28708b(view9.getContext(), 2.0f))).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                m97008a(this.f77795u);
                this.f77795u.setVisibility(0);
                this.f77796v.setVisibility(8);
                this.f77797w.setVisibility(8);
                break;
            case 2:
                RemoteImageView remoteImageView2 = this.f77795u;
                View view10 = this.itemView;
                C7573i.m23582a((Object) view10, "itemView");
                remoteImageView2.setHierarchy(new C13439b(view10.getResources()).mo32915a(b2).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                RemoteImageView remoteImageView3 = this.f77796v;
                View view11 = this.itemView;
                C7573i.m23582a((Object) view11, "itemView");
                remoteImageView3.setHierarchy(new C13439b(view11.getResources()).mo32915a(b4).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                m97008a(this.f77795u, this.f77796v);
                this.f77795u.setVisibility(0);
                this.f77796v.setVisibility(0);
                this.f77797w.setVisibility(8);
                break;
            case 3:
                RemoteImageView remoteImageView4 = this.f77795u;
                View view12 = this.itemView;
                C7573i.m23582a((Object) view12, "itemView");
                remoteImageView4.setHierarchy(new C13439b(view12.getResources()).mo32915a(b2).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                RemoteImageView remoteImageView5 = this.f77796v;
                View view13 = this.itemView;
                C7573i.m23582a((Object) view13, "itemView");
                remoteImageView5.setHierarchy(new C13439b(view13.getResources()).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                RemoteImageView remoteImageView6 = this.f77797w;
                View view14 = this.itemView;
                C7573i.m23582a((Object) view14, "itemView");
                remoteImageView6.setHierarchy(new C13439b(view14.getResources()).mo32915a(b4).mo32917b((int) R.color.a5w).mo32923d((int) R.color.a5w).mo32908a());
                m97008a(this.f77795u, this.f77796v, this.f77797w);
                this.f77795u.setVisibility(0);
                this.f77796v.setVisibility(0);
                this.f77797w.setVisibility(0);
                break;
        }
        this.f77799y.setVisibility(8);
        this.f77800z.setVisibility(8);
        this.f77782A.setVisibility(8);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            Aweme aweme = (Aweme) next;
            if (aweme.isImage()) {
                this.f77783B[i].setVisibility(0);
                RemoteImageView remoteImageView7 = this.f77798x[i];
                Object obj = aweme.getImageInfos().get(0);
                C7573i.m23582a(obj, "imageInfos[0]");
                C23323e.m76524b(remoteImageView7, ((ImageInfo) obj).getLabelThumb());
            } else {
                this.f77783B[i].setVisibility(8);
                RemoteImageView remoteImageView8 = this.f77798x[i];
                Video video = aweme.getVideo();
                C7573i.m23582a((Object) video, "video");
                C23323e.m76524b(remoteImageView8, video.getCover());
            }
            i = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0.mo18785ax() == 3) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m97006a(com.p280ss.android.ugc.aweme.profile.model.User r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.mo18785ax()
            r1 = 2
            if (r0 == r1) goto L_0x0025
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.mo18785ax()
            r1 = 3
            if (r0 != r1) goto L_0x004b
        L_0x0025:
            int r0 = r10.getFollowStatus()
            if (r0 == 0) goto L_0x0044
            android.widget.TextView r3 = r9.f77788n
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r9.f77787m
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            r5 = 0
            java.lang.String r6 = "find_friends"
            r7 = 1
            com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$c r0 = new com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$c
            r0.<init>(r9)
            r8 = r0
            com.ss.android.ugc.aweme.profile.util.aa$a r8 = (com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36697a) r8
            r1 = r10
            r2 = r11
            com.p280ss.android.ugc.aweme.profile.util.C36694aa.m118345a(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0044:
            com.ss.android.ugc.aweme.views.AutoRTLImageView r10 = r9.f77787m
            r11 = 8
            r10.setVisibility(r11)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder.m97006a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* renamed from: a */
    public static void m97007a(User user, String str, int i) {
        new C33238ak(null, 1, null).mo85095a(user.getUid()).mo85097b("potential_friends").mo85098c(str).mo85093a(i).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason()).mo85101f("total").mo85102g("nonempty").mo85103i("1007").mo85252e();
    }
}
