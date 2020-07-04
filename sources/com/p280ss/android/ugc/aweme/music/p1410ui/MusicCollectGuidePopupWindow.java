package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow */
public final class MusicCollectGuidePopupWindow extends PopupWindow implements C0042h {

    /* renamed from: a */
    private final Runnable f88257a;

    /* renamed from: b */
    private final int f88258b;

    /* renamed from: c */
    private final int f88259c;

    /* renamed from: d */
    private final DmtTextView f88260d;

    /* renamed from: e */
    private final FrameLayout f88261e;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicCollectGuidePopupWindow$a */
    static final class C33841a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MusicCollectGuidePopupWindow f88262a;

        C33841a(MusicCollectGuidePopupWindow musicCollectGuidePopupWindow) {
            this.f88262a = musicCollectGuidePopupWindow;
        }

        public final void run() {
            this.f88262a.dismiss();
        }
    }

    public MusicCollectGuidePopupWindow(Context context) {
        this(context, 0, 2, null);
    }

    /* renamed from: a */
    public final void mo86474a(View view) {
        m109054a(view, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    public final void dismiss() {
        if (isShowing()) {
            C33962g.m109428a(this);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f88257a);
    }

    /* renamed from: a */
    private void m109053a(long j) {
        getContentView().removeCallbacks(this.f88257a);
        getContentView().postDelayed(this.f88257a, j);
    }

    /* renamed from: a */
    public final void mo86473a(int i, int i2) {
        if (i > C23486n.m77122a(44.0d)) {
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m109054a(View view, long j) {
        if (view != null) {
            if (VERSION.SDK_INT >= 19) {
                showAsDropDown(view, (view.getWidth() - this.f88258b) / 2, -(view.getHeight() + this.f88259c), 51);
            } else {
                showAsDropDown(view, (view.getWidth() - this.f88258b) / 2, -(view.getHeight() + this.f88259c));
            }
            m109053a(j);
        }
    }

    private MusicCollectGuidePopupWindow(Context context, int i) {
        C7573i.m23587b(context, "context");
        this.f88257a = new C33841a(this);
        View inflate = LayoutInflater.from(context).inflate(i, null);
        View findViewById = inflate.findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f88260d = (DmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.amt);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f88261e = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.gd);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C7573i.m23582a((Object) inflate, "view");
        this.f88259c = inflate.getMeasuredHeight();
        this.f88258b = inflate.getMeasuredWidth();
    }

    private /* synthetic */ MusicCollectGuidePopupWindow(Context context, int i, int i2, C7571f fVar) {
        this(context, R.layout.agn);
    }
}
