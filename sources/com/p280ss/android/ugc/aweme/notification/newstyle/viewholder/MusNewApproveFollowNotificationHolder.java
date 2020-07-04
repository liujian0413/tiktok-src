package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewApproveFollowNotificationHolder */
public final class MusNewApproveFollowNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90267d;

    /* renamed from: e */
    private final AvatarImageWithVerify f90268e;

    /* renamed from: f */
    private final TextView f90269f;

    /* renamed from: g */
    private final TextView f90270g;

    /* renamed from: k */
    private FollowApproveNotice f90271k;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34594j.m111825a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        FollowApproveNotice followApproveNotice = this.f90271k;
        if (followApproveNotice != null) {
            User user = followApproveNotice.getUser();
            if (user != null) {
                mo87669b(user.getUid(), user.getSecUid(), "message");
                m111134a(user.getUid(), "notification_page", "click_head");
            }
        }
    }

    public MusNewApproveFollowNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90267d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90268e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90269f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90270g = (TextView) findViewById4;
        C34615d.m111861a(this.f90267d);
        C34626j.m111876a(this.f90268e);
        OnClickListener onClickListener = this;
        this.f90267d.setOnClickListener(onClickListener);
        this.f90268e.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo87880a(MusNotice musNotice, boolean z) {
        C7573i.m23587b(musNotice, "notice");
        if (musNotice.getFollowApproveNotice() != null) {
            this.f90271k = musNotice.getFollowApproveNotice();
            FollowApproveNotice followApproveNotice = this.f90271k;
            if (followApproveNotice != null) {
                User user = followApproveNotice.getUser();
                if (user != null) {
                    UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                    this.f90268e.setUserData(userVerify);
                    this.f90268e.mo60896b();
                    mo87867a(this.f90269f, user, (BaseNotice) null, (String) null, (String) null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Context context = this.f89761c;
                    C7573i.m23582a((Object) context, "context");
                    spannableStringBuilder.append(context.getResources().getString(R.string.co9));
                    mo87667a(spannableStringBuilder, (BaseNotice) musNotice);
                    this.f90270g.setText(spannableStringBuilder);
                }
            }
        }
    }
}
