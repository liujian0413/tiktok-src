package com.bytedance.crash.p501j;

import android.content.Context;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9992m;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.i */
public final class C9957i {

    /* renamed from: a */
    private static C9957i f27177a;

    /* renamed from: b */
    private File f27178b;

    /* renamed from: c */
    private File f27179c;

    /* renamed from: d */
    private File f27180d;

    /* renamed from: e */
    private Context f27181e;

    /* renamed from: f */
    private C9959a f27182f;

    /* renamed from: com.bytedance.crash.j.i$a */
    static class C9959a {

        /* renamed from: a */
        public long f27184a;

        /* renamed from: b */
        public long f27185b;

        /* renamed from: c */
        public File f27186c;

        /* renamed from: d */
        private JSONObject f27187d;

        /* renamed from: b */
        public final void mo24591b() {
            this.f27186c.delete();
        }

        /* renamed from: c */
        private String m29479c() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27184a);
            sb.append("-");
            sb.append(this.f27185b);
            sb.append(".ctx");
            return sb.toString();
        }

        /* renamed from: a */
        public final JSONObject mo24589a() {
            if (this.f27187d == null) {
                try {
                    this.f27187d = new JSONObject(C9982g.m29555c(this.f27186c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f27187d == null) {
                    this.f27187d = new JSONObject();
                }
            }
            return this.f27187d;
        }

        /* renamed from: a */
        public final void mo24590a(long j) {
            this.f27185b = j;
            this.f27186c.renameTo(new File(this.f27186c.getParent(), m29479c()));
        }

        private C9959a(File file) {
            this.f27186c = file;
            String[] split = file.getName().split("-|\\.");
            this.f27184a = Long.parseLong(split[0]);
            this.f27185b = Long.parseLong(split[1]);
        }

        /* renamed from: b */
        public final boolean mo24592b(long j) {
            if ((this.f27184a <= j || this.f27184a - j <= 604800000) && ((this.f27185b >= j || j - this.f27185b <= 604800000) && (this.f27186c.lastModified() >= j || j - this.f27186c.lastModified() <= 604800000))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    private C9959a m29469c() {
        if (this.f27182f == null) {
            m29472d();
        }
        return this.f27182f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo24585b() {
        try {
            return C9982g.m29555c(this.f27179c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: a */
    public static C9957i m29466a() {
        if (f27177a == null) {
            f27177a = new C9957i(C9918j.m29342g());
        }
        return f27177a;
    }

    /* renamed from: d */
    private ArrayList<C9959a> m29472d() {
        File[] listFiles = this.f27178b.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return Pattern.compile("^\\d{1,13}-\\d{1,13}.ctx$").matcher(str).matches();
            }
        });
        ArrayList<C9959a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C9959a aVar = null;
        for (File aVar2 : listFiles) {
            try {
                C9959a aVar3 = new C9959a(aVar2);
                arrayList.add(aVar3);
                if (this.f27182f == null && (aVar == null || aVar3.f27185b >= aVar.f27185b)) {
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
        if (this.f27182f == null && aVar != null) {
            this.f27182f = aVar;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24586b(String str) {
        try {
            C9982g.m29542a(this.f27179c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo24587c(String str) {
        try {
            C9982g.m29542a(this.f27180d, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final String mo24582a(String str) {
        try {
            return C9982g.m29555c(this.f27180d.getAbsolutePath());
        } catch (Throwable unused) {
            return null;
        }
    }

    private C9957i(Context context) {
        File c = C9992m.m29599c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
        }
        this.f27178b = c;
        this.f27179c = new File(c, "did");
        this.f27180d = new File(c, "device_uuid");
        this.f27181e = context;
    }

    /* renamed from: b */
    private void m29468b(long j) {
        try {
            ArrayList d = m29472d();
            if (d.size() > 3) {
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    C9959a aVar = (C9959a) it.next();
                    if (aVar.mo24592b(j)) {
                        aVar.mo24591b();
                    }
                }
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* renamed from: c */
    private File m29470c(long j) {
        Iterator it = m29472d().iterator();
        while (it.hasNext()) {
            C9959a aVar = (C9959a) it.next();
            if (j >= aVar.f27184a && j <= aVar.f27185b) {
                return aVar.f27186c;
            }
        }
        return null;
    }

    /* renamed from: d */
    private File m29471d(long j) {
        Iterator it = m29472d().iterator();
        C9959a aVar = null;
        while (it.hasNext()) {
            C9959a aVar2 = (C9959a) it.next();
            if (aVar == null || Math.abs(aVar.f27185b - j) > Math.abs(aVar2.f27185b - j)) {
                aVar = aVar2;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f27186c;
    }

    /* renamed from: a */
    public final JSONObject mo24583a(long j) {
        boolean z;
        String str;
        File c = m29470c(j);
        if (c == null) {
            c = m29471d(j);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (c != null) {
            try {
                str = C9982g.m29555c(c.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    th = th;
                    StringBuilder sb = new StringBuilder("content :");
                    sb.append(str);
                    C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) new IOException(sb.toString(), th));
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e) {
                        C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) e);
                    }
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                StringBuilder sb2 = new StringBuilder("content :");
                sb2.append(str);
                C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) new IOException(sb2.toString(), th));
                jSONObject.put("unauthentic_version", 1);
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo24584a(Map<String, Object> map) {
        if (map != null) {
            JSONObject a = C9898c.m29248a(this.f27181e).mo24509a(map);
            if (!C9898c.m29259e(a)) {
                long currentTimeMillis = System.currentTimeMillis();
                C9959a c = m29469c();
                if (c == null) {
                    m29467a(currentTimeMillis, currentTimeMillis, a);
                    return;
                }
                switch (m29465a(c.mo24589a(), a)) {
                    case 1:
                        m29467a(c.f27184a, currentTimeMillis, a);
                        C9982g.m29547a(c.f27186c);
                        break;
                    case 2:
                        m29467a(currentTimeMillis, currentTimeMillis, a);
                        break;
                    case 3:
                        c.mo24590a(currentTimeMillis);
                        break;
                }
                m29468b(currentTimeMillis);
            }
        }
    }

    /* renamed from: a */
    private static int m29465a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (C9898c.m29259e(jSONObject)) {
            return 2;
        }
        if (C9898c.m29259e(jSONObject2)) {
            return 0;
        }
        if (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code")))) {
            return 2;
        }
        if (C9898c.m29260f(jSONObject)) {
            return 1;
        }
        return 3;
    }

    /* renamed from: a */
    private void m29467a(long j, long j2, JSONObject jSONObject) {
        File file = this.f27178b;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("-");
        sb.append(j2);
        sb.append(".ctx");
        File file2 = new File(file, sb.toString());
        try {
            C9982g.m29543a(file2, jSONObject, false);
            this.f27182f = new C9959a(file2);
        } catch (IOException e) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", (Throwable) e);
        }
    }
}
