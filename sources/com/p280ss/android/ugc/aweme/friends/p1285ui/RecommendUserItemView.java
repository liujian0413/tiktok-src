package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36768y;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView */
public class RecommendUserItemView extends RelativeLayout {

    /* renamed from: b */
    public static final int f79314b = 1;

    /* renamed from: c */
    public static final int f79315c = 2;

    /* renamed from: d */
    public static final int f79316d = 3;

    /* renamed from: e */
    public static final int f79317e = 4;

    /* renamed from: f */
    public static final int f79318f = 5;

    /* renamed from: g */
    public static final C30136a f79319g = new C30136a(null);

    /* renamed from: a */
    public C7563m<? super Integer, ? super String, C7581n> f79320a;

    /* renamed from: h */
    private View f79321h;

    /* renamed from: i */
    private TextView f79322i;

    /* renamed from: j */
    private AvatarImageWithVerify f79323j;

    /* renamed from: k */
    private TextView f79324k;

    /* renamed from: l */
    private FansFollowUserBtn f79325l;

    /* renamed from: m */
    private TextView f79326m;

    /* renamed from: n */
    private View f79327n;

    /* renamed from: o */
    private ImageView f79328o;

    /* renamed from: p */
    private View f79329p;

    /* renamed from: q */
    private RecyclerView f79330q;

    /* renamed from: r */
    private final boolean f79331r;

    /* renamed from: s */
    private int f79332s;

    /* renamed from: t */
    private RelativeUserAvatarListView f79333t;

    /* renamed from: u */
    private LinearLayout f79334u;

    /* renamed from: v */
    private int f79335v;

    /* renamed from: w */
    private C36768y f79336w;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$a */
    public static final class C30136a {
        private C30136a() {
        }

        /* renamed from: a */
        public static int m98749a() {
            return RecommendUserItemView.f79314b;
        }

        /* renamed from: b */
        public static int m98750b() {
            return RecommendUserItemView.f79315c;
        }

        /* renamed from: c */
        public static int m98751c() {
            return RecommendUserItemView.f79316d;
        }

        /* renamed from: d */
        public static int m98752d() {
            return RecommendUserItemView.f79317e;
        }

        /* renamed from: e */
        public static int m98753e() {
            return RecommendUserItemView.f79318f;
        }

        public /* synthetic */ C30136a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$b */
    static final class C30137b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f79337a;

        C30137b(RecommendUserItemView recommendUserItemView) {
            this.f79337a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super Integer, ? super String, C7581n> mVar = this.f79337a.f79320a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C30136a.m98749a()), "click_head");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$c */
    static final class C30138c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f79338a;

        C30138c(RecommendUserItemView recommendUserItemView) {
            this.f79338a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super Integer, ? super String, C7581n> mVar = this.f79338a.f79320a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(0), "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$d */
    static final class C30139d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f79339a;

        C30139d(RecommendUserItemView recommendUserItemView) {
            this.f79339a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super Integer, ? super String, C7581n> mVar = this.f79339a.f79320a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C30136a.m98750b()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$e */
    static final class C30140e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f79340a;

        C30140e(RecommendUserItemView recommendUserItemView) {
            this.f79340a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7563m<? super Integer, ? super String, C7581n> mVar = this.f79340a.f79320a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C30136a.m98751c()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$f */
    static final class C30141f implements C30016a {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f79341a;

        C30141f(RecommendUserItemView recommendUserItemView) {
            this.f79341a = recommendUserItemView;
        }

        /* renamed from: a_ */
        public final void mo76228a_(String str, int i) {
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(str);
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "find_friends").mo18695a());
            C7563m<? super Integer, ? super String, C7581n> mVar = this.f79341a.f79320a;
            if (mVar != null) {
                Integer valueOf = Integer.valueOf(C30136a.m98752d());
                C7573i.m23582a((Object) str, "aid");
                mVar.invoke(valueOf, str);
            }
        }
    }

    /* renamed from: c */
    private void m98744c(User user) {
        C7573i.m23587b(user, "user");
    }

    public int getLayoutResId() {
        return R.layout.a1l;
    }

    /* access modifiers changed from: protected */
    public final AvatarImageWithVerify getMAvatarIv() {
        return this.f79323j;
    }

    /* access modifiers changed from: protected */
    public final ImageView getMBlockUserIv() {
        return this.f79328o;
    }

    /* access modifiers changed from: protected */
    public final TextView getMDescTv() {
        return this.f79326m;
    }

    /* access modifiers changed from: protected */
    public final TextView getMFollowInfoTv() {
        return this.f79324k;
    }

    /* access modifiers changed from: protected */
    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f79325l;
    }

