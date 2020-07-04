package com.bytedance.ies.dmt.p262ui.p561a;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.a.a */
public final class C10730a {

    /* renamed from: f */
    public static float f28679f = 0.5f;

    /* renamed from: A */
    private String f28680A;

    /* renamed from: B */
    private int f28681B;

    /* renamed from: C */
    private int f28682C;

    /* renamed from: D */
    private int f28683D;

    /* renamed from: E */
    private boolean f28684E;

    /* renamed from: F */
    private boolean f28685F;

    /* renamed from: G */
    private int f28686G;

    /* renamed from: a */
    public RelativeLayout f28687a;

    /* renamed from: b */
    public OnClickListener f28688b;

    /* renamed from: c */
    public OnClickListener f28689c;

    /* renamed from: d */
    public boolean f28690d;

    /* renamed from: e */
    public boolean f28691e;

    /* renamed from: g */
    private Context f28692g;

    /* renamed from: h */
    private TextView f28693h;

    /* renamed from: i */
    private TextView f28694i;

    /* renamed from: j */
    private TextView f28695j;

    /* renamed from: k */
    private TextView f28696k;

    /* renamed from: l */
    private TextView f28697l;

    /* renamed from: m */
    private TextView f28698m;

    /* renamed from: n */
    private ImageView f28699n;

    /* renamed from: o */
    private View f28700o;

    /* renamed from: p */
    private View f28701p;

    /* renamed from: q */
    private View f28702q;

    /* renamed from: r */
    private View f28703r;

    /* renamed from: s */
    private View f28704s;

    /* renamed from: t */
    private FrameLayout f28705t;

    /* renamed from: u */
    private LinearLayout f28706u;

    /* renamed from: v */
    private RelativeLayout f28707v;

    /* renamed from: w */
    private String f28708w;

    /* renamed from: x */
    private String f28709x;

    /* renamed from: y */
    private String f28710y;

    /* renamed from: z */
    private String f28711z;

    /* renamed from: com.bytedance.ies.dmt.ui.a.a$a */
    public static class C10741a {

        /* renamed from: a */
        public String f28727a;

        /* renamed from: b */
        public String f28728b;

        /* renamed from: c */
        public String f28729c;

        /* renamed from: d */
        public String f28730d;

        /* renamed from: e */
        public String f28731e;

        /* renamed from: f */
        public int f28732f;

        /* renamed from: g */
        public OnClickListener f28733g;

        /* renamed from: h */
        public OnClickListener f28734h;

        /* renamed from: i */
        public Context f28735i;

        /* renamed from: j */
        public View f28736j;

        /* renamed from: k */
        public View f28737k;

        /* renamed from: l */
        public int f28738l;

        /* renamed from: m */
        public int f28739m;

        /* renamed from: n */
        public boolean f28740n;

        /* renamed from: o */
        public boolean f28741o;

        /* renamed from: p */
        public boolean f28742p;

        /* renamed from: q */
        public boolean f28743q;

        /* renamed from: r */
        public int f28744r = 17;

        /* renamed from: a */
        public final C10730a mo25656a() {
            return new C10730a(this);
        }

        /* renamed from: a */
        public final C10741a mo25652a(View view) {
            this.f28736j = view;
            return this;
        }

        /* renamed from: b */
        public final C10741a mo25660b(String str) {
            this.f28728b = str;
            return this;
        }

        /* renamed from: c */
        public final C10741a mo25663c(int i) {
            this.f28732f = i;
            return this;
        }

        /* renamed from: d */
        public final C10741a mo25664d(int i) {
            this.f28738l = -3476230;
            return this;
        }

        /* renamed from: e */
        public final C10741a mo25665e(int i) {
            this.f28739m = R.style.m2;
            return this;
        }

        public C10741a(Context context) {
            this.f28735i = context;
        }

        /* renamed from: a */
        public final C10741a mo25649a(int i) {
            this.f28727a = this.f28735i.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C10741a mo25657b(int i) {
            this.f28728b = this.f28735i.getString(i);
            return this;
        }

        /* renamed from: a */
        public final C10741a mo25653a(String str) {
            this.f28727a = str;
            return this;
        }

        /* renamed from: b */
        public final C10741a mo25662b(boolean z) {
            this.f28740n = true;
            return this;
        }

        /* renamed from: a */
        public final C10741a mo25655a(boolean z) {
            this.f28741o = false;
            return this;
        }

        /* renamed from: a */
        public final C10741a mo25650a(int i, OnClickListener onClickListener) {
            return mo25651a(i, onClickListener, false);
        }

        /* renamed from: b */
        public final C10741a mo25658b(int i, OnClickListener onClickListener) {
            return mo25659b(i, onClickListener, false);
        }

        /* renamed from: b */
        public final C10741a mo25661b(String str, OnClickListener onClickListener) {
            return m31316b(str, onClickListener, false);
        }

        /* renamed from: a */
        public final C10741a mo25654a(String str, OnClickListener onClickListener) {
            return m31315a(str, onClickListener, false);
        }

        /* renamed from: a */
        private C10741a m31315a(String str, OnClickListener onClickListener, boolean z) {
            this.f28730d = str;
            this.f28733g = onClickListener;
            this.f28742p = z;
            return this;
        }

        /* renamed from: b */
        private C10741a m31316b(String str, OnClickListener onClickListener, boolean z) {
            this.f28731e = str;
            this.f28734h = onClickListener;
            this.f28743q = z;
            return this;
        }

        /* renamed from: a */
        public final C10741a mo25651a(int i, OnClickListener onClickListener, boolean z) {
            return m31315a(this.f28735i.getString(i), onClickListener, z);
        }

        /* renamed from: b */
        public final C10741a mo25659b(int i, OnClickListener onClickListener, boolean z) {
            return m31316b(this.f28735i.getString(i), onClickListener, z);
        }
    }

