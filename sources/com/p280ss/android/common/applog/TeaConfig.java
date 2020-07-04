package com.p280ss.android.common.applog;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.common.applog.AppLog.ILogEncryptConfig;
import com.p280ss.android.common.applog.AppLog.LogRequestTraceCallback;
import com.p280ss.android.common.applog.p286a.C19269a;

/* renamed from: com.ss.android.common.applog.TeaConfig */
public class TeaConfig {
    private final boolean anonymous;
    private C6730a appContext;
    private boolean autoActiveUser;
    private Context context;
    private Bundle customerHeader;
    private ILogEncryptConfig encryptConfig;
    private InternationalConfig internationalConfig;
    private LogRequestTraceCallback mLogRequestTraceCallback;
    private boolean needAntiCheating;
    private String releaseBuild;
    private boolean reportCrash;
    private TeaStorageConfig storageConfig;
    private final C19269a taskCallback;
    private UrlConfig urlConfig;

    public C6730a getAppContext() {
        return this.appContext;
    }

    public Context getContext() {
        return this.context;
    }

    public Bundle getCustomerHeader() {
        return this.customerHeader;
    }

    public ILogEncryptConfig getEncryptConfig() {
        return this.encryptConfig;
    }

    public InternationalConfig getInternationalConfig() {
        return this.internationalConfig;
    }

    public LogRequestTraceCallback getLogRequestTraceCallback() {
        return this.mLogRequestTraceCallback;
    }

    public String getReleaseBuild() {
        return this.releaseBuild;
    }

    public TeaStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public C19269a getTaskCallback() {
        return this.taskCallback;
    }

    public UrlConfig getUrlConfig() {
        return this.urlConfig;
    }

    public boolean isAnonymous() {
        return this.anonymous;
    }

    public boolean isAutoActiveUser() {
        return this.autoActiveUser;
    }

    public boolean isNeedAntiCheating() {
        return this.needAntiCheating;
    }

    public boolean isReportCrash() {
        return this.reportCrash;
    }

    TeaConfig(C6730a aVar, TeaStorageConfig teaStorageConfig, String str, Bundle bundle, ILogEncryptConfig iLogEncryptConfig, boolean z, boolean z2, Context context2, boolean z3, UrlConfig urlConfig2, InternationalConfig internationalConfig2, LogRequestTraceCallback logRequestTraceCallback, C19269a aVar2, boolean z4) {
        this.appContext = aVar;
        this.storageConfig = teaStorageConfig;
        this.releaseBuild = str;
        this.customerHeader = bundle;
        this.encryptConfig = iLogEncryptConfig;
        this.reportCrash = z;
        this.needAntiCheating = z2;
        this.context = context2;
        this.autoActiveUser = z3;
        this.urlConfig = urlConfig2;
        this.internationalConfig = internationalConfig2;
        this.mLogRequestTraceCallback = logRequestTraceCallback;
        this.taskCallback = aVar2;
        this.anonymous = z4;
    }
}
