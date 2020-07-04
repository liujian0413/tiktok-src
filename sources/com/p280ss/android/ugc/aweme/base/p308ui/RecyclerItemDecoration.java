package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.RecyclerItemDecoration */
public class RecyclerItemDecoration extends C1272h {

    /* renamed from: a */
    private static final String f61772a = "RecyclerItemDecoration";

    /* renamed from: b */
    private final int f61773b;

    /* renamed from: c */
    private final int f61774c;

    /* renamed from: d */
    private final int f61775d;

    /* renamed from: e */
    private final Paint f61776e = new Paint();

    /* renamed from: f */
    private int f61777f;

    /* renamed from: g */
    private int f61778g;

    /* renamed from: a */
    public static RecyclerItemDecoration m76865a(Context context) {
        RecyclerItemDecoration recyclerItemDecoration = new RecyclerItemDecoration(1, 1, context.getResources().getColor(R.color.ak));
        recyclerItemDecoration.m76866a(C23486n.m77122a(16.0d), C23486n.m77122a(16.0d));
        return recyclerItemDecoration;
    }

    /* renamed from: a */
    private void m76866a(int i, int i2) {
        this.f61777f = i;
        this.f61778g = i2;
    }

    /* renamed from: a */
    private void m76867a(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft() + this.f61777f;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f61778g;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f61775d + bottom), this.f61776e);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m76868b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int height = childAt.getHeight() - recyclerView.getPaddingBottom();
                int right = childAt.getRight() + ((LayoutParams) childAt.getLayoutParams()).rightMargin;
                canvas.drawRect((float) right, (float) paddingTop, (float) (this.f61775d + right), (float) height, this.f61776e);
                i++;
            } else {
                return;
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        if (this.f61773b == 1) {
            m76867a(canvas, recyclerView);
        } else {
            m76868b(canvas, recyclerView);
        }
    }

    public RecyclerItemDecoration(int i, int i2, int i3) {
        this.f61776e.setAntiAlias(true);
        this.f61776e.setColor(i3);
        this.f61773b = i;
        this.f61774c = i2;
        this.f61775d = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        C1273i layoutManager = recyclerView.getLayoutManager();
        int b = sVar.mo5870b();
        int g = RecyclerView.m5893g(view);
        if (g != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.f61773b == 1) {
                if (g == b) {
                    rect.set(0, 0, 0, 0);
                } else {
                    rect.set(0, 0, 0, this.f61774c);
                }
            } else if (g == b) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, this.f61774c, 0);
            }
        }
    }
}
