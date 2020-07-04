package com.p280ss.android.ugc.aweme.antiaddic.lock.entity;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.b */
public final class C22600b {
    @C6593c(mo15949a = "teen_mode")

    /* renamed from: a */
    public final int f60174a;
    @C6593c(mo15949a = "screen_time_management")

    /* renamed from: b */
    public final int f60175b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22600b) {
                C22600b bVar = (C22600b) obj;
                if (this.f60174a == bVar.f60174a) {
                    if (this.f60175b == bVar.f60175b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f60174a) * 31) + Integer.hashCode(this.f60175b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncedTeenModeSetting(teenMode=");
        sb.append(this.f60174a);
        sb.append(", timeLock=");
        sb.append(this.f60175b);
        sb.append(")");
        return sb.toString();
    }
}
