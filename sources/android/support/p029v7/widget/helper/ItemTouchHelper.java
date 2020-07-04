package android.support.p029v7.widget.helper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0967d;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1265d;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.helper.ItemTouchHelper */
public class ItemTouchHelper extends C1272h implements C1278j {

    /* renamed from: A */
    private C1408b f5448A;

    /* renamed from: B */
    private final C1280l f5449B = new C1280l() {
        /* renamed from: a */
        public final void mo5689a(boolean z) {
            if (z) {
                ItemTouchHelper.this.mo6498a((C1293v) null, 0);
            }
        }

        /* renamed from: a */
        public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.f5467p.mo3752a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.f5458g = motionEvent.getPointerId(0);
                ItemTouchHelper.this.f5454c = motionEvent.getX();
                ItemTouchHelper.this.f5455d = motionEvent.getY();
                ItemTouchHelper.this.mo6506c();
                if (ItemTouchHelper.this.f5453b == null) {
                    C1409c b = ItemTouchHelper.this.mo6504b(motionEvent);
                    if (b != null) {
                        ItemTouchHelper.this.f5454c -= b.f5501l;
                        ItemTouchHelper.this.f5455d -= b.f5502m;
                        ItemTouchHelper.this.mo6499a(b.f5497h, true);
                        if (ItemTouchHelper.this.f5452a.remove(b.f5497h.itemView)) {
                            ItemTouchHelper.this.f5459h.mo6521d(ItemTouchHelper.this.f5462k, b.f5497h);
                        }
                        ItemTouchHelper.this.mo6498a(b.f5497h, b.f5498i);
                        ItemTouchHelper.this.mo6502a(motionEvent, ItemTouchHelper.this.f5460i, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper.this.f5458g = -1;
                ItemTouchHelper.this.mo6498a((C1293v) null, 0);
            } else if (ItemTouchHelper.this.f5458g != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f5458g);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.mo6496a(actionMasked, motionEvent, findPointerIndex);
                }
            }
            if (ItemTouchHelper.this.f5464m != null) {
                ItemTouchHelper.this.f5464m.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f5453b != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r5.f5479a.mo6498a((android.support.p029v7.widget.RecyclerView.C1293v) null, 0);
            r5.f5479a.f5458g = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5691b(android.support.p029v7.widget.RecyclerView r6, android.view.MotionEvent r7) {
            /*
                r5 = this;
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v4.view.d r6 = r6.f5467p
                r6.mo3752a(r7)
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.view.VelocityTracker r6 = r6.f5464m
                if (r6 == 0) goto L_0x0014
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.view.VelocityTracker r6 = r6.f5464m
                r6.addMovement(r7)
            L_0x0014:
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r6 = r6.f5458g
                r0 = -1
                if (r6 != r0) goto L_0x001c
                return
            L_0x001c:
                int r6 = r7.getActionMasked()
                android.support.v7.widget.helper.ItemTouchHelper r1 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r1 = r1.f5458g
                int r1 = r7.findPointerIndex(r1)
                if (r1 < 0) goto L_0x002f
                android.support.v7.widget.helper.ItemTouchHelper r2 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                r2.mo6496a(r6, r7, r1)
            L_0x002f:
                android.support.v7.widget.helper.ItemTouchHelper r2 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v7.widget.RecyclerView$v r2 = r2.f5453b
                if (r2 != 0) goto L_0x0036
                return
            L_0x0036:
                r3 = 6
                r4 = 0
                if (r6 == r3) goto L_0x0081
                switch(r6) {
                    case 1: goto L_0x0076;
                    case 2: goto L_0x004c;
                    case 3: goto L_0x003e;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00a3
            L_0x003e:
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.view.VelocityTracker r6 = r6.f5464m
                if (r6 == 0) goto L_0x0076
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.view.VelocityTracker r6 = r6.f5464m
                r6.clear()
                goto L_0x0076
            L_0x004c:
                if (r1 < 0) goto L_0x00a3
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v7.widget.helper.ItemTouchHelper r0 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r0 = r0.f5460i
                r6.mo6502a(r7, r0, r1)
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                r6.mo6497a(r2)
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v7.widget.RecyclerView r6 = r6.f5462k
                android.support.v7.widget.helper.ItemTouchHelper r7 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                java.lang.Runnable r7 = r7.f5463l
                r6.removeCallbacks(r7)
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                java.lang.Runnable r6 = r6.f5463l
                r6.run()
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v7.widget.RecyclerView r6 = r6.f5462k
                r6.invalidate()
                return
            L_0x0076:
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                r7 = 0
                r6.mo6498a(r7, r4)
                android.support.v7.widget.helper.ItemTouchHelper r6 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                r6.f5458g = r0
                return
            L_0x0081:
                int r6 = r7.getActionIndex()
                int r0 = r7.getPointerId(r6)
                android.support.v7.widget.helper.ItemTouchHelper r1 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r1 = r1.f5458g
                if (r0 != r1) goto L_0x00a3
                if (r6 != 0) goto L_0x0092
                r4 = 1
            L_0x0092:
                android.support.v7.widget.helper.ItemTouchHelper r0 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r1 = r7.getPointerId(r4)
                r0.f5458g = r1
                android.support.v7.widget.helper.ItemTouchHelper r0 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                android.support.v7.widget.helper.ItemTouchHelper r1 = android.support.p029v7.widget.helper.ItemTouchHelper.this
                int r1 = r1.f5460i
                r0.mo6502a(r7, r1, r6)
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.helper.ItemTouchHelper.C14012.mo5691b(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
        }
    };

    /* renamed from: C */
    private Rect f5450C;

    /* renamed from: D */
    private long f5451D;

    /* renamed from: a */
    final List<View> f5452a = new ArrayList();

    /* renamed from: b */
    C1293v f5453b = null;

    /* renamed from: c */
    float f5454c;

    /* renamed from: d */
    float f5455d;

    /* renamed from: e */
    float f5456e;

    /* renamed from: f */
    float f5457f;

    /* renamed from: g */
    int f5458g = -1;

    /* renamed from: h */
    C1405a f5459h;

    /* renamed from: i */
    int f5460i;

    /* renamed from: j */
    List<C1409c> f5461j = new ArrayList();

    /* renamed from: k */
    RecyclerView f5462k;

    /* renamed from: l */
    final Runnable f5463l = new Runnable() {
        public final void run() {
            if (ItemTouchHelper.this.f5453b != null && ItemTouchHelper.this.mo6505b()) {
                if (ItemTouchHelper.this.f5453b != null) {
                    ItemTouchHelper.this.mo6497a(ItemTouchHelper.this.f5453b);
                }
                ItemTouchHelper.this.f5462k.removeCallbacks(ItemTouchHelper.this.f5463l);
                C0991u.m4190a((View) ItemTouchHelper.this.f5462k, (Runnable) this);
            }
        }
    };

    /* renamed from: m */
    VelocityTracker f5464m;

    /* renamed from: n */
    View f5465n = null;

    /* renamed from: o */
    int f5466o = -1;

    /* renamed from: p */
    C0967d f5467p;

    /* renamed from: q */
    private final float[] f5468q = new float[2];

    /* renamed from: r */
    private float f5469r;

    /* renamed from: s */
    private float f5470s;

    /* renamed from: t */
    private float f5471t;

    /* renamed from: u */
    private float f5472u;

    /* renamed from: v */
    private int f5473v = 0;

    /* renamed from: w */
    private int f5474w;

    /* renamed from: x */
    private List<C1293v> f5475x;

    /* renamed from: y */
    private List<Integer> f5476y;

    /* renamed from: z */
    private C1265d f5477z = null;

    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$SimpleCallback */
    public static abstract class SimpleCallback extends C1405a {
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$a */
    public static abstract class C1405a {

        /* renamed from: a */
        private static final Interpolator f5487a = new Interpolator() {
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };

        /* renamed from: b */
        private static final Interpolator f5488b = new Interpolator() {
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        /* renamed from: c */
        private int f5489c = -1;

        /* renamed from: a */
        public static float m6965a(float f) {
            return f;
        }

        /* renamed from: a */
        public static int m6966a(int i, int i2) {
            int i3 = i & 789516;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (i3 ^ -1);
            if (i2 == 0) {
                return i4 | (i3 << 2);
            }
            int i5 = i3 << 1;
            return i4 | (-789517 & i5) | ((i5 & 789516) << 2);
        }

        /* renamed from: b */
        public static float m6971b(float f) {
            return f;
        }

        /* renamed from: c */
        public static int m6973c(int i, int i2) {
            int i3 = i & 3158064;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (i3 ^ -1);
            if (i2 == 0) {
                return i4 | (i3 >> 2);
            }
            int i5 = i3 >> 1;
            return i4 | (-3158065 & i5) | ((i5 & 3158064) >> 2);
        }

        /* renamed from: d */
        private static int m6974d(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: a */
        public abstract int mo6512a(RecyclerView recyclerView, C1293v vVar);

        /* renamed from: a */
        public abstract void mo6515a(C1293v vVar, int i);

        /* renamed from: a */
        public abstract boolean mo6516a(RecyclerView recyclerView, C1293v vVar, C1293v vVar2);

        /* renamed from: b */
        public void mo6519b(C1293v vVar, int i) {
        }

        /* renamed from: a */
        private int m6967a(RecyclerView recyclerView) {
            if (this.f5489c == -1) {
                this.f5489c = recyclerView.getResources().getDimensionPixelSize(R.dimen.ib);
            }
            return this.f5489c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo6517b(RecyclerView recyclerView, C1293v vVar) {
            return m6973c(mo6512a(recyclerView, vVar), C0991u.m4220h(recyclerView));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo6520c(RecyclerView recyclerView, C1293v vVar) {
            if ((mo6517b(recyclerView, vVar) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void mo6521d(RecyclerView recyclerView, C1293v vVar) {
            C1413b.f5507a.mo6536a(vVar.itemView);
        }

        /* renamed from: b */
        public static int m6972b(int i, int i2) {
            return m6974d(2, 15) | m6974d(1, 0) | m6974d(0, 15);
        }

        /* renamed from: a */
        public static long m6968a(RecyclerView recyclerView, int i, float f, float f2) {
            C1267f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.f4942k;
            } else {
                return itemAnimator.f4941j;
            }
        }

        /* renamed from: a */
        public static C1293v m6969a(C1293v vVar, List<C1293v> list, int i, int i2) {
            int width = vVar.itemView.getWidth() + i;
            int height = vVar.itemView.getHeight() + i2;
            int left = i - vVar.itemView.getLeft();
            int top = i2 - vVar.itemView.getTop();
            int size = list.size();
            C1293v vVar2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                C1293v vVar3 = (C1293v) list.get(i4);
                if (left > 0) {
                    int right = vVar3.itemView.getRight() - width;
                    if (right < 0 && vVar3.itemView.getRight() > vVar.itemView.getRight()) {
                        int abs = Math.abs(right);
                        if (abs > i3) {
                            vVar2 = vVar3;
                            i3 = abs;
                        }
                    }
                }
                if (left < 0) {
                    int left2 = vVar3.itemView.getLeft() - i;
                    if (left2 > 0 && vVar3.itemView.getLeft() < vVar.itemView.getLeft()) {
                        int abs2 = Math.abs(left2);
                        if (abs2 > i3) {
                            vVar2 = vVar3;
                            i3 = abs2;
                        }
                    }
                }
                if (top < 0) {
                    int top2 = vVar3.itemView.getTop() - i2;
                    if (top2 > 0 && vVar3.itemView.getTop() < vVar.itemView.getTop()) {
                        int abs3 = Math.abs(top2);
                        if (abs3 > i3) {
                            vVar2 = vVar3;
                            i3 = abs3;
                        }
                    }
                }
                if (top > 0) {
                    int bottom = vVar3.itemView.getBottom() - height;
                    if (bottom < 0 && vVar3.itemView.getBottom() > vVar.itemView.getBottom()) {
                        int abs4 = Math.abs(bottom);
                        if (abs4 > i3) {
                            vVar2 = vVar3;
                            i3 = abs4;
                        }
                    }
                }
            }
            return vVar2;
        }

        /* renamed from: a */
        public final int mo6511a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int signum = (int) Math.signum((float) i2);
            float f = 1.0f;
            int a = (int) (((float) (signum * m6967a(recyclerView))) * f5488b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) a) * f5487a.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: a */
        public void mo6513a(Canvas canvas, RecyclerView recyclerView, C1293v vVar, float f, float f2, int i, boolean z) {
            C1413b.f5507a.mo6535a(canvas, recyclerView, vVar.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6518b(Canvas canvas, RecyclerView recyclerView, C1293v vVar, List<C1409c> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2);
                canvas.restoreToCount(canvas.save());
            }
            if (vVar != null) {
                canvas.restoreToCount(canvas.save());
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1409c cVar = (C1409c) list.get(i3);
                if (cVar.f5504o && !cVar.f5500k) {
                    list.remove(i3);
                } else if (!cVar.f5504o) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: a */
        public static void m6970a(RecyclerView recyclerView, C1293v vVar, int i, C1293v vVar2, int i2, int i3, int i4) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C1411d) {
                ((C1411d) layoutManager).mo5423a(vVar.itemView, vVar2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo5438e()) {
                if (layoutManager.mo5787g(vVar2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo5541b(i2);
                }
                if (layoutManager.mo5791i(vVar2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo5541b(i2);
                }
            }
            if (layoutManager.mo5441f()) {
                if (layoutManager.mo5789h(vVar2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo5541b(i2);
                }
                if (layoutManager.mo5793j(vVar2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo5541b(i2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6514a(Canvas canvas, RecyclerView recyclerView, C1293v vVar, List<C1409c> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1409c cVar = (C1409c) list.get(i2);
                cVar.mo6530c();
                int save = canvas.save();
                mo6513a(canvas, recyclerView, cVar.f5497h, cVar.f5501l, cVar.f5502m, cVar.f5498i, false);
                canvas.restoreToCount(save);
            }
            if (vVar != null) {
                int save2 = canvas.save();
                mo6513a(canvas, recyclerView, vVar, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$b */
    class C1408b extends SimpleOnGestureListener {

        /* renamed from: b */
        private boolean f5491b = true;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6524a() {
            this.f5491b = false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        C1408b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (this.f5491b) {
                View a = ItemTouchHelper.this.mo6495a(motionEvent);
                if (a != null) {
                    C1293v b = ItemTouchHelper.this.f5462k.mo5539b(a);
                    if (b != null && ItemTouchHelper.this.f5459h.mo6520c(ItemTouchHelper.this.f5462k, b) && motionEvent.getPointerId(0) == ItemTouchHelper.this.f5458g) {
                        int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f5458g);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        ItemTouchHelper.this.f5454c = x;
                        ItemTouchHelper.this.f5455d = y;
                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                        ItemTouchHelper.this.f5457f = 0.0f;
                        itemTouchHelper.f5456e = 0.0f;
                        ItemTouchHelper.this.mo6498a(b, 2);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$c */
    static class C1409c implements AnimatorListener {

        /* renamed from: a */
        private final ValueAnimator f5492a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

        /* renamed from: d */
        final float f5493d;

        /* renamed from: e */
        final float f5494e;

        /* renamed from: f */
        final float f5495f;

        /* renamed from: g */
        final float f5496g;

        /* renamed from: h */
        final C1293v f5497h;

        /* renamed from: i */
        final int f5498i;

        /* renamed from: j */
        final int f5499j;

        /* renamed from: k */
        boolean f5500k;

        /* renamed from: l */
        float f5501l;

        /* renamed from: m */
        float f5502m;

        /* renamed from: n */
        boolean f5503n;

        /* renamed from: o */
        boolean f5504o;

        /* renamed from: p */
        public float f5505p;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: b */
        public final void mo6529b() {
            this.f5492a.cancel();
        }

        /* renamed from: a */
        public final void mo6527a() {
            this.f5497h.setIsRecyclable(false);
            this.f5492a.start();
        }

        /* renamed from: c */
        public final void mo6530c() {
            if (this.f5493d == this.f5495f) {
                this.f5501l = this.f5497h.itemView.getTranslationX();
            } else {
                this.f5501l = this.f5493d + (this.f5505p * (this.f5495f - this.f5493d));
            }
            if (this.f5494e == this.f5496g) {
                this.f5502m = this.f5497h.itemView.getTranslationY();
            } else {
                this.f5502m = this.f5494e + (this.f5505p * (this.f5496g - this.f5494e));
            }
        }

        /* renamed from: a */
        public final void mo6528a(long j) {
            this.f5492a.setDuration(j);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5505p = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5504o) {
                this.f5497h.setIsRecyclable(true);
            }
            this.f5504o = true;
        }

        C1409c(C1293v vVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.f5498i = i2;
            this.f5499j = i;
            this.f5497h = vVar;
            this.f5493d = f;
            this.f5494e = f2;
            this.f5495f = f3;
            this.f5496g = f4;
            this.f5492a.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1409c.this.f5505p = valueAnimator.getAnimatedFraction();
                }
            });
            this.f5492a.setTarget(vVar.itemView);
            this.f5492a.addListener(this);
            this.f5505p = 0.0f;
        }
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$d */
    public interface C1411d {
        /* renamed from: a */
        void mo5423a(View view, View view2, int i, int i2);
    }

    /* renamed from: a */
    public final void mo5814a(View view) {
    }

    /* renamed from: a */
    public final void mo6500a(RecyclerView recyclerView) {
        if (this.f5462k != recyclerView) {
            if (this.f5462k != null) {
                m6941e();
            }
            this.f5462k = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f5469r = resources.getDimension(R.dimen.id);
                this.f5470s = resources.getDimension(R.dimen.ic);
                m6940d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6503a() {
        int size = this.f5461j.size();
        for (int i = 0; i < size; i++) {
            if (!((C1409c) this.f5461j.get(i)).f5504o) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6502a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f5456e = x - this.f5454c;
        this.f5457f = y - this.f5455d;
        if ((i & 4) == 0) {
            this.f5456e = Math.max(0.0f, this.f5456e);
        }
        if ((i & 8) == 0) {
            this.f5456e = Math.min(0.0f, this.f5456e);
        }
        if ((i & 1) == 0) {
            this.f5457f = Math.max(0.0f, this.f5457f);
        }
        if ((i & 2) == 0) {
            this.f5457f = Math.min(0.0f, this.f5457f);
        }
    }

    /* renamed from: h */
    private void m6944h() {
        if (this.f5464m != null) {
            this.f5464m.recycle();
            this.f5464m = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6506c() {
        if (this.f5464m != null) {
            this.f5464m.recycle();
        }
        this.f5464m = VelocityTracker.obtain();
    }

    /* renamed from: f */
    private void m6942f() {
        this.f5448A = new C1408b();
        this.f5467p = new C0967d(this.f5462k.getContext(), this.f5448A);
    }

    /* renamed from: g */
    private void m6943g() {
        if (this.f5448A != null) {
            this.f5448A.mo6524a();
            this.f5448A = null;
        }
        if (this.f5467p != null) {
            this.f5467p = null;
        }
    }

    /* renamed from: i */
    private void m6945i() {
        if (VERSION.SDK_INT < 21) {
            if (this.f5477z == null) {
                this.f5477z = new C1265d() {
                    /* renamed from: a */
                    public final int mo5727a(int i, int i2) {
                        if (ItemTouchHelper.this.f5465n == null) {
                            return i2;
                        }
                        int i3 = ItemTouchHelper.this.f5466o;
                        if (i3 == -1) {
                            i3 = ItemTouchHelper.this.f5462k.indexOfChild(ItemTouchHelper.this.f5465n);
                            ItemTouchHelper.this.f5466o = i3;
                        }
                        if (i2 == i - 1) {
                            return i3;
                        }
                        if (i2 < i3) {
                            return i2;
                        }
                        return i2 + 1;
                    }
                };
            }
            this.f5462k.setChildDrawingOrderCallback(this.f5477z);
        }
    }

    /* renamed from: d */
    private void m6940d() {
        this.f5474w = ViewConfiguration.get(this.f5462k.getContext()).getScaledTouchSlop();
        this.f5462k.mo5525a((C1272h) this);
        this.f5462k.mo5527a(this.f5449B);
        this.f5462k.mo5526a((C1278j) this);
        m6942f();
    }

    /* renamed from: e */
    private void m6941e() {
        this.f5462k.mo5542b((C1272h) this);
        this.f5462k.mo5544b(this.f5449B);
        this.f5462k.mo5543b((C1278j) this);
        for (int size = this.f5461j.size() - 1; size >= 0; size--) {
            this.f5459h.mo6521d(this.f5462k, ((C1409c) this.f5461j.get(0)).f5497h);
        }
        this.f5461j.clear();
        this.f5465n = null;
        this.f5466o = -1;
        m6944h();
        m6943g();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r1 > 0) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6505b() {
        /*
            r16 = this;
            r0 = r16
            android.support.v7.widget.RecyclerView$v r1 = r0.f5453b
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f5451D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f5451D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001d
        L_0x0019:
            long r7 = r0.f5451D
            long r7 = r5 - r7
        L_0x001d:
            android.support.v7.widget.RecyclerView r1 = r0.f5462k
            android.support.v7.widget.RecyclerView$i r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f5450C
            if (r9 != 0) goto L_0x002e
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f5450C = r9
        L_0x002e:
            android.support.v7.widget.RecyclerView$v r9 = r0.f5453b
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f5450C
            r1.mo5777b(r9, r10)
            boolean r9 = r1.mo5438e()
            r10 = 0
            if (r9 == 0) goto L_0x0081
            float r9 = r0.f5471t
            float r11 = r0.f5456e
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f5450C
            int r11 = r11.left
            int r11 = r9 - r11
            android.support.v7.widget.RecyclerView r12 = r0.f5462k
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f5456e
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x005b
            if (r11 >= 0) goto L_0x005b
            r12 = r11
            goto L_0x0082
        L_0x005b:
            float r11 = r0.f5456e
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0081
            android.support.v7.widget.RecyclerView$v r11 = r0.f5453b
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f5450C
            int r11 = r11.right
            int r9 = r9 + r11
            android.support.v7.widget.RecyclerView r11 = r0.f5462k
            int r11 = r11.getWidth()
            android.support.v7.widget.RecyclerView r12 = r0.f5462k
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x0081
            r12 = r9
            goto L_0x0082
        L_0x0081:
            r12 = 0
        L_0x0082:
            boolean r1 = r1.mo5441f()
            if (r1 == 0) goto L_0x00ca
            float r1 = r0.f5472u
            float r9 = r0.f5457f
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f5450C
            int r9 = r9.top
            int r9 = r1 - r9
            android.support.v7.widget.RecyclerView r11 = r0.f5462k
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f5457f
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a5
            if (r9 >= 0) goto L_0x00a5
            r1 = r9
            goto L_0x00cb
        L_0x00a5:
            float r9 = r0.f5457f
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            android.support.v7.widget.RecyclerView$v r9 = r0.f5453b
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f5450C
            int r9 = r9.bottom
            int r1 = r1 + r9
            android.support.v7.widget.RecyclerView r9 = r0.f5462k
            int r9 = r9.getHeight()
            android.support.v7.widget.RecyclerView r10 = r0.f5462k
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = 0
        L_0x00cb:
            if (r12 == 0) goto L_0x00e4
            android.support.v7.widget.helper.ItemTouchHelper$a r9 = r0.f5459h
            android.support.v7.widget.RecyclerView r10 = r0.f5462k
            android.support.v7.widget.RecyclerView$v r11 = r0.f5453b
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            android.support.v7.widget.RecyclerView r13 = r0.f5462k
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo6511a(r10, r11, r12, r13, r14)
        L_0x00e4:
            r14 = r12
            if (r1 == 0) goto L_0x0103
            android.support.v7.widget.helper.ItemTouchHelper$a r9 = r0.f5459h
            android.support.v7.widget.RecyclerView r10 = r0.f5462k
            android.support.v7.widget.RecyclerView$v r11 = r0.f5453b
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            android.support.v7.widget.RecyclerView r12 = r0.f5462k
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo6511a(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x0104
        L_0x0103:
            r12 = r14
        L_0x0104:
            if (r12 != 0) goto L_0x010c
            if (r1 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r0.f5451D = r3
            return r2
        L_0x010c:
            long r7 = r0.f5451D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0114
            r0.f5451D = r5
        L_0x0114:
            android.support.v7.widget.RecyclerView r2 = r0.f5462k
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.helper.ItemTouchHelper.mo6505b():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6507c(View view) {
        if (view == this.f5465n) {
            this.f5465n = null;
            if (this.f5477z != null) {
                this.f5462k.setChildDrawingOrderCallback(null);
            }
        }
    }

    public ItemTouchHelper(C1405a aVar) {
        this.f5459h = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1409c mo6504b(MotionEvent motionEvent) {
        if (this.f5461j.isEmpty()) {
            return null;
        }
        View a = mo6495a(motionEvent);
        for (int size = this.f5461j.size() - 1; size >= 0; size--) {
            C1409c cVar = (C1409c) this.f5461j.get(size);
            if (cVar.f5497h.itemView == a) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m6933a(float[] fArr) {
        if ((this.f5460i & 12) != 0) {
            fArr[0] = (this.f5471t + this.f5456e) - ((float) this.f5453b.itemView.getLeft());
        } else {
            fArr[0] = this.f5453b.itemView.getTranslationX();
        }
        if ((this.f5460i & 3) != 0) {
            fArr[1] = (this.f5472u + this.f5457f) - ((float) this.f5453b.itemView.getTop());
        } else {
            fArr[1] = this.f5453b.itemView.getTranslationY();
        }
    }

    /* renamed from: c */
    private int m6937c(C1293v vVar) {
        if (this.f5473v == 2) {
            return 0;
        }
        int a = this.f5459h.mo6512a(this.f5462k, vVar);
        int c = (C1405a.m6973c(a, C0991u.m4220h(this.f5462k)) & 65280) >> 8;
        if (c == 0) {
            return 0;
        }
        int i = (a & 65280) >> 8;
        if (Math.abs(this.f5456e) > Math.abs(this.f5457f)) {
            int b = m6935b(vVar, c);
            if (b <= 0) {
                int c2 = m6938c(vVar, c);
                if (c2 > 0) {
                    return c2;
                }
            } else if ((i & b) == 0) {
                return C1405a.m6966a(b, C0991u.m4220h(this.f5462k));
            } else {
                return b;
            }
        } else {
            int c3 = m6938c(vVar, c);
            if (c3 > 0) {
                return c3;
            }
            int b2 = m6935b(vVar, c);
            if (b2 > 0) {
                if ((i & b2) == 0) {
                    return C1405a.m6966a(b2, C0991u.m4220h(this.f5462k));
                }
                return b2;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private List<C1293v> m6936b(C1293v vVar) {
        C1293v vVar2 = vVar;
        if (this.f5475x == null) {
            this.f5475x = new ArrayList();
            this.f5476y = new ArrayList();
        } else {
            this.f5475x.clear();
            this.f5476y.clear();
        }
        int i = 0;
        int round = Math.round(this.f5471t + this.f5456e) - 0;
        int round2 = Math.round(this.f5472u + this.f5457f) - 0;
        int width = vVar2.itemView.getWidth() + round + 0;
        int height = vVar2.itemView.getHeight() + round2 + 0;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        C1273i layoutManager = this.f5462k.getLayoutManager();
        int s = layoutManager.mo5800s();
        int i4 = 0;
        while (i4 < s) {
            View g = layoutManager.mo5788g(i4);
            if (g != vVar2.itemView && g.getBottom() >= round2 && g.getTop() <= height && g.getRight() >= round && g.getLeft() <= width) {
                C1293v b = this.f5462k.mo5539b(g);
                int abs = Math.abs(i2 - ((g.getLeft() + g.getRight()) / 2));
                int abs2 = Math.abs(i3 - ((g.getTop() + g.getBottom()) / 2));
                int i5 = (abs * abs) + (abs2 * abs2);
                int size = this.f5475x.size();
                int i6 = 0;
                while (i6 < size && i5 > ((Integer) this.f5476y.get(i6)).intValue()) {
                    i++;
                    i6++;
                    C1293v vVar3 = vVar;
                }
                this.f5475x.add(i, b);
                this.f5476y.add(i, Integer.valueOf(i5));
            }
            i4++;
            vVar2 = vVar;
            i = 0;
        }
        return this.f5475x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo6495a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f5453b != null) {
            View view = this.f5453b.itemView;
            if (m6934a(view, x, y, this.f5471t + this.f5456e, this.f5472u + this.f5457f)) {
                return view;
            }
        }
        for (int size = this.f5461j.size() - 1; size >= 0; size--) {
            C1409c cVar = (C1409c) this.f5461j.get(size);
            View view2 = cVar.f5497h.itemView;
            if (m6934a(view2, x, y, cVar.f5501l, cVar.f5502m)) {
                return view2;
            }
        }
        return this.f5462k.mo5519a(x, y);
    }

    /* renamed from: c */
    private C1293v m6939c(MotionEvent motionEvent) {
        C1273i layoutManager = this.f5462k.getLayoutManager();
        if (this.f5458g == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f5458g);
        float x = motionEvent.getX(findPointerIndex) - this.f5454c;
        float y = motionEvent.getY(findPointerIndex) - this.f5455d;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        if (abs < ((float) this.f5474w) && abs2 < ((float) this.f5474w)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo5438e()) {
            return null;
        }
        if (abs2 > abs && layoutManager.mo5441f()) {
            return null;
        }
        View a = mo6495a(motionEvent);
        if (a == null) {
            return null;
        }
        return this.f5462k.mo5539b(a);
    }

    /* renamed from: b */
    public final void mo5815b(View view) {
        mo6507c(view);
        C1293v b = this.f5462k.mo5539b(view);
        if (b != null) {
            if (this.f5453b == null || b != this.f5453b) {
                mo6499a(b, false);
                if (this.f5452a.remove(b.itemView)) {
                    this.f5459h.mo6521d(this.f5462k, b);
                }
                return;
            }
            mo6498a((C1293v) null, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6497a(C1293v vVar) {
        if (!this.f5462k.isLayoutRequested() && this.f5473v == 2) {
            int i = (int) (this.f5471t + this.f5456e);
            int i2 = (int) (this.f5472u + this.f5457f);
            if (((float) Math.abs(i2 - vVar.itemView.getTop())) >= ((float) vVar.itemView.getHeight()) * 0.5f || ((float) Math.abs(i - vVar.itemView.getLeft())) >= ((float) vVar.itemView.getWidth()) * 0.5f) {
                List b = m6936b(vVar);
                if (b.size() != 0) {
                    C1293v a = C1405a.m6969a(vVar, b, i, i2);
                    if (a == null) {
                        this.f5475x.clear();
                        this.f5476y.clear();
                        return;
                    }
                    int adapterPosition = a.getAdapterPosition();
                    int adapterPosition2 = vVar.getAdapterPosition();
                    if (this.f5459h.mo6516a(this.f5462k, vVar, a)) {
                        C1405a.m6970a(this.f5462k, vVar, adapterPosition2, a, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6501a(final C1409c cVar, final int i) {
        this.f5462k.post(new Runnable() {
            public final void run() {
                if (ItemTouchHelper.this.f5462k != null && ItemTouchHelper.this.f5462k.isAttachedToWindow() && !cVar.f5503n && cVar.f5497h.getAdapterPosition() != -1) {
                    C1267f itemAnimator = ItemTouchHelper.this.f5462k.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo5730a(null)) && !ItemTouchHelper.this.mo6503a()) {
                        ItemTouchHelper.this.f5459h.mo6515a(cVar.f5497h, i);
                        return;
                    }
                    ItemTouchHelper.this.f5462k.post(this);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6499a(C1293v vVar, boolean z) {
        for (int size = this.f5461j.size() - 1; size >= 0; size--) {
            C1409c cVar = (C1409c) this.f5461j.get(size);
            if (cVar.f5497h == vVar) {
                cVar.f5503n |= z;
                if (!cVar.f5504o) {
                    cVar.mo6529b();
                }
                this.f5461j.remove(size);
                return;
            }
        }
    }

    /* renamed from: b */
    private int m6935b(C1293v vVar, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.f5456e > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            if (this.f5464m != null && this.f5458g >= 0) {
                this.f5464m.computeCurrentVelocity(1000, C1405a.m6971b(this.f5470s));
                float xVelocity = this.f5464m.getXVelocity(this.f5458g);
                float yVelocity = this.f5464m.getYVelocity(this.f5458g);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= C1405a.m6965a(this.f5469r) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.f5462k.getWidth()) * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.f5456e) > width) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private int m6938c(C1293v vVar, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.f5457f > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (this.f5464m != null && this.f5458g >= 0) {
                this.f5464m.computeCurrentVelocity(1000, C1405a.m6971b(this.f5470s));
                float xVelocity = this.f5464m.getXVelocity(this.f5458g);
                float yVelocity = this.f5464m.getYVelocity(this.f5458g);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= C1405a.m6965a(this.f5469r) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.f5462k.getHeight()) * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.f5457f) > height) {
                return i2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6498a(android.support.p029v7.widget.RecyclerView.C1293v r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            android.support.v7.widget.RecyclerView$v r0 = r11.f5453b
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f5473v
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f5451D = r0
            int r4 = r11.f5473v
            r14 = 1
            r11.mo6499a(r12, r14)
            r11.f5473v = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f5465n = r0
            r23.m6945i()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            android.support.v7.widget.RecyclerView$v r0 = r11.f5453b
            r9 = 0
            if (r0 == 0) goto L_0x00f0
            android.support.v7.widget.RecyclerView$v r8 = r11.f5453b
            android.view.View r0 = r8.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00dc
            if (r4 != r15) goto L_0x004c
            r7 = 0
            goto L_0x0051
        L_0x004c:
            int r0 = r11.m6937c(r8)
            r7 = r0
        L_0x0051:
            r23.m6944h()
            r0 = 4
            r1 = 0
            if (r7 == r0) goto L_0x007e
            if (r7 == r10) goto L_0x007e
            r2 = 16
            if (r7 == r2) goto L_0x007e
            r2 = 32
            if (r7 == r2) goto L_0x007e
            switch(r7) {
                case 1: goto L_0x006a;
                case 2: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            r17 = 0
        L_0x0067:
            r18 = 0
            goto L_0x0090
        L_0x006a:
            float r2 = r11.f5457f
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r3 = r11.f5462k
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
            goto L_0x0090
        L_0x007e:
            float r2 = r11.f5456e
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r3 = r11.f5462k
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
            goto L_0x0067
        L_0x0090:
            if (r4 != r15) goto L_0x0095
            r6 = 8
            goto L_0x009a
        L_0x0095:
            if (r7 <= 0) goto L_0x0099
            r6 = 2
            goto L_0x009a
        L_0x0099:
            r6 = 4
        L_0x009a:
            float[] r0 = r11.f5468q
            r11.m6933a(r0)
            float[] r0 = r11.f5468q
            r19 = r0[r9]
            float[] r0 = r11.f5468q
            r20 = r0[r14]
            android.support.v7.widget.helper.ItemTouchHelper$3 r5 = new android.support.v7.widget.helper.ItemTouchHelper$3
            r0 = r5
            r1 = r23
            r2 = r8
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r22 = r8
            r8 = r18
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.support.v7.widget.RecyclerView r0 = r11.f5462k
            float r1 = r17 - r19
            float r2 = r18 - r20
            long r0 = android.support.p029v7.widget.helper.ItemTouchHelper.C1405a.m6968a(r0, r15, r1, r2)
            r14.mo6528a(r0)
            java.util.List<android.support.v7.widget.helper.ItemTouchHelper$c> r0 = r11.f5461j
            r0.add(r14)
            r14.mo6527a()
            r9 = 1
            goto L_0x00ec
        L_0x00dc:
            r0 = r8
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo6507c(r1)
            android.support.v7.widget.helper.ItemTouchHelper$a r1 = r11.f5459h
            android.support.v7.widget.RecyclerView r2 = r11.f5462k
            r1.mo6521d(r2, r0)
            r9 = 0
        L_0x00ec:
            r0 = 0
            r11.f5453b = r0
            goto L_0x00f3
        L_0x00f0:
            r21 = 8
            r9 = 0
        L_0x00f3:
            if (r12 == 0) goto L_0x0126
            android.support.v7.widget.helper.ItemTouchHelper$a r0 = r11.f5459h
            android.support.v7.widget.RecyclerView r1 = r11.f5462k
            int r0 = r0.mo6517b(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f5473v
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f5460i = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f5471t = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f5472u = r0
            r11.f5453b = r12
            r0 = 2
            if (r13 != r0) goto L_0x0126
            android.support.v7.widget.RecyclerView$v r0 = r11.f5453b
            android.view.View r0 = r0.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0127
        L_0x0126:
            r1 = 0
        L_0x0127:
            android.support.v7.widget.RecyclerView r0 = r11.f5462k
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0137
            android.support.v7.widget.RecyclerView$v r2 = r11.f5453b
            if (r2 == 0) goto L_0x0134
            r1 = 1
        L_0x0134:
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0137:
            if (r9 != 0) goto L_0x0142
            android.support.v7.widget.RecyclerView r0 = r11.f5462k
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            r0.mo5748E()
        L_0x0142:
            android.support.v7.widget.helper.ItemTouchHelper$a r0 = r11.f5459h
            android.support.v7.widget.RecyclerView$v r1 = r11.f5453b
            int r2 = r11.f5473v
            r0.mo6519b(r1, r2)
            android.support.v7.widget.RecyclerView r0 = r11.f5462k
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.helper.ItemTouchHelper.mo6498a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        float f;
        float f2;
        this.f5466o = -1;
        if (this.f5453b != null) {
            m6933a(this.f5468q);
            float f3 = this.f5468q[0];
            f = this.f5468q[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f5459h.mo6514a(canvas, recyclerView, this.f5453b, this.f5461j, this.f5473v, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        float f;
        float f2;
        if (this.f5453b != null) {
            m6933a(this.f5468q);
            float f3 = this.f5468q[0];
            f = this.f5468q[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f5459h.mo6518b(canvas, recyclerView, this.f5453b, this.f5461j, this.f5473v, f2, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6496a(int i, MotionEvent motionEvent, int i2) {
        if (this.f5453b == null && i == 2 && this.f5473v != 2 && this.f5462k.getScrollState() != 1) {
            C1293v c = m6939c(motionEvent);
            if (c != null) {
                int b = (this.f5459h.mo6517b(this.f5462k, c) & 65280) >> 8;
                if (b != 0) {
                    float x = motionEvent.getX(i2);
                    float f = x - this.f5454c;
                    float y = motionEvent.getY(i2) - this.f5455d;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(y);
                    if (abs >= ((float) this.f5474w) || abs2 >= ((float) this.f5474w)) {
                        if (abs > abs2) {
                            if (f < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else if (y < 0.0f && (b & 1) == 0) {
                            return;
                        } else {
                            if (y > 0.0f && (b & 2) == 0) {
                                return;
                            }
                        }
                        this.f5457f = 0.0f;
                        this.f5456e = 0.0f;
                        this.f5458g = motionEvent.getPointerId(0);
                        mo6498a(c, 1);
                    }
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        rect.setEmpty();
    }

    /* renamed from: a */
    private static boolean m6934a(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