    /* renamed from: c */
    private void m31312c() {
        int i;
        LayoutInflater from = LayoutInflater.from(this.f28692g);
        if (this.f28684E) {
            i = R.layout.a5t;
        } else {
            i = R.layout.a5s;
        }
        this.f28700o = from.inflate(i, null);
        this.f28693h = (TextView) this.f28700o.findViewById(R.id.e3f);
        this.f28694i = (TextView) this.f28700o.findViewById(R.id.dsf);
        this.f28695j = (TextView) this.f28700o.findViewById(R.id.e1j);
        this.f28699n = (ImageView) this.f28700o.findViewById(R.id.ax1);
        this.f28696k = (TextView) this.f28700o.findViewById(R.id.dwj);
        this.f28697l = (TextView) this.f28700o.findViewById(R.id.e0u);
        this.f28698m = (TextView) this.f28700o.findViewById(R.id.dwv);
        this.f28687a = (RelativeLayout) this.f28700o.findViewById(R.id.cwu);
        this.f28707v = (RelativeLayout) this.f28700o.findViewById(R.id.cuf);
        this.f28705t = (FrameLayout) this.f28700o.findViewById(R.id.cv9);
        this.f28706u = (LinearLayout) this.f28700o.findViewById(R.id.bqc);
        this.f28703r = this.f28700o.findViewById(R.id.a9t);
        this.f28704s = this.f28700o.findViewById(R.id.xl);
    }

