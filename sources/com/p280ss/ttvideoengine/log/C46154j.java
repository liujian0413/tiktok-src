package com.p280ss.ttvideoengine.log;

import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.j */
public final class C46154j {

    /* renamed from: a */
    public int f118468a;

    /* renamed from: b */
    public boolean f118469b;

    /* renamed from: c */
    public int f118470c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f118471d = Integer.MIN_VALUE;

    /* renamed from: e */
    public String f118472e = "";

    /* renamed from: f */
    public String f118473f = "";

    /* renamed from: g */
    public String f118474g = "";

    /* renamed from: h */
    public int f118475h = Integer.MIN_VALUE;

    /* renamed from: i */
    public String f118476i = "";

    /* renamed from: j */
    private C46146f f118477j;

    /* renamed from: a */
    public final void mo112453a() {
        this.f118469b = true;
    }

    /* renamed from: b */
    private void m145002b() {
        if (this.f118469b) {
            this.f118472e = "playing";
        } else {
            this.f118472e = "beforePlay";
        }
        VideoEventManager.instance.addEventV2(m145003c(), "videoplayer_oneerror");
    }

    /* renamed from: c */
    private JSONObject m145003c() {
        HashMap hashMap = new HashMap();
        if (this.f118477j != null) {
            C46145e.m144709a((Map) hashMap, "player_sessionid", this.f118477j.f118282g);
            if (this.f118477j.f118286k == null || this.f118477j.f118286k.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118477j.f118283h);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_url", this.f118477j.f118286k);
            }
            if (this.f118477j.f118288m == null || this.f118477j.f118288m.isEmpty()) {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118477j.f118285j);
            } else {
                C46145e.m144709a((Map) hashMap, "cdn_ip", this.f118477j.f118288m);
            }
            C46145e.m144709a((Map) hashMap, "resolution", this.f118477j.f118244B);
            C46145e.m144709a((Map) hashMap, "source_type", this.f118477j.f118293r);
            C46145e.m144709a((Map) hashMap, "v", this.f118477j.f118292q);
            C46145e.m144709a((Map) hashMap, "pv", this.f118477j.f118278c);
            C46145e.m144709a((Map) hashMap, "pc", this.f118477j.f118279d);
            C46145e.m144709a((Map) hashMap, "sv", this.f118477j.f118280e);
            C46145e.m144709a((Map) hashMap, "tag", this.f118477j.f118246D);
            C46145e.m144709a((Map) hashMap, "subtag", this.f118477j.f118247E);
            C46145e.m144709a((Map) hashMap, "sdk_version", this.f118477j.f118281f);
            C46145e.m144707a((Map) hashMap, "video_hw", this.f118477j.f118294s);
            C46145e.m144709a((Map) hashMap, "vtype", this.f118477j.f118300y);
            C46145e.m144707a((Map) hashMap, "p2p_cdn_type", this.f118477j.f118245C);
            C46145e.m144709a((Map) hashMap, "codec", this.f118477j.f118297v);
            C46145e.m144707a((Map) hashMap, "video_codec_nameid", this.f118477j.f118299x);
            C46145e.m144707a((Map) hashMap, "audio_codec_nameid", this.f118477j.f118298w);
            C46145e.m144707a((Map) hashMap, "drm_type", this.f118477j.f118249G);
            C46145e.m144709a((Map) hashMap, "drm_token_url", this.f118477j.f118250H);
            C46145e.m144708a((Map) hashMap, "cur_req_pos", this.f118477j.f118255M);
            C46145e.m144708a((Map) hashMap, "cur_end_pos", this.f118477j.f118256N);
            C46145e.m144708a((Map) hashMap, "cur_cache_pos", this.f118477j.f118257O);
            C46145e.m144709a((Map) hashMap, "cur_ip", this.f118477j.f118258P);
            C46145e.m144709a((Map) hashMap, "cur_host", this.f118477j.f118259Q);
            C46145e.m144708a((Map) hashMap, "reply_size", this.f118477j.f118260R);
            C46145e.m144708a((Map) hashMap, "down_pos", this.f118477j.f118261S);
            C46145e.m144708a((Map) hashMap, "player_wait_time", this.f118477j.f118262T);
            C46145e.m144707a((Map) hashMap, "player_wait_num", this.f118477j.f118263U);
            C46145e.m144707a((Map) hashMap, "mdl_stage", this.f118477j.f118264V);
            C46145e.m144707a((Map) hashMap, "mdl_ec", this.f118477j.f118265W);
            C46145e.m144707a((Map) hashMap, "mdl_speed", this.f118477j.f118267Y);
            C46145e.m144709a((Map) hashMap, "mdl_file_key", this.f118477j.f118268Z);
            C46145e.m144707a((Map) hashMap, "mdl_is_socrf", this.f118477j.f118270aa);
            C46145e.m144707a((Map) hashMap, "mdl_req_num", this.f118477j.f118271ab);
            C46145e.m144707a((Map) hashMap, "mdl_url_index", this.f118477j.f118272ac);
            C46145e.m144709a((Map) hashMap, "mdl_re_url", this.f118477j.f118273ad);
            C46145e.m144709a((Map) hashMap, "nt", this.f118477j.f118253K);
        }
        C46145e.m144707a((Map) hashMap, "errt", this.f118471d);
        C46145e.m144707a((Map) hashMap, "errc", this.f118470c);
        C46145e.m144709a((Map) hashMap, "es", this.f118472e);
        C46145e.m144707a((Map) hashMap, "vsc", this.f118475h);
        C46145e.m144709a((Map) hashMap, "vsc_message", this.f118476i);
        C46145e.m144707a((Map) hashMap, "retry_count", this.f118468a);
        StringBuilder sb = new StringBuilder("brian OneError: ");
        sb.append(hashMap.toString());
        C46123h.m144545a("VideoEventOneError", sb.toString());
        return new JSONObject(hashMap);
    }

    /* renamed from: a */
    public final void mo112455a(C46117c cVar) {
        this.f118470c = cVar.f118004a;
        this.f118471d = cVar.mo112288b();
        m145002b();
    }

    C46154j(C46146f fVar) {
        this.f118477j = fVar;
    }

    /* renamed from: a */
    public final void mo112454a(int i, String str) {
        this.f118475h = i;
        this.f118476i = str;
        m145002b();
    }

    /* renamed from: a */
    public final void mo112456a(C46117c cVar, int i, int i2) {
        this.f118468a++;
    }
}
