package com.p280ss.android.ugc.aweme.notification.newstyle.delegate;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.facebook.common.util.C13337d;
import com.facebook.drawee.generic.C13438a;
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
import com.p280ss.android.ugc.aweme.notification.utils.C34633b;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder */
public final class MusSystemDetailHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final String f90068d = "enter_from";

    /* renamed from: e */
    public static final String f90069e = "guide_to_invite_third_friends";

    /* renamed from: f */
    public static final String f90070f = "type";

    /* renamed from: g */
    public static final C34520a f90071g = new C34520a(null);

    /* renamed from: k */
    private final View f90072k;

    /* renamed from: l */
    private final AvatarImageView f90073l;

    /* renamed from: m */
    private final TextView f90074m;

    /* renamed from: n */
    private final RemoteImageView f90075n;

    /* renamed from: o */
    private final DmtButton f90076o;

    /* renamed from: p */
    private final ImageView f90077p;

    /* renamed from: q */
    private final TextView f90078q;

    /* renamed from: r */
    private final ImageView f90079r;

    /* renamed from: s */
    private AnnouncementNotice f90080s;

    /* renamed from: t */
    private UserTextNotice f90081t;

    /* renamed from: u */
    private boolean f90082u;

    /* renamed from: v */
    private boolean f90083v;

    /* renamed from: w */
    private boolean f90084w;

    /* renamed from: x */
    private String f90085x;

    /* renamed from: y */
    private String f90086y;

    /* renamed from: z */
    private boolean f90087z;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder$a */
    public static final class C34520a {
        private C34520a() {
        }

        /* renamed from: a */
        public static String m111638a() {
            return MusSystemDetailHolder.f90068d;
        }

        /* renamed from: b */
        public static String m111639b() {
            return MusSystemDetailHolder.f90069e;
        }

        /* renamed from: c */
        public static String m111640c() {
            return MusSystemDetailHolder.f90070f;
        }

        public /* synthetic */ C34520a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private static void m111634b(String str) {
        C6907h.m21524a("enter_prop_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_page").mo59973a("account_type", "official_info").mo59973a("prop_id", str).mo59975b().f60753a);
    }

    /* renamed from: c */
    private static void m111635c(String str) {
        C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "notification_page").mo59973a("account_type", "official_info").mo59973a("music_id", str).mo59975b().f60753a);
    }

    public MusSystemDetailHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90072k = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90073l = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90074m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f90075n = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f90076o = (DmtButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.c5o);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f90077p = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.d_y);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f90078q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.d_x);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f90079r = (ImageView) findViewById8;
        C34615d.m111861a(this.f90072k);
        C34615d.m111861a((View) this.f90078q);
        C34615d.m111861a((View) this.f90079r);
        C34626j.m111876a(this.f90073l);
        this.f90076o.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        OnClickListener onClickListener = this;
        this.f90076o.setOnClickListener(onClickListener);
        this.f90079r.setOnClickListener(onClickListener);
        this.f90078q.setOnClickListener(onClickListener);
        this.f90072k.setOnClickListener(onClickListener);
        this.f90073l.setOnClickListener(onClickListener);
        ((C13438a) this.f90073l.getHierarchy()).mo32898b((int) R.color.g);
        this.f89662b = C43057di.m136601a(this.f89761c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e0, code lost:
        if (r5.handleClick((android.app.Activity) r4, r14.f90083v, r14.f90082u, r14.f90084w, r14.f90085x) == false) goto L_0x01eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r15)
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            boolean r0 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34531g.m111667a(r0)
            if (r0 != 0) goto L_0x001c
            android.content.Context r15 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r15 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r15, r0)
            r15.mo25750a()
            return
        L_0x001c:
            boolean r0 = com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a.m89578a(r15)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r0 = r14.f90080s
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0141
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r0.getChallenge()
            if (r4 == 0) goto L_0x007d
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
            m111636c(r5, r6, r4)
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
            java.lang.String r6 = "from_message"
            com.p280ss.android.ugc.aweme.notification.utils.C34636e.m111894a(r5, r0, r6, r4)
            goto L_0x0141
        L_0x007d:
            java.lang.String r7 = r0.getSchemaUrl()
            if (r7 != 0) goto L_0x0084
            return
        L_0x0084:
            android.net.Uri r4 = android.net.Uri.parse(r7)
            java.lang.String r5 = "mUri"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r4 = r4.getHost()
            java.lang.String r5 = "webview"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto L_0x00d9
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
            if (r0 == 0) goto L_0x0141
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
            goto L_0x0141
        L_0x00d9:
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0118
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = kotlin.text.C7634n.m23721b(r7, r5, false)
            if (r5 == 0) goto L_0x0118
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            m111634b(r0)
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
            goto L_0x0141
        L_0x0118:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x013a
            java.lang.String r4 = "aweme://music/detail/"
            boolean r4 = kotlin.text.C7634n.m23721b(r7, r4, false)
            if (r4 == 0) goto L_0x013a
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r4 = "it.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            m111635c(r0)
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r0.mo18682a(r7)
            goto L_0x0141
        L_0x013a:
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r0.mo18682a(r7)
        L_0x0141:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r0 = r14.f90081t
            if (r0 == 0) goto L_0x0412
            if (r15 == 0) goto L_0x0150
            int r4 = r15.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0151
        L_0x0150:
            r4 = r3
        L_0x0151:
            if (r4 != 0) goto L_0x0154
            goto L_0x015d
        L_0x0154:
            int r5 = r4.intValue()
            r6 = 2131300268(0x7f090fac, float:1.821856E38)
            if (r5 == r6) goto L_0x01b6
        L_0x015d:
            if (r4 != 0) goto L_0x0160
            goto L_0x016a
        L_0x0160:
            int r5 = r4.intValue()
            r6 = 2131300235(0x7f090f8b, float:1.8218494E38)
            if (r5 != r6) goto L_0x016a
            goto L_0x01b6
        L_0x016a:
            if (r4 != 0) goto L_0x016d
            goto L_0x0176
        L_0x016d:
            int r0 = r4.intValue()
            r1 = 2131301754(0x7f09157a, float:1.8221575E38)
            if (r0 == r1) goto L_0x0183
        L_0x0176:
            if (r4 != 0) goto L_0x017a
            goto L_0x0412
        L_0x017a:
            int r0 = r4.intValue()
            r1 = 2131301753(0x7f091579, float:1.8221573E38)
            if (r0 != r1) goto L_0x0412
        L_0x0183:
            android.content.Context r0 = r15.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0412
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r1 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r0 = r0.getService(r1)
            r4 = r0
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r4 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r4
            android.content.Context r15 = r15.getContext()
            if (r15 == 0) goto L_0x01ae
            r5 = r15
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r6 = r14.f90083v
            boolean r7 = r14.f90082u
            boolean r8 = r14.f90084w
            java.lang.String r9 = r14.f90085x
            r4.handleClick(r5, r6, r7, r8, r9)
            goto L_0x0412
        L_0x01ae:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r15.<init>(r0)
            throw r15
        L_0x01b6:
            android.content.Context r4 = r15.getContext()
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L_0x01eb
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r5 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r4 = r4.getService(r5)
            r5 = r4
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r5 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r5
            android.content.Context r4 = r15.getContext()
            if (r4 == 0) goto L_0x01e3
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r7 = r14.f90083v
            boolean r8 = r14.f90082u
            boolean r9 = r14.f90084w
            java.lang.String r10 = r14.f90085x
            boolean r4 = r5.handleClick(r6, r7, r8, r9, r10)
            if (r4 != 0) goto L_0x0412
            goto L_0x01eb
        L_0x01e3:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r15.<init>(r0)
            throw r15
        L_0x01eb:
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
            if (r6 == 0) goto L_0x0232
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r1 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            android.content.Context r1 = r15.getContext()
            java.lang.String r2 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Intent r0 = r0.handleAmeWebViewBrowserForDeeplink(r1, r5)
            if (r0 == 0) goto L_0x0412
            java.lang.String r1 = "bundle_user_webview_title"
            r0.putExtra(r1, r7)
            android.content.Context r15 = r15.getContext()
            r15.startActivity(r0)
            goto L_0x0412
        L_0x0232:
            boolean r6 = com.p280ss.android.ugc.aweme.utils.C43011cf.m136512a(r4)
            if (r6 == 0) goto L_0x0292
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
            goto L_0x0412
        L_0x0292:
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x02de
            java.lang.String r7 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            java.lang.String r7 = "aweme://stickers/detail/"
            boolean r7 = kotlin.text.C7634n.m23721b(r4, r7, false)
            if (r7 == 0) goto L_0x02de
            if (r0 != 0) goto L_0x02ad
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x02ad:
            java.lang.String r0 = r0.getObjectId()
            java.lang.String r1 = "it!!.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            m111634b(r0)
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
            goto L_0x0412
        L_0x02de:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x030b
            java.lang.String r7 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            java.lang.String r7 = "aweme://music/detail/"
            boolean r7 = kotlin.text.C7634n.m23721b(r4, r7, false)
            if (r7 == 0) goto L_0x030b
            if (r0 != 0) goto L_0x02f6
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x02f6:
            java.lang.String r15 = r0.getObjectId()
            java.lang.String r0 = "it!!.objectId"
            kotlin.jvm.internal.C7573i.m23582a(r15, r0)
            m111635c(r15)
            com.ss.android.ugc.aweme.router.s r15 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r15.mo18682a(r4)
            goto L_0x0412
        L_0x030b:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x038e
            java.lang.String r7 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            java.lang.String r7 = "aweme://friend/find"
            boolean r7 = kotlin.text.C7634n.m23721b(r4, r7, false)
            if (r7 == 0) goto L_0x038e
            java.lang.String r7 = "platform"
            java.lang.String r7 = r5.getQueryParameter(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "facebook"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x03a9
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r8 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getCurUser()
            java.lang.String r8 = "AccountProxyService.userService().curUser"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            int r7 = r7.getUserMode()
            if (r7 == r1) goto L_0x03a9
            com.ss.android.ugc.aweme.notification.e.a r7 = com.p280ss.android.ugc.aweme.notification.p1436e.C34439a.f89873b
            boolean r7 = r7.isFtcBindEnable()
            if (r7 == 0) goto L_0x03a9
            com.ss.android.sdk.a.b r7 = com.p280ss.android.sdk.p899a.C20098b.m66270a()
            java.lang.String r8 = "facebook"
            boolean r7 = r7.mo53819a(r8)
            if (r7 != 0) goto L_0x03a9
            java.lang.String r7 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.u r7 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r7)
            java.lang.String r8 = f90068d
            java.lang.String r9 = f90069e
            com.ss.android.ugc.aweme.router.u r7 = r7.mo18694a(r8, r9)
            java.lang.String r8 = f90070f
            java.lang.String r9 = "platform"
            java.lang.String r5 = r5.getQueryParameter(r9)
            com.ss.android.ugc.aweme.router.u r5 = r7.mo18694a(r8, r5)
            java.lang.String r7 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            java.lang.String r7 = "refer"
            java.lang.String r8 = "message"
            r5.mo18694a(r7, r8)
            com.ss.android.ugc.aweme.router.s r7 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r5 = r5.mo18695a()
            r7.mo18682a(r5)
            goto L_0x03a9
        L_0x038e:
            com.ss.android.ugc.aweme.router.u r5 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r4)
            java.lang.String r7 = "RouterUrlBuilder.newBuilder(schema)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)
            java.lang.String r7 = "refer"
            java.lang.String r8 = "message"
            r5.mo18694a(r7, r8)
            com.ss.android.ugc.aweme.router.s r7 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r5 = r5.mo18695a()
            r7.mo18682a(r5)
        L_0x03a9:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x03ef
            java.lang.String r5 = "schema"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r5 = "aweme://link_account"
            boolean r1 = kotlin.text.C7634n.m23721b(r4, r5, false)
            if (r1 == 0) goto L_0x03ef
            android.content.Context r1 = r15.getContext()
            boolean r1 = r1 instanceof android.support.p029v7.app.AppCompatActivity
            if (r1 == 0) goto L_0x03ef
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService> r2 = com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService r1 = (com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService) r1
            android.content.Context r15 = r15.getContext()
            if (r15 == 0) goto L_0x03e7
            android.support.v7.app.AppCompatActivity r15 = (android.support.p029v7.app.AppCompatActivity) r15
            android.support.v4.app.j r15 = r15.getSupportFragmentManager()
            java.lang.String r2 = "(v.context as AppCompatA…  .supportFragmentManager"
            kotlin.jvm.internal.C7573i.m23582a(r15, r2)
            java.lang.String r2 = "message"
            r1.pushOrNoticeShowLinkAccountDialog(r15, r2)
            goto L_0x03ef
        L_0x03e7:
            kotlin.TypeCastException r15 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r15.<init>(r0)
            throw r15
        L_0x03ef:
            int r15 = r0.getSubType()
            r0 = 24
            if (r15 != r0) goto L_0x0412
            java.lang.String r15 = "enter_violation_record"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "notification_page"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "message"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r15, r0)
        L_0x0412:
            java.lang.String r15 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "account_type"
            java.lang.String r2 = "official_info"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "client_order"
            int r2 = r14.getLayoutPosition()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
            java.lang.String r1 = "scene_id"
            java.lang.String r2 = "1005"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r2 = r14.f90080s
            if (r2 == 0) goto L_0x0449
            long r2 = r2.getTaskId()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            goto L_0x0455
        L_0x0449:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r2 = r14.f90081t
            if (r2 == 0) goto L_0x0455
            long r2 = r2.getTaskId()
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x0455:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59972a(r1, r3)
            java.lang.String r1 = "content_id"
            java.lang.String r2 = r14.f90086y
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "content_type"
            boolean r2 = r14.f90087z
            if (r2 == 0) goto L_0x046a
            java.lang.String r2 = "online_contract"
            goto L_0x046c
        L_0x046a:
            java.lang.String r2 = ""
        L_0x046c:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusSystemDetailHolder.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo87832a(BaseNotice baseNotice, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getAnnouncement() != null || baseNotice.getTextNotice() != null) {
            this.f90086y = baseNotice.getNid();
            this.f90087z = C34633b.m111889a(baseNotice);
            this.f90073l.setImageURI(C13337d.m39030a((int) R.drawable.ajd));
            this.f90081t = baseNotice.getTextNotice();
            UserTextNotice userTextNotice = this.f90081t;
            boolean z4 = true;
            if (userTextNotice != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f89662b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder.append(userTextNotice.getTitle());
                    if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder.append(userTextNotice.getContent());
                }
                if (this.f89662b) {
                    spannableStringBuilder.append(8297);
                }
                CharSequence schemaUrl = userTextNotice.getSchemaUrl();
                if (schemaUrl == null || schemaUrl.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    mo87667a(spannableStringBuilder, baseNotice);
                    this.f90074m.setText(spannableStringBuilder);
                    this.f90077p.setVisibility(8);
                    this.f90075n.setVisibility(8);
                    this.f90078q.setVisibility(8);
                    this.f90079r.setVisibility(8);
                    this.f90076o.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(userTextNotice.getSchemaUrl());
                        this.f90082u = parse.getBooleanQueryParameter("effects", false);
                        this.f90083v = parse.getBooleanQueryParameter("blur", false);
                        this.f90084w = parse.getBooleanQueryParameter("duet", false);
                        this.f90085x = parse.getQueryParameter("aweme_id");
                        if (!this.f90084w || TextUtils.isEmpty(this.f90085x)) {
                            C34586c.m111818a(this.f90074m, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                            this.f90077p.setVisibility(0);
                            this.f90075n.setVisibility(8);
                            this.f90078q.setVisibility(8);
                            this.f90079r.setVisibility(8);
                            this.f90076o.setVisibility(8);
                        } else {
                            C34586c.m111818a(this.f90074m, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 192.0f)));
                            this.f90077p.setVisibility(8);
                            this.f90075n.setVisibility(0);
                            this.f90078q.setVisibility(0);
                            this.f90079r.setVisibility(0);
                            this.f90076o.setVisibility(8);
                            C23323e.m76524b(this.f90075n, userTextNotice.getImageUrl());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            this.f90080s = baseNotice.getAnnouncement();
            AnnouncementNotice announcementNotice = this.f90080s;
            if (announcementNotice != null) {
                AnnouncementNotice announcement = baseNotice.getAnnouncement();
                C7573i.m23582a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                    spannableStringBuilder2.append(announcementNotice.getTitle());
                    if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                        spannableStringBuilder2.append(": ");
                    }
                    spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                }
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append(announcementNotice.getContent());
                }
                if (z2) {
                    C34615d.m111861a(this.f90072k);
                    C34586c.m111818a(this.f90074m, spannableStringBuilder2, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 192.0f)));
                    this.f90076o.setVisibility(0);
                    this.f90075n.setVisibility(8);
                    this.f90077p.setVisibility(8);
                } else if (announcementNotice.getImageUrl() != null) {
                    C34615d.m111861a(this.f90072k);
                    C34586c.m111818a(this.f90074m, spannableStringBuilder2, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 160.0f)));
                    this.f90076o.setVisibility(8);
                    this.f90075n.setVisibility(0);
                    this.f90077p.setVisibility(8);
                    C23323e.m76524b(this.f90075n, announcementNotice.getImageUrl());
                } else {
                    CharSequence schemaUrl2 = announcementNotice.getSchemaUrl();
                    if (!(schemaUrl2 == null || schemaUrl2.length() == 0)) {
                        z4 = false;
                    }
                    if (z4) {
                        this.f90072k.setOnTouchListener(null);
                        C34615d.m111863b(this.f90072k);
                        mo87667a(spannableStringBuilder2, baseNotice);
                        this.f90074m.setText(spannableStringBuilder2);
                        this.f90076o.setVisibility(8);
                        this.f90075n.setVisibility(8);
                        this.f90077p.setVisibility(8);
                    } else {
                        C34615d.m111861a(this.f90072k);
                        C34586c.m111818a(this.f90074m, spannableStringBuilder2, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                        this.f90076o.setVisibility(8);
                        this.f90075n.setVisibility(8);
                        this.f90077p.setVisibility(0);
                    }
                }
            }
            String str2 = "official_message_inner_message";
            C22984d a = C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", "official_info").mo59970a("client_order", getLayoutPosition()).mo59973a("scene_id", "1005").mo59971a("task_id", baseNotice.getTaskId()).mo59973a("content_id", baseNotice.getNid());
            String str3 = "content_type";
            if (this.f90087z) {
                str = "online_contract";
            } else {
                str = "";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: c */
    private static void m111636c(String str, String str2, String str3) {
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("account_type", "official_info").mo59973a("tag_id", str).mo59973a("process_id", str3).mo59975b().f60753a);
    }
}
