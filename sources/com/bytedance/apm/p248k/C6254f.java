package com.bytedance.apm.p248k;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.internal.C6237b;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.util.C9640c;
import com.bytedance.apm.util.C9642e;
import com.bytedance.apm.util.C9654s;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.f */
public final class C6254f extends C6244a {

    /* renamed from: q */
    private static long f18407q = 17179869184L;

    /* renamed from: a */
    public long f18408a = 524288000;

    /* renamed from: d */
    public String f18409d;

    /* renamed from: e */
    public String f18410e;

    /* renamed from: f */
    public String f18411f;

    /* renamed from: g */
    public String f18412g;

    /* renamed from: h */
    public long f18413h;

    /* renamed from: i */
    public long f18414i;

    /* renamed from: j */
    public long f18415j;

    /* renamed from: k */
    public long f18416k;

    /* renamed from: l */
    private boolean f18417l;

    /* renamed from: m */
    private boolean f18418m;

    /* renamed from: n */
    private long f18419n = 524288000;

    /* renamed from: o */
    private int f18420o = 20;

    /* renamed from: p */
    private long f18421p = 2592000000L;

    /* renamed from: r */
    private boolean f18422r;

    /* renamed from: s */
    private C9654s<C6256a> f18423s;

    /* renamed from: t */
    private C9654s<C6256a> f18424t;

    /* renamed from: u */
    private C9654s<C6258c> f18425u;

    /* renamed from: com.bytedance.apm.k.f$a */
    static class C6256a implements Comparable {

        /* renamed from: a */
        public long f18426a;

        /* renamed from: b */
        private String f18427b;

        /* renamed from: c */
        private int f18428c;

        /* renamed from: a */
        public final JSONObject mo15038a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.f18427b);
                jSONObject.put("size", this.f18426a);
                if (this.f18428c > 0) {
                    jSONObject.put("num", this.f18428c);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public final int compareTo(Object obj) {
            C6256a aVar = (C6256a) obj;
            if (this.f18426a == aVar.f18426a) {
                return 0;
            }
            if (this.f18426a > aVar.f18426a) {
                return 1;
            }
            return -1;
        }

        public C6256a(String str, long j, int i) {
            this.f18427b = str;
            this.f18426a = j;
            this.f18428c = i;
        }
    }

    /* renamed from: com.bytedance.apm.k.f$b */
    class C6257b {

        /* renamed from: a */
        public String f18429a;

        /* renamed from: b */
        public C6257b f18430b;

        /* renamed from: c */
        public int f18431c;

        /* renamed from: d */
        public int f18432d;

        /* renamed from: e */
        public boolean f18433e;

        /* renamed from: f */
        public long f18434f;

        /* renamed from: h */
        private int f18436h;

        /* renamed from: i */
        private boolean f18437i;

        /* renamed from: a */
        private boolean m19416a() {
            if (this.f18436h == this.f18432d) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m19417b() {
            if (TextUtils.equals(this.f18429a, C6254f.this.f18409d)) {
                C6254f.this.f18413h = (long) this.f18431c;
            } else if (TextUtils.equals(this.f18429a, C6254f.this.f18411f)) {
                C6254f.this.f18414i = (long) this.f18431c;
            } else if (TextUtils.equals(this.f18429a, C6254f.this.f18410e)) {
                C6254f.this.f18415j = (long) this.f18431c;
            } else {
                if (TextUtils.equals(this.f18429a, C6254f.this.f18412g)) {
                    C6254f.this.f18416k = (long) this.f18431c;
                }
            }
        }

        private C6257b() {
        }

        /* renamed from: a */
        public final void mo15040a(long j) {
            this.f18431c = (int) (((long) this.f18431c) + j);
            this.f18436h++;
            if (this.f18430b != null && m19416a()) {
                if (this.f18437i) {
                    this.f18430b.f18437i = true;
                }
                if (((long) this.f18431c) >= C6254f.this.f18408a && !this.f18437i) {
                    C6254f.this.mo15036a(this.f18429a, (long) this.f18431c, this.f18436h, this.f18432d);
                    this.f18430b.f18437i = true;
                }
                this.f18430b.mo15040a((long) this.f18431c);
                if (this.f18433e) {
                    C6254f.this.mo15037a(this.f18429a, (long) this.f18431c, this.f18432d, this.f18434f);
                }
                m19417b();
            }
        }
    }

    /* renamed from: com.bytedance.apm.k.f$c */
    static class C6258c implements Comparable {

        /* renamed from: a */
        public long f18438a;

        /* renamed from: b */
        private String f18439b;

        /* renamed from: c */
        private int f18440c;

