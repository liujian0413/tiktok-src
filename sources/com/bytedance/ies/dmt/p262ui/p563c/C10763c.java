package com.bytedance.ies.dmt.p262ui.p563c;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.facebook.ads.AdError;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.c.c */
public final class C10763c extends PopupWindow {

    /* renamed from: e */
    private static int f28869e;

    /* renamed from: a */
    public RelativeLayout f28870a;

    /* renamed from: b */
    private Context f28871b;

    /* renamed from: c */
    private ImageView f28872c;

    /* renamed from: d */
    private TextView f28873d;

    /* renamed from: f */
    private int f28874f;

    /* renamed from: g */
    private int f28875g;

    /* renamed from: h */
    private View f28876h;

    /* renamed from: c */
    private boolean m31429c() {
        if (this.f28875g == 1) {
            return true;
        }
        return false;
    }

    public final void dismiss() {
        try {
            C10768d.m31435a((PopupWindow) this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m31428b() {
        if (this.f28871b == null || !(this.f28871b instanceof Activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m31421a() {
        this.f28876h = ((LayoutInflater) this.f28871b.getSystemService("layout_inflater")).inflate(R.layout.abm, null);
        if (m31428b()) {
            m31426b(this.f28876h);
        }
        m31423a(this.f28876h);
    }

    /* renamed from: d */
    private void m31430d() {
        int i;
        try {
            if (this.f28871b != null && !isShowing()) {
                this.f28870a.setAlpha(0.0f);
                View decorView = ((Activity) this.f28871b).getWindow().getDecorView();
                if (m31429c()) {
                    i = f28869e;
                } else {
                    i = (int) C9738o.m28708b(this.f28871b, 35.0f);
                }
                showAtLocation(decorView, 48, 0, i + C9738o.m28717e(this.f28871b));
                mo25752a(true);
                int i2 = AdError.SERVER_ERROR_CODE;
                if (this.f28874f == 0) {
                    i2 = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        C10763c.this.mo25752a(false);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                C10763c.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C10763c m31420a(Context context) {
        return new C10763c(context);
    }

    private C10763c(Context context) {
        super(context);
        this.f28871b = context;
        m31421a();
    }

    /* renamed from: a */
    private void m31422a(int i) {
        f28869e = ((int) C9738o.m28708b(this.f28871b, 52.0f)) + i;
    }

    /* renamed from: b */
    private void m31427b(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                float f;
                final int height = C10763c.this.f28870a.getHeight();
                if (z) {
                    i = 250;
                } else {
                    i = NormalGiftView.MASK_TRANSLATE_VALUE;
                }
                RelativeLayout relativeLayout = C10763c.this.f28870a;
                String str = "alpha";
                float[] fArr = new float[2];
                float f2 = 1.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (!z) {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, str, fArr);
                ofFloat.setDuration((long) i);
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (z) {
                            i = (int) (-(((float) height) - (((float) height) * animatedFraction)));
                        } else {
                            i = -((int) (((float) height) * animatedFraction));
                        }
                        C10763c.this.f28870a.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new C10744c());
                ofFloat.start();
            }
        }, 5);
    }

    /* renamed from: a */
    public final void mo25752a(boolean z) {
        m31427b(z);
    }

    /* renamed from: b */
    private void m31426b(View view) {
        setContentView(view);
        setWidth(C9738o.m28691a(this.f28871b));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(this.f28871b.getResources().getColor(R.color.ayd)));
        setFocusable(false);
        setOutsideTouchable(true);
        setTouchable(false);
        setAnimationStyle(R.style.sw);
        update();
    }

    /* renamed from: a */
    private void m31423a(View view) {
        if (view != null) {
            this.f28870a = (RelativeLayout) view.findViewById(R.id.cuw);
            this.f28872c = (ImageView) view.findViewById(R.id.b_a);
            this.f28873d = (TextView) view.findViewById(R.id.dsf);
        }
    }

    /* renamed from: a */
    private void m31425a(String str, int i) {
        int i2;
        if (C10772g.m31442a().mo25762a(str)) {
            this.f28873d.setText(str);
            this.f28874f = i;
            int b = (int) C9738o.m28708b(this.f28871b, 16.0f);
            LayoutParams layoutParams = (LayoutParams) this.f28870a.getLayoutParams();
            if (!m31429c()) {
                layoutParams.setMargins(b, f28869e - ((int) C9738o.m28708b(this.f28871b, 35.0f)), b, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (m31428b()) {
                m31430d();
                return;
            }
            this.f28870a.setAlpha(1.0f);
            Toast toast = new Toast(this.f28871b);
            toast.setDuration(0);
            if (m31429c()) {
                i2 = f28869e;
            } else {
                i2 = 0;
            }
            toast.setGravity(55, 0, i2);
            toast.setView(this.f28876h);
            C10768d.m31436a(toast);
        }
    }

    /* renamed from: c */
    public final C10763c mo25754c(String str, int i, int i2, int i3) {
        this.f28875g = i2;
        m31422a(i3);
        if (m31429c()) {
            this.f28870a.setBackgroundColor(this.f28871b.getResources().getColor(R.color.ay_));
        } else {
            this.f28870a.setBackgroundResource(R.drawable.cm_);
        }
        this.f28872c.setVisibility(8);
        m31425a(str, i);
        return this;
    }

    /* renamed from: b */
    public final C10763c mo25753b(String str, int i, int i2, int i3) {
        this.f28875g = i2;
        m31422a(i3);
        if (m31429c()) {
            this.f28870a.setBackgroundColor(this.f28871b.getResources().getColor(R.color.aya));
        } else {
            this.f28870a.setBackgroundResource(R.drawable.cma);
        }
        this.f28872c.setImageResource(R.drawable.cmr);
        m31425a(str, i);
        return this;
    }

    /* renamed from: a */
    public final C10763c mo25751a(String str, int i, int i2, int i3) {
        this.f28875g = i2;
        m31422a(i3);
        if (m31429c()) {
            this.f28870a.setBackgroundColor(this.f28871b.getResources().getColor(R.color.ayb));
        } else {
            this.f28870a.setBackgroundResource(R.drawable.cmb);
        }
        this.f28872c.setImageResource(R.drawable.cmq);
        m31425a(str, i);
        return this;
    }
}
