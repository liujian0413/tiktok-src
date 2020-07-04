package com.bytedance.ies.uikit.dialog;

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

/* renamed from: com.bytedance.ies.uikit.dialog.a */
public final class C11016a {

    /* renamed from: A */
    private int f29810A;

    /* renamed from: B */
    private int f29811B;

    /* renamed from: C */
    private boolean f29812C;

    /* renamed from: D */
    private CharSequence f29813D;

    /* renamed from: E */
    private CharSequence f29814E;

    /* renamed from: F */
    private CharSequence f29815F;

    /* renamed from: G */
    private int f29816G;

    /* renamed from: H */
    private Drawable f29817H;

    /* renamed from: I */
    private ImageView f29818I;

    /* renamed from: J */
    private TextView f29819J;

    /* renamed from: K */
    private TextView f29820K;

    /* renamed from: L */
    private int f29821L;

    /* renamed from: M */
    private int f29822M;

    /* renamed from: N */
    private int f29823N;

    /* renamed from: O */
    private final OnClickListener f29824O = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == C11016a.this.f29828d && C11016a.this.f29829e != null) {
                message = Message.obtain(C11016a.this.f29829e);
            } else if (view == C11016a.this.f29830f && C11016a.this.f29831g != null) {
                message = Message.obtain(C11016a.this.f29831g);
            } else if (view != C11016a.this.f29832h || C11016a.this.f29833i == null) {
                message = null;
            } else {
                message = Message.obtain(C11016a.this.f29833i);
            }
            if (message != null) {
                message.sendToTarget();
            }
            C11016a.this.f29843s.obtainMessage(1, C11016a.this.f29826b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f29825a;

    /* renamed from: b */
    public final DialogInterface f29826b;

    /* renamed from: c */
    public ListView f29827c;

    /* renamed from: d */
    public Button f29828d;

    /* renamed from: e */
    public Message f29829e;

    /* renamed from: f */
    public Button f29830f;

    /* renamed from: g */
    public Message f29831g;

    /* renamed from: h */
    public Button f29832h;

    /* renamed from: i */
    public Message f29833i;

    /* renamed from: j */
    public ScrollView f29834j;

    /* renamed from: k */
    public View f29835k;

    /* renamed from: l */
    public boolean f29836l;

    /* renamed from: m */
    public ListAdapter f29837m;

    /* renamed from: n */
    public int f29838n = -1;

    /* renamed from: o */
    public int f29839o;

    /* renamed from: p */
    public int f29840p;

    /* renamed from: q */
    public int f29841q;

    /* renamed from: r */
    public int f29842r;

    /* renamed from: s */
    public Handler f29843s;

    /* renamed from: t */
    private final Window f29844t;

    /* renamed from: u */
    private CharSequence f29845u;

    /* renamed from: v */
    private CharSequence f29846v;

    /* renamed from: w */
    private View f29847w;

    /* renamed from: x */
    private int f29848x;

    /* renamed from: y */
    private int f29849y;

    /* renamed from: z */
    private int f29850z;

    /* renamed from: com.bytedance.ies.uikit.dialog.a$a */
    public static class C11022a {

        /* renamed from: A */
        public int f29863A;

        /* renamed from: B */
        public boolean f29864B;

        /* renamed from: C */
        public boolean[] f29865C;

        /* renamed from: D */
        public boolean f29866D;

        /* renamed from: E */
        public boolean f29867E;

        /* renamed from: F */
        public int f29868F = -1;

        /* renamed from: G */
        public OnMultiChoiceClickListener f29869G;

        /* renamed from: H */
        public Cursor f29870H;

        /* renamed from: I */
        public String f29871I;

        /* renamed from: J */
        public String f29872J;

        /* renamed from: K */
        public boolean f29873K;

        /* renamed from: L */
        public OnItemSelectedListener f29874L;

        /* renamed from: M */
        public boolean f29875M = true;

        /* renamed from: a */
        public final Context f29876a;

        /* renamed from: b */
        public final LayoutInflater f29877b;

        /* renamed from: c */
        public int f29878c;

        /* renamed from: d */
        public Drawable f29879d;

        /* renamed from: e */
        public int f29880e;

        /* renamed from: f */
        public CharSequence f29881f;

        /* renamed from: g */
        public View f29882g;

        /* renamed from: h */
        public CharSequence f29883h;

        /* renamed from: i */
        public CharSequence f29884i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f29885j;

        /* renamed from: k */
        public CharSequence f29886k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f29887l;

        /* renamed from: m */
        public CharSequence f29888m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f29889n;

        /* renamed from: o */
        public boolean f29890o;

        /* renamed from: p */
        public OnCancelListener f29891p;

        /* renamed from: q */
        public OnDismissListener f29892q;

        /* renamed from: r */
        public OnKeyListener f29893r;

        /* renamed from: s */
        public CharSequence[] f29894s;

        /* renamed from: t */
        public ListAdapter f29895t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f29896u;

        /* renamed from: v */
        public int f29897v;

        /* renamed from: w */
        public View f29898w;

        /* renamed from: x */
        public int f29899x;

        /* renamed from: y */
        public int f29900y;

        /* renamed from: z */
        public int f29901z;

        public C11022a(Context context) {
            this.f29876a = context;
            this.f29890o = true;
            this.f29877b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* JADX WARNING: type inference failed for: r9v1 */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [com.bytedance.ies.uikit.dialog.a$c] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [com.bytedance.ies.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r1v25, types: [com.bytedance.ies.uikit.dialog.a$a$1] */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v26 */
        /* JADX WARNING: type inference failed for: r1v27 */
        /* JADX WARNING: type inference failed for: r1v28, types: [com.bytedance.ies.uikit.dialog.a$a$2] */
        /* JADX WARNING: type inference failed for: r1v29, types: [com.bytedance.ies.uikit.dialog.a$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1
          assigns: [?[OBJECT, ARRAY], com.bytedance.ies.uikit.dialog.a$a$2, com.bytedance.ies.uikit.dialog.a$a$1]
          uses: [android.widget.ListAdapter, com.bytedance.ies.uikit.dialog.a$a$2, com.bytedance.ies.uikit.dialog.a$a$1]
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
        private void m32306b(final com.bytedance.ies.uikit.dialog.C11016a r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f29877b
                int r1 = r11.f29839o
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                com.bytedance.ies.uikit.dialog.RecycleListView r0 = (com.bytedance.ies.uikit.dialog.RecycleListView) r0
                boolean r1 = r10.f29866D
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f29870H
                if (r1 != 0) goto L_0x0026
                com.bytedance.ies.uikit.dialog.a$a$1 r9 = new com.bytedance.ies.uikit.dialog.a$a$1
                android.content.Context r3 = r10.f29876a
                int r4 = r11.f29840p
                r5 = 2131302026(0x7f09168a, float:1.8222126E38)
                java.lang.CharSequence[] r6 = r10.f29894s
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                com.bytedance.ies.uikit.dialog.a$a$2 r9 = new com.bytedance.ies.uikit.dialog.a$a$2
                android.content.Context r3 = r10.f29876a
                android.database.Cursor r4 = r10.f29870H
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.f29867E
                if (r1 == 0) goto L_0x003d
                int r1 = r11.f29841q
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.f29842r
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.f29870H
                r2 = 2131302026(0x7f09168a, float:1.8222126E38)
                if (r1 != 0) goto L_0x0058
                android.widget.ListAdapter r1 = r10.f29895t
                if (r1 == 0) goto L_0x004e
                android.widget.ListAdapter r1 = r10.f29895t
                goto L_0x006d
            L_0x004e:
                com.bytedance.ies.uikit.dialog.a$c r1 = new com.bytedance.ies.uikit.dialog.a$c
                android.content.Context r3 = r10.f29876a
                java.lang.CharSequence[] r5 = r10.f29894s
                r1.<init>(r3, r4, r2, r5)
                goto L_0x006d
            L_0x0058:
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f29876a
                android.database.Cursor r5 = r10.f29870H
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.f29871I
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x006d:
                r9 = r1
            L_0x006e:
                r11.f29837m = r9
                int r1 = r10.f29868F
                r11.f29838n = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f29896u
                if (r1 == 0) goto L_0x0081
                com.bytedance.ies.uikit.dialog.a$a$3 r1 = new com.bytedance.ies.uikit.dialog.a$a$3
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f29869G
                if (r1 == 0) goto L_0x008d
                com.bytedance.ies.uikit.dialog.a$a$4 r1 = new com.bytedance.ies.uikit.dialog.a$a$4
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f29874L
                if (r1 == 0) goto L_0x0096
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f29874L
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f29867E
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f29866D
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                boolean r1 = r10.f29875M
                r0.f29809a = r1
                r11.f29827c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.C11016a.C11022a.m32306b(com.bytedance.ies.uikit.dialog.a):void");
        }

        /* renamed from: a */
        public final void mo26618a(C11016a aVar) {
            if (this.f29882g != null) {
                aVar.f29835k = this.f29882g;
            } else {
                if (this.f29881f != null) {
                    aVar.mo26605a(this.f29881f);
                }
                if (this.f29879d != null) {
                    aVar.mo26602a(this.f29879d);
                }
                if (this.f29878c != 0) {
                    aVar.mo26607b(this.f29878c);
                }
                if (this.f29880e != 0) {
                    aVar.mo26607b(aVar.mo26610c(this.f29880e));
                }
            }
            if (this.f29883h != null) {
                aVar.mo26608b(this.f29883h);
            }
            if (this.f29884i != null) {
                aVar.mo26601a(-1, this.f29884i, this.f29885j, null);
            }
            if (this.f29886k != null) {
                aVar.mo26601a(-2, this.f29886k, this.f29887l, null);
            }
            if (this.f29888m != null) {
                aVar.mo26601a(-3, this.f29888m, this.f29889n, null);
            }
            if (this.f29873K) {
                aVar.f29836l = true;
            }
            if (!(this.f29894s == null && this.f29870H == null && this.f29895t == null)) {
                m32306b(aVar);
            }
            if (this.f29898w == null) {
                if (this.f29897v != 0) {
                    aVar.mo26600a(this.f29897v);
                }
            } else if (this.f29864B) {
                aVar.mo26604a(this.f29898w, this.f29899x, this.f29900y, this.f29901z, this.f29863A);
            } else {
                aVar.mo26603a(this.f29898w);
            }
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$b */
    static final class C11027b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f29914a;

        public C11027b(DialogInterface dialogInterface) {
            this.f29914a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f29914a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$c */
    static class C11028c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C11028c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, R.id.dh_, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo26605a(CharSequence charSequence) {
        this.f29845u = charSequence;
        if (this.f29819J != null) {
            this.f29819J.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final boolean mo26606a(int i, KeyEvent keyEvent) {
        return this.f29834j != null && this.f29834j.executeKeyEvent(keyEvent);
    }

    /* renamed from: b */
    private int m32287b() {
        if (this.f29822M == 0) {
            return this.f29821L;
        }
        if (this.f29823N == 1) {
            return this.f29822M;
        }
        return this.f29821L;
    }

    /* renamed from: c */
    private void m32290c() {
        if (VERSION.SDK_INT >= 20) {
            View decorView = this.f29844t.getDecorView();
            final View findViewById = this.f29844t.findViewById(R.id.c_b);
            if (!(findViewById == null || decorView == null)) {
                decorView.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        if (windowInsets.isRound()) {
                            int dimensionPixelOffset = C11016a.this.f29825a.getResources().getDimensionPixelOffset(R.dimen.bw);
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
    public final void mo26599a() {
        this.f29844t.requestFeature(1);
        this.f29844t.setContentView(m32287b());
        m32291d();
        m32290c();
    }

    /* renamed from: e */
    private boolean m32292e() {
        boolean z;
        this.f29828d = (Button) this.f29844t.findViewById(R.id.s8);
        this.f29828d.setOnClickListener(this.f29824O);
        if (TextUtils.isEmpty(this.f29813D)) {
            this.f29828d.setVisibility(8);
            z = false;
        } else {
            this.f29828d.setText(this.f29813D);
            this.f29828d.setVisibility(0);
            z = true;
        }
        this.f29830f = (Button) this.f29844t.findViewById(R.id.s9);
        this.f29830f.setOnClickListener(this.f29824O);
        if (TextUtils.isEmpty(this.f29814E)) {
            this.f29830f.setVisibility(8);
        } else {
            this.f29830f.setText(this.f29814E);
            this.f29830f.setVisibility(0);
            z |= true;
        }
        this.f29832h = (Button) this.f29844t.findViewById(R.id.s_);
        this.f29832h.setOnClickListener(this.f29824O);
        if (TextUtils.isEmpty(this.f29815F)) {
            this.f29832h.setVisibility(8);
        } else {
            this.f29832h.setText(this.f29815F);
            this.f29832h.setVisibility(0);
            z |= true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m32291d() {
        View view;
        boolean z;
        View view2;
        ViewGroup viewGroup = (ViewGroup) this.f29844t.findViewById(R.id.a1u);
        m32288b(viewGroup);
        boolean e = m32292e();
        ViewGroup viewGroup2 = (ViewGroup) this.f29844t.findViewById(R.id.dli);
        boolean a = m32286a(viewGroup2);
        View findViewById = this.f29844t.findViewById(R.id.sc);
        if (!e) {
            findViewById.setVisibility(8);
            if (!(this.f29846v != null || this.f29827c == null || this.f29827c.getParent() == null)) {
                this.f29827c.setPadding(this.f29827c.getPaddingLeft(), this.f29827c.getPaddingTop(), this.f29827c.getPaddingRight(), this.f29827c.getPaddingTop());
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.f29844t.findViewById(R.id.a5n);
        boolean z2 = false;
        if (this.f29847w != null) {
            view = this.f29847w;
        } else if (this.f29848x != 0) {
            view = LayoutInflater.from(this.f29825a).inflate(this.f29848x, frameLayout, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m32289b(view)) {
            this.f29844t.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout2 = (FrameLayout) this.f29844t.findViewById(R.id.a5m);
            frameLayout2.addView(view, new LayoutParams(-1, -1));
            if (this.f29812C) {
                frameLayout2.setPadding(this.f29849y, this.f29850z, this.f29810A, this.f29811B);
            }
            if (this.f29827c != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (a) {
            if (this.f29846v == null && view == null && this.f29827c == null) {
                view2 = this.f29844t.findViewById(R.id.dju);
            } else {
                view2 = this.f29844t.findViewById(R.id.djs);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (viewGroup.getVisibility() == 0) {
            z2 = true;
        }
        if (e && a && !z && !z2) {
            C9738o.m28702a((View) viewGroup2, -3, -3, -3, (int) C9738o.m28708b(this.f29825a, 16.0f));
        }
        m32284a(null, viewGroup2, viewGroup, frameLayout, findViewById, a, z, e);
    }

    /* renamed from: a */
    public final void mo26603a(View view) {
        this.f29847w = view;
        this.f29848x = 0;
        this.f29812C = false;
    }

    /* renamed from: a */
    public final void mo26600a(int i) {
        this.f29847w = null;
        this.f29848x = i;
        this.f29812C = false;
    }

    /* renamed from: b */
    public final void mo26608b(CharSequence charSequence) {
        this.f29846v = charSequence;
        if (this.f29820K != null) {
            this.f29820K.setText(charSequence);
        }
    }

    /* renamed from: c */
    public final int mo26610c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f29825a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public final Button mo26611d(int i) {
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                return this.f29832h;
            case -2:
                return this.f29830f;
            case -1:
                return this.f29828d;
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static boolean m32289b(View view) {
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
            if (m32289b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo26607b(int i) {
        this.f29817H = null;
        this.f29816G = i;
        if (this.f29818I != null) {
            if (i != 0) {
                this.f29818I.setImageResource(this.f29816G);
                return;
            }
            this.f29818I.setVisibility(8);
        }
    }

    /* renamed from: a */
    private boolean m32286a(ViewGroup viewGroup) {
        if (this.f29835k != null) {
            viewGroup.addView(this.f29835k, 0, new LayoutParams(-1, -2));
            this.f29844t.findViewById(R.id.dkl).setVisibility(8);
        } else {
            this.f29818I = (ImageView) this.f29844t.findViewById(R.id.ax9);
            if (!TextUtils.isEmpty(this.f29845u)) {
                this.f29819J = (TextView) this.f29844t.findViewById(R.id.f4);
                this.f29819J.setText(this.f29845u);
                if (this.f29816G != 0) {
                    this.f29818I.setImageResource(this.f29816G);
                } else if (this.f29817H != null) {
                    this.f29818I.setImageDrawable(this.f29817H);
                } else {
                    this.f29819J.setPadding(this.f29818I.getPaddingLeft(), this.f29818I.getPaddingTop(), this.f29818I.getPaddingRight(), this.f29818I.getPaddingBottom());
                    this.f29818I.setVisibility(8);
                }
            } else {
                this.f29844t.findViewById(R.id.dkl).setVisibility(8);
                this.f29818I.setVisibility(8);
                viewGroup.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m32288b(ViewGroup viewGroup) {
        this.f29834j = (ScrollView) this.f29844t.findViewById(R.id.czd);
        this.f29834j.setFocusable(false);
        this.f29820K = (TextView) this.f29844t.findViewById(R.id.by6);
        if (this.f29820K != null) {
            if (this.f29846v != null) {
                this.f29820K.setText(this.f29846v);
            } else {
                this.f29820K.setVisibility(8);
                this.f29834j.removeView(this.f29820K);
                if (this.f29827c != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f29834j.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f29834j);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f29827c, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
            final View findViewById = this.f29844t.findViewById(R.id.czc);
            final View findViewById2 = this.f29844t.findViewById(R.id.czb);
            if (!(findViewById == null && findViewById2 == null)) {
                if (this.f29846v != null) {
                    this.f29834j.post(new Runnable() {
                        public final void run() {
                            C11016a.m32285a(C11016a.this.f29834j, findViewById, findViewById2);
                        }
                    });
                } else if (this.f29827c != null) {
                    this.f29827c.setOnScrollListener(new OnScrollListener() {
                        public final void onScrollStateChanged(AbsListView absListView, int i) {
                        }

                        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            C11016a.m32285a(absListView, findViewById, findViewById2);
                        }
                    });
                    this.f29827c.post(new Runnable() {
                        public final void run() {
                            C11016a.m32285a(C11016a.this.f29827c, findViewById, findViewById2);
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
    public final void mo26602a(Drawable drawable) {
        this.f29817H = drawable;
        this.f29816G = 0;
        if (this.f29818I != null) {
            if (drawable != null) {
                this.f29818I.setImageDrawable(drawable);
                return;
            }
            this.f29818I.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final boolean mo26609b(int i, KeyEvent keyEvent) {
        if (this.f29834j == null || !this.f29834j.executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public C11016a(Context context, DialogInterface dialogInterface, Window window) {
        this.f29825a = context;
        this.f29826b = dialogInterface;
        this.f29844t = window;
        this.f29843s = new C11027b(dialogInterface);
        this.f29821L = R.layout.ajk;
        this.f29822M = 0;
        this.f29839o = R.layout.ajn;
        this.f29840p = R.layout.ajp;
        this.f29841q = R.layout.ajq;
        this.f29842r = R.layout.ajo;
    }

    /* renamed from: a */
    public static void m32285a(View view, View view2, View view3) {
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
    public final void mo26601a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f29843s.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f29815F = charSequence;
                this.f29833i = message;
                return;
            case -2:
                this.f29814E = charSequence;
                this.f29831g = message;
                return;
            case -1:
                this.f29813D = charSequence;
                this.f29829e = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo26604a(View view, int i, int i2, int i3, int i4) {
        this.f29847w = view;
        this.f29848x = 0;
        this.f29812C = true;
        this.f29849y = i;
        this.f29850z = i2;
        this.f29810A = i3;
        this.f29811B = i4;
    }

    /* renamed from: a */
    private void m32284a(TypedArray typedArray, View view, View view2, View view3, View view4, boolean z, boolean z2, boolean z3) {
        ListView listView = this.f29827c;
        if (listView != null && this.f29837m != null) {
            listView.setAdapter(this.f29837m);
            int i = this.f29838n;
            if (i >= 0) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }
}
