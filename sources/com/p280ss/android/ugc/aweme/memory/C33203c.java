package com.p280ss.android.ugc.aweme.memory;

import android.os.Environment;
import bolts.C1592h;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p249l.C6265a;
import com.bytedance.crash.p498g.C9901a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p509f.C10052a;
import com.bytedance.services.apm.api.C12915d;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.monitor.C19906a;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.memory.c */
public final class C33203c {
    /* renamed from: c */
    private static void m107113c() {
    }

    /* renamed from: a */
    public static void m107108a() {
        C1592h.m7853a(C33205d.f86401a);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m107112b() throws Exception {
        try {
            final String absolutePath = C19906a.m65709b().getAbsolutePath();
            if (!new File(absolutePath, "reports").exists()) {
                return Boolean.valueOf(true);
            }
            final ArrayList arrayList = new ArrayList(4);
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/.maps");
            arrayList.add(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/.fds");
            arrayList.add(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(absolutePath);
            sb3.append("/.threads");
            arrayList.add(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(absolutePath);
            sb4.append("/reports");
            arrayList.add(sb4.toString());
            C43136fo.m136825a(absolutePath, "raphael.zip", (List<String>) arrayList);
            JSONObject jSONObject = new JSONObject();
            for (Entry entry : C6174c.m19151i().entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C6265a aVar = new C6265a();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C6781d.m20986d());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(absolutePath);
            sb6.append("/raphael.zip");
            List singletonList = Collections.singletonList(sb6.toString());
            StringBuilder sb7 = new StringBuilder("raphael-");
            sb7.append(TeaAgent.getServerDeviceId());
            aVar.mo15049a(sb5.toString(), "67537833736", "raphael", singletonList, sb7.toString(), jSONObject, new C12915d() {
                /* renamed from: a */
                public final void mo31398a(String str) {
                }

                /* renamed from: a */
                public final void mo31397a() {
                    List list = arrayList;
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/raphael.zip");
                    list.add(sb.toString());
                    C33203c.m107111a(arrayList);
                }
            });
            return Boolean.valueOf(true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static void m107111a(List<String> list) {
        for (String file : list) {
            try {
                new File(file).delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m107109a(String str) {
        if (str.contains("OutOfMemoryError: pthread_create")) {
            File b = C19906a.m65709b();
            C10052a.m29858a(b, ".maps");
            C10052a.m29857a(C6399b.m19921a(), b, ".fds");
            C10052a.m29861b(C6399b.m19921a(), b, ".threads");
            m107113c();
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/.raphael/reports");
            File file = new File(sb.toString());
            if (file.exists()) {
                file.renameTo(new File(b, "reports"));
            }
        }
    }

    /* renamed from: a */
    public static void m107110a(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            C9901a.m29272a().uncaughtException(thread, th);
        }
    }
}
