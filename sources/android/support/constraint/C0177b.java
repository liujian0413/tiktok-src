package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.b */
public final class C0177b {

    /* renamed from: a */
    private static final int[] f510a = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f511c;

    /* renamed from: b */
    private HashMap<Integer, C0179a> f512b = new HashMap<>();

    /* renamed from: android.support.constraint.b$a */
    static class C0179a {

        /* renamed from: A */
        public int f513A;

        /* renamed from: B */
        public int f514B;

        /* renamed from: C */
        public int f515C;

        /* renamed from: D */
        public int f516D;

        /* renamed from: E */
        public int f517E;

        /* renamed from: F */
        public int f518F;

        /* renamed from: G */
        public int f519G;

        /* renamed from: H */
        public int f520H;

        /* renamed from: I */
        public int f521I;

        /* renamed from: J */
        public int f522J;

        /* renamed from: K */
        public int f523K;

        /* renamed from: L */
        public int f524L;

        /* renamed from: M */
        public int f525M;

        /* renamed from: N */
        public int f526N;

        /* renamed from: O */
        public int f527O;

        /* renamed from: P */
        public int f528P;

        /* renamed from: Q */
        public float f529Q;

        /* renamed from: R */
        public float f530R;

        /* renamed from: S */
        public int f531S;

        /* renamed from: T */
        public int f532T;

        /* renamed from: U */
        public float f533U;

        /* renamed from: V */
        public boolean f534V;

        /* renamed from: W */
        public float f535W;

        /* renamed from: X */
        public float f536X;

        /* renamed from: Y */
        public float f537Y;

        /* renamed from: Z */
        public float f538Z;

        /* renamed from: a */
        boolean f539a;

        /* renamed from: aa */
        public float f540aa;

        /* renamed from: ab */
        public float f541ab;

        /* renamed from: ac */
        public float f542ac;

        /* renamed from: ad */
        public float f543ad;

        /* renamed from: ae */
        public float f544ae;

        /* renamed from: af */
        public float f545af;

        /* renamed from: ag */
        public float f546ag;

        /* renamed from: ah */
        public boolean f547ah;

        /* renamed from: ai */
        public boolean f548ai;

        /* renamed from: aj */
        public int f549aj;

        /* renamed from: ak */
        public int f550ak;

        /* renamed from: al */
        public int f551al;

        /* renamed from: am */
        public int f552am;

        /* renamed from: an */
        public int f553an;

        /* renamed from: ao */
        public int f554ao;

        /* renamed from: ap */
        public float f555ap;

        /* renamed from: aq */
        public float f556aq;

        /* renamed from: ar */
        public int f557ar;

        /* renamed from: as */
        public int f558as;

        /* renamed from: at */
        public int[] f559at;

        /* renamed from: b */
        public int f560b;

        /* renamed from: c */
        public int f561c;

        /* renamed from: d */
        int f562d;

        /* renamed from: e */
        public int f563e;

        /* renamed from: f */
        public int f564f;

        /* renamed from: g */
        public float f565g;

        /* renamed from: h */
        public int f566h;

        /* renamed from: i */
        public int f567i;

        /* renamed from: j */
        public int f568j;

        /* renamed from: k */
        public int f569k;

        /* renamed from: l */
        public int f570l;

        /* renamed from: m */
        public int f571m;

        /* renamed from: n */
        public int f572n;

        /* renamed from: o */
        public int f573o;

        /* renamed from: p */
        public int f574p;

        /* renamed from: q */
        public int f575q;

        /* renamed from: r */
        public int f576r;

        /* renamed from: s */
        public int f577s;

        /* renamed from: t */
        public int f578t;

        /* renamed from: u */
        public float f579u;

        /* renamed from: v */
        public float f580v;

        /* renamed from: w */
        public String f581w;

        /* renamed from: x */
        public int f582x;

        /* renamed from: y */
        public int f583y;

        /* renamed from: z */
        public float f584z;

