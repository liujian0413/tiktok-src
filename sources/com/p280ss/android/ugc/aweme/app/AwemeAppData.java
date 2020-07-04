package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.bytedance.ies.uikit.base.C11008b.C11009a;
import com.bytedance.ies.uikit.base.C11008b.C11011c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.newmedia.redbadge.C19973b;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.openauthorize.C34658a;
import com.p280ss.android.ugc.aweme.requestcombine.C37199a;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37245e;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import com.p280ss.android.ugc.aweme.splash.SplashAdActivity;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p280ss.android.ugc.aweme.web.C43447i;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData */
public final class AwemeAppData extends C19936f implements C11009a, C11011c {

    /* renamed from: e */
    public boolean f60325e;

    /* renamed from: f */
    public boolean f60326f;

    /* renamed from: g */
    public boolean f60327g;

    /* renamed from: h */
    public String f60328h;

    /* renamed from: i */
    public boolean f60329i;

    /* renamed from: j */
    public boolean f60330j;

    /* renamed from: k */
    public boolean f60331k;

    /* renamed from: l */
    public boolean f60332l;

    /* renamed from: m */
    public boolean f60333m;

    /* renamed from: n */
    public boolean f60334n;

    /* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData$RedPointTask */
    class RedPointTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private RedPointTask() {
        }

        public void run(Context context) {
            AwemeAppData.m74899b(true);
            C34315c.m110980a(true, 4);
        }
    }

    /* renamed from: i */
    public static Class<? extends DeepLinkHandlerActivity> m74900i() {
        return DeepLinkHandlerActivity.class;
    }

    /* renamed from: g */
    public final C20145l mo53441g() {
        return C43447i.m137872c();
    }

    /* renamed from: b */
    public final void mo26593b(Activity activity) {
        C19973b.m65837a((Context) activity).mo53466c();
        C10985c.m32186b(activity);
    }

    /* renamed from: b */
    public static void m74899b(boolean z) {
        if (!C6319n.m19593a(AppLog.getServerDeviceId())) {
            C34334h.m111033d().mo87180f();
        }
    }

    /* renamed from: a */
    public final void mo26595a(boolean z) {
        this.f60330j = z;
        if (z) {
            SplashAdManagerHolder.m132895b(this.f54024b).mo50571b();
            return;
        }
        if (C19025f.m62192w() == null) {
            SplashAdManagerHolder.m132886a(this.f54024b);
        }
        SplashAdManagerHolder.m132895b(this.f54024b).mo50567a();
        this.f60325e = true;
    }

    /* renamed from: a */
    public final void mo26592a(Activity activity) {
        boolean z;
        boolean z2 = activity instanceof MainActivity;
        if (z2) {
            C7121a.m22248b().mo18559a(new RedPointTask()).mo18560a();
        }
        C10985c.m32182a(activity);
        this.f60331k = false;
        this.f60332l = false;
        this.f60333m = z2;
        if (!(activity == null && activity.getIntent() == null)) {
            Intent intent = activity.getIntent();
            this.f60331k = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || !(data == null || data.getQueryParameter("gd_label") == null || !data.getQueryParameter("gd_label").startsWith("click_wap"))) {
                z = true;
            } else {
                z = false;
            }
            this.f60332l = z;
        }
        Activity g = C6405d.m19984g();
        if (!this.f60325e || this.f60329i) {
            if (C7213d.m22500a().mo18740aC() == 0) {
                m65765a().f60327g = false;
            }
            this.f60326f = false;
        } else {
            if (g != null && !(g instanceof SplashAdActivity) && !(g instanceof SplashActivity) && SplashAdManagerHolder.m132886a((Context) g).mo50581e() && !C34658a.m111954a(g)) {
                this.f60326f = SplashAdActivity.f108615a.mo102518a(g);
            }
            this.f60325e = false;
        }
        if (this.f60329i) {
            this.f60329i = false;
        }
        if (!C37199a.f97322a.mo93733b()) {
            C7121a.m22254e().mo18551a(new C37245e()).mo18552a();
        }
    }
}
