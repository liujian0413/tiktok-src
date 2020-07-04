package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.C9252i.C9253a;
import com.bytedance.common.utility.C9738o;
import com.facebook.ads.AdError;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.widget.h */
public final class C9245h extends Dialog {

    /* renamed from: a */
    public TextView f25360a;

    /* renamed from: b */
    public TextView f25361b;

    /* renamed from: c */
    public View f25362c;

    /* renamed from: d */
    public Animation f25363d;

    /* renamed from: e */
    private HSImageView f25364e;

    /* renamed from: f */
    private Button f25365f;

    /* renamed from: g */
    private Button f25366g;

    /* renamed from: h */
    private Button f25367h;

    /* renamed from: com.bytedance.android.livesdk.widget.h$a */
    public static class C9249a implements C9253a {

        /* renamed from: a */
        private C9251c f25375a;

        /* renamed from: a */
        public final Context mo22709a() {
            return this.f25375a.f25381c;
        }

        /* renamed from: c */
        public final C9245h mo22729d() {
            C9245h b = mo22720b();
            b.show();
            return b;
        }

        /* renamed from: b */
        public final C9245h mo22720b() {
            return new C9245h(this.f25375a.f25381c, this.f25375a);
        }

        public C9249a(Context context) {
            this(context, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C9249a mo22724b(View view) {
            this.f25375a.f25386h = view;
            return this;
        }

        /* renamed from: b */
        public final C9249a mo22727c(CharSequence charSequence) {
            this.f25375a.f25384f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C9249a mo22710a(int i) {
            return mo22731d(this.f25375a.f25381c.getText(i));
        }

        /* renamed from: b */
        public final C9249a mo22718b(int i) {
            return mo22727c(this.f25375a.f25381c.getText(i));
        }

        /* renamed from: d */
        public final /* synthetic */ C9253a mo22730d(int i) {
            return mo22710a((int) R.string.fez);
        }

        /* renamed from: c */
        public final /* synthetic */ C9253a mo22726c(int i) {
            return mo22718b((int) R.string.f0b);
        }

        /* renamed from: b */
        public final C9245h mo22721b(boolean z) {
            if (!z) {
                return mo22729d();
            }
            C9245h b = mo22720b();
            if (VERSION.SDK_INT >= 26) {
                b.getWindow().setType(2038);
            } else {
                b.getWindow().setType(AdError.CACHE_ERROR_CODE);
            }
            b.show();
            return b;
        }

        /* renamed from: a */
        public final C9249a mo22713a(OnDismissListener onDismissListener) {
            this.f25375a.f25389k = onDismissListener;
            return this;
        }

        /* renamed from: c */
        public final /* synthetic */ C9253a mo22728c(boolean z) {
            return mo22716a(false);
        }

        /* renamed from: a */
        public final C9249a mo22714a(View view) {
            this.f25375a.f25385g = view;
            return this;
        }

        /* renamed from: a */
        public final C9249a mo22731d(CharSequence charSequence) {
            this.f25375a.f25383e = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C9249a mo22716a(boolean z) {
            this.f25375a.f25391m = z;
            return this;
        }

        /* renamed from: a */
        public final C9253a mo22717a(float f) {
            this.f25375a.f25392n = Float.valueOf(f);
            return this;
        }

        public C9249a(Context context, int i) {
            this.f25375a = new C9251c();
            this.f25375a.f25381c = context;
            this.f25375a.f25379a = i;
            this.f25375a.f25380b = false;
        }

        /* renamed from: a */
        public final C9249a mo22722b(int i, int i2, OnClickListener onClickListener) {
            return mo22723b(i, this.f25375a.f25381c.getText(i2), onClickListener);
        }

        /* renamed from: a */
        public final C9249a mo22723b(int i, CharSequence charSequence, OnClickListener onClickListener) {
            if (i > 4) {
                return this;
            }
            C9250b bVar = this.f25375a.f25387i[i];
            if (bVar == null) {
                bVar = new C9250b();
                this.f25375a.f25387i[i] = bVar;
            }
            bVar.f25376a = i;
            bVar.f25377b = charSequence;
            bVar.f25378c = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.h$b */
    static class C9250b {

        /* renamed from: a */
        int f25376a;

        /* renamed from: b */
        CharSequence f25377b;

        /* renamed from: c */
        OnClickListener f25378c;

        private C9250b() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.h$c */
    static class C9251c {

        /* renamed from: a */
        int f25379a;

        /* renamed from: b */
        boolean f25380b;

        /* renamed from: c */
        Context f25381c;

        /* renamed from: d */
        Uri f25382d;

        /* renamed from: e */
        CharSequence f25383e;

        /* renamed from: f */
        CharSequence f25384f;

        /* renamed from: g */
        View f25385g;

        /* renamed from: h */
        View f25386h;

        /* renamed from: i */
        C9250b[] f25387i;

        /* renamed from: j */
        OnCancelListener f25388j;

        /* renamed from: k */
        OnDismissListener f25389k;

        /* renamed from: l */
        OnShowListener f25390l;

        /* renamed from: m */
        boolean f25391m;

        /* renamed from: n */
        Float f25392n;

        private C9251c() {
            this.f25387i = new C9250b[5];
            this.f25391m = true;
        }
    }

    /* renamed from: a */
    private void m27499a(Uri uri) {
        if (this.f25364e != null) {
            this.f25364e.setImageURI(uri);
        }
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitle(CharSequence charSequence) {
        if (this.f25360a != null) {
            this.f25360a.setText(charSequence);
        }
    }

    /* renamed from: b */
    private void m27502b(final C9251c cVar) {
        this.f25361b = (TextView) findViewById(R.id.boj);
        if (!(this.f25361b == null || cVar.f25384f == null)) {
            this.f25361b.setText(cVar.f25384f);
        }
        setCancelable(cVar.f25391m);
        setOnCancelListener(cVar.f25388j);
        setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                if (cVar.f25389k != null) {
                    cVar.f25389k.onDismiss(dialogInterface);
                }
                if (C9245h.this.f25363d != null && !C9245h.this.f25363d.hasEnded()) {
                    C9245h.this.f25363d.cancel();
                }
            }
        });
        setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
                if (cVar.f25390l != null) {
                    cVar.f25390l.onShow(dialogInterface);
                }
                View findViewById = C9245h.this.findViewById(R.id.boi);
                if (findViewById != null) {
                    C9245h hVar = C9245h.this;
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    hVar.f25363d = rotateAnimation;
                    C9245h.this.f25363d.setInterpolator(new LinearInterpolator());
                    C9245h.this.f25363d.setRepeatMode(1);
                    C9245h.this.f25363d.setRepeatCount(-1);
                    C9245h.this.f25363d.setDuration(1000);
                    findViewById.startAnimation(C9245h.this.f25363d);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo22703a(CharSequence charSequence) {
        if (this.f25361b != null) {
            this.f25361b.setText(charSequence);
        }
    }

    /* renamed from: a */
    private void m27501a(C9251c cVar) {
        boolean z;
        this.f25364e = (HSImageView) findViewById(R.id.bog);
        this.f25360a = (TextView) findViewById(R.id.bok);
        this.f25361b = (TextView) findViewById(R.id.boj);
        if (cVar.f25386h != null) {
            this.f25364e.setVisibility(8);
            this.f25360a.setVisibility(8);
            this.f25361b.setVisibility(8);
            findViewById(R.id.bon).setVisibility(8);
            findViewById(R.id.bom).setVisibility(8);
            findViewById(R.id.bo6).setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.boe);
            frameLayout.addView(cVar.f25386h);
            frameLayout.setVisibility(0);
        } else {
            if (cVar.f25382d == null) {
                this.f25364e.setVisibility(8);
                findViewById(R.id.boh).setVisibility(8);
            } else {
                m27499a(cVar.f25382d);
            }
            if (cVar.f25383e != null) {
                this.f25360a.setText(cVar.f25383e);
                this.f25360a.setVisibility(0);
            } else {
                this.f25360a.setVisibility(8);
                findViewById(R.id.bom).setVisibility(8);
            }
            if (cVar.f25384f != null) {
                if (cVar.f25380b) {
                    this.f25361b.setGravity(8388611);
                }
                this.f25361b.setText(cVar.f25384f);
            } else {
                this.f25361b.setVisibility(8);
                findViewById(R.id.bom).setVisibility(8);
            }
        }
        if (cVar.f25392n != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            if (viewGroup != null) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null && (childAt.getBackground() instanceof GradientDrawable)) {
                    GradientDrawable gradientDrawable = (GradientDrawable) childAt.getBackground().mutate();
                    gradientDrawable.setCornerRadius(C9738o.m28708b(getContext(), cVar.f25392n.floatValue()));
                    childAt.setBackground(gradientDrawable);
                }
            }
        }
        if (cVar.f25379a == 0 || 4 == cVar.f25379a ? !(cVar.f25387i[0] == null && cVar.f25387i[1] == null) : 1 != cVar.f25379a ? 3 == cVar.f25379a : !(cVar.f25387i[2] == null && cVar.f25387i[3] == null && cVar.f25387i[4] == null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            findViewById(R.id.bo_).setVisibility(8);
        } else if (cVar.f25379a == 0 || 3 == cVar.f25379a || 4 == cVar.f25379a) {
            this.f25365f = (Button) findViewById(R.id.bo7);
            m27500a(this.f25365f, 0, null, cVar);
            this.f25366g = (Button) findViewById(R.id.bo8);
            m27500a(this.f25366g, 1, findViewById(R.id.bod), cVar);
            this.f25362c = findViewById(R.id.bom);
        } else {
            this.f25365f = (Button) findViewById(R.id.bo7);
            m27500a(this.f25365f, 2, findViewById(R.id.boa), cVar);
            this.f25366g = (Button) findViewById(R.id.bo8);
            m27500a(this.f25366g, 3, findViewById(R.id.bob), cVar);
            this.f25367h = (Button) findViewById(R.id.bo9);
            m27500a(this.f25367h, 4, findViewById(R.id.boc), cVar);
        }
        setCancelable(cVar.f25391m);
        setOnCancelListener(cVar.f25388j);
        setOnDismissListener(cVar.f25389k);
        setOnShowListener(cVar.f25390l);
    }

    private C9245h(Context context, C9251c cVar) {
        super(context, R.style.yw);
        if (cVar.f25385g != null) {
            setContentView(cVar.f25385g);
        } else if (2 == cVar.f25379a) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.an1, null);
            setContentView(inflate);
            m27502b(cVar);
            int b = (int) C9738o.m28708b(getContext(), 80.0f);
            LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.width = b;
            layoutParams.height = b;
            inflate.setLayoutParams(layoutParams);
        } else if (1 == cVar.f25379a) {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.an2, null));
            m27501a(cVar);
        } else if (3 == cVar.f25379a) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.aoq, null);
            setContentView(inflate2);
            int b2 = (int) C9738o.m28708b(getContext(), 280.0f);
            LayoutParams layoutParams2 = inflate2.getLayoutParams();
            layoutParams2.width = b2;
            inflate2.setLayoutParams(layoutParams2);
            m27501a(cVar);
        } else if (cVar.f25379a == 4) {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.an0, null));
            m27501a(cVar);
        } else {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.amz, null));
            m27501a(cVar);
        }
    }

    /* renamed from: a */
    private void m27500a(Button button, final int i, View view, C9251c cVar) {
        final C9250b bVar = cVar.f25387i[i];
        if (bVar != null) {
            button.setText(bVar.f25377b);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (bVar.f25378c != null) {
                        bVar.f25378c.onClick(C9245h.this, i);
                    }
                }
            });
            return;
        }
        button.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
