package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2420b;
import com.bytedance.android.live.broadcast.api.p126b.C2427e.C2428a;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.api.p128d.C2432b;
import com.bytedance.android.live.broadcast.api.p128d.C2432b.C2433a;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2615d;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.stream.C2967c;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p141a.C2947a;
import com.bytedance.android.live.broadcast.stream.p141a.C2953b;
import com.bytedance.android.live.broadcast.stream.p141a.C2954c.C2955a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2951d;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.interact.C4486al;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.p280ss.avframework.livestreamv2.core.Client;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.FileNotFoundException;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class LinkVideo2View extends SurfaceView implements C2432b, C4486al, C4487am {

    /* renamed from: a */
    public C2951d f9345a;

    /* renamed from: b */
    public boolean f9346b;

    /* renamed from: c */
    public C7321c f9347c;

    /* renamed from: d */
    private final C2433a f9348d;

    /* renamed from: e */
    private C2581a f9349e;

    /* renamed from: f */
    private C2947a f9350f;

    /* renamed from: g */
    private C2429a f9351g;

    /* renamed from: h */
    private C2420b f9352h;

    /* renamed from: c */
    public final void mo9798c() {
    }

    /* renamed from: d */
    public final void mo9799d() {
    }

    /* renamed from: e_ */
    public final void mo8937e_() {
        this.f9350f.mo9681b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9351g.mo8927b();
    }

    /* renamed from: f */
    private void m11596f() {
        C2515f.m10417f().mo9074a().mo8888a(new C2428a().mo8912a(this.f9352h).mo8914a());
    }

    /* renamed from: a */
    public final void mo9796a() {
        try {
            this.f9351g.mo8928c();
        } catch (NullPointerException e) {
            C3166a.m11955a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    /* renamed from: b */
    public final void mo9797b() {
        try {
            this.f9351g.mo8927b();
        } catch (NullPointerException e) {
            C3166a.m11955a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f9347c != null && !this.f9347c.isDisposed()) {
            this.f9347c.dispose();
        }
        C2515f.m10417f().mo9074a().mo8900c();
        this.f9350f.mo9676a();
        this.f9351g.mo8928c();
        this.f9351g.mo8929d();
        super.onDetachedFromWindow();
        if (this.f9347c != null && !this.f9347c.isDisposed()) {
            this.f9347c.dispose();
        }
    }

    /* renamed from: e */
    public final void mo9802e() {
        int i;
        if (!this.f9346b) {
            this.f9346b = true;
            m11596f();
            if (this.f9345a == null) {
                this.f9345a = new C2951d();
                this.f9350f.mo9677a((C2948a) this.f9345a);
            }
            if (this.f9349e == null) {
                this.f9349e = new C2615d();
                if (this.f9348d == null) {
                    i = this.f9349e.f8292f;
                } else {
                    i = this.f9348d.f7965a;
                }
                this.f9349e.mo9197a(i);
            }
            if (!(this.f9348d == null || this.f9348d.f7966b == null)) {
                C2515f.m10417f().mo9074a().mo8892a(C2418b.f7952c, this.f9348d.f7966b);
            }
        }
    }

    public LinkVideo2View(Context context) {
        this(context, null, null);
    }

    /* renamed from: a */
    public final void mo8936a(int i) {
        if (this.f9349e != null) {
            this.f9349e.mo9197a(i);
        }
    }

    /* renamed from: a */
    public final Client mo9795a(InteractConfig interactConfig, Boolean bool) {
        return this.f9351g.mo8916a(interactConfig, bool);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public LinkVideo2View(Context context, C2433a aVar) {
        this(context, null, aVar);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet, C2433a aVar) {
        int i;
        super(context, attributeSet);
        this.f9352h = new C2420b() {
            /* renamed from: a */
            public final int mo8878a() {
                LinkVideo2View.this.f9345a.mo9706a();
                return 1;
            }

            /* renamed from: a */
            public final int mo8881a(boolean z) {
                LinkVideo2View.this.f9345a.mo9711a(z);
                return 1;
            }

            /* renamed from: a */
            public final int mo8882a(String[] strArr) {
                LinkVideo2View.this.f9345a.mo9712a(strArr);
                return 1;
            }

            /* renamed from: a */
            public final int mo8880a(String str, boolean z) {
                try {
                    LinkVideo2View.this.f9345a.mo9710a(str, z);
                    return 1;
                } catch (FileNotFoundException e) {
                    C3166a.m11963b("LinkVideo2View", (Throwable) e);
                    return -1;
                }
            }

            /* renamed from: a */
            public final int mo8879a(String str, String str2, float f) {
                try {
                    LinkVideo2View.this.f9345a.mo9708a(str, str2, f);
                    return 1;
                } catch (FileNotFoundException e) {
                    C3166a.m11963b("LinkVideo2View", (Throwable) e);
                    return -1;
                }
            }
        };
        this.f9348d = aVar;
        String modelFilePath = LiveCameraResManager.INST.getModelFilePath();
        if (aVar == null || aVar.f7967c != 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.f9351g = new C2967c(new C2978a(getContext()).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9755a((C2965a) new C2761d()).mo9756a((C2966b) new C2762e()).mo9757a((C2980a) new C2760c()).mo9777j(i).mo9767c(modelFilePath).mo9758a((Object) LiveCameraResManager.INST.getResourceFinder(getContext())).mo9752a(240, 320).mo9762a());
        this.f9350f = new C2953b(this, this.f9351g);
        this.f9350f.mo9678a((C2955a) new C2955a() {
            /* renamed from: a */
            public final void mo9572a(int i, int i2, String str) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo9805a(Integer num) throws Exception {
                LinkVideo2View.this.mo9802e();
            }

            /* renamed from: b */
            public final void mo9574b(int i, int i2, String str) {
                if (!LinkVideo2View.this.f9346b) {
                    LinkVideo2View.this.f9347c = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3113i<Object>(this), C3114j.f9606a);
                }
            }
        });
    }
}
