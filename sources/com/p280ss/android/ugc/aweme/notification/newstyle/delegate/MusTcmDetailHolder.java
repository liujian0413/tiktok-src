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
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34586c;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusTcmDetailHolder */
public final class MusTcmDetailHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final String f90088d = "enter_from";

    /* renamed from: e */
    public static final String f90089e = "guide_to_invite_third_friends";

    /* renamed from: f */
    public static final String f90090f = "type";

    /* renamed from: g */
    public static final C34521a f90091g = new C34521a(null);

    /* renamed from: k */
    private final View f90092k;

    /* renamed from: l */
    private final AvatarImageView f90093l;

    /* renamed from: m */
    private final TextView f90094m;

    /* renamed from: n */
    private final RemoteImageView f90095n;

    /* renamed from: o */
    private final DmtButton f90096o;

    /* renamed from: p */
    private final ImageView f90097p;

    /* renamed from: q */
    private final TextView f90098q;

    /* renamed from: r */
    private final ImageView f90099r;

    /* renamed from: s */
    private C34366n f90100s;

    /* renamed from: t */
    private boolean f90101t;

    /* renamed from: u */
    private boolean f90102u;

    /* renamed from: v */
    private boolean f90103v;

    /* renamed from: w */
    private String f90104w;

    /* renamed from: x */
    private String f90105x;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusTcmDetailHolder$a */
    public static final class C34521a {
        private C34521a() {
        }

        public /* synthetic */ C34521a(C7571f fVar) {
            this();
        }
    }

    public MusTcmDetailHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90092k = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90093l = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90094m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.f90095n = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c5q);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.notification_button)");
        this.f90096o = (DmtButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.c5o);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.f90097p = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.d_y);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        this.f90098q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.d_x);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.f90099r = (ImageView) findViewById8;
        C34615d.m111861a(this.f90092k);
        C34615d.m111861a((View) this.f90098q);
        C34615d.m111861a((View) this.f90099r);
        C34626j.m111876a(this.f90093l);
        this.f90096o.getLayoutParams().width = C34615d.m111860a(this.f89761c);
        OnClickListener onClickListener = this;
        this.f90096o.setOnClickListener(onClickListener);
        this.f90099r.setOnClickListener(onClickListener);
        this.f90098q.setOnClickListener(onClickListener);
        this.f90092k.setOnClickListener(onClickListener);
        this.f90093l.setOnClickListener(onClickListener);
        this.f89662b = C43057di.m136601a(this.f89761c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r3.handleClick((android.app.Activity) r2, r12.f90102u, r12.f90101t, r12.f90103v, r12.f90104w) == false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            boolean r0 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34532h.m111668a(r0)
            if (r0 != 0) goto L_0x001c
            android.content.Context r13 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r13, r0)
            r13.mo25750a()
            return
        L_0x001c:
            boolean r0 = com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a.m89578a(r13)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            com.ss.android.ugc.aweme.notice.repo.list.bean.n r0 = r12.f90100s
            if (r0 == 0) goto L_0x02e4
            r1 = 0
            if (r13 == 0) goto L_0x0033
            int r2 = r13.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            if (r2 != 0) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            int r3 = r2.intValue()
            r4 = 2131300268(0x7f090fac, float:1.821856E38)
            if (r3 == r4) goto L_0x0099
        L_0x0040:
            if (r2 != 0) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            int r3 = r2.intValue()
            r4 = 2131300235(0x7f090f8b, float:1.8218494E38)
            if (r3 != r4) goto L_0x004d
            goto L_0x0099
        L_0x004d:
            if (r2 != 0) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r1 = r2.intValue()
            r3 = 2131301754(0x7f09157a, float:1.8221575E38)
            if (r1 == r3) goto L_0x0066
        L_0x0059:
            if (r2 != 0) goto L_0x005d
            goto L_0x02a3
        L_0x005d:
            int r1 = r2.intValue()
            r2 = 2131301753(0x7f091579, float:1.8221573E38)
            if (r1 != r2) goto L_0x02a3
        L_0x0066:
            android.content.Context r1 = r13.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x02a3
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r2 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r1 = r1.getService(r2)
            r2 = r1
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r2 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r2
            android.content.Context r13 = r13.getContext()
            if (r13 == 0) goto L_0x0091
            r3 = r13
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r4 = r12.f90102u
            boolean r5 = r12.f90101t
            boolean r6 = r12.f90103v
            java.lang.String r7 = r12.f90104w
            r2.handleClick(r3, r4, r5, r6, r7)
            goto L_0x02a3
        L_0x0091:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r13.<init>(r0)
            throw r13
        L_0x0099:
            android.content.Context r2 = r13.getContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper> r3 = com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper.class
            java.lang.Object r2 = r2.getService(r3)
            r3 = r2
            com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper r3 = (com.p280ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper) r3
            android.content.Context r2 = r13.getContext()
            if (r2 == 0) goto L_0x00c6
            r4 = r2
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r5 = r12.f90102u
            boolean r6 = r12.f90101t
            boolean r7 = r12.f90103v
            java.lang.String r8 = r12.f90104w
            boolean r2 = r3.handleClick(r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x02a3
            goto L_0x00ce
        L_0x00c6:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            r13.<init>(r0)
            throw r13
        L_0x00ce:
            java.lang.String r2 = r0.f89566c
            android.net.Uri r3 = android.net.Uri.parse(r2)
            java.lang.String r4 = "webview"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.lang.String r5 = r3.getHost()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            r5 = 1
            if (r4 == 0) goto L_0x0113
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r2 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r1
            android.content.Context r2 = r13.getContext()
            java.lang.String r4 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            android.content.Intent r1 = r1.handleAmeWebViewBrowserForDeeplink(r2, r3)
            if (r1 == 0) goto L_0x02a3
            java.lang.String r2 = "bundle_user_webview_title"
            r1.putExtra(r2, r5)
            android.content.Context r13 = r13.getContext()
            r13.startActivity(r1)
            goto L_0x02a3
        L_0x0113:
            boolean r4 = com.p280ss.android.ugc.aweme.utils.C43011cf.m136512a(r2)
            if (r4 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter> r2 = com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter r1 = (com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter) r1
            r1.setLivePermission(r5)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r1 = "shoot_way"
            java.lang.String r2 = "direct_shoot"
            r8.putExtra(r1, r2)
            java.lang.String r1 = "to_live"
            r8.putExtra(r1, r5)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            java.lang.String r2 = "ServiceManager.get().get…e(IAVService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            boolean r11 = r1.isRecording()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r1 = r1.getService(r2)
            java.lang.String r2 = "ServiceManager.get().get…e(IAVService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService r6 = r1.getVideoRecordEntranceService()
            android.content.Context r7 = r13.getContext()
            java.lang.String r13 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r7, r13)
            r9 = 1
            r10 = 1
            r6.notifyToolPermissionActivity(r7, r8, r9, r10, r11)
            goto L_0x02a3
        L_0x0173:
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            r7 = 2
            if (r5 != 0) goto L_0x01b2
            java.lang.String r5 = "aweme://stickers/detail/"
            boolean r5 = kotlin.text.C7634n.m23721b(r2, r5, false)
            if (r5 == 0) goto L_0x01b2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r3 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r1 = r1.getService(r3)
            r7 = r1
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r7 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r7
            android.content.Context r13 = r13.getContext()
            java.lang.String r1 = "v.context"
            kotlin.jvm.internal.C7573i.m23582a(r13, r1)
            java.lang.String r3 = "aweme://stickers/detail/"
            java.lang.String r4 = "sslocal://stickers/detail/"
            r5 = 0
            r6 = 4
            r8 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            java.lang.String r1 = kotlin.text.C7634n.m23711a(r1, r2, r3, false)
            r7.startAdsAppActivity(r13, r1)
            goto L_0x02a3
        L_0x01b2:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x01c9
            java.lang.String r5 = "aweme://music/detail/"
            boolean r5 = kotlin.text.C7634n.m23721b(r2, r5, false)
            if (r5 == 0) goto L_0x01c9
            com.ss.android.ugc.aweme.router.s r13 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            r13.mo18682a(r2)
            goto L_0x02a3
        L_0x01c9:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0247
            java.lang.String r5 = "aweme://friend/find"
            boolean r5 = kotlin.text.C7634n.m23721b(r2, r5, false)
            if (r5 == 0) goto L_0x0247
            java.lang.String r5 = "platform"
            java.lang.String r5 = r3.getQueryParameter(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r8 = "facebook"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r5 = android.text.TextUtils.equals(r5, r8)
            if (r5 == 0) goto L_0x0262
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r8 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r8)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            java.lang.String r8 = "AccountProxyService.userService().curUser"
            kotlin.jvm.internal.C7573i.m23582a(r5, r8)
            int r5 = r5.getUserMode()
            if (r5 == r7) goto L_0x0262
            com.ss.android.ugc.aweme.notification.e.a r5 = com.p280ss.android.ugc.aweme.notification.p1436e.C34439a.f89873b
            boolean r5 = r5.isFtcBindEnable()
            if (r5 == 0) goto L_0x0262
            com.ss.android.sdk.a.b r5 = com.p280ss.android.sdk.p899a.C20098b.m66270a()
            java.lang.String r8 = "facebook"
            boolean r5 = r5.mo53819a(r8)
            if (r5 != 0) goto L_0x0262
            java.lang.String r5 = "aweme://friend/find"
            com.ss.android.ugc.aweme.router.u r5 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r5)
            java.lang.String r8 = f90088d
            java.lang.String r9 = f90089e
            com.ss.android.ugc.aweme.router.u r5 = r5.mo18694a(r8, r9)
            java.lang.String r8 = f90090f
            java.lang.String r9 = "platform"
            java.lang.String r3 = r3.getQueryParameter(r9)
            com.ss.android.ugc.aweme.router.u r3 = r5.mo18694a(r8, r3)
            java.lang.String r5 = "RouterUrlBuilder.newBuil…eryParameter(\"platform\"))"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.lang.String r5 = "refer"
            java.lang.String r8 = "message"
            r3.mo18694a(r5, r8)
            com.ss.android.ugc.aweme.router.s r5 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r3 = r3.mo18695a()
            r5.mo18682a(r3)
            goto L_0x0262
        L_0x0247:
            com.ss.android.ugc.aweme.router.u r3 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r2)
            java.lang.String r5 = "RouterUrlBuilder.newBuilder(schema)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.lang.String r5 = "refer"
            java.lang.String r8 = "message"
            r3.mo18694a(r5, r8)
            com.ss.android.ugc.aweme.router.s r5 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r3 = r3.mo18695a()
            r5.mo18682a(r3)
        L_0x0262:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x02a3
            java.lang.String r3 = "aweme://link_account"
            boolean r1 = kotlin.text.C7634n.m23721b(r2, r3, false)
            if (r1 == 0) goto L_0x02a3
            android.content.Context r1 = r13.getContext()
            boolean r1 = r1 instanceof android.support.p029v7.app.AppCompatActivity
            if (r1 == 0) goto L_0x02a3
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService> r2 = com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService r1 = (com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService) r1
            android.content.Context r13 = r13.getContext()
            if (r13 == 0) goto L_0x029b
            android.support.v7.app.AppCompatActivity r13 = (android.support.p029v7.app.AppCompatActivity) r13
            android.support.v4.app.j r13 = r13.getSupportFragmentManager()
            java.lang.String r2 = "(v.context as AppCompatA…  .supportFragmentManager"
            kotlin.jvm.internal.C7573i.m23582a(r13, r2)
            java.lang.String r2 = "message"
            r1.pushOrNoticeShowLinkAccountDialog(r13, r2)
            goto L_0x02a3
        L_0x029b:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
            r13.<init>(r0)
            throw r13
        L_0x02a3:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            com.google.gson.e r1 = new com.google.gson.e     // Catch:{ Exception -> 0x02c4 }
            r1.<init>()     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r0 = r0.f89567d     // Catch:{ Exception -> 0x02c4 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x02c4 }
            r2.<init>()     // Catch:{ Exception -> 0x02c4 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception -> 0x02c4 }
            java.lang.Object r0 = r1.mo15974a(r0, r2)     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r1 = "Gson().fromJson(it.logEx…g, String>()::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x02c4 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x02c4 }
            r13 = r0
        L_0x02c4:
            java.lang.String r0 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "account_type"
            java.lang.String r3 = "starmap_assistant"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "click"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            com.ss.android.ugc.aweme.app.g.d r13 = r1.mo59974a(r13)
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r13)
            return
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusTcmDetailHolder.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo87833a(BaseNotice baseNotice, boolean z) {
        boolean z2;
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getTcmNotice() != null) {
            this.f90105x = baseNotice.getNid();
            this.f90093l.setImageURI(C13337d.m39030a((int) R.drawable.ak4));
            this.f90100s = baseNotice.getTcmNotice();
            C34366n nVar = this.f90100s;
            if (nVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f89662b) {
                    spannableStringBuilder.append(8296);
                }
                if (!TextUtils.isEmpty(nVar.f89564a)) {
                    spannableStringBuilder.append(nVar.f89564a);
                    if (!TextUtils.isEmpty(nVar.f89565b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(nVar.f89565b)) {
                    spannableStringBuilder.append(nVar.f89565b);
                }
                if (this.f89662b) {
                    spannableStringBuilder.append(8297);
                }
                if (nVar.f89566c.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    mo87667a(spannableStringBuilder, baseNotice);
                    this.f90094m.setText(spannableStringBuilder);
                    this.f90097p.setVisibility(8);
                    this.f90095n.setVisibility(8);
                    this.f90098q.setVisibility(8);
                    this.f90099r.setVisibility(8);
                    this.f90096o.setVisibility(8);
                } else {
                    try {
                        Uri parse = Uri.parse(nVar.f89566c);
                        this.f90101t = parse.getBooleanQueryParameter("effects", false);
                        this.f90102u = parse.getBooleanQueryParameter("blur", false);
                        this.f90103v = parse.getBooleanQueryParameter("duet", false);
                        this.f90104w = parse.getQueryParameter("aweme_id");
                        if (!this.f90103v || TextUtils.isEmpty(this.f90104w)) {
                            C34586c.m111818a(this.f90094m, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                            this.f90097p.setVisibility(0);
                            this.f90095n.setVisibility(8);
                            this.f90098q.setVisibility(8);
                            this.f90099r.setVisibility(8);
                            this.f90096o.setVisibility(8);
                        } else {
                            C34586c.m111818a(this.f90094m, spannableStringBuilder, baseNotice, 10, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 192.0f)));
                            this.f90097p.setVisibility(8);
                            this.f90095n.setVisibility(0);
                            this.f90098q.setVisibility(0);
                            this.f90099r.setVisibility(0);
                            this.f90096o.setVisibility(8);
                        }
                    } catch (Exception unused) {
                    }
                }
                HashMap hashMap = new HashMap();
                try {
                    Object a = new C6600e().mo15974a(nVar.f89567d, new HashMap().getClass());
                    C7573i.m23582a(a, "Gson().fromJson(it.logEx…g, String>()::class.java)");
                    hashMap = (HashMap) a;
                } catch (Exception unused2) {
                }
                C6907h.m21524a("official_message_inner_message", (Map) C22984d.m75611a().mo59973a("account_type", "starmap_assistant").mo59973a("action_type", "show").mo59974a(hashMap).f60753a);
            }
        }
    }
}
