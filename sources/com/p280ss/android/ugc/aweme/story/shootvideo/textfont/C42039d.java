package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.framwork.core.p523b.C10233a;
import com.google.common.base.C17462u;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.d */
public class C42039d {

    /* renamed from: a */
    public static final String[] f109196a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: c */
    private static C42039d f109197c;

    /* renamed from: b */
    public String f109198b = "default";

    /* renamed from: d */
    private Map<String, C42038c> f109199d = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: e */
    private Map<String, Typeface> f109200e = new ConcurrentHashMap();

    /* renamed from: f */
    private String f109201f = "default";

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.d$a */
    static class C42041a extends C42037b {

        /* renamed from: a */
        private boolean f109203a;

        /* renamed from: b */
        private C42038c f109204b;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            boolean z = true;
            C42039d.m133621a(this.f109204b, true, (Exception) null);
            if (C42039d.m133622a(this.f109204b)) {
                this.f109204b.f109194l = 1;
            } else {
                C42039d.m133627d(this.f109204b.f109189g);
                this.f109204b.f109194l = 2;
            }
            if (this.f109204b.f109195m != null) {
                C42036a aVar = this.f109204b.f109195m;
                C42038c cVar = this.f109204b;
                if (this.f109204b.f109194l != 1) {
                    z = false;
                }
                aVar.mo103194a(cVar, z, this.f109203a);
            }
            this.f109204b.f109193k = false;
            super.onSuccessed(downloadInfo);
        }

