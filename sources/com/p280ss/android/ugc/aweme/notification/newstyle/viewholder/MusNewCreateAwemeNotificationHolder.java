package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCreateAwemeNotificationHolder */
public final class MusNewCreateAwemeNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90287d;

    /* renamed from: e */
    private final AvatarImageWithVerify f90288e;

    /* renamed from: f */
    private final TextView f90289f;

    /* renamed from: g */
    private final TextView f90290g;

    /* renamed from: k */
    private final RemoteImageView f90291k;

    /* renamed from: l */
    private PostNotice f90292l;

    public MusNewCreateAwemeNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90287d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90288e = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90289f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90290g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_cover)");
        this.f90291k = (RemoteImageView) findViewById5;
        C34615d.m111861a(this.f90287d);
        C34626j.m111876a(this.f90288e);
        C34626j.m111876a(this.f90291k);
        OnClickListener onClickListener = this;
        this.f90291k.setOnClickListener(onClickListener);
        this.f90287d.setOnClickListener(onClickListener);
        this.f90288e.setOnClickListener(onClickListener);
        this.f90288e.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f90288e.mo60896b();
        ((C13438a) this.f90291k.getHierarchy()).mo32898b((int) R.color.ee);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34597m.m111828a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        PostNotice postNotice = this.f90292l;
        if (postNotice != null) {
            Aweme aweme = postNotice.getAweme();
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
    public final void mo87883a(MusNotice musNotice, boolean z) {
        C7573i.m23587b(musNotice, "notice");
        if (musNotice.getPostNotice() != null) {
            this.f90292l = musNotice.getPostNotice();
            PostNotice postNotice = this.f90292l;
            if (postNotice != null) {
                Aweme aweme = postNotice.getAweme();
                if (aweme != null) {
                    UserVerify userVerify = new UserVerify(aweme.getAuthor().getAvatarThumb(), aweme.getAuthor().getCustomVerify(), aweme.getAuthor().getEnterpriseVerifyReason(), Integer.valueOf(aweme.getAuthor().getVerificationType()), aweme.getAuthor().getWeiboVerify());
                    this.f90288e.setUserData(userVerify);
                    TextView textView = this.f90289f;
                    User author = aweme.getAuthor();
                    C7573i.m23582a((Object) author, "it.author");
                    mo87867a(textView, author, (BaseNotice) null, (String) null, (String) null);
                    if (aweme.getVideo() != null) {
                        RemoteImageView remoteImageView = this.f90291k;
                        Video video = aweme.getVideo();
                        C7573i.m23582a((Object) video, "it.video");
                        C23323e.m76524b(remoteImageView, video.getOriginCover());
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(this.f89761c.getString(R.string.cpv));
                    mo87667a(spannableStringBuilder, (BaseNotice) musNotice);
                    this.f90290g.setText(spannableStringBuilder);
                }
            }
        }
    }
}
