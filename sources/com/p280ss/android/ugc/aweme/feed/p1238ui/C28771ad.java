package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ad */
public final class C28771ad extends DmtStatusView {

    /* renamed from: c */
    private List<View> f75884c = new ArrayList(3);

    /* renamed from: d */
    private List<C28772a> f75885d = new ArrayList(3);

    /* renamed from: e */
    private int f75886e = -1;

    /* renamed from: f */
    private int f75887f = -1;

    /* renamed from: g */
    private Integer f75888g = null;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ad$a */
    public interface C28772a {
        /* renamed from: a */
        View mo73990a(View view);
    }

    /* renamed from: i */
    public final boolean mo25945i() {
        if (this.f75886e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo25946j() {
        if (this.f75886e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C10803a mo25937c() {
        if (!C7163a.m22363a()) {
            return null;
        }
        throw new RuntimeException("Stub !");
    }

    /* renamed from: e */
    public final boolean mo25941e() {
        if (this.f75886e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo25947k() {
        if (this.f75886e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo25939d() {
        if (this.f75886e != -1) {
            View view = (View) this.f75884c.get(this.f75886e);
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            this.f75886e = -1;
        }
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        m94740d(i);
    }

    public final void setBuilder(C10803a aVar) {
        if (C7163a.m22363a()) {
            throw new RuntimeException("Stub !");
        }
    }

    public C28771ad(Context context) {
        super(context);
    }

    public final void setStatus(int i) {
        if (this.f75886e != i) {
            if (this.f75886e >= 0) {
                View view = (View) this.f75884c.get(this.f75886e);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View c = mo73989c(i);
                if (c != null) {
                    c.setVisibility(0);
                }
            } else {
                setVisibility(8);
            }
            this.f75886e = i;
        }
    }

    public final void setUseScreenHeight(int i) {
        View view = (View) this.f75884c.get(0);
        if (view instanceof DmtLoadingLayout) {
            ((DmtLoadingLayout) view).setUseScreenHeight(i);
        }
        View view2 = (View) this.f75884c.get(1);
        if (view2 instanceof DmtDefaultView) {
            ((DmtDefaultView) view2).setUseScreenHeight(i);
        }
        View view3 = (View) this.f75884c.get(2);
        if (view3 instanceof DmtDefaultView) {
            ((DmtDefaultView) view3).setUseScreenHeight(i);
        }
        this.f75888g = Integer.valueOf(i);
    }

    /* renamed from: d */
    private void m94740d(int i) {
        if (i >= 0 && this.f75887f != i) {
            this.f75887f = i;
            View view = (View) this.f75884c.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo25766a(this.f75887f);
            }
            View view2 = (View) this.f75884c.get(1);
            if (view2 instanceof DmtDefaultView) {
                ((DmtDefaultView) view2).mo25766a(this.f75887f);
            }
            View view3 = (View) this.f75884c.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).mo25766a(this.f75887f);
            }
        }
    }

    /* renamed from: c */
    public final View mo73989c(int i) {
        View view = (View) this.f75884c.get(i);
        if (view == null && this.f75885d.get(i) != null) {
            C28772a aVar = (C28772a) this.f75885d.get(i);
            this.f75885d.set(i, null);
            view = aVar.mo73990a(this);
            if (view != null) {
                this.f75884c.set(i, view);
                if (this.f75888g != null) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).setUseScreenHeight(this.f75888g.intValue());
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.f75888g.intValue());
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.f75888g.intValue());
                    }
                }
                if (this.f75887f > 0) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).mo25766a(this.f75887f);
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).mo25766a(this.f75887f);
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).mo25766a(this.f75887f);
                    }
                }
                view.setLayoutParams(new LayoutParams(-1, -1));
                view.setVisibility(8);
                addView(view);
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void mo73988a(C28772a aVar, C28772a aVar2, C28772a aVar3) {
        this.f75884c.add(0, null);
        this.f75884c.add(1, null);
        this.f75884c.add(2, null);
        this.f75885d.add(0, aVar);
        this.f75885d.add(1, aVar2);
        this.f75885d.add(2, aVar3);
        if (this.f75887f < 0) {
            this.f75887f = C6394b.m19903a().f18686a;
        }
    }
}
