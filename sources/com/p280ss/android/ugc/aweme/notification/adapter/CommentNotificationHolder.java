package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34367o;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34635d;
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
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.CommentNotificationHolder */
public class CommentNotificationHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: c */
    private Activity f89666c;

    /* renamed from: d */
    private AvatarImageWithVerify f89667d;

    /* renamed from: e */
    private SmartRoundImageView f89668e;

    /* renamed from: f */
    private RecyclerView f89669f;

    /* renamed from: g */
    private HeadViewAdapter f89670g;

    /* renamed from: h */
    private TextView f89671h;

    /* renamed from: i */
    private TextView f89672i;

    /* renamed from: j */
    private TextView f89673j;

    /* renamed from: k */
    private TextView f89674k;

    /* renamed from: l */
    private ConstraintLayout f89675l;

    /* renamed from: m */
    private CommentNotice f89676m;

    /* renamed from: n */
    private C34367o f89677n;

    /* renamed from: o */
    private View f89678o;

    /* renamed from: p */
    private BaseNotice f89679p;

    /* renamed from: q */
    private String f89680q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87643a() {
        return true;
    }

    /* renamed from: c */
    private String m111156c() {
        if (C6307b.m19566a((Collection<T>) this.f89677n.f89568a)) {
            return "";
        }
        int i = this.f89677n.f89571d;
        if (i == 1 && !this.f89677n.f89568a.isEmpty()) {
            return this.f89666c.getString(R.string.fq8, new Object[]{this.f89677n.f89570c});
        } else if (i <= 1) {
            return "";
        } else {
            return this.f89666c.getString(R.string.fq7, new Object[]{Integer.valueOf(i - 1)});
        }
    }

    /* renamed from: b */
    private static int m111153b(CommentNotice commentNotice) {
        if (commentNotice == null || commentNotice.getAweme() == null) {
            return 0;
        }
        return commentNotice.getAweme().getEnterpriseType();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!mo87652b()) {
            super.onClick(view);
            if (this.f89676m != null) {
                m111151a(view);
                return;
            }
            if (this.f89677n != null) {
                m111154b(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89678o.setVisibility(8);
            C32266b.m104782a(this.f89675l);
            return;
        }
        this.f89678o.setVisibility(0);
        C32266b.m104783a(this.f89675l, R.drawable.cny, R.color.ato);
    }

    /* renamed from: b */
    private void m111154b(View view) {
        boolean z;
        User user;
        String str = "click";
        String str2 = "pollsticker";
        int adapterPosition = getAdapterPosition();
        BaseNotice baseNotice = this.f89679p;
        boolean z2 = true;
        if (this.f89678o.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        mo87646a(str, str2, adapterPosition, baseNotice, z, this.f89680q);
        int id = view.getId();
        if (C6307b.m19566a((Collection<T>) this.f89677n.f89568a)) {
            user = null;
        } else {
            user = (User) this.f89677n.f89568a.get(0);
        }
        if (user != null) {
            if (id == R.id.c5u) {
                m111131a(this.f89666c, user.getUid(), user.getSecUid(), "message");
                m111134a(user.getUid(), "message_vote", "click_head");
            } else if (id == R.id.c5v) {
                m111131a(this.f89666c, user.getUid(), user.getSecUid(), "message");
                m111134a(user.getUid(), "message_vote", "click_head");
            } else if (id == R.id.c5w || id == R.id.c5z) {
                String str3 = "click";
                String str4 = "pollsticker";
                int adapterPosition2 = getAdapterPosition();
                if (this.f89678o.getVisibility() != 0) {
                    z2 = false;
                }
                mo87649a(str3, str4, adapterPosition2, z2);
                C7195s.m22438a().mo18679a(this.f89666c, C7203u.m22460a(this.f89677n.f89574g).mo18694a("refer", "message").mo18695a());
            } else {
                if (id == R.id.e0i && this.f89677n.f89573f != null && !TextUtils.isEmpty(this.f89677n.f89573f.getUserId())) {
                    C34636e.m111892a(this.f89666c, this.f89677n);
                }
            }
        }
    }

    /* renamed from: a */
    private void m111151a(View view) {
        boolean z;
        String str = "click";
        String str2 = "comment";
        int adapterPosition = getAdapterPosition();
        BaseNotice baseNotice = this.f89679p;
        if (this.f89678o.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        mo87647a(str, str2, adapterPosition, baseNotice, z, m111129a(this.f89676m), this.f89680q);
        int id = view.getId();
        if (id == R.id.c5u || id == R.id.c5v) {
            mo87645a(this.f89666c, this.f89676m.getComment().getUser().getUid(), this.f89676m.getComment().getUser().getSecUid());
            m111134a(this.f89676m.getComment().getUser().getUid(), "message_comment", "click_head");
            return;
        }
        if (id == R.id.c5w || id == R.id.c5z) {
            int commentType = this.f89676m.getCommentType();
            if (commentType == 0 || commentType == 1 || commentType == 2 || commentType == 3 || commentType == 11 || commentType == 12) {
                C7195s a = C7195s.m22438a();
                Activity activity = this.f89666c;
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(this.f89676m.getAweme().getAid());
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("cid", this.f89676m.getComment().getCid()).mo18694a("refer", "message").mo18695a());
            } else if (!(!m111135a(commentType) || this.f89676m == null || this.f89676m.getComment() == null)) {
                C34636e.m111895a(this.f89666c, this.f89676m.getForwardId(), "message", this.f89676m.getComment().getCid(), m111153b(this.f89676m));
            }
            if (!m111135a(commentType)) {
                C34538e.m111686a(this.f89666c);
            }
        }
    }

    public CommentNotificationHolder(View view, Activity activity) {
        super(view);
        this.f89666c = activity;
        this.f89667d = (AvatarImageWithVerify) view.findViewById(R.id.c5u);
        this.f89668e = (SmartRoundImageView) view.findViewById(R.id.c5z);
        this.f89671h = (TextView) view.findViewById(R.id.c5v);
        this.f89672i = (TextView) view.findViewById(R.id.c5x);
        this.f89673j = (TextView) view.findViewById(R.id.c5s);
        this.f89675l = (ConstraintLayout) view.findViewById(R.id.c5w);
        this.f89678o = view.findViewById(R.id.c5y);
        this.f89674k = (TextView) view.findViewById(R.id.c5t);
        this.f89669f = (RecyclerView) view.findViewById(R.id.cqe);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f89666c);
        customLinearLayoutManager.mo5427b(0);
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(0, (int) C9738o.m28708b((Context) this.f89666c, 10.0f), 0);
        this.f89669f.setLayoutManager(customLinearLayoutManager);
        this.f89669f.mo5525a((C1272h) recyclerItemDecoration);
        this.f89670g = new HeadViewAdapter(this.f89666c, 4);
        this.f89669f.setAdapter(this.f89670g);
        C34626j.m111876a(this.f89667d);
        C34626j.m111876a(this.f89671h);
        C34626j.m111876a(this.f89668e);
        this.f89667d.setOnClickListener(this);
        this.f89671h.setOnClickListener(this);
        this.f89675l.setOnClickListener(this);
        this.f89668e.setOnClickListener(this);
        ((C13438a) this.f89668e.getHierarchy()).mo32898b((int) R.color.ee);
        this.f89667d.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    /* renamed from: b */
    private void m111155b(BaseNotice baseNotice, boolean z) {
        UserVerify userVerify;
        mo87649a("show", "pollsticker", getAdapterPosition(), !z);
        this.f89669f.setVisibility(8);
        if (!C6307b.m19566a((Collection<T>) this.f89677n.f89568a)) {
            User user = (User) this.f89677n.f89568a.get(0);
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f89667d.setUserData(userVerify);
            C12133n.m35299a(C23400r.m76741a(this.f89677n.f89569b)).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f89668e).mo29848a();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f89671h.setText(user.getRemarkName());
            } else {
                this.f89671h.setText(user.getNickname());
            }
            if (C6399b.m19944t()) {
                this.f89667d.mo60896b();
                C43126fg.m136800a(this.f89667d.getContext(), userVerify, this.f89671h);
            }
            if (this.f89677n.f89568a.size() > 1 && this.f89677n.f89571d > 1) {
                this.f89669f.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                for (int i = 1; i < this.f89677n.f89568a.size(); i++) {
                    arrayList.add(this.f89677n.f89568a.get(i));
                }
                this.f89670g.mo87663a(arrayList);
            }
        }
        this.f89673j.setText(m111156c());
        this.f89673j.setVisibility(0);
        this.f89674k.setVisibility(8);
        this.f89672i.setText(C32269d.m104788a(this.f89666c, baseNotice.getCreateTime() * 1000));
        C27608b.m90502a(this.f89673j);
    }

    /* renamed from: a */
    private void m111152a(BaseNotice baseNotice, boolean z) {
        UserVerify userVerify;
        mo87650a("show", "comment", getAdapterPosition(), !z, m111129a(this.f89676m));
        if (this.f89676m.getComment().getUser() != null) {
            userVerify = new UserVerify(this.f89676m.getComment().getUser().getAvatarThumb(), this.f89676m.getComment().getUser().getCustomVerify(), this.f89676m.getComment().getUser().getEnterpriseVerifyReason(), Integer.valueOf(this.f89676m.getComment().getUser().getVerificationType()), this.f89676m.getComment().getUser().getWeiboVerify());
        } else {
            userVerify = null;
        }
        this.f89667d.setUserData(userVerify);
        if (!(this.f89676m.getAweme() == null || this.f89676m.getAweme().getVideo() == null || this.f89676m.getAweme().getVideo().getOriginCover() == null)) {
            C12133n.m35299a(C23400r.m76741a(this.f89676m.getAweme().getVideo().getOriginCover())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f89668e).mo29848a();
        }
        this.f89671h.setText(this.f89676m.getComment().getUser().getNickname());
        if (C6399b.m19944t()) {
            this.f89667d.mo60896b();
            C43126fg.m136800a(this.f89667d.getContext(), userVerify, this.f89671h);
        }
        this.f89672i.setText(C32269d.m104788a(this.f89666c, baseNotice.getCreateTime() * 1000));
        this.f89673j.setText(C34635d.m111891a(this.f89676m.getComment()));
        this.f89669f.setVisibility(8);
        C27608b.m90502a(this.f89673j);
        switch (this.f89676m.getCommentType()) {
            case 0:
            case 1:
            case 11:
                this.f89674k.setText(R.string.bi3);
                return;
            case 2:
            case 4:
            case 8:
            case 12:
                this.f89674k.setText(R.string.bi1);
                return;
            case 3:
                this.f89674k.setText(R.string.bi2);
                return;
            case 7:
                this.f89674k.setText(R.string.a9n);
                return;
            case 9:
            case 10:
                this.f89674k.setText(R.string.b_5);
                break;
        }
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        if (baseNotice != null && (baseNotice.getCommentNotice() != null || baseNotice.getVoteNotice() != null)) {
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89676m = baseNotice.getCommentNotice();
            this.f89679p = baseNotice;
            this.f89680q = str;
            this.f89677n = baseNotice.getVoteNotice();
            if (this.f89676m != null) {
                m111152a(baseNotice, z);
                return;
            }
            if (this.f89677n != null) {
                m111155b(baseNotice, z);
            }
        }
    }
}
