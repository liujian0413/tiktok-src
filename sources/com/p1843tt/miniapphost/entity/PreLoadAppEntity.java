package com.p1843tt.miniapphost.entity;

/* renamed from: com.tt.miniapphost.entity.PreLoadAppEntity */
public class PreLoadAppEntity {
    private String mAppId;
    private int mAppType;
    private int mDownloadPriority;
    private int mOriginDownloadPriority;
    private int mPreloadMode = -1;

    public static boolean compareDownloadPriority(int i, int i2) {
        return i > i2;
    }

    public static boolean isPreloadModeValid(int i) {
        switch (i) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public void downgradePriority() {
        this.mDownloadPriority = 0;
    }

    public String getAppid() {
        return this.mAppId;
    }

    public int getApptype() {
        return this.mAppType;
    }

    public int getDownloadPriority() {
        return this.mDownloadPriority;
    }

    public int getOriginDownloadPriority() {
        return this.mOriginDownloadPriority;
    }

    public int getPreloadMode() {
        return this.mPreloadMode;
    }

    public boolean downgraded() {
        if (this.mDownloadPriority != 0 || this.mDownloadPriority == this.mOriginDownloadPriority) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("mAppId: ");
        sb.append(this.mAppId);
        sb.append(" mAppType: ");
        sb.append(this.mAppType);
        sb.append(" mDownloadPriority: ");
        sb.append(this.mDownloadPriority);
        sb.append(" mOriginDownloadPriority: ");
        sb.append(this.mOriginDownloadPriority);
        return sb.toString();
    }

    public void setAppid(String str) {
        this.mAppId = str;
    }

    public void setApptype(int i) {
        this.mAppType = i;
    }

    public void setPreloadMode(int i) {
        this.mPreloadMode = i;
    }

    public void setDownloadPriority(int i) {
        if (!(i == 1 || i == 2 || i == 0)) {
            i = 0;
        }
        this.mDownloadPriority = i;
        this.mOriginDownloadPriority = i;
        if (i == 2 && !isPreloadModeValid(this.mPreloadMode)) {
            this.mPreloadMode = 2;
        }
    }
}
