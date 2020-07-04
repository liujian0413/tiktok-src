package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.HeadHolder */
public final class HeadHolder extends C1293v implements OnClickListener {

    /* renamed from: a */
    private User f89735a;

    /* renamed from: b */
    private final Activity f89736b;

    /* renamed from: c */
    private final AvatarImageWithVerify f89737c;

    /* renamed from: a */
    public final void mo87661a(User user) {
        if (user != null) {
            this.f89735a = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f89737c.setUserData(userVerify);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        User user = this.f89735a;
        if (user != null) {
            C7195s a = C7195s.m22438a();
            Activity activity = this.f89736b;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", user.getSecUid()).mo18695a());
        }
    }

    public HeadHolder(Activity activity, AvatarImageWithVerify avatarImageWithVerify) {
        C7573i.m23587b(activity, "mActivity");
        C7573i.m23587b(avatarImageWithVerify, "avatarImageView");
        super(avatarImageWithVerify);
        this.f89736b = activity;
        this.f89737c = avatarImageWithVerify;
        this.f89737c.setOnClickListener(this);
    }
}
