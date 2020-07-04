package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView */
public class DmtStatusView extends FrameLayout implements C10778e, C10809e {

    /* renamed from: a */
    List<View> f29074a;

    /* renamed from: b */
    public boolean f29075b;

    /* renamed from: c */
    private int f29076c;

    /* renamed from: d */
    private int f29077d;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView$a */
    public static class C10803a {

        /* renamed from: a */
        Context f29078a;

        /* renamed from: b */
        View f29079b;

        /* renamed from: c */
        View f29080c;

        /* renamed from: d */
        View f29081d;

        /* renamed from: e */
        View f29082e;

        /* renamed from: f */
        View f29083f;

        /* renamed from: g */
        int f29084g = -1;

        /* renamed from: a */
        public final C10803a mo25961a(C10805b bVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f29078a);
            dmtDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            dmtDefaultView.setStatus(bVar);
            this.f29080c = dmtDefaultView;
            return this;
        }

        /* renamed from: a */
        public final C10803a mo25953a() {
            mo25960a((View) m31632b());
            return this;
        }

        /* renamed from: b */
        private DmtLoadingLayout m31632b() {
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(this.f29078a);
            dmtLoadingLayout.setLayoutParams(new LayoutParams(-1, -1));
            return dmtLoadingLayout;
        }

        /* renamed from: c */
        public final C10803a mo25965c(int i) {
            this.f29084g = i;
            return this;
        }

        /* renamed from: a */
        public static C10803a m31631a(Context context) {
            return new C10803a(context).mo25953a();
        }

