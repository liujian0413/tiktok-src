package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController */
public final class NoOperateModeController implements C0042h, C6310a {

    /* renamed from: a */
    public C6309f f85512a = new C6309f(this);

    /* renamed from: b */
    public C32785a f85513b;

    /* renamed from: c */
    public boolean f85514c;

    /* renamed from: d */
    public boolean f85515d;

    /* renamed from: e */
    public final AmeSSActivity f85516e;

    /* renamed from: f */
    private final long f85517f = 3000;

    /* renamed from: g */
    private final long f85518g = 60000;

    /* renamed from: h */
    private final Runnable f85519h = new C32786b(this);

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$a */
    public interface C32785a {
        /* renamed from: d */
        void mo66376d();

        /* renamed from: e */
        void mo66377e();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController$b */
    static final class C32786b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NoOperateModeController f85520a;

        C32786b(NoOperateModeController noOperateModeController) {
            this.f85520a = noOperateModeController;
        }

        public final void run() {
            C32785a aVar = this.f85520a.f85513b;
            if (aVar != null) {
                aVar.mo66376d();
            }
            this.f85520a.f85514c = true;
        }
    }

    public final void handleMsg(Message message) {
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        m106125a();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        mo84298a(this.f85517f);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C6309f fVar = this.f85512a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85519h);
        }
        this.f85512a = null;
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    private void m106125a() {
        C6309f fVar = this.f85512a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85519h);
        }
        if (this.f85514c) {
            C32785a aVar = this.f85513b;
            if (aVar != null) {
                aVar.mo66377e();
            }
            this.f85514c = false;
        }
    }

    /* renamed from: a */
    public final void mo84299a(C32785a aVar) {
        C7573i.m23587b(aVar, "noOperationCallback");
        this.f85513b = aVar;
    }

    /* renamed from: a */
    public final void mo84298a(long j) {
        C6309f fVar = this.f85512a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85519h);
        }
        C6309f fVar2 = this.f85512a;
        if (fVar2 != null) {
            fVar2.postDelayed(this.f85519h, j);
        }
    }

    public NoOperateModeController(AmeSSActivity ameSSActivity) {
        C7573i.m23587b(ameSSActivity, "activity");
        this.f85516e = ameSSActivity;
        this.f85516e.getLifecycle().mo55a(this);
        Lifecycle lifecycle = this.f85516e.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo54a().isAtLeast(State.RESUMED)) {
            mo84298a(this.f85517f);
        }
        C42961az.m136382c(this);
    }

    @C7709l
    public final void onOperateEvent(C32716a aVar) {
        long j;
        C7573i.m23587b(aVar, "event");
        Lifecycle lifecycle = this.f85516e.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo54a().isAtLeast(State.STARTED)) {
            if (aVar.f85293b) {
                this.f85515d = false;
            }
            if (this.f85515d) {
                m106125a();
            } else {
                m106125a();
                if (aVar.f85292a) {
                    j = this.f85518g;
                } else {
                    j = this.f85517f;
                }
                mo84298a(j);
            }
            if (aVar.f85292a) {
                this.f85515d = true;
            }
        }
    }
}
