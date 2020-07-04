package com.bytedance.android.livesdk.feed.tab.api;

import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.C5990g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface FeedTabApi {
    @C6457h(mo15740a = "/webcast/tab/")
    C7492s<C3474a<C5989f, C5990g>> queryTab(@C6474y(mo15757a = "show_location") int i);
}
