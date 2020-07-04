package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.poi.preview.C35142b;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35143a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35151b;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.C35156a;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter.C35155a;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage.C35198b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.i */
public final class C35169i extends FrameLayout implements C35143a {

    /* renamed from: a */
    public TransferImage f92025a;

    /* renamed from: b */
    public ViewPager f92026b;

    /* renamed from: c */
    public C35166h f92027c;

    /* renamed from: d */
    float f92028d;

    /* renamed from: e */
    public C0935e f92029e = new SimpleOnPageChangeListener() {
        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                C35142b.m113366a(C35169i.this.f92026b.getCurrentItem(), C35169i.this.f92027c.f91992w, C35169i.this.f92027c.f91993x, C35169i.this.f92027c.f91994y);
            }
        }

        public final void onPageSelected(int i) {
            C35169i.this.f92027c.f91970a = i % C35169i.this.f92027c.f91969F;
            if (C35169i.this.f92027c.f91976g) {
                C35169i.this.mo89503a(i, 0);
                return;
            }
            for (int i2 = 1; i2 <= C35169i.this.f92027c.f91971b; i2++) {
                C35169i.this.mo89503a(i, i2);
            }
        }
    };

    /* renamed from: f */
    C35198b f92030f = new C35198b() {
        /* renamed from: a */
        public final void mo89519a(int i, int i2, int i3) {
            if (i2 == 100) {
                switch (i) {
                    case 1:
                        C35169i.this.mo89507c();
                        C35169i.this.f92026b.setVisibility(0);
                        C35169i.m113478a((View) C35169i.this.f92025a);
                        return;
                    case 2:
                        C35169i.this.mo89502a();
                        return;
                    default:
                        return;
                }
            } else {
                switch (i) {
                    case 1:
                        if (i3 == 201) {
                            C35169i.this.mo89507c();
                            C35169i.this.f92026b.setVisibility(0);
                            C35169i.m113478a((View) C35169i.this.f92025a);
                            return;
                        }
                        break;
                    case 2:
                        if (i3 == 201) {
                            C35169i.this.mo89502a();
                            break;
                        }
                        break;
                }
            }
        }
    };

    /* renamed from: g */
    private TransferAdapter f92031g;

    /* renamed from: h */
    private C35177a f92032h;

    /* renamed from: i */
    private Set<Integer> f92033i;

    /* renamed from: j */
    private C35154a f92034j;

    /* renamed from: k */
    private Context f92035k;

    /* renamed from: l */
    private C35155a f92036l = new C35155a() {
        /* renamed from: a */
        public final void mo89459a() {
            C35169i.this.f92026b.addOnPageChangeListener(C35169i.this.f92029e);
            int i = C35169i.this.f92027c.f91970a;
            if (C35169i.this.f92027c.f91976g) {
                C35169i.this.mo89503a(i, 0);
            } else {
                C35169i.this.mo89503a(i, 1);
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.i$a */
    interface C35177a {
        /* renamed from: a */
        void mo89524a();
    }

    public final Context getActivityContext() {
        return this.f92035k;
    }

    public final TransferAdapter getTransAdapter() {
        return this.f92031g;
    }

    public final C35166h getTransConfig() {
        return this.f92027c;
    }

    public final C35198b getTransListener() {
        return this.f92030f;
    }

    public final C35166h getTransferConfig() {
        return this.f92027c;
    }

    /* access modifiers changed from: 0000 */
    public final ViewPager getViewPager() {
        return this.f92026b;
    }

    /* renamed from: d */
    public final void mo89508d() {
        m113480c(this.f92027c.mo89476i());
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92026b.removeOnPageChangeListener(this.f92029e);
    }

    /* renamed from: f */
    private void m113482f() {
        C35151b bVar = this.f92027c.f91985p;
        if (bVar == null) {
            return;
        }
        if (this.f92027c.f91969F >= 2 || this.f92027c.f91965B) {
            bVar.mo89438a();
        }
    }

    /* renamed from: g */
    private void m113483g() {
        C35151b bVar = this.f92027c.f91985p;
        if (bVar != null && this.f92027c.f91969F >= 2) {
            bVar.mo89444b();
        }
    }

    /* renamed from: c */
    public final void mo89507c() {
        C35151b bVar = this.f92027c.f91985p;
        if (bVar == null) {
            return;
        }
        if (this.f92027c.f91969F > 0 || this.f92027c.f91965B) {
            bVar.mo89440a(this, this);
            bVar.mo89439a(this.f92026b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final TransferImage getCurrentImage() {
        return this.f92031g.mo89455a(this.f92026b.getCurrentItem() % this.f92027c.f91969F);
    }

    /* renamed from: b */
    public final void mo89506b() {
        m113481e();
        int i = this.f92027c.f91970a;
        if (i < 0) {
            i = 0;
            C6877n.m21407a("poi_log", "", C6869c.m21381a().mo16887a("service", "preview").mo16887a("status", this.f92027c.f91993x).mo16888b());
        }
        this.f92025a = mo89501a(i).mo89460a(i);
    }

    /* renamed from: e */
    private void m113481e() {
        int i;
        int size = this.f92027c.f91981l.size();
        this.f92031g = C35156a.m113411a(this.f92027c.f91967D, this, size, this.f92027c.f91970a);
        if (this.f92027c.f91967D) {
            double d = (double) size;
            double ceil = Math.ceil((double) (1.07374182E9f / ((float) size)));
            Double.isNaN(d);
            i = (int) (d * ceil);
        } else {
            i = 0;
        }
        this.f92031g.mo89456a(this.f92036l);
        this.f92026b = new ViewPager(this.f92035k);
        this.f92026b.setVisibility(4);
        this.f92026b.setOffscreenPageLimit(this.f92027c.f91971b + 1);
        this.f92026b.setAdapter(this.f92031g);
        this.f92026b.setCurrentItem(i + this.f92027c.f91970a);
        addView(this.f92026b, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo89502a() {
        this.f92033i.clear();
        m113483g();
        removeAllViews();
        this.f92032h.mo89524a();
    }

    public final void setOnLayoutResetListener(C35177a aVar) {
        this.f92032h = aVar;
    }

    /* renamed from: a */
    public static void m113478a(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f92034j != null) {
            this.f92034j.mo89454b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m113479b(int i) {
        int size = i % this.f92027c.f91981l.size();
        mo89501a(size).mo89462b(size);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo89500a(float f) {
        int i = this.f92027c.f91974e;
        return Color.argb(Math.round(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1 || this.f92034j == null || !this.f92034j.mo89453a(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    C35169i(Context context) {
        super(context);
        this.f92035k = context;
        this.f92033i = new HashSet();
    }

    /* renamed from: a */
    public final C35178j mo89501a(int i) {
        if (!this.f92027c.mo89471d()) {
            return new C35163f(this);
        }
        if (this.f92027c.f91986q.mo89427a((String) this.f92027c.f91981l.get(i))) {
            return new C35160d(this);
        }
        return new C35157b(this);
    }

    /* renamed from: c */
    private void m113480c(int i) {
        this.f92025a = this.f92031g.mo89455a(i);
        if (this.f92025a == null) {
            mo89502a();
            return;
        }
        this.f92025a.setState(2);
        this.f92025a.mo89539b();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(this.f92027c.f91975f);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f})});
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C35169i.this.f92025a.setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C35169i.this.mo89502a();
            }
        });
        valueAnimator.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dismiss(int r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.poi.preview.transfer.adapter.TransferAdapter r0 = r2.f92031g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r2.f92025a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r2.f92025a
            int r0 = r0.getState()
            r1 = 2
            if (r0 != r1) goto L_0x0013
            return
        L_0x0013:
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r2.f92027c
            int r0 = r0.mo89476i()
            r1 = 0
            if (r0 <= 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r2.f92027c
            int r0 = r0.mo89476i()
            if (r3 == r0) goto L_0x0036
            r2.f92025a = r1
            goto L_0x0040
        L_0x0027:
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r2.f92027c
            int r0 = r0.f91977h
            if (r0 <= 0) goto L_0x0036
            com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = r2.f92027c
            int r0 = r0.f91977h
            if (r3 < r0) goto L_0x0036
            r2.f92025a = r1
            goto L_0x0040
        L_0x0036:
            com.ss.android.ugc.aweme.poi.preview.transfer.j r0 = r2.mo89501a(r3)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r0.mo89463c(r3)
            r2.f92025a = r0
        L_0x0040:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r2.f92025a
            if (r0 != 0) goto L_0x0048
            r2.m113480c(r3)
            goto L_0x004e
        L_0x0048:
            android.support.v4.view.ViewPager r3 = r2.f92026b
            r0 = 4
            r3.setVisibility(r0)
        L_0x004e:
            r2.m113482f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.preview.transfer.C35169i.dismiss(int):void");
    }

    /* renamed from: a */
    public final void mo89505a(C35166h hVar) {
        this.f92027c = hVar;
        if (this.f92027c.f91968E) {
            this.f92034j = new C35154a(this);
        }
    }

    /* renamed from: a */
    public final void mo89503a(int i, int i2) {
        int i3 = i - i2;
        int i4 = i2 + i;
        m113479b(i);
        this.f92033i.add(Integer.valueOf(i));
        if (i3 >= 0 && !this.f92033i.contains(Integer.valueOf(i3))) {
            m113479b(i3);
            this.f92033i.add(Integer.valueOf(i3));
        }
        if (i4 < this.f92027c.f91981l.size() && !this.f92033i.contains(Integer.valueOf(i4))) {
            m113479b(i4);
            this.f92033i.add(Integer.valueOf(i4));
        }
    }

    /* renamed from: a */
    public final void mo89504a(final ImageView imageView, final int i) {
        imageView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C35169i.this.f92027c.f91966C != null) {
                    C35169i.this.f92026b.getCurrentItem();
                }
                C35169i.this.dismiss(i);
            }
        });
        if (this.f92027c.f91964A != null) {
            imageView.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return false;
                }
            });
        }
    }
}