        private C0179a() {
            this.f563e = -1;
            this.f564f = -1;
            this.f565g = -1.0f;
            this.f566h = -1;
            this.f567i = -1;
            this.f568j = -1;
            this.f569k = -1;
            this.f570l = -1;
            this.f571m = -1;
            this.f572n = -1;
            this.f573o = -1;
            this.f574p = -1;
            this.f575q = -1;
            this.f576r = -1;
            this.f577s = -1;
            this.f578t = -1;
            this.f579u = 0.5f;
            this.f580v = 0.5f;
            this.f582x = -1;
            this.f513A = -1;
            this.f514B = -1;
            this.f515C = -1;
            this.f516D = -1;
            this.f517E = -1;
            this.f518F = -1;
            this.f519G = -1;
            this.f520H = -1;
            this.f521I = -1;
            this.f523K = -1;
            this.f524L = -1;
            this.f525M = -1;
            this.f526N = -1;
            this.f527O = -1;
            this.f528P = -1;
            this.f533U = 1.0f;
            this.f540aa = 1.0f;
            this.f541ab = 1.0f;
            this.f542ac = Float.NaN;
            this.f543ad = Float.NaN;
            this.f551al = -1;
            this.f552am = -1;
            this.f553an = -1;
            this.f554ao = -1;
            this.f555ap = 1.0f;
            this.f556aq = 1.0f;
            this.f557ar = -1;
            this.f558as = -1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0179a clone() {
            C0179a aVar = new C0179a();
            aVar.f539a = this.f539a;
            aVar.f560b = this.f560b;
            aVar.f561c = this.f561c;
            aVar.f563e = this.f563e;
            aVar.f564f = this.f564f;
            aVar.f565g = this.f565g;
            aVar.f566h = this.f566h;
            aVar.f567i = this.f567i;
            aVar.f568j = this.f568j;
            aVar.f569k = this.f569k;
            aVar.f570l = this.f570l;
            aVar.f571m = this.f571m;
            aVar.f572n = this.f572n;
            aVar.f573o = this.f573o;
            aVar.f574p = this.f574p;
            aVar.f575q = this.f575q;
            aVar.f576r = this.f576r;
            aVar.f577s = this.f577s;
            aVar.f578t = this.f578t;
            aVar.f579u = this.f579u;
            aVar.f580v = this.f580v;
            aVar.f581w = this.f581w;
            aVar.f513A = this.f513A;
            aVar.f514B = this.f514B;
            aVar.f579u = this.f579u;
            aVar.f579u = this.f579u;
            aVar.f579u = this.f579u;
            aVar.f579u = this.f579u;
            aVar.f579u = this.f579u;
            aVar.f515C = this.f515C;
            aVar.f516D = this.f516D;
            aVar.f517E = this.f517E;
            aVar.f518F = this.f518F;
            aVar.f519G = this.f519G;
            aVar.f520H = this.f520H;
            aVar.f521I = this.f521I;
            aVar.f522J = this.f522J;
            aVar.f523K = this.f523K;
            aVar.f524L = this.f524L;
            aVar.f525M = this.f525M;
            aVar.f526N = this.f526N;
            aVar.f527O = this.f527O;
            aVar.f528P = this.f528P;
            aVar.f529Q = this.f529Q;
            aVar.f530R = this.f530R;
            aVar.f531S = this.f531S;
            aVar.f532T = this.f532T;
            aVar.f533U = this.f533U;
            aVar.f534V = this.f534V;
            aVar.f535W = this.f535W;
            aVar.f536X = this.f536X;
            aVar.f537Y = this.f537Y;
            aVar.f538Z = this.f538Z;
            aVar.f540aa = this.f540aa;
            aVar.f541ab = this.f541ab;
            aVar.f542ac = this.f542ac;
            aVar.f543ad = this.f543ad;
            aVar.f544ae = this.f544ae;
            aVar.f545af = this.f545af;
            aVar.f546ag = this.f546ag;
            aVar.f547ah = this.f547ah;
            aVar.f548ai = this.f548ai;
            aVar.f549aj = this.f549aj;
            aVar.f550ak = this.f550ak;
            aVar.f551al = this.f551al;
            aVar.f552am = this.f552am;
            aVar.f553an = this.f553an;
            aVar.f554ao = this.f554ao;
            aVar.f555ap = this.f555ap;
            aVar.f556aq = this.f556aq;
            aVar.f557ar = this.f557ar;
            aVar.f558as = this.f558as;
            if (this.f559at != null) {
                aVar.f559at = Arrays.copyOf(this.f559at, this.f559at.length);
            }
            aVar.f582x = this.f582x;
            aVar.f583y = this.f583y;
            aVar.f584z = this.f584z;
            return aVar;
        }

        /* renamed from: a */
        public final void mo435a(LayoutParams layoutParams) {
            layoutParams.f469d = this.f566h;
            layoutParams.f470e = this.f567i;
            layoutParams.f471f = this.f568j;
            layoutParams.f472g = this.f569k;
            layoutParams.f473h = this.f570l;
            layoutParams.f474i = this.f571m;
            layoutParams.f475j = this.f572n;
            layoutParams.f476k = this.f573o;
            layoutParams.f477l = this.f574p;
            layoutParams.f481p = this.f575q;
            layoutParams.f482q = this.f576r;
            layoutParams.f483r = this.f577s;
            layoutParams.f484s = this.f578t;
            layoutParams.leftMargin = this.f516D;
            layoutParams.rightMargin = this.f517E;
            layoutParams.topMargin = this.f518F;
            layoutParams.bottomMargin = this.f519G;
            layoutParams.f489x = this.f528P;
            layoutParams.f490y = this.f527O;
            layoutParams.f491z = this.f579u;
            layoutParams.f427A = this.f580v;
            layoutParams.f478m = this.f582x;
            layoutParams.f479n = this.f583y;
            layoutParams.f480o = this.f584z;
            layoutParams.f428B = this.f581w;
            layoutParams.f443Q = this.f513A;
            layoutParams.f444R = this.f514B;
            layoutParams.f432F = this.f529Q;
            layoutParams.f431E = this.f530R;
            layoutParams.f434H = this.f532T;
            layoutParams.f433G = this.f531S;
            layoutParams.f446T = this.f547ah;
            layoutParams.f447U = this.f548ai;
            layoutParams.f435I = this.f549aj;
            layoutParams.f436J = this.f550ak;
            layoutParams.f439M = this.f551al;
            layoutParams.f440N = this.f552am;
            layoutParams.f437K = this.f553an;
            layoutParams.f438L = this.f554ao;
            layoutParams.f441O = this.f555ap;
            layoutParams.f442P = this.f556aq;
            layoutParams.f445S = this.f515C;
            layoutParams.f468c = this.f565g;
            layoutParams.f453a = this.f563e;
            layoutParams.f467b = this.f564f;
            layoutParams.width = this.f560b;
            layoutParams.height = this.f561c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f521I);
                layoutParams.setMarginEnd(this.f520H);
            }
            layoutParams.mo409a();
        }

