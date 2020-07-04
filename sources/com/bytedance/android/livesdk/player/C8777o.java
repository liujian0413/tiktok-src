package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.ITTLivePlayer.C8752a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.PlayerEvent;
import com.bytedance.android.livesdk.player.ITTLivePlayer.StreamType;
import com.bytedance.android.livesdk.player.p415a.C8754a;
import com.bytedance.android.livesdk.player.p415a.C8755b;
import com.bytedance.android.livesdk.player.p415a.C8756c;
import com.bytedance.common.utility.C6319n;
import com.p280ss.videoarch.liveplayer.C46311e;
import com.p280ss.videoarch.liveplayer.p1834a.C46284d;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.o */
public final class C8777o implements Callback, ITTLivePlayer {

    /* renamed from: e */
    private static final SparseIntArray f23831e;

    /* renamed from: a */
    C46311e f23832a;

    /* renamed from: b */
    C8782r f23833b;

    /* renamed from: c */
    C8752a f23834c;

    /* renamed from: d */
    public Handler f23835d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private Handler f23836f;

    /* renamed from: g */
    private HandlerThread f23837g;

    /* renamed from: h */
    private C8752a f23838h = new C8752a() {
        /* renamed from: a */
        public final void mo21779a(PlayerEvent playerEvent, int i, String str) {
            C8777o.this.f23835d.post(new C8779p(this, playerEvent, i, str));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo21825b(PlayerEvent playerEvent, int i, String str) {
            if (C8777o.this.f23834c != null) {
                C8777o.this.f23834c.mo21779a(playerEvent, i, str);
            }
        }
    };

    /* renamed from: a */
    public final void mo21764a(String str, Map<String, String> map, StreamType streamType) throws IOException {
        m26252a(m26250a(2, (Object) new C8755b(str, map, streamType)));
    }

    /* renamed from: a */
    public final void mo21763a(String str, String str2) throws IOException {
        m26252a(m26250a(1, (Object) new C8754a(str, str2)));
    }

    /* renamed from: a */
    public final void mo21765a(boolean z) {
        m26252a(m26250a(7, (Object) Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo21762a(String str) {
        m26252a(m26250a(10, (Object) str));
    }

    /* renamed from: a */
    public final void mo21766a(boolean z, boolean z2, int i) {
        m26252a(m26250a(16, (Object) new C8756c(z, z2, i)));
    }

    /* renamed from: k */
    private void m26265k() {
        this.f23832a.mo115101g();
    }

    /* renamed from: n */
    private void m26268n() {
        this.f23832a.mo115093c();
    }

    /* renamed from: o */
    private void m26269o() {
        this.f23832a.mo115098e();
    }

    /* renamed from: p */
    private void m26270p() {
        this.f23832a.mo115103i();
        m26272r();
    }

    /* renamed from: q */
    private void m26271q() {
        this.f23832a.mo115104j();
        m26272r();
    }

    /* renamed from: r */
    private void m26272r() {
        if (this.f23837g != null) {
            this.f23837g.quit();
            this.f23837g.interrupt();
        }
    }

    /* renamed from: c */
    public final void mo21770c() {
        m26252a(m26250a(3, (Object) null));
    }

    /* renamed from: f */
    public final void mo21774f() {
        m26252a(m26250a(14, (Object) null));
    }

    /* renamed from: g */
    public final boolean mo21775g() {
        if (this.f23832a == null || !this.f23832a.mo115106l()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo21776h() {
        if (this.f23832a == null || !this.f23832a.mo115105k()) {
            return false;
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f23831e = sparseIntArray;
        sparseIntArray.put(0, 0);
        f23831e.put(1, 1);
        f23831e.put(2, 2);
        f23831e.put(3, 3);
    }

    /* renamed from: d */
    public final void mo21772d() {
        m26252a(m26250a(12, (Object) null));
    }

    /* renamed from: e */
    public final void mo21773e() {
        m26252a(m26250a(13, (Object) null));
    }

    /* renamed from: i */
    public final Point mo21777i() {
        if (this.f23832a != null) {
            return new Point(this.f23832a.mo115107m(), this.f23832a.mo115108n());
        }
        return new Point(0, 0);
    }

    /* renamed from: j */
    public final JSONObject mo21778j() {
        if (this.f23832a != null) {
            return this.f23832a.mo115110p();
        }
        return new JSONObject();
    }

    /* renamed from: l */
    private void m26266l() {
        this.f23832a.mo115074a(2, 0);
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo10240a()).booleanValue()) {
            this.f23832a.mo115074a(18, 0);
            this.f23832a.mo115073a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo10240a()).floatValue());
            this.f23832a.mo115074a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo10240a()).intValue());
            this.f23832a.mo115073a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo10240a()).floatValue());
            this.f23832a.mo115074a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo10240a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(35, 1);
            this.f23832a.mo115074a(33, 1);
            this.f23832a.mo115074a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(36, 1);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_FAST_OPEN_DISABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(40, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_NTP_ENABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(42, 1);
        }
        this.f23832a.mo115074a(9, 2);
        this.f23832a.mo115096d();
    }

