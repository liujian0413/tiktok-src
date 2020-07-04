package android.support.p029v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.menu.h */
public class C1186h {

    /* renamed from: a */
    public View f4407a;

    /* renamed from: b */
    public int f4408b = 8388613;

    /* renamed from: c */
    public OnDismissListener f4409c;

    /* renamed from: d */
    private final Context f4410d;

    /* renamed from: e */
    private final MenuBuilder f4411e;

    /* renamed from: f */
    private final boolean f4412f;

    /* renamed from: g */
    private final int f4413g;

    /* renamed from: h */
    private final int f4414h;

    /* renamed from: i */
    private boolean f4415i;

    /* renamed from: j */
    private C1189a f4416j;

    /* renamed from: k */
    private C1185g f4417k;

    /* renamed from: l */
    private final OnDismissListener f4418l;

    /* renamed from: a */
    public final void mo4919a() {
        if (!mo4924c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public final C1185g mo4923b() {
        if (this.f4417k == null) {
            this.f4417k = m5391f();
        }
        return this.f4417k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4925d() {
        this.f4417k = null;
        if (this.f4409c != null) {
            this.f4409c.onDismiss();
        }
    }

    public void dismiss() {
        if (mo4927e()) {
            this.f4417k.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo4927e() {
        if (this.f4417k == null || !this.f4417k.mo4894e()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo4924c() {
        if (mo4927e()) {
            return true;
        }
        if (this.f4407a == null) {
            return false;
        }
        m5390a(0, 0, false, false);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.g] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.support.v7.view.menu.n] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v7.view.menu.c] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.n] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.c] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [android.support.v7.view.menu.n]
      assigns: [android.support.v7.view.menu.n, android.support.v7.view.menu.c]
      uses: [android.support.v7.view.menu.n, android.support.v7.view.menu.g, android.support.v7.view.menu.c]
      mth insns count: 48
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p029v7.view.menu.C1185g m5391f() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f4410d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f4410d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165209(0x7f070019, float:1.7944629E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x004d
            android.support.v7.view.menu.c r0 = new android.support.v7.view.menu.c
            android.content.Context r2 = r14.f4410d
            android.view.View r3 = r14.f4407a
            int r4 = r14.f4413g
            int r5 = r14.f4414h
            boolean r6 = r14.f4412f
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x004d:
            android.support.v7.view.menu.n r0 = new android.support.v7.view.menu.n
            android.content.Context r8 = r14.f4410d
            android.support.v7.view.menu.MenuBuilder r9 = r14.f4411e
            android.view.View r10 = r14.f4407a
            int r11 = r14.f4413g
            int r12 = r14.f4414h
            boolean r13 = r14.f4412f
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005f:
            android.support.v7.view.menu.MenuBuilder r1 = r14.f4411e
            r0.mo4885a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f4418l
            r0.mo4887a(r1)
            android.view.View r1 = r14.f4407a
            r0.mo4886a(r1)
            android.support.v7.view.menu.i$a r1 = r14.f4416j
            r0.mo1113a(r1)
            boolean r1 = r14.f4415i
            r0.mo4889b(r1)
            int r1 = r14.f4408b
            r0.mo4884a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.view.menu.C1186h.m5391f():android.support.v7.view.menu.g");
    }

    /* renamed from: a */
    public final void mo4920a(C1189a aVar) {
        this.f4416j = aVar;
        if (this.f4417k != null) {
            this.f4417k.mo1113a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo4921a(boolean z) {
        this.f4415i = z;
        if (this.f4417k != null) {
            this.f4417k.mo4889b(z);
        }
    }

    /* renamed from: a */
    public final boolean mo4922a(int i, int i2) {
        if (mo4927e()) {
            return true;
        }
        if (this.f4407a == null) {
            return false;
        }
        m5390a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m5390a(int i, int i2, boolean z, boolean z2) {
        C1185g b = mo4923b();
        b.mo4891c(z2);
        if (z) {
            if ((C0972e.m4109a(this.f4408b, C0991u.m4220h(this.f4407a)) & 7) == 5) {
                i -= this.f4407a.getWidth();
            }
            b.mo4888b(i);
            b.mo4890c(i2);
            int i3 = (int) ((this.f4410d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.f4406g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        b.mo4892d();
    }

    public C1186h(Context context, MenuBuilder menuBuilder, View view, boolean z, int i) {
        this(context, menuBuilder, view, z, R.attr.a6, 0);
    }

    public C1186h(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.f4408b = 8388611;
        this.f4418l = new OnDismissListener() {
            public final void onDismiss() {
                C1186h.this.mo4925d();
            }
        };
        this.f4410d = context;
        this.f4411e = menuBuilder;
        this.f4407a = view;
        this.f4412f = z;
        this.f4413g = i;
        this.f4414h = i2;
    }
}
