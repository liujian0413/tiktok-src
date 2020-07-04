package com.p280ss.android.ugc.aweme.global.config.settings;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h.C30200a;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy */
public final class SettingsManagerProxy implements C30200a {
    public static final int SETTING_REQUEST_FROM_TYPE_APP = 1;
    public static final int SETTING_REQUEST_FROM_TYPE_LANGUAGE = 2;
    public static final int SETTING_REQUEST_FROM_TYPE_LOGIN = 3;
    public static final int SETTING_REQUEST_FROM_TYPE_LOGOUT = 4;
    private final C30192a commonSettingsWatcher;
    private final C30196e settingManager;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy$a */
    static final class C30189a {

        /* renamed from: a */
        public static final SettingsManagerProxy f79443a = new SettingsManagerProxy();
    }

    public static SettingsManagerProxy inst() {
        return C30189a.f79443a;
    }

    public final C30192a getCommonSettingsWatcher() {
        return this.commonSettingsWatcher;
    }

    public final IESSettingsProxy get() {
        return this.settingManager.f79451a;
    }

    public final IESSettings getDefaultSettings() {
        return this.settingManager.mo76679a();
    }

    public final C6600e getGson() {
        return this.settingManager.mo76685b();
    }

    private SettingsManagerProxy() {
        AwemeApplication a = AwemeApplication.m21341a();
        if (a != null) {
            this.settingManager = new C30196e(a);
            this.commonSettingsWatcher = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingsWatcher();
            registerSettingsWatcher(this.commonSettingsWatcher, false);
            return;
        }
        throw new NullPointerException("context is null!");
    }

    public final void registerSettingsWatcher(C6925d dVar) {
        this.settingManager.mo76681a(dVar, true);
    }

    public final void removeSettingsWatcher(C6925d dVar) {
        this.settingManager.mo76680a(dVar);
    }

    public final void setCanMock(boolean z) {
        this.settingManager.mo76684a(z);
    }

    public final void registerSettingsWatcher(C6925d dVar, boolean z) {
        this.settingManager.mo76681a(dVar, z);
    }

    public final void notifySettingsChange(Throwable th, IESSettings iESSettings, String str) {
        this.settingManager.mo76683a(th, iESSettings, str);
    }

    /* access modifiers changed from: 0000 */
    public final <T> void setMock(String str, Class<T> cls, T t) {
        this.settingManager.mo76682a(str, cls, t);
    }
}
