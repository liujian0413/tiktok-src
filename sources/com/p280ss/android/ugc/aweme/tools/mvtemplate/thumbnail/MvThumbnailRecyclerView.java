package com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.Producer;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.SelectState;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView */
public final class MvThumbnailRecyclerView extends RecyclerView {

    /* renamed from: M */
    private final int f110626M;

    /* renamed from: N */
    private int f110627N;

    public MvThumbnailRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo104131a(int i, float f) {
        mo104132a(i, f, false);
    }

    public final int getMScrollX() {
        return this.f110627N;
    }

    public final int getCurrentPosition() {
        return this.f110627N / this.f110626M;
    }

    public final float getOffset() {
        return (((float) this.f110627N) % ((float) this.f110626M)) / ((float) this.f110626M);
    }

    /* renamed from: n */
    public final void mo61102n() {
        int i = this.f110627N % this.f110626M;
        if (i <= this.f110626M / 2) {
            mo5521a(-i, 0);
        } else {
            mo5521a(this.f110626M - i, 0);
        }
    }

    public final void setMScrollX(int i) {
        this.f110627N = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            MvTemplateSelectEvent mvTemplateSelectEvent = new MvTemplateSelectEvent(SelectState.START, Producer.ICON_LIST, 0, 0.0f, 12, null);
            C42961az.m136380a(mvTemplateSelectEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f110626M = C42556a.m135231a(context);
        if (VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        mo5528a((C1281m) new C1281m(this) {

            /* renamed from: a */
            final /* synthetic */ MvThumbnailRecyclerView f110628a;

            {
                this.f110628a = r1;
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                C7573i.m23587b(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    this.f110628a.mo61102n();
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C7573i.m23587b(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f110628a;
                mvThumbnailRecyclerView.setMScrollX(mvThumbnailRecyclerView.getMScrollX() + i);
                C42961az.m136380a(new MvTemplateSelectEvent(SelectState.SCROLL, Producer.ICON_LIST, this.f110628a.getCurrentPosition(), this.f110628a.getOffset()));
            }
        });
    }

    /* renamed from: a */
    public final void mo104132a(int i, float f, boolean z) {
        if (f > 0.99f) {
            f = 1.0f;
        }
        float f2 = ((((float) i) + f) * ((float) this.f110626M)) - ((float) this.f110627N);
        if (z) {
            mo5521a((int) f2, 0);
        } else {
            scrollBy((int) f2, 0);
        }
    }

    public /* synthetic */ MvThumbnailRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
