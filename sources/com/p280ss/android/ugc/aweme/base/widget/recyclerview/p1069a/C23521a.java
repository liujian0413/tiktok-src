package com.p280ss.android.ugc.aweme.base.widget.recyclerview.p1069a;

import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.SimpleLoadMoreProgressBar;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23508a;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23509b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.a.a */
public final class C23521a {

    /* renamed from: a */
    public final List<C23360e> f62094a;

    /* renamed from: b */
    public boolean f62095b = true;

    /* renamed from: c */
    private C23522b f62096c;

    /* renamed from: d */
    private C23360e f62097d;

    /* renamed from: e */
    private C23360e f62098e;

    /* renamed from: d */
    public final void mo61176d() {
        if (!this.f62095b) {
            this.f62095b = true;
        }
    }

    /* renamed from: e */
    private void m77265e() {
        this.f62096c.notifyItemInserted(m77267g());
        this.f62096c.mo61172f();
    }

    /* renamed from: f */
    private C23360e m77266f() {
        if (this.f62097d == null) {
            this.f62097d = this.f62096c.mo61167a();
        }
        return this.f62097d;
    }

    /* renamed from: h */
    private C23360e m77268h() {
        if (this.f62098e == null) {
            this.f62098e = this.f62096c.mo61168b();
        }
        return this.f62098e;
    }

    /* renamed from: g */
    private int m77267g() {
        this.f62094a.add(m77266f());
        return this.f62094a.size() - 1;
    }

    /* renamed from: b */
    public final void mo61174b() {
        if (this.f62097d != null) {
            int indexOf = this.f62094a.indexOf(this.f62097d);
            if (indexOf != -1) {
                this.f62094a.remove(indexOf);
                this.f62096c.notifyItemRemoved(indexOf);
            }
        }
    }

    /* renamed from: c */
    public final void mo61175c() {
        if (this.f62095b) {
            this.f62095b = false;
            if (!this.f62094a.isEmpty()) {
                m77269i();
            }
        }
    }

    /* renamed from: i */
    private void m77269i() {
        if (m77268h() != null) {
            int indexOf = this.f62094a.indexOf(m77268h());
            if (indexOf != -1) {
                this.f62094a.remove(indexOf);
                this.f62096c.notifyItemRemoved(indexOf);
            }
            this.f62094a.add(m77268h());
            this.f62096c.notifyItemInserted(this.f62094a.size() - 1);
        }
    }

    /* renamed from: a */
    public final void mo61173a() {
        if (this.f62095b && !this.f62094a.isEmpty() && !this.f62094a.contains(m77266f())) {
            this.f62096c.mo61177g();
            m77265e();
        }
    }

    /* renamed from: a */
    public static Map<Class, Class> m77264a(Map<Class, Class> map) {
        if (map.get(C23509b.class) == null) {
            map.put(C23509b.class, SimpleLoadMoreProgressBar.class);
        }
        if (map.get(C23508a.class) == null) {
            map.put(C23508a.class, NoMoreTextHintView.class);
        }
        return map;
    }

    public C23521a(List<C23360e> list, C23522b bVar) {
        this.f62094a = list;
        this.f62096c = bVar;
    }
}
