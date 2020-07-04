package com.p280ss.android.ugc.aweme.redpackage.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.redpackage.model.CdnDomainRefresh */
public class CdnDomainRefresh implements Serializable {
    @C6593c(mo15949a = "keepalive_timeout")
    private int keepaliveTimeout;
    @C6593c(mo15949a = "refresh_interval")
    private int refreshInterval;
    @C6593c(mo15949a = "refresh_switch")
    private boolean refreshSwitch;

    public int getKeepaliveTimeout() {
        return this.keepaliveTimeout;
    }

    public int getRefreshInterval() {
        return this.refreshInterval;
    }

    public boolean isRefreshSwitch() {
        return this.refreshSwitch;
    }

    public int hashCode() {
        return ((((this.refreshSwitch ? 1 : 0) * true) + this.refreshInterval) * 31) + this.keepaliveTimeout;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CdnDomainRefresh{");
        sb.append("refreshSwitch=");
        sb.append(this.refreshSwitch);
        sb.append(", refreshInterval=");
        sb.append(this.refreshInterval);
        sb.append(", keepaliveTimeout=");
        sb.append(this.keepaliveTimeout);
        sb.append('}');
        return sb.toString();
    }

    public void setKeepaliveTimeout(int i) {
        this.keepaliveTimeout = i;
    }

    public void setRefreshInterval(int i) {
        this.refreshInterval = i;
    }

    public void setRefreshSwitch(boolean z) {
        this.refreshSwitch = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdnDomainRefresh cdnDomainRefresh = (CdnDomainRefresh) obj;
        if (this.refreshSwitch == cdnDomainRefresh.refreshSwitch && this.refreshInterval == cdnDomainRefresh.refreshInterval && this.keepaliveTimeout == cdnDomainRefresh.keepaliveTimeout) {
            return true;
        }
        return false;
    }
}
