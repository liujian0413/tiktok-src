package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34622g;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32266b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.FriendRecommendNotificationHolder */
public class FriendRecommendNotificationHolder extends BaseNotificationHolder implements OnClickListener {

    /* renamed from: c */
    private ConstraintLayout f89724c;

    /* renamed from: d */
    private AvatarImageWithVerify f89725d;

    /* renamed from: e */
    private TextView f89726e;

    /* renamed from: f */
    private TextView f89727f;

    /* renamed from: g */
    private TextView f89728g;

    /* renamed from: h */
    private Button f89729h;

    /* renamed from: i */
    private C36031j f89730i = new C36031j();

    /* renamed from: j */
    private FriendNotice f89731j;

    /* renamed from: k */
    private Activity f89732k;

    /* renamed from: l */
    private View f89733l;

    /* renamed from: m */
    private String f89734m;

    /* renamed from: a */
    public final void mo87642a(boolean z) {
        super.mo87642a(z);
        if (z) {
            this.f89733l.setVisibility(8);
            C32266b.m104782a(this.f89724c);
            return;
        }
        this.f89733l.setVisibility(0);
        C32266b.m104783a(this.f89724c, R.drawable.cny, R.color.ato);
    }

    /* renamed from: b */
    private void m111191b(int i) {
        if (i == 0) {
            this.f89729h.setText(R.string.b7r);
            this.f89729h.setBackgroundResource(R.drawable.oa);
            this.f89729h.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a5d));
        } else if (i == 1) {
            this.f89729h.setText(R.string.b92);
            this.f89729h.setBackgroundResource(R.drawable.ms);
            this.f89729h.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a5h));
        } else if (i == 2) {
            this.f89729h.setText(R.string.aua);
            this.f89729h.setBackgroundResource(R.drawable.ms);
            this.f89729h.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a5h));
        } else if (i == 4) {
            this.f89729h.setText(R.string.b8v);
            this.f89729h.setBackgroundResource(R.drawable.ms);
            this.f89729h.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a5h));
        }
        this.f89731j.getUser().setFollowStatus(i);
    }

    public void onClick(View view) {
        int i;
        String str;
        ClickInstrumentation.onClick(view);
        if (!mo87652b()) {
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.c6s || id == R.id.c6p || id == R.id.c6r) {
                mo87645a(this.f89732k, this.f89731j.getUser().getUid(), this.f89731j.getUser().getSecUid());
                C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("account_type", "friend_recommend").mo59973a("content_id", this.f89734m).mo59973a("rec_reason", this.f89731j.getContent()).f60753a);
                return;
            }
            if (id == R.id.c6q) {
                int i2 = 0;
                if (this.f89731j.getUser().getFollowStatus() != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i3 = i ^ 1;
                if (i != 0) {
                    C6907h.m21524a("follow_cancel", (Map) C22984d.m75611a().mo59973a("to_user_id", this.f89731j.getUser().getUid()).mo59973a("enter_from", "friend_recommend").mo59973a("previous_page", "message").f60753a);
                } else {
                    C6907h.m21524a("follow", (Map) C22984d.m75611a().mo59973a("enter_from", "friend_recommend").mo59973a("previous_page", "message").mo59973a("to_user_id", this.f89731j.getUser().getUid()).mo59973a("request_id", C6861a.m21337f().getCurUserId()).f60753a);
                    if (C34637f.m111899a(this.f89731j.getUser(), false)) {
                        i2 = 4;
                    } else {
                        i2 = 1;
                    }
                }
                C42961az.m136380a(new C23661d(i2, this.f89731j.getUser()));
                this.f89730i.mo91679a(new C36034a().mo91684a(this.f89731j.getUser().getUid()).mo91682a(i3).mo91689d(this.f89731j.getUser().getFollowerStatus()).mo91681a());
                MobClick mobClick = new MobClick();
                if (i != 0) {
                    str = "follow_cancel";
                } else {
                    str = "follow";
                }
                C6907h.onEvent(mobClick.setEventName(str).setLabelName("message").setValue(this.f89731j.getUser().getUid()));
                if (i == 0) {
                    ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logFollowUserEventI18n("message", this.f89731j.getUser().getUid());
                }
                m111191b(i2);
            }
        }
    }

    public FriendRecommendNotificationHolder(View view, Activity activity) {
        super(view);
        this.f89732k = activity;
        this.f89724c = (ConstraintLayout) view.findViewById(R.id.c6s);
        this.f89725d = (AvatarImageWithVerify) view.findViewById(R.id.c6p);
        this.f89726e = (TextView) view.findViewById(R.id.c6r);
        this.f89727f = (TextView) view.findViewById(R.id.c6t);
        this.f89728g = (TextView) view.findViewById(R.id.c6o);
        this.f89729h = (Button) view.findViewById(R.id.c6q);
        this.f89733l = view.findViewById(R.id.c6u);
        C34626j.m111876a(this.f89725d);
        C34626j.m111876a(this.f89726e);
        this.f89729h.setOnClickListener(this);
        this.f89724c.setOnClickListener(this);
        this.f89726e.setOnClickListener(this);
        this.f89725d.setOnClickListener(this);
        this.f89725d.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    public final void mo87641a(BaseNotice baseNotice, boolean z, String str) {
        UserVerify userVerify;
        if (baseNotice != null && baseNotice.getFriendNotice() != null && baseNotice.getFriendNotice().getUser() != null) {
            super.mo87641a(baseNotice, z, str);
            mo87642a(z);
            this.f89731j = baseNotice.getFriendNotice();
            this.f89734m = baseNotice.getNid();
            this.f89727f.setText(C34622g.m111873a(this.f89732k, baseNotice.getCreateTime() * 1000));
            User user = this.f89731j.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f89725d.setUserData(userVerify);
            this.f89726e.setText(this.f89731j.getUser().getNickname());
            if (C6399b.m19944t()) {
                this.f89725d.mo60896b();
                C43126fg.m136800a(this.f89725d.getContext(), userVerify, this.f89726e);
            }
            m111191b(this.f89731j.getUser().getFollowStatus());
            this.f89728g.setText(this.f89731j.getContent());
            C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", "friend_recommend").mo59973a("content_id", this.f89734m).mo59973a("rec_reason", this.f89731j.getContent()).f60753a);
        }
    }
}
