package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p564d.C10788b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtDefaultView */
public class DmtDefaultView extends ScrollView implements C10778e, C10808d, C10809e {

    /* renamed from: A */
    private boolean f29036A;

    /* renamed from: a */
    private C10805b f29037a;

    /* renamed from: b */
    private int f29038b;

    /* renamed from: c */
    private int f29039c;

    /* renamed from: d */
    private LinearLayout f29040d;

    /* renamed from: e */
    private ImageView f29041e;

    /* renamed from: f */
    private DmtTextView f29042f;

    /* renamed from: g */
    private DmtTextView f29043g;

    /* renamed from: h */
    private View f29044h;

    /* renamed from: i */
    private DmtTextView f29045i;

    /* renamed from: j */
    private int f29046j;

    /* renamed from: k */
    private int f29047k;

    /* renamed from: l */
    private int f29048l;

    /* renamed from: m */
    private int f29049m;

    /* renamed from: n */
    private int f29050n;

    /* renamed from: o */
    private int f29051o;

    /* renamed from: p */
    private int f29052p;

    /* renamed from: q */
    private int f29053q;

    /* renamed from: r */
    private int f29054r;

    /* renamed from: s */
    private int f29055s;

    /* renamed from: t */
    private boolean f29056t;

    /* renamed from: u */
    private boolean f29057u;

    /* renamed from: v */
    private OnClickListener f29058v;

    /* renamed from: w */
    private int f29059w;

    /* renamed from: x */
    private boolean f29060x;

    /* renamed from: y */
    private int f29061y;

    /* renamed from: z */
    private int f29062z;

