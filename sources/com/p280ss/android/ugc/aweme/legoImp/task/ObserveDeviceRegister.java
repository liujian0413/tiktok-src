package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister */
public class ObserveDeviceRegister implements LegoTask {
    private static C6790a deviceConfigUpdateListener = new C6790a() {
        public final void onDeviceRegistrationInfoChanged(String str, String str2) {
        }

        public final void onRemoteConfigUpdate(boolean z, boolean z2) {
        }

        public final void onDidLoadLocally(boolean z) {
            C28434i.m93465a(!z);
        }
    };

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C6789d.m21064a(deviceConfigUpdateListener);
    }
}
