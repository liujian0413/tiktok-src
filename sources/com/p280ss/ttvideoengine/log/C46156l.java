package com.p280ss.ttvideoengine.log;

import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.l */
public final class C46156l {

    /* renamed from: a */
    public String f118495a = "";

    /* renamed from: b */
    public String f118496b = "";

    /* renamed from: c */
    public String f118497c = "";

    /* renamed from: d */
    public long f118498d = -2147483648L;

    /* renamed from: e */
    public String f118499e = "";

    /* renamed from: f */
    public long f118500f;

    /* renamed from: g */
    public long f118501g;

    /* renamed from: h */
    private C46146f f118502h;

    /* renamed from: i */
    private long f118503i = -2147483648L;

    /* renamed from: j */
    private HashMap f118504j;

    /* renamed from: k */
    private int f118505k;

    /* renamed from: l */
    private int f118506l;

    /* renamed from: m */
    private int f118507m;

    /* renamed from: a */
    public final void mo112461a() {
        this.f118505k++;
    }

    /* renamed from: d */
    private void m145016d() {
        this.f118502h.mo112445b(null);
        VideoEventManager.instance.addEventV2(m145017e(), "videoplayer_oneopera");
    }

    /* renamed from: b */
    public final long mo112464b() {
        if (this.f118504j.containsKey("seek")) {
            return ((Long) this.f118504j.get("seek")).longValue();
        }
        return -1;
    }

    /* renamed from: c */
    private void m145015c() {
        this.f118504j.remove(this.f118495a);
        this.f118495a = "";
        this.f118496b = "";
        this.f118497c = "";
        this.f118498d = 0;
        this.f118499e = "";
        this.f118503i = 0;
        this.f118505k = 0;
        this.f118507m = 0;
    }

    /* renamed from: e */
    private JSONObject m145017e() {
        HashMap hashMap = new HashMap();
        if (this.f118502h != null) {
            C46145e.m144709a((Map) hashMap, "player_sessionid", this.f118502h.f118282g);
            if (this.f118502h.f118286k == null || this.f118502h.f118286k.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118502h.f118283h);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118502h.f118286k);
            }
            if (this.f118502h.f118288m == null || this.f118502h.f118288m.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118502h.f118285j);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118502h.f118288m);
            }
            C46145e.m144709a((Map) hashMap, "resolution", this.f118502h.f118244B);
            C46145e.m144709a((Map) hashMap, "source_type", this.f118502h.f118293r);
            C46145e.m144709a((Map) hashMap, "v", this.f118502h.f118292q);
            C46145e.m144709a((Map) hashMap, "pv", this.f118502h.f118278c);
            C46145e.m144709a((Map) hashMap, "pc", this.f118502h.f118279d);
            C46145e.m144709a((Map) hashMap, "sv", this.f118502h.f118280e);
            C46145e.m144709a((Map) hashMap, "sdk_version", this.f118502h.f118281f);
            C46145e.m144709a((Map) hashMap, "vtype", this.f118502h.f118300y);
            C46145e.m144709a((Map) hashMap, "tag", this.f118502h.f118246D);
            C46145e.m144709a((Map) hashMap, "subtag", this.f118502h.f118247E);
            C46145e.m144707a((Map) hashMap, "p2p_cdn_type", this.f118502h.f118245C);
            C46145e.m144709a((Map) hashMap, "codec", this.f118502h.f118297v);
            C46145e.m144707a((Map) hashMap, "video_codec_nameid", this.f118502h.f118299x);
            C46145e.m144707a((Map) hashMap, "audio_codec_nameid", this.f118502h.f118298w);
            C46145e.m144707a((Map) hashMap, "drm_type", this.f118502h.f118249G);
            C46145e.m144707a((Map) hashMap, "mdl_speed", this.f118502h.f118267Y);
            C46145e.m144709a((Map) hashMap, "nt", this.f118502h.f118253K);
        }
        C46145e.m144709a((Map) hashMap, "opera_type", this.f118495a);
        C46145e.m144709a((Map) hashMap, "state_before", this.f118496b);
        C46145e.m144709a((Map) hashMap, "state_after", this.f118497c);
        C46145e.m144708a((Map) hashMap, "cost_time", this.f118498d);
        C46145e.m144709a((Map) hashMap, "end_type", this.f118499e);
        C46145e.m144707a((Map) hashMap, "index", this.f118507m);
        long j = -1;
        if (this.f118504j.containsKey(this.f118495a)) {
            j = this.f118503i - ((Long) this.f118504j.get(this.f118495a)).longValue();
        }
        C46145e.m144708a((Map) hashMap, "last_interval", j);
        C46145e.m144707a((Map) hashMap, "retry_count", this.f118505k);
        C46145e.m144707a((Map) hashMap, "reuse_socket", this.f118502h.f118248F);
        C46145e.m144707a((Map) hashMap, "is_seek_in_buffer", this.f118506l);
        C46145e.m144708a((Map) hashMap, "video_len_after", this.f118500f);
        C46145e.m144708a((Map) hashMap, "audio_len_after", this.f118501g);
        StringBuilder sb = new StringBuilder("brian OneOpera: ");
        sb.append(hashMap.toString());
        C46123h.m144545a("VideoEventOneOpera", sb.toString());
        return new JSONObject(hashMap);
    }

    C46156l(C46146f fVar) {
        this.f118502h = fVar;
        this.f118504j = new HashMap();
    }

    /* renamed from: a */
    public final void mo112463a(String str, int i) {
        if (this.f118503i <= 0 || this.f118495a.isEmpty()) {
            C46123h.m144545a("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f118498d = currentTimeMillis - this.f118503i;
        this.f118499e = str;
        this.f118506l = i;
        if (!(this.f118502h == null || this.f118502h.f118269a == null)) {
            Map b = this.f118502h.f118269a.mo112104b();
            if (b != null) {
                this.f118500f = ((Long) b.get("vlen")).longValue();
                this.f118501g = ((Long) b.get("alen")).longValue();
            }
        }
        m145016d();
        m145015c();
        this.f118504j.put("seek", Long.valueOf(currentTimeMillis));
    }

    /* renamed from: a */
    public final void mo112462a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("brian beginSeek from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        C46123h.m144545a("VideoEventOneOpera", sb.toString());
        this.f118503i = System.currentTimeMillis();
        this.f118495a = "seek";
        this.f118496b = Integer.toString(i);
        this.f118497c = Integer.toString(i2);
        this.f118498d = 0;
        this.f118507m = i3;
    }
}
