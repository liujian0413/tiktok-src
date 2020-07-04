package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.arch.lifecycle.C0053p;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RelativeUserAvatarListView;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.recommend.C37132d;
import com.p280ss.android.ugc.aweme.recommend.FeedRecommendUserViewStyle;
import com.p280ss.android.ugc.aweme.recommend.widget.FixedWidthFollowUserBtn;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.sequences.C7605h;
import kotlin.text.C7631j;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.FeedAutoFillRecommendUserItemHolder */
public final class FeedAutoFillRecommendUserItemHolder extends BaseRecommendUserViewHolder {

    /* renamed from: e */
    public static final C37150a f97190e = new C37150a(null);

    /* renamed from: b */
    public final FixedWidthFollowUserBtn f97191b = ((FixedWidthFollowUserBtn) this.itemView.findViewById(R.id.q5));

    /* renamed from: c */
    public final DmtTextView f97192c = ((DmtTextView) this.itemView.findViewById(R.id.q1));

    /* renamed from: d */
    public User f97193d;

    /* renamed from: f */
    private final View f97194f = this.itemView.findViewById(R.id.bjh);

    /* renamed from: g */
    private final View f97195g = this.itemView.findViewById(R.id.bgi);

    /* renamed from: h */
    private final AvatarImageWithVerify f97196h = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.b64));

    /* renamed from: i */
    private final DmtTextView f97197i = ((DmtTextView) this.itemView.findViewById(R.id.e7f));

    /* renamed from: j */
    private final LinearLayout f97198j = ((LinearLayout) this.itemView.findViewById(R.id.dg3));

    /* renamed from: k */
    private final DmtTextView f97199k = ((DmtTextView) this.itemView.findViewById(R.id.dt5));

    /* renamed from: l */
    private final View f97200l = this.itemView.findViewById(R.id.a9o);

    /* renamed from: m */
    private final RelativeUserAvatarListView f97201m = ((RelativeUserAvatarListView) this.itemView.findViewById(R.id.crf));

    /* renamed from: n */
    private int f97202n = (C9738o.m28691a(mo93619a()) - C23486n.m77122a(156.0d));

    /* renamed from: o */
    private C29548a f97203o = new C29548a(this.f97191b, new C29556e(this) {

        /* renamed from: a */
        final /* synthetic */ FeedAutoFillRecommendUserItemHolder f97205a;

        /* renamed from: a */
        public final String mo68099a() {
            return "homepage_hot";
        }

        /* renamed from: c */
        public final int mo68101c() {
            return 12;
        }

        {
            this.f97205a = r1;
        }

        /* renamed from: a */
        public final void mo67853a(int i, User user) {
            super.mo67853a(i, user);
            User user2 = this.f97205a.f97193d;
            if (user2 != null) {
                if (i != 0) {
                    this.f97205a.mo93621a(this.f97205a.f97193d, "follow", this.f97205a.getAdapterPosition());
                }
                this.f97205a.mo93624b(user2);
            }
            DataCenter dataCenter = this.f97205a.f97187a;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_click_follow", (Object) Integer.valueOf(i));
            }
        }
    });

    /* renamed from: p */
    private final HashSet<String> f97204p;

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.FeedAutoFillRecommendUserItemHolder$a */
    public static final class C37150a {
        private C37150a() {
        }

        public /* synthetic */ C37150a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo93623b() {
        return R.layout.vh;
    }

    /* renamed from: e */
    public final void mo93628e() {
        super.mo93628e();
        mo93634g();
    }

    /* renamed from: c */
    public final void mo93625c() {
        View view = this.f97200l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo93627d() {
        View view = this.f97200l;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo93634g() {
        User user = this.f97193d;
        if (user != null) {
            String uid = user.getUid();
            if (uid != null && !this.f97204p.contains(uid)) {
                mo93621a(this.f97193d, "impression", getAdapterPosition());
                this.f97204p.add(uid);
            }
        }
    }

    /* renamed from: e */
    private static void m119414e(User user) {
        String recommendReason = user.getRecommendReason();
        if (recommendReason != null) {
            CharSequence charSequence = recommendReason;
            C7631j jVar = (C7631j) C7605h.m23660e(Regex.findAll$default(new Regex("[0-9]+(个共同联系人$|个共同好友$|个共同关注$|个共同粉丝$|人关注了该用户$|人和该用户是好友$)"), charSequence, 0, 2, null));
            if (jVar != null) {
                user.setRecommendReason(jVar.mo19511b());
            }
            C7631j jVar2 = (C7631j) C7605h.m23660e(Regex.findAll$default(new Regex("[0-9]+(?=人关注了该用户$|人和该用户是好友$|人$)"), charSequence, 0, 2, null));
            if (jVar2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jVar2.mo19511b());
                sb.append("个共同关系");
                user.setRecommendReason(sb.toString());
            }
        }
    }

    /* renamed from: c */
    public final void mo93626c(User user) {
        if (user != null) {
            UserProfileActivity.m117386a(mo93619a(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from", mo93629f()).mo104633a("enter_from_request_id", user.getRequestId()).mo104630a("from_recommend_card", 1).mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo93633a(User user) {
        boolean z;
        if (user != null) {
            this.f97193d = user;
            AvatarImageWithVerify avatarImageWithVerify = this.f97196h;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            avatarImageWithVerify.setUserData(userVerify);
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                DmtTextView dmtTextView = this.f97197i;
                C7573i.m23582a((Object) dmtTextView, "mUserNameTv");
                dmtTextView.setText(user.getRemarkName());
            } else {
                DmtTextView dmtTextView2 = this.f97197i;
                C7573i.m23582a((Object) dmtTextView2, "mUserNameTv");
                dmtTextView2.setText(user.getNickname());
            }
            this.f97203o.mo75558a(user);
            FixedWidthFollowUserBtn fixedWidthFollowUserBtn = this.f97191b;
            C7573i.m23582a((Object) fixedWidthFollowUserBtn, "mFollowBtn");
            DmtTextView dmtTextView3 = this.f97192c;
            C7573i.m23582a((Object) dmtTextView3, "mDislikeBtn");
            mo93632a(fixedWidthFollowUserBtn, dmtTextView3, user);
            boolean needTag = FeedRecommendUserViewStyle.needTag();
            if (FeedRecommendUserViewStyle.needTag() || FeedRecommendUserViewStyle.needDetailRecommendReason()) {
                z = true;
            } else {
                z = false;
            }
            boolean isLargerStyle = FeedRecommendUserViewStyle.isLargerStyle();
            if (needTag) {
                new C36769z(this.f97198j, this.f97202n, false, false);
            } else {
                LinearLayout linearLayout = this.f97198j;
                C7573i.m23582a((Object) linearLayout, "mTagLayout");
                linearLayout.setVisibility(8);
            }
            if (!z) {
                m119414e(user);
            }
            if (isLargerStyle) {
                this.f97197i.setTextSize(1, 20.0f);
                this.f97199k.setTextSize(1, 15.0f);
                DmtTextView dmtTextView4 = this.f97199k;
                C7573i.m23582a((Object) dmtTextView4, "mDesTv");
                dmtTextView4.setTypeface(Typeface.DEFAULT_BOLD);
                this.f97201m.mo76614a(C23486n.m77122a(24.0d), C23486n.m77122a(18.0d));
                this.f97195g.setPadding(0, C23486n.m77122a(4.0d), 0, 0);
            } else {
                this.f97197i.setTextSize(1, 17.0f);
                this.f97199k.setTextSize(1, 13.0f);
                DmtTextView dmtTextView5 = this.f97199k;
                C7573i.m23582a((Object) dmtTextView5, "mDesTv");
                dmtTextView5.setTypeface(Typeface.DEFAULT);
                this.f97201m.mo76614a(C23486n.m77122a(20.0d), C23486n.m77122a(16.0d));
                this.f97195g.setPadding(0, C23486n.m77122a(0.0d), 0, 0);
            }
            DmtTextView dmtTextView6 = this.f97199k;
            C7573i.m23582a((Object) dmtTextView6, "mDesTv");
            m119412a(user, dmtTextView6);
            this.f97201m.mo76615a(user, (TextView) this.f97199k, false);
            if (z) {
                DmtTextView dmtTextView7 = this.f97199k;
                C7573i.m23582a((Object) dmtTextView7, "mDesTv");
                dmtTextView7.setMaxLines(2);
                return;
            }
            DmtTextView dmtTextView8 = this.f97199k;
            C7573i.m23582a((Object) dmtTextView8, "mDesTv");
            dmtTextView8.setMaxLines(1);
        }
    }

    /* renamed from: a */
    private static void m119412a(User user, TextView textView) {
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

    public FeedAutoFillRecommendUserItemHolder(ViewGroup viewGroup, HashSet<String> hashSet) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(hashSet, "mImpressionMap");
        super(viewGroup);
        this.f97204p = hashSet;
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FeedAutoFillRecommendUserItemHolder f97210a;

            {
                this.f97210a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97210a.mo93626c(this.f97210a.f97193d);
                this.f97210a.mo93620a(this.f97210a.f97193d);
                this.f97210a.mo93621a(this.f97210a.f97193d, "enter_profile", this.f97210a.getAdapterPosition());
                DataCenter dataCenter = this.f97210a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_item", (Object) "");
                }
            }
        });
        this.f97196h.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FeedAutoFillRecommendUserItemHolder f97211a;

            {
                this.f97211a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f97211a.mo93626c(this.f97211a.f97193d);
                this.f97211a.mo93620a(this.f97211a.f97193d);
                this.f97211a.mo93621a(this.f97211a.f97193d, "enter_profile", this.f97211a.getAdapterPosition());
                DataCenter dataCenter = this.f97211a.f97187a;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_click_head", (Object) "");
                }
            }
        });
        this.f97192c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ FeedAutoFillRecommendUserItemHolder f97212a;

            {
                this.f97212a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                this.f97212a.mo93622a(this.f97212a.f97193d, false);
                this.f97212a.mo93621a(this.f97212a.f97193d, "delete", this.f97212a.getAdapterPosition());
                DataCenter dataCenter = this.f97212a.f97187a;
                if (dataCenter != null) {
                    String str2 = "action_click_dislike";
                    User user = this.f97212a.f97193d;
                    if (user != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    dataCenter.mo60134a(str2, (Object) str);
                }
            }
        });
        DataCenter dataCenter = this.f97187a;
        if (dataCenter != null) {
            dataCenter.mo60132a("action_list_impression", (C0053p<C23083a>) new C0053p<C23083a>(this) {

                /* renamed from: a */
                final /* synthetic */ FeedAutoFillRecommendUserItemHolder f97213a;

                {
                    this.f97213a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(C23083a aVar) {
                    this.f97213a.mo93634g();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo93631a(User user, boolean z, boolean z2) {
        mo93633a(user);
        if (z) {
            this.f97194f.setBackgroundResource(R.drawable.ln);
        } else if (z2) {
            this.f97194f.setBackgroundResource(R.drawable.lo);
        } else {
            this.f97194f.setBackgroundResource(R.color.as);
        }
    }

    /* renamed from: a */
    public final void mo93621a(User user, String str, int i) {
        C7573i.m23587b(str, "eventType");
        if (user != null) {
            C33238ak g = new C33238ak(null, 1, null).mo85095a(user.getUid()).mo85097b(mo93629f()).mo85098c(str).mo85093a(i).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason()).mo85101f("card").mo85102g("nonempty");
            if (C7573i.m23585a((Object) str, (Object) "follow")) {
                g.mo85096b(C37132d.m119365a());
            }
            g.mo85252e();
        }
    }

    /* renamed from: a */
    public final void mo93632a(FixedWidthFollowUserBtn fixedWidthFollowUserBtn, DmtTextView dmtTextView, User user) {
        fixedWidthFollowUserBtn.mo75747a(user.getFollowStatus(), user.getFollowerStatus());
        if (user.getGender() == 2) {
            DmtTextView dmtTextView2 = this.f97192c;
            C7573i.m23582a((Object) dmtTextView2, "mDislikeBtn");
            dmtTextView2.setText(mo93619a().getResources().getString(R.string.dh));
        } else {
            DmtTextView dmtTextView3 = this.f97192c;
            C7573i.m23582a((Object) dmtTextView3, "mDislikeBtn");
            dmtTextView3.setText(mo93619a().getResources().getString(R.string.di));
        }
        if (user.getFollowStatus() == 0) {
            DmtTextView dmtTextView4 = this.f97192c;
            C7573i.m23582a((Object) dmtTextView4, "mDislikeBtn");
            dmtTextView4.setVisibility(0);
            return;
        }
        DmtTextView dmtTextView5 = this.f97192c;
        C7573i.m23582a((Object) dmtTextView5, "mDislikeBtn");
        dmtTextView5.setVisibility(8);
    }
}
