package com.bytedance.android.livesdk.viewmodel;

public final class LotteryFinishing implements ILotteryState {
    private final long lotteryId;
    private final long roomId;

    public static /* synthetic */ LotteryFinishing copy$default(LotteryFinishing lotteryFinishing, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lotteryFinishing.roomId;
        }
        if ((i & 2) != 0) {
            j2 = lotteryFinishing.lotteryId;
        }
        return lotteryFinishing.copy(j, j2);
    }

    public final long component1() {
        return this.roomId;
    }

    public final long component2() {
        return this.lotteryId;
    }

    public final LotteryFinishing copy(long j, long j2) {
        return new LotteryFinishing(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LotteryFinishing) {
                LotteryFinishing lotteryFinishing = (LotteryFinishing) obj;
                if (this.roomId == lotteryFinishing.roomId) {
                    if (this.lotteryId == lotteryFinishing.lotteryId) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getLotteryId() {
        return this.lotteryId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final int hashCode() {
        return (Long.hashCode(this.roomId) * 31) + Long.hashCode(this.lotteryId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LotteryFinishing(roomId=");
        sb.append(this.roomId);
        sb.append(", lotteryId=");
        sb.append(this.lotteryId);
        sb.append(")");
        return sb.toString();
    }

    public LotteryFinishing(long j, long j2) {
        this.roomId = j;
        this.lotteryId = j2;
    }
}
