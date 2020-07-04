package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder */
public final class MTNewDuetNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90210d;

    /* renamed from: e */
    private final AvatarImageWithVerify f90211e;

    /* renamed from: f */
    private final TextView f90212f;

    /* renamed from: g */
    private final TextView f90213g;

    /* renamed from: k */
    private final RemoteImageView f90214k;

    /* renamed from: l */
    private DuetNotice f90215l;

    public MTNewDuetNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90210d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90211e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90212f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90213g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_cover)");
        this.f90214k = (RemoteImageView) findViewById5;
        C34615d.m111861a(this.f90210d);
        C34626j.m111876a(this.f90211e);
        C34626j.m111876a(this.f90214k);
        OnClickListener onClickListener = this;
        this.f90214k.setOnClickListener(onClickListener);
        this.f90210d.setOnClickListener(onClickListener);
        this.f90211e.setOnClickListener(onClickListener);
        this.f90211e.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34589e.m111820a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        DuetNotice duetNotice = this.f90215l;
        if (duetNotice != null) {
            Aweme aweme = duetNotice.getAweme();
            if (aweme != null) {
                if (view != null) {
                    num = Integer.valueOf(view.getId());
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == R.id.c6v) {
                    User author = aweme.getAuthor();
                    C7573i.m23582a((Object) author, "it.author");
                    String uid = author.getUid();
                    User author2 = aweme.getAuthor();
                    C7573i.m23582a((Object) author2, "it.author");
                    mo87669b(uid, author2.getSecUid(), "message");
                    User author3 = aweme.getAuthor();
                    C7573i.m23582a((Object) author3, "it.author");
                    m111134a(author3.getUid(), "notification_page", "click_head");
                } else {
                    if ((num != null && num.intValue() == R.id.c7r) || (num != null && num.intValue() == R.id.c61)) {
                        m111206a("duet", getLayoutPosition());
                        C7195s a = C7195s.m22438a();
                        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                        sb.append(aweme.getAid());
                        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "message").mo18695a());
                        String aid = aweme.getAid();
                        if (!TextUtils.isEmpty(aid)) {
                            MobClick value = new MobClick().setEventName("video_play").setLabelName("message").setValue(aid);
                            User author4 = aweme.getAuthor();
                            C7573i.m23582a((Object) author4, "it.author");
                            C6907h.onEvent(value.setJsonObject(new C6909j().mo16966a("request_id", author4.getRequestId()).mo16967a()));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87873a(BaseNotice baseNotice, boolean z) {
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getDuetNotice() != null) {
            this.f90215l = baseNotice.getDuetNotice();
            DuetNotice duetNotice = this.f90215l;
            if (duetNotice != null) {
                Aweme aweme = duetNotice.getAweme();
                if (aweme != null) {
                    UserVerify userVerify = new UserVerify(aweme.getAuthor().getAvatarThumb(), aweme.getAuthor().getCustomVerify(), aweme.getAuthor().getEnterpriseVerifyReason(), Integer.valueOf(aweme.getAuthor().getVerificationType()), aweme.getAuthor().getWeiboVerify());
                    this.f90211e.setUserData(userVerify);
                    this.f90211e.mo60896b();
                    TextView textView = this.f90212f;
                    User author = aweme.getAuthor();
                    C7573i.m23582a((Object) author, "it.author");
                    mo87867a(textView, author, (BaseNotice) null, (String) null, (String) null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Context context = this.f89761c;
                    C7573i.m23582a((Object) context, "context");
                    spannableStringBuilder.append(context.getResources().getString(R.string.coe));
                    mo87667a(spannableStringBuilder, baseNotice);
                    this.f90213g.setText(spannableStringBuilder);
                    RemoteImageView remoteImageView = this.f90214k;
                    Video video = aweme.getVideo();
                    C7573i.m23582a((Object) video, "it.video");
                    C23323e.m76524b(remoteImageView, video.getCover());
                }
            }
        }
    }
}
