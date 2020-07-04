package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ef */
public final class C15650ef extends C15669ey implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, C15653ei {

    /* renamed from: a */
    static final String[] f44397a = {"2011", "1009", "3010"};

    /* renamed from: b */
    private final Object f44398b = new Object();

    /* renamed from: c */
    private final WeakReference<View> f44399c;

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f44400d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f44401e = new HashMap();

    /* renamed from: f */
    private final Map<String, WeakReference<View>> f44402f = new HashMap();

    /* renamed from: g */
    private C15632dp f44403g;

    /* renamed from: h */
    private View f44404h;

    /* renamed from: i */
    private Point f44405i = new Point();

    /* renamed from: j */
    private Point f44406j = new Point();

    /* renamed from: k */
    private WeakReference<bub> f44407k = new WeakReference<>(null);

    public C15650ef(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        ahd.m45860a(view, (OnGlobalLayoutListener) this);
        ahd.m45861a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f44399c = new WeakReference<>(view);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f44400d.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f44402f.putAll(this.f44400d);
        for (Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f44401e.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f44402f.putAll(this.f44401e);
        C15585bw.m50188a(view.getContext());
    }

    /* renamed from: a */
    public final void mo41626a() {
        synchronized (this.f44398b) {
            this.f44404h = null;
            this.f44403g = null;
            this.f44405i = null;
            this.f44406j = null;
        }
    }

    /* renamed from: a */
    public final void mo41627a(C15345b bVar) {
        int i;
        View view;
        synchronized (this.f44398b) {
            ViewGroup viewGroup = null;
            m50677a((View) null);
            Object a = C15349d.m44669a(bVar);
            if (!(a instanceof C15638du)) {
                acd.m45783e("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            C15638du duVar = (C15638du) a;
            if (!duVar.mo41582c()) {
                acd.m45779c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = (View) this.f44399c.get();
            if (!(this.f44403g == null || view2 == null)) {
                this.f44403g.mo41580b(view2, this.f44402f);
            }
            synchronized (this.f44398b) {
                i = 0;
                if (this.f44403g instanceof C15638du) {
                    C15638du duVar2 = (C15638du) this.f44403g;
                    View view3 = (View) this.f44399c.get();
                    if (!(duVar2 == null || duVar2.mo41603p() == null || view3 == null || !C14793ay.m42913s().mo39043a(view3.getContext()))) {
                        aak q = duVar2.mo41615q();
                        if (q != null) {
                            q.mo39037a(false);
                        }
                        bub bub = (bub) this.f44407k.get();
                        if (!(bub == null || q == null)) {
                            bub.mo41321b((buf) q);
                        }
                    }
                }
            }
            if (!(this.f44403g instanceof C15631do) || !((C15631do) this.f44403g).mo41587h()) {
                this.f44403g = duVar;
                if (duVar instanceof C15631do) {
                    ((C15631do) duVar).mo41577a((C15632dp) null);
                }
            } else {
                ((C15631do) this.f44403g).mo41577a((C15632dp) duVar);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i >= 2) {
                    view = null;
                    break;
                }
                WeakReference weakReference = (WeakReference) this.f44402f.get(strArr[i]);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (view == null) {
                acd.m45783e("Ad choices asset view is not provided.");
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.f44404h = duVar.mo41571a((OnClickListener) this, true);
                    if (this.f44404h != null) {
                        this.f44402f.put("1007", new WeakReference(this.f44404h));
                        this.f44400d.put("1007", new WeakReference(this.f44404h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f44404h);
                    }
                }
            }
            duVar.mo41576a(view2, this.f44400d, this.f44401e, (OnTouchListener) this, (OnClickListener) this);
            acl.f40003a.post(new C15651eg(this, duVar));
            m50677a(view2);
            this.f44403g.mo41598b(view2);
            synchronized (this.f44398b) {
                if (this.f44403g instanceof C15638du) {
                    C15638du duVar3 = (C15638du) this.f44403g;
                    View view4 = (View) this.f44399c.get();
                    if (!(duVar3 == null || duVar3.mo41603p() == null || view4 == null || !C14793ay.m42913s().mo39043a(view4.getContext()))) {
                        bub bub2 = (bub) this.f44407k.get();
                        if (bub2 == null) {
                            bub2 = new bub(view4.getContext(), view4);
                            this.f44407k = new WeakReference<>(bub2);
                        }
                        bub2.mo41319a((buf) duVar3.mo41615q());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo41628b(C15345b bVar) {
        synchronized (this.f44398b) {
            this.f44403g.mo41573a((View) C15349d.m44669a(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m50681a(String[] strArr) {
        for (String str : strArr) {
            if (this.f44400d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f44401e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m50678a(com.google.android.gms.internal.ads.C15638du r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f44398b
            monitor-enter(r0)
            java.lang.String[] r1 = f44397a     // Catch:{ all -> 0x003b }
            int r2 = r1.length     // Catch:{ all -> 0x003b }
            r3 = 0
        L_0x0007:
            if (r3 >= r2) goto L_0x001f
            r4 = r1[r3]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f44402f     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r7.mo41591l()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            com.google.android.gms.internal.ads.eh r2 = new com.google.android.gms.internal.ads.eh     // Catch:{ all -> 0x003b }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003b }
            boolean r3 = r7 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0036
            r7.mo41613b(r1, r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r7.mo41594a(r1, r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15650ef.m50678a(com.google.android.gms.internal.ads.du):void");
    }

    /* renamed from: a */
    private final void m50677a(View view) {
        C15632dp dpVar;
        synchronized (this.f44398b) {
            if (this.f44403g != null) {
                if (this.f44403g instanceof C15631do) {
                    dpVar = ((C15631do) this.f44403g).mo41588i();
                } else {
                    dpVar = this.f44403g;
                }
                if (dpVar != null) {
                    dpVar.mo41600c(view);
                }
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f44398b) {
            if (this.f44403g != null) {
                View view = (View) this.f44399c.get();
                if (view != null) {
                    this.f44403g.mo41601c(view, this.f44402f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f44398b) {
            if (this.f44403g != null) {
                View view = (View) this.f44399c.get();
                if (view != null) {
                    this.f44403g.mo41601c(view, this.f44402f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f44398b) {
            if (this.f44403g == null) {
                return false;
            }
            View view2 = (View) this.f44399c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f44405i = point;
            if (motionEvent.getAction() == 0) {
                this.f44406j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f44403g.mo41572a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo41620b() {
        return this.f44402f;
    }

    /* renamed from: c */
    public final View mo41621c() {
        return (View) this.f44399c.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f44398b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dp r1 = r9.f44403g     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r9.f44399c     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0096 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0096 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f44405i     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m50676a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f44405i     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m50676a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f44406j     // Catch:{ all -> 0x0096 }
            int r2 = r2.x     // Catch:{ all -> 0x0096 }
            int r2 = r9.m50676a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f44406j     // Catch:{ all -> 0x0096 }
            int r2 = r2.y     // Catch:{ all -> 0x0096 }
            int r2 = r9.m50676a(r2)     // Catch:{ all -> 0x0096 }
            float r2 = (float) r2     // Catch:{ all -> 0x0096 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0096 }
            android.view.View r1 = r9.f44404h     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            android.view.View r1 = r9.f44404h     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.dp r1 = r9.f44403g     // Catch:{ all -> 0x0096 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.dp r1 = r9.f44403g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.do r1 = (com.google.android.gms.internal.ads.C15631do) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dp r1 = r1.mo41588i()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.dp r1 = r9.f44403g     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.do r1 = (com.google.android.gms.internal.ads.C15631do) r1     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ads.dp r2 = r1.mo41588i()     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44402f     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo41595a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x0081:
            com.google.android.gms.internal.ads.dp r2 = r9.f44403g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44402f     // Catch:{ all -> 0x0096 }
            r8 = 0
            r3 = r10
            r2.mo41595a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0096 }
            goto L_0x0094
        L_0x008d:
            com.google.android.gms.internal.ads.dp r1 = r9.f44403g     // Catch:{ all -> 0x0096 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f44402f     // Catch:{ all -> 0x0096 }
            r1.mo41575a(r10, r2, r5, r7)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15650ef.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final int m50676a(int i) {
        int b;
        synchronized (this.f44398b) {
            b = afb.m45731b(this.f44403g.mo41603p(), i);
        }
        return b;
    }
}
