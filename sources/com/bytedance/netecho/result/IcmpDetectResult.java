package com.bytedance.netecho.result;

import java.util.Arrays;
import kotlin.jvm.internal.C7573i;

public final class IcmpDetectResult extends Result {
    private final int errorCode;
    private final int errorStage;
    private final IcmpPacketResult[] packetResults;
    private final boolean success;

    public static /* synthetic */ IcmpDetectResult copy$default(IcmpDetectResult icmpDetectResult, boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = icmpDetectResult.success;
        }
        if ((i3 & 2) != 0) {
            icmpPacketResultArr = icmpDetectResult.packetResults;
        }
        if ((i3 & 4) != 0) {
            i = icmpDetectResult.errorStage;
        }
        if ((i3 & 8) != 0) {
            i2 = icmpDetectResult.errorCode;
        }
        return icmpDetectResult.copy(z, icmpPacketResultArr, i, i2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final IcmpPacketResult[] component2() {
        return this.packetResults;
    }

    public final int component3() {
        return this.errorStage;
    }

    public final int component4() {
        return this.errorCode;
    }

    public final IcmpDetectResult copy(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IcmpDetectResult) {
                IcmpDetectResult icmpDetectResult = (IcmpDetectResult) obj;
                if ((this.success == icmpDetectResult.success) && C7573i.m23585a((Object) this.packetResults, (Object) icmpDetectResult.packetResults)) {
                    if (this.errorStage == icmpDetectResult.errorStage) {
                        if (this.errorCode == icmpDetectResult.errorCode) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final IcmpPacketResult[] getPacketResults() {
        return this.packetResults;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        IcmpPacketResult[] icmpPacketResultArr = this.packetResults;
        return ((((i + (icmpPacketResultArr != null ? Arrays.hashCode(icmpPacketResultArr) : 0)) * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IcmpDetectResult(success=");
        sb.append(this.success);
        sb.append(", packetResults=");
        sb.append(Arrays.toString(this.packetResults));
        sb.append(", errorStage=");
        sb.append(this.errorStage);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(")");
        return sb.toString();
    }

    public IcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        this.success = z;
        this.packetResults = icmpPacketResultArr;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
