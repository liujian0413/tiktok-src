package com.p280ss.android.ttve.nativePort;

import android.content.Context;
import com.p280ss.android.ttve.log.C20456a;
import com.p280ss.android.vesdk.runtime.C45364f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader */
public class TENativeLibsLoader {

    /* renamed from: a */
    public static final String f55359a = TENativeLibsLoader.class.getSimpleName();

    /* renamed from: b */
    public static Context f55360b;

    /* renamed from: c */
    private static volatile LoadStatus f55361c = LoadStatus.NOT_LOAD;

    /* renamed from: d */
    private static boolean f55362d;

    /* renamed from: e */
    private static C20488d f55363e = null;

    /* renamed from: f */
    private static C20487c f55364f = null;

    /* renamed from: g */
    private static C20488d f55365g = new C20486b();

    /* renamed from: h */
    private static C20487c f55366h = new C20485a();

    /* renamed from: i */
    private static ArrayList<C20489e> f55367i = new ArrayList<>();

    /* renamed from: j */
    private static boolean f55368j = false;

    /* renamed from: k */
    private static boolean f55369k = false;

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$LoadStatus */
    public enum LoadStatus {
        NOT_LOAD,
        LOADING,
        LOADED
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$a */
    public static class C20485a implements C20487c {
        /* renamed from: a */
        public final void mo55401a(String[] strArr) {
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$b */
    public static class C20486b implements C20488d {
        /* renamed from: a */
        public final boolean mo55402a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("Start loadLibrary ");
                sb.append(str);
                C20456a.m67876a(3, sb.toString());
                if (!C45364f.m143386a(str, TENativeLibsLoader.f55360b)) {
                    return false;
                }
                System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder("Finish loadLibrary ");
                sb2.append(str);
                sb2.append(" cost time:");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                C20456a.m67876a(3, sb2.toString());
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$c */
    public interface C20487c {
        /* renamed from: a */
        void mo55401a(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$d */
    public interface C20488d {
        /* renamed from: a */
        boolean mo55402a(List<String> list);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$e */
    public static class C20489e {

        /* renamed from: a */
        public String f55370a;

        /* renamed from: b */
        public volatile boolean f55371b;

        public C20489e(String str) {
            this.f55370a = str;
        }
    }

    /* renamed from: b */
    public static LoadStatus m67985b() {
        return f55361c;
    }

    /* renamed from: a */
    public static int m67979a() {
        if (f55361c != LoadStatus.LOADED) {
            return -1;
        }
        if (f55368j) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static synchronized void m67986c() {
        synchronized (TENativeLibsLoader.class) {
            if (!f55362d) {
                m67989f();
            } else {
                m67983a("ttvideoeditor");
            }
        }
    }

    /* renamed from: d */
    public static synchronized void m67987d() {
        synchronized (TENativeLibsLoader.class) {
            if (!f55362d) {
                m67989f();
            } else {
                m67983a("ttvebase");
            }
        }
    }

    /* renamed from: e */
    public static synchronized void m67988e() {
        synchronized (TENativeLibsLoader.class) {
            if (!f55362d) {
                m67989f();
            } else {
                m67983a("ttvideorecorder");
            }
        }
    }

    /* renamed from: f */
    private static void m67989f() {
        if (f55361c != LoadStatus.LOADED) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("x264");
            arrayList.add("fdk-aac");
            arrayList.add("ttopenssl");
            arrayList.add("ttffmpeg");
            arrayList.add("yuv");
            arrayList.add("audioeffect");
            arrayList.add("effect");
            arrayList.add("ttvebase");
            arrayList.add("ttvideorecorder");
            if ("mt".equals("hotsoon")) {
                arrayList.add("ffmpeg-invoker");
                arrayList.add("ffmpeg-main");
                arrayList.add("main");
            } else {
                arrayList.add("ttmain");
            }
            if (f55369k) {
                arrayList.add("ttvideoeditor");
                f55368j = true;
            } else {
                arrayList.add("ttvideoeditor");
                f55368j = false;
            }
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                StringBuilder sb = new StringBuilder("lib");
                sb.append((String) arrayList.get(i));
                sb.append(".so");
                strArr[i] = sb.toString();
            }
            f55361c = LoadStatus.LOADING;
            if (f55363e != null) {
                if (!f55363e.mo55402a(arrayList)) {
                    f55361c = LoadStatus.NOT_LOAD;
                    return;
                }
            } else if (!f55365g.mo55402a(arrayList)) {
                f55361c = LoadStatus.NOT_LOAD;
                return;
            }
            f55361c = LoadStatus.LOADED;
            if (f55364f != null) {
                f55364f.mo55401a(strArr);
            }
        }
    }

    /* renamed from: g */
    private static void m67990g() {
        if (f55369k) {
            f55367i.add(new C20489e("ttvideoeditor"));
            f55368j = true;
        } else {
            f55367i.add(new C20489e("ttvideoeditor"));
            f55368j = false;
        }
        if ("mt".equals("hotsoon")) {
            f55367i.add(new C20489e("main"));
            f55367i.add(new C20489e("ffmpeg-main"));
            f55367i.add(new C20489e("ffmpeg-invoker"));
        } else {
            f55367i.add(new C20489e("ttmain"));
        }
        f55367i.add(new C20489e("ttvideorecorder"));
        f55367i.add(new C20489e("ttvebase"));
        f55367i.add(new C20489e("effect"));
        f55367i.add(new C20489e("audioeffect"));
        f55367i.add(new C20489e("yuv"));
        f55367i.add(new C20489e("ttffmpeg"));
        f55367i.add(new C20489e("ttopenssl"));
        f55367i.add(new C20489e("fdk-aac"));
        f55367i.add(new C20489e("x264"));
        f55367i.add(new C20489e("c++_shared"));
    }

    /* renamed from: a */
    public static void m67981a(C20487c cVar) {
        f55364f = cVar;
    }

    /* renamed from: a */
    public static void m67982a(C20488d dVar) {
        f55363e = dVar;
    }

    /* renamed from: a */
    public static synchronized void m67980a(Context context) {
        synchronized (TENativeLibsLoader.class) {
            f55360b = context;
        }
    }

    /* renamed from: a */
    public static void m67984a(boolean z) {
        f55369k = true;
    }

    /* renamed from: a */
    private static void m67983a(String str) {
        if (f55367i.size() <= 0) {
            m67990g();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = f55367i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20489e eVar = (C20489e) it.next();
            if (str == eVar.f55370a) {
                if (!eVar.f55371b) {
                    eVar.f55371b = true;
                    linkedList.add(eVar.f55370a);
                } else {
                    return;
                }
            }
        }
        while (it.hasNext()) {
            C20489e eVar2 = (C20489e) it.next();
            if (eVar2.f55371b) {
                break;
            }
            eVar2.f55371b = true;
            linkedList.add(eVar2.f55370a);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            StringBuilder sb = new StringBuilder("lib");
            sb.append((String) linkedList.get(i));
            sb.append(".so");
            strArr[i] = sb.toString();
        }
        f55361c = LoadStatus.LOADING;
        if (f55363e != null) {
            if (!f55363e.mo55402a(linkedList)) {
                f55361c = LoadStatus.NOT_LOAD;
                return;
            }
        } else if (!f55365g.mo55402a(linkedList)) {
            f55361c = LoadStatus.NOT_LOAD;
            return;
        }
        f55361c = LoadStatus.LOADED;
        if (f55364f != null) {
            f55364f.mo55401a(strArr);
        }
    }
}
