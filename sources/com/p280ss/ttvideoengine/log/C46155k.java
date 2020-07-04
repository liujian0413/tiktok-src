package com.p280ss.ttvideoengine.log;

import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.k */
public final class C46155k {

    /* renamed from: a */
    public String f118478a = "";

    /* renamed from: b */
    public long f118479b = -2147483648L;

    /* renamed from: c */
    public String f118480c = "";

    /* renamed from: d */
    public long f118481d = -2147483648L;

    /* renamed from: e */
    public long f118482e = -2147483648L;

    /* renamed from: f */
    public long f118483f = -2147483648L;

    /* renamed from: g */
    public int f118484g = Integer.MIN_VALUE;

    /* renamed from: h */
    public int f118485h;

    /* renamed from: i */
    public long f118486i;

    /* renamed from: j */
    public long f118487j;

    /* renamed from: k */
    public long f118488k;

    /* renamed from: l */
    public long f118489l;

    /* renamed from: m */
    public long f118490m;

    /* renamed from: n */
    public int f118491n;

    /* renamed from: o */
    private C46146f f118492o;

    /* renamed from: p */
    private C46156l f118493p;

    /* renamed from: q */
    private HashMap f118494q;

    /* renamed from: a */
    public final void mo112457a() {
        this.f118485h++;
    }

    /* renamed from: b */
    public final void mo112460b() {
        this.f118482e = System.currentTimeMillis();
    }

    /* renamed from: d */
    private void m145009d() {
        this.f118492o.mo112445b(null);
        VideoEventManager.instance.addEventV2(m145010e(), "videoplayer_oneevent");
    }

    /* renamed from: c */
    private void m145008c() {
        this.f118494q.remove(this.f118478a);
        this.f118478a = "";
        this.f118479b = -2147483648L;
        this.f118480c = "";
        this.f118481d = -2147483648L;
        this.f118483f = -2147483648L;
        this.f118484g = Integer.MIN_VALUE;
        this.f118485h = 0;
        this.f118488k = 0;
        this.f118486i = 0;
        this.f118489l = 0;
        this.f118487j = 0;
        this.f118490m = 0;
        this.f118491n = 0;
    }

