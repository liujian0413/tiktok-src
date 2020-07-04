package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32269d;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.FansNotificationHolder */
public class FansNotificationHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: c */
    private ConstraintLayout f89713c;

    /* renamed from: d */
    private AvatarImageWithVerify f89714d;

    /* renamed from: e */
    private TextView f89715e;

    /* renamed from: f */
    private TextView f89716f;

    /* renamed from: g */
    private FollowUserBtn f89717g;

    /* renamed from: h */
    private C36031j f89718h = new C36031j();

    /* renamed from: i */
    private FollowNotice f89719i;

    /* renamed from: j */
    private Activity f89720j;

    /* renamed from: k */
    private View f89721k;

    /* renamed from: l */
    private BaseNotice f89722l;

    /* renamed from: m */
    private String f89723m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87643a() {
        return true;
    }

    /* renamed from: c */
    private void m111186c() {
        int i;
        String str;
        int i2 = 0;
        if (this.f89719i.getUser().getFollowStatus() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i ^ 1;
        if (i == 0) {
            if (C34637f.m111899a(this.f89719i.getUser(), false)) {
                i2 = 4;
            } else {
                i2 = 1;
            }
        }
        C42961az.m136380a(new C23661d(i2, this.f89719i.getUser()));
        this.f89718h.mo91679a(new C36034a().mo91684a(this.f89719i.getUser().getUid()).mo91682a(i3).mo91689d(this.f89719i.getUser().getFollowerStatus()).mo91681a());
        MobClick mobClick = new MobClick();
        if (i != 0) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        C6907h.onEvent(mobClick.setEventName(str).setLabelName("message").setValue(this.f89719i.getUser().getUid()));
        if (i == 0) {
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logFollowUserEventI18n("message", this.f89719i.getUser().getUid(), "previous_page", "other_places");
            C34538e.m111687a(this.f89720j, this.f89719i);
        }
        m111185b(i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87660a(View view) {
        m111186c();
    }

    /* renamed from: b */
    private void m111185b(int i) {
        this.f89717g.setFollowStatus(i);
        this.f89719i.getUser().setFollowStatus(i);
    }

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89721k.setVisibility(8);
            C32266b.m104782a(this.f89713c);
            return;
        }
        this.f89721k.setVisibility(0);
        C32266b.m104783a(this.f89713c, R.drawable.cny, R.color.ato);
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo87652b()) {
            String str = "click";
            String str2 = "fans";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f89722l;
            if (this.f89721k.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo87646a(str, str2, adapterPosition, baseNotice, z, this.f89723m);
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.c6k || id == R.id.c6h || id == R.id.c6j) {
                mo87645a(this.f89720j, this.f89719i.getUser().getUid(), this.f89719i.getUser().getSecUid());
                m111134a(this.f89719i.getUser().getUid(), "message_fans", "click_head");
                C34538e.m111688a(this.f89720j, "fans", getLayoutPosition());
            }
        }
    }

    public FansNotificationHolder(View view, Activity activity) {
        super(view);
        this.f89720j = activity;
        this.f89713c = (ConstraintLayout) view.findViewById(R.id.c6k);
        this.f89714d = (AvatarImageWithVerify) view.findViewById(R.id.c6h);
        this.f89715e = (TextView) view.findViewById(R.id.c6j);
        this.f89716f = (TextView) view.findViewById(R.id.c6l);
        this.f89717g = (FollowUserBtn) view.findViewById(R.id.c6i);
        this.f89721k = view.findViewById(R.id.c6m);
        C34626j.m111876a(this.f89714d);
        C34626j.m111876a(this.f89715e);
        this.f89717g.setOnClickListener(new C34395c(this));
        this.f89713c.setOnClickListener(this);
        this.f89715e.setOnClickListener(this);
        this.f89714d.setOnClickListener(this);
        this.f89714d.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getFollowNotice() != null) {
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89722l = baseNotice;
            this.f89723m = str;
            mo87646a("show", "fans", getAdapterPosition(), baseNotice, z, str);
            this.f89719i = baseNotice.getFollowNotice();
            this.f89716f.setText(C32269d.m104788a(this.f89720j, baseNotice.getCreateTime() * 1000));
            if (this.f89719i.getUser() != null) {
                userVerify = new UserVerify(this.f89719i.getUser().getAvatarThumb(), this.f89719i.getUser().getCustomVerify(), this.f89719i.getUser().getEnterpriseVerifyReason(), Integer.valueOf(this.f89719i.getUser().getVerificationType()), this.f89719i.getUser().getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f89714d.setUserData(userVerify);
            this.f89715e.setText(this.f89719i.getUser().getNickname());
            m111185b(this.f89719i.getUser().getFollowStatus());
            if (C6399b.m19944t()) {
                this.f89714d.mo60896b();
                C43126fg.m136800a(this.f89714d.getContext(), userVerify, this.f89715e);
            }
        }
    }
}
