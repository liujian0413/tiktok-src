package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity.C34493a;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder */
public final class MusNewAssistantNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: e */
    public static final C34581a f90272e = new C34581a(null);

    /* renamed from: d */
    public final boolean f90273d;

    /* renamed from: f */
    private final View f90274f;

    /* renamed from: g */
    private final AvatarImageView f90275g;

    /* renamed from: k */
    private final TextView f90276k;

    /* renamed from: l */
    private AnnouncementNotice f90277l;

    /* renamed from: m */
    private UserTextNotice f90278m;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder$a */
    public static final class C34581a {
        private C34581a() {
        }

        public /* synthetic */ C34581a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34595k.m111826a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        if (view != null) {
            C34493a aVar = MusNotificationDetailActivity.f89965a;
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "it.context");
            aVar.mo87802a(context, 46, C33213d.m107132a().mo85008c(46));
        }
        C6907h.m21524a("enter_official_message", (Map) C22984d.m75611a().mo59973a("account_type", "douyin_assistant").mo59970a("client_order", getLayoutPosition()).mo59973a("scene_id", "1004").f60753a);
    }

    public MusNewAssistantNotificationHolder(View view, boolean z) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f90273d = z;
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90274f = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90275g = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90276k = (TextView) findViewById3;
        C34615d.m111861a(this.f90274f);
        C34626j.m111876a(this.f90275g);
        OnClickListener onClickListener = this;
        this.f90274f.setOnClickListener(onClickListener);
        this.f90275g.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo87881a(BaseNotice baseNotice, boolean z) {
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            if (baseNotice.getAnnouncement() != null && this.f90273d) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C7573i.m23582a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() == null) {
                    return;
                }
            }
            this.f90277l = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f90277l;
            if (announcementNotice != null) {
                this.f90275g.setImageURI(C13337d.m39030a((int) R.drawable.bc4));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f89761c;
                C7573i.m23582a((Object) context, "context");
                spannableStringBuilder.append(context.getResources().getString(R.string.cp3)).append(": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(8296);
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append(announcementNotice.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append(8297);
                C34586c.m111818a(this.f90276k, spannableStringBuilder, baseNotice, 5, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
            }
            this.f90278m = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f90278m;
            if (userTextNotice != null) {
                this.f90275g.setImageURI(C13337d.m39030a((int) R.drawable.bc4));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f89761c;
                C7573i.m23582a((Object) context2, "context");
                spannableStringBuilder2.append(context2.getResources().getString(R.string.cp3)).append(": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append(userTextNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append(8297);
                C34586c.m111818a(this.f90276k, spannableStringBuilder2, baseNotice, 5, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
            }
        }
    }
}
