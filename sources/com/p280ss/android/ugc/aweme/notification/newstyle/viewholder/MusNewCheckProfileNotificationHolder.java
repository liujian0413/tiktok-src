package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34636e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCheckProfileNotificationHolder */
public final class MusNewCheckProfileNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90279d;

    /* renamed from: e */
    private final View f90280e;

    /* renamed from: f */
    private final AvatarImageWithVerify f90281f;

    /* renamed from: g */
    private final AvatarImageView f90282g;

    /* renamed from: k */
    private final AvatarImageView f90283k;

    /* renamed from: l */
    private final TextView f90284l;

    /* renamed from: m */
    private final TextView f90285m;

    /* renamed from: n */
    private CheckProfileNotice f90286n;

    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    public MusNewCheckProfileNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90279d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90280e = findViewById2;
        View findViewById3 = view.findViewById(R.id.c6w);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f90281f = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.c6x);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f90282g = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c6y);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f90283k = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.notification_name)");
        this.f90284l = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.notification_content)");
        this.f90285m = (TextView) findViewById7;
        C34615d.m111861a(this.f90279d);
        C34626j.m111876a(this.f90280e);
        OnClickListener onClickListener = this;
        this.f90279d.setOnClickListener(onClickListener);
        this.f90280e.setOnClickListener(onClickListener);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34596l.m111827a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        CheckProfileNotice checkProfileNotice = this.f90286n;
        if (checkProfileNotice != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.c6v) {
                List users = checkProfileNotice.getUsers();
                if (users != null) {
                    if (users.size() == 1) {
                        mo87669b(((User) C7525m.m23511f(users)).getUid(), ((User) C7525m.m23511f(users)).getSecUid(), "message");
                        m111134a(((User) C7525m.m23511f(users)).getUid(), "notification_page", "click_head");
                    } else {
                        C34636e.m111893a(view.getContext());
                    }
                }
            } else if (num != null && num.intValue() == R.id.c7r) {
                m111206a("check_profile", getLayoutPosition());
                C34636e.m111893a(view.getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo87882a(MusNotice musNotice, boolean z) {
        C7573i.m23587b(musNotice, "notice");
        if (musNotice.getCheckProfileNotice() != null) {
            this.f90286n = musNotice.getCheckProfileNotice();
            CheckProfileNotice checkProfileNotice = musNotice.getCheckProfileNotice();
            if (checkProfileNotice != null) {
                List users = checkProfileNotice.getUsers();
                if (users == null) {
                    users = C7525m.m23461a();
                }
                int size = users.size();
                if (size > 0) {
                    mo87868a(this.f90284l, users, 2, checkProfileNotice.getCountOfUser(), (BaseNotice) null, true, (String) null, (String) null);
                    if (size == 1) {
                        this.f90281f.setVisibility(0);
                        this.f90282g.setVisibility(8);
                        this.f90283k.setVisibility(8);
                        UserVerify userVerify = new UserVerify(((User) users.get(0)).getAvatarThumb(), ((User) users.get(0)).getCustomVerify(), ((User) users.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) users.get(0)).getVerificationType()), ((User) users.get(0)).getWeiboVerify());
                        this.f90281f.setUserData(userVerify);
                        this.f90281f.mo60896b();
                    } else {
                        this.f90281f.setVisibility(8);
                        this.f90282g.setVisibility(0);
                        this.f90283k.setVisibility(0);
                        C23323e.m76524b(this.f90282g, ((User) users.get(0)).getAvatarThumb());
                        C23323e.m76524b(this.f90283k, ((User) users.get(1)).getAvatarThumb());
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(this.f89761c.getString(R.string.coa));
                    mo87667a(spannableStringBuilder, (BaseNotice) musNotice);
                    this.f90285m.setText(spannableStringBuilder);
                }
            }
        }
    }
}