        /* renamed from: a */
        public final void mo433a(int i, Constraints.LayoutParams layoutParams) {
            mo432a(i, (LayoutParams) layoutParams);
            this.f533U = layoutParams.f494an;
            this.f536X = layoutParams.f497aq;
            this.f537Y = layoutParams.f498ar;
            this.f538Z = layoutParams.f499as;
            this.f540aa = layoutParams.f500at;
            this.f541ab = layoutParams.f501au;
            this.f542ac = layoutParams.f502av;
            this.f543ad = layoutParams.f503aw;
            this.f544ae = layoutParams.f504ax;
            this.f545af = layoutParams.f505ay;
            this.f546ag = layoutParams.f506az;
            this.f535W = layoutParams.f496ap;
            this.f534V = layoutParams.f495ao;
        }

        /* renamed from: a */
        public final void mo432a(int i, LayoutParams layoutParams) {
            this.f562d = i;
            this.f566h = layoutParams.f469d;
            this.f567i = layoutParams.f470e;
            this.f568j = layoutParams.f471f;
            this.f569k = layoutParams.f472g;
            this.f570l = layoutParams.f473h;
            this.f571m = layoutParams.f474i;
            this.f572n = layoutParams.f475j;
            this.f573o = layoutParams.f476k;
            this.f574p = layoutParams.f477l;
            this.f575q = layoutParams.f481p;
            this.f576r = layoutParams.f482q;
            this.f577s = layoutParams.f483r;
            this.f578t = layoutParams.f484s;
            this.f579u = layoutParams.f491z;
            this.f580v = layoutParams.f427A;
            this.f581w = layoutParams.f428B;
            this.f582x = layoutParams.f478m;
            this.f583y = layoutParams.f479n;
            this.f584z = layoutParams.f480o;
            this.f513A = layoutParams.f443Q;
            this.f514B = layoutParams.f444R;
            this.f515C = layoutParams.f445S;
            this.f565g = layoutParams.f468c;
            this.f563e = layoutParams.f453a;
            this.f564f = layoutParams.f467b;
            this.f560b = layoutParams.width;
            this.f561c = layoutParams.height;
            this.f516D = layoutParams.leftMargin;
            this.f517E = layoutParams.rightMargin;
            this.f518F = layoutParams.topMargin;
            this.f519G = layoutParams.bottomMargin;
            this.f529Q = layoutParams.f432F;
            this.f530R = layoutParams.f431E;
            this.f532T = layoutParams.f434H;
            this.f531S = layoutParams.f433G;
            this.f547ah = layoutParams.f446T;
            this.f548ai = layoutParams.f447U;
            this.f549aj = layoutParams.f435I;
            this.f550ak = layoutParams.f436J;
            this.f547ah = layoutParams.f446T;
            this.f551al = layoutParams.f439M;
            this.f552am = layoutParams.f440N;
            this.f553an = layoutParams.f437K;
            this.f554ao = layoutParams.f438L;
            this.f555ap = layoutParams.f441O;
            this.f556aq = layoutParams.f442P;
            if (VERSION.SDK_INT >= 17) {
                this.f520H = layoutParams.getMarginEnd();
                this.f521I = layoutParams.getMarginStart();
            }
        }

