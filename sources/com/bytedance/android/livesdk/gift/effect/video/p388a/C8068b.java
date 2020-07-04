package com.bytedance.android.livesdk.gift.effect.video.p388a;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9322a;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9324c;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9325d;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.p280ss.android.ugc.aweme.live.alphaplayer.AlphaVideoView;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32445a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32447b;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32454c;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32460d;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType;
import com.p280ss.android.ugc.aweme.live.alphaplayer.PlayerController;
import com.p280ss.android.ugc.aweme.live.alphaplayer.p1361b.C32449b;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.b */
public final class C8068b implements C9322a {

    /* renamed from: a */
    public C9324c f22001a;

    /* renamed from: b */
    public C9325d f22002b;

    /* renamed from: c */
    public PlayerController f22003c;

    /* renamed from: d */
    private Context f22004d;

    /* renamed from: e */
    private C0043i f22005e;

    /* renamed from: f */
    private final IHostPlugin f22006f;

    /* renamed from: g */
    private C32445a f22007g = new C32445a() {
        /* renamed from: a */
        public final void mo21095a() {
            if (C8068b.this.f22001a != null) {
                C8068b.this.f22001a.mo14041a();
            }
        }

        /* renamed from: b */
        public final void mo21097b() {
            if (C8068b.this.f22001a != null) {
                C8068b.this.f22001a.mo14043b();
            }
        }

        /* renamed from: a */
        public final void mo21096a(int i, int i2, ScaleType scaleType) {
            if (C8068b.this.f22001a != null) {
                AlphaVideoView alphaVideoView = C8068b.this.f22003c.f84637d;
                C8068b.this.mo21084a((float) alphaVideoView.getMeasuredWidth(), (float) alphaVideoView.getMeasuredHeight(), (float) i, (float) i2, scaleType);
            }
        }
    };

    /* renamed from: h */
    private C32460d f22008h = new C32460d() {
        /* renamed from: a */
        public final void mo21098a(boolean z, String str, int i, int i2, String str2) {
            if (C8068b.this.f22002b != null) {
                C8068b.this.f22002b.mo14044a(z, str, i, i2, str2);
            }
        }
    };

    /* renamed from: d */
    public final void mo21093d() {
        this.f22001a = null;
    }

    /* renamed from: e */
    public final void mo21094e() {
        this.f22002b = null;
    }

