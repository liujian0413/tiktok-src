package com.p280ss.android.ugc.aweme.global.config.settings;

import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.discover.model.SameCityModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.a */
public abstract class C30192a implements C6925d {

    /* renamed from: a */
    protected C6600e f79445a = new C6600e();

    /* renamed from: b */
    private C32025c f79446b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo76677a(IESSettingsProxy iESSettingsProxy);

    /* renamed from: a */
    public final C32025c mo76676a() {
        if (this.f79446b == null) {
            return C30553b.m99790f();
        }
        return this.f79446b;
    }

    /* renamed from: c */
    private static void m98836c(IESSettingsProxy iESSettingsProxy) {
        C30202j.m98867a().mo76689a(true);
    }

    /* renamed from: d */
    private static void m98837d(IESSettingsProxy iESSettingsProxy) {
        C1592h.m7853a((Callable<TResult>) new C30194b<TResult>(iESSettingsProxy));
    }

    public final void change(IESSettingsProxy iESSettingsProxy) {
        m98837d(iESSettingsProxy);
        m98838e(iESSettingsProxy);
        m98836c(iESSettingsProxy);
        mo76677a(iESSettingsProxy);
    }

    /* renamed from: e */
    private final void m98838e(IESSettingsProxy iESSettingsProxy) {
        try {
            SameCityModel.sImageUrl = iESSettingsProxy.getDiscoveryLocationBackgroundUrl();
        } catch (NullValueException unused) {
        }
        this.f79446b = C30553b.m99781a(SharePrefCache.inst().getSharePref().edit(), iESSettingsProxy);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateServerSettings(iESSettingsProxy);
    }
}
