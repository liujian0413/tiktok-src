package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.performance.C3221a;
import com.bytedance.android.live.core.utils.C3356aa;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.p441d.C9309b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.e */
public class C8764e implements C3449a {

    /* renamed from: a */
    private boolean f23799a;

    /* renamed from: b */
    private float f23800b;

    /* renamed from: c */
    private String f23801c = "tt";

    /* renamed from: d */
    private int f23802d;

    /* renamed from: e */
    private int f23803e;

    /* renamed from: com.bytedance.android.livesdk.player.e$a */
    static class C8766a implements Callable {

        /* renamed from: a */
        private final float f23804a;

        /* renamed from: b */
        private final JSONObject f23805b;

        /* renamed from: c */
        private int f23806c;

        /* renamed from: d */
        private int f23807d;

        public final Object call() throws Exception {
            try {
                m26211a();
            } catch (Exception unused) {
            }
            return null;
        }

        /* renamed from: a */
        private void m26211a() throws Exception {
            String str;
            float a = ((float) C3356aa.m12507a()) / 1024.0f;
            float f = a - this.f23804a;
            Context context = ((IHostContext) C3596c.m13172a(IHostContext.class)).context();
            String a2 = C3356aa.m12508a(context.getPackageName());
            JSONObject jSONObject = this.f23805b;
            String str2 = "cpu";
            if ("".equals(a2)) {
                str = "0";
            } else {
                str = a2;
            }
            jSONObject.put(str2, str);
            StringBuilder sb = new StringBuilder("live push cpu:");
            sb.append(a2);
            C3166a.m11964c("LivePlayerLog", sb.toString());
            this.f23805b.put("memory", (int) a);
            this.f23805b.put("live_push_memory", (int) f);
            this.f23805b.put("product_line", "live");
            this.f23805b.put("start_memory", (int) this.f23804a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", this.f23805b);
            jSONObject2.put("did", AppLog.getServerDeviceId());
            jSONObject2.put("uid", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
            jSONObject2.put("net_type", NetworkUtils.getNetworkAccessType(context));
            jSONObject2.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
            if (C8771i.m26214a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData != null) {
                jSONObject2.put("app_version_four", C8771i.m26214a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData.getInt("UPDATE_VERSION_CODE"));
            }
            this.f23805b.put("channel", ((IHostContext) C3596c.m13172a(IHostContext.class)).getChannel());
            this.f23805b.put("device_name", Build.MODEL);
            int a3 = C3221a.m12212a(context, Process.myPid());
            if (a3 != -1) {
                this.f23805b.put("dalvik_pss", a3);
            }
            this.f23805b.put("screen_height", this.f23806c);
            this.f23805b.put("screen_width", this.f23807d);
            C3172e.m12006a("live_client_monitor_log", (String) null, this.f23805b);
        }

        private C8766a(int i, int i2, float f, JSONObject jSONObject) {
            this.f23806c = i;
            this.f23807d = i2;
            this.f23804a = f;
            this.f23805b = jSONObject;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.player.e$b */
    static class C8767b implements Callable {

        /* renamed from: a */
        private final float f23808a;

        /* renamed from: b */
        private final JSONObject f23809b;

        /* renamed from: c */
        private int f23810c;

        /* renamed from: d */
        private int f23811d;

        public final Object call() throws Exception {
            try {
                m26212a();
            } catch (Exception unused) {
            }
            return null;
        }

        /* renamed from: a */
        private void m26212a() {
            String str;
            if (this.f23809b != null) {
                float a = ((float) C3356aa.m12507a()) / 1024.0f;
                float f = a - this.f23808a;
                Context context = ((IHostContext) C3596c.m13172a(IHostContext.class)).context();
                try {
                    if (TextUtils.equals("playing", this.f23809b.optString("event_key"))) {
                        String a2 = C3356aa.m12508a(context.getPackageName());
                        JSONObject jSONObject = this.f23809b;
                        String str2 = "cpu";
                        if ("".equals(a2)) {
                            str = "0";
                        } else {
                            str = a2;
                        }
                        jSONObject.put(str2, str);
                        StringBuilder sb = new StringBuilder("live pull cpu:");
                        sb.append(a2);
                        C3166a.m11964c("LivePlayerLog", sb.toString());
                    }
                    this.f23809b.put("memory", (int) a);
                    this.f23809b.put("live_pull_memory", (int) f);
                    this.f23809b.put("start_memory", (int) this.f23808a);
                    this.f23809b.put("channel", ((IHostContext) C3596c.m13172a(IHostContext.class)).getChannel());
                    this.f23809b.put("device_name", Build.MODEL);
                    this.f23809b.put("did", AppLog.getServerDeviceId());
                    this.f23809b.put("uid", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
                    this.f23809b.put("net_type", NetworkUtils.getNetworkAccessType(context));
                    this.f23809b.put("net_des", NetworkUtils.getNetworkOperatorCode(context));
                    if (C8772j.m26215a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData != null) {
                        this.f23809b.put("app_version_four", C8772j.m26215a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData.getInt("UPDATE_VERSION_CODE"));
                    }
                    this.f23809b.put("ttlive_sdk_version", "1380");
                    int a3 = C3221a.m12212a(context, Process.myPid());
                    if (a3 != -1) {
                        this.f23809b.put("dalvik_pss", a3);
                    }
                    this.f23809b.put("screen_height", this.f23810c);
                    this.f23809b.put("screen_width", this.f23811d);
                    C3172e.m12006a("live_client_monitor_log", (String) null, this.f23809b);
                } catch (Exception e) {
                    C3166a.m11963b("LivePlayerLog", (Throwable) e);
                }
            }
        }

        C8767b(int i, int i2, float f, JSONObject jSONObject) {
            this.f23810c = i;
            this.f23811d = i2;
            this.f23808a = f;
            this.f23809b = jSONObject;
        }
    }

    /* renamed from: b */
    public final void mo21807b() {
        this.f23799a = false;
        this.f23800b = 0.0f;
    }

    public C8764e() {
        C9309b.m27663a().mo22788a(C8768f.f23812a);
    }

    /* renamed from: a */
    public final void mo21804a() {
        this.f23799a = true;
        this.f23802d = C3358ac.m12520b();
        this.f23803e = C3358ac.m12523c();
        C9309b.m27663a().mo22790a((Callable) new C8769g(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo21809c() throws Exception {
        C9309b.m27663a().mo22789a((Runnable) new C8770h(this, ((float) C3356aa.m12507a()) / 1024.0f));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21805a(float f) {
        if (this.f23799a && f >= 0.0f) {
            this.f23800b = f;
        }
    }

    /* renamed from: b */
    public final void mo21808b(JSONObject jSONObject) {
        C9309b.m27663a().mo22790a((Callable) new C8767b(this.f23802d, this.f23803e, this.f23800b, jSONObject));
    }

    /* renamed from: a */
    public final void mo21806a(JSONObject jSONObject) {
        C9309b a = C9309b.m27663a();
        C8766a aVar = new C8766a(this.f23802d, this.f23803e, this.f23800b, jSONObject);
        a.mo22790a((Callable) aVar);
    }
}
