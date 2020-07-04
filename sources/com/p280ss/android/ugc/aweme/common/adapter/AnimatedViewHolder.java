package com.p280ss.android.ugc.aweme.common.adapter;

import android.graphics.drawable.Animatable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawable.p691a.C13360a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23332a;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.performance.C7188c;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder */
public abstract class AnimatedViewHolder<T> extends C1293v implements C25650d {

    /* renamed from: h */
    public T f67534h;

    /* renamed from: i */
    public SmartImageView f67535i;

    /* renamed from: j */
    protected boolean f67536j;

    /* renamed from: k */
    boolean f67537k = true;

    public final boolean bx_() {
        return this.f67536j;
    }

    public final void by_() {
        this.f67535i.mo29861b();
    }

    public final void bz_() {
        this.f67535i.mo29862c();
    }

    /* renamed from: a */
    private static boolean mo61580a() {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C23332a.m76559b("aweme_app", "use_dynamic_cover", z);
    }

    /* renamed from: g */
    public boolean mo66498g() {
        if (C6399b.m19944t() && C7188c.m22428a()) {
            return false;
        }
        if ((!C25649c.m84355a(this.itemView.getContext()) || C29958a.m98225a(this.itemView.getContext())) && mo61580a()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo66499j() throws Exception {
        if (this.f67535i != null && this.f67535i.getController() != null && this.f67535i.getController().mo32721j() != null) {
            Animatable j = this.f67535i.getController().mo32721j();
            if (j instanceof C13360a) {
                ((C13360a) j).mo32663a();
            }
        }
    }

    /* renamed from: c */
    public final void mo66497c(boolean z) {
        this.f67537k = z;
    }

    public AnimatedViewHolder(View view) {
        super(view);
    }

    /* renamed from: b */
    public final void mo66493b(boolean z) {
        this.f67535i.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo66492a(boolean z) {
        this.f67535i.setAttached(z);
    }

    /* renamed from: a */
    public static boolean m84284a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        for (String isEmpty : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66491a(T t, int i) {
        this.f67535i.setUserVisibleHint(false);
    }

    /* renamed from: a */
    public static void m84282a(View view, int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.width != i || marginLayoutParams.height != i2) {
            marginLayoutParams.width = i;
            marginLayoutParams.height = i2;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
