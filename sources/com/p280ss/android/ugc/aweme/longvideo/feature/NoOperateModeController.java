package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController */
public final class NoOperateModeController implements C0042h, C6310a {

    /* renamed from: a */
    public C6309f f85338a = new C6309f(this);

    /* renamed from: b */
    public C32736a f85339b;

    /* renamed from: c */
    public boolean f85340c;

    /* renamed from: d */
    public boolean f85341d;

    /* renamed from: e */
    public final FragmentActivity f85342e;

    /* renamed from: f */
    public final View f85343f;

    /* renamed from: g */
    private final long f85344g = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: h */
    private final long f85345h = 60000;

    /* renamed from: i */
    private final Runnable f85346i = new C32737b(this);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController$a */
    public interface C32736a {
        /* renamed from: n */
        void mo64980n();

        /* renamed from: o */
        void mo64981o();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController$b */
    static final class C32737b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NoOperateModeController f85347a;

        C32737b(NoOperateModeController noOperateModeController) {
            this.f85347a = noOperateModeController;
        }

        public final void run() {
            C32736a aVar = this.f85347a.f85339b;
            if (aVar != null) {
                aVar.mo64980n();
            }
            this.f85347a.f85340c = true;
        }
    }

    public final void handleMsg(Message message) {
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        mo84215a();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        mo84216a(this.f85344g);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C6309f fVar = this.f85338a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85346i);
        }
        this.f85338a = null;
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo84215a() {
        C6309f fVar = this.f85338a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85346i);
        }
        if (this.f85340c) {
            C32736a aVar = this.f85339b;
            if (aVar != null) {
                aVar.mo64981o();
            }
            this.f85340c = false;
        }
    }

    /* renamed from: a */
    public final void mo84217a(C32736a aVar) {
        C7573i.m23587b(aVar, "noOperationCallback");
        this.f85339b = aVar;
    }

    /* renamed from: a */
    public final void mo84216a(long j) {
        C6309f fVar = this.f85338a;
        if (fVar != null) {
            fVar.removeCallbacks(this.f85346i);
        }
        C6309f fVar2 = this.f85338a;
        if (fVar2 != null) {
            fVar2.postDelayed(this.f85346i, j);
        }
    }

    @C7709l
    public final void onOperateEvent(C32716a aVar) {
        long j;
        C7573i.m23587b(aVar, "event");
        Lifecycle lifecycle = this.f85342e.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo54a().isAtLeast(State.STARTED)) {
            if (aVar.f85293b) {
                this.f85341d = false;
            }
            if (this.f85341d) {
                mo84215a();
            } else {
                mo84215a();
                if (aVar.f85292a) {
                    j = this.f85345h;
                } else {
                    j = this.f85344g;
                }
                mo84216a(j);
            }
            if (aVar.f85292a) {
                this.f85341d = true;
            }
        }
    }

    public NoOperateModeController(FragmentActivity fragmentActivity, View view) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(view, "rootView");
        this.f85342e = fragmentActivity;
        this.f85343f = view;
        this.f85342e.getLifecycle().mo55a(this);
        Lifecycle lifecycle = this.f85342e.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "activity.lifecycle");
        if (lifecycle.mo54a().isAtLeast(State.RESUMED)) {
            mo84216a(this.f85344g);
        }
        C42961az.m136382c(this);
    }
}
