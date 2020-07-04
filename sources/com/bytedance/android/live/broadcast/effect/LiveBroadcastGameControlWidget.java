package com.bytedance.android.live.broadcast.effect;

import android.arch.lifecycle.C0053p;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2655b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458j.C9496c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveBroadcastGameControlWidget extends LiveWidget implements C0053p<KVData>, C1944a, C2425a {

    /* renamed from: a */
    public C9355c f8267a;

    /* renamed from: b */
    public boolean f8268b;

    /* renamed from: c */
    private Room f8269c;

    /* renamed from: d */
    private C2578a f8270d;

    /* renamed from: e */
    private long f8271e;

    /* renamed from: f */
    private C2426b f8272f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBroadcastGameControlWidget$a */
    public interface C2578a {
        /* renamed from: b */
        void mo9192b();

        /* renamed from: c */
        void mo9193c();
    }

    /* renamed from: a */
    public final void mo8907a(String str, C9355c cVar) {
    }

    /* renamed from: b */
    public final void mo8908b(String str, C9355c cVar) {
    }

    public int getLayoutId() {
        return R.layout.awu;
    }

    public void onDestroy() {
        this.f8271e = 0;
        MessageCenter.removeListener(this);
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    /* renamed from: b */
    private void m10581b() {
        final C2655b a = C2515f.m10417f().mo9075b().mo9212a();
        if (a != null) {
            if (this.f8272f == null) {
                this.f8272f = new C2426b() {
                    /* renamed from: a */
                    public final void mo8910a() {
                        C3166a.m11966e("LiveBroadcastGameControlWidget", "onSyncStickersFailed() ");
                    }

                    /* renamed from: a */
                    public final void mo8911a(EffectChannelResponse effectChannelResponse) {
                        if (effectChannelResponse != null) {
                            List<Effect> list = effectChannelResponse.allCategoryEffects;
                            if (!C6311g.m19573a(list)) {
                                C9355c a = C2663f.m10852a((Effect) list.get(0));
                                a.f25582u = a.mo8906a(a);
                                if (!a.f25582u) {
                                    a.mo8905a("livemoneygame", a, (C2425a) LiveBroadcastGameControlWidget.this);
                                    return;
                                }
                                LiveBroadcastGameControlWidget.this.f8267a = a;
                                if (LiveBroadcastGameControlWidget.this.f8268b) {
                                    LiveBroadcastGameControlWidget.this.mo9191a();
                                }
                            }
                        }
                    }
                };
            }
            a.mo8904a("livemoneygame", (C2426b) C9496c.m28034a(this.f8272f));
        }
    }

    /* renamed from: c */
    private void m10582c() {
        this.f8271e = 0;
        if (this.f8267a != null) {
            C2515f.m10417f().mo9074a().mo8897b("livemoneygame");
            if (this.f8270d != null) {
                this.f8270d.mo9192b();
            }
            this.dataCenter.lambda$put$1$DataCenter("cmd_hide_other_toolbar", Boolean.valueOf(false));
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f8269c = (Room) this.dataCenter.get("data_room");
        m10581b();
        MessageCenter.addListener(this);
        this.dataCenter.observeForever("cmd_broadcast_game_click", this).observeForever("data_link_state", this);
    }

    /* renamed from: a */
    public final void mo9191a() {
        if (!this.isDestroyed) {
            if (this.f8267a != null) {
                if (this.f8270d != null) {
                    this.f8270d.mo9193c();
                }
                C2515f.m10417f().mo9074a().mo8892a("livemoneygame", this.f8267a);
                this.dataCenter.lambda$put$1$DataCenter("cmd_hide_other_toolbar", Boolean.valueOf(true));
                this.f8271e = System.currentTimeMillis();
                if (this.f8269c != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.f8269c.getOwnerUserId()));
                    hashMap.put("room_id", this.f8269c.getIdStr());
                    hashMap.put("action_type", "click");
                    C8443c.m25663a().mo21606a("livesdk_blinkgame_click", hashMap, new Object[0]);
                }
            } else {
                C3517a.m12960a(this.context, (int) R.string.elo);
            }
        }
    }

    /* renamed from: a */
    private boolean m10580a(C9355c cVar) {
        C2655b a = C2515f.m10417f().mo9075b().mo9212a();
        if (a == null || a.mo8906a(cVar)) {
            return true;
        }
        a.mo8905a("livemoneygame", cVar, (C2425a) this);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData.getKey() == "data_link_state") {
            if (((Integer) kVData.getData(Integer.valueOf(0))).intValue() == 2) {
                m10582c();
            }
        } else if (kVData.getKey() == "cmd_broadcast_game_click") {
            if (this.f8268b) {
                m10582c();
            } else if (m10580a(this.f8267a)) {
                mo9191a();
            }
            this.f8268b = !this.f8268b;
        }
    }

    /* renamed from: c */
    public final void mo8909c(String str, C9355c cVar) {
        if (str == "livemoneygame") {
            this.f8267a = cVar;
            if (this.f8268b) {
                mo9191a();
            }
        }
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 10101 && i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!(this.f8269c == null || this.f8271e == 0)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.f8269c.getOwnerUserId()));
                    hashMap.put("room_id", this.f8269c.getIdStr());
                    hashMap.put("action_type", "click");
                    hashMap.put("game_score", jSONObject.opt("score").toString());
                    hashMap.put("play_duration", String.valueOf(((float) (System.currentTimeMillis() - this.f8271e)) / 1000.0f));
                    C8443c.m25663a().mo21606a("livesdk_blinkgame_exit", hashMap, new Object[0]);
                    this.f8271e = System.currentTimeMillis();
                }
            } catch (JSONException unused) {
            }
        }
    }
}
