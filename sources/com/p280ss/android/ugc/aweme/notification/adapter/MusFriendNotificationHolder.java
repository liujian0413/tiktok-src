package com.p280ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MusFriendNotificationHolder */
public class MusFriendNotificationHolder extends MTBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private RelativeLayout f89784d;

    /* renamed from: e */
    private AvatarImageWithVerify f89785e;

    /* renamed from: f */
    private TextView f89786f;

    /* renamed from: g */
    private NotificationFollowUserBtn f89787g;

    /* renamed from: h */
    private FriendNotice f89788h;

    /* renamed from: i */
    private Context f89789i;

    /* renamed from: j */
    private C29548a f89790j;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo87655c() {
        return R.id.c6k;
    }

    public MusFriendNotificationHolder(View view) {
        super(view);
        this.f89789i = view.getContext();
        this.f89784d = (RelativeLayout) view.findViewById(R.id.c6k);
        this.f89785e = (AvatarImageWithVerify) view.findViewById(R.id.c6h);
        this.f89786f = (TextView) view.findViewById(R.id.c60);
        this.f89787g = (NotificationFollowUserBtn) view.findViewById(R.id.c5q);
        this.f89787g.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        C34615d.m111861a((View) this.f89784d);
        C34615d.m111861a((View) this.f89785e);
        C34626j.m111876a(this.f89787g);
        this.f89784d.setOnClickListener(this);
        this.f89785e.setOnClickListener(this);
        this.f89785e.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f89790j = new C29548a(this.f89787g, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34399g.m111250a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89789i, (int) R.string.cjs).mo25750a();
            return;
        }
        int id = view.getId();
        if (id == R.id.c6k || id == R.id.c6j || id == R.id.c5q) {
            m111206a("friend", getLayoutPosition());
            C7195s.m22438a().mo18682a(C7203u.m22460a(this.f89788h.getOpenUrl()).mo18694a("enter_from", "message").mo18695a());
            return;
        }
        if (id == R.id.c6h) {
            C7195s.m22438a().mo18682a(C7203u.m22460a(this.f89788h.getOpenUrl()).mo18694a("enter_from", "message").mo18695a());
        }
    }

    /* renamed from: a */
    public final void mo87674a(MusNotice musNotice, boolean z) {
        UserVerify userVerify;
        if (musNotice != null && musNotice.getFriendNotice() != null) {
            this.f89788h = musNotice.getFriendNotice();
            User user = this.f89788h.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f89785e.setUserData(userVerify);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String a = C34637f.m111896a(this.f89788h.getUser());
            if (a != null) {
                spannableStringBuilder.append(a);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(this.f89789i.getString(R.string.cel));
            mo87667a(spannableStringBuilder, (BaseNotice) musNotice);
            this.f89786f.setText(spannableStringBuilder);
            this.f89787g.setFollowStatus(this.f89788h.getUser().getFollowStatus());
            if (this.f89790j != null) {
                this.f89790j.mo75558a(this.f89788h.getUser());
            }
        }
    }
}
