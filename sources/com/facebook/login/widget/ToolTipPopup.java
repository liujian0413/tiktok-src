package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

public final class ToolTipPopup {

    /* renamed from: a */
    public final WeakReference<View> f37281a;

    /* renamed from: b */
    public C14115a f37282b;

    /* renamed from: c */
    public PopupWindow f37283c;

    /* renamed from: d */
    public Style f37284d = Style.BLUE;

    /* renamed from: e */
    public long f37285e = 6000;

    /* renamed from: f */
    private final String f37286f;

    /* renamed from: g */
    private final Context f37287g;

    /* renamed from: h */
    private final OnScrollChangedListener f37288h = new OnScrollChangedListener() {
        public final void onScrollChanged() {
            if (!(ToolTipPopup.this.f37281a.get() == null || ToolTipPopup.this.f37283c == null || !ToolTipPopup.this.f37283c.isShowing())) {
                if (ToolTipPopup.this.f37283c.isAboveAnchor()) {
                    ToolTipPopup.this.f37282b.mo33877b();
                    return;
                }
                ToolTipPopup.this.f37282b.mo33876a();
            }
        }
    };

    public enum Style {
        BLUE,
        BLACK
    }

    /* renamed from: com.facebook.login.widget.ToolTipPopup$a */
    class C14115a extends FrameLayout {

        /* renamed from: a */
        public ImageView f37292a;

        /* renamed from: b */
        public ImageView f37293b;

        /* renamed from: c */
        public View f37294c;

        /* renamed from: d */
        public ImageView f37295d;

        /* renamed from: a */
        public final void mo33876a() {
            this.f37292a.setVisibility(0);
            this.f37293b.setVisibility(4);
        }

        /* renamed from: b */
        public final void mo33877b() {
            this.f37292a.setVisibility(4);
            this.f37293b.setVisibility(0);
        }

        /* renamed from: c */
        private void m41682c() {
            LayoutInflater.from(getContext()).inflate(R.layout.ij, this);
            this.f37292a = (ImageView) findViewById(R.id.yj);
            this.f37293b = (ImageView) findViewById(R.id.yh);
            this.f37294c = findViewById(R.id.ya);
            this.f37295d = (ImageView) findViewById(R.id.yb);
        }

        public C14115a(Context context) {
            super(context);
            m41682c();
        }
    }

    public final void dismiss() {
        m41680d();
        if (this.f37283c != null) {
            C14116a.m41685a(this.f37283c);
        }
    }

    /* renamed from: b */
    private void m41678b() {
        if (this.f37283c != null && this.f37283c.isShowing()) {
            if (this.f37283c.isAboveAnchor()) {
                this.f37282b.mo33877b();
                return;
            }
            this.f37282b.mo33876a();
        }
    }

    /* renamed from: c */
    private void m41679c() {
        m41680d();
        if (this.f37281a.get() != null) {
            ((View) this.f37281a.get()).getViewTreeObserver().addOnScrollChangedListener(this.f37288h);
        }
    }

    /* renamed from: d */
    private void m41680d() {
        if (this.f37281a.get() != null) {
            ((View) this.f37281a.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f37288h);
        }
    }

    /* renamed from: a */
    public final void mo33871a() {
        if (this.f37281a.get() != null) {
            this.f37282b = new C14115a(this.f37287g);
            ((TextView) this.f37282b.findViewById(R.id.yi)).setText(this.f37286f);
            if (this.f37284d == Style.BLUE) {
                this.f37282b.f37294c.setBackgroundResource(R.drawable.xc);
                this.f37282b.f37293b.setImageResource(R.drawable.xd);
                this.f37282b.f37292a.setImageResource(R.drawable.xe);
                this.f37282b.f37295d.setImageResource(R.drawable.xf);
            } else {
                this.f37282b.f37294c.setBackgroundResource(R.drawable.x9);
                this.f37282b.f37293b.setImageResource(R.drawable.x_);
                this.f37282b.f37292a.setImageResource(R.drawable.xa);
                this.f37282b.f37295d.setImageResource(R.drawable.xb);
            }
            View decorView = ((Activity) this.f37287g).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            m41679c();
            this.f37282b.measure(MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            this.f37283c = new PopupWindow(this.f37282b, this.f37282b.getMeasuredWidth(), this.f37282b.getMeasuredHeight());
            this.f37283c.showAsDropDown((View) this.f37281a.get());
            m41678b();
            if (this.f37285e > 0) {
                this.f37282b.postDelayed(new Runnable() {
                    public final void run() {
                        ToolTipPopup.this.dismiss();
                    }
                }, this.f37285e);
            }
            this.f37283c.setTouchable(true);
            this.f37282b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ToolTipPopup.this.dismiss();
                }
            });
        }
    }

    public ToolTipPopup(String str, View view) {
        this.f37286f = str;
        this.f37281a = new WeakReference<>(view);
        this.f37287g = view.getContext();
    }
}
