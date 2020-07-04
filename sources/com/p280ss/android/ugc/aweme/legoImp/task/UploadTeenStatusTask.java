package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UploadTeenStatusTask */
public class UploadTeenStatusTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        String str;
        String str2;
        TimeLockUserSetting f = C6903bc.m21484c().mo59246f();
        if (f != null) {
            if (f.isTimeLockOn()) {
                str = "on";
            } else {
                str = "off";
            }
            if (f.isContentFilterOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C6907h.m21524a("time_lock_status", (Map) C22984d.m75611a().mo59973a("status", str).f60753a);
            C6907h.m21524a("teen_mode_status", (Map) C22984d.m75611a().mo59973a("status", str2).f60753a);
        }
    }
}
