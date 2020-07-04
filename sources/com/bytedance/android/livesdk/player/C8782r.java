package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.C8752a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.PlayerEvent;
import com.bytedance.android.livesdk.player.p416b.C8761a;
import com.google.gson.C6600e;
import com.p280ss.videoarch.liveplayer.C46280a;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.r */
public final class C8782r implements C46280a {

    /* renamed from: a */
    public C8752a f23852a;

    /* renamed from: b */
    private C8761a f23853b;

    /* renamed from: b */
    public final void mo21838b() {
        m26302a(PlayerEvent.BUFFERING_END, 0, "player end buffer");
    }

    /* renamed from: c */
    public final void mo21839c() {
        m26302a(PlayerEvent.PLAY_COMPLETED, 0, "play complete");
    }

    /* renamed from: d */
    public final void mo21840d() {
        m26302a(PlayerEvent.PREPARED, 0, "player is prepared");
    }

    /* renamed from: a */
    public final void mo21832a() {
        m26302a(PlayerEvent.BUFFERING_START, 0, "player start buffer");
    }

    public C8782r(C8761a aVar) {
        this.f23853b = aVar;
    }

    /* renamed from: a */
    public final void mo21835a(String str) {
        m26302a(PlayerEvent.SEI_UPDATE, 0, str);
    }

    /* renamed from: a */
    public final void mo21834a(LiveError liveError) {
        HashMap hashMap;
        PlayerEvent playerEvent;
        if (liveError != null) {
            C6600e b = C2317a.m9933b();
            if (liveError.info == null) {
                hashMap = new HashMap(2);
            } else {
                hashMap = new HashMap(liveError.info);
            }
            hashMap.put("error_code", String.valueOf(liveError.code));
            if (liveError.code != 0) {
                playerEvent = PlayerEvent.PREPARE_FAILED;
            } else {
                playerEvent = PlayerEvent.MEDIA_ERROR;
            }
            hashMap.put("error_description", playerEvent.name());
            String b2 = b.mo15979b((Object) hashMap);
            if (liveError.code != 0) {
                PlayerEvent playerEvent2 = PlayerEvent.PREPARE_FAILED;
                int i = liveError.code;
                StringBuilder sb = new StringBuilder("prepare failed.code:");
                sb.append(liveError.code);
                m26302a(playerEvent2, i, sb.toString());
            }
            m26302a(PlayerEvent.MEDIA_ERROR, liveError.code, b2);
        }
    }

    /* renamed from: a */
    public final void mo21836a(JSONObject jSONObject) {
        if (this.f23853b != null) {
            this.f23853b.mo21803a(jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo21837a(boolean z) {
        m26302a(PlayerEvent.RENDERING_START, 0, "player start render");
    }

    /* renamed from: a */
    public final void mo21833a(int i, int i2) {
        PlayerEvent playerEvent = PlayerEvent.VIDEO_SIZE_CHANGED;
        int i3 = (i2 << 16) | i;
        StringBuilder sb = new StringBuilder("videoSizeChanged, width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        m26302a(playerEvent, i3, sb.toString());
    }

    /* renamed from: a */
    private void m26302a(PlayerEvent playerEvent, int i, String str) {
        if (this.f23852a != null) {
            this.f23852a.mo21779a(playerEvent, i, str);
        }
    }
}
