package android.support.p029v7.app;

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
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.NestedScrollView;
import android.support.p022v4.widget.NestedScrollView.C1017b;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
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
import android.widget.TextView;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
final class AlertController {

    /* renamed from: A */
    private int f3710A;

    /* renamed from: B */
    private int f3711B;

    /* renamed from: C */
    private int f3712C;

    /* renamed from: D */
    private boolean f3713D;

    /* renamed from: E */
    private CharSequence f3714E;

    /* renamed from: F */
    private Drawable f3715F;

    /* renamed from: G */
    private CharSequence f3716G;

    /* renamed from: H */
    private Drawable f3717H;

    /* renamed from: I */
    private CharSequence f3718I;

    /* renamed from: J */
    private Drawable f3719J;

    /* renamed from: K */
    private int f3720K;

    /* renamed from: L */
    private Drawable f3721L;

    /* renamed from: M */
    private ImageView f3722M;

    /* renamed from: N */
    private TextView f3723N;

    /* renamed from: O */
    private TextView f3724O;

    /* renamed from: P */
    private int f3725P;

    /* renamed from: Q */
    private int f3726Q;

    /* renamed from: R */
    private boolean f3727R;

    /* renamed from: S */
    private final OnClickListener f3728S = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == AlertController.this.f3731c && AlertController.this.f3732d != null) {
                message = Message.obtain(AlertController.this.f3732d);
            } else if (view == AlertController.this.f3733e && AlertController.this.f3734f != null) {
                message = Message.obtain(AlertController.this.f3734f);
            } else if (view != AlertController.this.f3735g || AlertController.this.f3736h == null) {
                message = null;
            } else {
                message = Message.obtain(AlertController.this.f3736h);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.f3746r.obtainMessage(1, AlertController.this.f3729a).sendToTarget();
        }
    };

    /* renamed from: a */
    final AppCompatDialog f3729a;

    /* renamed from: b */
    public ListView f3730b;

    /* renamed from: c */
    Button f3731c;

    /* renamed from: d */
    Message f3732d;

    /* renamed from: e */
    Button f3733e;

    /* renamed from: f */
    Message f3734f;

    /* renamed from: g */
    Button f3735g;

    /* renamed from: h */
    Message f3736h;

    /* renamed from: i */
    NestedScrollView f3737i;

    /* renamed from: j */
    public View f3738j;

    /* renamed from: k */
    ListAdapter f3739k;

    /* renamed from: l */
    int f3740l = -1;

    /* renamed from: m */
    int f3741m;

    /* renamed from: n */
    int f3742n;

    /* renamed from: o */
    int f3743o;

    /* renamed from: p */
    int f3744p;

    /* renamed from: q */
    public int f3745q;

    /* renamed from: r */
    Handler f3746r;

    /* renamed from: s */
    private final Context f3747s;

    /* renamed from: t */
    private final Window f3748t;

    /* renamed from: u */
    private final int f3749u;

    /* renamed from: v */
    private CharSequence f3750v;

    /* renamed from: w */
    private CharSequence f3751w;

    /* renamed from: x */
    private View f3752x;

    /* renamed from: y */
    private int f3753y;

    /* renamed from: z */
    private int f3754z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f3768a;

        /* renamed from: b */
        private final int f3769b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
            this.f3769b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f3768a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        /* renamed from: a */
        public final void mo4210a(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f3768a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f3769b;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C1074a {

        /* renamed from: A */
        public int f3770A;

        /* renamed from: B */
        public int f3771B;

        /* renamed from: C */
        public int f3772C;

        /* renamed from: D */
        public int f3773D;

        /* renamed from: E */
        public boolean f3774E;

        /* renamed from: F */
        public boolean[] f3775F;

        /* renamed from: G */
        public boolean f3776G;

        /* renamed from: H */
        public boolean f3777H;

        /* renamed from: I */
        public int f3778I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f3779J;

        /* renamed from: K */
        public Cursor f3780K;

        /* renamed from: L */
        public String f3781L;

        /* renamed from: M */
        public String f3782M;

        /* renamed from: N */
        public OnItemSelectedListener f3783N;

        /* renamed from: O */
        public boolean f3784O = true;

        /* renamed from: a */
        public final Context f3785a;

        /* renamed from: b */
        public final LayoutInflater f3786b;

        /* renamed from: c */
        public int f3787c;

        /* renamed from: d */
        public Drawable f3788d;

        /* renamed from: e */
        public int f3789e;

        /* renamed from: f */
        public CharSequence f3790f;

        /* renamed from: g */
        public View f3791g;

        /* renamed from: h */
        public CharSequence f3792h;

        /* renamed from: i */
        public CharSequence f3793i;

        /* renamed from: j */
        public Drawable f3794j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f3795k;

        /* renamed from: l */
        public CharSequence f3796l;

        /* renamed from: m */
        public Drawable f3797m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f3798n;

        /* renamed from: o */
        public CharSequence f3799o;

        /* renamed from: p */
        public Drawable f3800p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f3801q;

        /* renamed from: r */
        public boolean f3802r;

        /* renamed from: s */
        public OnCancelListener f3803s;

        /* renamed from: t */
        public OnDismissListener f3804t;

        /* renamed from: u */
        public OnKeyListener f3805u;

        /* renamed from: v */
        public CharSequence[] f3806v;

        /* renamed from: w */
        public ListAdapter f3807w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f3808x;

        /* renamed from: y */
        public int f3809y;

        /* renamed from: z */
        public View f3810z;

        public C1074a(Context context) {
            this.f3785a = context;
            this.f3802r = true;
            this.f3786b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.support.v7.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r9v2, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v22, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: type inference failed for: r9v7 */
        /* JADX WARNING: type inference failed for: r9v8 */
        /* JADX WARNING: type inference failed for: r1v23, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v24, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v4
          assigns: [?[OBJECT, ARRAY], android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          uses: [android.widget.ListAdapter, android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          mth insns count: 69
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
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m4701b(final android.support.p029v7.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f3786b
                int r1 = r11.f3741m
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p029v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f3776G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f3780K
                if (r1 != 0) goto L_0x0026
                android.support.v7.app.AlertController$a$1 r9 = new android.support.v7.app.AlertController$a$1
                android.content.Context r3 = r10.f3785a
                int r4 = r11.f3742n
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f3806v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                android.support.v7.app.AlertController$a$2 r9 = new android.support.v7.app.AlertController$a$2
                android.content.Context r3 = r10.f3785a
                android.database.Cursor r4 = r10.f3780K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.f3777H
                if (r1 == 0) goto L_0x003d
                int r1 = r11.f3743o
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.f3744p
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.f3780K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005e
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f3785a
                android.database.Cursor r5 = r10.f3780K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.f3781L
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                r9 = r1
                goto L_0x006e
            L_0x005e:
                android.widget.ListAdapter r1 = r10.f3807w
                if (r1 == 0) goto L_0x0065
                android.widget.ListAdapter r9 = r10.f3807w
                goto L_0x006e
            L_0x0065:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r1 = r10.f3785a
                java.lang.CharSequence[] r3 = r10.f3806v
                r9.<init>(r1, r4, r2, r3)
            L_0x006e:
                r11.f3739k = r9
                int r1 = r10.f3778I
                r11.f3740l = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f3808x
                if (r1 == 0) goto L_0x0081
                android.support.v7.app.AlertController$a$3 r1 = new android.support.v7.app.AlertController$a$3
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x008d
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f3779J
                if (r1 == 0) goto L_0x008d
                android.support.v7.app.AlertController$a$4 r1 = new android.support.v7.app.AlertController$a$4
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x008d:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f3783N
                if (r1 == 0) goto L_0x0096
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f3783N
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.f3777H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.f3776G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f3730b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.app.AlertController.C1074a.m4701b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public final void mo4211a(AlertController alertController) {
            if (this.f3791g != null) {
                alertController.f3738j = this.f3791g;
            } else {
                if (this.f3790f != null) {
                    alertController.mo4198a(this.f3790f);
                }
                if (this.f3788d != null) {
                    alertController.mo4195a(this.f3788d);
                }
                if (this.f3787c != 0) {
                    alertController.mo4200b(this.f3787c);
                }
                if (this.f3789e != 0) {
                    alertController.mo4200b(alertController.mo4203c(this.f3789e));
                }
            }
            if (this.f3792h != null) {
                alertController.mo4201b(this.f3792h);
            }
            if (!(this.f3793i == null && this.f3794j == null)) {
                alertController.mo4194a(-1, this.f3793i, this.f3795k, (Message) null, this.f3794j);
            }
            if (!(this.f3796l == null && this.f3797m == null)) {
                alertController.mo4194a(-2, this.f3796l, this.f3798n, (Message) null, this.f3797m);
            }
            if (!(this.f3799o == null && this.f3800p == null)) {
                alertController.mo4194a(-3, this.f3799o, this.f3801q, (Message) null, this.f3800p);
            }
            if (!(this.f3806v == null && this.f3780K == null && this.f3807w == null)) {
                m4701b(alertController);
            }
            if (this.f3810z == null) {
                if (this.f3809y != 0) {
                    alertController.mo4193a(this.f3809y);
                }
            } else if (this.f3774E) {
                alertController.mo4197a(this.f3810z, this.f3770A, this.f3771B, this.f3772C, this.f3773D);
            } else {
                alertController.mo4196a(this.f3810z);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    static final class C1079b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f3823a;

        public C1079b(DialogInterface dialogInterface) {
            this.f3823a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f3823a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    static class C1080c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C1080c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo4198a(CharSequence charSequence) {
        this.f3750v = charSequence;
        if (this.f3723N != null) {
            this.f3723N.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo4197a(View view, int i, int i2, int i3, int i4) {
        this.f3752x = view;
        this.f3753y = 0;
        this.f3713D = true;
        this.f3754z = i;
        this.f3710A = i2;
        this.f3711B = i3;
        this.f3712C = i4;
    }

    /* renamed from: a */
    public final void mo4194a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f3746r.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f3718I = charSequence;
                this.f3736h = message;
                this.f3719J = drawable;
                return;
            case -2:
                this.f3716G = charSequence;
                this.f3734f = message;
                this.f3717H = drawable;
                return;
            case -1:
                this.f3714E = charSequence;
                this.f3732d = message;
                this.f3715F = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo4195a(Drawable drawable) {
        this.f3721L = drawable;
        this.f3720K = 0;
        if (this.f3722M != null) {
            if (drawable != null) {
                this.f3722M.setVisibility(0);
                this.f3722M.setImageDrawable(drawable);
                return;
            }
            this.f3722M.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final boolean mo4199a(int i, KeyEvent keyEvent) {
        return this.f3737i != null && this.f3737i.mo3925a(keyEvent);
    }

    /* renamed from: a */
    public final void mo4192a() {
        this.f3729a.setContentView(m4680b());
        m4683c();
    }

    /* renamed from: b */
    private int m4680b() {
        if (this.f3726Q == 0) {
            return this.f3725P;
        }
        if (this.f3745q == 1) {
            return this.f3726Q;
        }
        return this.f3725P;
    }

    /* renamed from: c */
    private void m4683c() {
        boolean z;
        boolean z2;
        boolean z3;
        View view;
        View findViewById = this.f3748t.findViewById(R.id.c_b);
        View findViewById2 = findViewById.findViewById(R.id.dli);
        View findViewById3 = findViewById.findViewById(R.id.a1u);
        View findViewById4 = findViewById.findViewById(R.id.sc);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.a5n);
        m4676a(viewGroup);
        View findViewById5 = viewGroup.findViewById(R.id.dli);
        View findViewById6 = viewGroup.findViewById(R.id.a1u);
        View findViewById7 = viewGroup.findViewById(R.id.sc);
        ViewGroup a = m4674a(findViewById5, findViewById2);
        ViewGroup a2 = m4674a(findViewById6, findViewById3);
        ViewGroup a3 = m4674a(findViewById7, findViewById4);
        m4684c(a2);
        m4685d(a3);
        m4681b(a);
        char c = 0;
        if (viewGroup == null || viewGroup.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (a == null || a.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (a3 == null || a3.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(R.id.dhb);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            if (this.f3737i != null) {
                this.f3737i.setClipToPadding(true);
            }
            View view2 = null;
            if (!(this.f3751w == null && this.f3730b == null)) {
                view2 = a.findViewById(R.id.djt);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(R.id.dhc);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (this.f3730b instanceof RecycleListView) {
            ((RecycleListView) this.f3730b).mo4210a(z2, z3);
        }
        if (!z) {
            if (this.f3730b != null) {
                view = this.f3730b;
            } else {
                view = this.f3737i;
            }
            if (view != null) {
                if (z3) {
                    c = 2;
                }
                m4677a(a2, view, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView = this.f3730b;
        if (listView != null && this.f3739k != null) {
            listView.setAdapter(this.f3739k);
            int i = this.f3740l;
            if (i >= 0) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo4196a(View view) {
        this.f3752x = view;
        this.f3753y = 0;
        this.f3713D = false;
    }

    /* renamed from: b */
    public final void mo4201b(CharSequence charSequence) {
        this.f3751w = charSequence;
        if (this.f3724O != null) {
            this.f3724O.setText(charSequence);
        }
    }

    /* renamed from: c */
    public final int mo4203c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f3747s.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public final Button mo4204d(int i) {
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                return this.f3735g;
            case -2:
                return this.f3733e;
            case -1:
                return this.f3731c;
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static boolean m4682b(View view) {
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
            if (m4682b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m4676a(ViewGroup viewGroup) {
        View view;
        boolean z = false;
        if (this.f3752x != null) {
            view = this.f3752x;
        } else if (this.f3753y != 0) {
            view = LayoutInflater.from(this.f3747s).inflate(this.f3753y, viewGroup, false);
        } else {
            view = null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m4682b(view)) {
            this.f3748t.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f3748t.findViewById(R.id.a5m);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f3713D) {
                frameLayout.setPadding(this.f3754z, this.f3710A, this.f3711B, this.f3712C);
            }
            if (this.f3730b != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f4742g = 0.0f;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    private void m4684c(ViewGroup viewGroup) {
        this.f3737i = (NestedScrollView) this.f3748t.findViewById(R.id.czd);
        this.f3737i.setFocusable(false);
        this.f3737i.setNestedScrollingEnabled(false);
        this.f3724O = (TextView) viewGroup.findViewById(16908299);
        if (this.f3724O != null) {
            if (this.f3751w != null) {
                this.f3724O.setText(this.f3751w);
                return;
            }
            this.f3724O.setVisibility(8);
            this.f3737i.removeView(this.f3724O);
            if (this.f3730b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f3737i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f3737i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f3730b, indexOfChild, new LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo4200b(int i) {
        this.f3721L = null;
        this.f3720K = i;
        if (this.f3722M != null) {
            if (i != 0) {
                this.f3722M.setVisibility(0);
                this.f3722M.setImageResource(this.f3720K);
                return;
            }
            this.f3722M.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m4681b(ViewGroup viewGroup) {
        if (this.f3738j != null) {
            viewGroup.addView(this.f3738j, 0, new LayoutParams(-1, -2));
            this.f3748t.findViewById(R.id.dkl).setVisibility(8);
            return;
        }
        this.f3722M = (ImageView) this.f3748t.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f3750v)) || !this.f3727R) {
            this.f3748t.findViewById(R.id.dkl).setVisibility(8);
            this.f3722M.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f3723N = (TextView) this.f3748t.findViewById(R.id.f4);
        this.f3723N.setText(this.f3750v);
        if (this.f3720K != 0) {
            this.f3722M.setImageResource(this.f3720K);
        } else if (this.f3721L != null) {
            this.f3722M.setImageDrawable(this.f3721L);
        } else {
            this.f3723N.setPadding(this.f3722M.getPaddingLeft(), this.f3722M.getPaddingTop(), this.f3722M.getPaddingRight(), this.f3722M.getPaddingBottom());
            this.f3722M.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static void m4678a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private void m4685d(ViewGroup viewGroup) {
        boolean z;
        this.f3731c = (Button) viewGroup.findViewById(16908313);
        this.f3731c.setOnClickListener(this.f3728S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f3714E) || this.f3715F != null) {
            this.f3731c.setText(this.f3714E);
            if (this.f3715F != null) {
                this.f3715F.setBounds(0, 0, this.f3749u, this.f3749u);
                this.f3731c.setCompoundDrawables(this.f3715F, null, null, null);
            }
            this.f3731c.setVisibility(0);
            z = true;
        } else {
            this.f3731c.setVisibility(8);
            z = false;
        }
        this.f3733e = (Button) viewGroup.findViewById(16908314);
        this.f3733e.setOnClickListener(this.f3728S);
        if (!TextUtils.isEmpty(this.f3716G) || this.f3717H != null) {
            this.f3733e.setText(this.f3716G);
            if (this.f3717H != null) {
                this.f3717H.setBounds(0, 0, this.f3749u, this.f3749u);
                this.f3733e.setCompoundDrawables(this.f3717H, null, null, null);
            }
            this.f3733e.setVisibility(0);
            z |= true;
        } else {
            this.f3733e.setVisibility(8);
        }
        this.f3735g = (Button) viewGroup.findViewById(16908315);
        this.f3735g.setOnClickListener(this.f3728S);
        if (!TextUtils.isEmpty(this.f3718I) || this.f3719J != null) {
            this.f3735g.setText(this.f3718I);
            if (this.f3715F != null) {
                this.f3715F.setBounds(0, 0, this.f3749u, this.f3749u);
                this.f3731c.setCompoundDrawables(this.f3715F, null, null, null);
            }
            this.f3735g.setVisibility(0);
            z |= true;
        } else {
            this.f3735g.setVisibility(8);
        }
        if (m4679a(this.f3747s)) {
            if (z) {
                m4678a(this.f3731c);
            } else if (z) {
                m4678a(this.f3733e);
            } else if (z) {
                m4678a(this.f3735g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static boolean m4679a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ao, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4193a(int i) {
        this.f3752x = null;
        this.f3753y = i;
        this.f3713D = false;
    }

    /* renamed from: a */
    private static ViewGroup m4674a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: b */
    public final boolean mo4202b(int i, KeyEvent keyEvent) {
        if (this.f3737i == null || !this.f3737i.mo3925a(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m4675a(View view, View view2, View view3) {
        int i;
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

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f3747s = context;
        this.f3729a = appCompatDialog;
        this.f3748t = window;
        this.f3746r = new C1079b(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R.attr.ap, 0);
        this.f3725P = obtainStyledAttributes.getResourceId(0, 0);
        this.f3726Q = obtainStyledAttributes.getResourceId(2, 0);
        this.f3741m = obtainStyledAttributes.getResourceId(4, 0);
        this.f3742n = obtainStyledAttributes.getResourceId(5, 0);
        this.f3743o = obtainStyledAttributes.getResourceId(7, 0);
        this.f3744p = obtainStyledAttributes.getResourceId(3, 0);
        this.f3727R = obtainStyledAttributes.getBoolean(6, true);
        this.f3749u = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.mo4365b(1);
    }

    /* renamed from: a */
    private void m4677a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f3748t.findViewById(R.id.czc);
        View findViewById2 = this.f3748t.findViewById(R.id.czb);
        if (VERSION.SDK_INT >= 23) {
            C0991u.m4178a(view, i, 3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        } else {
            final View view2 = null;
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 == null || (i & 2) != 0) {
                view2 = findViewById2;
            } else {
                viewGroup.removeView(findViewById2);
            }
            if (!(findViewById == null && view2 == null)) {
                if (this.f3751w != null) {
                    this.f3737i.setOnScrollChangeListener(new C1017b() {
                        /* renamed from: a */
                        public final void mo3976a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                            AlertController.m4675a(nestedScrollView, findViewById, view2);
                        }
                    });
                    this.f3737i.post(new Runnable() {
                        public final void run() {
                            AlertController.m4675a(AlertController.this.f3737i, findViewById, view2);
                        }
                    });
                } else if (this.f3730b != null) {
                    this.f3730b.setOnScrollListener(new OnScrollListener() {
                        public final void onScrollStateChanged(AbsListView absListView, int i) {
                        }

                        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            AlertController.m4675a(absListView, findViewById, view2);
                        }
                    });
                    this.f3730b.post(new Runnable() {
                        public final void run() {
                            AlertController.m4675a(AlertController.this.f3730b, findViewById, view2);
                        }
                    });
                } else {
                    if (findViewById != null) {
                        viewGroup.removeView(findViewById);
                    }
                    if (view2 != null) {
                        viewGroup.removeView(view2);
                    }
                }
            }
        }
    }
}
