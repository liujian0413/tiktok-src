package com.p280ss.android.ugc.aweme.digg;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.WhiteBgFollowUserBtn;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersViewHolder */
public final class LikeUsersViewHolder extends C1293v {

    /* renamed from: g */
    public static final C26347a f69351g = new C26347a(null);

    /* renamed from: a */
    public AvatarImageView f69352a;

    /* renamed from: b */
    public TextView f69353b;

    /* renamed from: c */
    public TextView f69354c;

    /* renamed from: d */
    public WhiteBgFollowUserBtn f69355d;

    /* renamed from: e */
    public String f69356e;

    /* renamed from: f */
    public String f69357f;

    /* renamed from: h */
    private C29548a f69358h;

    /* renamed from: i */
    private Context f69359i;

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersViewHolder$a */
    public static final class C26347a {
        private C26347a() {
        }

        public /* synthetic */ C26347a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LikeUsersViewHolder m86677a(ViewGroup viewGroup, String str, String str2) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(str, "previousPage");
            C7573i.m23587b(str2, "enterFrom");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.k3, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            LikeUsersViewHolder likeUsersViewHolder = new LikeUsersViewHolder(inflate, null);
            likeUsersViewHolder.f69356e = str;
            likeUsersViewHolder.f69357f = str2;
            return likeUsersViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersViewHolder$b */
    static final class C26348b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ User f69361a;

        /* renamed from: b */
        final /* synthetic */ LikeUsersViewHolder f69362b;

        /* renamed from: c */
        final /* synthetic */ User f69363c;

        C26348b(User user, LikeUsersViewHolder likeUsersViewHolder, User user2) {
            this.f69361a = user;
            this.f69362b = likeUsersViewHolder;
            this.f69363c = user2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69362b.mo67851a(this.f69361a);
        }
    }

    private LikeUsersViewHolder(View view) {
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f69359i = context;
        this.f69356e = "";
        this.f69357f = "";
        View findViewById = view.findViewById(R.id.b64);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_avatar)");
        this.f69352a = (AvatarImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.e4l);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_username)");
        this.f69353b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dt7);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.tv_description)");
        this.f69354c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ank);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.follow_btn)");
        this.f69355d = (WhiteBgFollowUserBtn) findViewById4;
        this.f69358h = new C29548a(this.f69355d, new C29556e(this) {

            /* renamed from: a */
            final /* synthetic */ LikeUsersViewHolder f69360a;

            {
                this.f69360a = r1;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                String str;
                C7573i.m23587b(user, "user");
                super.mo67853a(i, user);
                if (i != 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                new C33280v(str).mo85341b(this.f69360a.f69357f).mo85348g(user.getUid()).mo85345e(this.f69360a.f69356e).mo85252e();
            }
        });
    }

    /* renamed from: a */
    public final void mo67851a(User user) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", this.f69357f).mo59973a("to_user_id", user.getUid()).f60753a);
        SmartRouter.buildRoute(this.f69359i, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", this.f69357f).open();
    }

    public /* synthetic */ LikeUsersViewHolder(View view, C7571f fVar) {
        this(view);
    }

    /* renamed from: a */
    public final void mo67852a(User user, int i) {
        String nickname;
        boolean z;
        C7573i.m23587b(user, "user");
        C23323e.m76524b(this.f69352a, user.getAvatarLarger());
        this.itemView.setOnClickListener(new C26348b(user, this, user));
        TextView textView = this.f69353b;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            nickname = user.getRemarkName();
        } else {
            nickname = user.getNickname();
        }
        textView.setText(nickname);
        CharSequence recommendReason = user.getRecommendReason();
        if (recommendReason == null || recommendReason.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f69354c.setVisibility(8);
            this.f69354c.setText("");
        } else {
            this.f69354c.setVisibility(0);
            this.f69354c.setText(user.getRecommendReason());
        }
        this.f69358h.mo75558a(user);
    }
}
