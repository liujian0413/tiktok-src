package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p249l.C6265a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.services.apm.api.C12915d;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask */
public final class RheaTraceUploadTask implements LegoTask {
    public static final C32389a Companion = new C32389a(null);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$a */
    public static final class C32389a {
        private C32389a() {
        }

        public /* synthetic */ C32389a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$b */
    static final class C32390b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f84509a;

        /* renamed from: b */
        final /* synthetic */ File f84510b;

        C32390b(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f84509a = rheaTraceUploadTask;
            this.f84510b = file;
        }

        public final /* synthetic */ Object call() {
            m104955a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104955a() {
            try {
                this.f84509a.uploadTraceFile(this.f84510b, "_atrace");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$c */
    static final class C32391c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f84511a;

        /* renamed from: b */
        final /* synthetic */ File f84512b;

        C32391c(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f84511a = rheaTraceUploadTask;
            this.f84512b = file;
        }

        public final /* synthetic */ Object call() {
            m104956a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104956a() {
            try {
                this.f84511a.uploadTraceFile(this.f84512b, "_fake_trace");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d */
    public static final class C32392d implements C12915d {

        /* renamed from: a */
        final /* synthetic */ File f84513a;

        /* renamed from: a */
        public final void mo31398a(String str) {
            C7573i.m23587b(str, "msg");
        }

        /* renamed from: a */
        public final void mo31397a() {
            this.f84513a.delete();
        }

        C32392d(File file) {
            this.f84513a = file;
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private final JSONObject buildCommonParams() {
        JSONObject jSONObject = new JSONObject();
        Map i = C6174c.m19151i();
        C7573i.m23582a((Object) i, "ApmContext.getQueryParamsMap()");
        for (Entry entry : i.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    private final void uploadATrace(Context context) {
        File uploadFile = getUploadFile("ATrace", context);
        if (uploadFile.exists() && NetworkUtils.isWifi(context) && C6159b.m19115a("upload_rhea_atrace_file")) {
            C1592h.m7853a((Callable<TResult>) new C32390b<TResult>(this, uploadFile));
        }
    }

    private final void uploadFakeTrace(Context context) {
        File uploadFile = getUploadFile("MTrace", context);
        if (uploadFile.exists() && NetworkUtils.isWifi(context) && C6159b.m19115a("upload_rhea_fake_trace_file")) {
            C1592h.m7853a((Callable<TResult>) new C32391c<TResult>(this, uploadFile));
        }
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        try {
            if (C6870b.m21397e()) {
                String str = "disabled";
                int hashCode = str.hashCode();
                if (hashCode != -2009454344) {
                    if (hashCode == 1941963140) {
                        if (str.equals("ATrace")) {
                            uploadATrace(context);
                        }
                    }
                } else if (str.equals("MTrace")) {
                    uploadFakeTrace(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    private final File getUploadFile(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        C7573i.m23582a((Object) filesDir, "context.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append("/rhea");
        String sb2 = sb.toString();
        if (C7573i.m23585a((Object) str, (Object) "ATrace")) {
            return new File(sb2, "rhea_startup.trace");
        }
        return new File(sb2, "rhea_startup.fake");
    }

    public final void uploadTraceFile(File file, String str) {
        C6265a aVar = new C6265a();
        C6265a.m19436a(C6399b.m19944t());
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19932h());
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.valueOf(C6781d.m20986d()));
        aVar.mo15049a(sb3.toString(), "66812471934", sb2, C7525m.m23457a(file.getAbsolutePath()), "rhea_trace_upload", buildCommonParams(), new C32392d(file));
    }
}
