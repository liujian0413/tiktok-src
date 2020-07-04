package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29552a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.friends.p1285ui.FansFollowUserBtn;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RelativeUserAvatarListView;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36768y;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV1 */
public class RecommendCommonUserViewHolderV1 extends BaseRecommendUserViewHolder {

    /* renamed from: c */
    public static final C37155a f97214c = new C37155a(null);

    /* renamed from: b */
    public User f97215b;

    /* renamed from: d */
    private final AvatarImageWithVerify f97216d = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.b64));

    /* renamed from: e */
    private final DmtTextView f97217e = ((DmtTextView) this.itemView.findViewById(R.id.e7f));

    /* renamed from: f */
    private final AutoRTLImageView f97218f = ((AutoRTLImageView) this.itemView.findViewById(R.id.b8s));

    /* renamed from: g */
    private final ImageView f97219g = ((ImageView) this.itemView.findViewById(R.id.b8k));

    /* renamed from: h */
    private final FansFollowUserBtn f97220h = ((FansFollowUserBtn) this.itemView.findViewById(R.id.q5));

    /* renamed from: i */
    private final DmtTextView f97221i = ((DmtTextView) this.itemView.findViewById(R.id.dt5));

    /* renamed from: j */
    private final LinearLayout f97222j = ((LinearLayout) this.itemView.findViewById(R.id.dg3));

    /* renamed from: k */
    private final RelativeUserAvatarListView f97223k = ((RelativeUserAvatarListView) this.itemView.findViewById(R.id.crf));

    /* renamed from: l */
    private int f97224l = (C9738o.m28691a(mo93619a()) - ((int) C9738o.m28708b(mo93619a(), 210.0f)));

    /* renamed from: m */
    private C36768y f97225m = new C36769z(this.f97222j, this.f97224l);

    /* renamed from: n */
    private C29548a f97226n = new C29548a(this.f97220h, new C29556e(this) {

        /* renamed from: a */
        final /* synthetic */ RecommendCommonUserViewHolderV1 f97227a;

        {
            this.f97227a = r1;
        }

        /* renamed from: a */
        public final void mo67853a(int i, User user) {
            super.mo67853a(i, user);
            if (i != 0) {
                this.f97227a.mo93621a(this.f97227a.f97215b, "follow", this.f97227a.getAdapterPosition());
            }
            this.f97227a.mo93624b(this.f97227a.f97215b);
            DataCenter dataCenter = this.f97227a.f97187a;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_click_follow", (Object) Integer.valueOf(i));
            }
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV1$a */
    public static final class C37155a {
        private C37155a() {
        }

        public /* synthetic */ C37155a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV1$b */
    static final class C37156b implements C29552a {

        /* renamed from: a */
        final /* synthetic */ RecommendCommonUserViewHolderV1 f97231a;

        /* renamed from: b */
        final /* synthetic */ User f97232b;

        C37156b(RecommendCommonUserViewHolderV1 recommendCommonUserViewHolderV1, User user) {
            this.f97231a = recommendCommonUserViewHolderV1;
            this.f97232b = user;
        }

        /* renamed from: a */
        public final void mo68102a(FollowStatus followStatus) {
            RecommendCommonUserViewHolderV1 recommendCommonUserViewHolderV1 = this.f97231a;
            User user = this.f97232b;
            C7573i.m23582a((Object) followStatus, "followStatus");
            recommendCommonUserViewHolderV1.mo93639a(user, followStatus.followStatus);
        }
    }

    /* renamed from: b */
    public final int mo93623b() {
        return R.layout.a1r;
    }

    /* renamed from: e */
    public final void mo93628e() {
        super.mo93628e();
        mo93621a(this.f97215b, "impression", getAdapterPosition());
    }

    /* renamed from: e */
    private void m119434e(User user) {
        boolean z;
        C7573i.m23587b(user, "user");
        CharSequence remarkName = user.getRemarkName();
        if (remarkName == null || remarkName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtTextView dmtTextView = this.f97217e;
            C7573i.m23582a((Object) dmtTextView, "mUserNameTv");
            dmtTextView.setText(user.getNickname());
            return;
        }
        DmtTextView dmtTextView2 = this.f97217e;
        C7573i.m23582a((Object) dmtTextView2, "mUserNameTv");
        dmtTextView2.setText(user.getRemarkName());
    }

    /* renamed from: f */
    private final void m119435f(User user) {
        if (C43122ff.m136767b()) {
            FansFollowUserBtn fansFollowUserBtn = this.f97220h;
            C7573i.m23582a((Object) fansFollowUserBtn, "mFollowBtn");
            fansFollowUserBtn.setVisibility(8);
        }
        this.f97226n.mo75558a(user);
        this.f97226n.f77866c = new C37156b(this, user);
        this.f97220h.mo75747a(user.getFollowStatus(), user.getFollowerStatus());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo93633a(User user) {
        if (user != null) {
            this.f97215b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f97216d.setUserData(userVerify);
            m119434e(user);
            m119435f(user);
            mo93639a(user, user.getFollowStatus());
            DmtTextView dmtTextView = this.f97221i;
            C7573i.m23582a((Object) dmtTextView, "mDesTv");
            m119431a(user, (TextView) dmtTextView);
        }
    }

    public RecommendCommonUserViewHolderV1(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup);
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV1 f97228a;

            {
                this.f97228a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97228a.mo93626c(this.f97228a.f97215b);
                this.f97228a.mo93620a(this.f97228a.f97215b);
                this.f97228a.mo93621a(this.f97228a.f97215b, "enter_profile", this.f97228a.getAdapterPosition());
                DataCenter dataCenter = this.f97228a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_item", (Object) "");
                }
            }
        });
        this.f97216d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV1 f97229a;

            {
                this.f97229a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97229a.mo93626c(this.f97229a.f97215b);
                this.f97229a.mo93620a(this.f97229a.f97215b);
                this.f97229a.mo93621a(this.f97229a.f97215b, "enter_profile", this.f97229a.getAdapterPosition());
                DataCenter dataCenter = this.f97229a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_head", (Object) "");
                }
            }
        });
        this.f97219g.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV1 f97230a;

            {
                this.f97230a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String str = null;
                this.f97230a.mo93622a(this.f97230a.f97215b, true);
                this.f97230a.mo93621a(this.f97230a.f97215b, "delete", this.f97230a.getAdapterPosition());
                DataCenter dataCenter = this.f97230a.f97187a;
                if (dataCenter != null) {
                    String str2 = "action_click_dislike";
                    User user = this.f97230a.f97215b;
                    if (user != null) {
                        str = user.getUid();
                    }
                    dataCenter.mo60134a(str2, (Object) str);
                }
            }
        });
    }

    /* renamed from: a */
    private final void m119431a(User user, TextView textView) {
        RelativeUserAvatarListView relativeUserAvatarListView = this.f97223k;
        C7573i.m23582a((Object) relativeUserAvatarListView, "mRelativeUserAvatars");
        relativeUserAvatarListView.setVisibility(0);
        textView.setMaxLines(2);
        m119432b(user, textView);
        this.f97223k.mo76615a(user, textView, false);
    }

    /* renamed from: b */
    private static void m119432b(User user, TextView textView) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0.mo18785ax() == 3) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93639a(com.p280ss.android.ugc.aweme.profile.model.User r8, int r9) {
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
            if (r0 != r1) goto L_0x0049
        L_0x0025:
            int r0 = r8.getFollowStatus()
            if (r0 == 0) goto L_0x003e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f97217e
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r7.f97218f
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "find_friends"
            r6 = 1
            r1 = r8
            r2 = r9
            com.p280ss.android.ugc.aweme.profile.util.C36694aa.m118343a(r1, r2, r3, r4, r5, r6)
            goto L_0x0049
        L_0x003e:
            com.ss.android.ugc.aweme.views.AutoRTLImageView r9 = r7.f97218f
            if (r9 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.views.AutoRTLImageView r9 = r7.f97218f
            r0 = 8
            r9.setVisibility(r0)
        L_0x0049:
            int r8 = r8.getFollowStatus()
            if (r8 != 0) goto L_0x005b
            android.widget.ImageView r8 = r7.f97219g
            java.lang.String r9 = "mDislikeIv"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r9 = 0
            r8.setVisibility(r9)
            return
        L_0x005b:
            android.widget.ImageView r8 = r7.f97219g
            java.lang.String r9 = "mDislikeIv"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r9 = 4
            r8.setVisibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV1.mo93639a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* renamed from: a */
    public final void mo93621a(User user, String str, int i) {
        C7573i.m23587b(str, "eventType");
        if (user != null) {
            C33238ak e = new C33238ak(null, 1, null).mo85098c(str).mo85095a(user.getUid()).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason());
            DataCenter dataCenter = this.f97187a;
            if (dataCenter != null) {
                dataCenter.mo60134a("key_recommend_user_event", (Object) e);
            }
        }
    }
}
