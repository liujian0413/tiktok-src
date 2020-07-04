package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusTutorialVideoHolder */
public final class MusTutorialVideoHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90312d;

    /* renamed from: e */
    private final AvatarImageView f90313e;

    /* renamed from: f */
    private final DmtTextView f90314f;

    /* renamed from: g */
    private final DmtButton f90315g;

    /* renamed from: k */
    private TutorialVideoInfo f90316k;

    /* renamed from: l */
    private TutorialVideoViewModel f90317l;

    /* renamed from: m */
    private Context f90318m;

    /* renamed from: n */
    private String f90319n = "";

    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    /* renamed from: c */
    public final int mo87655c() {
        return R.id.c7r;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34601q.m111832a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        if (!TextUtils.isEmpty(this.f90319n)) {
            TutorialVideoViewModel tutorialVideoViewModel = this.f90317l;
            if (tutorialVideoViewModel != null) {
                tutorialVideoViewModel.mo87893a(2);
            }
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f90319n);
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "fans").mo18695a());
            m111811b("enter_teach_video", this.f90319n);
        }
    }

    public MusTutorialVideoHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90312d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90313e = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90314f = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_button)");
        this.f90315g = (DmtButton) findViewById4;
        C34615d.m111861a(this.f90312d);
        C34626j.m111876a(this.f90313e);
        C34626j.m111876a(this.f90315g);
        OnClickListener onClickListener = this;
        this.f90315g.setOnClickListener(onClickListener);
        this.f90312d.setOnClickListener(onClickListener);
        this.f90313e.setOnClickListener(onClickListener);
        this.f90315g.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        this.f90317l = new TutorialVideoViewModel();
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f90318m = context;
    }

    /* renamed from: b */
    private static void m111811b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("group_id", str2).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo87887a(MusNotice musNotice, boolean z) {
        C7573i.m23587b(musNotice, "notice");
        TutorialVideoResp tutorialVideo = musNotice.getTutorialVideo();
        if (tutorialVideo != null) {
            TutorialVideoInfo info = tutorialVideo.getInfo();
            if (info != null) {
                this.f90316k = info;
                TutorialVideoInfo tutorialVideoInfo = this.f90316k;
                if (tutorialVideoInfo != null) {
                    this.f90319n = tutorialVideoInfo.getAwemeId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(tutorialVideoInfo.getTitle());
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(tutorialVideoInfo.getContent());
                    this.f90314f.setText(spannableStringBuilder);
                    this.f90313e.setImageURI(C13337d.m39030a((int) R.drawable.bc4));
                    this.f90315g.setText(tutorialVideoInfo.getButton());
                }
                m111811b("show_teach_video", this.f90319n);
            }
        }
    }
}
