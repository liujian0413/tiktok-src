package com.p280ss.android.ugc.aweme.privacychecker.api;

import android.app.Application;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService */
public interface PrivacyCheckerService {
    void enableLog(boolean z);

    void init(Application application, String str, Callable<String> callable, Callable<String> callable2, Callable<String> callable3, Callable<String> callable4, Callable<String> callable5);

    boolean isLogEnabled();
}
