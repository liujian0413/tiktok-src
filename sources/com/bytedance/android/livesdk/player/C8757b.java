package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.livepullstream.p165a.C3442b.C3445b;
import com.bytedance.android.live.livepullstream.p165a.C3442b.C3445b.C3446a;
import com.bytedance.android.live.livepullstream.p165a.C3448d;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.detail.C4317a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.C8752a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.PlayerEvent;
import com.bytedance.android.livesdk.player.ITTLivePlayer.StreamType;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9317a;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9318b;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9319c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.common.utility.C6319n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.b */
public class C8757b implements C3491h, C8752a, C9302a {

    /* renamed from: a */
    public static final String f23766a = "b";

    /* renamed from: e */
    private static final C9319c f23767e = C9319c.m27713a().mo22794a();

    /* renamed from: A */
    private final SurfaceTextureListener f23768A = new SurfaceTextureListener() {
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C8757b.this.f23771b != null) {
                C8757b.this.f23771b.mo21760a((SurfaceHolder) null);
            }
            return true;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (C8757b.this.f23772c != null) {
                if (C8757b.this.f23773d != null) {
                    C8757b.this.f23773d.release();
                }
                C8757b.this.f23773d = new Surface(surfaceTexture);
                C8757b.this.mo21792e(true);
            }
        }
    };

    /* renamed from: B */
    private long f23769B;

    /* renamed from: C */
    private String f23770C = "";

    /* renamed from: b */
    public ITTLivePlayer f23771b;

    /* renamed from: c */
    public TextureView f23772c;

    /* renamed from: d */
    public Surface f23773d;

    /* renamed from: f */
    private int f23774f;

    /* renamed from: g */
    private String f23775g = "";

    /* renamed from: h */
    private String f23776h = "";

    /* renamed from: i */
    private String f23777i = "";

    /* renamed from: j */
    private String f23778j;

    /* renamed from: k */
    private C9319c f23779k = f23767e;

    /* renamed from: l */
    private boolean f23780l;

    /* renamed from: m */
    private C9301a f23781m;

    /* renamed from: n */
    private C9318b f23782n;

    /* renamed from: o */
    private volatile int f23783o;

    /* renamed from: p */
    private int f23784p;

    /* renamed from: q */
    private LiveMode f23785q;

    /* renamed from: r */
    private C8764e f23786r;

    /* renamed from: s */
    private final Context f23787s;

    /* renamed from: t */
    private final IHostPlugin f23788t;

    /* renamed from: u */
    private final C8753a f23789u;

    /* renamed from: v */
    private String f23790v = "";

    /* renamed from: w */
    private boolean f23791w = true;

    /* renamed from: x */
    private boolean f23792x;

    /* renamed from: y */
    private boolean f23793y;

    /* renamed from: z */
    private boolean f23794z = true;

    /* renamed from: com.bytedance.android.livesdk.player.b$a */
    public static final class C8760a implements C3445b<C3491h> {
        /* renamed from: a */
        public final C3446a<C3491h> mo10425a(C3446a<C3491h> aVar) {
            return aVar.mo10427a(new C8757b(((IHostContext) C3596c.m13172a(IHostContext.class)).context(), (IHostPlugin) C3596c.m13172a(IHostPlugin.class), new C8763d())).mo10426a();
        }
    }

    /* renamed from: f */
    public final int mo21793f() {
        return this.f23783o;
    }

    /* renamed from: i */
    public final String mo21797i() {
        return this.f23775g;
    }

    /* renamed from: j */
    public final String mo21798j() {
        return this.f23776h;
    }

    /* renamed from: a */
    public final void mo21784a(String str, String str2, TextureView textureView, int i, C9319c cVar, C9318b bVar) throws Exception {
        if (str == null) {
            m26161k();
            if (this.f23771b != null) {
                this.f23771b.mo21757a();
            }
            return;
        }
        this.f23770C = "";
        this.f23775g = "";
        this.f23776h = "";
        this.f23785q = LiveMode.valueOf(i);
        if (textureView != null) {
            mo10502a(textureView);
        }
        this.f23782n = bVar;
        this.f23780l = true;
        boolean z = !C6319n.m19594a(this.f23776h, str);
        this.f23776h = str;
        this.f23777i = str2;
        if (cVar == null) {
            cVar = f23767e;
        }
        this.f23779k = cVar;
        if (this.f23771b == null) {
            m26162l();
        } else if (this.f23771b.mo21776h()) {
            m26162l();
        }
        if (this.f23793y) {
            this.f23771b.mo21758a(1);
        } else {
            this.f23771b.mo21758a(0);
        }
        this.f23771b.mo21761a((C8752a) this);
        m26169s();
        if (z || !m26167q()) {
            if (z) {
                this.f23784p = 0;
            }
            m26164n();
        } else if (m26166p()) {
            this.f23771b.mo21759a(this.f23773d);
            this.f23771b.mo21770c();
            if (m26168r()) {
                ((C3495l) C3596c.m13172a(C3495l.class)).cacheEndTime(this, System.currentTimeMillis());
                this.f23781m.obtainMessage(PlayerMessage.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final void mo21785a(boolean z, Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v) && this.f23771b != null) {
            this.f23771b.mo21765a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo10505a() {
        if (this.f23771b == null) {
            return false;
        }
        Point i = this.f23771b.mo21777i();
        if (i.x > i.y) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10503a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("player_type")) {
            if (this.f23771b instanceof C8776n) {
                try {
                    jSONObject.put("new_sdk", true);
                } catch (JSONException e) {
                    C3166a.m11963b(f23766a, (Throwable) e);
                }
            } else {
                try {
                    jSONObject.put("new_sdk", false);
                } catch (JSONException e2) {
                    C3166a.m11963b(f23766a, (Throwable) e2);
                }
            }
        }
        m26158d(jSONObject);
        this.f23786r.mo21806a(jSONObject);
    }

    /* renamed from: b */
    public final void mo10506b() {
        this.f23786r.mo21804a();
    }

    /* renamed from: c */
    public final void mo10509c() {
        this.f23786r.mo21807b();
    }

    /* renamed from: d */
    public final JSONObject mo10511d() {
        return this.f23771b.mo21778j();
    }

    /* renamed from: h */
    public final boolean mo21796h() {
        return m26168r();
    }

    /* renamed from: p */
    private boolean m26166p() {
        if ((this.f23774f & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m26167q() {
        if ((this.f23774f & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m26168r() {
        if ((this.f23774f & 4) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo21795g() {
        if (this.f23771b == null || !this.f23771b.mo21775g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo21790e() {
        if (this.f23771b != null) {
            this.f23771b.mo21761a((C8752a) null);
            this.f23771b.mo21773e();
            this.f23771b = null;
        }
        m26161k();
    }

    /* renamed from: k */
    private void m26161k() {
        this.f23782n = null;
        this.f23780l = false;
        this.f23775g = "";
        this.f23776h = "";
        this.f23779k = f23767e;
        if (this.f23772c != null) {
            this.f23772c.setSurfaceTextureListener(null);
            this.f23772c = null;
        }
        if (this.f23773d != null) {
            this.f23773d.release();
            this.f23773d = null;
        }
        this.f23783o = 0;
        this.f23784p = 0;
        m26160g(false);
        m26159f(false);
        mo21792e(false);
    }

    /* renamed from: l */
    private void m26162l() throws Exception {
        if (this.f23771b != null) {
            this.f23771b.mo21774f();
            this.f23771b.mo21761a((C8752a) null);
            m26159f(false);
            m26160g(false);
        }
        this.f23771b = this.f23789u.mo21780a(this.f23787s, new C8762c(this));
        this.f23771b.mo21761a((C8752a) this);
        this.f23771b.mo21771c(this.f23793y);
        m26169s();
    }

    /* renamed from: o */
    private void m26165o() {
        if (this.f23771b != null) {
            if (!this.f23791w) {
                this.f23771b.mo21758a(0);
            } else if (this.f23792x) {
                this.f23771b.mo21758a(3);
            } else {
                this.f23771b.mo21758a(2);
            }
        }
    }

    /* renamed from: s */
    private void m26169s() {
        if (this.f23785q == LiveMode.SCREEN_RECORD || this.f23785q == LiveMode.THIRD_PARTY || this.f23785q == LiveMode.OFFICIAL_ACTIVITY) {
            this.f23771b.mo21768b("musically_game_live");
        } else {
            this.f23771b.mo21768b("musically_live");
        }
    }

    /* renamed from: m */
    private void m26163m() {
        if (m26166p() && this.f23771b != null) {
            this.f23771b.mo21759a(this.f23773d);
            if (m26167q() && this.f23780l && !this.f23771b.mo21775g()) {
                this.f23771b.mo21770c();
            }
        }
        if (this.f23774f == 7 && this.f23780l) {
            ((C3495l) C3596c.m13172a(C3495l.class)).cacheEndTime(this, System.currentTimeMillis());
            this.f23781m.obtainMessage(PlayerMessage.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    /* renamed from: n */
    private void m26164n() throws Exception {
        StreamType streamType;
        if (this.f23771b != null) {
            if (this.f23771b.mo21776h()) {
                m26162l();
            }
            m26169s();
            this.f23783o = 0;
            m26159f(false);
            m26160g(false);
            if (!C6319n.m19593a(this.f23776h)) {
                this.f23771b.mo21763a(this.f23776h, this.f23777i);
            } else {
                switch (this.f23785q) {
                    case AUDIO:
                        streamType = StreamType.AUDIO;
                        break;
                    case THIRD_PARTY:
                        streamType = StreamType.OBS;
                        break;
                    case SCREEN_RECORD:
                        streamType = StreamType.SCREENSHOT;
                        break;
                    default:
                        streamType = StreamType.VIDEO;
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_params", this.f23778j);
                this.f23771b.mo21764a(this.f23775g, (Map<String, String>) hashMap, streamType);
                this.f23771b.mo21766a(this.f23779k.f25509a, this.f23779k.f25510b, this.f23779k.f25511c);
            }
            this.f23769B = SystemClock.currentThreadTimeMillis();
            this.f23771b.mo21769b(this.f23794z);
            this.f23771b.mo21767b();
        }
    }

    /* renamed from: c */
    public final void mo10510c(boolean z) {
        this.f23794z = z;
    }

    /* renamed from: a */
    public final void mo10504a(boolean z) {
        this.f23792x = z;
        m26165o();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21786b(JSONObject jSONObject) {
        m26158d(jSONObject);
        this.f23786r.mo21808b(jSONObject);
    }

    /* renamed from: a */
    public final void mo21782a(String str) {
        if (this.f23771b != null) {
            this.f23771b.mo21762a(str);
        }
    }

    /* renamed from: b */
    public final void mo10508b(boolean z) {
        this.f23791w = z;
        m26165o();
    }

    /* renamed from: d */
    public final void mo21789d(boolean z) {
        this.f23793y = z;
        if (this.f23771b != null) {
            this.f23771b.mo21771c(z);
        }
    }

    /* renamed from: g */
    private void m26160g(boolean z) {
        if (z) {
            this.f23774f |= 4;
        } else {
            this.f23774f &= -5;
        }
        m26163m();
    }

    /* renamed from: a */
    public final void mo10501a(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            this.f23780l = false;
            if (this.f23771b != null) {
                this.f23771b.mo21772d();
            }
            this.f23782n = null;
        }
    }

    /* renamed from: b */
    public final void mo10507b(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            if (this.f23782n != null) {
                this.f23782n.mo11991a(PlayerMessage.STOP_WHEN_JOIN_INTERACT, null);
            }
            mo21791e(context);
        }
    }

    /* renamed from: c */
    public final void mo21787c(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            new C4317a(this).mo11995b(context);
            mo21788d(context);
            mo21791e(context);
        }
    }

    /* renamed from: d */
    public final void mo21788d(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            this.f23780l = false;
            if (this.f23771b != null) {
                this.f23771b.mo21772d();
            }
        }
    }

    /* renamed from: f */
    public final void mo21794f(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            if (this.f23782n != null) {
                this.f23782n.mo11991a(PlayerMessage.STOP_WHEN_PLAYING_OTHER, null);
            }
            mo21791e(context);
        }
    }

    /* renamed from: d */
    private void m26158d(JSONObject jSONObject) {
        String optString = jSONObject.optString("cdn_play_url");
        if (jSONObject != null && !TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "none")) {
            if (TextUtils.isEmpty(this.f23770C)) {
                this.f23770C = optString;
                return;
            }
            if (!TextUtils.equals(this.f23770C, optString)) {
                C8774l.m26226a(jSONObject, this.f23770C, this.f23775g, this.f23776h, this.f23777i, this.f23778j);
            }
        }
    }

    /* renamed from: f */
    private void m26159f(boolean z) {
        if (z) {
            this.f23774f |= 1;
            if (this.f23785q == LiveMode.AUDIO) {
                this.f23774f |= 2;
                this.f23774f |= 4;
            }
        } else {
            this.f23774f &= -2;
        }
        m26163m();
    }

    /* renamed from: e */
    public final void mo21791e(Context context) {
        if (TextUtils.equals(C9317a.m27711a(context), this.f23790v)) {
            if (this.f23771b != null) {
                this.f23771b.mo21761a((C8752a) null);
                this.f23771b.mo21773e();
                this.f23771b = null;
            }
            m26161k();
        }
    }

    /* renamed from: b */
    private boolean m26156b(String str) {
        try {
            Uri parse = Uri.parse(this.f23775g);
            Uri parse2 = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getHost());
            sb.append(parse.getPath());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(parse2.getHost());
            sb3.append(parse2.getPath());
            if (!C6319n.m19594a(sb2, sb3.toString())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 9) {
            try {
                m26164n();
            } catch (Exception unused) {
            }
        } else {
            PlayerMessage valueOf = PlayerMessage.valueOf(message.what);
            if (!(valueOf == PlayerMessage.UNKNOWN || this.f23782n == null)) {
                this.f23782n.mo11991a(valueOf, message.obj);
            }
        }
    }

    /* renamed from: e */
    public final void mo21792e(boolean z) {
        if (z) {
            this.f23774f |= 2;
        } else {
            this.f23774f &= -3;
        }
        m26163m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26154a(com.bytedance.android.livesdk.player.ITTLivePlayer.PlayerEvent r8) {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x008f }
            r0.<init>()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r1 = "event_page"
            java.lang.String r2 = "live_detail"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r1 = "time"
            long r2 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ Throwable -> 0x008f }
            long r4 = r7.f23769B     // Catch:{ Throwable -> 0x008f }
            r6 = 0
            long r2 = r2 - r4
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x008f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r1 = "url"
            java.lang.String r2 = r7.f23775g     // Catch:{ Throwable -> 0x008f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r1 = "pull_stream_data"
            java.lang.String r2 = r7.f23776h     // Catch:{ Throwable -> 0x008f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r1 = "default_resolution"
            java.lang.String r2 = r7.f23777i     // Catch:{ Throwable -> 0x008f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x008f }
            int[] r1 = com.bytedance.android.livesdk.player.C8757b.C87592.f23797b     // Catch:{ Throwable -> 0x008f }
            int r8 = r8.ordinal()     // Catch:{ Throwable -> 0x008f }
            r8 = r1[r8]     // Catch:{ Throwable -> 0x008f }
            r1 = 0
            r2 = 1
            switch(r8) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0060;
                case 7: goto L_0x0050;
                case 8: goto L_0x0040;
                default: goto L_0x003f;
            }     // Catch:{ Throwable -> 0x008f }
        L_0x003f:
            goto L_0x008e
        L_0x0040:
            com.bytedance.android.livesdk.log.c r8 = com.bytedance.android.livesdk.log.C8443c.m25663a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = "live_block_end"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x008f }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r1] = r4     // Catch:{ Throwable -> 0x008f }
            r8.mo21606a(r3, r0, r2)     // Catch:{ Throwable -> 0x008f }
            goto L_0x008e
        L_0x0050:
            com.bytedance.android.livesdk.log.c r8 = com.bytedance.android.livesdk.log.C8443c.m25663a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = "live_block_start"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x008f }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r1] = r4     // Catch:{ Throwable -> 0x008f }
            r8.mo21606a(r3, r0, r2)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0095
        L_0x0060:
            java.lang.String r8 = "is_success"
            java.lang.String r3 = "0"
            r0.put(r8, r3)     // Catch:{ Throwable -> 0x008f }
            com.bytedance.android.livesdk.log.c r8 = com.bytedance.android.livesdk.log.C8443c.m25663a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = "live_first_play"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x008f }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r1] = r4     // Catch:{ Throwable -> 0x008f }
            r8.mo21606a(r3, r0, r2)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0095
        L_0x0077:
            java.lang.String r8 = "is_success"
            java.lang.String r3 = "1"
            r0.put(r8, r3)     // Catch:{ Throwable -> 0x008f }
            com.bytedance.android.livesdk.log.c r8 = com.bytedance.android.livesdk.log.C8443c.m25663a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = "live_first_play"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x008f }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r1] = r4     // Catch:{ Throwable -> 0x008f }
            r8.mo21606a(r3, r0, r2)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0095
        L_0x008e:
            return
        L_0x008f:
            r8 = move-exception
            java.lang.String r0 = "LivePlayController"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r0, r8)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.C8757b.m26154a(com.bytedance.android.livesdk.player.ITTLivePlayer$PlayerEvent):void");
    }

    /* renamed from: a */
    public final void mo10502a(TextureView textureView) {
        if (textureView == null) {
            if (this.f23771b != null) {
                this.f23771b.mo21772d();
            }
            if (this.f23772c != null) {
                this.f23772c.setSurfaceTextureListener(null);
                this.f23772c = null;
            }
            if (this.f23773d != null) {
                this.f23773d.release();
                this.f23773d = null;
            }
            if (m26166p()) {
                mo21792e(false);
            }
        } else if (this.f23772c != textureView) {
            if (this.f23772c != null) {
                this.f23772c.setSurfaceTextureListener(null);
                this.f23772c = null;
            }
            if (this.f23773d != null) {
                this.f23773d.release();
                this.f23773d = null;
            }
            this.f23772c = textureView;
            this.f23790v = C9317a.m27711a(this.f23772c.getContext());
            this.f23772c.setSurfaceTextureListener(this.f23768A);
            if (this.f23772c.getSurfaceTexture() != null) {
                this.f23773d = new Surface(this.f23772c.getSurfaceTexture());
                mo21792e(true);
                return;
            }
            mo21792e(false);
        }
    }

    /* renamed from: a */
    private void m26155a(PlayerMessage playerMessage, Object obj) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.f23781m.obtainMessage(playerMessage.ordinal(), obj).sendToTarget();
        } else if (this.f23782n != null) {
            this.f23782n.mo11991a(playerMessage, obj);
        }
    }

    public C8757b(Context context, IHostPlugin iHostPlugin, C8753a aVar) {
        this.f23787s = context;
        this.f23788t = iHostPlugin;
        this.f23789u = aVar;
        this.f23781m = new C9301a(this);
        this.f23786r = C3448d.m12769d().mo10423b();
        m26161k();
    }

    /* renamed from: a */
    public final void mo21779a(PlayerEvent playerEvent, int i, String str) {
        switch (playerEvent) {
            case RENDERING_START:
                m26160g(true);
                break;
            case MEDIA_ERROR:
            case PLAY_COMPLETED:
                m26159f(false);
                m26160g(false);
                if (playerEvent != PlayerEvent.MEDIA_ERROR) {
                    m26155a(PlayerMessage.COMPLETE_PLAY, (Object) str);
                    break;
                } else {
                    m26155a(PlayerMessage.MEDIA_ERROR, (Object) str);
                    break;
                }
            case PREPARED:
                if (this.f23771b != null) {
                    Point i2 = this.f23771b.mo21777i();
                    this.f23783o = (i2.y << 16) | i2.x;
                }
                this.f23784p = 0;
                m26159f(true);
                m26155a(PlayerMessage.PLAYER_PREPARED, (Object) str);
                break;
            case VIDEO_SIZE_CHANGED:
                this.f23783o = i;
                m26165o();
                m26155a(PlayerMessage.VIDEO_SIZE_CHANGED, (Object) String.valueOf(i));
                break;
            case SEI_UPDATE:
                m26155a(PlayerMessage.INTERACT_SEI, (Object) str);
                break;
            case BUFFERING_START:
                m26155a(PlayerMessage.BUFFERING_START, (Object) str);
                break;
            case BUFFERING_END:
                m26155a(PlayerMessage.BUFFERING_END, (Object) str);
                break;
        }
        m26154a(playerEvent);
    }

    /* renamed from: a */
    public final void mo21783a(String str, TextureView textureView, int i, C9319c cVar, C9318b bVar, String str2) throws Exception {
        if (str == null) {
            m26161k();
            if (this.f23771b != null) {
                this.f23771b.mo21757a();
            }
            return;
        }
        this.f23770C = "";
        this.f23775g = "";
        this.f23776h = "";
        this.f23785q = LiveMode.valueOf(i);
        if (textureView != null) {
            mo10502a(textureView);
        }
        if (this.f23782n != null) {
            this.f23782n.mo11991a(PlayerMessage.PLAYER_DETACHED, null);
        }
        this.f23782n = bVar;
        this.f23780l = true;
        boolean b = m26156b(str);
        this.f23775g = str;
        this.f23778j = str2;
        if (cVar == null) {
            cVar = f23767e;
        }
        this.f23779k = cVar;
        if (this.f23771b == null) {
            m26162l();
        } else if (this.f23771b.mo21776h()) {
            m26162l();
        }
        if (this.f23793y) {
            this.f23771b.mo21758a(1);
        } else {
            this.f23771b.mo21758a(0);
        }
        this.f23771b.mo21761a((C8752a) this);
        m26169s();
        if (b || !m26167q()) {
            if (b) {
                this.f23784p = 0;
            }
            m26164n();
        } else if (m26166p()) {
            this.f23771b.mo21759a(this.f23773d);
            this.f23771b.mo21770c();
            if (m26168r()) {
                ((C3495l) C3596c.m13172a(C3495l.class)).cacheEndTime(this, System.currentTimeMillis());
                this.f23781m.obtainMessage(PlayerMessage.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }
}
