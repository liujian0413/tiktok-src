package com.bytedance.android.livesdk.blockword;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.blockword.p190a.C3945b;
import com.bytedance.android.livesdk.blockword.p190a.C3946c;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface BlockWordApi {
    @C6457h(mo15740a = "/webcast/room/add_sensitive_word/")
    C7492s<C3479d<C3945b>> addBlockWord(@C6474y(mo15757a = "word") String str);

    @C6457h(mo15740a = "/webcast/room/del_sensitive_word/")
    C7492s<C3479d<Object>> deleteBlockWord(@C6474y(mo15757a = "word_id") int i);

    @C6457h(mo15740a = "/webcast/room/get_sensitive_word/")
    C7492s<C3479d<C3946c>> getBlockWord();
}
