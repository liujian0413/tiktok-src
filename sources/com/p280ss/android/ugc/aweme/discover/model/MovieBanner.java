package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MovieBanner */
public final class MovieBanner implements Serializable {
    @C6593c(mo15949a = "image")
    private UrlModel image;
    @C6593c(mo15949a = "url")
    private String url;

    public static /* synthetic */ MovieBanner copy$default(MovieBanner movieBanner, UrlModel urlModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = movieBanner.image;
        }
        if ((i & 2) != 0) {
            str = movieBanner.url;
        }
        return movieBanner.copy(urlModel, str);
    }

    public final UrlModel component1() {
        return this.image;
    }

    public final String component2() {
        return this.url;
    }

    public final MovieBanner copy(UrlModel urlModel, String str) {
        C7573i.m23587b(urlModel, "image");
        C7573i.m23587b(str, "url");
        return new MovieBanner(urlModel, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.url, (java.lang.Object) r3.url) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.MovieBanner
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.MovieBanner r3 = (com.p280ss.android.ugc.aweme.discover.model.MovieBanner) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.image
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.image
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.url
            java.lang.String r3 = r3.url
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.MovieBanner.equals(java.lang.Object):boolean");
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        UrlModel urlModel = this.image;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.url;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieBanner(image=");
        sb.append(this.image);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(")");
        return sb.toString();
    }

    public final void setImage(UrlModel urlModel) {
        C7573i.m23587b(urlModel, "<set-?>");
        this.image = urlModel;
    }

    public final void setUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.url = str;
    }

    public MovieBanner(UrlModel urlModel, String str) {
        C7573i.m23587b(urlModel, "image");
        C7573i.m23587b(str, "url");
        this.image = urlModel;
        this.url = str;
    }
}
