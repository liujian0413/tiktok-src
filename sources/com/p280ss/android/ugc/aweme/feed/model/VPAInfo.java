package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VPAInfo */
public final class VPAInfo implements Serializable {
    @C6593c(mo15949a = "show_info_bar_type")
    private final int infoBarType;
    @C6593c(mo15949a = "show_opt_out_button")
    private final boolean showOptOut;

    public static /* synthetic */ VPAInfo copy$default(VPAInfo vPAInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = vPAInfo.showOptOut;
        }
        if ((i2 & 2) != 0) {
            i = vPAInfo.infoBarType;
        }
        return vPAInfo.copy(z, i);
    }

    public final boolean component1() {
        return this.showOptOut;
    }

    public final int component2() {
        return this.infoBarType;
    }

    public final VPAInfo copy(boolean z, int i) {
        return new VPAInfo(z, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VPAInfo) {
                VPAInfo vPAInfo = (VPAInfo) obj;
                if (this.showOptOut == vPAInfo.showOptOut) {
                    if (this.infoBarType == vPAInfo.infoBarType) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getInfoBarType() {
        return this.infoBarType;
    }

    public final boolean getShowOptOut() {
        return this.showOptOut;
    }

    public final int hashCode() {
        boolean z = this.showOptOut;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.infoBarType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VPAInfo(showOptOut=");
        sb.append(this.showOptOut);
        sb.append(", infoBarType=");
        sb.append(this.infoBarType);
        sb.append(")");
        return sb.toString();
    }

    public VPAInfo(boolean z, int i) {
        this.showOptOut = z;
        this.infoBarType = i;
    }
}
