package com.bytedance.ttnet.utils;

import android.content.Context;
import android.os.Environment;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.p254b.C9714c;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.b */
public class C12997b {

    /* renamed from: a */
    public static String f34413a = "https://crash.snssdk.com";

    /* renamed from: b */
    private static volatile C12997b f34414b;

    /* renamed from: m */
    private static AtomicBoolean f34415m = new AtomicBoolean(false);

    /* renamed from: c */
    private final MediaType f34416c = MediaType.parse("multipart/form-data");

    /* renamed from: d */
    private OkHttpClient f34417d = new OkHttpClient();

    /* renamed from: e */
    private String f34418e;

    /* renamed from: f */
    private long f34419f = 10000;

    /* renamed from: g */
    private int f34420g = 10;

    /* renamed from: h */
    private long f34421h = 30;

    /* renamed from: i */
    private long f34422i = 30;

    /* renamed from: j */
    private long f34423j = 30;

    /* renamed from: k */
    private String f34424k;

    /* renamed from: l */
    private Context f34425l;

    /* renamed from: com.bytedance.ttnet.utils.b$a */
    static class C12999a implements Comparator<File> {
        C12999a() {
        }

        /* renamed from: a */
        private static int m37928a(File file, File file2) {
            if (file.lastModified() < file2.lastModified()) {
                return 1;
            }
            return -1;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m37928a((File) obj, (File) obj2);
        }
    }

    /* renamed from: a */
    public final void mo31535a() {
        C9714c.m28652b().schedule(new Runnable() {
            public final void run() {
                try {
                    C12997b.this.mo31536b();
                } catch (Throwable unused) {
                }
            }
        }, this.f34419f, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    private ArrayList<String> m37925c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        File file = new File(this.f34418e);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int i = 0;
                int i2 = 0;
                for (File file2 : listFiles) {
                    if (file2.getName().contains(".dmp")) {
                        arrayList2.add(file2.getName());
                        arrayList.add(file2);
                        i2++;
                    }
                }
                if (i2 > this.f34420g) {
                    arrayList2.clear();
                    Collections.sort(arrayList, new C12999a());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file3 = (File) it.next();
                        i++;
                        if (i <= this.f34420g) {
                            arrayList2.add(file3.getName());
                        } else {
                            m37923a(file3.getAbsolutePath());
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final void mo31536b() {
        if (!f34415m.getAndSet(true)) {
            this.f34424k = C10142f.m30097a(this.f34424k, true);
            Iterator it = m37925c().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    if (NetworkUtils.m19548b(this.f34425l)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f34418e);
                        sb.append("/");
                        sb.append(str);
                        m37924a(str, sb.toString());
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m37923a(String str) {
        new File(str).delete();
    }

    /* renamed from: a */
    public static C12997b m37922a(Context context) {
        if (f34414b == null) {
            synchronized (C12997b.class) {
                if (f34414b == null) {
                    f34414b = new C12997b(context);
                }
            }
        }
        return f34414b;
    }

    private C12997b(Context context) {
        this.f34425l = context;
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(packageName);
        sb.append("/cache/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("minidump");
        this.f34418e = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f34413a);
        sb4.append("/ttnet_crash/upload");
        this.f34424k = sb4.toString();
    }

    /* renamed from: a */
    private void m37924a(String str, String str2) throws Exception {
        if (new JSONObject(this.f34417d.newBuilder().connectTimeout(this.f34421h, TimeUnit.SECONDS).writeTimeout(this.f34422i, TimeUnit.SECONDS).readTimeout(this.f34423j, TimeUnit.SECONDS).build().newCall(new Builder().url(this.f34424k).post(new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("upfile", str, RequestBody.create(this.f34416c, new File(str2))).build()).build()).execute().body.string()).getString("code").contentEquals("0")) {
            m37923a(str2);
        }
    }
}
