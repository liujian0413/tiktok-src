package com.bytedance.android.live.broadcast.bgbroadcast.p130a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.bgbroadcast.C2483b;
import com.bytedance.android.live.broadcast.bgbroadcast.C2501m;
import com.bytedance.android.live.broadcast.dialog.C2522a;
import com.bytedance.android.live.broadcast.dialog.C2533h;
import com.bytedance.android.live.broadcast.widget.C3103d;
import com.bytedance.android.live.broadcast.widget.C3125r;
import com.bytedance.android.live.broadcast.widget.C3125r.C3130a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7838b;
import com.bytedance.android.livesdk.floatwindow.C7841e;
import com.bytedance.android.livesdk.floatwindow.C7842f;
import com.bytedance.android.livesdk.floatwindow.C7843g;
import com.bytedance.android.livesdk.floatwindow.C7849h;
import com.bytedance.android.livesdk.floatwindow.C7851i;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.C9521a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.f */
public final class C2466f extends C2483b {

    /* renamed from: e */
    public boolean f8033e;

    /* renamed from: f */
    public C7321c f8034f;

    /* renamed from: g */
    public C2533h f8035g;

    /* renamed from: h */
    private Dialog f8036h;

    /* renamed from: i */
    private Dialog f8037i;

    /* renamed from: j */
    private C2522a f8038j;

    /* renamed from: k */
    private boolean f8039k;

    /* renamed from: l */
    private C7321c f8040l;

    /* renamed from: m */
    private boolean f8041m;

    /* renamed from: n */
    private C3103d f8042n;

    /* renamed from: o */
    private boolean f8043o;

    /* renamed from: p */
    private BroadcastReceiver f8044p;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.f$a */
    class C2476a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C2476a() {
        }

