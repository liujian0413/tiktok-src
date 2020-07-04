package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34636e;
import com.p280ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32269d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.LikeNotificationHolder */
public class LikeNotificationHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: c */
    public Activity f89743c;

    /* renamed from: d */
    private AvatarImageWithVerify f89744d;

    /* renamed from: e */
    private SmartRoundImageView f89745e;

    /* renamed from: f */
    private TextView f89746f;

    /* renamed from: g */
    private TextView f89747g;

    /* renamed from: h */
    private TextView f89748h;

    /* renamed from: i */
    private RecyclerView f89749i;

    /* renamed from: j */
    private ConstraintLayout f89750j;

    /* renamed from: k */
    private DiggNotice f89751k;

    /* renamed from: l */
    private C34388b f89752l;

    /* renamed from: m */
    private View f89753m;

    /* renamed from: n */
    private BaseNotice f89754n;

    /* renamed from: o */
    private String f89755o;

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.LikeNotificationHolder$a */
    class C34387a extends C1293v implements OnClickListener {

        /* renamed from: a */
        AvatarImageView f89756a;

        /* renamed from: c */
        private User f89758c;

        /* renamed from: a */
        public final void mo87664a(User user) {
            if (user != null) {
                this.f89758c = user;
                C23323e.m76524b(this.f89756a, user.getAvatarThumb());
            }
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7195s a = C7195s.m22438a();
            Activity activity = LikeNotificationHolder.this.f89743c;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f89758c.getUid());
            a.mo18679a(activity, sb.toString());
        }

        C34387a(View view) {
            super(view);
            this.f89756a = (AvatarImageView) view;
            this.f89756a.setOnClickListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.LikeNotificationHolder$b */
    class C34388b extends C1262a {

        /* renamed from: b */
        private List<User> f89760b = new ArrayList();

        public final int getItemCount() {
            if (this.f89760b != null) {
                return this.f89760b.size();
            }
            return 0;
        }

        C34388b() {
        }

        /* renamed from: a */
        public final void mo87666a(List<User> list) {
            this.f89760b.clear();
            int i = 1;
            while (i < 6 && i < list.size()) {
                this.f89760b.add(list.get(i));
                i++;
            }
            notifyDataSetChanged();
        }

        public final void onBindViewHolder(C1293v vVar, int i) {
            ((C34387a) vVar).mo87664a((User) this.f89760b.get(i));
        }

        public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            AvatarImageView avatarImageView = new AvatarImageView(viewGroup.getContext());
            avatarImageView.setLayoutParams(new LayoutParams((int) C9738o.m28708b(C6399b.m19921a(), 27.0f), (int) C9738o.m28708b(C6399b.m19921a(), 27.0f)));
            return new C34387a(avatarImageView);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87643a() {
        return true;
    }

    /* renamed from: a */
    public static int m111198a(DiggNotice diggNotice) {
        if (diggNotice == null || diggNotice.getAweme() == null) {
            return 0;
        }
        return diggNotice.getAweme().getEnterpriseType();
    }

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89753m.setVisibility(8);
            C32266b.m104782a(this.f89750j);
            return;
        }
        this.f89753m.setVisibility(0);
        C32266b.m104783a(this.f89750j, R.drawable.cny, R.color.ato);
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo87652b()) {
            String str = "click";
            String str2 = "like";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f89754n;
            if (this.f89753m.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo87646a(str, str2, adapterPosition, baseNotice, z, this.f89755o);
            super.onClick(view);
            if (this.f89751k != null) {
                int id = view.getId();
                if (id == R.id.c72 || id == R.id.c74) {
                    if (this.f89751k.getUsers() != null && this.f89751k.getUsers().size() > 0) {
                        mo87645a(this.f89743c, ((User) this.f89751k.getUsers().get(0)).getUid(), ((User) this.f89751k.getUsers().get(0)).getSecUid());
                        m111134a(((User) this.f89751k.getUsers().get(0)).getUid(), "message_like", "click_head");
                    }
                } else if (id == R.id.c76 || id == R.id.c79) {
                    if (this.f89751k.getDiggType() == 5 || this.f89751k.getDiggType() == 6) {
                        C34636e.m111895a(this.f89743c, this.f89751k.getForwardId(), "message", this.f89751k.getCid(), m111198a(this.f89751k));
                    } else {
                        Aweme aweme = this.f89751k.getAweme();
                        C7195s a = C7195s.m22438a();
                        Activity activity = this.f89743c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("aweme://aweme/detail/");
                        sb.append(aweme.getAid());
                        a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("cid", this.f89751k.getCid()).mo18694a("refer", "message").mo18695a());
                    }
                    mo87642a(true);
                    C34538e.m111686a(this.f89743c);
                }
            }
        }
    }

    public LikeNotificationHolder(View view, Activity activity) {
        super(view);
        this.f89743c = activity;
        this.f89750j = (ConstraintLayout) view.findViewById(R.id.c76);
        this.f89744d = (AvatarImageWithVerify) view.findViewById(R.id.c72);
        this.f89745e = (SmartRoundImageView) view.findViewById(R.id.c79);
        this.f89746f = (TextView) view.findViewById(R.id.c74);
        this.f89747g = (TextView) view.findViewById(R.id.c77);
        this.f89748h = (TextView) view.findViewById(R.id.c71);
        this.f89749i = (RecyclerView) view.findViewById(R.id.c75);
        this.f89753m = view.findViewById(R.id.c78);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f89743c);
        customLinearLayoutManager.mo5427b(0);
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(0, (int) C9738o.m28708b((Context) this.f89743c, 10.0f), 0);
        this.f89749i.setLayoutManager(customLinearLayoutManager);
        this.f89749i.mo5525a((C1272h) recyclerItemDecoration);
        this.f89752l = new C34388b();
        this.f89749i.setAdapter(this.f89752l);
        C34626j.m111876a(this.f89744d);
        C34626j.m111876a(this.f89746f);
        C34626j.m111876a(this.f89745e);
        this.f89746f.setOnClickListener(this);
        this.f89744d.setOnClickListener(this);
        this.f89750j.setOnClickListener(this);
        this.f89745e.setOnClickListener(this);
        this.f89748h.setOnClickListener(this);
        ((C13438a) this.f89745e.getHierarchy()).mo32898b((int) R.color.ee);
        this.f89744d.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getDiggNotice() != null && baseNotice.getDiggNotice().getUsers() != null && baseNotice.getDiggNotice().getUsers().size() != 0) {
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89754n = baseNotice;
            this.f89755o = str;
            mo87646a("show", "like", getAdapterPosition(), baseNotice, z, str);
            this.f89751k = baseNotice.getDiggNotice();
            List users = this.f89751k.getUsers();
            if (users != null && users.size() > 0) {
                this.f89746f.setText(((User) users.get(0)).getNickname());
            }
            if (!(this.f89751k == null || this.f89751k.getUsers() == null || this.f89751k.getUsers().size() <= 0)) {
                User user = (User) this.f89751k.getUsers().get(0);
                if (user != null) {
                    userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                } else {
                    userVerify = null;
                }
                this.f89744d.setUserData(userVerify);
                if (C6399b.m19944t()) {
                    this.f89744d.mo60896b();
                    C43126fg.m136800a(this.f89744d.getContext(), userVerify, this.f89746f);
                }
            }
            int mergeCount = this.f89751k.getMergeCount();
            if (mergeCount == 1) {
                if (this.f89751k.getDiggType() == 2) {
                    this.f89748h.setText(this.f89743c.getString(R.string.bm_));
                } else if (this.f89751k.getDiggType() == 3 || this.f89751k.getDiggType() == 6) {
                    this.f89748h.setText(this.f89743c.getString(R.string.bm9));
                } else {
                    this.f89748h.setText(this.f89743c.getString(R.string.bma));
                }
                this.f89749i.setVisibility(8);
            } else {
                if (this.f89751k.getDiggType() == 2) {
                    this.f89748h.setText(this.f89743c.getString(R.string.bm8, new Object[]{Integer.valueOf(mergeCount)}));
                } else if (this.f89751k.getDiggType() == 3 || this.f89751k.getDiggType() == 6) {
                    this.f89748h.setText(this.f89743c.getString(R.string.cpp, new Object[]{Integer.valueOf(Math.max(mergeCount - 1, 0))}));
                } else {
                    this.f89748h.setText(this.f89743c.getString(R.string.cpq, new Object[]{Integer.valueOf(Math.max(mergeCount - 1, 0))}));
                }
                this.f89749i.setVisibility(0);
            }
            this.f89747g.setText(C32269d.m104788a(this.f89743c, baseNotice.getCreateTime() * 1000));
            C12133n.m35299a(C23400r.m76741a(this.f89751k.getAweme().getVideo().getOriginCover())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f89745e).mo29848a();
            this.f89752l.mo87666a(this.f89751k.getUsers());
        }
    }
}
