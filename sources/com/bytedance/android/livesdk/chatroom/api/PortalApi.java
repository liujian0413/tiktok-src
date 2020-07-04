package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.PortalStatsResult;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4860k;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface PortalApi {

    public enum PingType {
        WAIT_REWARD(0),
        RECEIVE_INVITATION(1),
        CLICK_INVITATION(2),
        JUMP_TO_ROOM(3);
        
        private int value;

        public final String toString() {
            return String.valueOf(this.value);
        }

        private PingType(int i) {
            this.value = i;
        }
    }

    @C6457h(mo15740a = "/webcast/gift/portal/ping/")
    C7492s<C3479d<C4860k>> ping(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "portal_id") long j2, @C6474y(mo15757a = "ping_type") PingType pingType);

    @C6457h(mo15740a = "/webcast/gift/portal/user_portals/")
    C7492s<C3479d<PortalStatsResult>> stats(@C6474y(mo15757a = "room_id") long j);
}
