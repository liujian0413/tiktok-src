package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.p480a.C9706d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest */
public final class GeckoCheckInRequest implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest$a */
    static final class C37236a implements Runnable {

        /* renamed from: a */
        public static final C37236a f97357a = new C37236a();

        C37236a() {
        }

        public final void run() {
            boolean z;
            String j = C6399b.m19934j();
            CharSequence charSequence = j;
            boolean z2 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context a = C6399b.m19921a();
                if (a != null) {
                    try {
                        j = C9706d.m28642a(a, "SS_VERSION_NAME");
                    } catch (Throwable unused) {
                    }
                    CharSequence charSequence2 = j;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                            j = packageInfo != null ? packageInfo.versionName : null;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                C42983bo.m136463b(j);
            }
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        try {
            new Handler(Looper.getMainLooper()).postDelayed(C37236a.f97357a, C22977g.m75589a("gecko"));
        } catch (Exception e) {
            C27873e.f73441a.mo71353a(e);
        }
    }
}
