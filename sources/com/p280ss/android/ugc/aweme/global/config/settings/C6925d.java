package com.p280ss.android.ugc.aweme.global.config.settings;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.d */
public interface C6925d {

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.d$a */
    public static class C6926a implements C6925d {

        /* renamed from: a */
        C6925d f19614a;

        C6926a(C6925d dVar) {
            this.f19614a = dVar;
        }

        public final void change(IESSettingsProxy iESSettingsProxy) {
            if (this.f19614a != null) {
                this.f19614a.change(iESSettingsProxy);
            }
        }
    }

    void change(IESSettingsProxy iESSettingsProxy);
}
