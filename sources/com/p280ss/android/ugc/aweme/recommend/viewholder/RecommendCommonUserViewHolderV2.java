package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29552a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29553b;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.friends.p1285ui.FansFollowUserBtn;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36768y;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.recommend.C37126a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV2 */
public class RecommendCommonUserViewHolderV2 extends BaseRecommendUserViewHolder {

    /* renamed from: e */
    public static final C37162a f97233e = new C37162a(null);

    /* renamed from: b */
    public final FansFollowUserBtn f97234b = ((FansFollowUserBtn) this.itemView.findViewById(R.id.q5));

    /* renamed from: c */
    public final DmtTextView f97235c = ((DmtTextView) this.itemView.findViewById(R.id.q1));

    /* renamed from: d */
    public User f97236d;

    /* renamed from: f */
    private final AvatarImageWithVerify f97237f = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.b64));

    /* renamed from: g */
    private final DmtTextView f97238g = ((DmtTextView) this.itemView.findViewById(R.id.e7f));

    /* renamed from: h */
    private final AutoRTLImageView f97239h = ((AutoRTLImageView) this.itemView.findViewById(R.id.b8s));

    /* renamed from: i */
    private final LinearLayout f97240i = ((LinearLayout) this.itemView.findViewById(R.id.dg3));

    /* renamed from: j */
    private final DmtTextView f97241j = ((DmtTextView) this.itemView.findViewById(R.id.dt5));

    /* renamed from: k */
    private final ImageView f97242k = ((ImageView) this.itemView.findViewById(R.id.a9o));

    /* renamed from: l */
    private int f97243l = (C9738o.m28691a(mo93619a()) - ((int) C9738o.m28708b(mo93619a(), 246.0f)));

    /* renamed from: m */
    private C36768y f97244m = new C36769z(this.f97240i, this.f97243l);

    /* renamed from: n */
    private C29548a f97245n;

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV2$a */
    public static final class C37162a {
        private C37162a() {
        }

        public /* synthetic */ C37162a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV2$b */
    static final class C37163b implements C29552a {

        /* renamed from: a */
        final /* synthetic */ RecommendCommonUserViewHolderV2 f97251a;

        /* renamed from: b */
        final /* synthetic */ User f97252b;

        C37163b(RecommendCommonUserViewHolderV2 recommendCommonUserViewHolderV2, User user) {
            this.f97251a = recommendCommonUserViewHolderV2;
            this.f97252b = user;
        }

        /* renamed from: a */
        public final void mo68102a(FollowStatus followStatus) {
            RecommendCommonUserViewHolderV2 recommendCommonUserViewHolderV2 = this.f97251a;
            User user = this.f97252b;
            C7573i.m23582a((Object) followStatus, "followStatus");
            recommendCommonUserViewHolderV2.mo93644a(user, followStatus.followStatus);
        }
    }

    /* renamed from: b */
    public int mo93623b() {
        return R.layout.a1s;
    }

    /* renamed from: g */
    public boolean mo93634g() {
        return true;
    }

    /* renamed from: c */
    public final void mo93625c() {
        ImageView imageView = this.f97242k;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo93627d() {
        ImageView imageView = this.f97242k;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo93628e() {
        super.mo93628e();
        mo93621a(this.f97236d, "impression", getAdapterPosition());
    }

    public RecommendCommonUserViewHolderV2(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup);
        this.f97234b.setTextSize(14.0f);
        FansFollowUserBtn fansFollowUserBtn = this.f97234b;
        Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
        C7573i.m23582a((Object) defaultFromStyle, "Typeface.defaultFromStyle(Typeface.BOLD)");
        fansFollowUserBtn.setTypeface(defaultFromStyle);
        this.f97245n = new C29548a(this.f97234b, new C29556e(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV2 f97246a;

            {
                this.f97246a = r1;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                super.mo67853a(i, user);
                User user2 = this.f97246a.f97236d;
                if (user2 != null) {
                    if (i != 0) {
                        this.f97246a.mo93621a(this.f97246a.f97236d, "follow", this.f97246a.getAdapterPosition());
                        Context a = this.f97246a.mo93619a();
                        FansFollowUserBtn fansFollowUserBtn = this.f97246a.f97234b;
                        C7573i.m23582a((Object) fansFollowUserBtn, "mFollowBtn");
                        DmtTextView dmtTextView = this.f97246a.f97235c;
                        C7573i.m23582a((Object) dmtTextView, "mDislikeBtn");
                        C37126a.m119349a(a, fansFollowUserBtn, dmtTextView, i, user2.getFollowerStatus());
                    } else {
                        Context a2 = this.f97246a.mo93619a();
                        FansFollowUserBtn fansFollowUserBtn2 = this.f97246a.f97234b;
                        C7573i.m23582a((Object) fansFollowUserBtn2, "mFollowBtn");
                        DmtTextView dmtTextView2 = this.f97246a.f97235c;
                        C7573i.m23582a((Object) dmtTextView2, "mDislikeBtn");
                        C37126a.m119350b(a2, fansFollowUserBtn2, dmtTextView2, i, user2.getFollowerStatus());
                    }
                    this.f97246a.mo93624b(user2);
                }
                DataCenter dataCenter = this.f97246a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_follow", (Object) Integer.valueOf(i));
                }
            }
        });
        this.f97245n.f77867d = new C29553b(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV2 f97247a;

            {
                this.f97247a = r1;
            }

            /* renamed from: a */
            public final void mo75564a(FollowStatus followStatus) {
                C7573i.m23587b(followStatus, "followStatus");
                User user = this.f97247a.f97236d;
                if (user != null) {
                    user.setFollowStatus(followStatus.followStatus);
                    user.setFollowerStatus(followStatus.followerStatus);
                    RecommendCommonUserViewHolderV2 recommendCommonUserViewHolderV2 = this.f97247a;
                    FansFollowUserBtn fansFollowUserBtn = this.f97247a.f97234b;
                    C7573i.m23582a((Object) fansFollowUserBtn, "mFollowBtn");
                    DmtTextView dmtTextView = this.f97247a.f97235c;
                    C7573i.m23582a((Object) dmtTextView, "mDislikeBtn");
                    recommendCommonUserViewHolderV2.mo93643a(fansFollowUserBtn, dmtTextView, user);
                    this.f97247a.mo93644a(user, user.getFollowStatus());
                }
            }

            /* renamed from: a */
            public final void mo75565a(Exception exc) {
                int i;
                Context a = this.f97247a.mo93619a();
                FansFollowUserBtn fansFollowUserBtn = this.f97247a.f97234b;
                C7573i.m23582a((Object) fansFollowUserBtn, "mFollowBtn");
                DmtTextView dmtTextView = this.f97247a.f97235c;
                C7573i.m23582a((Object) dmtTextView, "mDislikeBtn");
                User user = this.f97247a.f97236d;
                if (user != null) {
                    i = user.getFollowerStatus();
                } else {
                    i = 0;
                }
                C37126a.m119350b(a, fansFollowUserBtn, dmtTextView, 0, i);
            }
        };
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV2 f97248a;

            {
                this.f97248a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97248a.mo93626c(this.f97248a.f97236d);
                this.f97248a.mo93620a(this.f97248a.f97236d);
                this.f97248a.mo93621a(this.f97248a.f97236d, "enter_profile", this.f97248a.getAdapterPosition());
                DataCenter dataCenter = this.f97248a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_item", (Object) "");
                }
            }
        });
        this.f97237f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV2 f97249a;

            {
                this.f97249a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97249a.mo93626c(this.f97249a.f97236d);
                this.f97249a.mo93620a(this.f97249a.f97236d);
                this.f97249a.mo93621a(this.f97249a.f97236d, "enter_profile", this.f97249a.getAdapterPosition());
                DataCenter dataCenter = this.f97249a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_head", (Object) "");
                }
            }
        });
        this.f97235c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendCommonUserViewHolderV2 f97250a;

            {
                this.f97250a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String str = null;
                this.f97250a.mo93622a(this.f97250a.f97236d, true);
                this.f97250a.mo93621a(this.f97250a.f97236d, "delete", this.f97250a.getAdapterPosition());
                DataCenter dataCenter = this.f97250a.f97187a;
                if (dataCenter != null) {
                    String str2 = "action_click_dislike";
                    User user = this.f97250a.f97236d;
                    if (user != null) {
                        str = user.getUid();
                    }
                    dataCenter.mo60134a(str2, (Object) str);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo93633a(User user) {
        if (user != null) {
            this.f97236d = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f97237f.setUserData(userVerify);
            if (!mo93634g()) {
                this.f97237f.mo60896b();
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                DmtTextView dmtTextView = this.f97238g;
                C7573i.m23582a((Object) dmtTextView, "mUserNameTv");
                dmtTextView.setText(user.getRemarkName());
            } else {
                DmtTextView dmtTextView2 = this.f97238g;
                C7573i.m23582a((Object) dmtTextView2, "mUserNameTv");
                dmtTextView2.setText(user.getNickname());
            }
            if (!TextUtils.isEmpty(user.getRecommendReason())) {
                DmtTextView dmtTextView3 = this.f97241j;
                C7573i.m23582a((Object) dmtTextView3, "mDesTv");
                dmtTextView3.setText(user.getRecommendReason());
            } else if (!TextUtils.isEmpty(user.getSignature())) {
                DmtTextView dmtTextView4 = this.f97241j;
                C7573i.m23582a((Object) dmtTextView4, "mDesTv");
                dmtTextView4.setText(user.getSignature());
            } else {
                DmtTextView dmtTextView5 = this.f97241j;
                C7573i.m23582a((Object) dmtTextView5, "mDesTv");
                dmtTextView5.setVisibility(8);
            }
            if (C43122ff.m136767b()) {
                FansFollowUserBtn fansFollowUserBtn = this.f97234b;
                C7573i.m23582a((Object) fansFollowUserBtn, "mFollowBtn");
                fansFollowUserBtn.setVisibility(8);
                DmtTextView dmtTextView6 = this.f97235c;
                C7573i.m23582a((Object) dmtTextView6, "mDislikeBtn");
                dmtTextView6.setVisibility(8);
                return;
            }
            this.f97245n.mo75558a(user);
            this.f97245n.f77866c = new C37163b(this, user);
            FansFollowUserBtn fansFollowUserBtn2 = this.f97234b;
            C7573i.m23582a((Object) fansFollowUserBtn2, "mFollowBtn");
            DmtTextView dmtTextView7 = this.f97235c;
            C7573i.m23582a((Object) dmtTextView7, "mDislikeBtn");
            mo93643a(fansFollowUserBtn2, dmtTextView7, user);
            mo93644a(user, user.getFollowStatus());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r0.mo18785ax() == 3) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93644a(com.p280ss.android.ugc.aweme.profile.model.User r8, int r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.mo18785ax()
            r1 = 2
            if (r0 == r1) goto L_0x0020
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            int r0 = r0.mo18785ax()
            r1 = 3
            if (r0 != r1) goto L_0x0045
        L_0x0020:
            int r0 = r8.getFollowStatus()
            if (r0 == 0) goto L_0x0039
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f97238g
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r7.f97239h
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "find_friends"
            r6 = 1
            r1 = r8
            r2 = r9
            com.p280ss.android.ugc.aweme.profile.util.C36694aa.m118343a(r1, r2, r3, r4, r5, r6)
            return
        L_0x0039:
            com.ss.android.ugc.aweme.views.AutoRTLImageView r8 = r7.f97239h
            java.lang.String r9 = "mRemarkEdit"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r9 = 8
            r8.setVisibility(r9)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV2.mo93644a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* renamed from: a */
    public final void mo93643a(FansFollowUserBtn fansFollowUserBtn, DmtTextView dmtTextView, User user) {
        int i;
        fansFollowUserBtn.mo75747a(user.getFollowStatus(), user.getFollowerStatus());
        if (user.getGender() == 2) {
            dmtTextView.setText(mo93619a().getResources().getString(R.string.dh));
        } else {
            dmtTextView.setText(mo93619a().getResources().getString(R.string.di));
        }
        if (C43122ff.m136786q(user)) {
            dmtTextView.setVisibility(8);
            i = (int) C9738o.m28708b(mo93619a(), 142.0f);
        } else {
            dmtTextView.setVisibility(0);
            i = (int) C9738o.m28708b(mo93619a(), 68.0f);
        }
        LayoutParams buttonLayoutParams = fansFollowUserBtn.getButtonLayoutParams();
        buttonLayoutParams.width = i;
        fansFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
    }
}
