package android.support.constraint;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.solver.C0187f;
import android.support.constraint.solver.widgets.C0196d;
import android.support.constraint.solver.widgets.C0197e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f407a = new SparseArray<>();

    /* renamed from: b */
    C0196d f408b = new C0196d();

    /* renamed from: c */
    int f409c = -1;

    /* renamed from: d */
    int f410d = -1;

    /* renamed from: e */
    int f411e = 0;

    /* renamed from: f */
    int f412f = 0;

    /* renamed from: g */
    private ArrayList<ConstraintHelper> f413g = new ArrayList<>(4);

    /* renamed from: h */
    private final ArrayList<ConstraintWidget> f414h = new ArrayList<>(100);

    /* renamed from: i */
    private int f415i = 0;

    /* renamed from: j */
    private int f416j = 0;

    /* renamed from: k */
    private int f417k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f418l = Integer.MAX_VALUE;

    /* renamed from: m */
    private boolean f419m = true;

    /* renamed from: n */
    private int f420n = 3;

    /* renamed from: o */
    private C0177b f421o = null;

    /* renamed from: p */
    private int f422p = -1;

    /* renamed from: q */
    private HashMap<String, Integer> f423q = new HashMap<>();

    /* renamed from: r */
    private int f424r = -1;

    /* renamed from: s */
    private int f425s = -1;

    /* renamed from: t */
    private C0187f f426t;

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: A */
        public float f427A = 0.5f;

        /* renamed from: B */
        public String f428B;

        /* renamed from: C */
        float f429C;

        /* renamed from: D */
        int f430D = 1;

        /* renamed from: E */
        public float f431E = -1.0f;

        /* renamed from: F */
        public float f432F = -1.0f;

        /* renamed from: G */
        public int f433G;

        /* renamed from: H */
        public int f434H;

        /* renamed from: I */
        public int f435I;

        /* renamed from: J */
        public int f436J;

        /* renamed from: K */
        public int f437K;

        /* renamed from: L */
        public int f438L;

        /* renamed from: M */
        public int f439M;

        /* renamed from: N */
        public int f440N;

        /* renamed from: O */
        public float f441O = 1.0f;

        /* renamed from: P */
        public float f442P = 1.0f;

        /* renamed from: Q */
        public int f443Q = -1;

        /* renamed from: R */
        public int f444R = -1;

        /* renamed from: S */
        public int f445S = -1;

        /* renamed from: T */
        public boolean f446T;

        /* renamed from: U */
        public boolean f447U;

        /* renamed from: V */
        boolean f448V = true;

        /* renamed from: W */
        boolean f449W = true;

        /* renamed from: X */
        boolean f450X;

        /* renamed from: Y */
        boolean f451Y;

        /* renamed from: Z */
        boolean f452Z;

        /* renamed from: a */
        public int f453a = -1;

        /* renamed from: aa */
        boolean f454aa;

        /* renamed from: ab */
        int f455ab = -1;

        /* renamed from: ac */
        int f456ac = -1;

        /* renamed from: ad */
        int f457ad = -1;

        /* renamed from: ae */
        int f458ae = -1;

        /* renamed from: af */
        int f459af = -1;

        /* renamed from: ag */
        int f460ag = -1;

        /* renamed from: ah */
        float f461ah = 0.5f;

        /* renamed from: ai */
        int f462ai;

        /* renamed from: aj */
        int f463aj;

        /* renamed from: ak */
        float f464ak;

        /* renamed from: al */
        ConstraintWidget f465al = new ConstraintWidget();

        /* renamed from: am */
        public boolean f466am = false;

        /* renamed from: b */
        public int f467b = -1;

        /* renamed from: c */
        public float f468c = -1.0f;

        /* renamed from: d */
        public int f469d = -1;

        /* renamed from: e */
        public int f470e = -1;

        /* renamed from: f */
        public int f471f = -1;

        /* renamed from: g */
        public int f472g = -1;

        /* renamed from: h */
        public int f473h = -1;

        /* renamed from: i */
        public int f474i = -1;

        /* renamed from: j */
        public int f475j = -1;

        /* renamed from: k */
        public int f476k = -1;

        /* renamed from: l */
        public int f477l = -1;

        /* renamed from: m */
        public int f478m = -1;

        /* renamed from: n */
        public int f479n;

        /* renamed from: o */
        public float f480o;

        /* renamed from: p */
        public int f481p = -1;

        /* renamed from: q */
        public int f482q = -1;

        /* renamed from: r */
        public int f483r = -1;

        /* renamed from: s */
        public int f484s = -1;

        /* renamed from: t */
        public int f485t = -1;

        /* renamed from: u */
        public int f486u = -1;

        /* renamed from: v */
        public int f487v = -1;

        /* renamed from: w */
        public int f488w = -1;

        /* renamed from: x */
        public int f489x = -1;

        /* renamed from: y */
        public int f490y = -1;

        /* renamed from: z */
        public float f491z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$LayoutParams$a */
        static class C0175a {

            /* renamed from: a */
            public static final SparseIntArray f492a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f492a = sparseIntArray;
                sparseIntArray.append(34, 8);
                f492a.append(35, 9);
                f492a.append(37, 10);
                f492a.append(38, 11);
                f492a.append(43, 12);
                f492a.append(42, 13);
                f492a.append(16, 14);
                f492a.append(15, 15);
                f492a.append(13, 16);
                f492a.append(17, 2);
                f492a.append(19, 3);
                f492a.append(18, 4);
                f492a.append(51, 49);
                f492a.append(52, 50);
                f492a.append(23, 5);
                f492a.append(24, 6);
                f492a.append(25, 7);
                f492a.append(0, 1);
                f492a.append(39, 17);
                f492a.append(40, 18);
                f492a.append(22, 19);
                f492a.append(21, 20);
                f492a.append(55, 21);
                f492a.append(58, 22);
                f492a.append(56, 23);
                f492a.append(53, 24);
                f492a.append(57, 25);
                f492a.append(54, 26);
                f492a.append(30, 29);
                f492a.append(44, 30);
                f492a.append(20, 44);
                f492a.append(32, 45);
                f492a.append(46, 46);
                f492a.append(31, 47);
                f492a.append(45, 48);
                f492a.append(11, 27);
                f492a.append(10, 28);
                f492a.append(47, 31);
                f492a.append(26, 32);
                f492a.append(49, 33);
                f492a.append(48, 34);
                f492a.append(50, 35);
                f492a.append(28, 36);
                f492a.append(27, 37);
                f492a.append(29, 38);
                f492a.append(33, 39);
                f492a.append(41, 40);
                f492a.append(36, 41);
                f492a.append(14, 42);
                f492a.append(12, 43);
            }
        }

        /* renamed from: a */
        public final void mo409a() {
            this.f451Y = false;
            this.f448V = true;
            this.f449W = true;
            if (this.width == -2 && this.f446T) {
                this.f448V = false;
                this.f435I = 1;
            }
            if (this.height == -2 && this.f447U) {
                this.f449W = false;
                this.f436J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f448V = false;
                if (this.width == 0 && this.f435I == 1) {
                    this.width = -2;
                    this.f446T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f449W = false;
                if (this.height == 0 && this.f436J == 1) {
                    this.height = -2;
                    this.f447U = true;
                }
            }
            if (this.f468c != -1.0f || this.f453a != -1 || this.f467b != -1) {
                this.f451Y = true;
                this.f448V = true;
                this.f449W = true;
                if (!(this.f465al instanceof C0197e)) {
                    this.f465al = new C0197e();
                }
                ((C0197e) this.f465al).mo579h(this.f445S);
            }
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r6) {
            /*
                r5 = this;
                int r0 = r5.leftMargin
                int r1 = r5.rightMargin
                super.resolveLayoutDirection(r6)
                r6 = -1
                r5.f457ad = r6
                r5.f458ae = r6
                r5.f455ab = r6
                r5.f456ac = r6
                r5.f459af = r6
                r5.f460ag = r6
                int r2 = r5.f485t
                r5.f459af = r2
                int r2 = r5.f487v
                r5.f460ag = r2
                float r2 = r5.f491z
                r5.f461ah = r2
                int r2 = r5.f453a
                r5.f462ai = r2
                int r2 = r5.f467b
                r5.f463aj = r2
                float r2 = r5.f468c
                r5.f464ak = r2
                int r2 = r5.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x00ac
                int r2 = r5.f481p
                if (r2 == r6) goto L_0x0043
                int r2 = r5.f481p
                r5.f457ad = r2
            L_0x0041:
                r3 = 1
                goto L_0x004c
            L_0x0043:
                int r2 = r5.f482q
                if (r2 == r6) goto L_0x004c
                int r2 = r5.f482q
                r5.f458ae = r2
                goto L_0x0041
            L_0x004c:
                int r2 = r5.f483r
                if (r2 == r6) goto L_0x0055
                int r2 = r5.f483r
                r5.f456ac = r2
                r3 = 1
            L_0x0055:
                int r2 = r5.f484s
                if (r2 == r6) goto L_0x005e
                int r2 = r5.f484s
                r5.f455ab = r2
                r3 = 1
            L_0x005e:
                int r2 = r5.f489x
                if (r2 == r6) goto L_0x0066
                int r2 = r5.f489x
                r5.f460ag = r2
            L_0x0066:
                int r2 = r5.f490y
                if (r2 == r6) goto L_0x006e
                int r2 = r5.f490y
                r5.f459af = r2
            L_0x006e:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0078
                float r3 = r5.f491z
                float r3 = r2 - r3
                r5.f461ah = r3
            L_0x0078:
                boolean r3 = r5.f451Y
                if (r3 == 0) goto L_0x00dc
                int r3 = r5.f445S
                if (r3 != r4) goto L_0x00dc
                float r3 = r5.f468c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x0092
                float r3 = r5.f468c
                float r2 = r2 - r3
                r5.f464ak = r2
                r5.f462ai = r6
                r5.f463aj = r6
                goto L_0x00dc
            L_0x0092:
                int r2 = r5.f453a
                if (r2 == r6) goto L_0x009f
                int r2 = r5.f453a
                r5.f463aj = r2
                r5.f462ai = r6
                r5.f464ak = r4
                goto L_0x00dc
            L_0x009f:
                int r2 = r5.f467b
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.f467b
                r5.f462ai = r2
                r5.f463aj = r6
                r5.f464ak = r4
                goto L_0x00dc
            L_0x00ac:
                int r2 = r5.f481p
                if (r2 == r6) goto L_0x00b4
                int r2 = r5.f481p
                r5.f456ac = r2
            L_0x00b4:
                int r2 = r5.f482q
                if (r2 == r6) goto L_0x00bc
                int r2 = r5.f482q
                r5.f455ab = r2
            L_0x00bc:
                int r2 = r5.f483r
                if (r2 == r6) goto L_0x00c4
                int r2 = r5.f483r
                r5.f457ad = r2
            L_0x00c4:
                int r2 = r5.f484s
                if (r2 == r6) goto L_0x00cc
                int r2 = r5.f484s
                r5.f458ae = r2
            L_0x00cc:
                int r2 = r5.f489x
                if (r2 == r6) goto L_0x00d4
                int r2 = r5.f489x
                r5.f459af = r2
            L_0x00d4:
                int r2 = r5.f490y
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.f490y
                r5.f460ag = r2
            L_0x00dc:
                int r2 = r5.f483r
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f484s
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f482q
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f481p
                if (r2 != r6) goto L_0x012e
                int r2 = r5.f471f
                if (r2 == r6) goto L_0x00fd
                int r2 = r5.f471f
                r5.f457ad = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
                goto L_0x010d
            L_0x00fd:
                int r2 = r5.f472g
                if (r2 == r6) goto L_0x010d
                int r2 = r5.f472g
                r5.f458ae = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
            L_0x010d:
                int r1 = r5.f469d
                if (r1 == r6) goto L_0x011e
                int r6 = r5.f469d
                r5.f455ab = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
                return
            L_0x011e:
                int r1 = r5.f470e
                if (r1 == r6) goto L_0x012e
                int r6 = r5.f470e
                r5.f456ac = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
            L_0x012e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0175a.f492a.get(index);
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        this.f445S = obtainStyledAttributes.getInt(index, this.f445S);
                        break;
                    case 2:
                        this.f478m = obtainStyledAttributes.getResourceId(index, this.f478m);
                        if (this.f478m != -1) {
                            break;
                        } else {
                            this.f478m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f479n = obtainStyledAttributes.getDimensionPixelSize(index, this.f479n);
                        break;
                    case 4:
                        this.f480o = obtainStyledAttributes.getFloat(index, this.f480o) % 360.0f;
                        if (this.f480o >= 0.0f) {
                            break;
                        } else {
                            this.f480o = (360.0f - this.f480o) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f453a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f453a);
                        break;
                    case 6:
                        this.f467b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f467b);
                        break;
                    case 7:
                        this.f468c = obtainStyledAttributes.getFloat(index, this.f468c);
                        break;
                    case 8:
                        this.f469d = obtainStyledAttributes.getResourceId(index, this.f469d);
                        if (this.f469d != -1) {
                            break;
                        } else {
                            this.f469d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f470e = obtainStyledAttributes.getResourceId(index, this.f470e);
                        if (this.f470e != -1) {
                            break;
                        } else {
                            this.f470e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f471f = obtainStyledAttributes.getResourceId(index, this.f471f);
                        if (this.f471f != -1) {
                            break;
                        } else {
                            this.f471f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f472g = obtainStyledAttributes.getResourceId(index, this.f472g);
                        if (this.f472g != -1) {
                            break;
                        } else {
                            this.f472g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f473h = obtainStyledAttributes.getResourceId(index, this.f473h);
                        if (this.f473h != -1) {
                            break;
                        } else {
                            this.f473h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f474i = obtainStyledAttributes.getResourceId(index, this.f474i);
                        if (this.f474i != -1) {
                            break;
                        } else {
                            this.f474i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f475j = obtainStyledAttributes.getResourceId(index, this.f475j);
                        if (this.f475j != -1) {
                            break;
                        } else {
                            this.f475j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f476k = obtainStyledAttributes.getResourceId(index, this.f476k);
                        if (this.f476k != -1) {
                            break;
                        } else {
                            this.f476k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f477l = obtainStyledAttributes.getResourceId(index, this.f477l);
                        if (this.f477l != -1) {
                            break;
                        } else {
                            this.f477l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f481p = obtainStyledAttributes.getResourceId(index, this.f481p);
                        if (this.f481p != -1) {
                            break;
                        } else {
                            this.f481p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f482q = obtainStyledAttributes.getResourceId(index, this.f482q);
                        if (this.f482q != -1) {
                            break;
                        } else {
                            this.f482q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f483r = obtainStyledAttributes.getResourceId(index, this.f483r);
                        if (this.f483r != -1) {
                            break;
                        } else {
                            this.f483r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f484s = obtainStyledAttributes.getResourceId(index, this.f484s);
                        if (this.f484s != -1) {
                            break;
                        } else {
                            this.f484s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f485t = obtainStyledAttributes.getDimensionPixelSize(index, this.f485t);
                        break;
                    case 22:
                        this.f486u = obtainStyledAttributes.getDimensionPixelSize(index, this.f486u);
                        break;
                    case 23:
                        this.f487v = obtainStyledAttributes.getDimensionPixelSize(index, this.f487v);
                        break;
                    case 24:
                        this.f488w = obtainStyledAttributes.getDimensionPixelSize(index, this.f488w);
                        break;
                    case 25:
                        this.f489x = obtainStyledAttributes.getDimensionPixelSize(index, this.f489x);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        this.f490y = obtainStyledAttributes.getDimensionPixelSize(index, this.f490y);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        this.f446T = obtainStyledAttributes.getBoolean(index, this.f446T);
                        break;
                    case 28:
                        this.f447U = obtainStyledAttributes.getBoolean(index, this.f447U);
                        break;
                    case 29:
                        this.f491z = obtainStyledAttributes.getFloat(index, this.f491z);
                        break;
                    case 30:
                        this.f427A = obtainStyledAttributes.getFloat(index, this.f427A);
                        break;
                    case 31:
                        this.f435I = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.f435I;
                        break;
                    case 32:
                        this.f436J = obtainStyledAttributes.getInt(index, 0);
                        int i5 = this.f436J;
                        break;
                    case 33:
                        try {
                            this.f437K = obtainStyledAttributes.getDimensionPixelSize(index, this.f437K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f437K) != -2) {
                                break;
                            } else {
                                this.f437K = -2;
                                break;
                            }
                        }
                    case BaseNotice.CHALLENGE /*34*/:
                        try {
                            this.f439M = obtainStyledAttributes.getDimensionPixelSize(index, this.f439M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f439M) != -2) {
                                break;
                            } else {
                                this.f439M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f441O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f441O));
                        break;
                    case 36:
                        try {
                            this.f438L = obtainStyledAttributes.getDimensionPixelSize(index, this.f438L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f438L) != -2) {
                                break;
                            } else {
                                this.f438L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f440N = obtainStyledAttributes.getDimensionPixelSize(index, this.f440N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f440N) != -2) {
                                break;
                            } else {
                                this.f440N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f442P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f442P));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                this.f428B = obtainStyledAttributes.getString(index);
                                this.f429C = Float.NaN;
                                this.f430D = -1;
                                if (this.f428B == null) {
                                    break;
                                } else {
                                    int length = this.f428B.length();
                                    int indexOf = this.f428B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f428B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f430D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f430D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f428B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f428B.substring(i, indexOf2);
                                        String substring3 = this.f428B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f430D != 1) {
                                                        this.f429C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.f429C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f428B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.f429C = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case BaseNotice.f89516AT /*45*/:
                                this.f431E = obtainStyledAttributes.getFloat(index, this.f431E);
                                break;
                            case 46:
                                this.f432F = obtainStyledAttributes.getFloat(index, this.f432F);
                                break;
                            case 47:
                                this.f433G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f434H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f443Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f443Q);
                                break;
                            case 50:
                                this.f444R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f444R);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo409a();
        }
    }

    public int getMaxHeight() {
        return this.f418l;
    }

    public int getMaxWidth() {
        return this.f417k;
    }

    public int getMinHeight() {
        return this.f416j;
    }

    public int getMinWidth() {
        return this.f415i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    protected static LayoutParams m486a() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m486a();
    }

    public int getOptimizationLevel() {
        return this.f408b.f784ax;
    }

    public void requestLayout() {
        super.requestLayout();
        this.f419m = true;
        this.f424r = -1;
        this.f425s = -1;
        this.f409c = -1;
        this.f410d = -1;
        this.f411e = 0;
        this.f412f = 0;
    }

    /* renamed from: b */
    private void mo20984b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f414h.clear();
            mo20986c();
        }
    }

    /* renamed from: d */
    private void mo20987d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0180c) {
                ((C0180c) childAt).mo438b(this);
            }
        }
        int size = this.f413g.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f413g.get(i2);
            }
        }
    }

    /* renamed from: c */
    private void mo20986c() {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m488a(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo20985b(childAt.getId()).f713ac = resourceName;
                } catch (NotFoundException unused) {
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ConstraintWidget a = mo381a(getChildAt(i7));
            if (a != null) {
                a.mo550f();
            }
        }
        if (this.f422p != -1) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getId() == this.f422p && (childAt2 instanceof Constraints)) {
                    this.f421o = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        if (this.f421o != null) {
            this.f421o.mo431c(this);
        }
        this.f408b.mo605B();
        int size = this.f413g.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((ConstraintHelper) this.f413g.get(i9)).mo373a(this);
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof C0180c) {
                ((C0180c) childAt3).mo437a(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt4 = getChildAt(i11);
            ConstraintWidget a2 = mo381a(childAt4);
            if (a2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt4.getLayoutParams();
                layoutParams.mo409a();
                if (layoutParams.f466am) {
                    layoutParams.f466am = z;
                } else if (isInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt4.getId());
                        m488a(z ? 1 : 0, resourceName2, Integer.valueOf(childAt4.getId()));
                        mo20985b(childAt4.getId()).f713ac = resourceName2.substring(resourceName2.indexOf("id/") + 3);
                    } catch (NotFoundException unused2) {
                    }
                }
                a2.f712ab = childAt4.getVisibility();
                if (layoutParams.f454aa) {
                    a2.f712ab = 8;
                }
                a2.f709Z = childAt4;
                this.f408b.mo606a(a2);
                if (!layoutParams.f449W || !layoutParams.f448V) {
                    this.f414h.add(a2);
                }
                if (layoutParams.f451Y) {
                    C0197e eVar = (C0197e) a2;
                    int i12 = layoutParams.f462ai;
                    int i13 = layoutParams.f463aj;
                    float f2 = layoutParams.f464ak;
                    if (VERSION.SDK_INT < 17) {
                        i12 = layoutParams.f453a;
                        i13 = layoutParams.f467b;
                        f2 = layoutParams.f468c;
                    }
                    if (f2 != -1.0f) {
                        eVar.mo578c(f2);
                    } else if (i12 != -1) {
                        eVar.mo580i(i12);
                    } else if (i13 != -1) {
                        eVar.mo581j(i13);
                    }
                } else if (layoutParams.f469d != -1 || layoutParams.f470e != -1 || layoutParams.f471f != -1 || layoutParams.f472g != -1 || layoutParams.f482q != -1 || layoutParams.f481p != -1 || layoutParams.f483r != -1 || layoutParams.f484s != -1 || layoutParams.f473h != -1 || layoutParams.f474i != -1 || layoutParams.f475j != -1 || layoutParams.f476k != -1 || layoutParams.f477l != -1 || layoutParams.f443Q != -1 || layoutParams.f444R != -1 || layoutParams.f478m != -1 || layoutParams.width == -1 || layoutParams.height == -1) {
                    int i14 = layoutParams.f455ab;
                    int i15 = layoutParams.f456ac;
                    int i16 = layoutParams.f457ad;
                    int i17 = layoutParams.f458ae;
                    int i18 = layoutParams.f459af;
                    int i19 = layoutParams.f460ag;
                    float f3 = layoutParams.f461ah;
                    if (VERSION.SDK_INT < 17) {
                        int i20 = layoutParams.f469d;
                        int i21 = layoutParams.f470e;
                        i16 = layoutParams.f471f;
                        i17 = layoutParams.f472g;
                        int i22 = layoutParams.f485t;
                        int i23 = layoutParams.f487v;
                        f3 = layoutParams.f491z;
                        if (i20 == -1 && i21 == -1) {
                            if (layoutParams.f482q != -1) {
                                i20 = layoutParams.f482q;
                            } else if (layoutParams.f481p != -1) {
                                i21 = layoutParams.f481p;
                            }
                        }
                        int i24 = i21;
                        i14 = i20;
                        i3 = i24;
                        if (i16 == -1 && i17 == -1) {
                            if (layoutParams.f483r != -1) {
                                i16 = layoutParams.f483r;
                            } else if (layoutParams.f484s != -1) {
                                i17 = layoutParams.f484s;
                            }
                        }
                        i2 = i22;
                        i = i23;
                    } else {
                        i3 = i15;
                        i = i19;
                        i2 = i18;
                    }
                    int i25 = i17;
                    float f4 = f3;
                    int i26 = i16;
                    if (layoutParams.f478m != -1) {
                        ConstraintWidget b = mo20985b(layoutParams.f478m);
                        if (b != null) {
                            a2.mo531a(b, layoutParams.f480o, layoutParams.f479n);
                        }
                    } else {
                        if (i14 != -1) {
                            ConstraintWidget b2 = mo20985b(i14);
                            if (b2 != null) {
                                Type type = Type.LEFT;
                                f = f4;
                                Type type2 = Type.LEFT;
                                i5 = i25;
                                a2.mo528a(type, b2, type2, layoutParams.leftMargin, i2);
                            } else {
                                f = f4;
                                i5 = i25;
                            }
                            i4 = i5;
                        } else {
                            f = f4;
                            i4 = i25;
                            if (i3 != -1) {
                                ConstraintWidget b3 = mo20985b(i3);
                                if (b3 != null) {
                                    a2.mo528a(Type.LEFT, b3, Type.RIGHT, layoutParams.leftMargin, i2);
                                }
                            }
                        }
                        if (i26 != -1) {
                            ConstraintWidget b4 = mo20985b(i26);
                            if (b4 != null) {
                                a2.mo528a(Type.RIGHT, b4, Type.LEFT, layoutParams.rightMargin, i);
                            }
                        } else if (i4 != -1) {
                            ConstraintWidget b5 = mo20985b(i4);
                            if (b5 != null) {
                                a2.mo528a(Type.RIGHT, b5, Type.RIGHT, layoutParams.rightMargin, i);
                            }
                        }
                        if (layoutParams.f473h != -1) {
                            ConstraintWidget b6 = mo20985b(layoutParams.f473h);
                            if (b6 != null) {
                                a2.mo528a(Type.TOP, b6, Type.TOP, layoutParams.topMargin, layoutParams.f486u);
                            }
                        } else if (layoutParams.f474i != -1) {
                            ConstraintWidget b7 = mo20985b(layoutParams.f474i);
                            if (b7 != null) {
                                a2.mo528a(Type.TOP, b7, Type.BOTTOM, layoutParams.topMargin, layoutParams.f486u);
                            }
                        }
                        if (layoutParams.f475j != -1) {
                            ConstraintWidget b8 = mo20985b(layoutParams.f475j);
                            if (b8 != null) {
                                a2.mo528a(Type.BOTTOM, b8, Type.TOP, layoutParams.bottomMargin, layoutParams.f488w);
                            }
                        } else if (layoutParams.f476k != -1) {
                            ConstraintWidget b9 = mo20985b(layoutParams.f476k);
                            if (b9 != null) {
                                a2.mo528a(Type.BOTTOM, b9, Type.BOTTOM, layoutParams.bottomMargin, layoutParams.f488w);
                            }
                        }
                        if (layoutParams.f477l != -1) {
                            View view = (View) this.f407a.get(layoutParams.f477l);
                            ConstraintWidget b10 = mo20985b(layoutParams.f477l);
                            if (!(b10 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams))) {
                                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                                layoutParams.f450X = true;
                                layoutParams2.f450X = true;
                                a2.mo521a(Type.BASELINE).mo514a(b10.mo521a(Type.BASELINE), 0, -1, Strength.STRONG, 0, true);
                                a2.mo521a(Type.TOP).mo516b();
                                a2.mo521a(Type.BOTTOM).mo516b();
                            }
                        }
                        float f5 = f;
                        if (f5 >= 0.0f && f5 != 0.5f) {
                            a2.f707X = f5;
                        }
                        if (layoutParams.f427A >= 0.0f && layoutParams.f427A != 0.5f) {
                            a2.f708Y = layoutParams.f427A;
                        }
                    }
                    if (isInEditMode && !(layoutParams.f443Q == -1 && layoutParams.f444R == -1)) {
                        a2.mo524a(layoutParams.f443Q, layoutParams.f444R);
                    }
                    if (layoutParams.f448V) {
                        a2.mo530a(DimensionBehaviour.FIXED);
                        a2.mo545d(layoutParams.width);
                    } else if (layoutParams.width == -1) {
                        a2.mo530a(DimensionBehaviour.MATCH_PARENT);
                        a2.mo521a(Type.LEFT).f676e = layoutParams.leftMargin;
                        a2.mo521a(Type.RIGHT).f676e = layoutParams.rightMargin;
                    } else {
                        a2.mo530a(DimensionBehaviour.MATCH_CONSTRAINT);
                        a2.mo545d(0);
                    }
                    if (layoutParams.f449W) {
                        z = false;
                        a2.mo540b(DimensionBehaviour.FIXED);
                        a2.mo548e(layoutParams.height);
                    } else if (layoutParams.height == -1) {
                        a2.mo540b(DimensionBehaviour.MATCH_PARENT);
                        a2.mo521a(Type.TOP).f676e = layoutParams.topMargin;
                        a2.mo521a(Type.BOTTOM).f676e = layoutParams.bottomMargin;
                        z = false;
                    } else {
                        a2.mo540b(DimensionBehaviour.MATCH_CONSTRAINT);
                        z = false;
                        a2.mo548e(0);
                    }
                    if (layoutParams.f428B != null) {
                        a2.mo532a(layoutParams.f428B);
                    }
                    a2.mo522a(layoutParams.f431E);
                    a2.mo535b(layoutParams.f432F);
                    a2.f717ag = layoutParams.f433G;
                    a2.f718ah = layoutParams.f434H;
                    a2.mo525a(layoutParams.f435I, layoutParams.f437K, layoutParams.f439M, layoutParams.f441O);
                    a2.mo538b(layoutParams.f436J, layoutParams.f438L, layoutParams.f440N, layoutParams.f442P);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(C0177b bVar) {
        this.f421o = bVar;
    }

    public void setOptimizationLevel(int i) {
        this.f408b.f784ax = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final View mo382a(int i) {
        return (View) this.f407a.get(i);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.f418l) {
            this.f418l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f417k) {
            this.f417k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f416j) {
            this.f416j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f415i) {
            this.f415i = i;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void mo102410a(String str) {
        this.f408b.mo575x();
        if (this.f426t != null) {
            this.f426t.f646c++;
        }
    }

    /* renamed from: b */
    private final ConstraintWidget mo20985b(int i) {
        if (i == 0) {
            return this.f408b;
        }
        View view = (View) this.f407a.get(i);
        if (view == this) {
            return this.f408b;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f465al;
    }

    public void setId(int i) {
        this.f407a.remove(getId());
        super.setId(i);
        this.f407a.put(getId(), this);
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f407a.remove(view.getId());
        ConstraintWidget a = mo381a(view);
        this.f408b.mo607b(a);
        this.f413g.remove(view);
        this.f414h.remove(a);
        this.f419m = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        m489a((AttributeSet) null);
    }

    /* renamed from: a */
    public final ConstraintWidget mo381a(View view) {
        if (view == this) {
            return this.f408b;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f465al;
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget a = mo381a(view);
        if ((view instanceof Guideline) && !(a instanceof C0197e)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f465al = new C0197e();
            layoutParams.f451Y = true;
            ((C0197e) layoutParams.f465al).mo579h(layoutParams.f445S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo372a();
            ((LayoutParams) view.getLayoutParams()).f452Z = true;
            if (!this.f413g.contains(constraintHelper)) {
                this.f413g.add(constraintHelper);
            }
        }
        this.f407a.put(view.getId(), view);
        this.f419m = true;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) i3;
                            float f3 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = f2;
                            float f5 = f2;
                            float f6 = f3;
                            float f7 = f;
                            Paint paint2 = paint;
                            canvas2.drawLine(f, f4, f6, f5, paint);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f3;
                            float f10 = f8;
                            canvas2.drawLine(f9, f5, f6, f10, paint);
                            float f11 = f8;
                            float f12 = f7;
                            canvas2.drawLine(f9, f11, f12, f10, paint);
                            float f13 = f7;
                            canvas2.drawLine(f13, f11, f12, f5, paint);
                            paint.setColor(-16711936);
                            float f14 = f3;
                            Paint paint3 = paint;
                            canvas2.drawLine(f13, f5, f14, f8, paint);
                            canvas2.drawLine(f13, f8, f14, f5, paint);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m489a(AttributeSet attributeSet) {
        this.f408b.f709Z = this;
        this.f407a.put(getId(), this);
        this.f421o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f415i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f415i);
                } else if (index == 4) {
                    this.f416j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f416j);
                } else if (index == 1) {
                    this.f417k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f417k);
                } else if (index == 2) {
                    this.f418l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f418l);
                } else if (index == 59) {
                    this.f420n = obtainStyledAttributes.getInt(index, this.f420n);
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f421o = new C0177b();
                        this.f421o.mo427a(getContext(), resourceId);
                    } catch (NotFoundException unused) {
                        this.f421o = null;
                    }
                    this.f422p = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f408b.f784ax = this.f420n;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m489a(attributeSet);
    }

    /* renamed from: a */
    private void m487a(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.f465al;
                if (!layoutParams.f451Y && !layoutParams.f452Z) {
                    constraintWidget.f712ab = childAt.getVisibility();
                    int i8 = layoutParams.width;
                    int i9 = layoutParams.height;
                    if (layoutParams.f448V || layoutParams.f449W || ((!layoutParams.f448V && layoutParams.f435I == 1) || layoutParams.width == -1 || (!layoutParams.f449W && (layoutParams.f436J == 1 || layoutParams.height == -1)))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i8 == 0) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -2);
                            z3 = true;
                        } else if (i8 == -1) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -1);
                            z3 = false;
                        } else {
                            if (i8 == -2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            i3 = getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -2);
                            z2 = true;
                        } else if (i9 == -1) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -1);
                            z2 = false;
                        } else {
                            if (i9 == -2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i4 = getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        if (this.f426t != null) {
                            this.f426t.f644a++;
                        }
                        if (i8 == -2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        constraintWidget.f740p = z4;
                        if (i9 == -2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        constraintWidget.f741q = z5;
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z3 = false;
                        z2 = false;
                    }
                    constraintWidget.mo545d(i8);
                    constraintWidget.mo548e(i9);
                    if (z3) {
                        constraintWidget.f705U = i8;
                    }
                    if (z2) {
                        constraintWidget.f706V = i9;
                    }
                    if (layoutParams.f450X) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            constraintWidget.f702R = baseline;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m496c(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                size = Math.min(this.f417k, size) - paddingLeft;
            }
            size = 0;
        } else {
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f418l, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        }
        this.f408b.mo551f(0);
        this.f408b.mo553g(0);
        this.f408b.mo530a(dimensionBehaviour);
        this.f408b.mo545d(size);
        this.f408b.mo540b(dimensionBehaviour2);
        this.f408b.mo548e(size2);
        this.f408b.mo551f((this.f415i - getPaddingLeft()) - getPaddingRight());
        this.f408b.mo553g((this.f416j - getPaddingTop()) - getPaddingBottom());
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m494b(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.getPaddingTop()
            int r4 = r24.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r24.getPaddingLeft()
            int r5 = r24.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r24.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00db
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 == r10) goto L_0x00d1
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r10 = (android.support.constraint.ConstraintLayout.LayoutParams) r10
            android.support.constraint.solver.widgets.ConstraintWidget r15 = r10.f465al
            boolean r6 = r10.f451Y
            if (r6 != 0) goto L_0x00d1
            boolean r6 = r10.f452Z
            if (r6 != 0) goto L_0x00d1
            int r6 = r14.getVisibility()
            r15.f712ab = r6
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c0
            if (r13 != 0) goto L_0x004e
            goto L_0x00c0
        L_0x004e:
            if (r6 != r12) goto L_0x0053
            r16 = 1
            goto L_0x0055
        L_0x0053:
            r16 = 0
        L_0x0055:
            int r11 = getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x005e
            r17 = 1
            goto L_0x0060
        L_0x005e:
            r17 = 0
        L_0x0060:
            int r12 = getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            android.support.constraint.solver.f r11 = r0.f426t
            if (r11 == 0) goto L_0x0075
            android.support.constraint.solver.f r11 = r0.f426t
            r18 = r3
            long r2 = r11.f644a
            long r2 = r2 + r8
            r11.f644a = r2
            goto L_0x0077
        L_0x0075:
            r18 = r3
        L_0x0077:
            r2 = -2
            if (r6 != r2) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            r15.f740p = r3
            if (r13 != r2) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            r15.f741q = r2
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.mo545d(r2)
            r15.mo548e(r3)
            if (r16 == 0) goto L_0x0098
            r15.f705U = r2
        L_0x0098:
            if (r17 == 0) goto L_0x009c
            r15.f706V = r3
        L_0x009c:
            boolean r6 = r10.f450X
            if (r6 == 0) goto L_0x00a9
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00a9
            r15.f702R = r6
        L_0x00a9:
            boolean r6 = r10.f448V
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r10.f449W
            if (r6 == 0) goto L_0x00d3
            android.support.constraint.solver.widgets.j r6 = r15.mo554h()
            r6.mo594a(r2)
            android.support.constraint.solver.widgets.j r2 = r15.mo555i()
            r2.mo594a(r3)
            goto L_0x00d3
        L_0x00c0:
            r18 = r3
            android.support.constraint.solver.widgets.j r2 = r15.mo554h()
            r2.mo597d()
            android.support.constraint.solver.widgets.j r2 = r15.mo555i()
            r2.mo597d()
            goto L_0x00d3
        L_0x00d1:
            r18 = r3
        L_0x00d3:
            int r7 = r7 + 1
            r3 = r18
            r2 = r26
            goto L_0x001d
        L_0x00db:
            r18 = r3
            android.support.constraint.solver.widgets.d r2 = r0.f408b
            r2.mo577z()
            r2 = 0
        L_0x00e3:
            if (r2 >= r5) goto L_0x02bc
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 == r10) goto L_0x02a4
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            android.support.constraint.solver.widgets.ConstraintWidget r7 = r6.f465al
            boolean r11 = r6.f451Y
            if (r11 != 0) goto L_0x02a4
            boolean r11 = r6.f452Z
            if (r11 != 0) goto L_0x02a4
            int r11 = r3.getVisibility()
            r7.f712ab = r11
            int r11 = r6.width
            int r12 = r6.height
            if (r11 == 0) goto L_0x010d
            if (r12 != 0) goto L_0x02a4
        L_0x010d:
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r13 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT
            android.support.constraint.solver.widgets.ConstraintAnchor r13 = r7.mo521a(r13)
            android.support.constraint.solver.widgets.i r13 = r13.f672a
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT
            android.support.constraint.solver.widgets.ConstraintAnchor r14 = r7.mo521a(r14)
            android.support.constraint.solver.widgets.i r14 = r14.f672a
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r15 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r7.mo521a(r15)
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r15.f675d
            if (r15 == 0) goto L_0x0133
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r15 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r7.mo521a(r15)
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r15.f675d
            if (r15 == 0) goto L_0x0133
            r15 = 1
            goto L_0x0134
        L_0x0133:
            r15 = 0
        L_0x0134:
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            android.support.constraint.solver.widgets.ConstraintAnchor r10 = r7.mo521a(r10)
            android.support.constraint.solver.widgets.i r10 = r10.f672a
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r7.mo521a(r8)
            android.support.constraint.solver.widgets.i r8 = r8.f672a
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r9 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r7.mo521a(r9)
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 == 0) goto L_0x015a
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r9 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r7.mo521a(r9)
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.f675d
            if (r9 == 0) goto L_0x015a
            r9 = 1
            goto L_0x015b
        L_0x015a:
            r9 = 0
        L_0x015b:
            if (r11 != 0) goto L_0x0172
            if (r12 != 0) goto L_0x0172
            if (r15 == 0) goto L_0x0172
            if (r9 != 0) goto L_0x0164
            goto L_0x0172
        L_0x0164:
            r22 = r2
            r21 = r5
            r9 = r18
            r3 = -1
            r8 = r26
            r13 = -2
            r19 = 1
            goto L_0x02b0
        L_0x0172:
            r21 = r5
            android.support.constraint.solver.widgets.d r5 = r0.f408b
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r5.mo569v()
            r22 = r2
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r2) goto L_0x0182
            r2 = 1
            goto L_0x0183
        L_0x0182:
            r2 = 0
        L_0x0183:
            android.support.constraint.solver.widgets.d r5 = r0.f408b
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r5.mo570w()
            r23 = r6
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r6) goto L_0x0191
            r6 = 1
            goto L_0x0192
        L_0x0191:
            r6 = 0
        L_0x0192:
            if (r2 != 0) goto L_0x019b
            android.support.constraint.solver.widgets.j r5 = r7.mo554h()
            r5.mo597d()
        L_0x019b:
            if (r6 != 0) goto L_0x01a4
            android.support.constraint.solver.widgets.j r5 = r7.mo555i()
            r5.mo597d()
        L_0x01a4:
            if (r11 != 0) goto L_0x01d3
            if (r2 == 0) goto L_0x01ca
            boolean r5 = r7.mo547d()
            if (r5 == 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            boolean r5 = r13.mo599f()
            if (r5 == 0) goto L_0x01ca
            boolean r5 = r14.mo599f()
            if (r5 == 0) goto L_0x01ca
            float r5 = r14.f805f
            float r11 = r13.f805f
            float r5 = r5 - r11
            int r11 = (int) r5
            android.support.constraint.solver.widgets.j r5 = r7.mo554h()
            r5.mo594a(r11)
            goto L_0x01e2
        L_0x01ca:
            r5 = -2
            int r2 = getChildMeasureSpec(r1, r4, r5)
            r13 = r2
            r2 = 0
            r5 = 1
            goto L_0x01e7
        L_0x01d3:
            r5 = -2
            r13 = -1
            if (r11 != r13) goto L_0x01de
            int r14 = getChildMeasureSpec(r1, r4, r13)
            r13 = r14
            r5 = 0
            goto L_0x01e7
        L_0x01de:
            if (r11 != r5) goto L_0x01e2
            r5 = 1
            goto L_0x01e3
        L_0x01e2:
            r5 = 0
        L_0x01e3:
            int r13 = getChildMeasureSpec(r1, r4, r11)
        L_0x01e7:
            if (r12 != 0) goto L_0x021e
            if (r6 == 0) goto L_0x0211
            boolean r14 = r7.mo549e()
            if (r14 == 0) goto L_0x0211
            if (r9 == 0) goto L_0x0211
            boolean r9 = r10.mo599f()
            if (r9 == 0) goto L_0x0211
            boolean r9 = r8.mo599f()
            if (r9 == 0) goto L_0x0211
            float r8 = r8.f805f
            float r9 = r10.f805f
            float r8 = r8 - r9
            int r12 = (int) r8
            android.support.constraint.solver.widgets.j r8 = r7.mo555i()
            r8.mo594a(r12)
            r9 = r18
            r8 = r26
            goto L_0x0231
        L_0x0211:
            r9 = r18
            r8 = r26
            r10 = -2
            int r6 = getChildMeasureSpec(r8, r9, r10)
            r14 = r6
            r6 = 0
            r10 = 1
            goto L_0x0236
        L_0x021e:
            r9 = r18
            r8 = r26
            r10 = -2
            r14 = -1
            if (r12 != r14) goto L_0x022d
            int r15 = getChildMeasureSpec(r8, r9, r14)
            r14 = r15
            r10 = 0
            goto L_0x0236
        L_0x022d:
            if (r12 != r10) goto L_0x0231
            r10 = 1
            goto L_0x0232
        L_0x0231:
            r10 = 0
        L_0x0232:
            int r14 = getChildMeasureSpec(r8, r9, r12)
        L_0x0236:
            r3.measure(r13, r14)
            android.support.constraint.solver.f r13 = r0.f426t
            if (r13 == 0) goto L_0x0248
            android.support.constraint.solver.f r13 = r0.f426t
            long r14 = r13.f644a
            r19 = 1
            long r14 = r14 + r19
            r13.f644a = r14
            goto L_0x024a
        L_0x0248:
            r19 = 1
        L_0x024a:
            r13 = -2
            if (r11 != r13) goto L_0x024f
            r11 = 1
            goto L_0x0250
        L_0x024f:
            r11 = 0
        L_0x0250:
            r7.f740p = r11
            if (r12 != r13) goto L_0x0256
            r11 = 1
            goto L_0x0257
        L_0x0256:
            r11 = 0
        L_0x0257:
            r7.f741q = r11
            int r11 = r3.getMeasuredWidth()
            int r12 = r3.getMeasuredHeight()
            r7.mo545d(r11)
            r7.mo548e(r12)
            if (r5 == 0) goto L_0x026b
            r7.f705U = r11
        L_0x026b:
            if (r10 == 0) goto L_0x026f
            r7.f706V = r12
        L_0x026f:
            if (r2 == 0) goto L_0x0279
            android.support.constraint.solver.widgets.j r2 = r7.mo554h()
            r2.mo594a(r11)
            goto L_0x0280
        L_0x0279:
            android.support.constraint.solver.widgets.j r2 = r7.mo554h()
            r2.mo595c()
        L_0x0280:
            if (r6 == 0) goto L_0x028c
            android.support.constraint.solver.widgets.j r2 = r7.mo555i()
            r2.mo594a(r12)
        L_0x0289:
            r6 = r23
            goto L_0x0294
        L_0x028c:
            android.support.constraint.solver.widgets.j r2 = r7.mo555i()
            r2.mo595c()
            goto L_0x0289
        L_0x0294:
            boolean r2 = r6.f450X
            if (r2 == 0) goto L_0x02a2
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02b0
            r7.f702R = r2
            goto L_0x02b0
        L_0x02a2:
            r3 = -1
            goto L_0x02b0
        L_0x02a4:
            r22 = r2
            r21 = r5
            r19 = r8
            r9 = r18
            r3 = -1
            r8 = r26
            r13 = -2
        L_0x02b0:
            int r2 = r22 + 1
            r18 = r9
            r8 = r19
            r5 = r21
            r10 = 8
            goto L_0x00e3
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m494b(int, int):void");
    }

    /* renamed from: a */
    public final Object mo383a(int i, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (this.f423q != null && this.f423q.containsKey(str)) {
                return this.f423q.get(str);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        int i11 = i;
        int i12 = i2;
        System.currentTimeMillis();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        this.f411e = mode;
        this.f412f = mode2;
        this.f409c = size;
        this.f410d = size2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f408b.f694J = paddingLeft;
        this.f408b.f695K = paddingTop;
        this.f408b.mo536b(this.f417k);
        this.f408b.mo542c(this.f418l);
        if (VERSION.SDK_INT >= 17) {
            C0196d dVar = this.f408b;
            if (getLayoutDirection() == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            dVar.f773a = z7;
        }
        m496c(i, i2);
        int j = this.f408b.mo556j();
        int k = this.f408b.mo557k();
        if (this.f419m) {
            this.f419m = false;
            mo20984b();
        }
        if ((this.f420n & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f408b.mo576y();
            this.f408b.mo573e(j, k);
            m494b(i, i2);
        } else {
            m487a(i, i2);
        }
        mo20987d();
        if (getChildCount() > 0) {
            mo102410a("First pass");
        }
        int size3 = this.f414h.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            if (this.f408b.mo569v() == DimensionBehaviour.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f408b.mo570w() == DimensionBehaviour.WRAP_CONTENT) {
                z3 = true;
            } else {
                z3 = false;
            }
            int max = Math.max(this.f408b.mo556j(), this.f415i);
            int i13 = max;
            int max2 = Math.max(this.f408b.mo557k(), this.f416j);
            int i14 = 0;
            boolean z8 = false;
            int i15 = 0;
            while (i14 < size3) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.f414h.get(i14);
                int i16 = size3;
                View view = (View) constraintWidget.f709Z;
                if (view != null) {
                    i7 = k;
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    i6 = j;
                    if (layoutParams.f452Z || layoutParams.f451Y) {
                        i8 = paddingBottom;
                        z6 = z8;
                    } else {
                        z6 = z8;
                        if (view.getVisibility() == 8 || (z && constraintWidget.mo554h().mo599f() && constraintWidget.mo555i().mo599f())) {
                            i8 = paddingBottom;
                        } else {
                            if (layoutParams.width != -2 || !layoutParams.f448V) {
                                i9 = MeasureSpec.makeMeasureSpec(constraintWidget.mo556j(), 1073741824);
                            } else {
                                i9 = getChildMeasureSpec(i11, paddingRight, layoutParams.width);
                            }
                            if (layoutParams.height != -2 || !layoutParams.f449W) {
                                i10 = MeasureSpec.makeMeasureSpec(constraintWidget.mo557k(), 1073741824);
                            } else {
                                i10 = getChildMeasureSpec(i12, paddingBottom, layoutParams.height);
                            }
                            view.measure(i9, i10);
                            if (this.f426t != null) {
                                C0187f fVar = this.f426t;
                                i5 = paddingBottom;
                                fVar.f645b++;
                            } else {
                                i5 = paddingBottom;
                            }
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            if (measuredWidth != constraintWidget.mo556j()) {
                                constraintWidget.mo545d(measuredWidth);
                                if (z) {
                                    constraintWidget.mo554h().mo594a(measuredWidth);
                                }
                                if (z2 && constraintWidget.mo562p() > i13) {
                                    i13 = Math.max(i13, constraintWidget.mo562p() + constraintWidget.mo521a(Type.RIGHT).mo510a());
                                }
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            if (measuredHeight != constraintWidget.mo557k()) {
                                constraintWidget.mo548e(measuredHeight);
                                if (z) {
                                    constraintWidget.mo555i().mo594a(measuredHeight);
                                }
                                if (z3 && constraintWidget.mo563q() > max2) {
                                    max2 = Math.max(max2, constraintWidget.mo563q() + constraintWidget.mo521a(Type.BOTTOM).mo510a());
                                }
                                z8 = true;
                            }
                            if (layoutParams.f450X) {
                                int baseline = view.getBaseline();
                                if (!(baseline == -1 || baseline == constraintWidget.f702R)) {
                                    constraintWidget.f702R = baseline;
                                    z8 = true;
                                }
                            }
                            if (VERSION.SDK_INT >= 11) {
                                i15 = combineMeasuredStates(i15, view.getMeasuredState());
                            } else {
                                int i17 = i15;
                            }
                            i14++;
                            size3 = i16;
                            k = i7;
                            j = i6;
                            paddingBottom = i5;
                            i11 = i;
                        }
                    }
                } else {
                    i8 = paddingBottom;
                    i6 = j;
                    z6 = z8;
                    i7 = k;
                }
                i15 = i15;
                z8 = z6;
                i14++;
                size3 = i16;
                k = i7;
                j = i6;
                paddingBottom = i5;
                i11 = i;
            }
            i3 = paddingBottom;
            int i18 = j;
            int i19 = k;
            int i20 = size3;
            i4 = i15;
            if (z8) {
                this.f408b.mo545d(i18);
                this.f408b.mo548e(i19);
                if (z) {
                    this.f408b.mo577z();
                }
                mo102410a("2nd pass");
                if (this.f408b.mo556j() < i13) {
                    this.f408b.mo545d(i13);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f408b.mo557k() < max2) {
                    this.f408b.mo548e(max2);
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (z5) {
                    mo102410a("3rd pass");
                }
            }
            int i21 = i20;
            for (int i22 = 0; i22 < i21; i22++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.f414h.get(i22);
                View view2 = (View) constraintWidget2.f709Z;
                if (view2 != null && (view2.getMeasuredWidth() != constraintWidget2.mo556j() || view2.getMeasuredHeight() != constraintWidget2.mo557k())) {
                    if (constraintWidget2.f712ab != 8) {
                        view2.measure(MeasureSpec.makeMeasureSpec(constraintWidget2.mo556j(), 1073741824), MeasureSpec.makeMeasureSpec(constraintWidget2.mo557k(), 1073741824));
                        if (this.f426t != null) {
                            this.f426t.f645b++;
                        }
                    }
                }
            }
        } else {
            i3 = paddingBottom;
            i4 = 0;
        }
        int j2 = this.f408b.mo556j() + paddingRight;
        int k2 = this.f408b.mo557k() + i3;
        if (VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = resolveSizeAndState(k2, i12, i4 << 16) & 16777215;
            int min = Math.min(this.f417k, resolveSizeAndState(j2, i, i4) & 16777215);
            int min2 = Math.min(this.f418l, resolveSizeAndState);
            if (this.f408b.f785ay) {
                min |= 16777216;
            }
            if (this.f408b.f786az) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f424r = min;
            this.f425s = min2;
            return;
        }
        setMeasuredDimension(j2, k2);
        this.f424r = j2;
        this.f425s = k2;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* renamed from: a */
    private void m488a(int i, Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f423q == null) {
                this.f423q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f423q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m489a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f465al;
            if ((childAt.getVisibility() != 8 || layoutParams.f451Y || layoutParams.f452Z || isInEditMode) && !layoutParams.f454aa) {
                int l = constraintWidget.mo558l();
                int m = constraintWidget.mo559m();
                int j = constraintWidget.mo556j() + l;
                int k = constraintWidget.mo557k() + m;
                childAt.layout(l, m, j, k);
                if (childAt instanceof C0180c) {
                    View content = ((C0180c) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(l, m, j, k);
                    }
                }
            }
        }
        int size = this.f413g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) this.f413g.get(i6)).mo375b(this);
            }
        }
    }
}
