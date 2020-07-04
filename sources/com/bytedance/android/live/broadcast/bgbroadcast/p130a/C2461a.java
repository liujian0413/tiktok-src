package com.bytedance.android.live.broadcast.bgbroadcast.p130a;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p127c.C2430b;
import com.bytedance.android.live.broadcast.bgbroadcast.C2459a;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.stream.C2967c;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a */
public final class C2461a extends C2459a implements C2430b {

    /* renamed from: g */
    private static final int[][] f8023g = {new int[]{C34943c.f91127w, VETransitionFilterParam.TransitionDuration_DEFAULT, 800, 1}, new int[]{C34943c.f91127w, 800, 1200, 3}};

    /* renamed from: b */
    private final Handler f8024b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Context f8025c;

    /* renamed from: d */
    private C2429a f8026d;

    /* renamed from: e */
    private final Room f8027e;

    /* renamed from: f */
    private int f8028f = 0;

    /* renamed from: a */
    public final void mo8765a(float f) {
    }

    /* renamed from: b */
    public final void mo8775b() {
    }

    /* renamed from: c */
    public final void mo8779c() {
        this.f8024b.post(new C2462b(this));
    }

    /* renamed from: d */
    public final void mo8780d() {
        this.f8024b.post(new C2463c(this));
    }

    /* renamed from: e */
    public final void mo9017e() {
        if (this.f8026d != null) {
            this.f8026d.mo8926a(false);
        }
    }

    /* renamed from: f */
    public final void mo9018f() {
        if (this.f8026d != null) {
            this.f8026d.mo8926a(true);
        }
    }

    /* renamed from: g */
    public final void mo9019g() {
        if (this.f8026d != null) {
            this.f8026d.mo8929d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo9021h() {
        C3517a.m12962a(this.f8025c, this.f8025c.getString(R.string.f0k));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo9022i() {
        C3517a.m12960a(this.f8025c, (int) R.string.f0m);
    }

    /* renamed from: a */
    public final boolean mo9015a() {
        if (this.f8026d == null) {
            return false;
        }
        this.f8026d.mo8917a();
        this.f8026d.mo8931f();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo9023j() {
        C3517a.m12960a(this.f8025c, (int) R.string.f30);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "2");
        C8443c.m25663a().mo21606a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo9024k() {
        C3517a.m12960a(this.f8025c, (int) R.string.f0l);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "1");
        C8443c.m25663a().mo21606a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }

    /* renamed from: a */
    private static int[] m10288a(C9383t tVar) {
        int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.mo10240a()).intValue();
        if (intValue > 0 && intValue <= f8023g.length) {
            return f8023g[intValue - 1];
        }
        return new int[]{tVar.mo23063c(), tVar.mo23064d(), tVar.mo23065e(), tVar.f25784h};
    }

    /* renamed from: a */
    public final void mo8766a(int i) {
        String str = "";
        int i2 = BaseNotice.HASHTAG;
        int i3 = 1;
        switch (i) {
            case 1:
                str = "stream push failed";
                i3 = 6;
                break;
            case 2:
                i2 = 104;
                str = "enter background timeout";
                break;
            case 3:
                this.f8024b.post(new C2464d(this));
                str = "broadcast error";
                break;
            default:
                i2 = 0;
                break;
        }
        if (i > 0) {
            this.f8024b.post(new C2465e(this));
            BroadcastMonitor.m11030a(false, i2, str);
            if (this.f8022a != null) {
                this.f8022a.mo9020a(i3);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9016a(boolean z) {
        if (this.f8027e.getStreamUrl() == null || this.f8027e.getStreamUrl().mo23050a() == null || this.f8026d == null) {
            return false;
        }
        this.f8026d.mo8930e();
        this.f8026d.mo8923a(this.f8027e.getStreamUrl().mo23050a());
        return true;
    }

    /* renamed from: a */
    public final void mo9014a(Intent intent, boolean z) {
        boolean z2;
        String str;
        float f;
        super.mo9014a(intent, z);
        if (this.f8026d == null) {
            C9383t streamUrlExtraSafely = this.f8027e.getStreamUrlExtraSafely();
            int[] a = m10288a(streamUrlExtraSafely);
            int intValue = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo10240a()).intValue();
            int i = 2;
            if (intValue <= 0) {
                z2 = streamUrlExtraSafely.f25785i;
            } else if (intValue == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int b = streamUrlExtraSafely.mo23062b();
            int a2 = streamUrlExtraSafely.mo23061a();
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a()).length == 2) {
                b = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a())[0].intValue();
                a2 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo10240a())[1].intValue();
            }
            if (((Boolean) LiveConfigSettingKeys.LIVE_GAME_STREAM_PROPORTION_ADAPT.mo10240a()).booleanValue()) {
                float a3 = ((float) streamUrlExtraSafely.mo23061a()) / ((float) streamUrlExtraSafely.mo23062b());
                if (C3358ac.m12523c() > C3358ac.m12520b()) {
                    f = ((float) C3358ac.m12523c()) / ((float) C3358ac.m12520b());
                } else {
                    f = ((float) C3358ac.m12520b()) / ((float) C3358ac.m12523c());
                }
                if (a3 > f) {
                    a2 = (int) (((float) b) * f);
                } else if (a3 < f) {
                    b = (int) (((float) a2) / f);
                }
            }
            int i2 = a2;
            int i3 = b;
            if (z) {
                int i4 = i2;
                i2 = i3;
                i3 = i4;
            }
            int i5 = a[0];
            int i6 = a[1];
            int i7 = a[2];
            int i8 = a[3];
            if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo10240a()).intValue() >= 0) {
                i8 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo10240a()).intValue();
            }
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a()).length == 3) {
                i6 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[0].intValue();
                i5 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[1].intValue();
                i7 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo10240a())[2].intValue();
            }
            C2978a a4 = new C2978a(this.f8025c).mo9751a(0).mo9752a(i3, i2).mo9773f(i3).mo9774g(i2).mo9766c(i5).mo9763b(i6).mo9769d(i7).mo9775h(i8).mo9771e(streamUrlExtraSafely.mo23066f()).mo9760a(z2);
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.mo10240a()).booleanValue()) {
                str = this.f8027e.getStreamUrl().f25615n;
            } else {
                str = "";
            }
            C2978a j = a4.mo9764b(str).mo9751a(2).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9756a((C2966b) new C2762e()).mo9755a((C2965a) new C2761d()).mo9757a((C2980a) new C2760c()).mo9781n(1).mo9754a(intent).mo9777j(3);
            if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.mo10240a()).intValue() != 1) {
                i = 1;
            }
            this.f8026d = new C2967c(j.mo9776i(i).mo9762a());
            this.f8026d.mo8920a((C2430b) this);
        }
    }

    public C2461a(Context context, Room room, MediaProjection mediaProjection) {
        this.f8025c = context;
        this.f8027e = room;
    }
}
