package com.p280ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* renamed from: com.ss.android.ugc.aweme.initializer.c */
final /* synthetic */ class C32125c implements ISuperEntrancePrivacyService {

    /* renamed from: a */
    static final ISuperEntrancePrivacyService f83929a = new C32125c();

    private C32125c() {
    }

    public final boolean hasPrivacyPermission(Context context) {
        return AVServiceProxyImpl.lambda$superEntrancePrivacyService$1$AVServiceProxyImpl(context);
    }
}