        C42041a(C42038c cVar, boolean z) {
            this.f109204b = cVar;
            this.f109203a = z;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C42039d.m133621a(this.f109204b, false, (Exception) baseException);
            this.f109204b.f109194l = 2;
            C42039d.m133627d(this.f109204b.f109189g);
            if (this.f109204b.f109195m != null) {
                this.f109204b.f109195m.mo103195a(this.f109203a);
            }
            this.f109204b.f109193k = false;
            super.onFailed(downloadInfo, baseException);
        }
    }

    /* renamed from: h */
    private static boolean m133633h(int i) {
        return i == 1;
    }

    /* renamed from: f */
    public final void mo103240f() {
        m133634i();
    }

    /* renamed from: a */
    public final boolean mo103226a(String str) {
        if (!TextUtils.isEmpty(str) && this.f109200e.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private C42038c m133630g() {
        return (C42038c) this.f109199d.get(this.f109198b);
    }

    private C42039d() {
    }

    /* renamed from: a */
    public static C42039d m133620a() {
        if (f109197c == null) {
            synchronized (C42039d.class) {
                if (f109197c == null) {
                    f109197c = new C42039d();
                }
            }
        }
        return f109197c;
    }

    /* renamed from: h */
    private void m133632h() {
        try {
            String str = (String) C35563c.f93252o.mo83236l().mo83238a();
            if (!TextUtils.isEmpty(str)) {
                m133624b((List) C35563c.f93239b.mo15975a(str, new C6597a<List<C42038c>>() {
                }.type));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private void m133634i() {
        if (this.f109199d.size() != 0) {
            for (String str : this.f109199d.keySet()) {
                if (this.f109199d.get(str) != null) {
                    ((C42038c) this.f109199d.get(str)).f109195m = null;
                }
            }
        }
    }

    /* renamed from: d */
    public final Typeface mo103235d() {
        if (this.f109200e.get(this.f109198b) != null) {
            return (Typeface) this.f109200e.get(this.f109198b);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: e */
    public final boolean mo103237e() {
        if (m133630g() != null) {
            return m133630g().mo103218b();
        }
        return false;
    }

    /* renamed from: c */
    public final String mo103232c() {
        List b = mo103228b();
        if (C10233a.m30356a(b) || !((C42038c) b.get(0)).mo103219c()) {
            return null;
        }
        return ((C42038c) b.get(0)).f109191i;
    }

    /* renamed from: b */
    public final List<C42038c> mo103228b() {
        if (this.f109199d.values().size() == 0) {
            m133632h();
            if (this.f109199d.size() == 0) {
                return new ArrayList();
            }
        }
        for (C42038c cVar : this.f109199d.values()) {
            if (cVar != null) {
                if (m133625b(cVar)) {
                    cVar.f109194l = 1;
                } else {
                    Typeface e = m133628e(cVar.f109189g);
                    if (e != null) {
                        this.f109200e.put(cVar.f109191i, e);
                        cVar.f109194l = 1;
                    } else {
                        cVar.f109194l = 2;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f109199d.values());
        return arrayList;
    }

    /* renamed from: a */
    public final void mo103224a(List<C42038c> list) {
        m133624b(list);
        m133626c(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Void mo103234c(Context context) throws Exception {
        mo103222a(context);
        return null;
    }

    /* renamed from: b */
    public final void mo103230b(Context context) {
        C1592h.m7853a((Callable<TResult>) new C42042e<TResult>(this, context));
    }

    /* renamed from: c */
    public final String mo103233c(int i) {
        if (m133633h(i)) {
            return this.f109201f;
        }
        return this.f109198b;
    }

    /* renamed from: f */
    public final C42038c mo103239f(int i) {
        return (C42038c) this.f109199d.get(mo103233c(i));
    }

    /* renamed from: b */
    private boolean m133625b(C42038c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.f109191i) || this.f109200e.get(cVar.f109191i) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m133626c(List<C42038c> list) {
        if (!C10233a.m30356a(list)) {
            try {
                String b = C35563c.f93239b.mo15979b((Object) list);
                if (!TextUtils.isEmpty(b)) {
                    C35563c.f93252o.mo83236l().mo83239a(b);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m133627d(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static Typeface m133628e(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        try {
            return Typeface.createFromFile(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static String m133629f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return str.substring(str.lastIndexOf("/") + 1, str.length());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m133631g(int i) {
        for (String equals : f109196a) {
            if (equals.equals(m133620a().mo103233c(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m133622a(C42038c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.f109189g) || !new File(cVar.f109189g).exists()) {
            return false;
        }
        try {
            Typeface createFromFile = Typeface.createFromFile(cVar.f109189g);
            if (createFromFile == null) {
                return false;
            }
            m133620a().f109200e.put(cVar.f109191i, createFromFile);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final Typeface mo103227b(String str) {
        if (TextUtils.isEmpty(str) || this.f109200e.size() == 0) {
            return null;
        }
        Typeface typeface = (Typeface) this.f109200e.get(str);
        if (typeface == null && this.f109199d.get(str) != null) {
            typeface = m133628e(((C42038c) this.f109199d.get(str)).f109189g);
            if (typeface != null) {
                this.f109200e.put(str, typeface);
            }
        }
        return typeface;
    }

    /* renamed from: c */
    public final Typeface mo103231c(String str) {
        if (TextUtils.isEmpty(str) || this.f109199d.size() == 0) {
            return null;
        }
        for (C42038c cVar : this.f109199d.values()) {
            if (str.equals(cVar.f109183a)) {
                return mo103227b(cVar.f109191i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m133624b(List<C42038c> list) {
        if (!C10233a.m30356a(list)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C35563c.f93238a.getFilesDir().getAbsolutePath());
            sb.append(File.separator);
            sb.append("font");
            String sb2 = sb.toString();
            for (int i = 0; i < list.size(); i++) {
                String f = m133629f(((C42038c) list.get(i)).f109185c);
                if (!TextUtils.isEmpty(f)) {
                    C42038c cVar = (C42038c) list.get(i);
                    cVar.f109191i = f;
                    cVar.f109190h = sb2;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((C42038c) list.get(i)).f109190h);
                    sb3.append(File.separator);
                    sb3.append(((C42038c) list.get(i)).f109191i);
                    cVar.f109189g = sb3.toString();
                    cVar.f109192j = i + 1;
                    this.f109199d.put(f, cVar);
                }
            }
        }
    }

    /* renamed from: d */
    public final Typeface mo103236d(int i) {
        if (!m133633h(i)) {
            return mo103235d();
        }
        if (this.f109200e.get(this.f109201f) != null) {
            return (Typeface) this.f109200e.get(this.f109201f);
        }
        return Typeface.DEFAULT_BOLD;
    }

    /* renamed from: e */
    public final boolean mo103238e(int i) {
        if (mo103239f(i) != null) {
            return mo103239f(i).mo103218b();
        }
        return false;
    }

    /* renamed from: a */
    public final String mo103221a(Typeface typeface) {
        for (String str : this.f109200e.keySet()) {
            if (typeface != null && typeface.equals(this.f109200e.get(str))) {
                return str;
            }
        }
        return "default";
    }

    /* renamed from: b */
    public final void mo103229b(int i) {
        List b = mo103228b();
        if (!C10233a.m30356a(b) && ((C42038c) b.get(0)).mo103219c()) {
            mo103223a(((C42038c) b.get(0)).f109191i, i);
        }
    }

    /* renamed from: a */
    public final void mo103222a(Context context) {
        if (context != null) {
            if (this.f109199d.size() == 0) {
                m133632h();
                if (this.f109199d.size() == 0) {
                    return;
                }
            }
            for (String str : this.f109199d.keySet()) {
                C42038c cVar = (C42038c) this.f109199d.get(str);
                if (m133625b(cVar) || m133622a(cVar)) {
                    cVar.f109194l = 1;
                } else {
                    m133627d(cVar.f109189g);
                    m133623a(cVar, context, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo103225a(int i) {
        return "default".equals(mo103233c(i));
    }

    /* renamed from: a */
    public final void mo103223a(String str, int i) {
        if (m133633h(i)) {
            this.f109201f = str;
        } else {
            this.f109198b = str;
        }
    }

    /* renamed from: a */
    public static void m133621a(C42038c cVar, boolean z, Exception exc) {
        String str;
        String str2;
        C6869c cVar2;
        String str3;
        int i;
        if (cVar != null) {
            if (z) {
                str2 = "font_resource_download_error_state";
                C6869c a = C6869c.m21381a().mo16887a("url", cVar.f109185c).mo16887a("font_title", cVar.f109186d);
                str3 = "font_name";
                str = cVar.f109191i;
                cVar2 = a;
                i = 0;
            } else {
                str2 = "font_resource_download_error_state";
                i = 1;
                cVar2 = C6869c.m21381a().mo16887a("url", cVar.f109185c).mo16887a("font_title", cVar.f109186d).mo16887a("font_name", cVar.f109191i);
                str3 = "exception";
                if (exc == null) {
                    str = "";
                } else {
                    str = C17462u.m58024b(exc);
                }
            }
            C6893q.m21444a(str2, i, cVar2.mo16887a(str3, str).mo16888b());
        }
    }

    /* renamed from: a */
    public static boolean m133623a(C42038c cVar, Context context, boolean z) {
        if (context == null || TextUtils.isEmpty(cVar.f109185c) || !C42043f.m133655a(context)) {
            return false;
        }
        if (cVar.f109193k) {
            return true;
        }
        if (!z) {
            cVar.f109193k = true;
        }
        Downloader.with(context).url(cVar.f109185c).savePath(cVar.f109190h).name(cVar.f109191i).mainThreadListener(new C42041a(cVar, z)).download();
        return true;
    }
}
