package com.p280ss.android.ugc.effectmanager.link.model.blackRoom;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoomItem */
public abstract class BlackRoomItem {
    public boolean inBlackRoom;
    public int lockedCount;
    public long startLockTime;

    public abstract String getItemName();

    public void unlockFromBlackRoom() {
        this.inBlackRoom = false;
    }

    public void resetStatus() {
        this.inBlackRoom = false;
        this.lockedCount = 0;
    }

    public boolean lockToBlackRoom() {
        if (this.inBlackRoom) {
            return false;
        }
        this.inBlackRoom = true;
        this.lockedCount++;
        this.startLockTime = System.currentTimeMillis();
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlackRoomItem{name=");
        sb.append(getItemName());
        sb.append("lockedCount=");
        sb.append(this.lockedCount);
        sb.append(", inBlackRoom=");
        sb.append(this.inBlackRoom);
        sb.append('}');
        return sb.toString();
    }
}
