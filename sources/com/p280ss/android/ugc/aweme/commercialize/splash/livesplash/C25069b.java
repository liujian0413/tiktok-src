package com.p280ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.b */
public class C25069b {

    /* renamed from: a */
    private static final long f66170a = TimeUnit.DAYS.toMillis(3);

    /* renamed from: b */
    private static final long f66171b = TimeUnit.DAYS.toMillis(14);

    /* renamed from: f */
    private static String f66172f;

    /* renamed from: g */
    private static String f66173g;

    /* renamed from: h */
    private static String f66174h = "awemes.json";

    /* renamed from: c */
    private C6600e f66175c = new C6600e();

    /* renamed from: d */
    private Keva f66176d;

    /* renamed from: e */
    private volatile Map<String, Aweme> f66177e;

    /* renamed from: g */
    private String m82566g() {
        String h = m82567h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo65581c() {
        if (this.f66176d != null) {
            this.f66176d.storeLong("live_awesome_splash_last_show_time", System.currentTimeMillis());
        }
    }

    /* renamed from: e */
    private Map<String, Aweme> m82564e() {
        if (this.f66177e == null) {
            synchronized (C25069b.class) {
                if (this.f66177e == null) {
                    this.f66177e = m82565f();
                }
            }
        }
        return this.f66177e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo65579a() {
        if (this.f66176d != null) {
            return this.f66176d.getBoolean("live_awesome_splash_filter_enable", false);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo65580b() {
        if (this.f66176d == null) {
            return false;
        }
        long j = this.f66176d.getLong("live_awesome_splash_last_show_time", 0);
        if (j != 0 && j > m82569j()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static String m82567h() {
        StringBuilder sb = new StringBuilder();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f66173g);
            sb2.append(f66174h);
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

    /* renamed from: j */
    private static long m82569j() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance.getTime().getTime();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Aweme mo65582d() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (Aweme aweme : m82564e().values()) {
            LiveAwesomeSplashInfo h = C25072c.m82582h(aweme);
            if (h != null && h.getTopviewValid() && currentTimeMillis <= h.getEndTime() && currentTimeMillis >= h.getStartTime()) {
                return aweme;
            }
        }
        return null;
    }

    /* renamed from: f */
    private Map<String, Aweme> m82565f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            String g = m82566g();
            if (!TextUtils.isEmpty(g)) {
                Map map = (Map) this.f66175c.mo15975a(g, new C6597a<Map<String, Aweme>>() {
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
            sb2.append(f66173g);
            sb2.append(f66174h);
            File file = new File(sb2.toString());
            if (file.exists()) {
                file.delete();
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: i */
    private void m82568i() {
        File file = new File(f66173g);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f66173g);
        sb.append(f66174h);
        File file2 = new File(sb.toString());
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.f66175c.mo15980b(m82564e(), new C6597a<Map<String, Aweme>>() {
            }.type));
            bufferedWriter.close();
        } catch (IOException unused) {
        } catch (OutOfMemoryError e) {
            StringBuilder sb2 = new StringBuilder("AwesomeSplash OutOfMemoryError:");
            sb2.append(e.toString());
            C42880h.m136156a(sb2.toString());
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    static boolean m82561a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        LiveAwesomeSplashInfo h = C25072c.m82582h(aweme);
        if (h == null) {
            return false;
        }
        h.setTopViewData(true);
        return true;
    }

    /* renamed from: c */
    private static void m82563c(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            status.setPrivateStatus(0);
            status.setAllowComment(true);
            status.setAllowShare(true);
        }
    }

    C25069b(String str) {
        f66172f = str;
        StringBuilder sb = new StringBuilder();
        sb.append(f66172f);
        sb.append("awemeJson/");
        f66173g = sb.toString();
        this.f66176d = Keva.getRepo("live_awesome_splash", 0);
    }

    /* renamed from: b */
    static boolean m82562b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return false;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (playAddr == null || C6307b.m19566a((Collection<T>) playAddr.getUrlList())) {
            return false;
        }
        if (TextUtils.isEmpty(C25074d.m82584a().mo65576a(aweme.getAid()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo65578a(List<Aweme> list) {
        for (Aweme aweme : list) {
            m82563c(aweme);
            if (C25072c.m82576b(aweme)) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    m82564e().put(aid, aweme);
                }
            }
        }
        m82568i();
    }
}
