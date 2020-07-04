package com.p280ss.android.ugc.aweme.shortvideo.service;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.policy.C35495c;
import com.p280ss.android.ugc.aweme.services.IPrivacySettingService;
import com.p280ss.android.ugc.aweme.services.IPrivacySettingService.OnPostNowClickListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.service.PrivacySettingService */
public class PrivacySettingService implements IPrivacySettingService {
    public boolean needShowPrivacyConfirmationDialog(Activity activity) {
        boolean z = !C21115b.m71197a().getCurUser().isAcceptPrivatePolicy();
        if (!z || !C21115b.m71197a().getCurUser().isSecret()) {
            return z;
        }
        new C35495c(activity).mo90299b();
        return false;
    }

    public AlertDialog showPrivacyConfirmationDialog(final Activity activity, final OnPostNowClickListener onPostNowClickListener) {
        Builder builder = new Builder(activity);
        builder.setTitle(activity.getString(R.string.d4r)).setMessage(activity.getString(R.string.d4p)).setPositiveButton(activity.getString(R.string.d4q), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (onPostNowClickListener != null) {
                    onPostNowClickListener.onPostNowClick();
                }
            }
        }).setNegativeButton(activity.getString(R.string.w_), new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog create = builder.create();
        create.setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
                new C35495c(activity).mo90299b();
            }
        });
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }
}