        /* renamed from: a */
        public final void mo434a(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            mo433a(i, layoutParams);
            if (constraintHelper instanceof C0176a) {
                this.f558as = 1;
                C0176a aVar = (C0176a) constraintHelper;
                this.f557ar = aVar.getType();
                this.f559at = aVar.getReferencedIds();
            }
        }
    }

    /* renamed from: a */
    public final void mo429a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f512b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f512b.containsKey(Integer.valueOf(id))) {
                    this.f512b.put(Integer.valueOf(id), new C0179a());
                }
                C0179a aVar = (C0179a) this.f512b.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.mo434a((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.mo433a(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f511c = sparseIntArray;
        sparseIntArray.append(47, 25);
        f511c.append(48, 26);
        f511c.append(50, 29);
        f511c.append(51, 30);
        f511c.append(56, 36);
        f511c.append(55, 35);
        f511c.append(29, 4);
        f511c.append(28, 3);
        f511c.append(26, 1);
        f511c.append(64, 6);
        f511c.append(65, 7);
        f511c.append(36, 17);
        f511c.append(37, 18);
        f511c.append(38, 19);
        f511c.append(0, 27);
        f511c.append(52, 32);
        f511c.append(53, 33);
        f511c.append(35, 10);
        f511c.append(34, 9);
        f511c.append(68, 13);
        f511c.append(71, 16);
        f511c.append(69, 14);
        f511c.append(66, 11);
        f511c.append(70, 15);
        f511c.append(67, 12);
        f511c.append(59, 40);
        f511c.append(45, 39);
        f511c.append(44, 41);
        f511c.append(58, 42);
        f511c.append(43, 20);
        f511c.append(57, 37);
        f511c.append(33, 5);
        f511c.append(46, 64);
        f511c.append(54, 64);
        f511c.append(49, 64);
        f511c.append(27, 64);
        f511c.append(25, 64);
        f511c.append(5, 24);
        f511c.append(7, 28);
        f511c.append(19, 31);
        f511c.append(20, 8);
        f511c.append(6, 34);
        f511c.append(8, 2);
        f511c.append(3, 23);
        f511c.append(4, 21);
        f511c.append(2, 22);
        f511c.append(9, 43);
        f511c.append(22, 44);
        f511c.append(17, 45);
        f511c.append(18, 46);
        f511c.append(16, 60);
        f511c.append(14, 47);
        f511c.append(15, 48);
        f511c.append(10, 49);
        f511c.append(11, 50);
        f511c.append(12, 51);
        f511c.append(13, 52);
        f511c.append(21, 53);
        f511c.append(60, 54);
        f511c.append(39, 55);
        f511c.append(61, 56);
        f511c.append(40, 57);
        f511c.append(62, 58);
        f511c.append(41, 59);
        f511c.append(30, 61);
        f511c.append(32, 62);
        f511c.append(31, 63);
        f511c.append(1, 38);
    }

    /* renamed from: b */
    public final void mo430b(ConstraintLayout constraintLayout) {
        mo431c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: a */
    private C0179a m509a(int i) {
        if (!this.f512b.containsKey(Integer.valueOf(i))) {
            this.f512b.put(Integer.valueOf(i), new C0179a());
        }
        return (C0179a) this.f512b.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo431c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f512b.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f512b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0179a aVar = (C0179a) this.f512b.get(Integer.valueOf(id));
                    if (aVar.f558as != -1 && aVar.f558as == 1) {
                        C0176a aVar2 = (C0176a) childAt;
                        aVar2.setId(id);
                        aVar2.setReferencedIds(aVar.f559at);
                        aVar2.setType(aVar.f557ar);
                        aVar.mo435a(ConstraintLayout.m486a());
                    }
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    aVar.mo435a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(aVar.f522J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f533U);
                        childAt.setRotation(aVar.f536X);
                        childAt.setRotationX(aVar.f537Y);
                        childAt.setRotationY(aVar.f538Z);
                        childAt.setScaleX(aVar.f540aa);
                        childAt.setScaleY(aVar.f541ab);
                        if (!Float.isNaN(aVar.f542ac)) {
                            childAt.setPivotX(aVar.f542ac);
                        }
                        if (!Float.isNaN(aVar.f543ad)) {
                            childAt.setPivotY(aVar.f543ad);
                        }
                        childAt.setTranslationX(aVar.f544ae);
                        childAt.setTranslationY(aVar.f545af);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f546ag);
                            if (aVar.f534V) {
                                childAt.setElevation(aVar.f535W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0179a aVar3 = (C0179a) this.f512b.get(num);
            if (aVar3.f558as != -1 && aVar3.f558as == 1) {
                C0176a aVar4 = new C0176a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                aVar4.setReferencedIds(aVar3.f559at);
                aVar4.setType(aVar3.f557ar);
                LayoutParams a = ConstraintLayout.m486a();
                aVar3.mo435a(a);
                constraintLayout.addView(aVar4, a);
            }
            if (aVar3.f539a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                LayoutParams a2 = ConstraintLayout.m486a();
                aVar3.mo435a(a2);
                constraintLayout.addView(guideline, a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo428a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f512b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f512b.containsKey(Integer.valueOf(id))) {
                    this.f512b.put(Integer.valueOf(id), new C0179a());
                }
                C0179a aVar = (C0179a) this.f512b.get(Integer.valueOf(id));
                aVar.mo432a(id, layoutParams);
                aVar.f522J = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.f533U = childAt.getAlpha();
                    aVar.f536X = childAt.getRotation();
                    aVar.f537Y = childAt.getRotationX();
                    aVar.f538Z = childAt.getRotationY();
                    aVar.f540aa = childAt.getScaleX();
                    aVar.f541ab = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        aVar.f542ac = pivotX;
                        aVar.f543ad = pivotY;
                    }
                    aVar.f544ae = childAt.getTranslationX();
                    aVar.f545af = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.f546ag = childAt.getTranslationZ();
                        if (aVar.f534V) {
                            aVar.f535W = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    private C0179a m510a(Context context, AttributeSet attributeSet) {
        C0179a aVar = new C0179a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
        m511a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    public final void mo424a(int i, int i2) {
        if (this.f512b.containsKey(Integer.valueOf(i))) {
            C0179a aVar = (C0179a) this.f512b.get(Integer.valueOf(i));
            aVar.f572n = -1;
            aVar.f573o = -1;
            aVar.f519G = -1;
            aVar.f526N = -1;
        }
    }

    /* renamed from: a */
    public final void mo427a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0179a a = m510a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f539a = true;
                    }
                    this.f512b.put(Integer.valueOf(a.f562d), a);
                }
            }
        } catch (XmlPullParserException unused) {
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    private static void m511a(C0179a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f511c.get(index);
            switch (i2) {
                case 1:
                    aVar.f574p = m508a(typedArray, index, aVar.f574p);
                    break;
                case 2:
                    aVar.f519G = typedArray.getDimensionPixelSize(index, aVar.f519G);
                    break;
                case 3:
                    aVar.f573o = m508a(typedArray, index, aVar.f573o);
                    break;
                case 4:
                    aVar.f572n = m508a(typedArray, index, aVar.f572n);
                    break;
                case 5:
                    aVar.f581w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.f513A = typedArray.getDimensionPixelOffset(index, aVar.f513A);
                    break;
                case 7:
                    aVar.f514B = typedArray.getDimensionPixelOffset(index, aVar.f514B);
                    break;
                case 8:
                    aVar.f520H = typedArray.getDimensionPixelSize(index, aVar.f520H);
                    break;
                case 9:
                    aVar.f578t = m508a(typedArray, index, aVar.f578t);
                    break;
                case 10:
                    aVar.f577s = m508a(typedArray, index, aVar.f577s);
                    break;
                case 11:
                    aVar.f526N = typedArray.getDimensionPixelSize(index, aVar.f526N);
                    break;
                case 12:
                    aVar.f527O = typedArray.getDimensionPixelSize(index, aVar.f527O);
                    break;
                case 13:
                    aVar.f523K = typedArray.getDimensionPixelSize(index, aVar.f523K);
                    break;
                case 14:
                    aVar.f525M = typedArray.getDimensionPixelSize(index, aVar.f525M);
                    break;
                case 15:
                    aVar.f528P = typedArray.getDimensionPixelSize(index, aVar.f528P);
                    break;
                case 16:
                    aVar.f524L = typedArray.getDimensionPixelSize(index, aVar.f524L);
                    break;
                case 17:
                    aVar.f563e = typedArray.getDimensionPixelOffset(index, aVar.f563e);
                    break;
                case 18:
                    aVar.f564f = typedArray.getDimensionPixelOffset(index, aVar.f564f);
                    break;
                case 19:
                    aVar.f565g = typedArray.getFloat(index, aVar.f565g);
                    break;
                case 20:
                    aVar.f579u = typedArray.getFloat(index, aVar.f579u);
                    break;
                case 21:
                    aVar.f561c = typedArray.getLayoutDimension(index, aVar.f561c);
                    break;
                case 22:
                    aVar.f522J = typedArray.getInt(index, aVar.f522J);
                    aVar.f522J = f510a[aVar.f522J];
                    break;
                case 23:
                    aVar.f560b = typedArray.getLayoutDimension(index, aVar.f560b);
                    break;
                case 24:
                    aVar.f516D = typedArray.getDimensionPixelSize(index, aVar.f516D);
                    break;
                case 25:
                    aVar.f566h = m508a(typedArray, index, aVar.f566h);
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    aVar.f567i = m508a(typedArray, index, aVar.f567i);
                    break;
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    aVar.f515C = typedArray.getInt(index, aVar.f515C);
                    break;
                case 28:
                    aVar.f517E = typedArray.getDimensionPixelSize(index, aVar.f517E);
                    break;
                case 29:
                    aVar.f568j = m508a(typedArray, index, aVar.f568j);
                    break;
                case 30:
                    aVar.f569k = m508a(typedArray, index, aVar.f569k);
                    break;
                case 31:
                    aVar.f521I = typedArray.getDimensionPixelSize(index, aVar.f521I);
                    break;
                case 32:
                    aVar.f575q = m508a(typedArray, index, aVar.f575q);
                    break;
                case 33:
                    aVar.f576r = m508a(typedArray, index, aVar.f576r);
                    break;
                case BaseNotice.CHALLENGE /*34*/:
                    aVar.f518F = typedArray.getDimensionPixelSize(index, aVar.f518F);
                    break;
                case 35:
                    aVar.f571m = m508a(typedArray, index, aVar.f571m);
                    break;
                case 36:
                    aVar.f570l = m508a(typedArray, index, aVar.f570l);
                    break;
                case 37:
                    aVar.f580v = typedArray.getFloat(index, aVar.f580v);
                    break;
                case 38:
                    aVar.f562d = typedArray.getResourceId(index, aVar.f562d);
                    break;
                case 39:
                    aVar.f530R = typedArray.getFloat(index, aVar.f530R);
                    break;
                case 40:
                    aVar.f529Q = typedArray.getFloat(index, aVar.f529Q);
                    break;
                case BaseNotice.LIKE /*41*/:
                    aVar.f531S = typedArray.getInt(index, aVar.f531S);
                    break;
                case 42:
                    aVar.f532T = typedArray.getInt(index, aVar.f532T);
                    break;
                case 43:
                    aVar.f533U = typedArray.getFloat(index, aVar.f533U);
                    break;
                case 44:
                    aVar.f534V = true;
                    aVar.f535W = typedArray.getDimension(index, aVar.f535W);
                    break;
                case BaseNotice.f89516AT /*45*/:
                    aVar.f537Y = typedArray.getFloat(index, aVar.f537Y);
                    break;
                case 46:
                    aVar.f538Z = typedArray.getFloat(index, aVar.f538Z);
                    break;
                case 47:
                    aVar.f540aa = typedArray.getFloat(index, aVar.f540aa);
                    break;
                case 48:
                    aVar.f541ab = typedArray.getFloat(index, aVar.f541ab);
                    break;
                case 49:
                    aVar.f542ac = typedArray.getFloat(index, aVar.f542ac);
                    break;
                case 50:
                    aVar.f543ad = typedArray.getFloat(index, aVar.f543ad);
                    break;
                case 51:
                    aVar.f544ae = typedArray.getDimension(index, aVar.f544ae);
                    break;
                case 52:
                    aVar.f545af = typedArray.getDimension(index, aVar.f545af);
                    break;
                case 53:
                    aVar.f546ag = typedArray.getDimension(index, aVar.f546ag);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f536X = typedArray.getFloat(index, aVar.f536X);
                            break;
                        case BaseNotice.TCM /*61*/:
                            aVar.f582x = m508a(typedArray, index, aVar.f582x);
                            break;
                        case BaseNotice.CREATOR /*62*/:
                            aVar.f583y = typedArray.getDimensionPixelSize(index, aVar.f583y);
                            break;
                        case 63:
                            aVar.f584z = typedArray.getFloat(index, aVar.f584z);
                            break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo425a(int i, int i2, int i3) {
        m509a(i).f518F = i3;
    }

    /* renamed from: a */
    private static int m508a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: a */
    public final void mo426a(int i, int i2, int i3, int i4) {
        if (!this.f512b.containsKey(Integer.valueOf(i))) {
            this.f512b.put(Integer.valueOf(i), new C0179a());
        }
        C0179a aVar = (C0179a) this.f512b.get(Integer.valueOf(i));
        aVar.f571m = i3;
        aVar.f570l = -1;
        aVar.f574p = -1;
    }
}