    /* access modifiers changed from: protected */
    public final View getMNewFriendRecommendMask() {
        return this.f79329p;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView getMRecViewRecommendItem() {
        return this.f79330q;
    }

    /* access modifiers changed from: protected */
    public final View getMRemarkEdit() {
        return this.f79327n;
    }

    /* access modifiers changed from: protected */
    public final View getMRootView() {
        return this.f79321h;
    }

    /* access modifiers changed from: protected */
    public final TextView getMUserNameTv() {
        return this.f79322i;
    }

    public final void setAdapterPosition(int i) {
        this.f79332s = i;
    }

    public final void setActionEventListener(C7563m<? super Integer, ? super String, C7581n> mVar) {
        C7573i.m23587b(mVar, "listener");
        this.f79320a = mVar;
    }

    /* access modifiers changed from: protected */
    public final void setMAvatarIv(AvatarImageWithVerify avatarImageWithVerify) {
        C7573i.m23587b(avatarImageWithVerify, "<set-?>");
        this.f79323j = avatarImageWithVerify;
    }

    /* access modifiers changed from: protected */
    public final void setMBlockUserIv(ImageView imageView) {
        C7573i.m23587b(imageView, "<set-?>");
        this.f79328o = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setMDescTv(TextView textView) {
        C7573i.m23587b(textView, "<set-?>");
        this.f79326m = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMFollowInfoTv(TextView textView) {
        C7573i.m23587b(textView, "<set-?>");
        this.f79324k = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        C7573i.m23587b(fansFollowUserBtn, "<set-?>");
        this.f79325l = fansFollowUserBtn;
    }

    /* access modifiers changed from: protected */
    public final void setMNewFriendRecommendMask(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f79329p = view;
    }

    /* access modifiers changed from: protected */
    public final void setMRecViewRecommendItem(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "<set-?>");
        this.f79330q = recyclerView;
    }

    /* access modifiers changed from: protected */
    public final void setMRemarkEdit(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f79327n = view;
    }

    /* access modifiers changed from: protected */
    public final void setMRootView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f79321h = view;
    }

    /* access modifiers changed from: protected */
    public final void setMUserNameTv(TextView textView) {
        C7573i.m23587b(textView, "<set-?>");
        this.f79322i = textView;
    }

    /* renamed from: b */
    public void mo75743b(User user) {
        C7573i.m23587b(user, "user");
        if (!this.f79331r) {
            this.f79328o.setVisibility(8);
        } else if (user.getFollowStatus() == 0) {
            this.f79328o.setVisibility(0);
        } else {
            this.f79328o.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo75741a(User user) {
        C7573i.m23587b(user, "user");
        this.f79321h.setOnClickListener(new C30137b(this));
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f79322i.setText(user.getNickname());
        } else {
            this.f79322i.setText(user.getRemarkName());
        }
        this.f79322i.setOnClickListener(new C30138c(this));
        UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
        this.f79323j.setUserData(userVerify);
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        AbTestModel d = a.mo18803bo();
        C7573i.m23582a((Object) d, "AbTestManager.getInstance().abTestSettingModel");
        if (d.isRecommendItemShowMoreInfo) {
            m98742a(user, this.f79326m);
            m98744c(user);
        } else {
            m98743b(user, this.f79326m);
            mo75740a(this.f79324k, user);
        }
        m98741a(user.getFollowStatus(), user.getFollowerStatus());
        mo75743b(user);
        this.f79325l.setOnClickListener(new C30139d(this));
        mo75742a(user, user.getFollowStatus());
        this.f79328o.setOnClickListener(new C30140e(this));
        if (!C6307b.m19566a((Collection<T>) user.getRecommendAwemeItems())) {
            this.f79330q.setVisibility(0);
            RecommendAwemeAdapter recommendAwemeAdapter = new RecommendAwemeAdapter();
            recommendAwemeAdapter.f78933b = new C30141f(this);
            recommendAwemeAdapter.mo58045a(user.getRecommendAwemeItems());
            recommendAwemeAdapter.f78932a = this.f79332s;
            this.f79330q.setAdapter(recommendAwemeAdapter);
            return;
        }
        this.f79330q.setVisibility(8);
    }

    /* renamed from: a */
    private void m98741a(int i, int i2) {
        if (C43122ff.m136767b()) {
            this.f79325l.setVisibility(8);
        }
        this.f79325l.mo75747a(i, i2);
    }

    /* renamed from: a */
    private void m98742a(User user, TextView textView) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(textView, "textView");
        this.f79333t.setVisibility(0);
        textView.setMaxLines(2);
        m98743b(user, textView);
        this.f79333t.mo76615a(user, textView, false);
    }

    /* renamed from: b */
    private static void m98743b(User user, TextView textView) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(textView, "textView");
        textView.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView.setText(user.getSignature());
        } else if (C6399b.m19944t()) {
            textView.setText(R.string.dun);
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo75740a(TextView textView, User user) {
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(user, "user");
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.fss));
        sb.append(":");
        sb.append(C30537o.m99738a((long) user.getAwemeCount()));
        sb.append("  ");
        sb.append(getContext().getString(R.string.b94));
        sb.append(":");
        sb.append(C30537o.m99738a((long) user.getFollowerCount()));
        textView.setVisibility(0);
        textView.setText(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0.mo18785ax() == 3) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75742a(com.p280ss.android.ugc.aweme.profile.model.User r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
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
            if (r0 != r1) goto L_0x003f
        L_0x0025:
            int r0 = r8.getFollowStatus()
            if (r0 == 0) goto L_0x0038
            android.widget.TextView r3 = r7.f79322i
            android.view.View r4 = r7.f79327n
            java.lang.String r5 = "find_friends"
            r6 = 1
            r1 = r8
            r2 = r9
            com.p280ss.android.ugc.aweme.profile.util.C36694aa.m118343a(r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            android.view.View r8 = r7.f79327n
            r9 = 8
            r8.setVisibility(r9)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView.mo75742a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public RecommendUserItemView(Context context, AttributeSet attributeSet, int i) {
        float b;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        this.f79331r = a.mo18818r();
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…e(getLayoutResId(), this)");
        this.f79321h = inflate;
        setBackground(C10774c.m31449e(context));
        View findViewById = this.f79321h.findViewById(R.id.e7f);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById<T…View>(R.id.txt_user_name)");
        this.f79322i = (TextView) findViewById;
        View findViewById2 = this.f79321h.findViewById(R.id.b64);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById<A…thVerify>(R.id.iv_avatar)");
        this.f79323j = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = this.f79321h.findViewById(R.id.e6q);
        C7573i.m23582a((Object) findViewById3, "mRootView.findViewById<T…ew>(R.id.txt_follow_info)");
        this.f79324k = (TextView) findViewById3;
        View findViewById4 = this.f79321h.findViewById(R.id.q5);
        C7573i.m23582a((Object) findViewById4, "mRootView.findViewById<F…UserBtn>(R.id.btn_follow)");
        this.f79325l = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f79321h.findViewById(R.id.dt5);
        C7573i.m23582a((Object) findViewById5, "mRootView.findViewById<TextView>(R.id.tv_desc)");
        this.f79326m = (TextView) findViewById5;
        View findViewById6 = this.f79321h.findViewById(R.id.b8s);
        C7573i.m23582a((Object) findViewById6, "mRootView.findViewById<View>(R.id.iv_edit_remark)");
        this.f79327n = findViewById6;
        View findViewById7 = this.f79321h.findViewById(R.id.b6m);
        C7573i.m23582a((Object) findViewById7, "mRootView.findViewById<I…(R.id.iv_block_recommend)");
        this.f79328o = (ImageView) findViewById7;
        View findViewById8 = this.f79321h.findViewById(R.id.c3u);
        C7573i.m23582a((Object) findViewById8, "mRootView.findViewById<V…ew_friend_recommend_mask)");
        this.f79329p = findViewById8;
        View findViewById9 = this.f79321h.findViewById(R.id.bnc);
        RecyclerView recyclerView = (RecyclerView) findViewById9;
        recyclerView.mo5525a((C1272h) new DividerItemDecoration(0, (int) C9738o.m28708b(context, 4.0f), 0));
        recyclerView.setLayoutManager(new RecommendUserItemView$$special$$inlined$apply$lambda$1(context, 0, false, context));
        C7573i.m23582a((Object) findViewById9, "mRootView.findViewById<R…}\n            }\n        }");
        this.f79330q = recyclerView;
        View findViewById10 = this.f79321h.findViewById(R.id.crf);
        C7573i.m23582a((Object) findViewById10, "mRootView.findViewById(R.id.relative_user_avatar)");
        this.f79333t = (RelativeUserAvatarListView) findViewById10;
        View findViewById11 = this.f79321h.findViewById(R.id.dg3);
        C7573i.m23582a((Object) findViewById11, "mRootView.findViewById(R.id.tag_layout)");
        this.f79334u = (LinearLayout) findViewById11;
        int a2 = C9738o.m28691a(this.f79321h.getContext());
        if (this.f79331r) {
            b = C9738o.m28708b(this.f79321h.getContext(), 210.0f);
        } else {
            b = C9738o.m28708b(this.f79321h.getContext(), 185.0f);
        }
        this.f79335v = a2 - ((int) b);
        this.f79336w = new C36769z(this.f79334u, this.f79335v);
    }

    public /* synthetic */ RecommendUserItemView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
