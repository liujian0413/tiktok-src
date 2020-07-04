package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.user.C2377i;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6468s;
import p346io.reactivex.C7319aa;

public interface UploadApi {
    @C6468s(mo15750a = "/webcast/certification/submit_cert_data/")
    C7319aa<C3479d<C2377i>> upload(@C6451b TypedOutput typedOutput);
}
