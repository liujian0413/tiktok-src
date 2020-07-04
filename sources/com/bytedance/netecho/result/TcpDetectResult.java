package com.bytedance.netecho.result;

public final class TcpDetectResult extends Result {
    private final int errorCode;
    private final int errorStage;
    private final boolean success;

    public static /* synthetic */ TcpDetectResult copy$default(TcpDetectResult tcpDetectResult, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = tcpDetectResult.success;
        }
        if ((i3 & 2) != 0) {
            i = tcpDetectResult.errorStage;
        }
        if ((i3 & 4) != 0) {
            i2 = tcpDetectResult.errorCode;
        }
        return tcpDetectResult.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final int component2() {
        return this.errorStage;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final TcpDetectResult copy(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TcpDetectResult) {
                TcpDetectResult tcpDetectResult = (TcpDetectResult) obj;
                if (this.success == tcpDetectResult.success) {
                    if (this.errorStage == tcpDetectResult.errorStage) {
                        if (this.errorCode == tcpDetectResult.errorCode) {
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

    public final boolean getSuccess() {
        return this.success;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.errorStage) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TcpDetectResult(success=");
        sb.append(this.success);
        sb.append(", errorStage=");
        sb.append(this.errorStage);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(")");
        return sb.toString();
    }

    public TcpDetectResult(boolean z, int i, int i2) {
        this.success = z;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
