package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi;
import com.p280ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi.Response;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.login.model.C32672a;
import com.p280ss.android.ugc.aweme.login.model.C32673b;
import com.p280ss.android.ugc.aweme.login.model.C32673b.C32674a;
import com.p280ss.android.ugc.aweme.login.utils.BannedApi;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity */
public final class BannedDialogActivity extends AmeSSActivity {

    /* renamed from: l */
    public static final long f85145l = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: m */
    public static boolean f85146m;

    /* renamed from: n */
    public static final C32677a f85147n = new C32677a(null);

    /* renamed from: a */
    public String f85148a;

    /* renamed from: b */
    public Integer f85149b = Integer.valueOf(-1);

    /* renamed from: c */
    public String f85150c;

    /* renamed from: d */
    public String f85151d;

    /* renamed from: e */
    public String f85152e;

    /* renamed from: f */
    public int f85153f;

    /* renamed from: g */
    public boolean f85154g = true;

    /* renamed from: h */
    public C32672a f85155h;

    /* renamed from: i */
    public boolean f85156i;

    /* renamed from: j */
    public Response f85157j;

    /* renamed from: k */
    public boolean f85158k;

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$a */
    public static final class C32677a {
        private C32677a() {
        }

        public /* synthetic */ C32677a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$b */
    public static final class C32678b implements C18245g<C32672a> {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85159a;

