package com.p280ss.android.ugc.aweme.account.appeal;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.account.appeal.AppealStatusResponse */
public final class AppealStatusResponse extends BaseResponse {
    @C6593c(mo15949a = "ban_time")
    private final long banTime;
    @C6593c(mo15949a = "ban_type")
    private final int banType;
    @C6593c(mo15949a = "status")
    private final int status;

    public static /* synthetic */ AppealStatusResponse copy$default(AppealStatusResponse appealStatusResponse, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appealStatusResponse.status;
        }
        if ((i3 & 2) != 0) {
            i2 = appealStatusResponse.banType;
        }
        if ((i3 & 4) != 0) {
            j = appealStatusResponse.banTime;
        }
        return appealStatusResponse.copy(i, i2, j);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.banType;
    }

    public final long component3() {
        return this.banTime;
    }

    public final AppealStatusResponse copy(int i, int i2, long j) {
        return new AppealStatusResponse(i, i2, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppealStatusResponse) {
                AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
                if (this.status == appealStatusResponse.status) {
                    if (this.banType == appealStatusResponse.banType) {
                        if (this.banTime == appealStatusResponse.banTime) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + Integer.hashCode(this.banType)) * 31) + Long.hashCode(this.banTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppealStatusResponse(status=");
        sb.append(this.status);
        sb.append(", banType=");
        sb.append(this.banType);
        sb.append(", banTime=");
        sb.append(this.banTime);
        sb.append(")");
        return sb.toString();
    }

    public AppealStatusResponse(int i, int i2, long j) {
        this.status = i;
        this.banType = i2;
        this.banTime = j;
    }
}
