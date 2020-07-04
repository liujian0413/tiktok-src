package com.p280ss.android.ugc.aweme.festival.p311a;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.p1288h.C30226d;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.festival.a.b */
public class C29122b implements C29126e {

    /* renamed from: a */
    public static final String f76868a;

    /* renamed from: b */
    private static volatile C29122b f76869b;

    /* renamed from: c */
    private String f76870c;

    /* renamed from: d */
    private String f76871d;

    /* renamed from: e */
    private C29123a f76872e;

    /* renamed from: com.ss.android.ugc.aweme.festival.a.b$a */
    public interface C29123a {
        /* renamed from: a */
        void mo74583a();
    }

    /* renamed from: i */
    private String m95503i() {
        return this.f76870c;
    }

    /* renamed from: a */
    public final void mo59407a(int i) {
    }

    /* renamed from: a */
    public final void mo59408a(int i, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo59411a(C44850c cVar) {
    }

    /* renamed from: f */
    public final void mo59418f() {
    }

    /* renamed from: g */
    public final void mo59419g() {
    }

    /* renamed from: b */
    public final void mo74580b() {
        if (this.f76872e != null) {
            this.f76872e = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Object mo74582d() throws Exception {
        this.f76872e.mo74583a();
        return null;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C7276d.m22821e());
        sb.append(File.separator);
        sb.append("festival");
        f76868a = sb.toString();
    }

    private C29122b() {
        if (!C29132a.m95560a()) {
            m95500c(f76868a);
        } else {
            C42973bg.m136422a(f76868a, false);
        }
    }

    /* renamed from: a */
    public static C29122b m95497a() {
        if (f76869b == null) {
            synchronized (C29122b.class) {
                if (f76869b == null) {
                    f76869b = new C29122b();
                }
            }
        }
        return f76869b;
    }

    /* renamed from: h */
    private static String m95502h() {
        C30226d i = C29132a.m95574i();
        if (i == null) {
            return null;
        }
        UrlModel urlModel = i.f79541b;
        if (urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            return null;
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: e */
    private boolean m95501e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f76868a);
        sb.append(File.separator);
        sb.append(C6306c.m19561a(m95502h()));
        sb.append(".zip");
        File file = new File(sb.toString());
        if (!file.exists()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f76868a);
        sb2.append(File.separator);
        sb2.append(C6306c.m19561a(m95502h()));
        File file2 = new File(sb2.toString());
        if (!file2.exists() || !file2.isDirectory()) {
            return false;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || listFiles.length == 0 || C29132a.m95573h()) {
            return false;
        }
        return m95498a(file, C29132a.m95572g().f79515e.f79540a);
    }

    /* renamed from: c */
    public final File mo74581c() {
        String i = m95503i();
        if (TextUtils.isEmpty(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f76868a);
            sb.append(File.separator);
            sb.append(C6306c.m19561a(m95502h()));
            this.f76870c = sb.toString();
            i = this.f76870c;
        }
        File file = new File(i);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        return file;
    }

    /* renamed from: c */
    private static void m95500c(String str) {
        try {
            C42973bg.m136431c(str);
        } catch (NoSuchMethodError e) {
            StringBuilder sb = new StringBuilder("NoSuchMethodError in FestivalResDownloader-deleteFiles, path is ");
            sb.append(str);
            sb.append(", error is ");
            sb.append(e.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: b */
    private void m95499b(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f76868a);
            sb.append(File.separator);
            sb.append(C6306c.m19561a(str));
            this.f76871d = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f76871d);
            sb2.append(".zip");
            String sb3 = sb2.toString();
            C42973bg.m136422a(sb3, true);
            C32331a.m104891a(new C44856a().mo107294a(str).mo107298b(sb3).mo107297a(), this);
        }
    }

    /* renamed from: a */
    public final void mo74579a(C29123a aVar) {
        if (!C29132a.m95560a()) {
            m95500c(f76868a);
            return;
        }
        this.f76872e = aVar;
        if (m95501e()) {
            StringBuilder sb = new StringBuilder();
            sb.append(f76868a);
            sb.append(File.separator);
            sb.append(C6306c.m19561a(m95502h()));
            this.f76870c = sb.toString();
            if (this.f76872e != null) {
                this.f76872e.mo74583a();
                return;
            }
        }
        m95500c(f76868a);
        m95499b(m95502h());
    }

    /* renamed from: a */
    public final void mo59412a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!C29132a.m95573h()) {
                if (!m95498a(file, C29132a.m95572g().f79515e.f79540a)) {
                    m95500c(file.getPath());
                    return;
                }
                File file2 = new File(this.f76871d);
                if (file2.exists() && file2.listFiles().length > 0) {
                    m95500c(file2.getPath());
                }
                File a = C42973bg.m136422a(this.f76871d, false);
                try {
                    C43136fo.m136824a(new File(str), a);
                    this.f76870c = a.getPath();
                    if (this.f76872e != null) {
                        C1592h.m7855a((Callable<TResult>) new C29124c<TResult>(this), C1592h.f5958b);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m95498a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(C6306c.m19560a(file), str);
    }
}
