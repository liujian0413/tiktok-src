package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import bolts.C1588d;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38728a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38777m;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38795r;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.vesdk.C45373u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2 */
public final class VEMediaParserProviderV2 implements C0042h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f101901a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VEMediaParserProviderV2.class), "frameDiskCache", "getFrameDiskCache()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;"))};

    /* renamed from: b */
    public boolean f101902b;

    /* renamed from: c */
    public final Map<String, C45373u> f101903c = new LinkedHashMap();

    /* renamed from: d */
    private final ExecutorService f101904d = C39281d.m125557a();

    /* renamed from: e */
    private final List<C1590f> f101905e = new ArrayList();

    /* renamed from: f */
    private final List<C1592h<Bitmap>> f101906f = new ArrayList();

    /* renamed from: g */
    private final C7541d f101907g = C7546e.m23569a(C39267a.f101908a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$a */
    static final class C39267a extends Lambda implements C7561a<C38777m<Bitmap>> {

        /* renamed from: a */
        public static final C39267a f101908a = new C39267a();

        C39267a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m125464a();
        }

        /* renamed from: a */
        private static C38777m<Bitmap> m125464a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C39811er.f103468d);
            sb.append("ve_frame_cache2/");
            sb.append(System.currentTimeMillis());
            return new C38777m<>(sb.toString(), new C38728a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$b */
    static final class C39268b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101909a;

        /* renamed from: b */
        final /* synthetic */ C1588d f101910b;

        /* renamed from: c */
        final /* synthetic */ C1606i f101911c;

        /* renamed from: d */
        final /* synthetic */ String f101912d;

        /* renamed from: e */
        final /* synthetic */ int f101913e;

        /* renamed from: f */
        final /* synthetic */ C45373u f101914f;

        /* renamed from: g */
        final /* synthetic */ int f101915g;

        /* renamed from: h */
        final /* synthetic */ String f101916h;

        C39268b(VEMediaParserProviderV2 vEMediaParserProviderV2, C1588d dVar, C1606i iVar, String str, int i, C45373u uVar, int i2, String str2) {
            this.f101909a = vEMediaParserProviderV2;
            this.f101910b = dVar;
            this.f101911c = iVar;
            this.f101912d = str;
            this.f101913e = i;
            this.f101914f = uVar;
            this.f101915g = i2;
            this.f101916h = str2;
        }

        public final void run() {
            final Bitmap bitmap;
            if (this.f101910b.mo6864a()) {
                this.f101911c.mo6901b();
                return;
            }
            if (VEMediaParserProviderV2.m125455a(this.f101912d)) {
                bitmap = C42341f.m134633a(this.f101912d, new int[]{this.f101913e, this.f101913e});
            } else {
                bitmap = this.f101914f.mo108605a(this.f101915g, -1, this.f101913e, this.f101909a.f101902b);
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C39268b f101917a;

                    {
                        this.f101917a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        m125465a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m125465a() {
                        this.f101917a.f101909a.mo97754a().mo96871a(this.f101917a.f101916h, new C38795r(bitmap.getWidth(), bitmap.getHeight(), bitmap), C392701.f101919a);
                    }
                }, (Executor) C7258h.m22730c());
            }
            if (bitmap == null) {
                this.f101911c.mo6902b(new Exception());
            } else {
                this.f101911c.mo6903b(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$c */
    static final class C39271c extends Lambda implements C7562b<String, C45373u> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101920a;

        C39271c(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f101920a = vEMediaParserProviderV2;
            super(1);
        }

        /* renamed from: a */
        public final C45373u invoke(String str) {
            C7573i.m23587b(str, "path");
            C45373u uVar = new C45373u();
            uVar.mo108607a(str);
            this.f101920a.f101903c.put(str, uVar);
            return uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$d */
    static final class C39272d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101921a;

        /* renamed from: b */
        final /* synthetic */ String f101922b;

        C39272d(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f101921a = vEMediaParserProviderV2;
            this.f101922b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap call() {
            C38795r a = this.f101921a.mo97754a().mo96869a(this.f101922b);
            if (a != null) {
                return (Bitmap) a.f100818c;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$e */
    static final class C39273e<TTaskResult, TContinuationResult> implements C1591g<Bitmap, C7581n> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101923a;

        /* renamed from: b */
        final /* synthetic */ boolean f101924b;

        /* renamed from: c */
        final /* synthetic */ int f101925c;

        /* renamed from: d */
        final /* synthetic */ String f101926d;

        /* renamed from: e */
        final /* synthetic */ int f101927e;

        /* renamed from: f */
        final /* synthetic */ C39277a f101928f;

        C39273e(VEMediaParserProviderV2 vEMediaParserProviderV2, boolean z, int i, String str, int i2, C39277a aVar) {
            this.f101923a = vEMediaParserProviderV2;
            this.f101924b = z;
            this.f101925c = i;
            this.f101926d = str;
            this.f101927e = i2;
            this.f101928f = aVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m125468a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m125468a(C1592h<Bitmap> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6889d() || !this.f101924b) {
                Bitmap bitmap = (Bitmap) hVar.mo6890e();
                if (bitmap != null) {
                    if (!(!bitmap.isRecycled())) {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        this.f101928f.mo97750a(bitmap);
                        return;
                    }
                }
                return;
            }
            this.f101923a.mo97756a(this.f101925c, this.f101926d, this.f101927e, this.f101928f, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$f */
    static final class C39274f<TTaskResult, TContinuationResult> implements C1591g<List<? extends Bitmap>, Void> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101929a;

        C39274f(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f101929a = vEMediaParserProviderV2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<Bitmap>> hVar) {
            this.f101929a.mo97757b();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$g */
    static final class C39275g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f101930a;

        C39275g(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f101930a = vEMediaParserProviderV2;
        }

        public final /* synthetic */ Object call() {
            m125470a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m125470a() {
            this.f101930a.mo97759d();
            this.f101930a.mo97754a().mo96870a();
            this.f101930a.mo97757b();
        }
    }

    /* renamed from: a */
    public final C38777m<Bitmap> mo97754a() {
        return (C38777m) this.f101907g.getValue();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void releaseFrames() {
        C1592h.m7853a((Callable<TResult>) new C39275g<TResult>(this));
    }

    /* renamed from: b */
    public final void mo97757b() {
        for (Entry key : this.f101903c.entrySet()) {
            m125456b((String) key.getKey());
        }
    }

    /* renamed from: c */
    public final void mo97758c() {
        if (this.f101906f.isEmpty()) {
            mo97757b();
            return;
        }
        C1592h.m7858b((Collection<? extends C1592h<TResult>>) this.f101906f).mo6876a((C1591g<TResult, TContinuationResult>) new C39274f<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a);
        this.f101906f.clear();
    }

    /* renamed from: d */
    public final void mo97759d() {
        for (C1590f c : this.f101905e) {
            c.mo6871c();
        }
        this.f101905e.clear();
        this.f101906f.clear();
    }

    /* renamed from: b */
    private final void m125456b(String str) {
        C45373u uVar = (C45373u) this.f101903c.get(str);
        if (uVar != null) {
            this.f101903c.put(str, null);
            uVar.mo108606a();
        }
    }

    /* renamed from: c */
    private final C1592h<Bitmap> m125457c(String str) {
        C1592h<Bitmap> a = C1592h.m7853a((Callable<TResult>) new C39272d<TResult>(this, str));
        C7573i.m23582a((Object) a, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        return a;
    }

    public VEMediaParserProviderV2(Context context) {
        C7573i.m23587b(context, "context");
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().mo55a(this);
        }
    }

    /* renamed from: a */
    public static boolean m125455a(String str) {
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
    private final C1592h<Bitmap> m125453a(String str, String str2, int i) {
        C45373u uVar;
        C39271c cVar = new C39271c(this);
        int a = C23486n.m77122a(56.0d);
        C45373u uVar2 = (C45373u) this.f101903c.get(str2);
        if (uVar2 == null) {
            uVar = cVar.invoke(str2);
        } else {
            uVar = uVar2;
        }
        C1590f fVar = new C1590f();
        this.f101905e.add(fVar);
        C1588d b = fVar.mo6870b();
        C7573i.m23582a((Object) b, "cts.token");
        C1592h<Bitmap> a2 = m125452a(b, uVar, i, a, str2, str);
        this.f101906f.add(a2);
        return a2;
    }

    /* renamed from: a */
    public final void mo97755a(int i, String str, int i2, C39277a aVar) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(aVar, "onGetBitmap");
        mo97756a(i, str, i2, aVar, true);
    }

    /* renamed from: a */
    public final void mo97756a(int i, String str, int i2, C39277a aVar, boolean z) {
        C1592h hVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        String sb2 = sb.toString();
        if (mo97754a().mo96872b(sb2)) {
            hVar = m125457c(sb2);
        } else {
            hVar = m125453a(sb2, str, i2);
        }
        C39273e eVar = new C39273e(this, z, i, str, i2, aVar);
        hVar.mo6876a((C1591g<TResult, TContinuationResult>) eVar, C1592h.f5958b);
    }

    /* renamed from: a */
    private final C1592h<Bitmap> m125452a(C1588d dVar, C45373u uVar, int i, int i2, String str, String str2) {
        C1606i iVar = new C1606i();
        ExecutorService executorService = this.f101904d;
        C39268b bVar = new C39268b(this, dVar, iVar, str, i2, uVar, i, str2);
        executorService.execute(bVar);
        C1592h<TResult> hVar = iVar.f6010a;
        C7573i.m23582a((Object) hVar, "tcs.task");
        return hVar;
    }
}
