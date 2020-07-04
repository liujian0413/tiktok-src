package com.p280ss.android.ugc.aweme.setting.personalization.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.api.Resp */
public final class Resp extends BaseResponse {
    @C6593c(mo15949a = "description")
    private final String description;
    @C6593c(mo15949a = "is_follow_sys_config")
    private final boolean followSysConfig;
    @C6593c(mo15949a = "have_set")
    private final boolean haveSet;
    @C6593c(mo15949a = "need_terms")
    private final boolean needTerm;
    @C6593c(mo15949a = "ad_personality_mode")
    private final int personalityMode;

    public static /* synthetic */ Resp copy$default(Resp resp, boolean z, int i, boolean z2, String str, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = resp.needTerm;
        }
        if ((i2 & 2) != 0) {
            i = resp.personalityMode;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z2 = resp.haveSet;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            str = resp.description;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            z3 = resp.followSysConfig;
        }
        return resp.copy(z, i3, z4, str2, z3);
    }

    public final boolean component1() {
        return this.needTerm;
    }

    public final int component2() {
        return this.personalityMode;
    }

    public final boolean component3() {
        return this.haveSet;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.followSysConfig;
    }

    public final Resp copy(boolean z, int i, boolean z2, String str, boolean z3) {
        C7573i.m23587b(str, "description");
        Resp resp = new Resp(z, i, z2, str, z3);
        return resp;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Resp) {
                Resp resp = (Resp) obj;
                if (this.needTerm == resp.needTerm) {
                    if (this.personalityMode == resp.personalityMode) {
                        if ((this.haveSet == resp.haveSet) && C7573i.m23585a((Object) this.description, (Object) resp.description)) {
                            if (this.followSysConfig == resp.followSysConfig) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getFollowSysConfig() {
        return this.followSysConfig;
    }

    public final boolean getHaveSet() {
        return this.haveSet;
    }

    public final boolean getNeedTerm() {
        return this.needTerm;
    }

    public final int getPersonalityMode() {
        return this.personalityMode;
    }

    public final int hashCode() {
        boolean z = this.needTerm;
        int i = 1;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + Integer.hashCode(this.personalityMode)) * 31;
        boolean z2 = this.haveSet;
        if (z2) {
            z2 = true;
        }
        int i2 = (hashCode + (z2 ? 1 : 0)) * 31;
        String str = this.description;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.followSysConfig;
        if (!z3) {
            i = z3;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resp(needTerm=");
        sb.append(this.needTerm);
        sb.append(", personalityMode=");
        sb.append(this.personalityMode);
        sb.append(", haveSet=");
        sb.append(this.haveSet);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", followSysConfig=");
        sb.append(this.followSysConfig);
        sb.append(")");
        return sb.toString();
    }

    public Resp(boolean z, int i, boolean z2, String str, boolean z3) {
        C7573i.m23587b(str, "description");
        this.needTerm = z;
        this.personalityMode = i;
        this.haveSet = z2;
        this.description = str;
        this.followSysConfig = z3;
    }
}
