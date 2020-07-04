package com.p280ss.android.ugc.aweme.tutorial.net;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.TutorialListRequest */
public interface TutorialListRequest {
    @C6457h(mo15740a = "/aweme/v1/tutorial/detail/")
    C7492s<C42670e> getTutorialList(@C6474y(mo15757a = "tutorial_type") int i, @C6474y(mo15757a = "cursor") int i2, @C6474y(mo15757a = "count") int i3);
}
