package com.bytedance.android.livesdkapi.ping;

import com.google.gson.p276a.C6593c;

public class PingResult {
    @C6593c(mo15949a = "mosaic_status")
    private int mosaicStatus;
    @C6593c(mo15949a = "next_ping")
    private long nextPingInterval;
    @C6593c(mo15949a = "room_id")
    private long roomId;
    @C6593c(mo15949a = "room_status")
    private int roomStatus;

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public void setRoomStatus(int i) {
        this.roomStatus = i;
    }
}
