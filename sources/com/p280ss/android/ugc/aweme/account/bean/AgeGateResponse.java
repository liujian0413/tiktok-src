package com.p280ss.android.ugc.aweme.account.bean;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse */
public final class AgeGateResponse implements Serializable {
    public static final C21144a Companion = new C21144a(null);
    public static final int DISABLE_AGE_GATE_TRUE = 1;
    private final boolean is_eligible;
    private final boolean is_prompt;
    private final int status_code;
    private final String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse$a */
    public static final class C21144a {
        private C21144a() {
        }

        public /* synthetic */ C21144a(C7571f fVar) {
            this();
        }
    }

    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, int i, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ageGateResponse.status_code;
        }
        if ((i2 & 2) != 0) {
            str = ageGateResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            z = ageGateResponse.is_eligible;
        }
        if ((i2 & 8) != 0) {
            z2 = ageGateResponse.is_prompt;
        }
        return ageGateResponse.copy(i, str, z, z2);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final boolean component3() {
        return this.is_eligible;
    }

    public final boolean component4() {
        return this.is_prompt;
    }

    public final AgeGateResponse copy(int i, String str, boolean z, boolean z2) {
        return new AgeGateResponse(i, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeGateResponse) {
                AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
                if ((this.status_code == ageGateResponse.status_code) && C7573i.m23585a((Object) this.status_msg, (Object) ageGateResponse.status_msg)) {
                    if (this.is_eligible == ageGateResponse.is_eligible) {
                        if (this.is_prompt == ageGateResponse.is_prompt) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.is_eligible;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.is_prompt;
        if (z2) {
            z2 = true;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final boolean is_eligible() {
        return this.is_eligible;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgeGateResponse(status_code=");
        sb.append(this.status_code);
        sb.append(", status_msg=");
        sb.append(this.status_msg);
        sb.append(", is_eligible=");
        sb.append(this.is_eligible);
        sb.append(", is_prompt=");
        sb.append(this.is_prompt);
        sb.append(")");
        return sb.toString();
    }

    public AgeGateResponse(int i, String str, boolean z, boolean z2) {
        this.status_code = i;
        this.status_msg = str;
        this.is_eligible = z;
        this.is_prompt = z2;
    }
}
