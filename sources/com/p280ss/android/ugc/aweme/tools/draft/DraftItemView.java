package com.p280ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Scroller;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43127fh;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView */
public class DraftItemView extends LinearLayout {

    /* renamed from: a */
    private Scroller f110018a;

    /* renamed from: b */
    private View f110019b;

    /* renamed from: c */
    private int f110020c;

    /* renamed from: d */
    private boolean f110021d;

    /* renamed from: e */
    private C42273a f110022e;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView$a */
    public interface C42273a {
        /* renamed from: a */
        void mo103735a(int i, boolean z);
    }

    /* renamed from: a */
    public final void mo103752a() {
        if (!this.f110021d) {
            this.f110021d = true;
            this.f110018a.startScroll(0, 0, -this.f110020c, 0, C34943c.f91127w);
            if (this.f110022e != null) {
                this.f110022e.mo103735a(this.f110020c, this.f110021d);
            }
        }
    }

    /* renamed from: b */
    public final void mo103753b() {
        if (this.f110021d) {
            this.f110021d = false;
            this.f110018a.startScroll(-this.f110020c, 0, this.f110020c, 0, C34943c.f91127w);
            if (this.f110022e != null) {
                this.f110022e.mo103735a(this.f110020c, this.f110021d);
            }
        }
    }

    public void computeScroll() {
        if (this.f110018a.computeScrollOffset()) {
            scrollTo(this.f110018a.getCurrX(), this.f110018a.getCurrY());
            if (this.f110022e != null) {
                this.f110018a.getCurrX();
                this.f110018a.getCurrY();
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f110019b = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) this.f110019b.getLayoutParams();
        this.f110020c = layoutParams.width + (layoutParams.rightMargin * 2);
        if (C43127fh.m136806a(getContext())) {
            this.f110020c = -this.f110020c;
        }
    }

    public void setOnScrollListener(C42273a aVar) {
        this.f110022e = aVar;
    }

    public DraftItemView(Context context) {
        this(context, null);
    }

    public DraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110018a = new Scroller(context);
    }
}
