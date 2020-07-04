package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.HashMap;
import p346io.reactivex.C7319aa;

public interface UserApi {
    @C6457h(mo15740a = "/webcast/user/")
    C7319aa<C3479d<User>> queryUser(@C6474y(mo15757a = "target_uid") long j, @C6474y(mo15757a = "packed_level") long j2, @C6474y(mo15757a = "sec_target_uid") String str);

    @C6457h(mo15740a = "/webcast/user/")
    C7319aa<C3479d<User>> queryUser(@C6475z HashMap<String, String> hashMap);

    @C6468s(mo15750a = "/webcast/room/upload/image/")
    C7319aa<C3479d<C2375g>> uploadAvatar(@C6451b TypedOutput typedOutput);
}
