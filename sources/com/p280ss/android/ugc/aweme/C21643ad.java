package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;

/* renamed from: com.ss.android.ugc.aweme.ad */
public interface C21643ad {

    /* renamed from: com.ss.android.ugc.aweme.ad$a */
    public interface C21644a {
    }

    void bindMobile(Activity activity, String str, Bundle bundle, C21083g gVar);

    boolean enableNewPhoneBindFlow();

    Intent getAuthorizeActivityStartIntent(Context context);

    C21669bb getVerificationService();

    boolean hasPlatformBound();

    boolean isPlatformBound(String str);

    C21643ad keepCallback();

    void modifyMobile(Activity activity, String str, Bundle bundle, C21083g gVar);

    void setAuthorzieBindResult(C21673bf bfVar);
}
