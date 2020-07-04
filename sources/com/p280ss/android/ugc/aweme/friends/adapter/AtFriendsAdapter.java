package com.p280ss.android.ugc.aweme.friends.adapter;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.base.BaseViewHolder;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p280ss.android.ugc.aweme.friends.p1281a.C30000b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter */
public final class AtFriendsAdapter extends C1262a<AtViewHolder> {

    /* renamed from: d */
    public static final C30007a f78843d = new C30007a(null);

    /* renamed from: a */
    public List<? extends IMUser> f78844a;

    /* renamed from: b */
    public AllFriends f78845b;

    /* renamed from: c */
    public int f78846c = -1;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder */
    public static final class AtViewHolder extends BaseViewHolder<IMUser> {

        /* renamed from: a */
        public TextView f78847a;

        /* renamed from: b */
        public TextView f78848b;

        /* renamed from: c */
        public AvatarImageWithVerify f78849c;

        /* renamed from: d */
        public TextView f78850d;

        /* renamed from: e */
        public TextView f78851e;

        /* renamed from: f */
        public ImageView f78852f;

        /* renamed from: g */
        public int f78853g = -1;

        /* renamed from: h */
        public final View f78854h;

        /* renamed from: i */
        public final AtFriendsAdapter f78855i;

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder$a */
        static final class C30006a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AtViewHolder f78856a;

            /* renamed from: b */
            final /* synthetic */ IMUser f78857b;

            /* renamed from: c */
            final /* synthetic */ User f78858c;