    /* renamed from: a */
    public final Dialog mo25637a() {
        Builder builder;
        if (this.f28683D == 0) {
            builder = new Builder(this.f28692g, R.style.t7);
        } else {
            builder = new Builder(this.f28692g, this.f28683D);
        }
        if (!TextUtils.isEmpty(this.f28708w)) {
            builder.setTitle(this.f28708w);
        }
        if (!TextUtils.isEmpty(this.f28709x)) {
            builder.setMessage(this.f28709x);
        }
        builder.setPositiveButton(this.f28711z, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!C10730a.this.f28690d) {
                    C10730a.m31308a(dialogInterface);
                }
                if (C10730a.this.f28688b != null) {
                    C10730a.this.f28688b.onClick(dialogInterface, i);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f28680A)) {
            builder.setNegativeButton(this.f28680A, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (!C10730a.this.f28691e) {
                        C10730a.m31308a(dialogInterface);
                    }
                    if (C10730a.this.f28689c != null) {
                        C10730a.this.f28689c.onClick(dialogInterface, i);
                    }
                }
            });
        }
        AlertDialog create = builder.create();
        m31311b(create);
        if (!TextUtils.isEmpty(this.f28708w)) {
            int identifier = this.f28692g.getResources().getIdentifier("alertTitle", "id", "android");
            if (identifier > 0) {
                C10832b.m31784a().mo26164a((TextView) create.getWindow().findViewById(identifier), C10834d.f29337g);
            }
        }
        if (!TextUtils.isEmpty(this.f28709x)) {
            C10832b.m31784a().mo26164a((TextView) create.getWindow().findViewById(16908299), C10834d.f29331a);
        }
        Button button = create.getButton(-1);
        if (button != null) {
            button.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        }
        Button button2 = create.getButton(-2);
        if (button2 != null) {
            button2.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        }
        return create;
    }

    /* renamed from: b */
    public final Dialog mo25638b() {
        Builder builder;
        this.f28687a.setAlpha(0.0f);
        if (this.f28683D == 0) {
            builder = new Builder(this.f28692g);
        } else {
            builder = new Builder(this.f28692g, this.f28683D);
        }
        builder.setView(this.f28700o);
        this.f28693h.setText(this.f28708w);
        this.f28694i.setText(this.f28709x);
        this.f28694i.setGravity(this.f28686G);
        if (this.f28710y != null) {
            this.f28695j.setVisibility(0);
            this.f28695j.setText(this.f28710y);
        }
        this.f28697l.setText(this.f28711z);
        this.f28705t.setBackgroundColor(this.f28682C);
        if (this.f28685F) {
            this.f28704s.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f28680A)) {
            this.f28696k.setVisibility(8);
            this.f28698m.setVisibility(8);
            this.f28697l.setBackgroundResource(R.drawable.clr);
        } else {
            this.f28696k.setText(this.f28680A);
        }
        if (this.f28701p != null) {
            this.f28694i.setVisibility(8);
            this.f28693h.setVisibility(8);
            ((MarginLayoutParams) this.f28703r.getLayoutParams()).topMargin = 0;
            this.f28707v.removeAllViews();
            this.f28707v.addView(this.f28701p);
        }
        m31309a(this.f28708w);
        if (this.f28702q != null) {
            this.f28705t.removeView(this.f28699n);
            this.f28705t.addView(this.f28702q, 0, new LayoutParams(-1, -1));
        } else if (this.f28681B > 0) {
            this.f28699n.setImageResource(this.f28681B);
        } else {
            this.f28705t.setVisibility(8);
            this.f28706u.setBackgroundResource(R.drawable.cm2);
        }
        final AlertDialog create = builder.create();
        this.f28696k.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!C10730a.this.f28691e) {
                    C10730a.m31310a(false, C10730a.this.f28687a);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            C10730a.m31308a((DialogInterface) create);
                        }
                    }, 100);
                }
                if (C10730a.this.f28689c != null) {
                    C10730a.this.f28689c.onClick(create, 0);
                }
            }
        });
        this.f28697l.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!C10730a.this.f28690d) {
                    C10730a.m31310a(false, C10730a.this.f28687a);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            C10730a.m31308a((DialogInterface) create);
                        }
                    }, 100);
                }
                if (C10730a.this.f28688b != null) {
                    C10730a.this.f28688b.onClick(create, 1);
                }
            }
        });
        this.f28704s.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10730a.m31310a(false, C10730a.this.f28687a);
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        C10730a.m31308a((DialogInterface) create);
                    }
                }, 100);
            }
        });
        m31307a((Dialog) create);
        return create;
    }

    /* renamed from: a */
    public static void m31308a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m31311b(Dialog dialog) {
        try {
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m31309a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f28693h.setVisibility(8);
            if (TextUtils.isEmpty(this.f28710y)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f28694i.getLayoutParams();
                layoutParams.topMargin = (int) C9738o.m28708b(this.f28692g, 32.0f);
                layoutParams.bottomMargin = (int) C9738o.m28708b(this.f28692g, 8.0f);
                this.f28694i.setLayoutParams(layoutParams);
            }
        }
    }

    private C10730a(C10741a aVar) {
        this.f28692g = aVar.f28735i;
        this.f28681B = aVar.f28732f;
        this.f28708w = aVar.f28727a;
        this.f28709x = aVar.f28728b;
        this.f28710y = aVar.f28729c;
        this.f28680A = aVar.f28731e;
        this.f28711z = aVar.f28730d;
        this.f28688b = aVar.f28733g;
        this.f28689c = aVar.f28734h;
        this.f28701p = aVar.f28736j;
        this.f28702q = aVar.f28737k;
        this.f28682C = aVar.f28738l;
        this.f28683D = aVar.f28739m;
        this.f28684E = aVar.f28740n;
        this.f28685F = aVar.f28741o;
        this.f28691e = aVar.f28743q;
        this.f28690d = aVar.f28742p;
        this.f28686G = aVar.f28744r;
        m31312c();
    }

    /* renamed from: a */
    private void m31307a(Dialog dialog) {
        try {
            m31310a(true, this.f28687a);
            dialog.show();
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = f28679f;
                window.addFlags(2);
                attributes.gravity = 1;
                if (this.f28684E) {
                    attributes.width = (int) (((float) C9738o.m28691a(this.f28692g)) - (C9738o.m28708b(this.f28692g, 40.0f) * 2.0f));
                } else {
                    attributes.width = (int) C9738o.m28708b(dialog.getContext(), 280.0f);
                }
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m31310a(final boolean z, final View view) {
        if (view != null) {
            view.post(new Runnable() {
                public final void run() {
                    long j;
                    float f;
                    final int height = (int) (((float) view.getHeight()) * 0.075f);
                    if (z) {
                        j = 300;
                    } else {
                        j = 100;
                    }
                    View view = view;
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
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                    ofFloat.setDuration(j);
                    ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float f;
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            int i = (int) (((float) height) - (((float) height) * animatedFraction));
                            View view = view;
                            if (z) {
                                f = (float) i;
                            } else {
                                f = animatedFraction * ((float) (-height));
                            }
                            view.setTranslationY(f);
                        }
                    });
                    ofFloat.setInterpolator(new C10744c());
                    ofFloat.start();
                }
            });
        }
    }
}
