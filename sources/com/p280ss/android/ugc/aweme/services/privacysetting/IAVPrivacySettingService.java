package com.p280ss.android.ugc.aweme.services.privacysetting;

import android.app.Activity;
import android.app.AlertDialog;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService */
public interface IAVPrivacySettingService {
    boolean needShowPrivacyConfirmationDialog(Activity activity);

    AlertDialog showPrivacyConfirmationDialog(Activity activity, C7561a<C7581n> aVar);
}
