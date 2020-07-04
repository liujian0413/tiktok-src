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
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34637f;
import com.p280ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder */
public final class MTNewFansNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public FollowNotice f90216d;

    /* renamed from: e */
    public BaseNotice f90217e;

    /* renamed from: f */
    public String f90218f;

    /* renamed from: g */
    public String f90219g;

    /* renamed from: k */
    private final View f90220k;

    /* renamed from: l */
    private final AvatarImageWithVerify f90221l;

    /* renamed from: m */
    private final TextView f90222m;

    /* renamed from: n */
    private final TextView f90223n;

    /* renamed from: o */
    private final NotificationFollowUserBtn f90224o;

    /* renamed from: p */
    private C29548a f90225p;

    /* renamed from: a */
    private static int m111783a(User user) {
        if (C34637f.m111898a(user.getFollowStatus()) || user.getFollowStatus() == 4) {
            return 0;
        }
        if (C34637f.m111899a(user, false)) {
            return 4;
        }
        return 1;
    }

    public MTNewFansNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90220k = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90221l = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90222m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90223n = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f90224o = (NotificationFollowUserBtn) findViewById5;
        this.f90224o.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        C34538e.m111690b(this.f90220k);
        C34626j.m111876a(this.f90221l);
        C34626j.m111876a(this.f90224o);
        OnClickListener onClickListener = this;
        this.f90224o.setOnClickListener(onClickListener);
        this.f90220k.setOnClickListener(onClickListener);
        this.f90221l.setOnClickListener(onClickListener);
        this.f90221l.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f90225p = new C29548a(this.f90224o, new C29556e(this) {

            /* renamed from: a */
            final /* synthetic */ MTNewFansNotificationHolder f90226a;

            /* renamed from: a */
            public final String mo68099a() {
                return MTNewBaseNotificationHolder.f90184j.mo87870a(this.f90226a.f90217e, false);
            }

            {
                this.f90226a = r1;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                String str;
                String str2;
                super.mo67853a(i, user);
                C42961az.m136380a(new C23661d(i, user));
                this.f90226a.mo87668a("click", "fans", this.f90226a.f90217e, this.f90226a.f90218f, this.f90226a.f90219g);
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        Context context = this.f90226a.f89761c;
                        C7573i.m23582a((Object) context, "context");
                        C34538e.m111687a(context, this.f90226a.f90216d);
                        str = "follow";
                    }
                    C6907h.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    LogHelper logHelper = (LogHelper) ServiceManager.get().getService(LogHelper.class);
                    if (C6399b.m19947w()) {
                        str2 = "message";
                    } else {
                        str2 = "chat";
                    }
                    String str3 = str2;
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "uid");
                    logHelper.logFollowUserEvent(str3, "message", "other_places", "follow_button", uid);
                }
            }
        });
    }

    public final void onClick(View view) {
        Integer num;
        int i;
        ClickInstrumentation.onClick(view);
        if (!C34590f.m111821a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        FollowNotice followNotice = this.f90216d;
        if (followNotice != null) {
            User user = followNotice.getUser();
            if (user != null) {
                mo87668a("click", "fans", this.f90217e, this.f90218f, this.f90219g);
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if ((num != null && num.intValue() == R.id.c7r) || (num != null && num.intValue() == R.id.c6v)) {
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "it.uid");
                    String secUid = user.getSecUid();
                    C7573i.m23582a((Object) secUid, "it.secUid");
                    MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, this.f90217e, false, (String) null, 24, (Object) null);
                    Context context = this.f89761c;
                    C7573i.m23582a((Object) context, "context");
                    String str = "fans";
                    BaseNotice baseNotice = this.f90217e;
                    if (baseNotice != null) {
                        i = baseNotice.clientOrder;
                    } else {
                        i = -1;
                    }
                    C34538e.m111688a(context, str, i);
                } else {
                    if (num != null && num.intValue() == R.id.c5q) {
                        int a = m111783a(user);
                        C29548a aVar = this.f90225p;
                        if (aVar != null) {
                            aVar.mo75559a(user.getUid(), user.getSecUid(), a, user.getFollowerStatus());
                        }
                        C42961az.m136380a(new C23661d(a, user));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87874a(BaseNotice baseNotice, boolean z, String str, String str2) {
        C7573i.m23587b(baseNotice, "notice");
        C7573i.m23587b(str2, "enterFrom");
        if (baseNotice.getFollowNotice() != null) {
            this.f90217e = baseNotice;
            this.f90218f = str;
            this.f90219g = str2;
            mo87668a("show", "fans", baseNotice, str, str2);
            this.f90216d = baseNotice.getFollowNotice();
            FollowNotice followNotice = this.f90216d;
            if (followNotice != null) {
                User user = followNotice.getUser();
                if (user != null) {
                    UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                    this.f90221l.setUserData(userVerify);
                    this.f90221l.mo60896b();
                    mo87867a(this.f90222m, user, this.f90217e, str, str2);
                    this.f90224o.setFollowStatus(user.getFollowStatus());
                    C29548a aVar = this.f90225p;
                    if (aVar != null) {
                        aVar.mo75558a(user);
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f89761c.getString(R.string.cp1));
            mo87667a(spannableStringBuilder, baseNotice);
            this.f90223n.setText(spannableStringBuilder);
        }
    }
}
