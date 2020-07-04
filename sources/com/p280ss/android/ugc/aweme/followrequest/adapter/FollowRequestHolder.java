package com.p280ss.android.ugc.aweme.followrequest.adapter;

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
import com.p280ss.android.ugc.aweme.followrequest.C29865c;
import com.p280ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.followrequest.adapter.FollowRequestHolder */
public class FollowRequestHolder extends C1293v implements OnClickListener, C6310a {

    /* renamed from: a */
    private Activity f78438a;

    /* renamed from: b */
    private User f78439b;

    /* renamed from: c */
    private C6309f f78440c = new C6309f(this);

    /* renamed from: d */
    private AvatarImageWithVerify f78441d;

    /* renamed from: e */
    private TextView f78442e;

    /* renamed from: f */
    private TextView f78443f;

    /* renamed from: g */
    private ImageView f78444g;

    /* renamed from: h */
    private ImageView f78445h;

    /* renamed from: i */
    private ViewGroup f78446i;

    /* renamed from: j */
    private C29860a f78447j;

    /* renamed from: com.ss.android.ugc.aweme.followrequest.adapter.FollowRequestHolder$a */
    public interface C29860a {
        /* renamed from: a */
        void mo75844a(User user, int i, int i2);
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo75845a(User user) {
        String str;
        if (user != null) {
            this.f78439b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f78441d.setUserData(userVerify);
            this.f78442e.setText(this.f78439b.getNickname());
            if (C6399b.m19944t()) {
                this.f78441d.mo60896b();
                C43126fg.m136801a(this.f78438a, this.f78439b.getCustomVerify(), this.f78439b.getEnterpriseVerifyReason(), this.f78442e);
            }
            if (C6399b.m19944t()) {
                TextView textView = this.f78443f;
                StringBuilder sb = new StringBuilder("@");
                if (TextUtils.isEmpty(this.f78439b.getUniqueId())) {
                    str = user.getShortId();
                } else {
                    str = user.getUniqueId();
                }
                sb.append(str);
                textView.setText(sb.toString());
            } else if (TextUtils.isEmpty(this.f78439b.getRecommendReason())) {
                this.f78443f.setVisibility(8);
            } else {
                this.f78443f.setVisibility(0);
                this.f78443f.setText(this.f78439b.getRecommendReason());
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C29861a.m97661a(C6399b.m19921a())) {
            C10761a.m31399c((Context) this.f78438a, (int) R.string.cjs).mo25750a();
            return;
        }
        int id = view.getId();
        if (id == R.id.b3a) {
            if (this.f78447j != null) {
                this.f78447j.mo75844a(this.f78439b, getAdapterPosition(), 1);
            }
            FollowRequestApiManager.m97663a(this.f78440c, this.f78439b.getUid());
            C29865c.m97667a("message", this.f78439b.getUid());
        } else if (id == R.id.b50) {
            if (this.f78447j != null) {
                this.f78447j.mo75844a(this.f78439b, getAdapterPosition(), 2);
            }
            FollowRequestApiManager.m97664b(this.f78440c, this.f78439b.getUid());
            C29865c.m97670b("message", this.f78439b.getUid());
        } else if (id == R.id.b3j) {
            C7195s a = C7195s.m22438a();
            Activity activity = this.f78438a;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f78439b.getUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f78439b.getSecUid()).mo18695a());
            C29865c.m97668a("message", this.f78439b.getUid(), "click_head");
        } else if (id == R.id.b45 || id == R.id.b3l) {
            C7195s a2 = C7195s.m22438a();
            Activity activity2 = this.f78438a;
            StringBuilder sb2 = new StringBuilder("aweme://user/profile/");
            sb2.append(this.f78439b.getUid());
            a2.mo18679a(activity2, C7203u.m22460a(sb2.toString()).mo18694a("sec_user_id", this.f78439b.getSecUid()).mo18695a());
            C29865c.m97668a("message", this.f78439b.getUid(), "click_name");
        } else {
            if (id == R.id.b51) {
                C7195s a3 = C7195s.m22438a();
                Activity activity3 = this.f78438a;
                StringBuilder sb3 = new StringBuilder("aweme://user/profile/");
                sb3.append(this.f78439b.getUid());
                a3.mo18679a(activity3, C7203u.m22460a(sb3.toString()).mo18694a("sec_user_id", this.f78439b.getSecUid()).mo18695a());
                C29865c.m97668a("message", this.f78439b.getUid(), "click_card");
            }
        }
    }

    public FollowRequestHolder(View view, Activity activity, C29860a aVar) {
        super(view);
        this.f78438a = activity;
        this.f78446i = (ViewGroup) view.findViewById(R.id.b51);
        this.f78441d = (AvatarImageWithVerify) view.findViewById(R.id.b3j);
        this.f78442e = (TextView) view.findViewById(R.id.b45);
        this.f78443f = (TextView) view.findViewById(R.id.b3l);
        this.f78444g = (ImageView) view.findViewById(R.id.b3a);
        this.f78445h = (ImageView) view.findViewById(R.id.b50);
        this.f78447j = aVar;
        C34626j.m111876a(this.f78446i);
        C34626j.m111876a(this.f78444g);
        C34626j.m111876a(this.f78445h);
        this.f78441d.setOnClickListener(this);
        this.f78442e.setOnClickListener(this);
        this.f78443f.setOnClickListener(this);
        this.f78446i.setOnClickListener(this);
        this.f78444g.setOnClickListener(this);
        this.f78445h.setOnClickListener(this);
    }
}
