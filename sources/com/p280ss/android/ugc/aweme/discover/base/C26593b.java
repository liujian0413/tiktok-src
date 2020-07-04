package com.p280ss.android.ugc.aweme.discover.base;

import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.b */
public final class C26593b {

    /* renamed from: a */
    public static final C26593b f70138a = new C26593b();

    /* renamed from: com.ss.android.ugc.aweme.discover.base.b$a */
    static final class C26594a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RemoteImageView f70139a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f70140b;

        C26594a(RemoteImageView remoteImageView, UrlModel urlModel) {
            this.f70139a = remoteImageView;
            this.f70140b = urlModel;
        }

        public final void run() {
            if (this.f70139a.getMeasuredHeight() <= 0 || this.f70139a.getMeasuredWidth() <= 0) {
                C23323e.m76524b(this.f70139a, this.f70140b);
            } else {
                C23323e.m76506a(this.f70139a, this.f70140b, this.f70139a.getMeasuredWidth(), this.f70139a.getMeasuredHeight());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.base.b$b */
    static final class C26595b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RemoteImageView f70141a;

        /* renamed from: b */
        final /* synthetic */ String f70142b;

        C26595b(RemoteImageView remoteImageView, String str) {
            this.f70141a = remoteImageView;
            this.f70142b = str;
        }

        public final void run() {
            if (this.f70141a.getMeasuredHeight() <= 0 || this.f70141a.getMeasuredWidth() <= 0) {
                C23323e.m76514a(this.f70141a, this.f70142b);
            } else {
                C23323e.m76525b(this.f70141a, this.f70142b, this.f70141a.getMeasuredWidth(), this.f70141a.getMeasuredHeight());
            }
        }
    }

    private C26593b() {
    }

    /* renamed from: a */
    public static final void m87365a(RemoteImageView remoteImageView, UrlModel urlModel) {
        C7573i.m23587b(remoteImageView, "draweeView");
        remoteImageView.post(new C26594a(remoteImageView, urlModel));
    }

    /* renamed from: a */
    public static final void m87366a(RemoteImageView remoteImageView, String str) {
        C7573i.m23587b(remoteImageView, "draweeView");
        C7573i.m23587b(str, "url");
        remoteImageView.post(new C26595b(remoteImageView, str));
    }
}
