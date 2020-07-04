package com.p280ss.android.ugc.aweme.p1044av.widget;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.av.widget.CompatBottomSheetDialog */
public class CompatBottomSheetDialog extends BottomSheetDialog {

    /* renamed from: b */
    boolean f61023b;

    /* renamed from: c */
    private BottomSheetBehavior<FrameLayout> f61024c;

    /* renamed from: d */
    private boolean f61025d;

    /* renamed from: e */
    private boolean f61026e;

    /* renamed from: f */
    private C0343a f61027f;

    public void onStart() {
        super.onStart();
        if (this.f61024c != null) {
            this.f61024c.mo1357b(4);
        }
    }

    /* renamed from: a */
    public final boolean mo1375a() {
        if (!this.f61026e) {
            if (VERSION.SDK_INT < 11) {
                this.f61025d = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.f61025d = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.f61026e = true;
        }
        return this.f61025d;
    }

    public void setContentView(int i) {
        mo4364b().mo4292a(m75950a(i, null, null));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f61023b != z) {
            this.f61023b = z;
            if (this.f61024c != null) {
                this.f61024c.f1340f = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f61023b) {
            this.f61023b = true;
        }
        this.f61025d = z;
        this.f61026e = true;
    }

    public void setContentView(View view) {
        mo4364b().mo4292a(m75950a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo4364b().mo4292a(m75950a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m75950a(int i, View view, LayoutParams layoutParams) {
        View inflate = View.inflate(getContext(), R.layout.hs, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.a2v);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(R.id.a7r);
        this.f61024c = BottomSheetBehavior.m1365a(frameLayout);
        this.f61024c.f1347m = this.f61027f;
        this.f61024c.f1340f = this.f61023b;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.dn6).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (CompatBottomSheetDialog.this.f61023b && CompatBottomSheetDialog.this.isShowing() && CompatBottomSheetDialog.this.mo1375a()) {
                    CompatBottomSheetDialog.this.cancel();
                }
            }
        });
        C0991u.m4187a((View) frameLayout, (C0939a) new C0939a() {
            /* renamed from: a */
            public final void mo1148a(View view, C0945c cVar) {
                super.mo1148a(view, cVar);
                if (CompatBottomSheetDialog.this.f61023b) {
                    cVar.mo3644a(1048576);
                    cVar.mo3693n(true);
                    return;
                }
                cVar.mo3693n(false);
            }

            /* renamed from: a */
            public final boolean mo1299a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !CompatBottomSheetDialog.this.f61023b) {
                    return super.mo1299a(view, i, bundle);
                }
                CompatBottomSheetDialog.this.cancel();
                return true;
            }
        });
        frameLayout.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return inflate;
    }
}
