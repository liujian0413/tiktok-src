package com.bytedance.apm.p239c;

import android.app.Activity;
import android.util.Printer;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.common.utility.C9731i;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.C6478c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.a */
public class C6175a implements C6478c, C6480a {

    /* renamed from: a */
    private boolean f18169a;

    /* renamed from: b */
    private final Printer f18170b = new C9588c();

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
    }

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
    }

    public void onReady() {
    }

    /* renamed from: c */
    private void m19157c() {
        C9731i.m28669b(this.f18170b);
        C9589d.m28379a().mo23913d();
        if (C6174c.m19149g()) {
            new String[1][0] = "BlockDetector stop: ";
        }
    }

    /* renamed from: b */
    public final void mo14869b() {
        if (this.f18169a) {
            C9731i.m28667a(this.f18170b);
            if (C6174c.m19149g()) {
                new String[1][0] = "BlockDetector start: ";
            }
        }
    }

    /* renamed from: a */
    public final void mo14868a() {
        C9731i.m28666a();
        ActivityLifeObserver.getInstance().register(this);
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
        C9589d.m28379a().mo23911b();
        this.f18169a = true;
        if (C6174c.m19149g()) {
            new String[1][0] = "BlockDetector init: ";
        }
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        m19157c();
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        mo14869b();
    }

    /* renamed from: a */
    public static void m19156a(long j) {
        C9589d.m28379a().mo23910a(j);
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        C9589d.m28379a().mo23910a(jSONObject.optLong("caton_interval", 2500));
    }
}
