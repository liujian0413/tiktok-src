package com.p280ss.android.ugc.aweme.feedback;

import android.text.TextUtils;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.C6159b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.feedback.i */
public final class C29081i {

    /* renamed from: a */
    private static final String f76810a;

    /* renamed from: b */
    static final /* synthetic */ void m95424b() {
        ALog.m20868d();
        ALog.m20872f();
    }

    /* renamed from: a */
    public static String m95422a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return m95423a(currentTimeMillis - 10800, currentTimeMillis);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C7276d.m22818d());
        sb.append("/feedback_log");
        f76810a = sb.toString();
    }

    /* renamed from: c */
    private static boolean m95425c() {
        if (C6399b.m19944t()) {
            return true;
        }
        if (!C7213d.m22500a().mo18787az() || ALog.f19201a == null || TextUtils.isEmpty(ALog.f19201a.f51790d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m95423a(long j, long j2) {
        if (m95425c()) {
            C6159b.m19104a(ALog.f19201a.f51790d, j, j2, "ActiveUpload", C29082j.f76811a);
            return null;
        }
        StringBuilder sb = new StringBuilder("ame-log");
        sb.append(System.currentTimeMillis());
        sb.append(".zip");
        String sb2 = sb.toString();
        C29083k kVar = new C29083k(j, j2, sb2);
        C1592h.m7855a((Callable<TResult>) kVar, (Executor) C1592h.f5957a);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f76810a);
        sb3.append(File.separator);
        sb3.append(sb2);
        return C1642a.m8034a("http://tosv.byted.org/obj/toutiao-applog-files/%s/1/%s/%s", new Object[]{Integer.valueOf(1233), TeaAgent.getServerDeviceId(), new File(sb3.toString()).getName()});
    }

    /* renamed from: a */
    static final /* synthetic */ Object m95421a(long j, long j2, String str) throws Exception {
        ALog.m20868d();
        ALog.m20872f();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException unused) {
        }
        List a = ALog.m20847a(j, j2);
        if (a == null) {
            return null;
        }
        new File(f76810a).mkdirs();
        NetworkUtils.postFile(0, "http://amfr.snssdk.com/file_report/upload", "file", C43136fo.m136825a(f76810a, str, a), null, null);
        new File(f76810a).delete();
        return null;
    }
}
