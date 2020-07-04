package com.p280ss.android.ugc.aweme.poi.preview.transfer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.metrics.C33248at.C33249a;
import com.p280ss.android.ugc.aweme.poi.event.C35080c;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35136a;
import com.p280ss.android.ugc.aweme.poi.preview.p1466a.C35139c;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35151b;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1468a.C35144a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1469b.C35152a;
import com.p280ss.android.ugc.aweme.poi.utils.C35447g;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.k */
public final class C35179k implements OnDismissListener, OnKeyListener, OnShowListener, C35177a {

    /* renamed from: a */
    public boolean f92049a;

    /* renamed from: b */
    private Context f92050b;

    /* renamed from: c */
    private Dialog f92051c;

    /* renamed from: d */
    private C35169i f92052d;

    /* renamed from: e */
    private C35166h f92053e;

    /* renamed from: f */
    private C35447g f92054f;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.k$a */
    public interface C35180a {
    }

    /* renamed from: c */
    private void m113512c() {
        this.f92052d = new C35169i(this.f92050b);
        this.f92052d.setOnLayoutResetListener(this);
    }

    /* renamed from: b */
    public final void mo89529b() {
        if (!this.f92049a) {
            this.f92051c.show();
            this.f92049a = true;
        }
    }

    /* renamed from: g */
    private String m113518g() {
        if (this.f92053e == null) {
            return "";
        }
        HashMap<String, String> hashMap = this.f92053e.f91994y;
        if (hashMap != null) {
            return (String) hashMap.get("enter_from");
        }
        return "";
    }

    /* renamed from: i */
    private String m113520i() {
        if (this.f92053e == null) {
            return null;
        }
        HashMap<String, String> hashMap = this.f92053e.f91994y;
        if (hashMap != null) {
            return (String) hashMap.get("poi_id");
        }
        return null;
    }

    public final void dismiss() {
        if (this.f92049a) {
            this.f92052d.dismiss(this.f92053e.f91970a);
            this.f92049a = false;
        }
    }

    /* renamed from: d */
    private void m113514d() {
        this.f92051c = new C1081a(this.f92050b, 16973840).mo4239b((View) this.f92052d).mo4242b();
        this.f92051c.setOnShowListener(this);
        this.f92051c.setOnDismissListener(this);
        this.f92051c.setOnKeyListener(this);
    }

    /* renamed from: f */
    private void m113517f() {
        ArrayList arrayList = new ArrayList();
        if (this.f92053e.f91989t != null) {
            m113509a((List<ImageView>) arrayList);
        } else if (this.f92053e.f91988s != null) {
            m113511b(arrayList);
        } else if (this.f92053e.f91990u != null) {
            m113513c(arrayList);
        } else {
            m113515d(arrayList);
        }
        this.f92053e.f91980k = arrayList;
    }

    /* renamed from: h */
    private C33249a m113519h() {
        if (this.f92053e == null) {
            return null;
        }
        HashMap<String, String> hashMap = this.f92053e.f91994y;
        if (hashMap == null) {
            return null;
        }
        C33249a aVar = new C33249a((String) hashMap.get("poi_id"), (String) hashMap.get("poi_type"), (String) hashMap.get("page_type"), (String) hashMap.get("group_id"), (String) hashMap.get("poi_backend_type"), (String) hashMap.get("poi_city"));
        return aVar;
    }

    /* renamed from: e */
    private void m113516e() {
        int i;
        int i2;
        long j;
        C35153c cVar;
        C35151b bVar;
        C35139c cVar2;
        if (!this.f92053e.mo89470c()) {
            C35166h hVar = this.f92053e;
            if (this.f92053e.f91970a < 0) {
                i = 0;
            } else {
                i = this.f92053e.f91970a;
            }
            hVar.f91970a = i;
            C35166h hVar2 = this.f92053e;
            if (this.f92053e.f91971b <= 0) {
                i2 = 1;
            } else {
                i2 = this.f92053e.f91971b;
            }
            hVar2.f91971b = i2;
            C35166h hVar3 = this.f92053e;
            if (this.f92053e.f91975f <= 0) {
                j = 300;
            } else {
                j = this.f92053e.f91975f;
            }
            hVar3.f91975f = j;
            C35166h hVar4 = this.f92053e;
            if (this.f92053e.f91984o == null) {
                cVar = new C35152a();
            } else {
                cVar = this.f92053e.f91984o;
            }
            hVar4.f91984o = cVar;
            C35166h hVar5 = this.f92053e;
            if (this.f92053e.f91985p == null) {
                bVar = new C35144a();
            } else {
                bVar = this.f92053e.f91985p;
            }
            hVar5.f91985p = bVar;
            C35166h hVar6 = this.f92053e;
            if (this.f92053e.f91986q == null) {
                cVar2 = new C35136a();
            } else {
                cVar2 = this.f92053e.f91986q;
            }
            hVar6.f91986q = cVar2;
            return;
        }
        throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
    }

