package com.p280ss.ugc.live.sdk.player.p1832a;

import com.p280ss.ttm.player.TTMediaPlayer;
import com.p280ss.ugc.live.sdk.player.C46256b;
import com.p280ss.ugc.live.sdk.player.C46257c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.player.a.a */
final class C46252a extends C46257c {

    /* renamed from: f */
    private final TTMediaPlayer f118872f;

    /* renamed from: n */
    public final String mo114252n() {
        return "tt";
    }

    /* renamed from: j */
    public final long mo114248j() {
        return this.f118872f.getLongOption(46, 0);
    }

    /* renamed from: k */
    public final long mo114249k() {
        return this.f118872f.getLongOption(72, 0);
    }

    /* renamed from: l */
    public final long mo114250l() {
        return this.f118872f.getLongOption(73, 0);
    }

    /* renamed from: m */
    public final String mo114251m() {
        return this.f118872f.getStringOption(71);
    }

    /* renamed from: o */
    public final String mo114253o() {
        return this.f118872f.getStringOption(5002);
    }

    /* renamed from: b */
    private long m145229b(int i) {
        if (this.f118886b <= 0) {
            return 0;
        }
        long longOption = this.f118872f.getLongOption(i, -1);
        if (longOption <= 0) {
            return 0;
        }
        return Math.max(0, longOption - this.f118886b);
    }

    /* renamed from: b */
    public final void mo114247b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("dns_time", m145229b(68)).put("tcp_connect_time", m145229b(69)).put("tcp_first_packet_time", m145229b(70)).put("first_video_frame_received", m145229b(75)).put("first_audio_frame_received", m145229b(76)).put("first_video_frame_decoded", m145229b(77)).put("first_audio_frame_decoded", m145229b(78));
    }

    C46252a(C46256b bVar, TTMediaPlayer tTMediaPlayer) {
        super(bVar);
        this.f118872f = tTMediaPlayer;
    }
}
