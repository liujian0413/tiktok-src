package com.bytedance.netecho.result;

public final class IcmpPacketResult {
    private final int errorCode;
    private final boolean success;
    private final float tripTimeMs;
    private final int ttl;

    public static /* synthetic */ IcmpPacketResult copy$default(IcmpPacketResult icmpPacketResult, boolean z, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = icmpPacketResult.success;
        }
        if ((i3 & 2) != 0) {
            i = icmpPacketResult.ttl;
        }
        if ((i3 & 4) != 0) {
            f = icmpPacketResult.tripTimeMs;
        }
        if ((i3 & 8) != 0) {
            i2 = icmpPacketResult.errorCode;
        }
        return icmpPacketResult.copy(z, i, f, i2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final int component2() {
        return this.ttl;
    }

    public final float component3() {
        return this.tripTimeMs;
    }

    public final int component4() {
        return this.errorCode;
    }

    public final IcmpPacketResult copy(boolean z, int i, float f, int i2) {
        return new IcmpPacketResult(z, i, f, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IcmpPacketResult) {
                IcmpPacketResult icmpPacketResult = (IcmpPacketResult) obj;
                if (this.success == icmpPacketResult.success) {
                    if ((this.ttl == icmpPacketResult.ttl) && Float.compare(this.tripTimeMs, icmpPacketResult.tripTimeMs) == 0) {
                        if (this.errorCode == icmpPacketResult.errorCode) {
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

    public final boolean getSuccess() {
        return this.success;
    }

    public final float getTripTimeMs() {
        return this.tripTimeMs;
    }

    public final int getTtl() {
        return this.ttl;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        return ((((((z ? 1 : 0) * true) + this.ttl) * 31) + Float.floatToIntBits(this.tripTimeMs)) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IcmpPacketResult(success=");
        sb.append(this.success);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", tripTimeMs=");
        sb.append(this.tripTimeMs);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(")");
        return sb.toString();
    }

    public IcmpPacketResult(boolean z, int i, float f, int i2) {
        this.success = z;
        this.ttl = i;
        this.tripTimeMs = f;
        this.errorCode = i2;
    }
}