        /* renamed from: d */
        private long f18441d;

        /* renamed from: a */
        public final JSONObject mo15041a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.f18439b);
                jSONObject.put("size", this.f18438a);
                if (this.f18440c > 0) {
                    jSONObject.put("num", this.f18440c);
                }
                jSONObject.put("outdate_interval", this.f18441d);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        public final int compareTo(Object obj) {
            C6258c cVar = (C6258c) obj;
            if (this.f18441d == cVar.f18441d) {
                return 0;
            }
            if (this.f18441d > cVar.f18441d) {
                return 1;
            }
            return -1;
        }

        public C6258c(String str, long j, int i, long j2) {
            this.f18439b = str;
            this.f18438a = j;
            this.f18440c = i;
            this.f18441d = j2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return 120000;
    }

    /* renamed from: i */
    private void m19406i() {
        try {
            m19403a(C9640c.m28520b(C6174c.m19129a()), C9640c.m28523c(C6174c.m19129a()), C9640c.m28526e(), Environment.getDataDirectory().getFreeSpace());
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    private void m19407j() {
        try {
            m19408k();
            m19403a(this.f18413h + this.f18414i, this.f18415j + this.f18416k, Environment.getDataDirectory().getTotalSpace() + Environment.getRootDirectory().getTotalSpace(), Environment.getDataDirectory().getFreeSpace());
            C6237b.m19335a().mo15021a("check_disk_last_time", System.currentTimeMillis());
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void mo14867e() {
        boolean z = this.f18371c;
        if (!this.f18417l && z) {
            m19402a();
            if (this.f18422r) {
                this.f18417l = true;
                return;
            }
            if (this.f18418m) {
                m19407j();
            } else {
                m19406i();
            }
            this.f18417l = true;
            mo15025g();
            mo15026h();
        }
    }

    /* renamed from: a */
    private void m19402a() {
        if (this.f18409d == null) {
            Context a = C6174c.m19129a();
            try {
                String packageName = a.getPackageName();
                this.f18409d = a.getFilesDir().getParent();
                this.f18410e = a.getCacheDir().getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(C9642e.m28530a());
                sb.append("/Android/data/");
                sb.append(packageName);
                this.f18411f = sb.toString();
                File externalCacheDir = a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    this.f18412g = externalCacheDir.getAbsolutePath();
                }
            } catch (Exception unused) {
                this.f18422r = true;
            }
        }
    }

    /* renamed from: k */
    private void m19408k() {
        int i;
        String[] strArr;
        String[] strArr2 = {this.f18409d, this.f18411f};
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            String str = strArr2[i2];
            File file = new File(str);
            C6257b bVar = new C6257b();
            bVar.f18429a = str;
            bVar.f18430b = new C6257b();
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                bVar.f18432d = listFiles.length;
                LinkedList linkedList = new LinkedList();
                linkedList.offer(bVar);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        C6257b bVar2 = (C6257b) linkedList.poll();
                        if (bVar2 != null) {
                            String str2 = bVar2.f18429a;
                            File file2 = new File(str2);
                            strArr = strArr2;
                            if (file2.isFile()) {
                                long length = file2.length();
                                if (length > 0) {
                                    m19404a(str2, length);
                                }
                                if (bVar2.f18430b != null) {
                                    bVar2.f18430b.mo15040a(length);
                                    if (!bVar2.f18430b.f18433e) {
                                        long b = m19405b(file2.lastModified());
                                        if (b > 0) {
                                            i = i4;
                                            mo15037a(str2, length, 0, b);
                                        }
                                    }
                                }
                                i = i4;
                            } else {
                                i = i4;
                                File[] listFiles2 = file2.listFiles();
                                if (listFiles2 == null || listFiles2.length == 0) {
                                    bVar2.f18430b.mo15040a(0);
                                    i4 = i + 1;
                                    strArr2 = strArr;
                                } else {
                                    bVar2.f18432d = listFiles2.length;
                                    for (File file3 : listFiles2) {
                                        C6257b bVar3 = new C6257b();
                                        bVar3.f18430b = bVar2;
                                        bVar3.f18429a = file3.getAbsolutePath();
                                        if (file3.isDirectory() && !bVar2.f18433e) {
                                            long b2 = m19405b(file3.lastModified());
                                            if (b2 > 0) {
                                                bVar3.f18433e = true;
                                                bVar3.f18434f = b2;
                                                linkedList.offer(bVar3);
                                            }
                                        }
                                        linkedList.offer(bVar3);
                                    }
                                }
                            }
                        } else {
                            i = i4;
                            strArr = strArr2;
                        }
                        i4 = i + 1;
                        strArr2 = strArr;
                    }
                }
            }
            i2++;
            strArr2 = strArr2;
        }
    }

