package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.C2317a;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;

public class RoomAttrs implements C2351b {
    @C6593c(mo15949a = "admin_flag")
    private int adminFlag;
    @C6593c(mo15949a = "fanticket_this_room")
    public long currentRoomContribution;
    @C6593c(mo15949a = "rank_this_room")
    public int currentRoomRank;
    @C6593c(mo15949a = "rank")
    public int rank;
    @C6593c(mo15949a = "silence_flag")
    private int silenceFlag;

    public int getAdminFlag() {
        return this.adminFlag;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i) {
        this.adminFlag = i;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setSilenceFlag(int i) {
        this.silenceFlag = i;
    }

    private void initWith(C2351b bVar) {
        this.silenceFlag = bVar.getSilenceFlag();
        this.adminFlag = bVar.getAdminFlag();
        this.rank = bVar.getRank();
    }

    public static RoomAttrs from(C2351b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof RoomAttrs) {
            C6600e a = C2317a.m9932a();
            return (RoomAttrs) a.mo15974a(a.mo15979b((Object) bVar), RoomAttrs.class);
        }
        RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(bVar);
        return roomAttrs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomAttrs roomAttrs = (RoomAttrs) obj;
        if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
            return true;
        }
        return false;
    }
}
