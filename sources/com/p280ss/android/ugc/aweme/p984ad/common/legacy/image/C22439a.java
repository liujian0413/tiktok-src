package com.p280ss.android.ugc.aweme.p984ad.common.legacy.image;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.a */
public class C22439a extends C22447g {

    /* renamed from: a */
    public C22440a f59846a;

    /* renamed from: b */
    public boolean f59847b;

    /* renamed from: c */
    private WeakReference<C22441b> f59848c;

    /* renamed from: d */
    private UrlModel f59849d;

    /* renamed from: e */
    private boolean f59850e;

    /* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.a$a */
    public interface C22440a {
    }

    public String getUrl() {
        if (this.f59849d == null || this.f59849d.getUrlList() == null || this.f59849d.getUrlList().size() == 0) {
            return "";
        }
        return (String) this.f59849d.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f59847b = z;
    }

    public void setImageLoadFinishListener(C22440a aVar) {
        this.f59846a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f59850e = z;
    }

    public void setAnimationListener(C22441b bVar) {
        this.f59848c = new WeakReference<>(bVar);
    }
}
