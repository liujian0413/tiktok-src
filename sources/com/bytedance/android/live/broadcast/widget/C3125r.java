package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.floatwindow.ControlButton;
import com.bytedance.android.livesdk.floatwindow.ControlButton.C7835a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.widget.r */
public final class C3125r extends LinearLayout {

    /* renamed from: a */
    public ControlButton f9644a;

    /* renamed from: b */
    public ControlButton f9645b;

    /* renamed from: c */
    public C3130a f9646c;

    /* renamed from: d */
    private ControlButton f9647d;

    /* renamed from: e */
    private ControlButton f9648e;

    /* renamed from: f */
    private LinearLayout f9649f;

    /* renamed from: g */
    private ImageView f9650g;

    /* renamed from: com.bytedance.android.live.broadcast.widget.r$a */
    public interface C3130a {
        /* renamed from: a */
        void mo9050a();

        /* renamed from: a */
        void mo9051a(boolean z);

        /* renamed from: b */
        void mo9052b();

        /* renamed from: b */
        void mo9053b(boolean z);
    }

    private int getLayoutId() {
        return R.layout.ax_;
    }

    /* renamed from: e */
    private void m11846e() {
        this.f9649f.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo9945a() {
        this.f9649f.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo9946b() {
        if (this.f9649f.getVisibility() == 0) {
            mo9945a();
        } else {
            m11846e();
        }
    }

    /* renamed from: c */
    public final boolean mo9947c() {
        if (this.f9649f.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m11845d() {
        inflate(getContext(), getLayoutId(), this);
        this.f9649f = (LinearLayout) findViewById(R.id.a1k);
        this.f9650g = (ImageView) findViewById(R.id.b_a);
        this.f9647d = (ControlButton) findViewById(R.id.r9);
        this.f9647d.mo20530a(R.drawable.c7g, R.drawable.c7g, R.color.as5, R.color.as5, R.string.es9, R.string.es9, false);
        this.f9644a = (ControlButton) findViewById(R.id.qw);
        this.f9644a.mo20530a(R.drawable.c8b, R.drawable.c8c, R.color.as5, R.color.ae2, R.string.es7, R.string.es8, true);
        this.f9645b = (ControlButton) findViewById(R.id.qv);
        this.f9645b.mo20530a(R.drawable.c8_, R.drawable.c8a, R.color.as5, R.color.ae2, R.string.es5, R.string.es6, true);
        this.f9648e = (ControlButton) findViewById(R.id.rd);
        this.f9648e.mo20530a(R.drawable.c_j, R.drawable.c_j, R.color.as5, R.color.as5, R.string.es_, R.string.es_, false);
        this.f9647d.setOnViewClickListener(new C7835a() {
            /* renamed from: a */
            public final void mo9950a() {
                if (C3125r.this.f9646c != null) {
                    C3125r.this.f9646c.mo9050a();
                }
            }
        });
        this.f9644a.setOnViewClickListener(new C7835a() {
            /* renamed from: a */
            public final void mo9950a() {
                if (C3125r.this.f9646c != null) {
                    C3125r.this.f9646c.mo9051a(C3125r.this.f9644a.f21142a);
                }
            }
        });
        this.f9645b.setOnViewClickListener(new C7835a() {
            /* renamed from: a */
            public final void mo9950a() {
                if (C3125r.this.f9646c != null) {
                    C3125r.this.f9646c.mo9053b(C3125r.this.f9645b.f21142a);
                }
            }
        });
        this.f9648e.setOnViewClickListener(new C7835a() {
            /* renamed from: a */
            public final void mo9950a() {
                if (C3125r.this.f9646c != null) {
                    C3125r.this.f9646c.mo9052b();
                }
            }
        });
    }

    public final void setOnViewClickListener(C3130a aVar) {
        this.f9646c = aVar;
    }

    public C3125r(Context context) {
        super(context);
        m11845d();
    }

    public final void setMsgBtn(boolean z) {
        this.f9645b.setChecked(z);
    }
}