    /* renamed from: a */
    public final void mo89524a() {
        C35181l.m113524a(this.f92051c);
        this.f92049a = false;
    }

    /* renamed from: a */
    public static C35179k m113506a(Context context) {
        return new C35179k(context);
    }

    private C35179k(Context context) {
        this.f92050b = context;
        this.f92054f = new C35447g();
        m113512c();
        m113514d();
    }

    /* renamed from: a */
    private void m113508a(int i) {
        this.f92051c = new C1081a(this.f92050b, i).mo4239b((View) this.f92052d).mo4242b();
        this.f92051c.setOnShowListener(this);
        this.f92051c.setOnKeyListener(this);
    }

    /* renamed from: d */
    private void m113515d(List<ImageView> list) {
        int size = this.f92053e.f91981l.size();
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f92052d.mo89506b();
        C42961az.m136380a(new C35080c(Boolean.valueOf(false), m113520i()));
        if (this.f92054f != null) {
            this.f92054f.mo90179a();
        }
    }

    /* renamed from: b */
    private void m113511b(List<ImageView> list) {
        AbsListView absListView = this.f92053e.f91988s;
        int childCount = absListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            list.add((ImageView) absListView.getChildAt(i).findViewById(this.f92053e.f91987r));
        }
        m113510a(list, absListView.getCount(), absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
    }

    /* renamed from: c */
    private void m113513c(List<ImageView> list) {
        ViewPager viewPager = this.f92053e.f91990u;
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter instanceof C35159c) {
            C35159c cVar = (C35159c) adapter;
            View a = cVar.mo88763a();
            if (a != null) {
                list.add((ImageView) a.findViewById(this.f92053e.f91987r));
            } else {
                list.add(null);
            }
            int currentItem = viewPager.getCurrentItem() % cVar.mo88764b();
            m113510a(list, 1, currentItem, currentItem);
            return;
        }
        throw new IllegalArgumentException("customized adapter should implement IViewPagerCurrentView");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C42961az.m136380a(new C35080c(Boolean.valueOf(true), m113520i()));
        if (this.f92054f != null) {
            this.f92054f.mo90180a(this.f92050b, m113518g(), m113519h());
        }
    }

    /* renamed from: a */
    private void m113509a(List<ImageView> list) {
        int i;
        RecyclerView recyclerView = this.f92053e.f91989t;
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            list.add((ImageView) recyclerView.getChildAt(i3).findViewById(this.f92053e.f91987r));
        }
        C1273i layoutManager = recyclerView.getLayoutManager();
        int A = layoutManager.mo5744A();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i2 = gridLayoutManager.mo5445j();
            i = gridLayoutManager.mo5447l();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.mo5445j();
            i = linearLayoutManager.mo5447l();
        } else {
            i = 0;
        }
        m113510a(list, A, i2, i);
    }

    /* renamed from: a */
    public final C35179k mo89528a(C35166h hVar) {
        if (!this.f92049a) {
            this.f92053e = hVar;
            m113517f();
            m113516e();
            this.f92052d.mo89505a(hVar);
        }
        return this;
    }

    private C35179k(Context context, int i) {
        this.f92050b = context;
        m113512c();
        m113508a(i);
    }

    /* renamed from: a */
    public static C35179k m113507a(Context context, int i) {
        return new C35179k(context, R.style.nz);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            dismiss();
        }
        return true;
    }

    /* renamed from: a */
    private static void m113510a(List<ImageView> list, int i, int i2, int i3) {
        if (i2 > 0) {
            while (i2 > 0) {
                list.add(0, null);
                i2--;
            }
        }
        if (i3 < i) {
            for (int i4 = (i - 1) - i3; i4 > 0; i4--) {
                list.add(null);
            }
        }
    }
}
