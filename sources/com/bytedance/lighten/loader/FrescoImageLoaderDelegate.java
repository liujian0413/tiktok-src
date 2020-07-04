package com.bytedance.lighten.loader;

import android.net.Uri;
import com.bytedance.lighten.core.C12102c;
import com.bytedance.lighten.core.C12125f;
import com.bytedance.lighten.core.C12126g;
import com.bytedance.lighten.core.C12132m;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12134o;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.p610a.C12092a;
import com.facebook.common.p686c.C13286a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p717d.C13613j;
import java.io.File;

public class FrescoImageLoaderDelegate implements C12132m {
    private C12102c mFrescoCache;
    private C12126g mImpl;

    public C12102c getCache() {
        return this.mFrescoCache;
    }

    public void display(C12138q qVar) {
        this.mImpl.display(qVar);
    }

    public void download(C12138q qVar) {
        this.mImpl.download(qVar);
    }

    public C12139r load(Uri uri) {
        return new C12139r(uri);
    }

    public void loadBitmap(C12138q qVar) {
        this.mImpl.loadBitmap(qVar);
    }

    public void trimDisk(int i) {
        this.mImpl.trimDisk(i);
    }

    public void trimMemory(int i) {
        this.mImpl.trimMemory(i);
    }

    public C12139r load(C12092a aVar) {
        return new C12139r(aVar);
    }

    public C12139r load(File file) {
        return new C12139r(Uri.fromFile(file));
    }

    public void init(C12134o oVar) {
        C12125f.m35295a(oVar.f32223a);
        if (oVar.f32233k) {
            C13613j a = C12183t.m35429a(oVar);
            C13380c.m39168a(oVar.f32223a, a);
            C12180s.m35428a().f32427a = a;
            C13286a.m38847b(oVar.f32232j);
        }
        this.mFrescoCache = new C12160l();
        this.mImpl = new C12166p(this.mFrescoCache);
    }

    public C12139r load(int i) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(C12133n.f32219a);
        sb.append("/");
        sb.append(i);
        return new C12139r(Uri.parse(sb.toString()));
    }

    public C12139r load(String str) {
        return new C12139r(str);
    }
}
