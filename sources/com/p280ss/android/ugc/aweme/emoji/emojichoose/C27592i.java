package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.GridView;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27632c;
import com.p280ss.android.ugc.aweme.emoji.utils.C27634e;
import com.p280ss.android.ugc.aweme.emoji.utils.FixedSizeLinkedHashMap;
import com.p280ss.android.ugc.aweme.emoji.views.C27682b;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.i */
public final class C27592i {

    /* renamed from: a */
    private String f72705a;

    /* renamed from: b */
    private int f72706b;

    /* renamed from: c */
    private FixedSizeLinkedHashMap<String, C27588g> f72707c;

    /* renamed from: d */
    private float f72708d;

    /* renamed from: e */
    private long f72709e;

    /* renamed from: f */
    private long f72710f;

    /* renamed from: g */
    private boolean f72711g;

    /* renamed from: h */
    private long f72712h;

    /* renamed from: i */
    private int f72713i;

    /* renamed from: j */
    private Handler f72714j;

    /* renamed from: k */
    private float f72715k;

    /* renamed from: l */
    private float f72716l;

    /* renamed from: m */
    private C27682b f72717m;

    /* renamed from: a */
    public final View mo70834a(ViewGroup viewGroup, SwipeControlledViewPager swipeControlledViewPager, int i, C27523g gVar, C27601o oVar) {
        C27598m f = gVar.mo70743f();
        C27522f c = f.mo70850c(i);
        if (c == null || !c.mo70720h()) {
            return m90422a(viewGroup, (T) new C27591h());
        }
        if (c.mo70721i() == 3) {
            if (C27536b.m90251a().f72589a == 0) {
                return m90422a(viewGroup, (T) new C27591h());
            }
            if (c.mo70734j() == 0) {
                if (this.f72706b == 1) {
                    return m90422a(viewGroup, (T) new C27587f(viewGroup.getContext().getString(R.string.b06)));
                }
                if (this.f72706b == 0) {
                    return m90422a(viewGroup, (T) new C27580a());
                }
            }
        }
        List d = f.mo70853d(i);
        int e = f.mo70855e(i);
        if (c.mo70721i() == 4) {
            if (C27503a.m90145a().f72538a == 0) {
                return m90422a(viewGroup, (T) new C27591h());
            }
            if (C27515h.m90173c(e) && C27515h.m90171a(d)) {
                return m90422a(viewGroup, (T) new C27587f(viewGroup.getContext().getString(R.string.b08)));
            }
        }
        String a = C1642a.m8034a(this.f72705a, new Object[]{c.mo70722k(), String.valueOf(e)});
        C27588g gVar2 = (C27588g) this.f72707c.remove(a);
        if (gVar2 != null) {
            this.f72707c.put(a, gVar2);
            View view = gVar2.f72694a;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view);
            }
            if (!m90431a(d, gVar2.mo70826a())) {
                m90427a(gVar2, d, c, oVar, swipeControlledViewPager, f, i);
            }
            return view;
        }
        C27588g gVar3 = new C27588g(viewGroup, c.mo70721i());
        this.f72707c.put(a, gVar3);
        View view2 = gVar3.f72694a;
        if (viewGroup.indexOfChild(view2) < 0) {
            viewGroup.addView(view2);
        }
        m90427a(gVar3, d, c, oVar, swipeControlledViewPager, f, i);
        return view2;
    }

    /* renamed from: a */
    private static boolean m90431a(List<C27517a> list, List<C27517a> list2) {
        boolean z = false;
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            if (!((C27517a) list.get(i)).equals((C27517a) list2.get(i))) {
                break;
            }
            i++;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo70836a(List list, GridView gridView, List list2, SwipeControlledViewPager swipeControlledViewPager, View view, MotionEvent motionEvent) {
        List list3 = list;
        switch (motionEvent.getAction()) {
            case 0:
                SwipeControlledViewPager swipeControlledViewPager2 = swipeControlledViewPager;
                this.f72710f = System.currentTimeMillis();
                this.f72709e = 0;
                this.f72712h = System.currentTimeMillis();
                this.f72708d = motionEvent.getX();
                list.clear();
                this.f72715k = motionEvent.getX();
                this.f72716l = motionEvent.getY();
                for (int i = 0; i < gridView.getChildCount(); i++) {
                    list.add(gridView.getChildAt(i));
                }
                this.f72714j.removeCallbacksAndMessages(null);
                Handler handler = this.f72714j;
                C27597l lVar = new C27597l(this, list, list2, view, swipeControlledViewPager);
                handler.postDelayed(lVar, 500);
                break;
            case 1:
            case 3:
                this.f72714j.removeCallbacksAndMessages(null);
                m90423a();
                if (this.f72713i >= 0) {
                    View findViewById = ((View) list.get(this.f72713i)).findViewById(R.id.adx);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                this.f72713i = -1;
                this.f72711g = true;
                swipeControlledViewPager.setSwipeEnabled(true);
                this.f72712h = 0;
                this.f72709e = System.currentTimeMillis() - this.f72710f;
                break;
            case 2:
                m90424a(motionEvent.getX(), motionEvent.getY(), list, list2, view, swipeControlledViewPager);
                break;
        }
        return this.f72709e >= 500;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70835a(List list, List list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        m90424a(this.f72715k, this.f72716l, list, list2, view, swipeControlledViewPager);
    }

    /* renamed from: a */
    private static boolean m90430a(C27517a aVar) {
        int i = aVar.f72556a;
        return i == R.drawable.zw || i == R.drawable.a04;
    }

    public C27592i() {
        this(0);
    }

    /* renamed from: a */
    private void m90423a() {
        if (this.f72717m != null && this.f72717m.isShowing()) {
            this.f72717m.dismiss();
        }
    }

    public C27592i(int i) {
        this.f72711g = true;
        this.f72713i = -1;
        this.f72714j = new Handler(Looper.getMainLooper());
        this.f72706b = i;
        this.f72707c = new FixedSizeLinkedHashMap<>(5);
        this.f72705a = C6399b.m19921a().getString(R.string.b0a);
    }

    /* renamed from: a */
    private static <T extends C27600n> View m90422a(ViewGroup viewGroup, T t) {
        View a = t.mo70814a(viewGroup);
        if (viewGroup.indexOfChild(a) < 0) {
            viewGroup.addView(a);
        }
        return a;
    }

    /* renamed from: a */
    private void m90426a(GridView gridView, SwipeControlledViewPager swipeControlledViewPager, List<C27517a> list) {
        C27596k kVar = new C27596k(this, new ArrayList(), gridView, list, swipeControlledViewPager);
        gridView.setOnTouchListener(kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m90425a(int r17, com.p280ss.android.ugc.aweme.base.model.UrlModel r18, android.view.View r19, android.content.Context r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            int r5 = r0.f72713i
            if (r5 != r1) goto L_0x000f
            return
        L_0x000f:
            r5 = 2131231721(0x7f0803e9, float:1.807953E38)
            r3.setBackgroundResource(r5)
            r0.f72713i = r1
            int r5 = com.bytedance.common.utility.C9738o.m28691a(r20)
            float r5 = (float) r5
            r6 = 1050924810(0x3ea3d70a, float:0.32)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r5 * 9
            int r6 = r6 / 120
            int r7 = r6 * 56
            int r7 = r7 / 27
            float r8 = (float) r5
            float r9 = (float) r6
            r10 = 1068876431(0x3fb5c28f, float:1.42)
            float r9 = r9 * r10
            r10 = 1091567616(0x41100000, float:9.0)
            float r9 = r9 / r10
            float r8 = r8 - r9
            int r8 = (int) r8
            int r9 = r8 + r6
            int r1 = r1 % 4
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r20)
            r11 = 2131493342(0x7f0c01de, float:1.8610161E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r12)
            android.view.WindowManager$LayoutParams r11 = new android.view.WindowManager$LayoutParams
            r11.<init>()
            r11.width = r5
            r11.height = r9
            r10.setLayoutParams(r11)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f72717m
            if (r11 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f72717m
            boolean r11 = r11.isShowing()
            if (r11 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f72717m
            r11.dismiss()
            goto L_0x006b
        L_0x0064:
            com.ss.android.ugc.aweme.emoji.views.b r11 = new com.ss.android.ugc.aweme.emoji.views.b
            r11.<init>()
            r0.f72717m = r11
        L_0x006b:
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f72717m
            r11.mo71117a(r10, r4)
            com.ss.android.ugc.aweme.emoji.views.b r11 = r0.f72717m
            r12 = 0
            r11.f72972a = r12
            int r11 = r5 - r7
            int r13 = r11 / 2
            r14 = 2
            if (r1 != 0) goto L_0x0085
            int r1 = r19.getWidth()
            int r1 = r1 - r7
            int r13 = r1 / 2
        L_0x0083:
            r1 = 0
            goto L_0x00a6
        L_0x0085:
            r15 = 1
            if (r1 == r15) goto L_0x009e
            if (r1 != r14) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            r15 = 3
            if (r1 != r15) goto L_0x0083
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r13 = r19.getWidth()
            int r13 = r13 - r7
            int r13 = r13 / r14
            int r13 = r11 - r13
            goto L_0x00a6
        L_0x009e:
            int r1 = r19.getWidth()
            int r1 = r5 - r1
            int r1 = -r1
            int r1 = r1 / r14
        L_0x00a6:
            r11 = 2131298995(0x7f090ab3, float:1.8215979E38)
            android.view.View r11 = r10.findViewById(r11)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r11
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            r14.width = r5
            r14.height = r5
            r15 = 1092616192(0x41200000, float:10.0)
            float r15 = com.bytedance.common.utility.C9738o.m28708b(r4, r15)
            int r15 = (int) r15
            r11.setPadding(r15, r15, r15, r15)
            r11.setLayoutParams(r14)
            r14 = 2131299140(0x7f090b44, float:1.8216273E38)
            android.view.View r10 = r10.findViewById(r14)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            r14.width = r7
            r14.height = r6
            r14.setMargins(r13, r8, r12, r12)
            r10.setLayoutParams(r14)
            com.ss.android.ugc.aweme.emoji.views.b r6 = r0.f72717m
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = com.bytedance.common.utility.C9738o.m28708b(r4, r7)
            int r4 = (int) r4
            int r4 = -r4
            r6.mo71116a(r3, r1, r4)
            if (r21 == 0) goto L_0x00f0
            com.p280ss.android.ugc.aweme.emoji.utils.C27636g.m90607a(r11, r2)
            goto L_0x00f3
        L_0x00f0:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r11, r2)
        L_0x00f3:
            com.ss.android.ugc.aweme.emoji.views.b r1 = r0.f72717m
            r1.update(r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.emojichoose.C27592i.m90425a(int, com.ss.android.ugc.aweme.base.model.UrlModel, android.view.View, android.content.Context, boolean):void");
    }

    /* renamed from: a */
    private static void m90428a(C27588g gVar, List<C27517a> list, C27601o oVar, C27598m mVar, int i) {
        gVar.f72695b.setOnItemClickListener(new C27595j(list, oVar, mVar, i));
    }

    /* renamed from: a */
    private void m90424a(float f, float f2, List<View> list, List<C27517a> list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view2 = (View) it.next();
            if (f <= ((float) view2.getLeft()) || f >= ((float) view2.getRight()) || f2 >= ((float) view2.getBottom()) || f2 <= ((float) view2.getTop())) {
                i++;
            } else {
                if (this.f72713i != i && System.currentTimeMillis() - this.f72712h > 500 && Math.abs(f - this.f72708d) < 20.0f) {
                    this.f72711g = false;
                    swipeControlledViewPager.setSwipeEnabled(false);
                    this.f72714j.removeCallbacksAndMessages(null);
                }
                if (this.f72713i >= 0 && i != this.f72713i) {
                    View findViewById = ((View) list.get(this.f72713i)).findViewById(R.id.adx);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                if (!this.f72711g && i < list2.size()) {
                    View findViewById2 = ((View) list.get(i)).findViewById(R.id.adx);
                    C27517a aVar = (C27517a) list2.get(i);
                    if (aVar.mo70726a() && !m90430a(aVar) && findViewById2 != null) {
                        if (aVar.f72559d.getStickerType() == 1) {
                            StringBuilder sb = new StringBuilder("file://");
                            sb.append(C27632c.m90591b(aVar.f72559d));
                            String sb2 = sb.toString();
                            UrlModel animateUrl = aVar.f72559d.getAnimateUrl();
                            if (new File(sb2).exists()) {
                                animateUrl = new UrlModel();
                                animateUrl.setUri(sb2);
                                animateUrl.setUrlList(Collections.singletonList(sb2));
                            }
                            m90425a(i, animateUrl, findViewById2, view.getContext(), C27507a.m90163c(aVar.f72559d));
                        } else {
                            m90425a(i, aVar.f72559d.getAnimateUrl(), findViewById2, view.getContext(), C27507a.m90163c(aVar.f72559d));
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m90427a(C27588g gVar, List<C27517a> list, C27522f fVar, C27601o oVar, SwipeControlledViewPager swipeControlledViewPager, C27598m mVar, int i) {
        gVar.mo70827a(list);
        if (fVar.mo70721i() == 2 || fVar.mo70721i() == 4 || fVar.mo70721i() == 3) {
            gVar.f72695b.setSelector(new ColorDrawable(0));
            m90426a(gVar.f72695b, swipeControlledViewPager, list);
        }
        m90428a(gVar, list, oVar, mVar, i);
    }

    /* renamed from: a */
    static final /* synthetic */ void m90429a(List list, C27601o oVar, C27598m mVar, int i, AdapterView adapterView, View view, int i2, long j) {
        C27517a aVar = (C27517a) list.get(i2);
        if (aVar != null) {
            if (aVar.f72556a == R.drawable.zw) {
                oVar.mo70810b();
            } else if (aVar.f72556a == R.drawable.a04) {
                oVar.mo70811c();
            } else if (aVar.f72556a == R.drawable.zz) {
                oVar.mo70807a();
            } else if (aVar.mo70726a()) {
                oVar.mo70808a(view.findViewById(R.id.adx), aVar, C27634e.m90603a(mVar, i));
            } else {
                if (!TextUtils.isEmpty(aVar.f72558c)) {
                    oVar.mo70809a(aVar.f72558c);
                }
            }
        }
    }
}
