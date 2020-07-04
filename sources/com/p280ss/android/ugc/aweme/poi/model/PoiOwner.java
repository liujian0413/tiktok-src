package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiOwner */
public class PoiOwner implements Serializable {
    @C6593c(mo15949a = "avatar_url")
    public String avatar;
    @C6593c(mo15949a = "claim_url")
    public String claimUrl;
    @C6593c(mo15949a = "crypto_owner_id")
    public String cryptedId;
    @C6593c(mo15949a = "enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @C6593c(mo15949a = "owner_id")

    /* renamed from: id */
    public String f91786id;
    @C6593c(mo15949a = "owner_name")
    public String name;
    @C6593c(mo15949a = "open_day")
    public String openDay;
    @C6593c(mo15949a = "open_time")
    public String openTime;
    @C6593c(mo15949a = "signature")
    public String signature;

    public String getUserSecId() {
        return this.cryptedId;
    }

    public String appendBusinessTime(String[] strArr, String str) {
        if (C6319n.m19593a(this.openDay) || strArr == null) {
            return this.openTime;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = this.openDay.split(",");
        if (split.length > strArr.length) {
            return this.openTime;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < split.length; i3++) {
            if ("1".equalsIgnoreCase(split[i3])) {
                if (i < 0) {
                    sb.append(strArr[i3]);
                    i = i3;
                }
                if (i3 >= split.length - 1) {
                    i2 = i3;
                } else {
                    i2 = i3;
                }
            }
            if (i != i2) {
                sb.append(str);
                sb.append(strArr[i2]);
            }
            sb.append(",");
            i = -1;
            i2 = -1;
        }
        if (sb.length() > 0) {
            if (sb.lastIndexOf(",") == sb.length() - 1) {
                sb.replace(sb.lastIndexOf(","), sb.length(), " ");
            } else {
                sb.append(" ");
            }
        }
        if (!C6319n.m19593a(this.openTime)) {
            sb.append(this.openTime);
        }
        return sb.toString();
    }
}
