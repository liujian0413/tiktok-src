package com.p280ss.android.ugc.aweme.homepage.p1291ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.l */
public abstract class C30335l extends FrameLayout {

    /* renamed from: a */
    private String f79742a;

    /* renamed from: b */
    private boolean f79743b;

    /* renamed from: c */
    private MainBottomTabView f79744c;

    /* renamed from: e */
    public boolean f79745e;

    /* renamed from: f */
    protected boolean f79746f;

    /* renamed from: a */
    public abstract void mo79853a();

    /* renamed from: a */
    public abstract void mo79854a(int i);

    /* renamed from: a */
    public abstract void mo79855a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo79856b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo79857c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo79858d();

    /* renamed from: e */
    public abstract void mo79859e();

    /* renamed from: f */
    public abstract void mo79860f();

    /* renamed from: g */
    public abstract void mo79861g();

    public MainBottomTabView getMainBottomView() {
        return this.f79744c;
    }

    public ImageView getRefreshIcon() {
        return null;
    }

    public String getTabType() {
        return this.f79742a;
    }

    /* renamed from: h */
    public abstract void mo79863h();

    public boolean isSelected() {
        return this.f79743b;
    }

    /* renamed from: j */
    public abstract void mo79865j();

    /* renamed from: k */
    public abstract void mo79866k();

    public void setActivated(boolean z) {
    }

    /* renamed from: q */
    public final void mo79895q() {
        setSelected(false);
        if (this.f79745e) {
            mo79856b();
        } else {
            mo79853a();
        }
    }

    /* renamed from: r */
    public final void mo79896r() {
        if (!this.f79745e) {
            this.f79745e = true;
            mo79858d();
        }
    }

    /* renamed from: s */
    public final void mo79897s() {
        if (this.f79745e) {
            this.f79745e = false;
            mo79859e();
        }
    }

    public void setRefreshing(boolean z) {
        this.f79745e = z;
    }

    public void setSelected(boolean z) {
        this.f79743b = z;
    }

    /* renamed from: b */
    public final void mo79891b(boolean z) {
        setSelected(true);
        if (this.f79745e) {
            mo79857c();
        } else {
            mo79855a(z);
        }
    }

    /* renamed from: a */
    public final void mo79890a(String str) {
        int i;
        if (getRefreshIcon() != null) {
            ImageView refreshIcon = getRefreshIcon();
            Resources resources = getResources();
            if ("HOME".equals(str)) {
                i = R.color.aur;
            } else {
                i = R.color.lw;
            }
            refreshIcon.setColorFilter(resources.getColor(i));
        }
    }

    public C30335l(Context context, String str, MainBottomTabView mainBottomTabView) {
        super(context);
        this.f79742a = str;
        this.f79744c = mainBottomTabView;
    }
}