        /* renamed from: b */
        public final C10803a mo25963b(View view) {
            this.f29080c = view;
            this.f29080c.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: c */
        public final C10803a mo25966c(View view) {
            this.f29081d = view;
            this.f29081d.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        public C10803a(Context context) {
            if (context != null) {
                this.f29078a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        /* renamed from: a */
        public final C10803a mo25954a(int i) {
            return mo25961a(new C10806a(this.f29078a).mo25993c(i).f29135a);
        }

        /* renamed from: b */
        public final C10803a mo25962b(int i) {
            return mo25964b(new C10806a(this.f29078a).mo25993c(i).f29135a);
        }

        /* renamed from: b */
        public final C10803a mo25964b(C10805b bVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f29078a);
            dmtDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            dmtDefaultView.setStatus(bVar);
            this.f29081d = dmtDefaultView;
            return this;
        }

        /* renamed from: a */
        public final C10803a mo25960a(View view) {
            this.f29079b = view;
            this.f29079b.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        public final C10803a mo25955a(int i, int i2) {
            return mo25961a(new C10806a(this.f29078a).mo25990b(i).mo25993c(i2).f29135a);
        }

        /* renamed from: a */
        public final C10803a mo25959a(int i, OnClickListener onClickListener) {
            mo25962b(i);
            this.f29081d.setOnClickListener(onClickListener);
            return this;
        }

        /* renamed from: a */
        public final C10803a mo25958a(int i, int i2, OnClickListener onClickListener) {
            mo25961a(new C10806a(this.f29078a).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
            this.f29080c.setOnClickListener(onClickListener);
            return this;
        }

        /* renamed from: a */
        public final C10803a mo25957a(int i, int i2, int i3, OnClickListener onClickListener) {
            return mo25964b(new C10806a(this.f29078a).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, onClickListener).f29135a);
        }

        /* renamed from: a */
        public final C10803a mo25956a(int i, int i2, int i3, int i4, OnClickListener onClickListener) {
            return mo25964b(new C10806a(this.f29078a).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, onClickListener).f29135a);
        }
    }

    /* renamed from: n */
    public final void mo25950n() {
        this.f29075b = true;
    }

    /* renamed from: f */
    public final void mo25942f() {
        setVisibility(0);
        setStatus(0);
    }

    /* renamed from: i */
    public boolean mo25945i() {
        if (this.f29076c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo25946j() {
        if (this.f29076c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo25941e() {
        if (this.f29076c == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo25943g() {
        setVisibility(0);
        setStatus(1);
    }

    /* renamed from: h */
    public final void mo25944h() {
        setVisibility(0);
        setStatus(2);
    }

    /* renamed from: k */
    public boolean mo25947k() {
        if (this.f29076c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo25948l() {
        if (this.f29076c == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo25949m() {
        if (this.f29076c == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo25939d() {
        if (this.f29076c != -1) {
            View b = mo25935b(this.f29076c);
            if (b != null) {
                b.setVisibility(4);
            }
            setVisibility(4);
            this.f29076c = -1;
        }
    }

    /* renamed from: c */
    public C10803a mo25937c() {
        C10803a aVar = new C10803a(getContext());
        aVar.f29079b = (View) this.f29074a.get(0);
        aVar.f29080c = (View) this.f29074a.get(1);
        aVar.f29081d = (View) this.f29074a.get(2);
        aVar.f29082e = (View) this.f29074a.get(3);
        aVar.f29083f = (View) this.f29074a.get(4);
        return aVar;
    }

    /* renamed from: a */
    public void mo25766a(int i) {
        mo73989c(i);
    }

    /* renamed from: b */
    public final void mo25936b(boolean z) {
        mo25943g();
    }

    public DmtStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void mo25938c(boolean z) {
        this.f29075b = z;
        mo25939d();
    }

    /* renamed from: a */
    public final void mo25934a(boolean z) {
        if (z) {
            C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
        }
        if (this.f29075b) {
            mo25939d();
        } else {
            mo25944h();
        }
    }

    /* renamed from: b */
    public final View mo25935b(int i) {
        if (i < 0 || i >= this.f29074a.size()) {
            return null;
        }
        return (View) this.f29074a.get(i);
    }

    /* renamed from: d */
    public final boolean mo25940d(boolean z) {
        if (!C10807c.m31674a(getContext())) {
            C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
            if (!this.f29075b) {
                mo25944h();
            }
            return false;
        }
        if (!this.f29075b) {
            mo25942f();
        }
        return true;
    }

    public void setStatus(int i) {
        if (this.f29076c != i) {
            if (this.f29076c >= 0) {
                View b = mo25935b(this.f29076c);
                if (b != null) {
                    b.setVisibility(4);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = mo25935b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f29076c = i;
        }
    }

    /* renamed from: c */
    private void mo73989c(int i) {
        if (i >= 0 && this.f29077d != i) {
            this.f29077d = i;
            View view = (View) this.f29074a.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo25766a(this.f29077d);
            }
            View view2 = (View) this.f29074a.get(1);
            if (view2 instanceof C10778e) {
                ((C10778e) view2).mo25766a(this.f29077d);
            }
            View view3 = (View) this.f29074a.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).mo25766a(this.f29077d);
            }
            View view4 = (View) this.f29074a.get(3);
            if (view4 instanceof DmtDefaultView) {
                ((DmtDefaultView) view4).mo25766a(this.f29077d);
            }
            View view5 = (View) this.f29074a.get(4);
            if (view5 instanceof DmtDefaultView) {
                ((DmtDefaultView) view5).mo25766a(this.f29077d);
            }
        }
    }

    public void setBuilder(C10803a aVar) {
        if (aVar == null) {
            aVar = C10803a.m31631a(getContext());
        }
        this.f29074a.clear();
        this.f29074a.add(aVar.f29079b);
        this.f29074a.add(aVar.f29080c);
        this.f29074a.add(aVar.f29081d);
        this.f29074a.add(aVar.f29082e);
        this.f29074a.add(aVar.f29083f);
        if (aVar.f29084g < 0) {
            aVar.f29084g = C6394b.m19903a().f18686a;
        }
        mo73989c(aVar.f29084g);
        removeAllViews();
        for (int i = 0; i < this.f29074a.size(); i++) {
            View view = (View) this.f29074a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public void setUseScreenHeight(int i) {
        View view = (View) this.f29074a.get(0);
        if (view instanceof C10809e) {
            ((C10809e) view).setUseScreenHeight(i);
        }
        View view2 = (View) this.f29074a.get(1);
        if (view2 instanceof C10809e) {
            ((C10809e) view2).setUseScreenHeight(i);
        }
        View view3 = (View) this.f29074a.get(2);
        if (view3 instanceof C10809e) {
            ((C10809e) view3).setUseScreenHeight(i);
        }
        View view4 = (View) this.f29074a.get(3);
        if (view4 instanceof C10809e) {
            ((C10809e) view4).setUseScreenHeight(i);
        }
        View view5 = (View) this.f29074a.get(4);
        if (view5 instanceof C10809e) {
            ((C10809e) view5).setUseScreenHeight(i);
        }
    }

    public DmtStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29074a = new ArrayList(5);
        this.f29076c = -1;
        this.f29077d = -1;
        this.f29075b = false;
    }
}