    /* renamed from: m */
    private void m26267m() {
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo10240a()).booleanValue()) {
            this.f23832a.mo115074a(18, 0);
            this.f23832a.mo115073a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo10240a()).floatValue());
            this.f23832a.mo115074a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo10240a()).intValue());
            this.f23832a.mo115073a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo10240a()).floatValue());
            this.f23832a.mo115074a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo10240a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(35, 1);
            this.f23832a.mo115074a(33, 1);
            this.f23832a.mo115074a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo10240a()).intValue() == 1) {
            this.f23832a.mo115074a(36, 1);
        }
        this.f23832a.mo115074a(9, 2);
        this.f23832a.mo115096d();
    }

    /* renamed from: a */
    public final void mo21757a() {
        m26252a(m26250a(15, (Object) null));
    }

    /* renamed from: b */
    public final void mo21767b() {
        m26252a(m26250a(4, (Object) null));
    }

    /* renamed from: a */
    public final void mo21761a(C8752a aVar) {
        this.f23834c = aVar;
    }

    /* renamed from: a */
    private void m26251a(float f) {
        this.f23832a.mo115072a(f);
    }

    /* renamed from: b */
    private void m26255b(Surface surface) {
        this.f23832a.mo115076a(surface);
    }

    /* renamed from: c */
    private void m26260c(String str) {
        this.f23832a.mo115087a(str);
    }

    /* renamed from: d */
    private void m26261d(String str) {
        this.f23832a.mo115097d(str);
    }

    /* renamed from: f */
    private void m26264f(boolean z) {
        this.f23832a.mo115091b(z);
    }

    /* renamed from: b */
    private void m26256b(SurfaceHolder surfaceHolder) {
        this.f23832a.mo115077a(surfaceHolder);
    }

    /* renamed from: d */
    private void m26262d(boolean z) {
        this.f23832a.mo115080a(Boolean.valueOf(z));
    }

    /* renamed from: e */
    private void m26263e(boolean z) {
        if (!z && this.f23832a != null) {
            this.f23832a.mo115074a(41, 0);
        }
    }

    public C8777o(C8780q qVar) {
        m26254a(qVar);
    }

    /* renamed from: a */
    private void m26252a(Message message) {
        m26253a(message, 0);
    }

    /* renamed from: b */
    private void m26257b(C8780q qVar) {
        this.f23832a = qVar.mo21830b();
        this.f23833b = qVar.f23850g;
        this.f23833b.f23852a = this.f23838h;
        this.f23832a.mo115074a(44, 0);
    }

    /* renamed from: c */
    public final void mo21771c(boolean z) {
        m26252a(m26250a(19, (Object) Boolean.valueOf(z)));
    }

    /* renamed from: a */
    private void m26254a(C8780q qVar) {
        this.f23837g = new HandlerThread("single-live-player-thread", 10);
        this.f23837g.start();
        this.f23836f = new Handler(this.f23837g.getLooper(), this);
        m26252a(m26250a(18, (Object) qVar));
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C8754a aVar = (C8754a) message.obj;
                m26258b(aVar.f23758a, aVar.f23759b);
                break;
            case 2:
                C8755b bVar = (C8755b) message.obj;
                m26259b(bVar.f23760a, bVar.f23761b, bVar.f23762c);
                break;
            case 3:
                m26267m();
                break;
            case 4:
                m26266l();
                break;
            case 5:
                m26255b((Surface) message.obj);
                break;
            case 6:
                m26256b((SurfaceHolder) message.obj);
                break;
            case 7:
                m26262d(((Boolean) message.obj).booleanValue());
                break;
            case 8:
                m26251a(((Float) message.obj).floatValue());
                break;
            case 9:
                m26263e(((Boolean) message.obj).booleanValue());
                break;
            case 10:
                m26260c((String) message.obj);
                break;
            case 11:
                m26268n();
                break;
            case 12:
                m26269o();
                break;
            case 13:
                m26270p();
                break;
            case 14:
                m26271q();
                break;
            case 15:
                m26265k();
                break;
            case 16:
                Object obj = message.obj;
                break;
            case 17:
                ((Integer) message.obj).intValue();
                break;
            case 18:
                m26257b((C8780q) message.obj);
                break;
            case 19:
                m26264f(((Boolean) message.obj).booleanValue());
                break;
            case 20:
                m26261d((String) message.obj);
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo21758a(int i) {
        m26252a(m26250a(17, (Object) Integer.valueOf(i)));
    }

    /* renamed from: b */
    public final void mo21768b(String str) {
        m26252a(m26250a(20, (Object) str));
    }

    /* renamed from: a */
    public final void mo21759a(Surface surface) {
        m26252a(m26250a(5, (Object) surface));
    }

    /* renamed from: b */
    public final void mo21769b(boolean z) {
        m26252a(m26250a(9, (Object) Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo21760a(SurfaceHolder surfaceHolder) {
        m26252a(m26250a(6, (Object) null));
    }

    /* renamed from: a */
    private static Message m26250a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    private void m26253a(Message message, long j) {
        if (this.f23837g != null && this.f23837g.isAlive() && !this.f23837g.isInterrupted()) {
            if (this.f23836f == null) {
                this.f23836f = new Handler(this.f23837g.getLooper(), this);
            }
            this.f23836f.sendMessageDelayed(message, 0);
        }
    }

    /* renamed from: b */
    private void m26258b(String str, String str2) {
        this.f23832a.mo115090b(str);
        if (!C6319n.m19593a(str2)) {
            this.f23832a.mo115075a(43, str2);
        }
    }

    /* renamed from: b */
    private void m26259b(String str, Map<String, String> map, StreamType streamType) {
        if (str.indexOf("://") <= 0) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            this.f23832a.mo115094c(Uri.parse(sb.toString()).toString());
            return;
        }
        Uri parse = Uri.parse(str);
        String str2 = "";
        if (map != null) {
            str2 = (String) map.get("sdk_params");
        }
        this.f23832a.mo115085a(new C46284d[]{new C46284d(parse.toString(), null, str2)});
    }
}
