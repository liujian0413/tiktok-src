package com.p280ss.android.ugc.aweme.share.command;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.SmsParseResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLEncoder;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity */
public final class ShareCommandActivity extends AmeActivity {

    /* renamed from: a */
    private ShareCommandApi f98928a;

    /* renamed from: b */
    private Dialog f98929b;

    /* renamed from: c */
    private boolean f98930c;

    /* renamed from: d */
    private int f98931d;

    /* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity$ShareCommandApi */
    public interface ShareCommandApi {
        @C7730f(mo20420a = "/aweme/v2/platform/share/command/trans/")
        C18253l<Schema> getSchema(@C7744t(mo20436a = "command") String str, @C7744t(mo20436a = "support_type") String str2);

        @C7730f(mo20420a = "/aweme/v1/schema/trans/")
        C18253l<Schema> getUrlSchema(@C7744t(mo20436a = "url") String str, @C7744t(mo20436a = "support_type") String str2);

        @C7730f(mo20420a = "/aweme/v1/user/contact/referral/")
        C18253l<SmsParseResponse> parseSmsCode(@C7744t(mo20436a = "referral_code") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity$a */
    public static final class C38004a implements C18245g<Schema> {

        /* renamed from: a */
        final /* synthetic */ ShareCommandActivity f98932a;

        /* renamed from: b */
        final /* synthetic */ String f98933b;

        /* renamed from: c */
        final /* synthetic */ int f98934c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(Schema schema) {
            this.f98932a.mo95646a(schema, this.f98933b, this.f98934c);
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f98932a.finish();
        }

        C38004a(ShareCommandActivity shareCommandActivity, String str, int i) {
            this.f98932a = shareCommandActivity;
            this.f98933b = str;
            this.f98934c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity$b */
    public static final class C38005b implements C18245g<Schema> {

        /* renamed from: a */
        final /* synthetic */ ShareCommandActivity f98935a;

        /* renamed from: b */
        final /* synthetic */ String f98936b;

        /* renamed from: c */
        final /* synthetic */ int f98937c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(Schema schema) {
            ShareCommandActivity shareCommandActivity = this.f98935a;
            String str = this.f98936b;
            C7573i.m23582a((Object) str, "type");
            shareCommandActivity.mo95646a(schema, str, this.f98937c);
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f98935a.finish();
        }

        C38005b(ShareCommandActivity shareCommandActivity, String str, int i) {
            this.f98935a = shareCommandActivity;
            this.f98936b = str;
            this.f98937c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity$c */
    static final class C38006c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareCommandActivity f98938a;

        C38006c(ShareCommandActivity shareCommandActivity) {
            this.f98938a = shareCommandActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98938a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.command.ShareCommandActivity$d */
    static final class C38007d implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ShareCommandActivity f98939a;

        C38007d(ShareCommandActivity shareCommandActivity) {
            this.f98939a = shareCommandActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f98939a.finish();
        }
    }

    /* renamed from: a */
    private static String m121327a() {
        return "16";
    }

    /* renamed from: a */
    private static String m121328a(int i) {
        return i == 2 ? "shaped" : i == 1 ? "general" : "";
    }

    public final void onBackPressed() {
        super.onBackPressed();
        Dialog dialog = this.f98929b;
        if (dialog != null) {
            C38011d.m121335a(dialog);
        }
        finish();
    }

    public final void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f98929b;
        if (dialog != null) {
            C38011d.m121335a(dialog);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C38008a.f98940a).create(ShareCommandApi.class);
        C7573i.m23582a(create, "retrofit.create(ShareCommandApi::class.java)");
        this.f98928a = (ShareCommandApi) create;
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        m121329a(intent);
        setContentView((int) R.layout.bk);
        findViewById(R.id.aec).setOnClickListener(new C38006c(this));
    }

    /* renamed from: a */
    private final void m121329a(Intent intent) {
        String stringExtra = intent.getStringExtra("command_code");
        String stringExtra2 = intent.getStringExtra("command_type");
        boolean z = false;
        int intExtra = intent.getIntExtra("qr_code_type", 0);
        this.f98931d = intExtra;
        this.f98930c = intent.getBooleanExtra("IS_FROM_SCAN", false);
        if (!TextUtils.isEmpty(stringExtra)) {
            C7573i.m23582a((Object) stringExtra, "command");
            if (C7634n.m23721b(stringExtra, "http://", false) || C7634n.m23721b(stringExtra, "https://", false)) {
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("schema_type");
                if (!TextUtils.isEmpty(queryParameter) || C7573i.m23585a((Object) queryParameter, (Object) "11")) {
                    z = true;
                }
            }
        }
        if (C7573i.m23585a((Object) stringExtra2, (Object) "link") || C7573i.m23585a((Object) stringExtra2, (Object) "pic")) {
            if (z) {
                stringExtra = URLEncoder.encode(stringExtra, "UTF-8");
            }
            ShareCommandApi shareCommandApi = this.f98928a;
            if (shareCommandApi == null) {
                C7573i.m23583a("mSchemaCommandApi");
            }
            C7573i.m23582a((Object) stringExtra, "tempCommand");
            C18246h.m60214a(shareCommandApi.getUrlSchema(stringExtra, m121327a()), (C18245g<? super V>) new C38004a<Object>(this, stringExtra2, intExtra), (Executor) C23364n.f61448a);
            return;
        }
        ShareCommandApi shareCommandApi2 = this.f98928a;
        if (shareCommandApi2 == null) {
            C7573i.m23583a("mSchemaCommandApi");
        }
        C7573i.m23582a((Object) stringExtra, "command");
        C18246h.m60214a(shareCommandApi2.getSchema(stringExtra, m121327a()), (C18245g<? super V>) new C38005b<Object>(this, stringExtra2, intExtra), (Executor) C23364n.f61448a);
    }

    /* renamed from: a */
    private final void m121330a(Schema schema, String str) {
        Dialog dialog = this.f98929b;
        if (dialog != null) {
            C38011d.m121335a(dialog);
        }
        C38021h hVar = new C38021h(this, str);
        hVar.mo95658a(schema);
        hVar.setOnDismissListener(new C38007d(this));
        hVar.show();
        this.f98929b = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95646a(com.p280ss.android.ugc.aweme.share.command.Schema r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.isFinishing()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 != 0) goto L_0x000d
            r5.finish()
            return
        L_0x000d:
            int r0 = r6.getStatusCode()
            if (r0 == 0) goto L_0x0035
            boolean r7 = r5.f98930c
            if (r7 == 0) goto L_0x0031
            java.lang.String r7 = r6.getStatusMsg()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0031
            r7 = r5
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r6 = r6.getStatusMsg()
            com.bytedance.ies.dmt.ui.c.a r6 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r6)
            r6.mo25750a()
        L_0x0031:
            r5.finish()
            return
        L_0x0035:
            java.lang.String r0 = r6.getSchema()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d1
            com.ss.android.ugc.aweme.share.command.SchemaDetail r0 = r6.getSchemeDetail()
            if (r0 != 0) goto L_0x0049
            goto L_0x00d1
        L_0x0049:
            int r0 = r6.getSchemaType()
            r1 = 1
            if (r0 == r1) goto L_0x0056
            java.lang.String r0 = ""
            r5.finish()
            goto L_0x005b
        L_0x0056:
            r5.m121330a(r6, r7)
            java.lang.String r0 = "video"
        L_0x005b:
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "from_iid"
            long r3 = r6.getIid()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59971a(r2, r3)
            java.lang.String r2 = "request_id"
            java.lang.String r3 = r6.getRid()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "token_form"
            com.ss.android.ugc.aweme.app.g.d r7 = r1.mo59973a(r2, r7)
            java.lang.String r1 = "to_user_id"
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getCurUserId()
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r2)
            java.lang.String r1 = "from_user_id"
            java.lang.String r2 = r6.getShareUserId()
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r2)
            java.lang.String r1 = "token_type"
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r1, r0)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.share.command.SchemaDetail r6 = r6.getSchemeDetail()
            if (r6 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.share.command.CommandTransVideo r6 = r6.getVideo()
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = r6.getAwemeId()
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            com.ss.android.ugc.aweme.app.g.d r6 = r7.mo59973a(r0, r6)
            java.lang.String r7 = m121328a(r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00c9
            java.lang.String r7 = "qr_code_type"
            java.lang.String r8 = m121328a(r8)
            r6.mo59973a(r7, r8)
        L_0x00c9:
            java.lang.String r7 = "token_find"
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r7, r6)
            return
        L_0x00d1:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.command.ShareCommandActivity.mo95646a(com.ss.android.ugc.aweme.share.command.Schema, java.lang.String, int):void");
    }
}
