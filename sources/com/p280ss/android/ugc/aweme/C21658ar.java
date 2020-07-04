package com.p280ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.p280ss.android.ugc.aweme.IAccountService.C21079c;
import com.p280ss.android.ugc.aweme.account.bean.C21150e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ar */
public interface C21658ar {
    List<C21150e> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    void loginByPlatform(C21079c cVar, C21150e eVar);

    void logout(String str, String str2);

    void openPrivacyPolicy(Activity activity);

    void saveDTicket(String str);

    void showLoginAndRegisterView(C21079c cVar);

    void switchAccount(String str, Bundle bundle, C12720d dVar);
}