    /* renamed from: b */
    private long m19405b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < this.f18421p || currentTimeMillis >= 62899200000L) {
            return 0;
        }
        return currentTimeMillis;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14862a(JSONObject jSONObject) {
        this.f18418m = jSONObject.optBoolean("exception_disk_switch", false);
        if (this.f18418m) {
            long currentTimeMillis = System.currentTimeMillis() - C6237b.m19335a().mo15023b("check_disk_last_time");
            if (currentTimeMillis < 86400000 && currentTimeMillis > 0) {
                this.f18417l = true;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("exception_disk");
            if (optJSONObject.optInt("disk_used_size_threshold") > 0) {
                this.f18419n = ((long) optJSONObject.optInt("disk_used_size_threshold")) * 1024 * 1024;
            }
            if (optJSONObject.optInt("folder_size_threshold") > 0) {
                this.f18408a = ((long) optJSONObject.optInt("folder_size_threshold")) * 1024 * 1024;
            }
            if (optJSONObject.optInt("outdate_interval") > 0) {
                this.f18420o = optJSONObject.optInt("outdate_interval");
            }
            if (optJSONObject.optInt("max_report_count") > 0) {
                this.f18421p = ((long) optJSONObject.optInt("max_report_count")) * 86400000;
            }
        }
    }

    /* renamed from: a */
    private void m19404a(String str, long j) {
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("appendExceptionFileQueue: path: ");
            sb.append(str);
            sb.append(", size: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        if (j <= f18407q) {
            if (this.f18423s == null) {
                this.f18423s = new C9654s<>(this.f18420o);
            }
            this.f18423s.mo24000a(new C6256a(str, j, 1));
        }
    }

    /* renamed from: a */
    public final void mo15036a(String str, long j, int i, int i2) {
        if (j <= f18407q) {
            if (this.f18424t == null) {
                this.f18424t = new C9654s<>(this.f18420o);
            }
            this.f18424t.mo24000a(new C6256a(str, j, i2));
        }
    }

    /* renamed from: a */
    private void m19403a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7 = j;
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        try {
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("disk: data: ");
                sb.append(j7);
                sb.append(" , cache: ");
                sb.append(j8);
                sb.append(" , total: ");
                sb.append(j9);
                sb.append(" , free: ");
                sb.append(j10);
                String[] strArr = {sb.toString()};
            }
            if (j7 > f18407q) {
                j5 = f18407q;
            } else {
                j5 = j7;
            }
            if (j8 > f18407q) {
                j6 = f18407q;
            } else {
                j6 = j8;
            }
            JSONObject jSONObject = new JSONObject();
            if (j7 > 0) {
                jSONObject.put("data", j5);
            }
            if (j8 > 0) {
                jSONObject.put("cache", j6);
            }
            if (j9 > 0) {
                jSONObject.put("total", j9);
            }
            if (j10 > 0) {
                jSONObject.put("rom_free", j10);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.f18418m && j5 > this.f18419n) {
                if (this.f18423s != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C6256a a : this.f18423s.mo23999a()) {
                        JSONObject a2 = a.mo15038a();
                        if (a2 != null) {
                            jSONArray.put(a2);
                        }
                    }
                    jSONObject2.put("top_usage", jSONArray);
                    this.f18423s = null;
                }
                if (this.f18424t != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C6256a a3 : this.f18424t.mo23999a()) {
                        JSONObject a4 = a3.mo15038a();
                        if (a4 != null) {
                            jSONArray2.put(a4);
                        }
                    }
                    jSONObject2.put("exception_folders", jSONArray2);
                    this.f18424t = null;
                }
                if (this.f18425u != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (C6258c a5 : this.f18425u.mo23999a()) {
                        JSONObject a6 = a5.mo15041a();
                        if (a6 != null) {
                            jSONArray3.put(a6);
                        }
                    }
                    jSONObject2.put("outdated_files", jSONArray3);
                    this.f18425u = null;
                }
            }
            C9600e eVar = new C9600e("disk", "storageUsed", false, jSONObject, null, jSONObject2);
            m19342a(eVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo15037a(String str, long j, int i, long j2) {
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("appendutdatedFileQueue: path: ");
            sb.append(str);
            sb.append(", size: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        if (j >= 102400 && j <= f18407q) {
            if (this.f18425u == null) {
                this.f18425u = new C9654s<>(this.f18420o);
            }
            C9654s<C6258c> sVar = this.f18425u;
            C6258c cVar = new C6258c(str, j, i, j2);
            sVar.mo24000a(cVar);
        }
    }
}
