package com.p280ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService */
public interface IVideoRecordEntranceService {
    void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3);

    void startSuperEntranceRecordActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3);

    void startToolPermissionActivity(Context context, Intent intent);
}