    /* renamed from: c */
    private void m31592c() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f29038b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    /* renamed from: e */
    private void m31594e() {
        if (C0991u.m4220h(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f29040d.setLayoutDirection(1);
        }
    }

    /* renamed from: f */
    private void m31595f() {
        this.f29042f = (DmtTextView) findViewById(R.id.e3f);
        if (this.f29037a.f29127k) {
            this.f29042f.setText(this.f29037a.f29118b);
        }
        if (this.f29037a.f29130n) {
            C1056n.m4567a((TextView) this.f29042f, (int) R.style.ss);
        }
        if (this.f29037a.f29131o) {
            this.f29044h = m31585a(this.f29037a, this.f29040d);
        }
        m31596g();
    }

    /* renamed from: g */
    private void m31596g() {
        this.f29043g = (DmtTextView) findViewById(R.id.dt5);
        if (this.f29037a.f29128l) {
            this.f29043g.setText(this.f29037a.f29119c);
            if (this.f29037a.f29129m) {
                this.f29043g.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* renamed from: b */
    private void m31591b() {
        if (!this.f29037a.f29131o || (this.f29037a.f29127k && this.f29037a.f29128l)) {
            if (this.f29037a.f29133q) {
                if (TextUtils.isEmpty(this.f29037a.f29124h)) {
                    throw new IllegalArgumentException("extra text should not be empty String!");
                } else if (!this.f29037a.f29126j || !this.f29037a.f29127k || !this.f29037a.f29128l || !this.f29037a.f29131o) {
                    throw new IllegalArgumentException("extra text must with all elements!");
                }
            }
            if (this.f29037a.f29127k) {
                if (TextUtils.isEmpty(this.f29037a.f29118b)) {
                    throw new IllegalArgumentException("title text should not be empty String!");
                }
            } else if (!this.f29037a.f29128l) {
            } else {
                if (TextUtils.isEmpty(this.f29037a.f29119c)) {
                    throw new IllegalArgumentException("desc text should not be empty String!");
                } else if (this.f29037a.f29126j) {
                    throw new IllegalArgumentException("desc text should only have itself!");
                }
            }
        } else {
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    /* renamed from: d */
    private void m31593d() {
        m31592c();
        removeAllViews();
        setScrollY(0);
        if (this.f29060x) {
            this.f29038b = C10788b.m31501b(getContext()) - this.f29062z;
        }
        if (this.f29037a == null || this.f29038b < this.f29046j) {
            this.f29057u = false;
            return;
        }
        if (this.f29037a.f29126j) {
            LayoutInflater.from(getContext()).inflate(R.layout.a5m, this, true);
            this.f29040d = (LinearLayout) findViewById(R.id.bir);
            this.f29041e = (ImageView) findViewById(R.id.b8x);
            this.f29041e.setImageDrawable(this.f29037a.f29117a);
            m31595f();
            if (this.f29037a.f29133q) {
                this.f29045i = m31590b(this.f29037a, this.f29040d);
            }
            m31589a(this.f29040d);
        } else if (this.f29037a.f29127k) {
            LayoutInflater.from(getContext()).inflate(R.layout.a5l, this, true);
            this.f29040d = (LinearLayout) findViewById(R.id.bir);
            m31595f();
            m31589a(this.f29040d);
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.a5k, this, true);
            this.f29040d = (LinearLayout) findViewById(R.id.bir);
            m31596g();
            m31589a(this.f29040d);
        }
        if (this.f29058v != null) {
            this.f29040d.setOnClickListener(this.f29058v);
        }
        this.f29056t = true;
        m31598i();
        if (this.f29036A) {
            this.f29040d.setVisibility(4);
        }
        m31594e();
        m31597h();
    }

    /* renamed from: h */
    private void m31597h() {
        m31592c();
        this.f29057u = false;
        if (this.f29060x) {
            this.f29038b = C10788b.m31501b(getContext()) - this.f29062z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f29061y = iArr[1];
        }
        if (this.f29037a == null || this.f29038b < this.f29046j) {
            this.f29057u = true;
            return;
        }
        if (this.f29037a.f29126j) {
            int i = (int) ((((float) this.f29038b) * 0.2f) + 0.5f);
            if (this.f29060x) {
                i -= this.f29061y;
            }
            m31588a((View) this.f29041e, i);
            if (this.f29037a.f29131o) {
                if (this.f29037a.f29133q) {
                    m31588a(this.f29044h, this.f29053q);
                } else {
                    int a = (((((((this.f29038b - i) - this.f29055s) - this.f29047k) - m31584a((TextView) this.f29042f)) - this.f29048l) - m31584a((TextView) this.f29043g)) - this.f29050n) - this.f29049m;
                    if (this.f29060x) {
                        a -= this.f29061y;
                    }
                    setButtonMargin(a);
                }
            }
        } else if (this.f29037a.f29127k) {
            int i2 = (int) ((((float) this.f29038b) * 0.3f) + 0.5f);
            if (this.f29060x) {
                i2 -= this.f29061y;
            }
            m31588a((View) this.f29042f, i2);
            if (this.f29037a.f29131o) {
                int a2 = (((((this.f29038b - i2) - m31584a((TextView) this.f29042f)) - this.f29048l) - m31584a((TextView) this.f29043g)) - this.f29050n) - this.f29049m;
                if (this.f29060x) {
                    a2 -= this.f29061y;
                }
                setButtonMargin(a2);
            }
        } else {
            int i3 = (int) ((((float) this.f29038b) * 0.3f) + 0.5f);
            if (this.f29060x) {
                i3 -= this.f29061y;
            }
            m31588a((View) this.f29043g, i3);
        }
        this.f29043g.requestLayout();
        if (this.f29061y != 0 && this.f29036A) {
            this.f29040d.setVisibility(0);
        }
        this.f29057u = true;
    }

    /* renamed from: i */
    private void m31598i() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.f29040d != null && this.f29037a != null) {
            Resources resources = getResources();
            if (this.f29042f != null) {
                if (this.f29037a.f29130n) {
                    DmtTextView dmtTextView = this.f29042f;
                    if (this.f29059w == 0) {
                        i7 = resources.getColor(R.color.ay2);
                    } else {
                        i7 = resources.getColor(R.color.ay1);
                    }
                    dmtTextView.setTextColor(i7);
                } else {
                    DmtTextView dmtTextView2 = this.f29042f;
                    if (this.f29059w == 0) {
                        i6 = resources.getColor(R.color.axy);
                    } else {
                        i6 = resources.getColor(R.color.axx);
                    }
                    dmtTextView2.setTextColor(i6);
                }
            }
            if (this.f29043g != null) {
                DmtTextView dmtTextView3 = this.f29043g;
                if (this.f29059w == 0) {
                    i5 = resources.getColor(R.color.ay2);
                } else {
                    i5 = resources.getColor(R.color.ay1);
                }
                dmtTextView3.setTextColor(i5);
            }
            if (this.f29044h != null) {
                if (this.f29044h instanceof DmtIconButton) {
                    ((DmtIconButton) this.f29044h).mo25766a(this.f29059w);
                    return;
                }
                DmtTextView dmtTextView4 = (DmtTextView) this.f29044h;
                if (this.f29037a.f29120d == ButtonStyle.SOLID) {
                    if (this.f29059w == 0) {
                        i3 = R.drawable.clz;
                    } else {
                        i3 = R.drawable.cly;
                    }
                    dmtTextView4.setBackgroundResource(i3);
                    if (this.f29059w == 0) {
                        i4 = R.color.axu;
                    } else {
                        i4 = R.color.axt;
                    }
                    dmtTextView4.setTextColor(resources.getColor(i4));
                    return;
                }
                if (this.f29059w == 0) {
                    i = R.drawable.clx;
                } else {
                    i = R.drawable.clw;
                }
                dmtTextView4.setBackgroundResource(i);
                if (this.f29059w == 0) {
                    i2 = resources.getColor(R.color.axy);
                } else {
                    i2 = resources.getColor(R.color.axx);
                }
                dmtTextView4.setTextColor(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo25920a() {
        if (this.f29037a != null) {
            if (this.f29056t) {
                m31597h();
                return;
            }
            m31593d();
        }
    }

    public void setSupportDelayVisible(boolean z) {
        this.f29036A = z;
    }

    public DmtDefaultView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f29058v = onClickListener;
        if (this.f29040d != null) {
            this.f29040d.setOnClickListener(this.f29058v);
        }
    }

    public void setUseScreenHeight(int i) {
        this.f29060x = true;
        this.f29062z = i;
        mo25920a();
    }

    /* renamed from: a */
    private int m31584a(TextView textView) {
        textView.measure(MeasureSpec.makeMeasureSpec(this.f29039c - (this.f29054r * 2), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    public void setStatus(C10805b bVar) {
        if (bVar != null) {
            this.f29037a = bVar;
            m31591b();
            this.f29056t = false;
            this.f29057u = false;
            if (this.f29038b > 0) {
                m31593d();
            }
        }
    }

    /* renamed from: a */
    private DmtTextView m31586a(C10805b bVar) {
        if (!bVar.f29131o) {
            return null;
        }
        if (bVar.f29120d == ButtonStyle.SOLID) {
            return new DmtTextView(new ContextThemeWrapper(getContext(), R.style.sr));
        }
        return new DmtTextView(new ContextThemeWrapper(getContext(), R.style.sq));
    }

    private void setButtonMargin(int i) {
        if (i >= this.f29049m) {
            int i2 = (int) ((((float) this.f29038b) * 0.2f) + 0.5f);
            if (i2 < this.f29049m) {
                m31588a(this.f29044h, i);
                return;
            }
            int i3 = i - (i2 - this.f29049m);
            if (i3 > this.f29049m) {
                m31588a(this.f29044h, i3);
                return;
            }
        }
        m31588a(this.f29044h, this.f29049m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31587a(android.util.AttributeSet r7) {
        /*
            r6 = this;
            r6.m31592c()
            if (r7 == 0) goto L_0x0083
            android.content.Context r0 = r6.getContext()
            int[] r1 = com.bytedance.ies.dmt.R$styleable.DmtDefaultView
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            if (r7 == 0) goto L_0x0083
            com.bytedance.ies.dmt.ui.widget.b r1 = new com.bytedance.ies.dmt.ui.widget.b
            r1.<init>()
            r2 = 4
            boolean r3 = r7.hasValue(r2)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002f
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r7.getResourceId(r2, r4)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r1.f29117a = r0
            r1.f29126j = r5
        L_0x002f:
            boolean r0 = r7.hasValue(r5)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r7.getString(r5)
            r1.f29122f = r0
            r1.f29131o = r5
        L_0x003d:
            boolean r0 = r7.hasValue(r4)
            if (r0 == 0) goto L_0x0052
            int r0 = r7.getInt(r4, r5)
            if (r0 != r5) goto L_0x004c
            com.bytedance.ies.dmt.ui.widget.ButtonStyle r0 = com.bytedance.ies.dmt.p262ui.widget.ButtonStyle.SOLID
            goto L_0x004e
        L_0x004c:
            com.bytedance.ies.dmt.ui.widget.ButtonStyle r0 = com.bytedance.ies.dmt.p262ui.widget.ButtonStyle.BORDER
        L_0x004e:
            r1.f29120d = r0
            r1.f29131o = r5
        L_0x0052:
            r0 = 5
            boolean r2 = r7.hasValue(r0)
            if (r2 == 0) goto L_0x0061
            java.lang.String r0 = r7.getString(r0)
            r1.f29118b = r0
            r1.f29127k = r5
        L_0x0061:
            r0 = 2
            boolean r2 = r7.hasValue(r0)
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = r7.getString(r0)
            r1.f29119c = r0
            r1.f29128l = r5
        L_0x0070:
            r0 = 3
            boolean r2 = r7.hasValue(r0)
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = r7.getString(r0)
            r1.f29124h = r0
            r1.f29133q = r5
        L_0x007f:
            r7.recycle()
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131165385(0x7f0700c9, float:1.7944986E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29046j = r0
            r0 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29047k = r0
            r0 = 2131165377(0x7f0700c1, float:1.794497E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29048l = r0
            r0 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29049m = r0
            r0 = 2131165375(0x7f0700bf, float:1.7944965E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29051o = r0
            r0 = 2131165373(0x7f0700bd, float:1.7944961E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29050n = r0
            r0 = 2131165378(0x7f0700c2, float:1.7944971E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29052p = r0
            r0 = 2131165374(0x7f0700be, float:1.7944963E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29053q = r0
            r0 = 2131165462(0x7f070116, float:1.7945142E38)
            int r0 = r7.getDimensionPixelSize(r0)
            r6.f29054r = r0
            r0 = 2131165380(0x7f0700c4, float:1.7944975E38)
            int r7 = r7.getDimensionPixelSize(r0)
            r6.f29055s = r7
            if (r1 == 0) goto L_0x00ff
            boolean r7 = r1.f29126j
            if (r7 != 0) goto L_0x00fc
            boolean r7 = r1.f29131o
            if (r7 != 0) goto L_0x00fc
            boolean r7 = r1.f29127k
            if (r7 != 0) goto L_0x00fc
            boolean r7 = r1.f29128l
            if (r7 != 0) goto L_0x00fc
            boolean r7 = r1.f29133q
            if (r7 == 0) goto L_0x00ff
        L_0x00fc:
            r6.setStatus(r1)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView.m31587a(android.util.AttributeSet):void");
    }

    /* renamed from: a */
    private void m31589a(LinearLayout linearLayout) {
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f29049m));
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f29059w != i) {
            this.f29059w = i;
            m31598i();
        }
    }

    public DmtDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m31588a(View view, int i) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    /* renamed from: b */
    private DmtTextView m31590b(C10805b bVar, LinearLayout linearLayout) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.st));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f29052p;
        linearLayout.addView(dmtTextView, layoutParams);
        dmtTextView.setText(bVar.f29124h);
        dmtTextView.setOnClickListener(this.f29037a.f29125i);
        return dmtTextView;
    }

    /* renamed from: a */
    private View m31585a(C10805b bVar, LinearLayout linearLayout) {
        if (bVar.f29132p) {
            DmtIconButton dmtIconButton = new DmtIconButton(getContext());
            dmtIconButton.mo25928a(bVar.f29120d, bVar.f29121e, bVar.f29122f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f29051o, this.f29050n);
            layoutParams.gravity = 1;
            linearLayout.addView(dmtIconButton, layoutParams);
            dmtIconButton.setOnClickListener(this.f29037a.f29123g);
            return dmtIconButton;
        }
        DmtTextView a = m31586a(bVar);
        if (a == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f29051o, this.f29050n);
        layoutParams2.gravity = 1;
        linearLayout.addView(a, layoutParams2);
        a.setText(bVar.f29122f);
        a.setOnClickListener(bVar.f29123g);
        return a;
    }

    public DmtDefaultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29059w = C6394b.m19903a().f18686a;
        m31587a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(this.f29038b == i2 && this.f29039c == i)) {
            this.f29039c = i;
            this.f29038b = i2;
            if (this.f29040d == null) {
                mo25920a();
                return;
            }
            this.f29040d.post(new Runnable() {
                public final void run() {
                    DmtDefaultView.this.mo25920a();
                }
            });
        }
    }
}
