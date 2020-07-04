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
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTextNotificationHolder */
public final class MusNewTextNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final C34583a f90306d = new C34583a(null);

    /* renamed from: e */
    private final View f90307e;

    /* renamed from: f */
    private final AvatarImageView f90308f;

    /* renamed from: g */
    private final TextView f90309g;

    /* renamed from: k */
    private UserTextNotice f90310k;

    /* renamed from: l */
    private AnnouncementNotice f90311l;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTextNotificationHolder$a */
    public static final class C34583a {
        private C34583a() {
        }

        public /* synthetic */ C34583a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    public MusNewTextNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90307e = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90308f = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90309g = (TextView) findViewById3;
        C34615d.m111861a(this.f90307e);
        C34626j.m111876a(this.f90308f);
        OnClickListener onClickListener = this;
        this.f90307e.setOnClickListener(onClickListener);
        this.f90308f.setOnClickListener(onClickListener);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34600p.m111831a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
        } else if (!C27326a.m89578a(view)) {
            if (view != null) {
                C34493a aVar = MusNotificationDetailActivity.f89965a;
                Context context = view.getContext();
                C7573i.m23582a((Object) context, "it.context");
                aVar.mo87802a(context, 47, C33213d.m107132a().mo85008c(47));
            }
            C6907h.m21524a("enter_official_message", (Map) C22984d.m75611a().mo59973a("account_type", "official_info").mo59970a("client_order", getLayoutPosition()).mo59973a("scene_id", "1004").f60753a);
        }
    }

    /* renamed from: a */
    public final void mo87886a(BaseNotice baseNotice, boolean z) {
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            this.f90310k = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f90310k;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f89761c;
                C7573i.m23582a((Object) context, "context");
                spannableStringBuilder.append(context.getResources().getString(R.string.cpa)).append(": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder.append(userTextNotice.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append(8297);
                C34586c.m111818a(this.f90309g, spannableStringBuilder, baseNotice, 5, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                this.f90308f.setImageURI(C13337d.m39030a((int) R.drawable.ajd));
            }
            this.f90311l = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f90311l;
            if (announcementNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f89761c;
                C7573i.m23582a((Object) context2, "context");
                spannableStringBuilder2.append(context2.getResources().getString(R.string.cp3)).append(": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(8296);
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append(announcementNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append(8297);
                C34586c.m111818a(this.f90309g, spannableStringBuilder2, baseNotice, 5, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                this.f90308f.setImageURI(C13337d.m39030a((int) R.drawable.ajd));
            }
        }
    }
}
