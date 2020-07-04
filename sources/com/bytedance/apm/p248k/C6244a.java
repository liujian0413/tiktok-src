package com.bytedance.apm.p248k;

import android.app.Activity;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.C6478c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.a */
public abstract class C6244a implements C6276b, C6478c, C6480a {

    /* renamed from: a */
    private boolean f18369a;

    /* renamed from: b */
    public boolean f18370b;

    /* renamed from: c */
    public boolean f18371c;

    /* renamed from: d */
    private boolean f18372d;

    /* renamed from: e */
    private long f18373e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14862a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14863b() {
    }

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo14865c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo14866d();

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo14867e() {
    }

    public void onReady() {
        this.f18370b = true;
        mo15031a();
    }

    /* renamed from: a */
    private void mo15031a() {
        if (!this.f18372d) {
            this.f18372d = true;
            if (mo14865c()) {
                C6273b.m19475a().mo15065a((C6276b) this);
            }
        }
        mo14867e();
        this.f18373e = System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void mo15024f() {
        if (!this.f18369a) {
            this.f18369a = true;
            ActivityLifeObserver.getInstance().register(this);
            ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
            mo14863b();
        }
    }

    /* renamed from: g */
    public final void mo15025g() {
        if (this.f18372d) {
            this.f18372d = false;
            if (mo14865c()) {
                C6273b.m19475a().mo15068b(this);
            }
        }
    }

    /* renamed from: h */
    public final void mo15026h() {
        ActivityLifeObserver.getInstance().unregister(this);
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).unregisterConfigListener(this);
    }

    /* renamed from: a */
    protected static void m19342a(C9600e eVar) {
        C6191a.m19218b().mo14915a(eVar);
    }

    /* renamed from: a */
    public void mo14861a(Activity activity) {
        this.f18371c = true;
        if (C6174c.m19146d()) {
            mo15025g();
        }
    }

    /* renamed from: b */
    public void mo14864b(Activity activity) {
        this.f18371c = false;
        if (C6174c.m19146d()) {
            mo15031a();
        }
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        long d = mo14866d();
        if (d > 0 && j - this.f18373e > d) {
            mo14867e();
            this.f18373e = System.currentTimeMillis();
        }
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        mo14862a(jSONObject);
    }
}
