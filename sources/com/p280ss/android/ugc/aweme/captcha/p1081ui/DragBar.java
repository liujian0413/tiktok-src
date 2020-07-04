package com.p280ss.android.ugc.aweme.captcha.p1081ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.captcha.ui.DragBar */
public class DragBar extends FrameLayout {

    /* renamed from: a */
    public C23656a f62365a;

    /* renamed from: b */
    public ImageView f62366b;

    /* renamed from: c */
    public boolean f62367c = true;

    /* renamed from: d */
    public boolean f62368d;

    /* renamed from: com.ss.android.ugc.aweme.captcha.ui.DragBar$a */
    public interface C23656a {
        /* renamed from: a */
        void mo61561a();

        /* renamed from: a */
        void mo61562a(float f);

        /* renamed from: b */
        void mo61563b(float f);
    }

    /* renamed from: a */
    public final void mo61567a() {
        setDragViewTranslationX(0.0f);
        this.f62368d = false;
    }

    public void setCanDragged(boolean z) {
        this.f62367c = z;
    }

    public void setOnDragListener(C23656a aVar) {
        this.f62365a = aVar;
    }

    public DragBar(Context context) {
        super(context);
        m77573a(context);
    }

    /* renamed from: a */
    private void m77573a(Context context) {
        this.f62366b = (ImageView) LayoutInflater.from(context).inflate(R.layout.b35, this, true).findViewById(R.id.b8o);
        this.f62366b.setOnTouchListener(new OnTouchListener() {

            /* renamed from: a */
            float f62369a;

            /* renamed from: b */
            float f62370b;

            /* renamed from: c */
            float f62371c;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!DragBar.this.f62367c) {
                    return false;
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        if (DragBar.this.f62365a != null) {
                            DragBar.this.f62365a.mo61561a();
                        }
                        this.f62369a = motionEvent.getRawX();
                        this.f62370b = 0.0f;
                        return true;
                    case 1:
                        DragBar.this.setCanDragged(false);
                        if (DragBar.this.f62365a != null && !DragBar.this.f62368d) {
                            DragBar.this.f62368d = true;
                            int measuredWidth = DragBar.this.getMeasuredWidth() - DragBar.this.f62366b.getMeasuredWidth();
                            this.f62370b = Math.max(this.f62370b, 0.0f);
                            float f = (float) measuredWidth;
                            this.f62370b = Math.min(this.f62370b, f);
                            DragBar.this.f62366b.setTranslationX(this.f62370b);
                            if (measuredWidth != 0) {
                                DragBar.this.f62365a.mo61563b(this.f62370b / f);
                            }
                        }
                        this.f62369a = 0.0f;
                        this.f62370b = 0.0f;
                        return true;
                    case 2:
                        this.f62370b = motionEvent.getRawX() - this.f62369a;
                        DragBar.this.setDragViewTranslationX(this.f62370b);
                        this.f62371c = this.f62370b;
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    public void setDragViewTranslationX(float f) {
        int measuredWidth = getMeasuredWidth() - this.f62366b.getMeasuredWidth();
        float f2 = (float) measuredWidth;
        float min = Math.min(Math.max(f, 0.0f), f2);
        this.f62366b.setTranslationX(min);
        if (this.f62365a != null && measuredWidth != 0) {
            this.f62365a.mo61562a(min / f2);
        }
    }

    public DragBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m77573a(context);
    }

    public DragBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77573a(context);
    }
}