    /* renamed from: a */
    public final View mo21083a() {
        if (this.f22003c != null) {
            return this.f22003c.f84637d;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo21090b() {
        if (this.f22003c != null) {
            this.f22003c.mo83687c();
        }
    }

    /* renamed from: c */
    public final void mo21092c() {
        if (this.f22003c != null) {
            this.f22003c.mo83677a((C32445a) null);
            this.f22003c.f84635b = null;
            this.f22003c.mo83685b();
            this.f22003c = null;
        }
        this.f22005e = null;
        this.f22004d = null;
        this.f22001a = null;
        this.f22002b = null;
    }

    /* renamed from: f */
    private void m24749f() {
        if (this.f22004d != null && this.f22005e != null) {
            if (this.f22003c != null) {
                this.f22003c.mo83685b();
            }
            C32447b a = new C32447b().mo83702a(this.f22004d).mo83701a(this.f22005e);
            boolean z = true;
            if (((Integer) LiveSettingKeys.LIVE_GIFT_PLAYER_USE_TYPE.mo10240a()).intValue() != 0 && (!((Boolean) C8946b.f24435bG.mo22117a()).booleanValue() || ((Integer) LiveSettingKeys.LIVE_GIFT_PLAYER_USE_TYPE.mo10240a()).intValue() != 1)) {
                z = false;
            }
            if (z) {
                try {
                    this.f22003c = PlayerController.m105089a(a, (C32454c) new C8063a(this.f22004d).mo21066a());
                } catch (Throwable th) {
                    this.f22003c = PlayerController.m105089a(a, (C32454c) new C32449b());
                    C3166a.m11955a(6, "LiveGiftPlay", th.getStackTrace());
                }
            } else {
                this.f22003c = PlayerController.m105089a(a, (C32454c) new C32449b());
            }
            this.f22003c.mo83677a(this.f22007g);
            this.f22003c.f84635b = this.f22008h;
        }
    }

    /* renamed from: a */
    public final void mo21087a(C9324c cVar) {
        this.f22001a = cVar;
    }

    /* renamed from: a */
    public final void mo21085a(C0043i iVar) {
        this.f22005e = iVar;
        m24749f();
    }

    /* renamed from: a */
    public final void mo21086a(ViewGroup viewGroup) {
        if (this.f22003c != null) {
            this.f22003c.mo83681a(viewGroup);
        }
    }

    /* renamed from: b */
    public final void mo21091b(ViewGroup viewGroup) {
        if (this.f22003c != null) {
            this.f22003c.mo83686b(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo21088a(C9325d dVar) {
        this.f22002b = dVar;
    }

    public C8068b(Context context, IHostPlugin iHostPlugin) {
        this.f22004d = context;
        this.f22006f = iHostPlugin;
    }

    /* renamed from: a */
    public final void mo21089a(String str, long j) {
        if (this.f22003c != null) {
            this.f22003c.mo83682a(new DataSource().mo83674a(str).mo83673a(j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        r1 = r5;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009c, code lost:
        if (r4.f22001a == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009e, code lost:
        r4.f22001a.mo14042a(r1, r8, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21084a(float r5, float r6, float r7, float r8, com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType r9) {
        /*
            r4 = this;
            float r0 = r5 / r6
            float r7 = r7 / r8
            com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType r8 = com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType.ScaleAspectFill
            if (r9 == r8) goto L_0x001f
            com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType r8 = com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType.TopFill
            if (r9 == r8) goto L_0x001f
            com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType r8 = com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType.BottomFill
            if (r9 == r8) goto L_0x001f
            com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType r8 = com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType.RightFill
            if (r9 == r8) goto L_0x001f
            com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType r8 = com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType.LeftFill
            if (r9 != r8) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0028
            float r8 = r6 * r7
            goto L_0x0025
        L_0x001f:
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x0028
            float r8 = r6 * r7
        L_0x0025:
            r1 = r8
            r8 = r6
            goto L_0x002b
        L_0x0028:
            float r8 = r5 / r7
            r1 = r5
        L_0x002b:
            int[] r2 = com.bytedance.android.livesdk.gift.effect.video.p388a.C8068b.C80713.f22011a
            int r9 = r9.ordinal()
            r9 = r2[r9]
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            switch(r9) {
                case 1: goto L_0x0097;
                case 2: goto L_0x0088;
                case 3: goto L_0x007e;
                case 4: goto L_0x0071;
                case 5: goto L_0x0068;
                case 6: goto L_0x005b;
                case 7: goto L_0x0050;
                case 8: goto L_0x004d;
                case 9: goto L_0x0046;
                case 10: goto L_0x0043;
                case 11: goto L_0x003c;
                default: goto L_0x0039;
            }
        L_0x0039:
            r5 = 0
            goto L_0x009a
        L_0x003c:
            float r7 = r7 * r6
            float r5 = r5 - r7
            r3 = r5
            r8 = r6
            r1 = r7
            goto L_0x0039
        L_0x0043:
            float r5 = r6 * r7
            goto L_0x0097
        L_0x0046:
            float r7 = r5 / r7
            float r6 = r6 - r7
            r1 = r5
            r5 = r6
            r8 = r7
            goto L_0x009a
        L_0x004d:
            float r6 = r5 / r7
            goto L_0x0097
        L_0x0050:
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0057
            float r5 = r5 - r1
            float r5 = r5 / r2
            goto L_0x0095
        L_0x0057:
            float r6 = r6 - r8
            float r5 = r6 / r2
            goto L_0x009a
        L_0x005b:
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            float r5 = r8 - r6
            float r5 = -r5
            float r5 = r5 / r2
            goto L_0x009a
        L_0x0064:
            float r5 = r1 - r5
            float r5 = -r5
            goto L_0x0095
        L_0x0068:
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            float r5 = r8 - r6
            float r5 = -r5
            float r5 = r5 / r2
            goto L_0x009a
        L_0x0071:
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0079
            float r5 = r8 - r6
            float r5 = -r5
            goto L_0x009a
        L_0x0079:
            float r5 = r1 - r5
            float r5 = -r5
            float r5 = r5 / r2
            goto L_0x0095
        L_0x007e:
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0083
            goto L_0x0039
        L_0x0083:
            float r5 = r1 - r5
            float r5 = -r5
            float r5 = r5 / r2
            goto L_0x0095
        L_0x0088:
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0091
            float r5 = r8 - r6
            float r5 = -r5
            float r5 = r5 / r2
            goto L_0x009a
        L_0x0091:
            float r5 = r1 - r5
            float r5 = -r5
            float r5 = r5 / r2
        L_0x0095:
            r3 = r5
            goto L_0x0039
        L_0x0097:
            r1 = r5
            r8 = r6
            goto L_0x0039
        L_0x009a:
            com.bytedance.android.livesdkapi.depend.live.a.c r6 = r4.f22001a
            if (r6 == 0) goto L_0x00a3
            com.bytedance.android.livesdkapi.depend.live.a.c r6 = r4.f22001a
            r6.mo14042a(r1, r8, r3, r5)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.p388a.C8068b.mo21084a(float, float, float, float, com.ss.android.ugc.aweme.live.alphaplayer.DataSource$ScaleType):void");
    }
}
