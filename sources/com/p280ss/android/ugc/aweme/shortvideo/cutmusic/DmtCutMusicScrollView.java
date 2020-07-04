package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView */
public final class DmtCutMusicScrollView extends RecyclerView {

    /* renamed from: M */
    public AVCutMusicView f102060M;

    /* renamed from: N */
    public C39297a f102061N;

    /* renamed from: O */
    public boolean f102062O;

    /* renamed from: P */
    public boolean f102063P;

    /* renamed from: Q */
    private C1262a<?> f102064Q;

    /* renamed from: R */
    private float f102065R;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$SelfViewHolder */
    public static final class SelfViewHolder extends C1293v {
        public SelfViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$a */
    public interface C39297a {
        /* renamed from: a */
        void mo97840a(float f);

        /* renamed from: b */
        void mo97841b(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView$b */
    static final class C39298b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmtCutMusicScrollView f102066a;

        /* renamed from: b */
        final /* synthetic */ float f102067b;

        C39298b(DmtCutMusicScrollView dmtCutMusicScrollView, float f) {
            this.f102066a = dmtCutMusicScrollView;
            this.f102067b = f;
        }

        public final void run() {
            this.f102066a.scrollBy((int) (((float) DmtCutMusicScrollView.m125571a(this.f102066a).getViewWidth()) * this.f102067b), 0);
        }
    }

    public final float getScrollDx() {
        return this.f102065R;
    }

    public final void setScrollDx(float f) {
        this.f102065R = f;
    }

    public final void setScrollListener(C39297a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f102061N = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ AVCutMusicView m125571a(DmtCutMusicScrollView dmtCutMusicScrollView) {
        AVCutMusicView aVCutMusicView = dmtCutMusicScrollView.f102060M;
        if (aVCutMusicView == null) {
            C7573i.m23583a("cutMusicView");
        }
        return aVCutMusicView;
    }

    public final void setWaveColor(int i) {
        AVCutMusicView aVCutMusicView = this.f102060M;
        if (aVCutMusicView == null) {
            C7573i.m23583a("cutMusicView");
        }
        aVCutMusicView.setColor(i);
    }

    /* renamed from: a */
    public final void mo97833a(float f) {
        post(new C39298b(this, f));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "e");
        if (motionEvent.getAction() == 1) {
            this.f102062O = true;
        } else if (motionEvent.getAction() == 0) {
            this.f102063P = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            AVCutMusicView aVCutMusicView = this.f102060M;
            if (aVCutMusicView == null) {
                C7573i.m23583a("cutMusicView");
            }
            aVCutMusicView.setAudioWaveViewData(aVMusicWaveBean);
            C1262a<?> aVar = this.f102064Q;
            if (aVar == null) {
                C7573i.m23583a("adatper");
            }
            setAdapter(aVar);
        }
    }

    /* renamed from: a */
    private final void m125572a(Context context) {
        this.f102060M = new AVCutMusicView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.mo5427b(0);
        linearLayoutManager.mo5428b(C43127fh.m136806a(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.f102064Q = new DmtCutMusicScrollView$init$1(this);
        mo5528a((C1281m) new DmtCutMusicScrollView$init$2(this));
    }

    /* renamed from: a */
    public final void mo97834a(float f, boolean z) {
        int i;
        AVCutMusicView aVCutMusicView = this.f102060M;
        if (aVCutMusicView == null) {
            C7573i.m23583a("cutMusicView");
        }
        if (z) {
            i = (int) this.f102065R;
        } else {
            i = 0;
        }
        aVCutMusicView.mo97803a(i, f);
    }

    public DmtCutMusicScrollView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m125572a(context);
    }

    public /* synthetic */ DmtCutMusicScrollView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