        C32678b(BannedDialogActivity bannedDialogActivity) {
            this.f85159a = bannedDialogActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C32672a aVar) {
            this.f85159a.f85155h = aVar;
            this.f85159a.f85156i = true;
            this.f85159a.mo84114a();
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f85159a.f85155h = null;
            this.f85159a.f85156i = true;
            this.f85159a.mo84114a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$c */
    public static final class C32679c implements C18245g<Response> {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85160a;

        C32679c(BannedDialogActivity bannedDialogActivity) {
            this.f85160a = bannedDialogActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(Response response) {
            this.f85160a.f85157j = response;
            this.f85160a.f85158k = true;
            this.f85160a.mo84114a();
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f85160a.f85157j = null;
            this.f85160a.f85158k = true;
            this.f85160a.mo84114a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d */
    static final class C32680d implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85161a;

        C32680d(BannedDialogActivity bannedDialogActivity) {
            this.f85161a = bannedDialogActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f85161a.f85154g) {
                this.f85161a.mo84118e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e */
    static final class C32681e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85162a;

        C32681e(BannedDialogActivity bannedDialogActivity) {
            this.f85162a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f85162a.mo84117d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f */
    static final class C32682f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85163a;

        C32682f(BannedDialogActivity bannedDialogActivity) {
            this.f85163a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f85163a.mo84115b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g */
    static final class C32683g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85164a;

        C32683g(BannedDialogActivity bannedDialogActivity) {
            this.f85164a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f85164a.mo84116c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h */
    static final class C32684h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85165a;

        /* renamed from: b */
        final /* synthetic */ C32672a f85166b;

        C32684h(BannedDialogActivity bannedDialogActivity, C32672a aVar) {
            this.f85165a = bannedDialogActivity;
            this.f85166b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f85165a.mo84116c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i */
    static final class C32685i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85167a;

        /* renamed from: b */
        final /* synthetic */ C32672a f85168b;

        C32685i(BannedDialogActivity bannedDialogActivity, C32672a aVar) {
            this.f85167a = bannedDialogActivity;
            this.f85168b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f85167a.mo84116c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j */
    static final class C32686j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85169a;

        /* renamed from: b */
        final /* synthetic */ C32672a f85170b;

        C32686j(BannedDialogActivity bannedDialogActivity, C32672a aVar) {
            this.f85169a = bannedDialogActivity;
            this.f85170b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f85169a.mo84115b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k */
    static final class C32687k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85171a;

        /* renamed from: b */
        final /* synthetic */ C32672a f85172b;

        C32687k(BannedDialogActivity bannedDialogActivity, C32672a aVar) {
            this.f85171a = bannedDialogActivity;
            this.f85172b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f85171a.mo84115b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l */
    static final class C32688l implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f85173a;

        /* renamed from: b */
        final /* synthetic */ C32672a f85174b;

        C32688l(BannedDialogActivity bannedDialogActivity, C32672a aVar) {
            this.f85173a = bannedDialogActivity;
            this.f85174b = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f85173a.f85154g) {
                this.f85173a.mo84118e();
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        f85146m = false;
    }

    /* renamed from: f */
    private boolean m105787f() {
        Response response = this.f85157j;
        if (response != null && response.canRefund) {
            Response response2 = this.f85157j;
            if (response2 != null && response2.hasUrl()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private C32674a m105788g() {
        if (m105787f()) {
            C32672a aVar = this.f85155h;
            if (aVar != null) {
                C32673b bVar = aVar.f85136a;
                if (bVar != null) {
                    return bVar.f85139c;
                }
            }
            return null;
        }
        C32672a aVar2 = this.f85155h;
        if (aVar2 != null) {
            C32673b bVar2 = aVar2.f85136a;
            if (bVar2 != null) {
                return bVar2.f85140d;
            }
        }
        return null;
    }

    /* renamed from: h */
    private C32674a m105789h() {
        if (m105787f()) {
            C32672a aVar = this.f85155h;
            if (aVar != null) {
                C32673b bVar = aVar.f85136a;
                if (bVar != null) {
                    return bVar.f85140d;
                }
            }
            return null;
        }
        C32672a aVar2 = this.f85155h;
        if (aVar2 != null) {
            C32673b bVar2 = aVar2.f85136a;
            if (bVar2 != null) {
                return bVar2.f85139c;
            }
        }
        return null;
    }

    /* renamed from: i */
    private final void m105790i() {
        boolean z;
        String str;
        CharSequence charSequence = this.f85148a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = this.f85148a;
        } else {
            str = null;
        }
        C18246h.m60214a(DouPlusRefundApi.m80562a(str), (C18245g<? super V>) new C32679c<Object>(this), C1592h.f5958b);
    }

    /* renamed from: j */
    private final void m105791j() {
        boolean z;
        C18253l lVar;
        CharSequence charSequence = this.f85148a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            lVar = BannedApi.m105812a(f.getLastUid());
        } else {
            lVar = BannedApi.m105813b(this.f85148a);
        }
        C18246h.m60214a(lVar, (C18245g<? super V>) new C32678b<Object>(this), C1592h.f5958b);
    }

    /* renamed from: d */
    public final void mo84117d() {
        String str;
        boolean z;
        Response response = this.f85157j;
        if (response != null) {
            str = response.getFullUrl();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m105786a("ban_click_refund");
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("use_ordinary_web", false);
            startActivityForResult(intent, 17);
            this.f85154g = false;
        }
    }

    /* renamed from: e */
    public final void mo84118e() {
        if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                C6861a.m21333b().logout("user_banned", "user_banned");
            }
        }
    }

    /* renamed from: a */
    public final void mo84114a() {
        if (this.f85156i && this.f85158k) {
            if (m105787f()) {
                this.f85153f = 1;
                m105786a("login_failure_ban");
                m105793l();
                return;
            }
            m105786a("login_failure_ban");
            m105792k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84115b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.login.model.a r0 = r5.f85155h
            com.ss.android.ugc.aweme.login.model.b$a r1 = r5.m105789h()
            if (r1 == 0) goto L_0x000b
            java.lang.String r1 = r1.f85142b
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r2 = 0
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.login.model.b r0 = r0.f85136a
            if (r0 == 0) goto L_0x0016
            int r0 = r0.f85138b
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r3 = "ban_click_appeal"
            r5.m105786a(r3)
            com.ss.android.ugc.aweme.login.model.b$a r3 = r5.m105789h()
            r4 = 16
            if (r3 != 0) goto L_0x0032
            android.content.Intent r0 = new android.content.Intent
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p280ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            r5.startActivityForResult(r0, r4)
            goto L_0x0061
        L_0x0032:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0063
            if (r0 <= 0) goto L_0x0054
            android.content.Intent r0 = new android.content.Intent
            r3 = r5
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r4 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r0.<init>(r3, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r1 = 17
            r5.startActivityForResult(r0, r1)
            goto L_0x0061
        L_0x0054:
            android.content.Intent r0 = new android.content.Intent
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p280ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            r5.startActivityForResult(r0, r4)
        L_0x0061:
            r5.f85154g = r2
        L_0x0063:
            boolean r0 = r5.f85154g
            if (r0 == 0) goto L_0x006a
            r5.mo84118e()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.login.p1373ui.BannedDialogActivity.mo84115b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r6 == false) goto L_0x0058;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m105792k() {
        /*
            r8 = this;
            boolean r0 = r8.isFinishing()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.login.model.a r0 = r8.f85155h
            com.bytedance.ies.uikit.dialog.b$a r1 = new com.bytedance.ies.uikit.dialog.b$a
            r2 = r8
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            java.lang.Integer r2 = r8.f85149b
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            int r2 = r2.intValue()
            r6 = 1093(0x445, float:1.532E-42)
            if (r2 != r6) goto L_0x0029
            r2 = 2131822491(0x7f11079b, float:1.9277755E38)
            java.lang.String r2 = r8.getString(r2)
            goto L_0x0058
        L_0x0029:
            if (r0 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.login.model.b r2 = r0.f85136a
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.f85137a
            goto L_0x0033
        L_0x0032:
            r2 = r4
        L_0x0033:
            java.lang.Integer r6 = r8.f85149b
            if (r6 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            int r6 = r6.intValue()
            r7 = 1091(0x443, float:1.529E-42)
            if (r6 == r7) goto L_0x0051
        L_0x0040:
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x004e
            int r6 = r6.length()
            if (r6 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r6 = 0
            goto L_0x004f
        L_0x004e:
            r6 = 1
        L_0x004f:
            if (r6 == 0) goto L_0x0058
        L_0x0051:
            r2 = 2131820665(0x7f110079, float:1.9274051E38)
            java.lang.String r2 = r8.getString(r2)
        L_0x0058:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.mo26647b(r2)
            com.ss.android.ugc.aweme.login.model.b$a r2 = r8.m105788g()
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r2.f85141a
            goto L_0x0067
        L_0x0066:
            r2 = r4
        L_0x0067:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0074
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r6 == 0) goto L_0x0085
            r2 = 2131821393(0x7f110351, float:1.9275528E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h
            r6.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r1.mo26635a(r2, r6)
            goto L_0x008f
        L_0x0085:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i
            r6.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r1.mo26641a(r2, r6)
        L_0x008f:
            com.ss.android.ugc.aweme.login.model.b$a r2 = r8.m105789h()
            if (r2 == 0) goto L_0x0097
            java.lang.String r4 = r2.f85141a
        L_0x0097:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x00a3
            int r2 = r4.length()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            if (r3 == 0) goto L_0x00b3
            r2 = 2131820962(0x7f1101a2, float:1.9274654E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j r3 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j
            r3.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            r1.mo26646b(r2, r3)
            goto L_0x00bd
        L_0x00b3:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k
            r2.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r1.mo26648b(r4, r2)
        L_0x00bd:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l
            r2.<init>(r8, r0)
            android.content.DialogInterface$OnDismissListener r2 = (android.content.DialogInterface.OnDismissListener) r2
            r1.mo26637a(r2)
            r1.mo26642a(r5)
            r1.mo26649b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.login.p1373ui.BannedDialogActivity.m105792k():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m105793l() {
        /*
            r8 = this;
            boolean r0 = r8.isFinishing()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r2 = 2131493324(0x7f0c01cc, float:1.8610125E38)
            r3 = 0
            r4 = 0
            android.view.View r1 = r1.inflate(r2, r3, r4)
            if (r1 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView r1 = (com.p280ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView) r1
            com.ss.android.ugc.aweme.login.model.a r2 = r8.f85155h
            if (r2 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.login.model.b r2 = r2.f85136a
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r2.f85137a
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r5 = 1
            if (r2 == 0) goto L_0x0035
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = 0
            goto L_0x0036
        L_0x0035:
            r6 = 1
        L_0x0036:
            if (r6 != 0) goto L_0x0044
            android.widget.TextView r6 = r1.getTitleView()
            java.lang.String r7 = "content.titleView"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r6.setText(r2)
        L_0x0044:
            com.ss.android.ugc.aweme.login.model.b$a r2 = r8.m105788g()
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r2.f85141a
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x005b
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r6 = 0
            goto L_0x005c
        L_0x005b:
            r6 = 1
        L_0x005c:
            if (r6 != 0) goto L_0x006a
            android.widget.TextView r6 = r1.getCancelView()
            java.lang.String r7 = "content.cancelView"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r6.setText(r2)
        L_0x006a:
            com.ss.android.ugc.aweme.login.model.b$a r2 = r8.m105789h()
            if (r2 == 0) goto L_0x0072
            java.lang.String r3 = r2.f85141a
        L_0x0072:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x007e
            int r2 = r3.length()
            if (r2 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r5 != 0) goto L_0x008c
            android.widget.TextView r2 = r1.getAppealView()
            java.lang.String r5 = "content.appealView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r5)
            r2.setText(r3)
        L_0x008c:
            android.support.v7.app.AlertDialog$a r2 = new android.support.v7.app.AlertDialog$a
            r3 = 2131886863(0x7f12030f, float:1.9408317E38)
            r2.<init>(r0, r3)
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            android.support.v7.app.AlertDialog$a r0 = r2.mo4239b(r0)
            android.support.v7.app.AlertDialog r0 = r0.mo4242b()
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d
            r2.<init>(r8)
            android.content.DialogInterface$OnDismissListener r2 = (android.content.DialogInterface.OnDismissListener) r2
            r0.setOnDismissListener(r2)
            r0.setCancelable(r4)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e
            r2.<init>(r8)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f67067b = r2
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f
            r2.<init>(r8)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f67068c = r2
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g
            r2.<init>(r8)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f67069d = r2
            r0.show()
            return
        L_0x00cb:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.login.p1373ui.BannedDialogActivity.m105793l():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84116c() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.login.model.b$a r0 = r6.m105788g()
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.f85142b
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            com.ss.android.ugc.aweme.login.model.a r1 = r6.f85155h
            r2 = 0
            if (r1 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.login.model.b r1 = r1.f85136a
            if (r1 == 0) goto L_0x0016
            int r1 = r1.f85138b
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 1
            if (r3 == 0) goto L_0x0026
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r3 = 0
            goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            if (r3 != 0) goto L_0x008b
            java.lang.String r3 = "ban_click_appeal"
            r6.m105786a(r3)
            if (r1 <= 0) goto L_0x0079
            android.content.Intent r1 = new android.content.Intent
            r3 = r6
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r5 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r1.<init>(r3, r5)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r3 = r6.f85148a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0050
            int r3 = r3.length()
            if (r3 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x0065
            java.lang.String r3 = "uid"
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r5 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r4 = r4.getLastUid()
            r0.appendQueryParameter(r3, r4)
            goto L_0x006c
        L_0x0065:
            java.lang.String r3 = "sec_uid"
            java.lang.String r4 = r6.f85148a
            r0.appendQueryParameter(r3, r4)
        L_0x006c:
            android.net.Uri r0 = r0.build()
            r1.setData(r0)
            r0 = 17
            r6.startActivityForResult(r1, r0)
            goto L_0x0088
        L_0x0079:
            android.content.Intent r0 = new android.content.Intent
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p280ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            r1 = 16
            r6.startActivityForResult(r0, r1)
        L_0x0088:
            r6.f85154g = r2
            goto L_0x0090
        L_0x008b:
            java.lang.String r0 = "ban_click_cancel"
            r6.m105786a(r0)
        L_0x0090:
            boolean r0 = r6.f85154g
            if (r0 == 0) goto L_0x0097
            r6.mo84118e()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.login.p1373ui.BannedDialogActivity.mo84116c():void");
    }

    /* renamed from: a */
    private final void m105786a(String str) {
        C6907h.m21524a(str, (Map) new C22984d().mo59970a("dou_balance_show", this.f85153f).mo59973a("enter_type", this.f85150c).mo59973a("enter_method", this.f85151d).mo59972a("error_code", (Object) this.f85149b).mo59973a("platform", this.f85152e).f60753a);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.m8);
        C10994a.m32208b(this);
        f85146m = true;
        if (getIntent().hasExtra(C22689a.f60407a)) {
            this.f85148a = getIntent().getStringExtra(C22689a.f60407a);
        }
        if (getIntent().hasExtra("banned_code")) {
            this.f85149b = Integer.valueOf(getIntent().getIntExtra("banned_code", -1));
        }
        if (getIntent().hasExtra("enter_type")) {
            this.f85150c = getIntent().getStringExtra("enter_type");
        }
        if (getIntent().hasExtra("enter_method")) {
            this.f85151d = getIntent().getStringExtra("enter_method");
        }
        if (getIntent().hasExtra("platfrom")) {
            this.f85152e = getIntent().getStringExtra("platfrom");
        }
        m105791j();
        m105790i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 16 || i == 17) {
            this.f85154g = true;
            mo84118e();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
