package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p029v7.app.AppCompatDialog;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.C40738a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialog */
public class ViewPagerBottomSheetDialog extends AppCompatDialog {

    /* renamed from: a */
    boolean f105943a = true;

    /* renamed from: b */
    private ViewPagerBottomSheetBehavior<FrameLayout> f105944b;

    /* renamed from: c */
    private boolean f105945c = true;

    /* renamed from: d */
    private boolean f105946d;

    /* renamed from: e */
    private C40738a f105947e = new C40738a() {
        /* renamed from: a */
        public final void mo100964a(View view, int i) {
            if (i == 5) {
                ViewPagerBottomSheetDialog.this.cancel();
            }
        }
    };

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f105944b != null) {
            this.f105944b.mo100955a(4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo100966a() {
        if (!this.f105946d) {
            if (VERSION.SDK_INT < 11) {
                this.f105945c = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.f105945c = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.f105946d = true;
        }
        return this.f105945c;
    }

    public void setContentView(int i) {
        super.setContentView(m130254a(i, null, null));
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
        if (this.f105943a != z) {
            this.f105943a = z;
            if (this.f105944b != null) {
                this.f105944b.f105916d = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f105943a) {
            this.f105943a = true;
        }
        this.f105945c = z;
        this.f105946d = true;
    }

    public void setContentView(View view) {
        super.setContentView(m130254a(0, view, null));
    }

    public ViewPagerBottomSheetDialog(Context context, int i) {
        super(context, m130253a(context, i));
        mo4365b(1);
    }

    /* renamed from: a */
    private static int m130253a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.cz, typedValue, true)) {
            return typedValue.resourceId;
        }
        return R.style.mg;
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m130254a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m130254a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.jn, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.a2v);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.a7r);
        this.f105944b = ViewPagerBottomSheetBehavior.m130222a(frameLayout2);
        this.f105944b.f105923k = this.f105947e;
        this.f105944b.f105916d = this.f105943a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.dn6).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ViewPagerBottomSheetDialog.this.f105943a && ViewPagerBottomSheetDialog.this.isShowing() && ViewPagerBottomSheetDialog.this.mo100966a()) {
                    ViewPagerBottomSheetDialog.this.cancel();
                }
            }
        });
        C0991u.m4187a((View) frameLayout2, (C0939a) new C0939a() {
            /* renamed from: a */
            public final void mo1148a(View view, C0945c cVar) {
                super.mo1148a(view, cVar);
                if (ViewPagerBottomSheetDialog.this.f105943a) {
                    cVar.mo3644a(1048576);
                    cVar.mo3693n(true);
                    return;
                }
                cVar.mo3693n(false);
            }

            /* renamed from: a */
            public final boolean mo1299a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !ViewPagerBottomSheetDialog.this.f105943a) {
                    return super.mo1299a(view, i, bundle);
                }
                ViewPagerBottomSheetDialog.this.cancel();
                return true;
            }
        });
        frameLayout2.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }
}