        public final void onClick(View view) {
            if (C2466f.this.f8035g != null) {
                C2466f.this.f8035g.dismiss();
                C2466f.this.f8035g = null;
            }
            C2466f fVar = C2466f.this;
            C2533h hVar = new C2533h(C2466f.this.f8066c, ((Boolean) C8946b.f24408ag.mo22117a()).booleanValue(), ((Boolean) C8946b.f24409ah.mo22117a()).booleanValue(), ((Boolean) C8946b.f24410ai.mo22117a()).booleanValue(), C2466f.this.f8033e);
            fVar.f8035g = hVar;
            C2466f.this.f8035g.show();
        }
    }

    /* renamed from: f */
    public final void mo9037f() {
    }

    /* renamed from: g */
    public final boolean mo9038g() {
        return true;
    }

    /* renamed from: h */
    public final boolean mo9039h() {
        return this.f8033e;
    }

    /* renamed from: m */
    private void m10308m() {
        if (this.f8038j == null) {
            this.f8038j = new C2522a(this.f8066c);
        }
        if (!this.f8038j.isShowing()) {
            this.f8038j.show();
        }
    }

    /* renamed from: c */
    public final void mo9034c() {
        this.f8040l = C7492s.m23295b(500, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2477g<Object>(this), C2478h.f8059a);
    }

    /* renamed from: k */
    private void m10306k() {
        this.f8037i = new C9249a(this.f8066c, 0).mo22710a((int) R.string.fc3).mo22718b((int) R.string.eyr).mo22722b(0, (int) R.string.f96, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7851i.m24077b(C2466f.this.f8066c);
                dialogInterface.dismiss();
            }
        }).mo22722b(1, (int) R.string.ecm, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo22720b();
    }

    /* renamed from: i */
    public final void mo9040i() {
        super.mo9040i();
        if (this.f8036h != null && this.f8036h.isShowing()) {
            C2482l.m10336a(this.f8036h);
        }
        if (this.f8037i != null && this.f8037i.isShowing()) {
            C2482l.m10336a(this.f8037i);
        }
    }

    /* renamed from: j */
    public final void mo9041j() {
        C7843g gVar = (C7843g) C7849h.m24059b("control_view");
        if (gVar != null) {
            if (this.f8034f != null) {
                this.f8034f.dispose();
            }
            C7842f fVar = gVar.f21170a;
            if (fVar == null || fVar.mo20548b() <= 0) {
                this.f8034f = C7492s.m23295b(3000, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2480j<Object>(this, gVar), C2481k.f8063a);
            }
        }
    }

    /* renamed from: a */
    public final void mo9029a() {
        super.mo9029a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        this.f8066c.registerReceiver(this.f8044p, intentFilter);
        C5747j.m18104b().mo14165a(ToolbarButton.MESSAGE_PUSH, (C5739a) new C2476a());
    }

    /* renamed from: b */
    public final void mo9033b() {
        if (C7849h.m24059b("control_view") != null) {
            C7849h.m24059b("control_view").mo20553b();
        }
        if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) != null) {
            C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20553b();
        }
        if (!((Boolean) C8946b.f24405ad.mo22117a()).booleanValue() && !this.f8039k) {
            if (C7851i.m24074a(this.f8066c)) {
                m10307l();
            } else if (!this.f8037i.isShowing() && (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo10240a()).intValue() != 1 || !this.f8043o)) {
                m10306k();
                this.f8037i.show();
            }
        }
    }

    /* renamed from: d */
    public final void mo9035d() {
        super.mo9035d();
        if (this.f8036h != null && this.f8036h.isShowing()) {
            C2482l.m10336a(this.f8036h);
        }
        if (this.f8035g != null) {
            this.f8035g.dismiss();
        }
        if (!((Boolean) C8946b.f24405ad.mo22117a()).booleanValue()) {
            if (this.f8037i != null && this.f8037i.isShowing()) {
                C2482l.m10336a(this.f8037i);
            }
            if (this.f8034f != null) {
                this.f8034f.dispose();
            }
            try {
                C7838b b = C7849h.m24059b("control_view");
                if (b != null && b.mo20554c()) {
                    b.dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                C7838b b2 = C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW);
                if (b2 != null && b2.mo20554c()) {
                    b2.dismiss();
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.f8040l != null) {
            this.f8040l.dispose();
        }
        this.f8066c.unregisterReceiver(this.f8044p);
        this.f8036h = null;
    }

    /* renamed from: e */
    public final void mo9036e() {
        if (this.f8036h == null) {
            this.f8036h = new C9249a(this.f8066c, 1).mo22710a((int) R.string.fc3).mo22718b((int) R.string.fc2).mo22722b(2, (int) R.string.f96, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo22720b();
        }
        if (!this.f8036h.isShowing()) {
            this.f8036h.show();
        }
        if (C7851i.m24074a(this.f8066c)) {
            m10307l();
            return;
        }
        this.f8039k = false;
        m10306k();
        if (!this.f8037i.isShowing()) {
            this.f8037i.show();
        }
    }

    /* renamed from: l */
    private void m10307l() {
        if (!this.f8041m) {
            try {
                if (C7849h.m24059b("control_view") != null && C7849h.m24059b("control_view").mo20554c()) {
                    C7849h.m24059b("control_view").dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) != null && C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20554c()) {
                    C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).dismiss();
                }
            } catch (Throwable unused2) {
            }
            if (this.f8066c != null) {
                if (VERSION.SDK_INT < 17 || !this.f8066c.isDestroyed()) {
                    final C3125r rVar = new C3125r(this.f8066c);
                    this.f8042n = new C3103d(this.f8066c);
                    if (this.f8065b.mo8985h() != null) {
                        this.f8042n.setPresenter(this.f8065b.mo8985h());
                    }
                    C7849h.m24057a(C3358ac.m12528e()).mo20571a((View) rVar).mo20573a("control_view").mo20567a((int) C9738o.m28708b(C3358ac.m12528e(), 220.0f)).mo20576b((int) C9738o.m28708b(C3358ac.m12528e(), 40.0f)).mo20568a(0, 0.1f).mo20577b(1, 0.5f).mo20578c(2).mo20569a(0, 0).mo20570a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).mo20574a(true).mo20572a((C7841e) new C7841e() {
                        /* renamed from: a */
                        public final void mo9047a() {
                            C2466f.this.mo9041j();
                        }

                        /* renamed from: b */
                        public final void mo9049b() {
                            C7843g gVar = (C7843g) C7849h.m24059b("control_view");
                            if (gVar != null) {
                                C3125r rVar = (C3125r) gVar.mo20555d();
                                rVar.mo9946b();
                                float a = ((float) C9738o.m28691a(C3358ac.m12528e())) - C9738o.m28708b(C3358ac.m12528e(), 220.0f);
                                if (rVar.mo9947c() && ((float) gVar.f21170a.mo20548b()) > a) {
                                    gVar.f21170a.mo20544a((int) a);
                                }
                                if (!rVar.mo9947c()) {
                                    C2466f.this.mo9041j();
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void mo9048a(int i, int i2) {
                            float f;
                            if (C2466f.this.f8034f != null) {
                                C2466f.this.f8034f.dispose();
                            }
                            if (rVar.mo9947c()) {
                                f = 220.0f;
                            } else {
                                f = 38.0f;
                            }
                            C2466f.m10304a(1, i, i2, (int) f);
                        }
                    }).mo20575a();
                    C7849h.m24057a(C3358ac.m12528e()).mo20571a((View) this.f8042n).mo20573a(IBroadcastService.TAG_MSG_VIEW).mo20578c(2).mo20567a((int) C9738o.m28708b(C3358ac.m12528e(), 280.0f)).mo20576b((int) C9738o.m28708b(C3358ac.m12528e(), 24.0f)).mo20568a(0, 0.1f).mo20577b(1, 0.1f).mo20569a(0, 0).mo20570a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).mo20572a((C7841e) new C7841e() {
                        /* renamed from: a */
                        public final void mo9047a() {
                        }

                        /* renamed from: b */
                        public final void mo9049b() {
                        }

                        /* renamed from: a */
                        public final void mo9048a(int i, int i2) {
                            C2466f.m10304a(2, i, i2, 0);
                        }
                    }).mo20574a(true).mo20575a();
                    rVar.setOnViewClickListener(new C3130a() {
                        /* renamed from: b */
                        public final void mo9052b() {
                            C2466f.this.f8065b.mo8988k();
                        }

                        /* renamed from: a */
                        public final void mo9050a() {
                            C2466f.this.f8065b.mo8980b(true);
                        }

                        /* renamed from: a */
                        public final void mo9051a(boolean z) {
                            if (z) {
                                C2466f.this.f8065b.mo8986i();
                            } else {
                                C2466f.this.f8065b.mo8987j();
                            }
                        }

                        /* renamed from: b */
                        public final void mo9053b(boolean z) {
                            if (z) {
                                C8946b.f24407af.mo22118a(Integer.valueOf(0));
                                C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20552a();
                                return;
                            }
                            C8946b.f24407af.mo22118a(Integer.valueOf(1));
                            C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20553b();
                        }
                    });
                    this.f8042n.setOnViewClickListener(C2479i.f8060a);
                    this.f8041m = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9031a(C9521a aVar) {
        if (aVar != null && this.f8042n != null) {
            this.f8042n.setPresenter(aVar);
        }
    }

    public final void onEvent(C4452v vVar) {
        if (vVar.f12912a == 27) {
            m10308m();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10305a(boolean z) {
        if (!z) {
            C7843g gVar = (C7843g) C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW);
            if (gVar != null && gVar.mo20554c()) {
                float b = (float) C9738o.m28709b(C3358ac.m12528e());
                if (((float) gVar.mo20562g()) > b - C9738o.m28708b(C3358ac.m12528e(), 220.0f)) {
                    gVar.f21170a.mo20549b((int) (b - C9738o.m28708b(C3358ac.m12528e(), 220.0f)));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9032a(Long l) throws Exception {
        if (this.f8066c != null && C7851i.m24074a(this.f8066c) && (VERSION.SDK_INT < 17 || !this.f8066c.isDestroyed())) {
            boolean z = false;
            if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo10240a()).intValue() != 1 || this.f8036h == null || !this.f8036h.isShowing() || !this.f8043o) {
                if (C7849h.m24059b("control_view") != null) {
                    C7849h.m24059b("control_view").mo20552a();
                    C3125r rVar = (C3125r) C7849h.m24059b("control_view").mo20555d();
                    if (rVar != null) {
                        if (((Integer) C8946b.f24407af.mo22117a()).intValue() != 1) {
                            z = true;
                        }
                        rVar.setMsgBtn(z);
                    }
                    mo9041j();
                }
                if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) != null) {
                    if (((Integer) C8946b.f24407af.mo22117a()).intValue() == 1) {
                        C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20553b();
                        return;
                    }
                    C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).mo20552a();
                }
                return;
            }
            this.f8043o = false;
        }
    }

    public C2466f(Room room, C2501m mVar) {
        super(room, mVar);
        this.f8033e = true;
        this.f8039k = true;
        this.f8043o = true;
        this.f8044p = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
                    C7843g gVar = (C7843g) C7849h.m24059b("control_view");
                    C7843g gVar2 = (C7843g) C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW);
                    int a = C9738o.m28691a(context);
                    int b = C9738o.m28709b(context);
                    if (gVar != null && gVar.mo20554c()) {
                        gVar.f21170a.mo20544a(0);
                        gVar.f21170a.mo20549b((int) (((float) b) * 0.5f));
                    }
                    if (gVar2 != null && gVar2.mo20554c()) {
                        gVar2.f21170a.mo20544a((int) (((float) a) * 0.1f));
                        gVar2.f21170a.mo20549b((int) (((float) b) * 0.1f));
                    }
                }
            }
        };
        this.f8033e = this.f8066c.getIntent().getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
        if (this.f8033e) {
            this.f8066c.setRequestedOrientation(0);
            C3361af.m12534b(this.f8066c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9030a(final C7843g gVar, Long l) throws Exception {
        ValueAnimator ofInt = ObjectAnimator.ofInt(new int[]{0, (int) (-C9738o.m28708b(C3358ac.m12528e(), 20.0f))});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gVar.f21170a.mo20544a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(100).start();
        ofInt.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                ((C3125r) gVar.mo20555d()).mo9945a();
                C2466f.this.f8034f.dispose();
            }
        });
    }

    /* renamed from: a */
    public static void m10304a(int i, int i2, int i3, int i4) {
        String str;
        float f;
        float f2;
        if (i == 1) {
            str = "control_view";
        } else {
            str = IBroadcastService.TAG_MSG_VIEW;
        }
        Context e = C3358ac.m12528e();
        if (i == 1) {
            f = 220.0f;
        } else {
            f = 280.0f;
        }
        int b = (int) C9738o.m28708b(e, f);
        Context e2 = C3358ac.m12528e();
        if (i == 1) {
            f2 = 40.0f;
        } else {
            f2 = 24.0f;
        }
        int b2 = (int) C9738o.m28708b(e2, f2);
        C7843g gVar = (C7843g) C7849h.m24059b(str);
        if (gVar != null && gVar.f21170a != null) {
            int a = C9738o.m28691a(C3358ac.m12528e());
            int b3 = (int) C9738o.m28708b(C3358ac.m12528e(), 46.0f);
            int b4 = C9738o.m28709b(C3358ac.m12528e()) - b2;
            int b5 = (int) (((float) b4) - C9738o.m28708b(C3358ac.m12528e(), 46.0f));
            if (i4 <= 0) {
                i4 = b;
            }
            int i5 = a - i4;
            if (i3 < C9738o.m28717e(C3358ac.m12528e()) * 2) {
                gVar.f21170a.mo20549b(b3);
            }
            if (i3 > b4) {
                gVar.f21170a.mo20549b(b5);
            }
            if (i2 < 0) {
                gVar.f21170a.mo20544a(0);
            }
            if (i2 > i5) {
                gVar.f21170a.mo20544a(i5);
            }
        }
    }
}
