package dmt.p1861av.video;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnWindowFocusChangeListener;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.VEException;

/* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter */
public final class VEEditorAutoStartStopArbiter implements C0042h {

    /* renamed from: a */
    public boolean f121596a;

    /* renamed from: b */
    public boolean f121597b;

    /* renamed from: c */
    public boolean f121598c;

    /* renamed from: d */
    private Context f121599d;

    /* renamed from: e */
    private BroadcastReceiver f121600e = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !VEEditorAutoStartStopArbiter.this.f121597b && !VEEditorAutoStartStopArbiter.this.f121598c) {
                VEEditorAutoStartStopArbiter.this.mo119464a();
            }
        }
    };

    /* renamed from: f */
    private C15389d f121601f;

    /* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter$a */
    public interface C47383a {
        /* renamed from: d */
        void mo102210d();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f121599d.unregisterReceiver(this.f121600e);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        if (!this.f121597b && !this.f121598c) {
            mo119464a();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        if (!this.f121597b && !this.f121598c) {
            mo119467b();
        }
    }

    /* renamed from: a */
    public final void mo119464a() {
        if (!this.f121596a) {
            try {
                if (this.f121601f.mo38850h() != VEState.PAUSED) {
                    this.f121601f.mo38880w();
                }
            } catch (VEException e) {
                if (e.getRetCd() != -105) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo119467b() {
        if (!this.f121596a) {
            try {
                if (this.f121601f.mo38850h() != VEState.STARTED) {
                    this.f121601f.mo38879v();
                }
            } catch (Exception e) {
                C41530am.m132283b(e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo119465a(boolean z) {
        mo119466a(z, false);
    }

    /* renamed from: a */
    public final void mo119466a(boolean z, boolean z2) {
        if (this.f121596a != z) {
            if (this.f121596a) {
                if (!z2) {
                    this.f121601f.mo38879v();
                }
                if (this.f121599d instanceof C47383a) {
                    ((C47383a) this.f121599d).mo102210d();
                }
            } else {
                this.f121601f.mo38880w();
            }
            this.f121596a = z;
        }
    }

    public VEEditorAutoStartStopArbiter(Context context, final C0043i iVar, C15389d dVar, SurfaceView surfaceView) {
        this.f121599d = context;
        this.f121601f = dVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (VERSION.SDK_INT >= 18) {
            ((ViewGroup) surfaceView.getParent()).getViewTreeObserver().addOnWindowFocusChangeListener(new OnWindowFocusChangeListener() {
                public final void onWindowFocusChanged(boolean z) {
                    if (z && iVar.getLifecycle().mo54a().isAtLeast(State.RESUMED) && !VEEditorAutoStartStopArbiter.this.f121597b) {
                        VEEditorAutoStartStopArbiter.this.mo119467b();
                    }
                }
            });
        }
        this.f121599d.registerReceiver(this.f121600e, intentFilter);
        surfaceView.getHolder().addCallback(new Callback2() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        iVar.getLifecycle().mo55a(this);
    }
}
