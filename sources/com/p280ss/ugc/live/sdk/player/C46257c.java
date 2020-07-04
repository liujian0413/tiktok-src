package com.p280ss.ugc.live.sdk.player;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6312h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ugc.live.sdk.player.ILivePlayer.StreamType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.player.c */
public abstract class C46257c {

    /* renamed from: a */
    public final C46256b f118885a;

    /* renamed from: b */
    protected long f118886b;

    /* renamed from: c */
    public long f118887c;

    /* renamed from: d */
    public String f118888d;

    /* renamed from: e */
    public String f118889e;

    /* renamed from: f */
    private final Handler f118890f = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1024) {
                try {
                    C46257c.this.mo114262a(new JSONObject().put("body_type", "onPlay").put("video_buff_length", C46257c.this.mo114249k()).put("audio_buff_length", C46257c.this.mo114250l()).put("stream_delay", new JSONObject().put("delay", C46257c.this.f118887c).put("vendor", C46257c.this.f118889e).put("push_dev", C46257c.this.f118888d)));
                    C46257c.this.mo114270i();
                } catch (JSONException unused) {
                }
            }
        }
    };

    /* renamed from: g */
    private final boolean f118891g;

    /* renamed from: h */
    private C46259a f118892h = C46259a.IDLE;

    /* renamed from: i */
    private int f118893i;

    /* renamed from: j */
    private long f118894j;

    /* renamed from: k */
    private long f118895k;

    /* renamed from: l */
    private String f118896l;

    /* renamed from: m */
    private String f118897m;

    /* renamed from: n */
    private StreamType f118898n = StreamType.VIDEO;

    /* renamed from: o */
    private int f118899o = 0;

    /* renamed from: com.ss.ugc.live.sdk.player.c$a */
    enum C46259a {
        IDLE,
        PREPARING,
        PREPARED
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo114247b(JSONObject jSONObject) throws JSONException;

    /* renamed from: c */
    public final void mo114264c() {
        mo114270i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract long mo114248j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract long mo114249k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract long mo114250l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo114251m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo114252n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo114253o();

    /* renamed from: p */
    private void m145256p() {
        this.f118890f.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: a */
    public final void mo114258a() {
        this.f118892h = C46259a.IDLE;
        m145257q();
    }

    /* renamed from: g */
    public final void mo114268g() {
        this.f118893i++;
        this.f118894j = System.currentTimeMillis();
    }

    /* renamed from: q */
    private void m145257q() {
        this.f118893i = 0;
        this.f118894j = 0;
        this.f118895k = 0;
        this.f118886b = 0;
        this.f118887c = 0;
        this.f118888d = null;
        this.f118889e = null;
    }

    /* renamed from: i */
    public final void mo114270i() {
        if (!this.f118890f.hasMessages(PreloadTask.BYTE_UNIT_NUMBER)) {
            this.f118890f.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: b */
    public final void mo114263b() {
        if (this.f118892h == C46259a.IDLE) {
            this.f118892h = C46259a.PREPARING;
            this.f118893i = 0;
            this.f118894j = 0;
            this.f118895k = 0;
            this.f118886b = System.currentTimeMillis();
            this.f118887c = 0;
            this.f118888d = null;
            this.f118889e = null;
        }
    }

    /* renamed from: h */
    public final void mo114269h() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f118894j;
            this.f118895k += currentTimeMillis;
            this.f118894j = System.currentTimeMillis();
            mo114262a(new JSONObject().put("body_type", "onBlock").put("block_index", this.f118893i).put("buffer_time", currentTimeMillis));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: d */
    public final void mo114265d() {
        m145256p();
        long j = mo114248j();
        long currentTimeMillis = System.currentTimeMillis() - this.f118886b;
        try {
            mo114262a(new JSONObject().put("body_type", "onPause").put("block_cnt", this.f118893i).put("block_time", this.f118895k).put("down_size", j / 1024).put("play_len", currentTimeMillis).put("play_speed", j / currentTimeMillis));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public final void mo114266e() {
        m145256p();
        long j = mo114248j();
        long currentTimeMillis = System.currentTimeMillis() - this.f118886b;
        try {
            mo114262a(new JSONObject().put("body_type", "onPlayEnd").put("block_cnt", this.f118893i).put("block_time", this.f118895k).put("down_size", j / 1024).put("play_len", currentTimeMillis).put("play_speed", j / currentTimeMillis));
        } catch (JSONException unused) {
        }
        this.f118892h = C46259a.IDLE;
        m145257q();
    }

    /* renamed from: f */
    public final void mo114267f() {
        if (this.f118892h != C46259a.PREPARED) {
            this.f118892h = C46259a.PREPARED;
            try {
                JSONObject put = new JSONObject().put("body_type", "onPrepared").put("first_screen", System.currentTimeMillis() - this.f118886b).put("play_stat", "ok").put("fail_code", 0).put("retry_times", this.f118899o);
                this.f118899o = 0;
                mo114247b(put);
                mo114262a(put);
                m145256p();
                mo114270i();
            } catch (JSONException unused) {
            }
        }
    }

    public C46257c(C46256b bVar) {
        this.f118885a = bVar;
        this.f118891g = C6312h.m19578b();
    }

    /* renamed from: a */
    public final void mo114259a(int i) {
        JSONObject jSONObject;
        m145256p();
        try {
            if (this.f118892h != C46259a.PREPARED) {
                this.f118892h = C46259a.PREPARED;
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("first_screen", 0).put("play_stat", "fail").put("fail_code", i).put("error_msg", mo114253o());
                mo114247b(jSONObject);
            } else {
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("fail_code", i).put("error_msg", mo114253o());
            }
            int i2 = this.f118899o + 1;
            this.f118899o = i2;
            jSONObject.put("fail_count", i2);
            mo114262a(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo114260a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ts")) {
                    long currentTimeMillis = System.currentTimeMillis() - jSONObject.getLong("ts");
                    if (currentTimeMillis > 0) {
                        this.f118887c = currentTimeMillis;
                    }
                    if (jSONObject.has("source")) {
                        if (TextUtils.equals(jSONObject.getString("source"), "zego")) {
                            this.f118888d = "";
                            this.f118889e = "zego";
                        } else {
                            this.f118888d = jSONObject.getString("source");
                            this.f118889e = "livesdk";
                        }
                        return;
                    }
                    this.f118889e = "agora";
                    this.f118888d = "";
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo114262a(JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(this.f118897m)) {
            String m = mo114251m();
            Uri parse = Uri.parse(this.f118897m);
            String queryParameter = parse.getQueryParameter("anchor_version");
            String queryParameter2 = parse.getQueryParameter("anchor_device_platform");
            String queryParameter3 = parse.getQueryParameter("room_id");
            jSONObject.put("anchor_version", queryParameter).put("anchor_device_platform", queryParameter2).put("room_id", queryParameter3).put("serverIp", m).put("stream_type", this.f118898n.ordinal()).put("tt_url", this.f118897m).put("anchor_rtmp_service", this.f118889e).put("anchor_uid", parse.getQueryParameter("anchor_id")).put("player_type", mo114252n());
        }
    }

    /* renamed from: a */
    public final void mo114261a(String str, String str2, StreamType streamType) {
        if (!TextUtils.equals(this.f118896l, str)) {
            this.f118899o = 0;
        }
        this.f118896l = str;
        this.f118897m = str2;
        this.f118898n = streamType;
    }
}
