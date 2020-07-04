package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.AlertDialog;

/* renamed from: com.ss.android.ugc.aweme.services.IPrivacySettingService */
public interface IPrivacySettingService {

    /* renamed from: com.ss.android.ugc.aweme.services.IPrivacySettingService$OnPostNowClickListener */
    public interface OnPostNowClickListener {
        void onPostNowClick();
    }

    boolean needShowPrivacyConfirmationDialog(Activity activity);

    AlertDialog showPrivacyConfirmationDialog(Activity activity, OnPostNowClickListener onPostNowClickListener);
}
