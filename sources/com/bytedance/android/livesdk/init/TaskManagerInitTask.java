package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.livesdk.p394i.C8306a;
import com.bytedance.common.utility.p254b.C9713b;
import com.bytedance.ies.util.thread.C11081a;
import com.bytedance.ies.util.thread.C11081a.C11083a;
import java.util.Arrays;
import java.util.List;

@C2319a(mo8127a = 4)
public class TaskManagerInitTask extends C8306a {
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(0)});
    }

    public void run() {
        C11081a.m32463a().mo27012a(new C11083a().mo27015a(C8344d.m25437a(new C9713b("live-work-threads", true))));
    }
}