    /* renamed from: e */
    private JSONObject m145010e() {
        long j;
        long j2;
        HashMap hashMap = new HashMap();
        if (this.f118492o != null) {
            C46145e.m144709a((Map) hashMap, "player_sessionid", this.f118492o.f118282g);
            if (this.f118492o.f118286k == null || this.f118492o.f118286k.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118492o.f118283h);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118492o.f118286k);
            }
            if (this.f118492o.f118288m == null || this.f118492o.f118288m.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118492o.f118285j);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118492o.f118288m);
            }
            C46145e.m144709a((Map) hashMap, "resolution", this.f118492o.f118244B);
            C46145e.m144709a((Map) hashMap, "source_type", this.f118492o.f118293r);
            C46145e.m144709a((Map) hashMap, "v", this.f118492o.f118292q);
            C46145e.m144709a((Map) hashMap, "pv", this.f118492o.f118278c);
            C46145e.m144709a((Map) hashMap, "pc", this.f118492o.f118279d);
            C46145e.m144709a((Map) hashMap, "sv", this.f118492o.f118280e);
            C46145e.m144709a((Map) hashMap, "sdk_version", this.f118492o.f118281f);
            C46145e.m144709a((Map) hashMap, "vtype", this.f118492o.f118300y);
            C46145e.m144709a((Map) hashMap, "tag", this.f118492o.f118246D);
            C46145e.m144709a((Map) hashMap, "subtag", this.f118492o.f118247E);
            C46145e.m144707a((Map) hashMap, "p2p_cdn_type", this.f118492o.f118245C);
            C46145e.m144709a((Map) hashMap, "codec", this.f118492o.f118297v);
            C46145e.m144707a((Map) hashMap, "video_codec_nameid", this.f118492o.f118299x);
            C46145e.m144707a((Map) hashMap, "audio_codec_nameid", this.f118492o.f118298w);
            C46145e.m144707a((Map) hashMap, "drm_type", this.f118492o.f118249G);
            C46145e.m144706a((Map) hashMap, "play_speed", this.f118492o.f118251I);
            C46145e.m144708a((Map) hashMap, "cur_req_pos", this.f118492o.f118255M);
            C46145e.m144708a((Map) hashMap, "cur_end_pos", this.f118492o.f118256N);
            C46145e.m144708a((Map) hashMap, "cur_cache_pos", this.f118492o.f118257O);
            C46145e.m144709a((Map) hashMap, "cur_ip", this.f118492o.f118258P);
            C46145e.m144709a((Map) hashMap, "cur_host", this.f118492o.f118259Q);
            C46145e.m144708a((Map) hashMap, "reply_size", this.f118492o.f118260R);
            C46145e.m144708a((Map) hashMap, "down_pos", this.f118492o.f118261S);
            C46145e.m144708a((Map) hashMap, "player_wait_time", this.f118492o.f118262T);
            C46145e.m144707a((Map) hashMap, "player_wait_num", this.f118492o.f118263U);
            C46145e.m144707a((Map) hashMap, "mdl_stage", this.f118492o.f118264V);
            C46145e.m144707a((Map) hashMap, "mdl_ec", this.f118492o.f118265W);
            C46145e.m144707a((Map) hashMap, "cur_task_num", this.f118492o.f118266X);
            C46145e.m144707a((Map) hashMap, "mdl_speed", this.f118492o.f118267Y);
            C46145e.m144709a((Map) hashMap, "mdl_file_key", this.f118492o.f118268Z);
            C46145e.m144707a((Map) hashMap, "mdl_is_socrf", this.f118492o.f118270aa);
            C46145e.m144707a((Map) hashMap, "mdl_req_num", this.f118492o.f118271ab);
            C46145e.m144707a((Map) hashMap, "mdl_url_index", this.f118492o.f118272ac);
            C46145e.m144709a((Map) hashMap, "mdl_re_url", this.f118492o.f118273ad);
            C46145e.m144707a((Map) hashMap, "mdl_cur_source", this.f118492o.f118274ae);
            C46145e.m144709a((Map) hashMap, "mdl_extra_info", this.f118492o.f118275af);
            C46145e.m144709a((Map) hashMap, "nt", this.f118492o.f118253K);
        }
        C46145e.m144709a((Map) hashMap, "event_type", this.f118478a);
        C46145e.m144708a((Map) hashMap, "cost_time", this.f118479b);
        C46145e.m144709a((Map) hashMap, "end_type", this.f118480c);
        C46145e.m144707a((Map) hashMap, "index", this.f118491n);
        long j3 = -1;
        if (this.f118482e > 0) {
            j = this.f118481d - this.f118482e;
        } else {
            j = -1;
        }
        C46145e.m144708a((Map) hashMap, "first_frame_interval", j);
        if (this.f118483f > 0) {
            j2 = this.f118481d - this.f118483f;
        } else {
            j2 = -1;
        }
        C46145e.m144708a((Map) hashMap, "last_seek_interval", j2);
        if (this.f118494q.containsKey(this.f118478a)) {
            j3 = this.f118481d - ((Long) this.f118494q.get(this.f118478a)).longValue();
        }
        C46145e.m144708a((Map) hashMap, "last_event_interval", j3);
        C46145e.m144707a((Map) hashMap, "last_switch_interval", -1);
        C46145e.m144707a((Map) hashMap, "video_pos", this.f118484g);
        C46145e.m144707a((Map) hashMap, "retry_count", this.f118485h);
        C46145e.m144707a((Map) hashMap, "reuse_socket", this.f118492o.f118248F);
        C46145e.m144708a((Map) hashMap, "read_count_mdl", this.f118490m);
        C46145e.m144708a((Map) hashMap, "audio_len_before", this.f118487j);
        C46145e.m144708a((Map) hashMap, "video_len_before", this.f118486i);
        C46145e.m144708a((Map) hashMap, "audio_len_after", this.f118489l);
        C46145e.m144708a((Map) hashMap, "video_len_after", this.f118488k);
        StringBuilder sb = new StringBuilder("brian OneEvent: ");
        sb.append(hashMap.toString());
        C46123h.m144545a("VideoEventOneEvent", sb.toString());
        return new JSONObject(hashMap);
    }

    /* renamed from: a */
    public final void mo112459a(String str) {
        if (this.f118481d <= 0 || this.f118478a.isEmpty()) {
            C46123h.m144545a("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.f118478a;
        this.f118479b = currentTimeMillis - this.f118481d;
        this.f118480c = str;
        this.f118483f = this.f118493p.mo112464b();
        if (!(this.f118492o == null || this.f118492o.f118269a == null)) {
            Map b = this.f118492o.f118269a.mo112104b();
            if (b != null) {
                this.f118488k = ((Long) b.get("vlen")).longValue();
                this.f118489l = ((Long) b.get("alen")).longValue();
                this.f118490m = ((Long) b.get("vds")).longValue();
            }
        }
        m145009d();
        m145008c();
        this.f118494q.put(str2, Long.valueOf(currentTimeMillis));
    }

    C46155k(C46146f fVar, C46156l lVar) {
        this.f118492o = fVar;
        this.f118493p = lVar;
        this.f118494q = new HashMap();
    }

    /* renamed from: a */
    public final void mo112458a(int i, int i2) {
        this.f118481d = System.currentTimeMillis();
        this.f118484g = i;
        this.f118491n = i2;
        this.f118478a = "block_net";
        if (this.f118492o != null && this.f118492o.f118269a != null) {
            Map b = this.f118492o.f118269a.mo112104b();
            if (b != null) {
                this.f118486i = ((Long) b.get("vlen")).longValue();
                this.f118487j = ((Long) b.get("alen")).longValue();
                this.f118490m = ((Long) b.get("vds")).longValue();
            }
        }
    }
}
