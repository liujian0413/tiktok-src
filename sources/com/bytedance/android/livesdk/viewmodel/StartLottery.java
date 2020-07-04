package com.bytedance.android.livesdk.viewmodel;

public final class StartLottery implements ILotteryAction {
    private final long anchorId;
    private final long localDrawTime;
    private final long lotteryId;
    private final long roomId;
    private final long userId;

    public static /* synthetic */ StartLottery copy$default(StartLottery startLottery, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        StartLottery startLottery2 = startLottery;
        return startLottery.copy((i & 1) != 0 ? startLottery2.lotteryId : j, (i & 2) != 0 ? startLottery2.roomId : j2, (i & 4) != 0 ? startLottery2.anchorId : j3, (i & 8) != 0 ? startLottery2.userId : j4, (i & 16) != 0 ? startLottery2.localDrawTime : j5);
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

    public final StartLottery copy(long j, long j2, long j3, long j4, long j5) {
        StartLottery startLottery = new StartLottery(j, j2, j3, j4, j5);
        return startLottery;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StartLottery) {
                StartLottery startLottery = (StartLottery) obj;
                if (this.lotteryId == startLottery.lotteryId) {
                    if (this.roomId == startLottery.roomId) {
                        if (this.anchorId == startLottery.anchorId) {
                            if (this.userId == startLottery.userId) {
                                if (this.localDrawTime == startLottery.localDrawTime) {
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
        StringBuilder sb = new StringBuilder("StartLottery(lotteryId=");
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

    public StartLottery(long j, long j2, long j3, long j4, long j5) {
        this.lotteryId = j;
        this.roomId = j2;
        this.anchorId = j3;
        this.userId = j4;
        this.localDrawTime = j5;
    }
}
