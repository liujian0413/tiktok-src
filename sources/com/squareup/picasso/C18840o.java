package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Downloader.C18792a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.o */
final class C18840o extends C18850u {

    /* renamed from: a */
    private final Downloader f50778a;

    /* renamed from: b */
    private final C18853w f50779b;

    /* renamed from: com.squareup.picasso.o$a */
    static class C18841a extends IOException {
        public C18841a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo50059a() {
        return 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo50061b() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        String scheme = sVar.f50794d.getScheme();
        if (WebKitApi.SCHEME_HTTP.equals(scheme) || WebKitApi.SCHEME_HTTPS.equals(scheme)) {
            return true;
        }
        return false;
    }

    public C18840o(Downloader downloader, C18853w wVar) {
        this.f50778a = downloader;
        this.f50779b = wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo50060a(boolean z, NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        LoadedFrom loadedFrom;
        C18792a a = this.f50778a.mo49974a(sVar.f50794d, sVar.f50793c);
        if (a.f50648c) {
            loadedFrom = LoadedFrom.DISK;
        } else {
            loadedFrom = LoadedFrom.NETWORK;
        }
        Bitmap bitmap = a.f50647b;
        if (bitmap != null) {
            return new C18851a(bitmap, loadedFrom);
        }
        InputStream inputStream = a.f50646a;
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == LoadedFrom.DISK && a.f50649d == 0) {
            C18807ad.m61439a(inputStream);
            throw new C18841a("Received response with 0 content-length header.");
        }
        if (loadedFrom == LoadedFrom.NETWORK && a.f50649d > 0) {
            this.f50779b.mo50101a(a.f50649d);
        }
        return new C18851a(inputStream, loadedFrom);
    }
}
