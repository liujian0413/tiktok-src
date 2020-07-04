package com.bytedance.business.base;

import com.bytedance.business.p473a.C9667a;

public class BusinessToolsConfig {
    private static volatile BusinessToolsConfig mBusinessToolsConfig;
    private int aid;
    private int appVersionCode;
    private String appVersionName;
    private boolean isDebug;
    private C9667a mBugReportConfig;

    public int getAid() {
        return this.aid;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public C9667a getBugReportConfig() {
        return this.mBugReportConfig;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setAid(int i) {
        this.aid = i;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setBugReportConfig(C9667a aVar) {
        this.mBugReportConfig = aVar;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    private BusinessToolsConfig(String str, int i, int i2, boolean z) {
        this.appVersionName = str;
        this.appVersionCode = i;
        this.aid = i2;
        this.isDebug = z;
    }

    public static BusinessToolsConfig getInstance(String str, int i, int i2, boolean z) {
        if (mBusinessToolsConfig == null) {
            synchronized (BusinessToolsConfig.class) {
                if (mBusinessToolsConfig == null) {
                    mBusinessToolsConfig = new BusinessToolsConfig(str, i, i2, z);
                }
            }
        }
        return mBusinessToolsConfig;
    }
}
