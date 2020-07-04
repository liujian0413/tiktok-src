package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader */
public final class RnResourceDownloader {

    /* renamed from: a */
    public final Handler f68534a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final WeakReference<Context> f68535b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$RnResourceDownloadException */
    public static final class RnResourceDownloadException extends Exception {
        public RnResourceDownloadException() {
            this(null, null, 3, null);
        }

        public RnResourceDownloadException(Throwable th) {
            this(null, th);
        }

        public RnResourceDownloadException(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ RnResourceDownloadException(String str, Throwable th, int i, C7571f fVar) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            this(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a */
    public static final class C25900a implements C44849d {

        /* renamed from: a */
        final /* synthetic */ File f68536a;

        /* renamed from: b */
        final /* synthetic */ RnResourceDownloader f68537b;

        /* renamed from: c */
        final /* synthetic */ C7562b f68538c;

        /* renamed from: d */
        final /* synthetic */ C7562b f68539d;

        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a$a */
        static final class C25901a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RnResourceDownloadException f68540a;

            /* renamed from: b */
            final /* synthetic */ C25900a f68541b;

            C25901a(RnResourceDownloadException rnResourceDownloadException, C25900a aVar) {
                this.f68540a = rnResourceDownloadException;
                this.f68541b = aVar;
            }

            public final void run() {
                this.f68541b.f68538c.invoke(this.f68540a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a$b */
        static final class C25902b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RnResourceDownloadException f68542a;

            /* renamed from: b */
            final /* synthetic */ C25900a f68543b;

            C25902b(RnResourceDownloadException rnResourceDownloadException, C25900a aVar) {
                this.f68542a = rnResourceDownloadException;
                this.f68543b = aVar;
            }

            public final void run() {
                this.f68543b.f68538c.invoke(this.f68542a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a$c */
        static final class C25903c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RnResourceDownloadException f68544a;

            /* renamed from: b */
            final /* synthetic */ C25900a f68545b;

            C25903c(RnResourceDownloadException rnResourceDownloadException, C25900a aVar) {
                this.f68544a = rnResourceDownloadException;
                this.f68545b = aVar;
            }

            public final void run() {
                this.f68545b.f68538c.invoke(this.f68544a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a$d */
        static final class C25904d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ File f68546a;

            /* renamed from: b */
            final /* synthetic */ C25900a f68547b;

            C25904d(File file, C25900a aVar) {
                this.f68546a = file;
                this.f68547b = aVar;
            }

            public final void run() {
                this.f68547b.f68539d.invoke(this.f68546a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$a$e */
        static final class C25905e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RnResourceDownloadException f68548a;

            /* renamed from: b */
            final /* synthetic */ C25900a f68549b;

            C25905e(RnResourceDownloadException rnResourceDownloadException, C25900a aVar) {
                this.f68548a = rnResourceDownloadException;
                this.f68549b = aVar;
            }

            public final void run() {
                this.f68549b.f68538c.invoke(this.f68548a);
            }
        }

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
            StringBuilder sb = new StringBuilder("download failed, ");
            if (cVar != null) {
                str = cVar.f115335b;
            } else {
                str = null;
            }
            sb.append(str);
            this.f68537b.f68534a.post(new C25905e(new RnResourceDownloadException(sb.toString(), null, 2, null), this));
        }

        /* renamed from: a */
        public final void mo59412a(String str) {
            if (str == null) {
                this.f68537b.f68534a.post(new C25901a(new RnResourceDownloadException("file is null", null, 2, null), this));
                return;
            }
            File file = new File(str);
            if (!file.exists()) {
                this.f68537b.f68534a.post(new C25902b(new RnResourceDownloadException("tmp file not found", new FileNotFoundException(file.getPath())), this));
            } else if (!file.renameTo(this.f68536a)) {
                this.f68537b.f68534a.post(new C25903c(new RnResourceDownloadException("temp file rename failed", null, 2, null), this));
            } else {
                this.f68537b.f68534a.post(new C25904d(this.f68536a, this));
            }
        }

        public C25900a(File file, RnResourceDownloader rnResourceDownloader, C7562b bVar, RnResourceDownloader rnResourceDownloader2, C7562b bVar2) {
            this.f68536a = file;
            this.f68537b = rnResourceDownloader;
            this.f68538c = bVar;
            this.f68539d = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$b */
    static final class C25906b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RnResourceDownloadException f68550a;

        /* renamed from: b */
        final /* synthetic */ RnResourceDownloader f68551b;

        /* renamed from: c */
        final /* synthetic */ C7562b f68552c;

        C25906b(RnResourceDownloadException rnResourceDownloadException, RnResourceDownloader rnResourceDownloader, C7562b bVar) {
            this.f68550a = rnResourceDownloadException;
            this.f68551b = rnResourceDownloader;
            this.f68552c = bVar;
        }

        public final void run() {
            this.f68552c.invoke(this.f68550a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$c */
    static final class C25907c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f68553a;

        /* renamed from: b */
        final /* synthetic */ RnResourceDownloader f68554b;

        /* renamed from: c */
        final /* synthetic */ C7562b f68555c;

        C25907c(File file, RnResourceDownloader rnResourceDownloader, C7562b bVar) {
            this.f68553a = file;
            this.f68554b = rnResourceDownloader;
            this.f68555c = bVar;
        }

        public final void run() {
            this.f68555c.invoke(this.f68553a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnResourceDownloader$d */
    static final class C25908d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RnResourceDownloadException f68556a;

        /* renamed from: b */
        final /* synthetic */ RnResourceDownloader f68557b;

        /* renamed from: c */
        final /* synthetic */ C7562b f68558c;

        C25908d(RnResourceDownloadException rnResourceDownloadException, RnResourceDownloader rnResourceDownloader, C7562b bVar) {
            this.f68556a = rnResourceDownloadException;
            this.f68557b = rnResourceDownloader;
            this.f68558c = bVar;
        }

        public final void run() {
            this.f68558c.invoke(this.f68556a);
        }
    }

    public RnResourceDownloader(Context context) {
        C7573i.m23587b(context, "context");
        this.f68535b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo67279a(String str, C7562b<? super File, C7581n> bVar, C7562b<? super RnResourceDownloadException, C7581n> bVar2) {
        C7573i.m23587b(str, "sourceUrl");
        C7573i.m23587b(bVar, "successHandler");
        C7573i.m23587b(bVar2, "failHandler");
        Context context = (Context) this.f68535b.get();
        if (context == null) {
            this.f68534a.post(new C25906b(new RnResourceDownloadException("context is null", null, 2, null), this, bVar2));
            return;
        }
        File file = new File(context.getCacheDir(), "rn_source_offline");
        if (!file.exists()) {
            file.mkdirs();
        }
        String a = C6306c.m19561a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".jsbundle");
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            this.f68534a.post(new C25907c(file2, this, bVar));
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
            C44854e a2 = new C44856a().mo107294a(str).mo107298b(file3.getPath()).mo107297a();
            C44851d a3 = C44851d.m141532a();
            C25900a aVar = new C25900a(file2, this, bVar2, this, bVar);
            a3.mo107292a(a2, (C44849d) aVar);
        } catch (IOException e) {
            this.f68534a.post(new C25908d(new RnResourceDownloadException("temp file failed", e), this, bVar2));
        }
    }
}
