package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.ITTLivePlayer.C8752a;
import com.bytedance.android.livesdk.player.ITTLivePlayer.StreamType;
import com.bytedance.common.utility.C6319n;
import com.p280ss.videoarch.liveplayer.C46311e;
import com.p280ss.videoarch.liveplayer.p1834a.C46284d;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.n */
public final class C8776n implements ITTLivePlayer {

    /* renamed from: d */
    private static final SparseIntArray f23827d;

    /* renamed from: a */
    C46311e f23828a;

    /* renamed from: b */
    C8782r f23829b;

    /* renamed from: c */
    C8752a f23830c;

    /* renamed from: a */
    public final void mo21758a(int i) {
    }

    /* renamed from: a */
    public final void mo21766a(boolean z, boolean z2, int i) {
    }

    /* renamed from: g */
    public final boolean mo21775g() {
        if (this.f23828a == null || !this.f23828a.mo115106l()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo21776h() {
        if (this.f23828a == null || !this.f23828a.mo115105k()) {
            return false;
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f23827d = sparseIntArray;
        sparseIntArray.put(0, 0);
        f23827d.put(1, 1);
        f23827d.put(2, 2);
        f23827d.put(3, 3);
    }

    /* renamed from: d */
    public final void mo21772d() {
        new StringBuilder("stop: LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115098e();
    }

    /* renamed from: e */
    public final void mo21773e() {
        new StringBuilder("release: LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115103i();
    }

    /* renamed from: f */
    public final void mo21774f() {
        new StringBuilder("releaseAsync: LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115104j();
    }

    /* renamed from: i */
    public final Point mo21777i() {
        return new Point(this.f23828a.mo115107m(), this.f23828a.mo115108n());
    }

    /* renamed from: j */
    public final JSONObject mo21778j() {
        if (this.f23828a != null) {
            return this.f23828a.mo115110p();
        }
        return new JSONObject();
    }

    /* renamed from: a */
    public final void mo21757a() {
        new StringBuilder("reset: LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115101g();
    }

    /* renamed from: b */
    public final void mo21767b() {
        new StringBuilder("prepareAsync: LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115074a(2, 0);
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo10240a()).booleanValue()) {
            this.f23828a.mo115074a(18, 0);
            this.f23828a.mo115073a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo10240a()).floatValue());
            this.f23828a.mo115074a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo10240a()).intValue());
            this.f23828a.mo115073a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo10240a()).floatValue());
            this.f23828a.mo115074a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo10240a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(35, 1);
            this.f23828a.mo115074a(33, 1);
            this.f23828a.mo115074a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(36, 1);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_FAST_OPEN_DISABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(40, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_NTP_ENABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(42, 1);
        }
        this.f23828a.mo115074a(9, 2);
        this.f23828a.mo115096d();
    }

    /* renamed from: c */
    public final void mo21770c() {
        new StringBuilder("start: LivePlayer = ").append(this.f23828a);
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo10240a()).booleanValue()) {
            this.f23828a.mo115074a(18, 0);
            this.f23828a.mo115073a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo10240a()).floatValue());
            this.f23828a.mo115074a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo10240a()).intValue());
            this.f23828a.mo115073a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo10240a()).floatValue());
            this.f23828a.mo115074a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo10240a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(35, 1);
            this.f23828a.mo115074a(33, 1);
            this.f23828a.mo115074a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo10240a()).intValue() == 1) {
            this.f23828a.mo115074a(36, 1);
        }
        this.f23828a.mo115074a(9, 2);
        this.f23828a.mo115096d();
    }

    public C8776n(C8780q qVar) {
        m26227a(qVar);
    }

    /* renamed from: a */
    public final void mo21759a(Surface surface) {
        this.f23828a.mo115076a(surface);
    }

    /* renamed from: b */
    public final void mo21768b(String str) {
        this.f23828a.mo115097d(str);
    }

    /* renamed from: c */
    public final void mo21771c(boolean z) {
        this.f23828a.mo115091b(z);
    }

    /* renamed from: a */
    public final void mo21760a(SurfaceHolder surfaceHolder) {
        this.f23828a.mo115077a((SurfaceHolder) null);
    }

    /* renamed from: b */
    public final void mo21769b(boolean z) {
        if (!z && this.f23828a != null) {
            this.f23828a.mo115074a(41, 0);
        }
    }

    /* renamed from: a */
    private void m26227a(C8780q qVar) {
        this.f23828a = qVar.mo21830b();
        this.f23829b = qVar.f23850g;
        if (this.f23830c != null) {
            this.f23829b.f23852a = this.f23830c;
            this.f23830c = null;
        }
    }

    /* renamed from: a */
    public final void mo21761a(C8752a aVar) {
        if (this.f23829b != null) {
            this.f23829b.f23852a = aVar;
        } else {
            this.f23830c = aVar;
        }
    }

    /* renamed from: a */
    public final void mo21762a(String str) {
        this.f23828a.mo115087a(str);
    }

    /* renamed from: a */
    public final void mo21765a(boolean z) {
        this.f23828a.mo115080a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo21763a(String str, String str2) throws IOException {
        new StringBuilder("setDataSource: with pull stream data, LivePlayer = ").append(this.f23828a);
        this.f23828a.mo115090b(str);
        if (!C6319n.m19593a(str2)) {
            this.f23828a.mo115075a(43, str2);
        }
    }

    /* renamed from: a */
    public final void mo21764a(String str, Map<String, String> map, StreamType streamType) throws IOException {
        new StringBuilder("setDataSource: with url, LivePlayer = ").append(this.f23828a);
        if (str.indexOf("://") <= 0) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            this.f23828a.mo115094c(Uri.parse(sb.toString()).toString());
            return;
        }
        String str2 = (String) map.get("sdk_params");
        this.f23828a.mo115085a(new C46284d[]{new C46284d(Uri.parse(str).toString(), null, str2)});
    }
}
