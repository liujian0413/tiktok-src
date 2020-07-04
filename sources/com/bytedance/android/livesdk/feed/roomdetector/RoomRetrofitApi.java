package com.bytedance.android.livesdk.feed.roomdetector;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.HashMap;
import p346io.reactivex.C7492s;

public interface RoomRetrofitApi {
    @C6457h(mo15740a = "/webcast/room/info/")
    C7492s<C3479d<Room>> fetchRoom(@C6475z HashMap<String, String> hashMap);

    @C6457h(mo15740a = "/webcast/room/ping/audience/")
    C7492s<C3479d<PingResult>> sendPlayingPing(@C6474y(mo15757a = "room_id") long j, @C6474y(mo15757a = "only_status") int i);
}
