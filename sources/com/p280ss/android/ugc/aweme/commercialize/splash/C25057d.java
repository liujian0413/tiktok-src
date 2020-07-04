package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.d */
class C25057d {

    /* renamed from: a */
    private static final long f66153a = TimeUnit.DAYS.toMillis(3);

    /* renamed from: b */
    private static final long f66154b = TimeUnit.DAYS.toMillis(14);

    /* renamed from: f */
    private static String f66155f;

    /* renamed from: g */
    private static String f66156g;

    /* renamed from: h */
    private static String f66157h = "awemes.json";

    /* renamed from: c */
    private C6600e f66158c = new C6600e();

    /* renamed from: d */
    private SharedPreferences f66159d;

    /* renamed from: e */
    private volatile Map<String, Aweme> f66160e;

    /* renamed from: i */
    private long f66161i;

    /* renamed from: c */
    private Map<String, Aweme> m82517c() {
        if (this.f66160e == null) {
            synchronized (C25057d.class) {
                if (this.f66160e == null) {
                    this.f66160e = m82519d();
                }
            }
        }
        return this.f66160e;
    }

    /* renamed from: e */
    private long m82521e() {
        if (this.f66161i == 0 && this.f66159d != null) {
            this.f66161i = this.f66159d.getLong("awesome_splash_last_clean_time", 0);
        }
        return this.f66161i;
    }

    /* renamed from: f */
    private void m82522f() {
        if (this.f66159d != null) {
            this.f66159d.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
        }
    }

    /* renamed from: g */
    private String m82523g() {
        String h = m82524h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        if (this.f66159d != null) {
            String string = this.f66159d.getString("awesome_splash_info", null);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo65566b() {
        if (this.f66159d != null) {
            return this.f66159d.getBoolean("awesome_splash_filter_enable", false);
        }
        return false;
    }

    /* renamed from: h */
    private static String m82524h() {
        StringBuilder sb = new StringBuilder();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f66156g);
            sb2.append(f66157h);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(sb2.toString())));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* renamed from: d */
    private Map<String, Aweme> m82519d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            String g = m82523g();
            if (!TextUtils.isEmpty(g)) {
                Map map = (Map) this.f66158c.mo15975a(g, new C6597a<Map<String, Aweme>>() {
                }.type);
                if (map != null) {
                    if (map.size() != 0) {
                        concurrentHashMap.putAll(map);
                    }
                }
                return concurrentHashMap;
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb.append(e.toString());
            C42880h.m136156a(sb.toString());
            C6921a.m21559a((Throwable) e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f66156g);
            sb2.append(f66157h);
            File file = new File(sb2.toString());
            if (file.exists()) {
                file.delete();
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: i */
    private void m82525i() {
        long e = m82521e();
        if (e == 0 || System.currentTimeMillis() - e >= f66153a) {
            m82522f();
            File[] listFiles = new File(f66155f).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.exists() && file.isFile() && System.currentTimeMillis() - file.lastModified() >= f66154b && !m82518c(file.getName())) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private void m82526j() {
        File file = new File(f66156g);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f66156g);
        sb.append(f66157h);
        File file2 = new File(sb.toString());
        boolean z = false;
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f66158c.mo15980b(m82517c(), new C6597a<Map<String, Aweme>>() {
            }.type));
            bufferedWriter.close();
            z = true;
        } catch (IOException unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb2 = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb2.append(e.toString());
            C42880h.m136156a(sb2.toString());
            C6921a.m21559a((Throwable) e);
        }
        if (z && this.f66159d != null) {
            this.f66159d.edit().remove("awesome_splash_info").apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo65562a() {
        m82525i();
        if (m82517c() != null && m82517c().size() != 0) {
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (String str : m82517c().keySet()) {
                Aweme aweme = (Aweme) m82517c().get(str);
                if (aweme != null) {
                    if (!C25352e.m83340al(aweme)) {
                        hashMap.put(str, aweme);
                    } else if (m82520d(aweme.getAid())) {
                        m82516a(aweme.getAid(), f66155f);
                    }
                }
                z = true;
            }
            if (z) {
                m82517c().clear();
                m82517c().putAll(hashMap);
                m82526j();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Aweme mo65565b(String str) {
        return (Aweme) m82517c().get(str);
    }

    /* renamed from: a */
    private static void m82515a(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            status.setPrivateStatus(0);
            status.setAllowComment(true);
            status.setAllowShare(true);
        }
    }

    C25057d(String str) {
        AwemeApplication a = AwemeApplication.m21341a();
        f66155f = str;
        StringBuilder sb = new StringBuilder();
        sb.append(f66155f);
        sb.append("awemeJson/");
        f66156g = sb.toString();
        this.f66159d = C7285c.m22838a(a, "awesome_splash", 0);
    }

    /* renamed from: c */
    private boolean m82518c(String str) {
        for (Entry value : m82517c().entrySet()) {
            Aweme aweme = (Aweme) value.getValue();
            if (aweme != null && TextUtils.equals(aweme.getAid(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m82520d(String str) {
        for (String str2 : m82517c().keySet()) {
            Aweme aweme = (Aweme) m82517c().get(str2);
            if (aweme != null && TextUtils.equals(str, aweme.getAid()) && !C25352e.m83340al(aweme)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Aweme mo65561a(String str) {
        Aweme aweme = (Aweme) m82517c().get(str);
        if (C25352e.m83340al(aweme)) {
            return null;
        }
        return aweme;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo65563a(List<Aweme> list) {
        for (Aweme aweme : list) {
            m82515a(aweme);
            String ak = C25352e.m83339ak(aweme);
            if (!TextUtils.isEmpty(ak)) {
                m82517c().put(ak, aweme);
            }
        }
        m82526j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo65564a(boolean z) {
        if (this.f66159d != null) {
            this.f66159d.edit().putBoolean("awesome_splash_filter_enable", z).apply();
        }
    }

    /* renamed from: a */
    private static void m82516a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }
}
