package com.bytedance.business.base;

import android.app.Activity;
import com.bytedance.jirafast.base.C12004a;
import com.bytedance.jirafast.base.C12007d;

public interface IBugReportService {
    boolean canDrawOverlays();

    void captureScreen();

    void goJiraCreateActivity();

    void permissionChecker(Activity activity);

    void setEmail(String str);

    void setGoToFeedbackPageListener(C12004a aVar);

    void setOnGetMoreJIRAParamsListener(C12007d dVar);

    void startScreenshotObserver();

    void stopScreenshotObserver();
}