            C30006a(AtViewHolder atViewHolder, IMUser iMUser, User user) {
                this.f78856a = atViewHolder;
                this.f78857b = iMUser;
                this.f78858c = user;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C6399b.m19944t() && this.f78856a.f78853g == 0) {
                    C6907h.m21528b("add_video_at", C33230ac.m107211a(C22984d.m75611a().mo59973a("search_keyword", "").mo59973a("log_pb", C28199ae.m92689a().mo71793b(this.f78857b.getUid())).mo59973a("to_user_id", this.f78857b.getUid()).f60753a));
                }
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a.getCurUserId(), this.f78857b.getUid())) {
                    C6907h.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f78857b.getUid()));
                    C42961az.m136380a(new C30000b(this.f78858c));
                    return;
                }
                View view2 = this.f78856a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C10761a.m31399c(view2.getContext(), (int) R.string.cly).mo25750a();
            }
        }

        /* renamed from: a */
        public final void mo25667a() {
        }

        /* renamed from: a */
        private static void m98370a(TextView textView, Drawable drawable) {
            textView.setCompoundDrawables(null, null, drawable, null);
            if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, drawable, null);
            }
        }

        public AtViewHolder(View view, AtFriendsAdapter atFriendsAdapter) {
            C7573i.m23587b(view, "container");
            C7573i.m23587b(atFriendsAdapter, "adapter");
            super(view);
            this.f78854h = view;
            this.f78855i = atFriendsAdapter;
            View findViewById = this.f78854h.findViewById(R.id.d1t);
            C7573i.m23582a((Object) findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f78847a = (TextView) findViewById;
            View findViewById2 = this.f78854h.findViewById(R.id.b0j);
            C7573i.m23582a((Object) findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f78848b = (TextView) findViewById2;
            View findViewById3 = this.f78854h.findViewById(R.id.ic);
            C7573i.m23582a((Object) findViewById3, "container.findViewById(R.id.avatar)");
            this.f78849c = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.f78854h.findViewById(R.id.c33);
            C7573i.m23582a((Object) findViewById4, "container.findViewById(R.id.name)");
            this.f78850d = (TextView) findViewById4;
            View findViewById5 = this.f78854h.findViewById(R.id.a7e);
            C7573i.m23582a((Object) findViewById5, "container.findViewById(R.id.desc)");
            this.f78851e = (TextView) findViewById5;
            View findViewById6 = this.f78854h.findViewById(R.id.crd);
            C7573i.m23582a((Object) findViewById6, "container.findViewById(R.id.relation)");
            this.f78852f = (ImageView) findViewById6;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
            if (android.text.TextUtils.equals(r13, r1) == false) goto L_0x00d7;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo76201a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r12, int r13) {
            /*
                r11 = this;
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23587b(r12, r0)
                android.view.View r0 = r11.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                android.view.View r1 = r11.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                android.content.Context r1 = r1.getContext()
                android.graphics.drawable.Drawable r1 = com.bytedance.ies.dmt.p262ui.common.C10774c.m31449e(r1)
                r0.setBackground(r1)
                com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter r0 = r11.f78855i
                java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.f78844a
                r1 = 0
                if (r13 <= 0) goto L_0x0033
                if (r0 != 0) goto L_0x002a
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x002a:
                int r2 = r13 + -1
                java.lang.Object r0 = r0.get(r2)
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMUser) r0
                goto L_0x0034
            L_0x0033:
                r0 = r1
            L_0x0034:
                android.widget.TextView r2 = r11.f78847a
                r3 = 0
                r2.setVisibility(r3)
                com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter r2 = r11.f78855i
                com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends r2 = r2.f78845b
                r4 = 8
                if (r2 == 0) goto L_0x00e8
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r5 = r2.recentFriends
                int r5 = r5.size()
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.mutualFriends
                int r6 = r6.size()
                int r5 = r5 + r6
                if (r13 != 0) goto L_0x0065
                android.widget.TextView r2 = r11.f78847a
                r2.setVisibility(r3)
                android.widget.TextView r2 = r11.f78847a
                java.lang.String r6 = ""
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r2.setText(r6)
                android.widget.TextView r2 = r11.f78847a
                r2.setCompoundDrawables(r1, r1, r1, r1)
                goto L_0x00ba
            L_0x0065:
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.recentFriends
                int r6 = r6.size()
                if (r13 != r6) goto L_0x0099
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.mutualFriends
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ 1
                if (r6 == 0) goto L_0x0099
                android.widget.TextView r2 = r11.f78847a
                r6 = 2131827432(0x7f111ae8, float:1.9287776E38)
                r2.setText(r6)
                android.widget.TextView r2 = r11.f78847a
                android.view.View r6 = r11.f78854h
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131232071(0x7f080547, float:1.808024E38)
                android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
                java.lang.String r7 = "container.resources.getD…rawable.ic_im_friends_32)"
                kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                m98370a(r2, r6)
                goto L_0x00ba
            L_0x0099:
                if (r13 != r5) goto L_0x00b5
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r2.allFollowingFriends
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ 1
                if (r2 == 0) goto L_0x00b5
                android.widget.TextView r2 = r11.f78847a
                r6 = 2131820999(0x7f1101c7, float:1.9274729E38)
                r2.setText(r6)
                android.widget.TextView r2 = r11.f78847a
                r2.setCompoundDrawables(r1, r1, r1, r1)
                goto L_0x00ba
            L_0x00b5:
                android.widget.TextView r2 = r11.f78847a
                r2.setVisibility(r4)
            L_0x00ba:
                android.widget.TextView r2 = r11.f78848b
                r2.setVisibility(r3)
                if (r13 < r5) goto L_0x00e3
                if (r13 == r5) goto L_0x00d7
                java.lang.String r13 = r12.getInitialLetter()
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                if (r0 == 0) goto L_0x00cf
                java.lang.String r1 = r0.getInitialLetter()
            L_0x00cf:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r13 = android.text.TextUtils.equals(r13, r1)
                if (r13 != 0) goto L_0x00e3
            L_0x00d7:
                android.widget.TextView r13 = r11.f78848b
                java.lang.String r0 = r12.getInitialLetter()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r13.setText(r0)
                goto L_0x00e8
            L_0x00e3:
                android.widget.TextView r13 = r11.f78848b
                r13.setVisibility(r4)
            L_0x00e8:
                com.ss.android.ugc.aweme.profile.model.User r13 = com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.C30007a.m98373a(r12)
                com.ss.android.ugc.aweme.utils.UserVerify r0 = new com.ss.android.ugc.aweme.utils.UserVerify
                com.ss.android.ugc.aweme.base.model.UrlModel r6 = r13.getAvatarThumb()
                java.lang.String r7 = r13.getCustomVerify()
                java.lang.String r8 = r13.getEnterpriseVerifyReason()
                int r1 = r13.getVerificationType()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                java.lang.String r10 = r13.getWeiboVerify()
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r1 = r11.f78849c
                r1.setUserData(r0)
                android.widget.TextView r0 = r11.f78851e
                r0.setVisibility(r3)
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r0 != 0) goto L_0x0143
                android.widget.TextView r0 = r11.f78850d
                java.lang.String r1 = r12.getRemarkName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x012f
                java.lang.String r1 = r12.getNickName()
            L_0x012c:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                goto L_0x0134
            L_0x012f:
                java.lang.String r1 = r12.getRemarkName()
                goto L_0x012c
            L_0x0134:
                r0.setText(r1)
                android.widget.TextView r0 = r11.f78851e
                java.lang.String r1 = r12.getSignature()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                goto L_0x01a4
            L_0x0143:
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19947w()
                if (r0 == 0) goto L_0x0160
                android.widget.TextView r0 = r11.f78850d
                java.lang.String r1 = r12.getNickName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.widget.TextView r0 = r11.f78851e
                java.lang.String r1 = r12.getSignature()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                goto L_0x01a4
            L_0x0160:
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
                if (r0 == 0) goto L_0x01a4
                android.widget.TextView r0 = r11.f78850d
                java.lang.String r1 = r12.getNickName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@"
                r0.<init>(r1)
                java.lang.String r1 = r12.getUniqueId()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x0192
                java.lang.String r1 = r12.getShortId()
                if (r1 != 0) goto L_0x018d
                java.lang.String r1 = ""
                goto L_0x0196
            L_0x018d:
                java.lang.String r1 = r12.getShortId()
                goto L_0x0196
            L_0x0192:
                java.lang.String r1 = r12.getUniqueId()
            L_0x0196:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.widget.TextView r1 = r11.f78851e
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
            L_0x01a4:
                android.widget.TextView r0 = r11.f78851e
                java.lang.CharSequence r0 = r0.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x01b5
                android.widget.TextView r0 = r11.f78851e
                r0.setVisibility(r4)
            L_0x01b5:
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r0 == 0) goto L_0x01d8
                com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r11.f78849c
                r0.mo60896b()
                android.view.View r0 = r11.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = r12.getCustomVerify()
                java.lang.String r2 = r12.getEnterpriseVerifyReason()
                android.widget.TextView r5 = r11.f78850d
                com.p280ss.android.ugc.aweme.utils.C43126fg.m136801a(r0, r1, r2, r5)
            L_0x01d8:
                int r0 = r12.getFollowStatus()
                r1 = 2
                if (r0 != r1) goto L_0x01ed
                android.widget.ImageView r0 = r11.f78852f
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r11.f78852f
                r1 = 2131231767(0x7f080417, float:1.8079624E38)
                r0.setImageResource(r1)
                goto L_0x01f2
            L_0x01ed:
                android.widget.ImageView r0 = r11.f78852f
                r0.setVisibility(r4)
            L_0x01f2:
                android.view.View r0 = r11.f78854h
                com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder$a r1 = new com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$AtViewHolder$a
                r1.<init>(r11, r12, r13)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.AtViewHolder.mo76201a(com.ss.android.ugc.aweme.im.service.model.IMUser, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter$a */
    public static final class C30007a {
        private C30007a() {
        }

        public /* synthetic */ C30007a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static User m98373a(IMUser iMUser) {
            C7573i.m23587b(iMUser, "imUser");
            User user = new User();
            user.setUid(iMUser.getUid());
            user.setNickname(iMUser.getNickName());
            user.setSignature(iMUser.getSignature());
            user.setAvatarThumb(iMUser.getAvatarThumb());
            user.setUniqueId(iMUser.getUniqueId());
            user.setShortId(iMUser.getShortId());
            user.setFollowStatus(iMUser.getFollowStatus());
            user.setCustomVerify(iMUser.getCustomVerify());
            user.setWeiboVerify(iMUser.getWeiboVerify());
            user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
            user.setVerificationType(iMUser.getVerificationType());
            user.setRemarkName(iMUser.getRemarkName());
            user.isBlock = iMUser.isBlock();
            user.setRegion("");
            return user;
        }
    }

    public final int getItemCount() {
        List<? extends IMUser> list = this.f78844a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo76200a(AllFriends allFriends) {
        this.f78845b = allFriends;
        List<? extends IMUser> arrayList = new ArrayList<>();
        if (allFriends != null) {
            arrayList.addAll(allFriends.recentFriends);
            arrayList.addAll(allFriends.mutualFriends);
            arrayList.addAll(allFriends.allFollowingFriends);
            this.f78844a = arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AtViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tc, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…at_friend, parent, false)");
        return new AtViewHolder(inflate, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(AtViewHolder atViewHolder, int i) {
        C7573i.m23587b(atViewHolder, "holder");
        atViewHolder.f78853g = this.f78846c;
        List<? extends IMUser> list = this.f78844a;
        if (list == null) {
            C7573i.m23580a();
        }
        atViewHolder.mo76201a((IMUser) list.get(i), i);
    }
}
