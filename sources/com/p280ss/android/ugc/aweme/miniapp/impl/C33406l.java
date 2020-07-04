package com.p280ss.android.ugc.aweme.miniapp.impl;

import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33444h;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.l */
public final class C33406l implements C33444h {
    /* renamed from: b */
    public final boolean mo85642b() {
        try {
            return C30199h.m98861a().getMiniappPreloadEmptyProcessEnbale().booleanValue();
        } catch (NullValueException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo85641a() {
        try {
            if (C30199h.m98861a().getMiniappPreloadEnbale().intValue() == 1) {
                return true;
            }
            return false;
        } catch (NullValueException unused) {
            return false;
        }
    }
}
