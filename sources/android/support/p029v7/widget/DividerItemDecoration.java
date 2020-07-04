package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: android.support.v7.widget.DividerItemDecoration */
public class DividerItemDecoration extends C1272h {

    /* renamed from: a */
    private static final int[] f4709a = {16843284};

    /* renamed from: b */
    private Drawable f4710b;

    /* renamed from: c */
    private int f4711c;

    /* renamed from: d */
    private final Rect f4712d = new Rect();

    /* renamed from: a */
    public final void mo5355a(Drawable drawable) {
        if (drawable != null) {
            this.f4710b = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: a */
    private void m5614a(int i) {
        if (i == 0 || i == 1) {
            this.f4711c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public DividerItemDecoration(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4709a);
        this.f4710b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        m5614a(i);
    }

    /* renamed from: a */
    private void m5615a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f4712d);
            int round = this.f4712d.bottom + Math.round(childAt.getTranslationY());
            this.f4710b.setBounds(i2, round - this.f4710b.getIntrinsicHeight(), i, round);
            this.f4710b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m5616b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager();
            C1273i.m6053a(childAt, this.f4712d);
            int round = this.f4712d.right + Math.round(childAt.getTranslationX());
            this.f4710b.setBounds(round - this.f4710b.getIntrinsicWidth(), i2, round, i);
            this.f4710b.draw(canvas);
        }
        canvas.restore();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.getLayoutManager() != null && this.f4710b != null) {
            if (this.f4711c == 1) {
                m5615a(canvas, recyclerView);
            } else {
                m5616b(canvas, recyclerView);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (this.f4710b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4711c == 1) {
            rect.set(0, 0, 0, this.f4710b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f4710b.getIntrinsicWidth(), 0);
        }
    }
}
