package com.bytedance.android.live.uikit.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.live.uikit.dialog.a */
public final class C3520a {

    /* renamed from: A */
    private int f10401A;

    /* renamed from: B */
    private int f10402B;

    /* renamed from: C */
    private boolean f10403C;

    /* renamed from: D */
    private CharSequence f10404D;

    /* renamed from: E */
    private CharSequence f10405E;

    /* renamed from: F */
    private CharSequence f10406F;

    /* renamed from: G */
    private int f10407G;

    /* renamed from: H */
    private Drawable f10408H;

    /* renamed from: I */
    private ImageView f10409I;

    /* renamed from: J */
    private TextView f10410J;

    /* renamed from: K */
    private TextView f10411K;

    /* renamed from: L */
    private int f10412L;

    /* renamed from: M */
    private int f10413M;

    /* renamed from: N */
    private int f10414N;

    /* renamed from: O */
    private final OnClickListener f10415O = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == C3520a.this.f10419d && C3520a.this.f10420e != null) {
                message = Message.obtain(C3520a.this.f10420e);
            } else if (view == C3520a.this.f10421f && C3520a.this.f10422g != null) {
                message = Message.obtain(C3520a.this.f10422g);
            } else if (view != C3520a.this.f10423h || C3520a.this.f10424i == null) {
                message = null;
            } else {
                message = Message.obtain(C3520a.this.f10424i);
            }
            if (message != null) {
                message.sendToTarget();
            }
            C3520a.this.f10434s.obtainMessage(1, C3520a.this.f10417b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f10416a;

    /* renamed from: b */
    public final DialogInterface f10417b;

    /* renamed from: c */
    public ListView f10418c;

    /* renamed from: d */
    public Button f10419d;

    /* renamed from: e */
    public Message f10420e;

    /* renamed from: f */
    public Button f10421f;

    /* renamed from: g */
    public Message f10422g;

    /* renamed from: h */
    public Button f10423h;

    /* renamed from: i */
    public Message f10424i;

    /* renamed from: j */
    public ScrollView f10425j;

    /* renamed from: k */
    public View f10426k;

    /* renamed from: l */
    public boolean f10427l;

    /* renamed from: m */
    public ListAdapter f10428m;

    /* renamed from: n */
    public int f10429n = -1;

    /* renamed from: o */
    public int f10430o;

    /* renamed from: p */
    public int f10431p;

    /* renamed from: q */
    public int f10432q;

    /* renamed from: r */
    public int f10433r;

    /* renamed from: s */
    public Handler f10434s;

    /* renamed from: t */
    private final Window f10435t;

    /* renamed from: u */
    private CharSequence f10436u;

    /* renamed from: v */
    private CharSequence f10437v;

    /* renamed from: w */
    private View f10438w;

    /* renamed from: x */
    private int f10439x;

    /* renamed from: y */
    private int f10440y;

    /* renamed from: z */
    private int f10441z;

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$a */
    public static class C3526a {

        /* renamed from: A */
        public int f10454A;

        /* renamed from: B */
        public boolean f10455B;

        /* renamed from: C */
        public boolean[] f10456C;

        /* renamed from: D */
        public boolean f10457D;

        /* renamed from: E */
        public boolean f10458E;

        /* renamed from: F */
        public int f10459F = -1;

        /* renamed from: G */
        public OnMultiChoiceClickListener f10460G;

        /* renamed from: H */
        public Cursor f10461H;

        /* renamed from: I */
        public String f10462I;

        /* renamed from: J */
        public String f10463J;

        /* renamed from: K */
        public boolean f10464K;

        /* renamed from: L */
        public OnItemSelectedListener f10465L;

        /* renamed from: M */
        public boolean f10466M = true;

        /* renamed from: a */
        public final Context f10467a;

        /* renamed from: b */
        public final LayoutInflater f10468b;

        /* renamed from: c */
        public int f10469c;

        /* renamed from: d */
        public Drawable f10470d;

        /* renamed from: e */
        public int f10471e;

        /* renamed from: f */
        public CharSequence f10472f;

        /* renamed from: g */
        public View f10473g;

        /* renamed from: h */
        public CharSequence f10474h;

        /* renamed from: i */
        public CharSequence f10475i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f10476j;

        /* renamed from: k */
        public CharSequence f10477k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f10478l;

        /* renamed from: m */
        public CharSequence f10479m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f10480n;

        /* renamed from: o */
        public boolean f10481o;

        /* renamed from: p */
        public OnCancelListener f10482p;

        /* renamed from: q */
        public OnDismissListener f10483q;

        /* renamed from: r */
        public OnKeyListener f10484r;

        /* renamed from: s */
        public CharSequence[] f10485s;

        /* renamed from: t */
        public ListAdapter f10486t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f10487u;

        /* renamed from: v */
        public int f10488v;

        /* renamed from: w */
        public View f10489w;

        /* renamed from: x */
        public int f10490x;

        /* renamed from: y */
        public int f10491y;

        /* renamed from: z */
        public int f10492z;

        public C3526a(Context context) {
            this.f10467a = context;
            this.f10481o = true;
            this.f10468b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* JADX WARNING: type inference failed for: r9v1 */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [com.bytedance.android.live.uikit.dialog.a$c] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [com.bytedance.android.live.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r1v25, types: [com.bytedance.android.live.uikit.dialog.a$a$1] */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v26 */
        /* JADX WARNING: type inference failed for: r1v27 */
        /* JADX WARNING: type inference failed for: r1v28, types: [com.bytedance.android.live.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r1v29, types: [com.bytedance.android.live.uikit.dialog.a$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1
          assigns: [?[OBJECT, ARRAY], com.bytedance.android.live.uikit.dialog.a$a$2, com.bytedance.android.live.uikit.dialog.a$a$1]
          uses: [android.widget.ListAdapter, com.bytedance.android.live.uikit.dialog.a$a$2, com.bytedance.android.live.uikit.dialog.a$a$1]
          mth insns count: 72
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 7 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m12987b(final com.bytedance.android.live.uikit.dialog.C3520a r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f10468b
                int r1 = r11.f10430o
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.bytedance.android.live.uikit.dialog.RecycleListView r0 = (com.bytedance.android.live.uikit.dialog.RecycleListView) r0
                boolean r1 = r10.f10457D
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f10461H
                if (r1 != 0) goto L_0x0026
                com.bytedance.android.live.uikit.dialog.a$a$1 r9 = new com.bytedance.android.live.uikit.dialog.a$a$1
                android.content.Context r3 = r10.f10467a
                int r4 = r11.f10431p
                r5 = 2131302026(0x7f09168a, float:1.8222126E38)
                java.lang.CharSequence[] r6 = r10.f10485s
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                com.bytedance.android.live.uikit.dialog.a$a$2 r9 = new com.bytedance.android.live.uikit.dialog.a$a$2
                android.content.Context r3 = r10.f10467a
                android.database.Cursor r4 = r10.f10461H
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.f10458E
                if (r1 == 0) goto L_0x003d
                int r1 = r11.f10432q
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.f10433r
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.f10461H
                r2 = 2131302026(0x7f09168a, float:1.8222126E38)
                if (r1 != 0) goto L_0x0058
                android.widget.ListAdapter r1 = r10.f10486t
                if (r1 == 0) goto L_0x004e
                android.widget.ListAdapter r1 = r10.f10486t
                goto L_0x006d
            L_0x004e:
                com.bytedance.android.live.uikit.dialog.a$c r1 = new com.bytedance.android.live.uikit.dialog.a$c
                android.content.Context r3 = r10.f10467a
                java.lang.CharSequence[] r5 = r10.f10485s
                r1.<init>(r3, r4, r2, r5)
                goto L_0x006d
            L_0x0058:
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f10467a
                android.database.Cursor r5 = r10.f10461H
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.f10462I
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x006d:
                r9 = r1
            L_0x006e:
                r11.f10428m = r9
                int r1 = r10.f10459F
                r11.f10429n = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f10487u
                if (r1 == 0) goto L_0x0081
                com.bytedance.android.live.uikit.dialog.a$a$3 r1 = new com.bytedance.android.live.uikit.dialog.a$a$3
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f10460G
                if (r1 == 0) goto L_0x008d
                com.bytedance.android.live.uikit.dialog.a$a$4 r1 = new com.bytedance.android.live.uikit.dialog.a$a$4
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f10465L
                if (r1 == 0) goto L_0x0096
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f10465L
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f10458E
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f10457D
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                boolean r1 = r10.f10466M
                r0.f10400a = r1
                r11.f10418c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.dialog.C3520a.C3526a.m12987b(com.bytedance.android.live.uikit.dialog.a):void");
        }

        /* renamed from: a */
        public final void mo10635a(C3520a aVar) {
            if (this.f10473g != null) {
                aVar.f10426k = this.f10473g;
            } else {
                if (this.f10472f != null) {
                    aVar.mo10623a(this.f10472f);
                }
                if (this.f10470d != null) {
                    aVar.mo10620a(this.f10470d);
                }
                if (this.f10469c != 0) {
                    aVar.mo10625b(this.f10469c);
                }
                if (this.f10471e != 0) {
                    aVar.mo10625b(aVar.mo10628c(this.f10471e));
                }
            }
            if (this.f10474h != null) {
                aVar.mo10626b(this.f10474h);
            }
            if (this.f10475i != null) {
                aVar.mo10619a(-1, this.f10475i, this.f10476j, null);
            }
            if (this.f10477k != null) {
                aVar.mo10619a(-2, this.f10477k, this.f10478l, null);
            }
            if (this.f10479m != null) {
                aVar.mo10619a(-3, this.f10479m, this.f10480n, null);
            }
            if (this.f10464K) {
                aVar.f10427l = true;
            }
            if (!(this.f10485s == null && this.f10461H == null && this.f10486t == null)) {
                m12987b(aVar);
            }
            if (this.f10489w == null) {
                if (this.f10488v != 0) {
                    aVar.mo10618a(this.f10488v);
                }
            } else if (this.f10455B) {
                aVar.mo10622a(this.f10489w, this.f10490x, this.f10491y, this.f10492z, this.f10454A);
            } else {
                aVar.mo10621a(this.f10489w);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$b */
    static final class C3531b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f10505a;

        public C3531b(DialogInterface dialogInterface) {
            this.f10505a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f10505a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$c */
    static class C3532c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C3532c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, R.id.dh_, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo10623a(CharSequence charSequence) {
        this.f10436u = charSequence;
        if (this.f10410J != null) {
            this.f10410J.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final boolean mo10624a(int i, KeyEvent keyEvent) {
        return this.f10425j != null && this.f10425j.executeKeyEvent(keyEvent);
    }

    /* renamed from: b */
    private int m12969b() {
        if (this.f10413M == 0) {
            return this.f10412L;
        }
        if (this.f10414N == 1) {
            return this.f10413M;
        }
        return this.f10412L;
    }

    /* renamed from: c */
    private void m12972c() {
        if (VERSION.SDK_INT >= 20) {
            View decorView = this.f10435t.getDecorView();
            final View findViewById = this.f10435t.findViewById(R.id.c_b);
            if (!(findViewById == null || decorView == null)) {
                decorView.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        if (windowInsets.isRound()) {
                            int dimensionPixelOffset = C3520a.this.f10416a.getResources().getDimensionPixelOffset(R.dimen.bw);
                            findViewById.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        }
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                decorView.setFitsSystemWindows(true);
                decorView.requestApplyInsets();
            }
        }
    }

    /* renamed from: a */
    public final void mo10617a() {
        this.f10435t.requestFeature(1);
        this.f10435t.setContentView(m12969b());
        m12973d();
        m12972c();
    }

    /* renamed from: e */
    private boolean m12974e() {
        boolean z;
        this.f10419d = (Button) this.f10435t.findViewById(R.id.s8);
        this.f10419d.setOnClickListener(this.f10415O);
        if (TextUtils.isEmpty(this.f10404D)) {
            this.f10419d.setVisibility(8);
            z = false;
        } else {
            this.f10419d.setText(this.f10404D);
            this.f10419d.setVisibility(0);
            z = true;
        }
        this.f10421f = (Button) this.f10435t.findViewById(R.id.s9);
        this.f10421f.setOnClickListener(this.f10415O);
        if (TextUtils.isEmpty(this.f10405E)) {
            this.f10421f.setVisibility(8);
        } else {
            this.f10421f.setText(this.f10405E);
            this.f10421f.setVisibility(0);
            z |= true;
        }
        this.f10423h = (Button) this.f10435t.findViewById(R.id.s_);
        this.f10423h.setOnClickListener(this.f10415O);
        if (TextUtils.isEmpty(this.f10406F)) {
            this.f10423h.setVisibility(8);
        } else {
            this.f10423h.setText(this.f10406F);
            this.f10423h.setVisibility(0);
            z |= true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m12973d() {
        View view;
        boolean z;
        View view2;
        ViewGroup viewGroup = (ViewGroup) this.f10435t.findViewById(R.id.a1u);
        m12970b(viewGroup);
        boolean e = m12974e();
        ViewGroup viewGroup2 = (ViewGroup) this.f10435t.findViewById(R.id.dli);
        boolean a = m12968a(viewGroup2);
        View findViewById = this.f10435t.findViewById(R.id.sc);
        if (!e) {
            findViewById.setVisibility(8);
            if (!(this.f10437v != null || this.f10418c == null || this.f10418c.getParent() == null)) {
                this.f10418c.setPadding(this.f10418c.getPaddingLeft(), this.f10418c.getPaddingTop(), this.f10418c.getPaddingRight(), this.f10418c.getPaddingTop());
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.f10435t.findViewById(R.id.a5n);
        boolean z2 = false;
        if (this.f10438w != null) {
            view = this.f10438w;
        } else if (this.f10439x != 0) {
            view = LayoutInflater.from(this.f10416a).inflate(this.f10439x, frameLayout, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m12971b(view)) {
            this.f10435t.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout2 = (FrameLayout) this.f10435t.findViewById(R.id.a5m);
            frameLayout2.addView(view, new LayoutParams(-1, -1));
            if (this.f10403C) {
                frameLayout2.setPadding(this.f10440y, this.f10441z, this.f10401A, this.f10402B);
            }
            if (this.f10418c != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (a) {
            if (this.f10437v == null && view == null && this.f10418c == null) {
                view2 = this.f10435t.findViewById(R.id.dju);
            } else {
                view2 = this.f10435t.findViewById(R.id.djs);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (viewGroup.getVisibility() == 0) {
            z2 = true;
        }
        if (e && a && !z && !z2) {
            C9738o.m28702a((View) viewGroup2, -3, -3, -3, (int) C9738o.m28708b(this.f10416a, 16.0f));
        }
        m12966a(null, viewGroup2, viewGroup, frameLayout, findViewById, a, z, e);
    }

    /* renamed from: a */
    public final void mo10621a(View view) {
        this.f10438w = view;
        this.f10439x = 0;
        this.f10403C = false;
    }

    /* renamed from: a */
    public final void mo10618a(int i) {
        this.f10438w = null;
        this.f10439x = i;
        this.f10403C = false;
    }

    /* renamed from: b */
    public final void mo10626b(CharSequence charSequence) {
        this.f10437v = charSequence;
        if (this.f10411K != null) {
            this.f10411K.setText(charSequence);
        }
    }

    /* renamed from: c */
    public final int mo10628c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f10416a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    private static boolean m12971b(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m12971b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo10625b(int i) {
        this.f10408H = null;
        this.f10407G = i;
        if (this.f10409I != null) {
            if (i != 0) {
                this.f10409I.setImageResource(this.f10407G);
                return;
            }
            this.f10409I.setVisibility(8);
        }
    }

    /* renamed from: a */
    private boolean m12968a(ViewGroup viewGroup) {
        if (this.f10426k != null) {
            viewGroup.addView(this.f10426k, 0, new LayoutParams(-1, -2));
            this.f10435t.findViewById(R.id.dkl).setVisibility(8);
        } else {
            this.f10409I = (ImageView) this.f10435t.findViewById(R.id.ax9);
            if (!TextUtils.isEmpty(this.f10436u)) {
                this.f10410J = (TextView) this.f10435t.findViewById(R.id.f4);
                this.f10410J.setText(this.f10436u);
                if (this.f10407G != 0) {
                    this.f10409I.setImageResource(this.f10407G);
                } else if (this.f10408H != null) {
                    this.f10409I.setImageDrawable(this.f10408H);
                } else {
                    this.f10410J.setPadding(this.f10409I.getPaddingLeft(), this.f10409I.getPaddingTop(), this.f10409I.getPaddingRight(), this.f10409I.getPaddingBottom());
                    this.f10409I.setVisibility(8);
                }
            } else {
                this.f10435t.findViewById(R.id.dkl).setVisibility(8);
                this.f10409I.setVisibility(8);
                viewGroup.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m12970b(ViewGroup viewGroup) {
        this.f10425j = (ScrollView) this.f10435t.findViewById(R.id.czd);
        this.f10425j.setFocusable(false);
        this.f10411K = (TextView) this.f10435t.findViewById(R.id.by6);
        if (this.f10411K != null) {
            if (this.f10437v != null) {
                this.f10411K.setText(this.f10437v);
            } else {
                this.f10411K.setVisibility(8);
                this.f10425j.removeView(this.f10411K);
                if (this.f10418c != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f10425j.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f10425j);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f10418c, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
            final View findViewById = this.f10435t.findViewById(R.id.czc);
            final View findViewById2 = this.f10435t.findViewById(R.id.czb);
            if (!(findViewById == null && findViewById2 == null)) {
                if (this.f10437v != null) {
                    this.f10425j.post(new Runnable() {
                        public final void run() {
                            C3520a.m12967a(C3520a.this.f10425j, findViewById, findViewById2);
                        }
                    });
                } else if (this.f10418c != null) {
                    this.f10418c.setOnScrollListener(new OnScrollListener() {
                        public final void onScrollStateChanged(AbsListView absListView, int i) {
                        }

                        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            C3520a.m12967a(absListView, findViewById, findViewById2);
                        }
                    });
                    this.f10418c.post(new Runnable() {
                        public final void run() {
                            C3520a.m12967a(C3520a.this.f10418c, findViewById, findViewById2);
                        }
                    });
                } else {
                    if (findViewById != null) {
                        viewGroup.removeView(findViewById);
                    }
                    if (findViewById2 != null) {
                        viewGroup.removeView(findViewById2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10620a(Drawable drawable) {
        this.f10408H = drawable;
        this.f10407G = 0;
        if (this.f10409I != null) {
            if (drawable != null) {
                this.f10409I.setImageDrawable(drawable);
                return;
            }
            this.f10409I.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final boolean mo10627b(int i, KeyEvent keyEvent) {
        if (this.f10425j == null || !this.f10425j.executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public C3520a(Context context, DialogInterface dialogInterface, Window window) {
        this.f10416a = context;
        this.f10417b = dialogInterface;
        this.f10435t = window;
        this.f10434s = new C3531b(dialogInterface);
        this.f10412L = R.layout.acq;
        this.f10413M = 0;
        this.f10430o = R.layout.acr;
        this.f10431p = R.layout.act;
        this.f10432q = R.layout.acu;
        this.f10433r = R.layout.acs;
    }

    /* renamed from: a */
    public static void m12967a(View view, View view2, View view3) {
        int i;
        if (VERSION.SDK_INT >= 14) {
            int i2 = 4;
            if (view2 != null) {
                if (view.canScrollVertically(-1)) {
                    i = 0;
                } else {
                    i = 4;
                }
                view2.setVisibility(i);
            }
            if (view3 != null) {
                if (view.canScrollVertically(1)) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo10619a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f10434s.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f10406F = charSequence;
                this.f10424i = message;
                return;
            case -2:
                this.f10405E = charSequence;
                this.f10422g = message;
                return;
            case -1:
                this.f10404D = charSequence;
                this.f10420e = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo10622a(View view, int i, int i2, int i3, int i4) {
        this.f10438w = view;
        this.f10439x = 0;
        this.f10403C = true;
        this.f10440y = i;
        this.f10441z = i2;
        this.f10401A = i3;
        this.f10402B = i4;
    }

    /* renamed from: a */
    private void m12966a(TypedArray typedArray, View view, View view2, View view3, View view4, boolean z, boolean z2, boolean z3) {
        ListView listView = this.f10418c;
        if (listView != null && this.f10428m != null) {
            listView.setAdapter(this.f10428m);
            int i = this.f10429n;
            if (i >= 0) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }
}
