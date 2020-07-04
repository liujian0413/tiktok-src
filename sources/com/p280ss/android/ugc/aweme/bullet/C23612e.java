package com.p280ss.android.ugc.aweme.bullet;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.C7581n;
import kotlin.NotImplementedError;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.bullet.e */
public final class C23612e implements C10334a {

    /* renamed from: b */
    public static final C23613a f62279b = new C23613a(null);

    /* renamed from: a */
    public final Application f62280a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$a */
    public static final class C23613a {
        private C23613a() {
        }

        public /* synthetic */ C23613a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$b */
    public static final class C23614b implements C44849d {

        /* renamed from: a */
        final /* synthetic */ C7562b f62281a;

        /* renamed from: b */
        final /* synthetic */ File f62282b;

        /* renamed from: c */
        final /* synthetic */ C7562b f62283c;

        /* renamed from: a */
        public final void mo59407a(int i) {
        }

        /* renamed from: a */
        public final void mo59408a(int i, long j, long j2) {
        }

        /* renamed from: f */
        public final void mo59418f() {
        }

        /* renamed from: g */
        public final void mo59419g() {
        }

        /* renamed from: a */
        public final void mo59411a(C44850c cVar) {
            String str;
            C7562b bVar = this.f62281a;
            StringBuilder sb = new StringBuilder("download failed, ");
            if (cVar != null) {
                str = cVar.f115335b;
            } else {
                str = null;
            }
            sb.append(str);
            bVar.invoke(new Throwable(sb.toString()));
        }

        /* renamed from: a */
        public final void mo59412a(String str) {
            if (str == null) {
                this.f62281a.invoke(new Throwable("file is null"));
                return;
            }
            File file = new File(str);
            if (!file.exists()) {
                C7562b bVar = this.f62281a;
                StringBuilder sb = new StringBuilder();
                sb.append(file.getPath());
                sb.append(" tmp file not found");
                bVar.invoke(new Throwable(sb.toString()));
            } else if (!file.renameTo(this.f62282b)) {
                this.f62281a.invoke(new Throwable("temp file rename failed"));
            } else {
                this.f62283c.invoke(this.f62282b);
            }
        }

        C23614b(C7562b bVar, File file, C7562b bVar2) {
            this.f62281a = bVar;
            this.f62282b = file;
            this.f62283c = bVar2;
        }
    }

    public C23612e(Application application) {
        C7573i.m23587b(application, "application");
        this.f62280a = application;
    }

    /* renamed from: a */
    public final void mo25099a(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new NotImplementedError(sb.toString());
    }

    /* renamed from: a */
    private static void m77511a(String str, C7562b<? super File, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        if (C7634n.m23721b(str, "/", false)) {
            if (str != null) {
                str = str.substring(1);
                C7573i.m23582a((Object) str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        C10873f b = C42983bo.m136460b();
        if (b == null) {
            bVar2.invoke(new Throwable("gecko client is null"));
            return;
        }
        C10903d a = b.mo26209a(str);
        if (a == null) {
            bVar2.invoke(new Throwable("gecko package is null"));
            return;
        }
        String str2 = a.f29509d;
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence) || TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, charSequence)) {
            bVar2.invoke(new Throwable("gecko dir is null"));
            return;
        }
        Context a2 = C6399b.m19921a();
        String j = C6399b.m19934j();
        String serverDeviceId = AppLog.getServerDeviceId();
        AwemeAppData a3 = C19936f.m65765a();
        C7573i.m23582a((Object) a3, "BaseAppData.inst()");
        C10702a a4 = C10702a.m31260a(a2, j, serverDeviceId, a3.mo53441g().mo53916a());
        C7573i.m23582a((Object) a4, "IESOfflineCache\n        …eConfig.offlineRootDir())");
        bVar.invoke(new File(a4.mo25588a(), str2));
    }

    /* renamed from: b */
    private final void m77512b(String str, C7562b<? super File, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        File file = new File(this.f62280a.getCacheDir(), "rn_source_offline");
        if (!file.exists()) {
            file.mkdirs();
        }
        String a = C6306c.m19561a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".jsbundle");
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            bVar.invoke(file2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(".jsbundle.tmp");
        File file3 = new File(file, sb2.toString());
        if (file3.exists()) {
            file3.delete();
        }
        try {
            file3.createNewFile();
            C44851d.m141532a().mo107292a(new C44856a().mo107294a(str).mo107298b(file3.getPath()).mo107297a(), (C44849d) new C23614b(bVar2, file2, bVar));
        } catch (IOException e) {
            bVar2.invoke(new Throwable(e.getMessage()));
        }
    }

    /* renamed from: b */
    public final void mo25100b(Uri uri, C7562b<? super File, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) "local_file")) {
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != -554435892) {
                    if (hashCode == 1728122231 && authority.equals("absolute")) {
                        bVar.invoke(new File(uri.getPath()));
                        return;
                    }
                } else if (authority.equals("relative")) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    m77511a(path, bVar, bVar2);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append(" not found");
            bVar2.invoke(new FileNotFoundException(sb.toString()));
        } else if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            String uri2 = uri.toString();
            C7573i.m23582a((Object) uri2, "uri.toString()");
            m77512b(uri2, bVar, bVar2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append(" not found");
            bVar2.invoke(new FileNotFoundException(sb2.toString()));
        }
    }
}
