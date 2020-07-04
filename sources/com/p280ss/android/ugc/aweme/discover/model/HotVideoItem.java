package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotVideoItem */
public class HotVideoItem implements Serializable {
    @C6593c(mo15949a = "aweme_info")
    private Aweme aweme;
    @C6593c(mo15949a = "hot_value")
    private long hotValue;
    @C6593c(mo15949a = "label")
    private int label;

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getHotValue() {
        return this.hotValue;
    }

    public int getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i;
        if (this.aweme != null) {
            i = this.aweme.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.label) * 31) + ((int) (this.hotValue ^ (this.hotValue >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HotVideoItem{aweme=");
        sb.append(this.aweme);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", hotValue=");
        sb.append(this.hotValue);
        sb.append('}');
        return sb.toString();
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setHotValue(long j) {
        this.hotValue = j;
    }

    public void setLabel(int i) {
        this.label = i;
    }

    public void setRequestId(String str) {
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotVideoItem hotVideoItem = (HotVideoItem) obj;
        if (this.label != hotVideoItem.label || this.hotValue != hotVideoItem.hotValue) {
            return false;
        }
        if (this.aweme != null) {
            return this.aweme.equals(hotVideoItem.aweme);
        }
        if (hotVideoItem.aweme == null) {
            return true;
        }
        return false;
    }
}
