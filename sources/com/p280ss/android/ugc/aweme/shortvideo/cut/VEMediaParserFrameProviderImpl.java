package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.imagepipeline.p715b.C13553g;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38782a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38787f;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.vesdk.C45373u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl */
public final class VEMediaParserFrameProviderImpl implements C0042h, C38787f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f100558a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VEMediaParserFrameProviderImpl.class), "frameDiskCache", "getFrameDiskCache()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;"))};

    /* renamed from: b */
    public boolean f100559b;

    /* renamed from: c */
    public final Map<String, C45373u> f100560c = new LinkedHashMap();

    /* renamed from: d */
    private final ExecutorService f100561d = C38788n.m123883a();

    /* renamed from: e */
    private final C7541d f100562e = C7546e.m23569a(C38698a.f100563a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$a */
    static final class C38698a extends Lambda implements C7561a<C38777m<Bitmap>> {

        /* renamed from: a */
        public static final C38698a f100563a = new C38698a();

        C38698a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m123599a();
        }

        /* renamed from: a */
        private static C38777m<Bitmap> m123599a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C39811er.f103468d);
            sb.append("ve_frame_cache2/");
            sb.append(System.currentTimeMillis());
            return new C38777m<>(sb.toString(), new C38728a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$b */
    static final class C38699b extends Lambda implements C7562b<String, C45373u> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f100564a;

        C38699b(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f100564a = vEMediaParserFrameProviderImpl;
            super(1);
        }

        /* renamed from: a */
        public final C45373u invoke(String str) {
            C7573i.m23587b(str, "path");
            C45373u uVar = new C45373u();
            uVar.mo108607a(str);
            this.f100564a.f100560c.put(str, uVar);
            return uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$c */
    static final class C38700c<V> implements Callable<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f100565a;

        /* renamed from: b */
        final /* synthetic */ String f100566b;

        /* renamed from: c */
        final /* synthetic */ int f100567c;

        /* renamed from: d */
        final /* synthetic */ C45373u f100568d;

        /* renamed from: e */
        final /* synthetic */ int f100569e;

        /* renamed from: f */
        final /* synthetic */ String f100570f;

        C38700c(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str, int i, C45373u uVar, int i2, String str2) {
            this.f100565a = vEMediaParserFrameProviderImpl;
            this.f100566b = str;
            this.f100567c = i;
            this.f100568d = uVar;
            this.f100569e = i2;
            this.f100570f = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap call() {
            final Bitmap bitmap;
            if (VEMediaParserFrameProviderImpl.m123592b(this.f100566b)) {
                bitmap = C42341f.m134633a(this.f100566b, new int[]{this.f100567c, this.f100567c});
            } else {
                bitmap = this.f100568d.mo108605a(this.f100569e, -1, this.f100567c, this.f100565a.f100559b);
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38700c f100571a;

                    {
                        this.f100571a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        m123602a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m123602a() {
                        this.f100571a.f100565a.mo96755a().mo96871a(this.f100571a.f100570f, new C38795r(bitmap.getWidth(), bitmap.getHeight(), bitmap), C387021.f100573a);
                    }
                }, (Executor) C7258h.m22730c());
            }
            return bitmap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$d */
    static final class C38703d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f100574a;

        /* renamed from: b */
        final /* synthetic */ String f100575b;

        C38703d(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f100574a = vEMediaParserFrameProviderImpl;
            this.f100575b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap call() {
            C38795r a = this.f100574a.mo96755a().mo96869a(this.f100575b);
            if (a != null) {
                return (Bitmap) a.f100818c;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$e */
    static final class C38704e<TTaskResult, TContinuationResult> implements C1591g<Bitmap, C7581n> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f100576a;

        /* renamed from: b */
        final /* synthetic */ boolean f100577b;

        /* renamed from: c */
        final /* synthetic */ int f100578c;

        /* renamed from: d */
        final /* synthetic */ String f100579d;

        /* renamed from: e */
        final /* synthetic */ int f100580e;

        /* renamed from: f */
        final /* synthetic */ C38782a f100581f;

        C38704e(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i, String str, int i2, C38782a aVar) {
            this.f100576a = vEMediaParserFrameProviderImpl;
            this.f100577b = z;
            this.f100578c = i;
            this.f100579d = str;
            this.f100580e = i2;
            this.f100581f = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m123604a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123604a(C1592h<Bitmap> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6889d() || !this.f100577b) {
                Bitmap bitmap = (Bitmap) hVar.mo6890e();
                if (bitmap != null) {
                    if (!(!bitmap.isRecycled())) {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        C13326a a = VEMediaParserFrameProviderImpl.m123590a(bitmap);
                        if (a != null) {
                            if (!a.mo32614d()) {
                                a = null;
                            }
                            if (a != null) {
                                C38782a aVar = this.f100581f;
                                C13326a b = a.clone();
                                C7573i.m23582a((Object) b, "result.clone()");
                                aVar.mo96916a(b);
                                C13326a.m39001c(a);
                            }
                        }
                        return;
                    }
                }
                return;
            }
            this.f100576a.mo96757a(this.f100578c, this.f100579d, this.f100580e, this.f100581f, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$f */
    static final class C38705f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f100582a;

        C38705f(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f100582a = vEMediaParserFrameProviderImpl;
        }

        public final /* synthetic */ Object call() {
            m123605a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123605a() {
            this.f100582a.mo96755a().mo96870a();
            this.f100582a.mo96759b();
        }
    }

    /* renamed from: a */
    public final C38777m<Bitmap> mo96755a() {
        return (C38777m) this.f100562e.getValue();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void releaseFrames() {
        C1592h.m7853a((Callable<TResult>) new C38705f<TResult>(this));
    }

    /* renamed from: b */
    public final void mo96759b() {
        for (Entry key : this.f100560c.entrySet()) {
            mo96758a((String) key.getKey());
        }
    }

    /* renamed from: a */
    public static C13326a<C13644b> m123590a(Bitmap bitmap) {
        return C13326a.m38995a(new C13646d(bitmap, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
    }

    /* renamed from: c */
    private final C1592h<Bitmap> m123593c(String str) {
        C1592h<Bitmap> a = C1592h.m7853a((Callable<TResult>) new C38703d<TResult>(this, str));
        C7573i.m23582a((Object) a, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        return a;
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        C7573i.m23587b(context, "context");
        C35574k.m114859a().mo70100o();
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().mo55a(this);
        }
    }

    /* renamed from: b */
    public static boolean m123592b(String str) {
        if (!C42973bg.m136427a(str)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        C7573i.m23582a((Object) str2, "type");
        if (C7634n.m23776c(charSequence, (CharSequence) "png", true) || C7634n.m23776c(charSequence, (CharSequence) "jpg", true) || C7634n.m23776c(charSequence, (CharSequence) "jpeg", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo96758a(String str) {
        C7573i.m23587b(str, "path");
        C45373u uVar = (C45373u) this.f100560c.get(str);
        if (uVar != null) {
            uVar.mo108606a();
            this.f100560c.put(str, null);
        }
    }

    /* renamed from: a */
    private final C1592h<Bitmap> m123589a(String str, String str2, int i) {
        C45373u uVar;
        C38699b bVar = new C38699b(this);
        int a = C23486n.m77122a(60.0d);
        C45373u uVar2 = (C45373u) this.f100560c.get(str2);
        if (uVar2 == null) {
            uVar = bVar.invoke(str2);
        } else {
            uVar = uVar2;
        }
        C38700c cVar = new C38700c(this, str2, a, uVar, i, str);
        C1592h<Bitmap> a2 = C1592h.m7855a((Callable<TResult>) cVar, (Executor) this.f100561d);
        C7573i.m23582a((Object) a2, "Task.call(Callable {\n   … }, extractFrameExecutor)");
        return a2;
    }

    /* renamed from: a */
    public final void mo96756a(int i, String str, int i2, int i3, C38782a aVar) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(aVar, "onGetBitmap");
        mo96757a(i, str, i3, aVar, true);
    }

    /* renamed from: a */
    public final void mo96757a(int i, String str, int i2, C38782a aVar, boolean z) {
        C1592h hVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        String sb2 = sb.toString();
        if (mo96755a().mo96872b(sb2)) {
            hVar = m123593c(sb2);
        } else {
            hVar = m123589a(sb2, str, i2);
        }
        C38704e eVar = new C38704e(this, z, i, str, i2, aVar);
        hVar.mo6876a((C1591g<TResult, TContinuationResult>) eVar, C1592h.f5958b);
    }
}
