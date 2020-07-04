package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32269d;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.AtMeNotificationHolder */
public class AtMeNotificationHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: c */
    private Activity f89649c;

    /* renamed from: d */
    private AvatarImageWithVerify f89650d;

    /* renamed from: e */
    private SmartRoundImageView f89651e;

    /* renamed from: f */
    private TextView f89652f;

    /* renamed from: g */
    private TextView f89653g;

    /* renamed from: h */
    private TextView f89654h;

    /* renamed from: i */
    private TextView f89655i;

    /* renamed from: j */
    private ConstraintLayout f89656j;

    /* renamed from: k */
    private AtMe f89657k;

    /* renamed from: l */
    private View f89658l;

    /* renamed from: m */
    private BaseNotice f89659m;

    /* renamed from: n */
    private String f89660n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87643a() {
        return true;
    }

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89658l.setVisibility(8);
            C32266b.m104782a(this.f89656j);
            return;
        }
        this.f89658l.setVisibility(0);
        C32266b.m104783a(this.f89656j, R.drawable.cny, R.color.ato);
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (!mo87652b()) {
            String str = "click";
            String str2 = "at";
            int adapterPosition = getAdapterPosition();
            BaseNotice baseNotice = this.f89659m;
            if (this.f89658l.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            mo87646a(str, str2, adapterPosition, baseNotice, z, this.f89660n);
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.c7g || id == R.id.c7h) {
                mo87645a(this.f89649c, this.f89657k.getUser().getUid(), this.f89657k.getUser().getSecUid());
                m111134a(this.f89657k.getUser().getUid(), "message_at", "click_head");
                return;
            }
            if (id == R.id.c7i || id == R.id.c7l) {
                C7195s.m22438a().mo18679a(this.f89649c, C7203u.m22460a(this.f89657k.getSchemaUrl()).mo18694a("refer", "message").mo18695a());
                if (!TextUtils.isEmpty(m111130a(this.f89657k.getSchemaUrl()))) {
                    C34538e.m111686a(this.f89649c);
                }
            }
        }
    }

    public AtMeNotificationHolder(View view, Activity activity) {
        super(view);
        this.f89649c = activity;
        this.f89650d = (AvatarImageWithVerify) view.findViewById(R.id.c7g);
        this.f89651e = (SmartRoundImageView) view.findViewById(R.id.c7l);
        this.f89652f = (TextView) view.findViewById(R.id.c7h);
        this.f89653g = (TextView) view.findViewById(R.id.c7e);
        this.f89654h = (TextView) view.findViewById(R.id.c7j);
        this.f89656j = (ConstraintLayout) view.findViewById(R.id.c7i);
        this.f89658l = view.findViewById(R.id.c7k);
        this.f89655i = (TextView) view.findViewById(R.id.c7f);
        C34626j.m111876a(this.f89652f);
        C34626j.m111876a(this.f89651e);
        C34626j.m111876a(this.f89650d);
        this.f89651e.setOnClickListener(this);
        this.f89650d.setOnClickListener(this);
        this.f89652f.setOnClickListener(this);
        this.f89656j.setOnClickListener(this);
        ((C13438a) this.f89651e.getHierarchy()).mo32898b((int) R.color.ee);
        this.f89650d.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getAtMe() != null) {
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89659m = baseNotice;
            this.f89660n = str;
            mo87646a("show", "at", getAdapterPosition(), baseNotice, z, str);
            this.f89657k = baseNotice.getAtMe();
            if (this.f89657k.getUser() != null) {
                userVerify = new UserVerify(this.f89657k.getUser().getAvatarThumb(), this.f89657k.getUser().getCustomVerify(), this.f89657k.getUser().getEnterpriseVerifyReason(), Integer.valueOf(this.f89657k.getUser().getVerificationType()), this.f89657k.getUser().getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f89650d.setUserData(userVerify);
            C12133n.m35299a(C23400r.m76741a(this.f89657k.getImageUrl())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f89651e).mo29848a();
            this.f89652f.setText(this.f89657k.getUser().getNickname());
            this.f89654h.setText(C32269d.m104788a(this.f89649c, baseNotice.getCreateTime() * 1000));
            if (C6319n.m19593a(this.f89657k.getTitle())) {
                this.f89653g.setVisibility(0);
                this.f89653g.setText(this.f89657k.getContent());
                this.f89655i.setText(R.string.bmq);
            } else if (this.f89657k.getSubType() == 7 || this.f89657k.getSubType() == 8) {
                this.f89653g.setVisibility(8);
                this.f89655i.setText(this.f89657k.getTitle());
            } else {
                this.f89653g.setVisibility(8);
                this.f89655i.setText(R.string.bmr);
            }
            C27608b.m90502a(this.f89653g);
            if (C6399b.m19944t()) {
                this.f89650d.mo60896b();
                C43126fg.m136800a(this.f89650d.getContext(), userVerify, this.f89652f);
            }
        }
    }
}
