package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior.C0343a;
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
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BottomSheetDialog extends AppCompatDialog {

    /* renamed from: a */
    boolean f1369a = true;

    /* renamed from: b */
    private BottomSheetBehavior<FrameLayout> f1370b;

    /* renamed from: c */
    private boolean f1371c = true;

    /* renamed from: d */
    private boolean f1372d;

    /* renamed from: e */
    private C0343a f1373e = new C0343a() {
        /* renamed from: a */
        public final void mo1372a(View view, float f) {
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    };

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f1370b != null && this.f1370b.f1342h == 5) {
            this.f1370b.mo1357b(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1375a() {
        if (!this.f1372d) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f1371c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f1372d = true;
        }
        return this.f1371c;
    }

    public void setContentView(int i) {
        super.setContentView(m1403a(i, null, null));
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
        if (this.f1369a != z) {
            this.f1369a = z;
            if (this.f1370b != null) {
                this.f1370b.f1340f = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f1369a) {
            this.f1369a = true;
        }
        this.f1371c = z;
        this.f1372d = true;
    }

    public void setContentView(View view) {
        super.setContentView(m1403a(0, view, null));
    }

    public BottomSheetDialog(Context context, int i) {
        super(context, m1402a(context, i));
        mo4365b(1);
    }

    /* renamed from: a */
    private static int m1402a(Context context, int i) {
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
        super.setContentView(m1403a(0, view, layoutParams));
    }

    /* renamed from: a */
    private View m1403a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.ja, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.a2v);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.a7r);
        this.f1370b = BottomSheetBehavior.m1365a(frameLayout2);
        this.f1370b.f1347m = this.f1373e;
        this.f1370b.f1340f = this.f1369a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.dn6).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (BottomSheetDialog.this.f1369a && BottomSheetDialog.this.isShowing() && BottomSheetDialog.this.mo1375a()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        C0991u.m4187a((View) frameLayout2, (C0939a) new C0939a() {
            /* renamed from: a */
            public final void mo1148a(View view, C0945c cVar) {
                super.mo1148a(view, cVar);
                if (BottomSheetDialog.this.f1369a) {
                    cVar.mo3644a(1048576);
                    cVar.mo3693n(true);
                    return;
                }
                cVar.mo3693n(false);
            }

            /* renamed from: a */
            public final boolean mo1299a(View view, int i, Bundle bundle) {
                if (i != 1048576 || !BottomSheetDialog.this.f1369a) {
                    return super.mo1299a(view, i, bundle);
                }
                BottomSheetDialog.this.cancel();
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
