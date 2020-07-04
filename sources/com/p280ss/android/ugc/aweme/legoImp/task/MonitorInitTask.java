package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C6148a;
import com.bytedance.apm.p240d.C6186b;
import com.bytedance.apm.p240d.C6186b.C6187a;
import com.bytedance.apm.p246i.C6215a;
import com.bytedance.apm.p246i.C6216b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.optimize.C34707a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask */
public class MonitorInitTask implements LegoTask {
    private static final String[] API_NPTH_LAUNCH_CRASH = {"https://api2.musical.ly/monitor/collect/c/exception"};
    private static final List<String> DEFAULT_REPORT_URL_LIST;
    private static final AtomicBoolean INITED = new AtomicBoolean(false);
    private static final String[] MUSICALLY_MON_CONFIG_URL_ARRAY = {"https://mon.musical.ly/monitor/appmonitor/v2/settings", "https://mon.byteoversea.com/monitor/appmonitor/v2/settings"};
    private static final String[] TIKTOK_MON_CONFIG_URL_ARRAY = {"https://mon.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.byteoversea.com/monitor/appmonitor/v2/settings"};

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        if (C6399b.m19944t()) {
            return WorkType.BOOT_FINISH;
        }
        return WorkType.BACKGROUND;
    }

    static {
        String str;
        String[] strArr = new String[2];
        if (C6399b.m19947w()) {
            str = "https://mon.tiktokv.com/monitor/collect/";
        } else {
            str = "https://mon.musical.ly/monitor/collect/";
        }
        strArr[0] = str;
        strArr[1] = "https://mon.byteoversea.com/monitor/collect/";
        DEFAULT_REPORT_URL_LIST = new ArrayList(Arrays.asList(strArr));
    }

    public void run(Context context) {
        String[] strArr;
        if (INITED.compareAndSet(false, true)) {
            C6148a.m19086a((Context) AwemeApplication.m21341a());
            C6187a a = C6186b.m19184a();
            JSONObject headerCopy = AppLog.getHeaderCopy();
            if (headerCopy != null) {
                a.mo14907a(headerCopy);
            }
            if (C6399b.m19947w()) {
                strArr = TIKTOK_MON_CONFIG_URL_ARRAY;
            } else {
                strArr = MUSICALLY_MON_CONFIG_URL_ARRAY;
            }
            a.mo14913c(Arrays.asList(strArr)).mo14901a(60).mo14911b(Arrays.asList(API_NPTH_LAUNCH_CRASH)).mo14906a(DEFAULT_REPORT_URL_LIST).mo14900a(C6399b.m19935k()).mo14905a(AppLog.getServerDeviceId()).mo14910b(C6399b.m19934j()).mo14912c(String.valueOf(C6399b.m19932h())).mo14914d(C6399b.m19941q()).mo14904a((C6216b) new C6216b() {
                /* renamed from: a */
                public final void mo14954a() {
                    C7121a.m22248b().mo18559a(new RheaTraceUploadTask()).mo18560a();
                }
            });
            if (TextUtils.equals(C6399b.m19941q(), "local_test")) {
                a.mo14903a((C6215a) new C32413r(context));
            }
            C6877n.m21406a(C6399b.m19921a(), a);
        }
    }

    static final /* synthetic */ void lambda$run$1$MonitorInitTask(Context context, String str, String str2, JSONObject jSONObject) {
        if (C34707a.m112021a() && TextUtils.equals("page_load", str2)) {
            StringBuilder sb = new StringBuilder();
            try {
                String string = jSONObject.getJSONObject("extra_status").getString("scene");
                String substring = string.substring(string.lastIndexOf(46));
                sb.append("Activity: ");
                sb.append(substring);
                sb.append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra_values");
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    sb.append(str3);
                    sb.append(": ");
                    sb.append(jSONObject2.getInt(str3));
                    sb.append("\n");
                }
                sb.deleteCharAt(sb.lastIndexOf("\n"));
            } catch (Exception unused) {
            }
            C47549a.m148327a().mo19335a(new C32414s(context, sb));
        }
    }
}
