package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Environment;
import com.bytedance.common.utility.C6312h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetupDebugLevel */
public class SetupDebugLevel implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        boolean z;
        if (C7163a.m22363a()) {
            z = true;
        } else {
            try {
                String packageName = context.getPackageName();
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getPath());
                sb.append("/Android/data/");
                sb.append(packageName);
                sb.append("/cache/");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("debug.flag");
                z = new File(sb3.toString()).exists();
            } catch (Exception unused) {
                z = false;
            }
        }
        if (z) {
            C6312h.m19576a(2);
        }
    }
}
