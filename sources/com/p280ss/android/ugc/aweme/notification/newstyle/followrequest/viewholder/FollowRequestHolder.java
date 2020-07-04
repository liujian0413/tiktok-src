package com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.viewholder;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.viewholder.FollowRequestHolder */
public class FollowRequestHolder extends C1293v implements OnClickListener, C6310a {

    /* renamed from: a */
    private Activity f90127a;

    /* renamed from: b */
    private User f90128b;

    /* renamed from: c */
    private C6309f f90129c = new C6309f(this);

    /* renamed from: d */
    private AvatarImageWithVerify f90130d;

    /* renamed from: e */
    private TextView f90131e;

    /* renamed from: f */
    private TextView f90132f;

    /* renamed from: g */
    private ImageView f90133g;

    /* renamed from: h */
    private ImageView f90134h;

    /* renamed from: i */
    private ViewGroup f90135i;

    /* renamed from: j */
    private C34548a f90136j;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.viewholder.FollowRequestHolder$a */
    public interface C34548a {
        /* renamed from: a */
        void mo87816a(User user, int i, int i2);
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo87852a(User user) {
        String str;
        if (user != null) {
            this.f90128b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f90130d.setUserData(userVerify);
            this.f90131e.setText(this.f90128b.getNickname());
            if (C6399b.m19944t()) {
                this.f90130d.mo60896b();
                C43126fg.m136801a(this.itemView.getContext(), this.f90128b.getCustomVerify(), this.f90128b.getEnterpriseVerifyReason(), this.f90131e);
            }
            if (C6399b.m19944t()) {
                TextView textView = this.f90132f;
                StringBuilder sb = new StringBuilder("@");
                if (TextUtils.isEmpty(this.f90128b.getUniqueId())) {
                    str = user.getShortId();
                } else {
                    str = user.getUniqueId();
                }
                sb.append(str);
                textView.setText(sb.toString());
            } else if (TextUtils.isEmpty(this.f90128b.getRecommendReason())) {
                this.f90132f.setVisibility(8);
            } else {
                this.f90132f.setVisibility(0);
                this.f90132f.setText(this.f90128b.getRecommendReason());
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34549a.m111721a(C6399b.m19921a())) {
            C10761a.m31399c((Context) this.f90127a, (int) R.string.cjs).mo25750a();
            return;
        }
        int id = view.getId();
        if (id == R.id.b3a) {
            if (this.f90136j != null) {
                this.f90136j.mo87816a(this.f90128b, getAdapterPosition(), 1);
            }
            FollowRequestApiManager.m111412a(this.f90129c, this.f90128b.getUid());
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).sendFollowApproveEvent("message", this.f90128b.getUid());
        } else if (id == R.id.b50) {
            if (this.f90136j != null) {
                this.f90136j.mo87816a(this.f90128b, getAdapterPosition(), 2);
            }
            FollowRequestApiManager.m111413b(this.f90129c, this.f90128b.getUid());
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).sendFollowRefuseEvent("message", this.f90128b.getUid());
        } else if (id == R.id.b3j) {
            C7195s a = C7195s.m22438a();
            Activity activity = this.f90127a;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f90128b.getUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f90128b.getSecUid()).mo18695a());
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).sendEnterPersonalDetailEvent("message", this.f90128b.getUid(), "click_head");
        } else if (id == R.id.b45 || id == R.id.b3l) {
            C7195s a2 = C7195s.m22438a();
            Activity activity2 = this.f90127a;
            StringBuilder sb2 = new StringBuilder("aweme://user/profile/");
            sb2.append(this.f90128b.getUid());
            a2.mo18679a(activity2, C7203u.m22460a(sb2.toString()).mo18694a("sec_user_id", this.f90128b.getSecUid()).mo18695a());
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).sendEnterPersonalDetailEvent("message", this.f90128b.getUid(), "click_name");
        } else {
            if (id == R.id.b51) {
                C7195s a3 = C7195s.m22438a();
                Activity activity3 = this.f90127a;
                StringBuilder sb3 = new StringBuilder("aweme://user/profile/");
                sb3.append(this.f90128b.getUid());
                a3.mo18679a(activity3, C7203u.m22460a(sb3.toString()).mo18694a("sec_user_id", this.f90128b.getSecUid()).mo18695a());
                ((LogHelper) ServiceManager.get().getService(LogHelper.class)).sendEnterPersonalDetailEvent("message", this.f90128b.getUid(), "click_card");
            }
        }
    }

    public FollowRequestHolder(View view, Activity activity, C34548a aVar) {
        super(view);
        this.f90127a = activity;
        this.f90135i = (ViewGroup) view.findViewById(R.id.b51);
        this.f90130d = (AvatarImageWithVerify) view.findViewById(R.id.b3j);
        this.f90131e = (TextView) view.findViewById(R.id.b45);
        this.f90132f = (TextView) view.findViewById(R.id.b3l);
        this.f90133g = (ImageView) view.findViewById(R.id.b3a);
        this.f90134h = (ImageView) view.findViewById(R.id.b50);
        this.f90136j = aVar;
        C34626j.m111876a(this.f90135i);
        C34626j.m111876a(this.f90133g);
        C34626j.m111876a(this.f90134h);
        this.f90130d.setOnClickListener(this);
        this.f90131e.setOnClickListener(this);
        this.f90132f.setOnClickListener(this);
        this.f90135i.setOnClickListener(this);
        this.f90133g.setOnClickListener(this);
        this.f90134h.setOnClickListener(this);
    }
}
