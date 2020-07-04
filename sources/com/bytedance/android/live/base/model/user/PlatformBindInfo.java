package com.bytedance.android.live.base.model.user;

import com.google.gson.p276a.C6593c;

public class PlatformBindInfo {
    public static final int HASH_31 = 31;
    @C6593c(mo15949a = "allow_sync")
    private boolean allowSync;
    @C6593c(mo15949a = "bind_user_name")
    private String bindUserName;
    @C6593c(mo15949a = "platform")
    private String platform;
    @C6593c(mo15949a = "publish_sync_tips_cnt")
    private int publishSyncTipsCnt;
    @C6593c(mo15949a = "tigger_full_sync")
    private boolean tiggerFullSync;

    public String getBindUserName() {
        return this.bindUserName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getPublishSyncTipsCnt() {
        return this.publishSyncTipsCnt;
    }

    public boolean isAllowSync() {
        return this.allowSync;
    }

    public boolean isTiggerFullSync() {
        return this.tiggerFullSync;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.platform != null) {
            i = this.platform.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((((i * 31) + (this.allowSync ? 1 : 0)) * 31) + (this.tiggerFullSync ? 1 : 0)) * 31;
        if (this.bindUserName != null) {
            i2 = this.bindUserName.hashCode();
        }
        return ((i3 + i2) * 31) + this.publishSyncTipsCnt;
    }

    public void setAllowSync(boolean z) {
        this.allowSync = z;
    }

    public void setBindUserName(String str) {
        this.bindUserName = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPublishSyncTipsCnt(int i) {
        this.publishSyncTipsCnt = i;
    }

    public void setTiggerFullSync(boolean z) {
        this.tiggerFullSync = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformBindInfo platformBindInfo = (PlatformBindInfo) obj;
        if (this.allowSync != platformBindInfo.allowSync || this.tiggerFullSync != platformBindInfo.tiggerFullSync || this.publishSyncTipsCnt != platformBindInfo.publishSyncTipsCnt) {
            return false;
        }
        if (this.platform == null ? platformBindInfo.platform != null : !this.platform.equals(platformBindInfo.platform)) {
            return false;
        }
        if (this.bindUserName != null) {
            return this.bindUserName.equals(platformBindInfo.bindUserName);
        }
        if (platformBindInfo.bindUserName == null) {
            return true;
        }
        return false;
    }
}
