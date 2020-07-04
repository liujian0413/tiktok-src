package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.live.uikit.dialog.C3533b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.p394i.C8306a;
import com.bytedance.android.livesdk.p428w.C9178j;
import java.util.Arrays;
import java.util.List;

@C2319a(mo8127a = 2)
public class InternalServiceInitTask extends C8306a {
    static final /* synthetic */ boolean lambda$run$0$InternalServiceInitTask() {
        return false;
    }

    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(1)});
    }

    public void run() {
        C3533b.m12990a(C8341a.f22886a);
        C9178j.m27302j().mo22375d().mo22383c().mo10285a();
        C9178j.m27302j().mo22375d().mo22385e();
        ((C3450b) C3596c.m13172a(C3450b.class)).getDnsOptimizer().mo10469a(true);
    }
}
