package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.p109c.p110a.p111a.C2267d.C2269b;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.Map;

public interface MessageApi {
    @C6456g
    @C6468s(mo15750a = "/webcast/room/{room_id}/_fetch_message_polling/")
    C12466b<C2269b> fetchMessagePbByteArraySource(@C6472w(mo15754a = "room_id") long j, @C6455f Map<String, String> map, @C6474y(mo15757a = "keep_method") String str);
}
