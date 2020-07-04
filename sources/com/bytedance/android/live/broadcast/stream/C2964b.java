package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.p280ss.avframework.livestreamv2.core.Guest;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.stream.b */
public final class C2964b {
    /* renamed from: a */
    public static Guest m11508a(Context context, InteractConfig interactConfig) {
        return (Guest) new C2967c(new C2978a(context).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9755a((C2965a) new C2761d()).mo9756a((C2966b) new C2762e()).mo9777j(0).mo9757a((C2980a) new C2760c()).mo9762a()).mo9738a(interactConfig, true);
    }
}
