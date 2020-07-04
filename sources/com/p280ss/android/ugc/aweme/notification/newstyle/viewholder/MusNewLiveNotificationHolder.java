package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder */
public final class MusNewLiveNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90293d;

    /* renamed from: e */
    private final AvatarImageWithVerify f90294e;

    /* renamed from: f */
    private final TextView f90295f;

    /* renamed from: g */
    private final TextView f90296g;

    /* renamed from: k */
    private final Button f90297k;

    /* renamed from: l */
    private LiveNotice f90298l;

    public MusNewLiveNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90293d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90294e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90295f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90296g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f90297k = (Button) findViewById5;
        C34615d.m111861a(this.f90293d);
        C34626j.m111876a(this.f90294e);
        C34626j.m111876a(this.f90297k);
        OnClickListener onClickListener = this;
        this.f90297k.setOnClickListener(onClickListener);
        this.f90293d.setOnClickListener(onClickListener);
        this.f90294e.setOnClickListener(onClickListener);
        this.f90294e.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f90297k.getLayoutParams().width = C34615d.m111860a(this.f89761c);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34598n.m111829a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        LiveNotice liveNotice = this.f90298l;
        if (liveNotice != null) {
            User user = liveNotice.getUser();
            if (user != null) {
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if ((num != null && num.intValue() == R.id.c7r) || (num != null && num.intValue() == R.id.c5q)) {
                    m111206a("live", getLayoutPosition());
                    LogHelper logHelper = (LogHelper) ServiceManager.get().getService(LogHelper.class);
                    Context context = this.f89761c;
                    C7573i.m23582a((Object) context, "context");
                    String requestId = user.getRequestId();
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "it.uid");
                    logHelper.logLiveFromMessage(context, requestId, uid, user.roomId);
                    NoticeLiveWatcherUtil noticeLiveWatcherUtil = (NoticeLiveWatcherUtil) ServiceManager.get().getService(NoticeLiveWatcherUtil.class);
                    Context context2 = this.f89761c;
                    C7573i.m23582a((Object) context2, "context");
                    noticeLiveWatcherUtil.watchFromNotification(context2, user);
                } else {
                    if (num != null && num.intValue() == R.id.c6v) {
                        mo87669b(user.getUid(), user.getSecUid(), "message");
                        m111134a(user.getUid(), "notification_page", "click_head");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87884a(MusNotice musNotice, boolean z) {
        UrlModel urlModel;
        String str;
        String str2;
        Integer num;
        C7573i.m23587b(musNotice, "notice");
        if (musNotice.getLiveNotice() != null) {
            this.f90298l = musNotice.getLiveNotice();
            LiveNotice liveNotice = this.f90298l;
            if (liveNotice != null) {
                User user = liveNotice.getUser();
                String str3 = null;
                if (user != null) {
                    urlModel = user.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                if (user != null) {
                    str = user.getCustomVerify();
                } else {
                    str = null;
                }
                if (user != null) {
                    str2 = user.getEnterpriseVerifyReason();
                } else {
                    str2 = null;
                }
                if (user != null) {
                    num = Integer.valueOf(user.getVerificationType());
                } else {
                    num = null;
                }
                if (user != null) {
                    str3 = user.getWeiboVerify();
                }
                UserVerify userVerify = new UserVerify(urlModel, str, str2, num, str3);
                this.f90294e.setUserData(userVerify);
                this.f90294e.mo60896b();
                if (user != null) {
                    mo87867a(this.f90295f, user, (BaseNotice) null, (String) null, (String) null);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.f89761c.getString(R.string.cpg));
                if (!TextUtils.isEmpty(liveNotice.getTitle())) {
                    spannableStringBuilder.append(": ");
                    spannableStringBuilder.append(liveNotice.getTitle());
                }
                spannableStringBuilder.append(" ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(this.f89761c.getString(R.string.bx3));
                Context context = this.f89761c;
                C7573i.m23582a((Object) context, "context");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.lz)), length, spannableStringBuilder.length(), 17);
                this.f90296g.setText(spannableStringBuilder);
            }
        }
    }
}
