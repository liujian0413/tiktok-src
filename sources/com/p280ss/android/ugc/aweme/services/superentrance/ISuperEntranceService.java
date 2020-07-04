package com.p280ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService */
public interface ISuperEntranceService {
    List<String> getSuperEntranceEffectList();

    boolean isNeedShowSuperEntranceTabDirect();

    boolean isSuperEntranceResReady();

    void preDownloadSuperEntranceRes(Context context);

    void setShowedSuperEntranceTab();

    void setSuperEntranceRecordClicked(Context context, boolean z);

    boolean shouldShowSuperEntranceRecord(Context context);

    boolean shouldStartSuperEntrance(Context context);

    void startSuperEntranceActivity(Context context);
}
