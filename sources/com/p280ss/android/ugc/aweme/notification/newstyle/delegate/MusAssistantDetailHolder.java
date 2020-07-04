package com.p280ss.android.ugc.aweme.notification.newstyle.delegate;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34586c;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusAssistantDetailHolder */
public final class MusAssistantDetailHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final C34519a f90052d = new C34519a(null);

    /* renamed from: e */
    private final View f90053e;

    /* renamed from: f */
    private final AvatarImageView f90054f;

    /* renamed from: g */
    private final TextView f90055g;

    /* renamed from: k */
    private final RemoteImageView f90056k;

    /* renamed from: l */
    private final Button f90057l;

    /* renamed from: m */
    private final ImageView f90058m;

    /* renamed from: n */
    private final TextView f90059n;

    /* renamed from: o */
    private final ImageView f90060o;

    /* renamed from: p */
    private AnnouncementNotice f90061p;

    /* renamed from: q */
    private UserTextNotice f90062q;

    /* renamed from: r */
    private String f90063r;

    /* renamed from: s */
    private boolean f90064s;

    /* renamed from: t */
    private boolean f90065t;

    /* renamed from: u */
    private boolean f90066u;

    /* renamed from: v */
    private String f90067v;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusAssistantDetailHolder$a */
    public static final class C34519a {
        private C34519a() {
        }

        public /* synthetic */ C34519a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private static void m111630b(String str) {
        C6907h.m21524a("enter_prop_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_page").mo59973a("account_type", "douyin_assistant").mo59973a("prop_id", str).mo59975b().f60753a);
    }

    /* renamed from: c */
    private static void m111631c(String str) {
        C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_page").mo59973a("account_type", "douyin_assistant").mo59973a("music_id", str).mo59975b().f60753a);
    }

    public MusAssistantDetailHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90053e = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90054f = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90055g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f90056k = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f90057l = (Button) findViewById5;
        View findViewById6 = view.findViewById(R.id.c5o);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f90058m = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.d_y);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f90059n = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.d_x);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f90060o = (ImageView) findViewById8;
        this.f90057l.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        C34626j.m111876a(this.f90054f);
        C34626j.m111876a(this.f90057l);
        OnClickListener onClickListener = this;
        this.f90057l.setOnClickListener(onClickListener);
        this.f90053e.setOnClickListener(onClickListener);
        this.f90054f.setOnClickListener(onClickListener);
        this.f89662b = C43057di.m136601a(this.f89761c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d7, code lost:
        if (r5.handleClick((android.app.Activity) r4, r14.f90065t, r14.f90064s, r14.f90066u, r14.f90067v) == false) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r15)
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            boolean r0 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34530f.m111666a(r0)
            if (r0 != 0) goto L_0x001a
            android.content.Context r15 = r14.f89761c
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r15 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r15, r0)
            r15.mo25750a()
            return
        L_0x001a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r0 = r14.f90061p
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r0.getChallenge()
            if (r4 == 0) goto L_0x0074
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r0.getChallenge()
            java.lang.String r6 = "it.challenge"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getCid()
            java.lang.String r6 = "it.challenge.cid"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r6 = "notification_page"
            m111632c(r5, r6, r4)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil> r6 = com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r5 = (com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil) r5
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = r0.getChallenge()
            r5.markCommerce(r6)
            android.content.Context r5 = r14.f89761c
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            java.lang.String r6 = "it.challenge"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
            java.lang.String r0 = r0.getCid()
            java.lang.String r6 = "message"
            com.p280ss.android.ugc.aweme.notification.utils.C34636e.m111894a(r5, r0, r6, r4)
            goto L_0x0138
        L_0x0074:
            java.lang.String r7 = r0.getSchemaUrl()
            if (r7 != 0) goto L_0x007b
            return
        L_0x007b:
            android.net.Uri r4 = android.net.Uri.parse(r7)
            java.lang.String r5 = "mUri"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r4 = r4.getHost()
            java.lang.String r5 = "webview"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r4 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r4)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.view.View r4 = r14.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            android.content.Context r4 = r4.getContext()
            android.net.Uri r5 = android.net.Uri.parse(r7)
            android.content.Intent r0 = r0.handleAmeWebViewBrowser(r4, r5)
            if (r0 == 0) goto L_0x0138
            java.lang.String r4 = "hide_more"
            r0.putExtra(r4, r2)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "notification"
            r0.putExtra(r4, r5)
            android.view.View r4 = r14.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            android.content.Context r4 = r4.getContext()
            r4.startActivity(r0)
            goto L_0x0138
        L_0x00d0:
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x010f
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = kotlin.text.C7634n.m23721b(r7, r5, false)
            if (r5 == 0) goto L_0x010f
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            m111630b(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r4 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r4)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r4 = r14.f89761c
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r8 = "aweme://stickers/detail/"
            java.lang.String r9 = "sslocal://stickers/detail/"
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r5 = kotlin.text.C7634n.m23711a(r7, r8, r9, false)
            r0.startAdsAppActivity(r4, r5)
            goto L_0x0138
        L_0x010f:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0131
            java.lang.String r4 = "aweme://music/detail/"
            boolean r4 = kotlin.text.C7634n.m23721b(r7, r4, false)
            if (r4 == 0) goto L_0x0131
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            m111631c(r0)
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r0.mo18682a(r7)
            goto L_0x0138
        L_0x0131:
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r0.mo18682a(r7)
        L_0x0138:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r0 = r14.f90062q
            if (r0 == 0) goto L_0x03ef
            if (r15 == 0) goto L_0x0147
            int r4 = r15.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0148
        L_0x0147:
            r4 = r3
        L_0x0148:
            if (r4 != 0) goto L_0x014b
            goto L_0x0154
        L_0x014b:
            int r5 = r4.intValue()
            r6 = 2131300268(0x7f090fac, float:1.821856E38)
            if (r5 == r6) goto L_0x01ad
        L_0x0154:
            if (r4 != 0) goto L_0x0157
            goto L_0x0161
        L_0x0157:
            int r5 = r4.intValue()
            r6 = 2131300235(0x7f090f8b, float:1.8218494E38)
            if (r5 != r6) goto L_0x0161
            goto L_0x01ad
        L_0x0161:
            if (r4 != 0) goto L_0x0164
            goto L_0x016d
        L_0x0164:
            int r0 = r4.intValue()
            r1 = 2131301754(0x7f09157a, float:1.8221575E38)
            if (r0 == r1) goto L_0x017a
        L_0x016d:
            if (r4 != 0) goto L_0x0171
            goto L_0x03ef
        L_0x0171:
            int r0 = r4.intValue()
            r1 = 2131301753(0x7f091579, float:1.8221573E38)
            if (r0 != r1) goto L_0x03ef
        L_0x017a:
            android.content.Context r0 = r15.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x03ef
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r1 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r0 = r0.getService(r1)
            r4 = r0
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r4
            android.content.Context r15 = r15.getContext()
            if (r15 == 0) goto L_0x01a5
            r5 = r15
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r14.f90065t
            boolean r7 = r14.f90064s
            boolean r8 = r14.f90066u
            java.lang.String r9 = r14.f90067v
            r4.handleClick(r5, r6, r7, r8, r9)
            goto L_0x03ef
        L_0x01a5:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r15.<init>(r0)
            throw r15
        L_0x01ad:
            android.content.Context r4 = r15.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x01e2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r5 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r4 = r4.getService(r5)
            r5 = r4
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r5 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r5
            android.content.Context r4 = r15.getContext()
            if (r4 == 0) goto L_0x01da
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r7 = r14.f90065t
            boolean r8 = r14.f90064s
            boolean r9 = r14.f90066u
            java.lang.String r10 = r14.f90067v
            boolean r4 = r5.handleClick(r6, r7, r8, r9, r10)
            if (r4 != 0) goto L_0x03ef
            goto L_0x01e2
        L_0x01da:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r15.<init>(r0)
            throw r15
        L_0x01e2:
            java.lang.String r4 = r0.getSchemaUrl()
            android.net.Uri r5 = android.net.Uri.parse(r4)
            java.lang.String r6 = "webview"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            java.lang.String r7 = r5.getHost()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x022c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r1 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r1 = r15.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Intent r0 = r0.handleAmeWebViewBrowserForDeeplink(r1, r5)
            if (r0 != 0) goto L_0x021e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x021e:
            java.lang.String r1 = "bundle_user_webview_title"
            r0.putExtra(r1, r7)
            android.content.Context r15 = r15.getContext()
            r15.startActivity(r0)
            goto L_0x03ef
        L_0x022c:
            boolean r6 = com.p280ss.android.ugc.aweme.utils.C43011cf.m136512a(r4)
            if (r6 == 0) goto L_0x028c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter> r1 = com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r0 = (com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter) r0
            r0.setLivePermission(r7)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r0 = "shoot_way"
            java.lang.String r1 = "direct_shoot"
            r10.putExtra(r0, r1)
            java.lang.String r0 = "to_live"
            r10.putExtra(r0, r7)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…e(IAVService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            boolean r13 = r0.isRecording()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…e(IAVService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService r8 = r0.getVideoRecordEntranceService()
            android.content.Context r9 = r15.getContext()
            java.lang.String r15 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r9, r15)
            r11 = 1
            r12 = 1
            r8.notifyToolPermissionActivity(r9, r10, r11, r12, r13)
            goto L_0x03ef
        L_0x028c:
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x02d8
            java.lang.String r7 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            java.lang.String r7 = "aweme://stickers/detail/"
            boolean r7 = kotlin.text.C7634n.m23721b(r4, r7, false)
            if (r7 == 0) goto L_0x02d8
            if (r0 != 0) goto L_0x02a7
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x02a7:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r1 = "it!!.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            m111630b(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r1 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r15 = r15.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r15, r1)
            java.lang.String r5 = "aweme://stickers/detail/"
            java.lang.String r6 = "sslocal://stickers/detail/"
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r1 = kotlin.text.C7634n.m23711a(r4, r5, r6, false)
            r0.startAdsAppActivity(r15, r1)
            goto L_0x03ef
        L_0x02d8:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0305
            java.lang.String r7 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            java.lang.String r7 = "aweme://music/detail/"
            boolean r7 = kotlin.text.C7634n.m23721b(r4, r7, false)
            if (r7 == 0) goto L_0x0305
            if (r0 != 0) goto L_0x02f0
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x02f0:
            java.lang.String r15 = r0.getObjectId()
            java.lang.String r0 = "it!!.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r15, r0)
            m111631c(r15)
            com.ss.android.ugc.aweme.router.s r15 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r15.mo18682a(r4)
            goto L_0x03ef
        L_0x0305:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x038e
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            java.lang.String r0 = "aweme://friend/find"
            boolean r0 = kotlin.text.C7634n.m23721b(r4, r0, false)
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = "platform"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r7 = "facebook"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r0 = android.text.TextUtils.equals(r0, r7)
            if (r0 == 0) goto L_0x03a9
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r7 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r7)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r7 = "AccountProxyService.userService().curUser"
            kotlin.jvm.internal.C7573i.m23582a(r0, r7)
            int r0 = r0.getUserMode()
            if (r0 == r1) goto L_0x03a9
            com.ss.android.ugc.aweme.notification.e.a r0 = com.p280ss.android.ugc.aweme.notification.p1436e.C34439a.f89873b
            boolean r0 = r0.isFtcBindEnable()
            if (r0 == 0) goto L_0x03a9
            com.ss.android.sdk.a.b r0 = com.p280ss.android.sdk.p899a.C20098b.m66270a()
            java.lang.String r7 = "facebook"
            boolean r0 = r0.mo53819a(r7)
            if (r0 != 0) goto L_0x03a9
            java.lang.String r0 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.u r0 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r0)
            java.lang.String r7 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder.C34520a.m111638a()
            java.lang.String r8 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder.C34520a.m111639b()
            com.ss.android.ugc.aweme.router.u r0 = r0.mo18694a(r7, r8)
            java.lang.String r7 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder.C34520a.m111640c()
            java.lang.String r8 = "platform"
            java.lang.String r5 = r5.getQueryParameter(r8)
            com.ss.android.ugc.aweme.router.u r0 = r0.mo18694a(r7, r5)
            java.lang.String r5 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            java.lang.String r5 = "refer"
            java.lang.String r7 = "message"
            r0.mo18694a(r5, r7)
            com.ss.android.ugc.aweme.router.s r5 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r0 = r0.mo18695a()
            r5.mo18682a(r0)
            goto L_0x03a9
        L_0x038e:
            com.ss.android.ugc.aweme.router.u r0 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r4)
            java.lang.String r5 = "RouterUrlBuilder.newBuilder(schema)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            java.lang.String r5 = "refer"
            java.lang.String r7 = "message"
            r0.mo18694a(r5, r7)
            com.ss.android.ugc.aweme.router.s r5 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r0 = r0.mo18695a()
            r5.mo18682a(r0)
        L_0x03a9:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x03ef
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            java.lang.String r0 = "aweme://link_account"
            boolean r0 = kotlin.text.C7634n.m23721b(r4, r0, false)
            if (r0 == 0) goto L_0x03ef
            android.content.Context r0 = r15.getContext()
            boolean r0 = r0 instanceof android.support.p029v7.app.AppCompatActivity
            if (r0 == 0) goto L_0x03ef
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService> r1 = com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService r0 = (com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService) r0
            android.content.Context r15 = r15.getContext()
            if (r15 == 0) goto L_0x03e7
            android.support.v7.app.AppCompatActivity r15 = (android.support.p029v7.app.AppCompatActivity) r15
            android.support.v4.app.j r15 = r15.getSupportFragmentManager()
            java.lang.String r1 = "(v.context as AppCompatA…  .supportFragmentManager"
            kotlin.jvm.internal.C7573i.m23582a(r15, r1)
            java.lang.String r1 = "message"
            r0.pushOrNoticeShowLinkAccountDialog(r15, r1)
            goto L_0x03ef
        L_0x03e7:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r15.<init>(r0)
            throw r15
        L_0x03ef:
            java.lang.String r15 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "account_type"
            java.lang.String r2 = "douyin_assistant"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "client_order"
            int r2 = r14.getLayoutPosition()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
            java.lang.String r1 = "scene_id"
            java.lang.String r2 = "1005"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r2 = r14.f90061p
            if (r2 == 0) goto L_0x0426
            long r2 = r2.getTaskId()
        L_0x0421:
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            goto L_0x042f
        L_0x0426:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r2 = r14.f90062q
            if (r2 == 0) goto L_0x042f
            long r2 = r2.getTaskId()
            goto L_0x0421
        L_0x042f:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59972a(r1, r3)
            java.lang.String r1 = "content_id"
            java.lang.String r2 = r14.f90063r
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusAssistantDetailHolder.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo87831a(BaseNotice baseNotice, boolean z) {
        boolean z2;
        boolean z3;
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            this.f90063r = baseNotice.getNid();
            this.f90054f.setImageURI(C13337d.m39030a((int) R.drawable.bc4));
            this.f90061p = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f90061p;
            boolean z4 = true;
            if (announcementNotice != null) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C7573i.m23582a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f89662b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder.append(announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append(announcementNotice.getContent());
                }
                if (this.f89662b) {
                    spannableStringBuilder.append(8297);
                }
                if (z2) {
                    C34615d.m111861a(this.f90053e);
                    C34586c.m111818a(this.f90055g, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 192.0f)));
                    this.f90057l.setVisibility(0);
                    this.f90056k.setVisibility(8);
                    this.f90058m.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C34615d.m111861a(this.f90053e);
                    C34586c.m111818a(this.f90055g, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 160.0f)));
                    this.f90057l.setVisibility(8);
                    this.f90056k.setVisibility(0);
                    this.f90058m.setVisibility(8);
                    C23323e.m76524b(this.f90056k, announcementNotice.getImageUrl());
                } else {
                    CharSequence schemaUrl = announcementNotice.getSchemaUrl();
                    if (schemaUrl == null || schemaUrl.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        this.f90053e.setOnTouchListener(null);
                        C34615d.m111863b(this.f90053e);
                        mo87667a(spannableStringBuilder, baseNotice);
                        this.f90055g.setText(spannableStringBuilder);
                        this.f90057l.setVisibility(8);
                        this.f90056k.setVisibility(8);
                        this.f90058m.setVisibility(8);
                    } else {
                        C34615d.m111861a(this.f90053e);
                        C34586c.m111818a(this.f90055g, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                        this.f90057l.setVisibility(8);
                        this.f90056k.setVisibility(8);
                        this.f90058m.setVisibility(0);
                    }
                }
            }
            this.f90062q = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f90062q;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append(userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append(userTextNotice.getContent());
                }
                CharSequence schemaUrl2 = userTextNotice.getSchemaUrl();
                if (!(schemaUrl2 == null || schemaUrl2.length() == 0)) {
                    z4 = false;
                }
                if (z4) {
                    mo87667a(spannableStringBuilder2, baseNotice);
                    this.f90055g.setText(spannableStringBuilder2);
                    this.f90058m.setVisibility(8);
                    this.f90056k.setVisibility(8);
                    this.f90059n.setVisibility(8);
                    this.f90060o.setVisibility(8);
                    this.f90057l.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                        this.f90064s = parse.getBooleanQueryParameter("effects", false);
                        this.f90065t = parse.getBooleanQueryParameter("blur", false);
                        this.f90066u = parse.getBooleanQueryParameter("duet", false);
                        this.f90067v = parse.getQueryParameter("aweme_id");
                        if (!this.f90066u || TextUtils.isEmpty(this.f90067v)) {
                            C34586c.m111818a(this.f90055g, spannableStringBuilder2, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                            this.f90058m.setVisibility(0);
                            this.f90056k.setVisibility(8);
                            this.f90059n.setVisibility(8);
                            this.f90060o.setVisibility(8);
                            this.f90057l.setVisibility(8);
                        } else {
                            C34586c.m111818a(this.f90055g, spannableStringBuilder2, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 192.0f)));
                            this.f90058m.setVisibility(8);
                            this.f90056k.setVisibility(0);
                            this.f90059n.setVisibility(0);
                            this.f90060o.setVisibility(0);
                            this.f90057l.setVisibility(8);
                            C23323e.m76524b(this.f90056k, userTextNotice.getImageUrl());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", "douyin_assistant").mo59970a("client_order", getLayoutPosition()).mo59973a("scene_id", "1005").mo59971a("task_id", baseNotice.getTaskId()).mo59973a("content_id", this.f90063r).f60753a);
        }
    }

    /* renamed from: c */
    private static void m111632c(String str, String str2, String str3) {
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("account_type", "douyin_assistant").mo59973a("tag_id", str).mo59973a("process_id", str3).mo59975b().f60753a);
    }
}
