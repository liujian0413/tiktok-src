package com.bytedance.android.livesdk.viewmodel;

public final class LotteryWaiting implements ILotteryState {
    private final long anchorId;
    private final long localDrawTime;
    private final long lotteryId;
    private final long roomId;
    private final long userId;

    public static /* synthetic */ LotteryWaiting copy$default(LotteryWaiting lotteryWaiting, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        LotteryWaiting lotteryWaiting2 = lotteryWaiting;
        return lotteryWaiting.copy((i & 1) != 0 ? lotteryWaiting2.lotteryId : j, (i & 2) != 0 ? lotteryWaiting2.roomId : j2, (i & 4) != 0 ? lotteryWaiting2.anchorId : j3, (i & 8) != 0 ? lotteryWaiting2.userId : j4, (i & 16) != 0 ? lotteryWaiting2.localDrawTime : j5);
    }

    public final long component1() {
        return this.lotteryId;
    }

    public final long component2() {
        return this.roomId;
    }

    public final long component3() {
        return this.anchorId;
    }

    public final long component4() {
        return this.userId;
    }

    public final long component5() {
        return this.localDrawTime;
    }

    public final LotteryWaiting copy(long j, long j2, long j3, long j4, long j5) {
        LotteryWaiting lotteryWaiting = new LotteryWaiting(j, j2, j3, j4, j5);
        return lotteryWaiting;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LotteryWaiting) {
                LotteryWaiting lotteryWaiting = (LotteryWaiting) obj;
                if (this.lotteryId == lotteryWaiting.lotteryId) {
                    if (this.roomId == lotteryWaiting.roomId) {
                        if (this.anchorId == lotteryWaiting.anchorId) {
                            if (this.userId == lotteryWaiting.userId) {
                                if (this.localDrawTime == lotteryWaiting.localDrawTime) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getAnchorId() {
        return this.anchorId;
    }

    public final long getLocalDrawTime() {
        return this.localDrawTime;
    }

    public final long getLotteryId() {
        return this.lotteryId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return (((((((Long.hashCode(this.lotteryId) * 31) + Long.hashCode(this.roomId)) * 31) + Long.hashCode(this.anchorId)) * 31) + Long.hashCode(this.userId)) * 31) + Long.hashCode(this.localDrawTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LotteryWaiting(lotteryId=");
        sb.append(this.lotteryId);
        sb.append(", roomId=");
        sb.append(this.roomId);
        sb.append(", anchorId=");
        sb.append(this.anchorId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", localDrawTime=");
        sb.append(this.localDrawTime);
        sb.append(")");
        return sb.toString();
    }

    public LotteryWaiting(long j, long j2, long j3, long j4, long j5) {
        this.lotteryId = j;
        this.roomId = j2;
        this.anchorId = j3;
        this.userId = j4;
        this.localDrawTime = j5;
    }
}
