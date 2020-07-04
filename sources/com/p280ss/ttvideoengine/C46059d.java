package com.p280ss.ttvideoengine;

import android.content.Context;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.mediakit.medialoader.AVMDLDataLoader;
import com.p280ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.p280ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.p280ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.p280ss.mediakit.net.AVMDLDNSParser;
import com.p280ss.ttvideoengine.C46036ad.C46037a;
import com.p280ss.ttvideoengine.p1810c.C46050b;
import com.p280ss.ttvideoengine.p1810c.C46050b.C46057a;
import com.p280ss.ttvideoengine.p1812e.C46082g;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1812e.C46084i;
import com.p280ss.ttvideoengine.p1816i.C46114a;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.d */
public class C46059d implements AVMDLDataLoaderListener {

    /* renamed from: b */
    static final /* synthetic */ boolean f117695b = (!C46059d.class.desiredAssertionStatus());

    /* renamed from: a */
    public C46075e f117696a;

    /* renamed from: c */
    private volatile boolean f117697c;

    /* renamed from: d */
    private volatile C46113i f117698d;

    /* renamed from: e */
    private volatile int f117699e;

    /* renamed from: f */
    private C46068f f117700f;

    /* renamed from: g */
    private C46068f f117701g;

    /* renamed from: h */
    private C46068f f117702h;

    /* renamed from: i */
    private C46068f f117703i;

    /* renamed from: j */
    private AVMDLDataLoader f117704j;

    /* renamed from: k */
    private AVMDLDataLoaderConfigure f117705k;

    /* renamed from: l */
    private Context f117706l;

    /* renamed from: m */
    private C46036ad f117707m;

    /* renamed from: n */
    private Exception f117708n;

    /* renamed from: o */
    private String f117709o;

    /* renamed from: p */
    private C46063c f117710p;

    /* renamed from: q */
    private int f117711q;

    /* renamed from: r */
    private final ReentrantLock f117712r;

    /* renamed from: s */
    private int f117713s;

    /* renamed from: com.ss.ttvideoengine.d$a */
    public class C46061a {

        /* renamed from: a */
        public String f117714a;

        /* renamed from: b */
        public long f117715b;

        /* renamed from: c */
        public long f117716c;

        public C46061a() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$b */
    public class C46062b {

        /* renamed from: a */
        public long f117718a;

        /* renamed from: b */
        public long f117719b;

        /* renamed from: c */
        public String f117720c;

        public C46062b() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$c */
    class C46063c {

        /* renamed from: b */
        private Timer f117723b;

        /* renamed from: c */
        private C46064a f117724c;

        /* renamed from: com.ss.ttvideoengine.d$c$a */
        class C46064a extends TimerTask {

            /* renamed from: b */
            private AVMDLDataLoader f117726b;

            public final void run() {
                try {
                    if (this.f117726b != null) {
                        this.f117726b.onLogInfo(7, 0, this.f117726b.getStringValue(1011));
                    }
                } catch (Exception unused) {
                }
            }

            public C46064a(AVMDLDataLoader aVMDLDataLoader) {
                this.f117726b = aVMDLDataLoader;
            }
        }

        private C46063c() {
        }

        /* renamed from: a */
        public final void mo112196a(AVMDLDataLoader aVMDLDataLoader, int i) {
            if (this.f117724c == null && this.f117723b == null && i > 0) {
                this.f117724c = new C46064a(aVMDLDataLoader);
                this.f117723b = new Timer();
                long j = (long) i;
                this.f117723b.schedule(this.f117724c, j, j);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$d */
    public class C46065d {

        /* renamed from: a */
        public String f117727a;

        /* renamed from: b */
        public String f117728b;

        /* renamed from: c */
        public String f117729c;

        /* renamed from: d */
        public C46083h f117730d;

        /* renamed from: e */
        public C46117c f117731e;

        /* renamed from: f */
        public long f117732f;

        /* renamed from: g */
        public Resolution f117733g = Resolution.Undefine;

        /* renamed from: h */
        public C46050b f117734h;

        /* renamed from: i */
        public C46071i f117735i;

        /* renamed from: j */
        public C46160o f117736j;

        /* renamed from: k */
        public String f117737k;

        /* renamed from: l */
        public String f117738l;

        /* renamed from: m */
        public C46082g f117739m;

        /* renamed from: n */
        public C46163r f117740n;

        /* renamed from: o */
        public C46159n f117741o;

        /* renamed from: com.ss.ttvideoengine.d$d$a */
        class C46066a implements C46057a {

            /* renamed from: b */
            private final WeakReference<C46065d> f117744b;

            /* renamed from: a */
            public final void mo112099a(C46117c cVar) {
            }

            /* renamed from: a */
            public final void mo112100a(String str) {
            }

            public C46066a(C46065d dVar) {
                this.f117744b = new WeakReference<>(dVar);
            }

            /* renamed from: a */
            public final void mo112097a(int i, String str) {
                C46065d dVar = (C46065d) this.f117744b.get();
                if (!(dVar == null || dVar.f117735i == null)) {
                    dVar.f117735i.mo112206a(dVar);
                }
            }

            /* renamed from: a */
            public final void mo112098a(C46083h hVar, C46117c cVar) {
                C46065d dVar = (C46065d) this.f117744b.get();
                if (dVar != null) {
                    dVar.f117730d = hVar;
                    dVar.f117731e = cVar;
                    if (dVar.f117735i != null) {
                        dVar.f117735i.mo112206a(dVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo112198a() {
            if (this.f117734h != null) {
                this.f117734h.f117666e = new C46066a(this);
            }
        }

        public C46065d() {
        }

        /* renamed from: a */
        public final void mo112199a(String str, Resolution resolution, long j) {
            this.f117727a = str;
            this.f117733g = resolution;
            this.f117732f = j;
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$e */
    public class C46067e {

        /* renamed from: a */
        public String f117745a;

        /* renamed from: b */
        public String f117746b;

        /* renamed from: c */
        public String f117747c;

        /* renamed from: d */
        public long f117748d;

        /* renamed from: e */
        public long f117749e;

        /* renamed from: f */
        public Resolution f117750f = Resolution.Undefine;

        /* renamed from: g */
        public String f117751g;

        /* renamed from: h */
        public C46082g f117752h;

        /* renamed from: i */
        public int f117753i;

        public C46067e() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$f */
    class C46068f {

        /* renamed from: a */
        public long f117755a;

        /* renamed from: c */
        private final ReentrantLock f117757c;

        /* renamed from: d */
        private final ArrayList<C46065d> f117758d;

        /* renamed from: c */
        private Boolean m144363c() {
            boolean z = false;
            if (this.f117755a < 1) {
                return Boolean.valueOf(false);
            }
            if (((long) this.f117758d.size()) >= this.f117755a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: a */
        public final C46065d mo112200a() {
            this.f117757c.lock();
            if (this.f117758d.size() == 0) {
                this.f117757c.unlock();
                return null;
            }
            C46065d dVar = (C46065d) this.f117758d.get(this.f117758d.size() - 1);
            this.f117757c.unlock();
            return dVar;
        }

        /* renamed from: b */
        public final C46065d mo112203b() {
            this.f117757c.lock();
            if (this.f117758d.size() == 0) {
                this.f117757c.unlock();
                return null;
            }
            C46065d dVar = (C46065d) this.f117758d.get(this.f117758d.size() - 1);
            this.f117758d.remove(dVar);
            this.f117757c.unlock();
            return dVar;
        }

        private C46068f() {
            this.f117757c = new ReentrantLock();
            this.f117758d = new ArrayList<>();
            this.f117755a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo112201a(C46065d dVar) {
            Boolean bool;
            if (dVar == null || TextUtils.isEmpty(dVar.f117727a)) {
                return false;
            }
            Boolean.valueOf(false);
            this.f117757c.lock();
            if (m144363c().booleanValue()) {
                bool = Boolean.valueOf(false);
            } else {
                this.f117758d.add(dVar);
                bool = Boolean.valueOf(true);
            }
            this.f117757c.unlock();
            return bool.booleanValue();
        }

        /* renamed from: b */
        public final C46065d mo112204b(String str) {
            C46065d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f117757c.lock();
            int i = 0;
            while (true) {
                if (i >= this.f117758d.size()) {
                    break;
                }
                C46065d dVar2 = (C46065d) this.f117758d.get(i);
                if (dVar2.f117727a.equals(str)) {
                    dVar = dVar2;
                    break;
                }
                i++;
            }
            this.f117757c.unlock();
            return dVar;
        }

        /* renamed from: c */
        public final C46065d mo112205c(String str) {
            C46065d dVar = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f117757c.lock();
            int i = 0;
            while (true) {
                if (i >= this.f117758d.size()) {
                    break;
                }
                C46065d dVar2 = (C46065d) this.f117758d.get(i);
                if (dVar2.f117727a.equals(str)) {
                    dVar = dVar2;
                    break;
                }
                i++;
            }
            if (dVar != null) {
                this.f117758d.remove(dVar);
            }
            this.f117757c.unlock();
            return dVar;
        }

        /* renamed from: a */
        public final boolean mo112202a(String str) {
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(false);
            this.f117757c.lock();
            while (true) {
                if (i >= this.f117758d.size()) {
                    break;
                } else if (((C46065d) this.f117758d.get(i)).f117727a.equals(str)) {
                    valueOf = Boolean.valueOf(true);
                    break;
                } else {
                    i++;
                }
            }
            this.f117757c.unlock();
            return valueOf.booleanValue();
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$g */
    static class C46069g {

        /* renamed from: a */
        public static C46059d f117759a = new C46059d();
    }

    /* renamed from: com.ss.ttvideoengine.d$h */
    class C46070h implements C46071i {

        /* renamed from: b */
        private final WeakReference<C46059d> f117761b;

        /* renamed from: a */
        public final void mo112206a(C46065d dVar) {
            C46059d dVar2 = (C46059d) this.f117761b.get();
            if (dVar2 != null && dVar != null) {
                if (!(dVar.f117730d == null || dVar.f117736j == null || dVar.f117736j.f118691q == null)) {
                    new C46140l(4).f118061e = dVar.f117730d;
                    dVar.f117733g = dVar.f117736j.f118676b;
                }
                if (!(dVar == null || dVar.f117736j == null || dVar.f117736j.f118689o == null)) {
                    dVar.f117733g = dVar.f117736j.f118676b;
                }
                if (dVar.f117736j != null && !dVar.f117736j.f118684j) {
                    dVar2.mo112163a(dVar);
                }
                if (dVar.f117731e != null) {
                    if (dVar2.f117696a != null) {
                        dVar2.f117696a.mo105046a(dVar.f117728b, 1, dVar.f117731e);
                    }
                    if (!(dVar.f117736j == null || dVar.f117736j.f118691q == null)) {
                        new C46140l(3).f118060d = dVar.f117731e;
                    }
                }
            }
        }

        public C46070h(C46059d dVar) {
            this.f117761b = new WeakReference<>(dVar);
        }
    }

    /* renamed from: com.ss.ttvideoengine.d$i */
    interface C46071i {
        /* renamed from: a */
        void mo112206a(C46065d dVar);
    }

    /* renamed from: a */
    public static C46059d m144301a() {
        return C46069g.f117759a;
    }

    /* renamed from: a */
    public final void mo112166a(C46075e eVar) {
        this.f117712r.lock();
        try {
            this.f117696a = eVar;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo112162a(Context context) {
        this.f117712r.lock();
        try {
            this.f117706l = context;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo112170a(String str) {
        if (!TextUtils.isEmpty(str) && this.f117704j != null) {
            this.f117712r.lock();
            try {
                this.f117704j.makeFileAutoDeleteFlag(str, 1);
            } finally {
                this.f117712r.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void mo112171a(String str, C46160o oVar) {
        if (!f117695b && this.f117699e != 0) {
            throw new AssertionError();
        } else if (this.f117699e == 0) {
            if (oVar == null || TextUtils.isEmpty(oVar.f118675a)) {
                C46123h.m144545a("DataLoaderHelper", "videoId invalid.");
                return;
            }
            C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("addTask key is %s; videoId = %s", new Object[]{str, oVar.f118675a}));
            this.f117712r.lock();
            try {
                m144306a(str, oVar.f118675a, oVar.f118677c, oVar, (C46163r) null, (C46159n) null);
            } finally {
                this.f117712r.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void mo112168a(C46160o oVar) {
        if (oVar == null || this.f117699e != 0) {
            return;
        }
        if (TextUtils.isEmpty(oVar.f118675a)) {
            C46123h.m144545a("DataLoaderHelper", "videoId invalid.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(oVar.f118675a);
        sb.append("_");
        sb.append(oVar.f118676b.toString(0));
        sb.append(oVar.f118679e);
        sb.append(oVar.f118680f);
        String sb2 = sb.toString();
        this.f117712r.lock();
        try {
            m144306a(sb2, oVar.f118675a, oVar.f118677c, oVar, (C46163r) null, (C46159n) null);
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo112167a(C46159n nVar) {
        if (nVar == null) {
            C46123h.m144545a("DataLoaderHelper", "url item invalid");
        }
        this.f117712r.lock();
        try {
            m144306a(nVar.f118667a, nVar.f118669c, nVar.f118670d, (C46160o) null, (C46163r) null, nVar);
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo112174a(String str, String str2, C46083h hVar, Resolution resolution, long j) {
        C46163r rVar = new C46163r(hVar, resolution, j, null);
        mo112169a(rVar);
    }

    /* renamed from: a */
    public final void mo112164a(C46083h hVar, Resolution resolution, long j) {
        mo112165a(hVar, resolution, null, j);
    }

    /* renamed from: a */
    public final void mo112165a(C46083h hVar, Resolution resolution, Map<Integer, String> map, long j) {
        C46163r rVar = new C46163r(hVar, resolution, j, null);
        rVar.f118696e = map;
        mo112169a(rVar);
    }

    /* renamed from: a */
    public final void mo112169a(C46163r rVar) {
        if (rVar == null || rVar.f118692a == null || rVar.f118693b == null) {
            C46123h.m144545a("DataLoaderHelper", "addTask videoModel input invalid");
            return;
        }
        C46082g a = rVar.f118692a.mo112227a(rVar.f118693b, true);
        String b = a != null ? a.mo112220b(15) : null;
        if (TextUtils.isEmpty(b)) {
            C46123h.m144545a("DataLoaderHelper", "key invalid.");
            return;
        }
        String b2 = rVar.f118692a.mo112235b(2);
        if (TextUtils.isEmpty(b2)) {
            C46123h.m144545a("DataLoaderHelper", "videoId invalid.");
            return;
        }
        this.f117712r.lock();
        try {
            m144306a(b, b2, rVar.f118694c, (C46160o) null, rVar, (C46159n) null);
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    public final void mo112175a(String str, String str2, String str3, long j) {
        if (TextUtils.isEmpty(str3)) {
            C46123h.m144545a("DataLoaderHelper", "url invalid.");
            return;
        }
        C46159n nVar = new C46159n(str, str2, j, new String[]{str3});
        mo112167a(nVar);
    }

    /* renamed from: a */
    public final void mo112176a(String str, String str2, String[] strArr, long j) {
        if (strArr == null || strArr.length == 0) {
            C46123h.m144545a("DataLoaderHelper", "urls invalid.");
            return;
        }
        C46159n nVar = new C46159n(str, str2, j, strArr);
        mo112167a(nVar);
    }

    /* renamed from: a */
    public final void mo112173a(String str, String str2, long j, String str3) {
        if (TextUtils.isEmpty(str)) {
            C46123h.m144545a("DataLoaderHelper", "url invalid.");
            return;
        }
        mo112177a(new String[]{str}, str2, j, str3);
    }

    /* renamed from: a */
    public final void mo112177a(String[] strArr, String str, long j, String str2) {
        if (!f117695b && this.f117699e != 0) {
            throw new AssertionError();
        } else if (strArr == null || strArr.length == 0) {
            C46123h.m144545a("DataLoaderHelper", "urls invalid.");
        } else {
            this.f117712r.lock();
            try {
                String a = C46122g.m144524a(this.f117706l, str2);
                C46159n nVar = new C46159n(str, j, strArr, str2);
                nVar.f118667a = a;
                mo112167a(nVar);
            } finally {
                this.f117712r.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void mo112172a(String str, String str2, long j, C46087f fVar) {
        if (fVar == null) {
            C46123h.m144545a("DataLoaderHelper", "provider invalid.");
            return;
        }
        C46159n nVar = new C46159n(str, str2, j, fVar);
        mo112167a(nVar);
    }

    /* renamed from: a */
    public final void mo112158a(int i, int i2) {
        this.f117712r.lock();
        if (i == 30) {
            this.f117705k.mEncryptVersion = i2;
        } else if (i == 50) {
            this.f117705k.mIsCloseFileCache = i2;
        } else if (i == 55) {
            this.f117705k.mMaxCacheAge = i2;
        } else if (i != 80) {
            switch (i) {
                case 1:
                    this.f117705k.mMaxCacheSize = i2;
                    break;
                case 2:
                    this.f117705k.mRWTimeOut = i2;
                    break;
                case 3:
                    this.f117705k.mOpenTimeOut = i2;
                    break;
                case 4:
                    this.f117705k.mTryCount = i2;
                    break;
                case 5:
                    this.f117705k.mLoaderType = i2;
                    break;
                default:
                    switch (i) {
                        case 7:
                            this.f117705k.mEnableExternDNS = i2;
                            break;
                        case 8:
                            this.f117705k.mEnableSocketReuse = i2;
                            break;
                        case 9:
                            this.f117705k.mSocketIdleTimeOut = i2;
                            break;
                        default:
                            switch (i) {
                                case 11:
                                    this.f117705k.mPreloadParallelNum = i2;
                                    break;
                                case 12:
                                    this.f117705k.mPreloadStrategy = i2;
                                    break;
                                case 13:
                                    this.f117705k.mCheckSumLevel = i2;
                                    break;
                                case 14:
                                    this.f117705k.mTestSpeedTypeVersion = i2;
                                    break;
                                case 15:
                                    this.f117711q = i2;
                                    break;
                                case 16:
                                    this.f117705k.mLoaderFactoryP2PLevel = i2;
                                    break;
                                default:
                                    switch (i) {
                                        case 60:
                                            this.f117705k.mEnablePreloadReUse = i2;
                                            break;
                                        case BaseNotice.TCM /*61*/:
                                            this.f117713s = i2;
                                            break;
                                        default:
                                            switch (i) {
                                                case 63:
                                                    this.f117705k.mMaxIpCountEachDomain = i2;
                                                    break;
                                                case 64:
                                                    this.f117705k.mEnableIpBucket = i2;
                                                    break;
                                                case 65:
                                                    this.f117705k.mErrorStateTrustTime = i2;
                                                    break;
                                                case 66:
                                                    this.f117705k.mOnlyUseCdn = i2;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 90:
                                                            this.f117705k.mDNSMainType = i2;
                                                            AVMDLDNSParser.setIntValue(0, i2);
                                                            break;
                                                        case 91:
                                                            this.f117705k.mDNSBackType = i2;
                                                            AVMDLDNSParser.setIntValue(1, i2);
                                                            break;
                                                        case 92:
                                                            this.f117705k.mMainToBackUpDelayedTime = i2;
                                                            AVMDLDNSParser.setIntValue(3, i2);
                                                            break;
                                                        case 93:
                                                            this.f117705k.mEnableBenchMarkIOSpeed = i2;
                                                            break;
                                                        case 94:
                                                            try {
                                                                this.f117705k.mSpeedCoefficientValue = i2;
                                                                break;
                                                            } catch (Exception unused) {
                                                                break;
                                                            } catch (Throwable th) {
                                                                this.f117712r.unlock();
                                                                throw th;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            this.f117705k.mPreloadWaitListType = i2;
        }
        this.f117712r.unlock();
    }

    /* renamed from: a */
    public final void mo112159a(int i, long j) {
        this.f117712r.lock();
        if (this.f117704j == null) {
            this.f117712r.unlock();
            return;
        }
        try {
            this.f117704j.setLongValue(1100, j);
        } catch (Exception unused) {
            String str = "DataLoaderHelper";
            StringBuilder sb = new StringBuilder("setLongValue failed, key: ");
            sb.append(62);
            sb.append(", value: ");
            sb.append(j);
            C46123h.m144547c(str, sb.toString());
        } catch (Throwable th) {
            this.f117712r.unlock();
            throw th;
        }
        this.f117712r.unlock();
    }

    /* renamed from: a */
    public final void mo112161a(int i, String str, long j) {
        if (this.f117699e != 0) {
            C46123h.m144545a("DataLoaderHelper", "dataloader not started, not allow set play info");
            return;
        }
        this.f117712r.lock();
        int i2 = -1;
        switch (i) {
            case 22:
                i2 = 7210;
                break;
            case 23:
                i2 = 7211;
                break;
            case 24:
                i2 = 7212;
                break;
            case 25:
                i2 = 7213;
                break;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                i2 = 7214;
                break;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                i2 = 7215;
                break;
        }
        try {
            this.f117704j.setInt64ValueByStrKey(i2, str, j);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f117712r.unlock();
            throw th;
        }
        this.f117712r.unlock();
    }

    /* renamed from: a */
    public final void mo112160a(int i, String str) {
        this.f117712r.lock();
        if (i == 0) {
            try {
                this.f117705k.mCacheDir = str;
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
        this.f117712r.unlock();
    }

    /* renamed from: a */
    public final String mo112155a(int i) {
        this.f117712r.lock();
        if (i == 0) {
            String str = this.f117705k.mCacheDir;
            this.f117712r.unlock();
            return str;
        } else if (i == 6) {
            try {
                if (this.f117709o == null && this.f117704j != null) {
                    this.f117709o = this.f117704j.getStringValue(11);
                }
                String str2 = this.f117709o;
                this.f117712r.unlock();
                return str2;
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
        this.f117712r.unlock();
        return null;
    }

    /* renamed from: a */
    public final String mo112156a(String str, String str2, long j, String[] strArr, Resolution resolution, String str3, C46082g gVar, String str4, String str5) {
        String str6 = str;
        String[] strArr2 = strArr;
        if (this.f117699e != 0 || TextUtils.isEmpty(str) || strArr2 == null || strArr2.length <= 0) {
            return null;
        }
        for (int i = 0; i < strArr2.length; i++) {
            if (!m144314o(strArr2[i])) {
                return strArr2[i];
            }
        }
        if (this.f117704j == null) {
            C46123h.m144545a("DataLoaderHelper", "start mdl first");
            return null;
        }
        this.f117712r.lock();
        try {
            String localAddr = this.f117704j.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            String a = m144303a(str, str2, j, strArr, str4, str5);
            if (TextUtils.isEmpty(a)) {
                this.f117712r.unlock();
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(a);
            String stringBuffer2 = stringBuffer.toString();
            this.f117712r.unlock();
            this.f117702h.mo112205c(str);
            C46065d dVar = new C46065d();
            dVar.f117727a = str6;
            dVar.f117728b = str2;
            dVar.f117729c = stringBuffer2;
            dVar.f117733g = resolution;
            dVar.f117738l = str3;
            dVar.f117739m = gVar;
            this.f117702h.mo112201a(dVar);
            return stringBuffer2;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: a */
    private static String[] m144308a(String[] strArr) {
        if (strArr == null || strArr.length <= 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            Boolean valueOf = Boolean.valueOf(true);
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((String) arrayList.get(size)).equals(str)) {
                    valueOf = Boolean.valueOf(false);
                    break;
                } else {
                    size--;
                }
            }
            if (valueOf.booleanValue()) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    /* renamed from: a */
    public final void mo112163a(C46065d dVar) {
        if (dVar == null) {
            m144312k();
        } else if (this.f117704j == null) {
            C46123h.m144545a("DataLoaderHelper", "need load mdl first.");
        } else {
            Map<Integer, String> map = null;
            if (!(dVar.f117736j == null || dVar.f117736j.f118683i == null)) {
                map = dVar.f117736j.f118683i;
            }
            if (!(dVar.f117740n == null || dVar.f117740n.f118696e == null)) {
                map = dVar.f117740n.f118696e;
            }
            this.f117701g.mo112205c(dVar.f117727a);
            if (dVar.f117730d != null) {
                ArrayList arrayList = new ArrayList();
                if (!dVar.f117730d.mo112231a()) {
                    C46082g a = dVar.f117730d.mo112226a(dVar.f117733g, map, true);
                    if (a != null) {
                        arrayList.add(a);
                        m144305a(a, dVar);
                    }
                } else if (dVar.f117730d.mo112242f().equals("segment_base")) {
                    C46082g a2 = dVar.f117730d.mo112225a(dVar.f117733g, C46084i.f117863a, map, true);
                    if (a2 != null) {
                        arrayList.add(a2);
                        m144305a(a2, dVar);
                    }
                    C46082g a3 = dVar.f117730d.mo112225a(dVar.f117733g, C46084i.f117864b, map, true);
                    if (a3 != null) {
                        arrayList.add(a3);
                        m144305a(a3, dVar);
                    }
                }
                if (arrayList.size() == 0) {
                    C46123h.m144545a("DataLoaderHelper", "invalid videoModel");
                    m144312k();
                    return;
                } else if (dVar.f117736j != null && dVar.f117736j.f118691q != null) {
                    new C46140l(1).f118058b = arrayList;
                } else if (!(dVar.f117740n == null || dVar.f117740n.f118699h == null)) {
                    new C46140l(1).f118058b = arrayList;
                }
            } else if (dVar.f117741o != null && dVar.f117741o.f118672f != null && dVar.f117741o.f118672f.length > 0) {
                String str = dVar.f117727a;
                String[] strArr = dVar.f117741o.f118672f;
                dVar.f117729c = m144304a(str, dVar.f117728b, 0, strArr, dVar.f117741o.f118668b, null, dVar.f117741o.f118671e);
                if (!TextUtils.isEmpty(dVar.f117729c)) {
                    this.f117704j.preloadResource(dVar.f117729c, (int) dVar.f117732f);
                    this.f117703i.mo112205c(str);
                    this.f117703i.mo112201a(dVar);
                    C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("exect preload task ,key is %s; videoId = %s", new Object[]{dVar.f117727a, dVar.f117728b}));
                }
            } else if (!(dVar.f117741o == null || dVar.f117741o.f118673g == null)) {
                String str2 = dVar.f117727a;
                dVar.f117729c = m144302a(str2, dVar.f117728b, 1);
                if (!TextUtils.isEmpty(dVar.f117729c)) {
                    this.f117704j.preloadResource(dVar.f117729c, (int) dVar.f117732f);
                    this.f117703i.mo112205c(str2);
                    this.f117703i.mo112201a(dVar);
                }
                C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{dVar.f117727a, dVar.f117728b, dVar.f117729c}));
            }
            m144312k();
        }
    }

    /* renamed from: h */
    private boolean m144309h() {
        if (this.f117698d == null) {
            return true;
        }
        if (this.f117698d != null && !this.f117697c) {
            this.f117697c = this.f117698d.mo112285a("avmdl");
        }
        return this.f117697c;
    }

    /* renamed from: c */
    public final boolean mo112181c() {
        boolean z;
        this.f117712r.lock();
        try {
            if (this.f117699e == 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: j */
    private void m144311j() {
        this.f117704j.cancelAll();
        C46065d b = this.f117701g.mo112203b();
        while (b != null) {
            if (b.f117734h != null) {
                b.f117734h.mo112143a();
            }
            b = this.f117701g.mo112203b();
        }
        do {
        } while (this.f117700f.mo112203b() != null);
    }

    private C46059d() {
        this.f117699e = 1;
        this.f117700f = new C46068f();
        this.f117701g = new C46068f();
        this.f117702h = new C46068f();
        this.f117703i = new C46068f();
        this.f117704j = null;
        this.f117705k = null;
        this.f117706l = null;
        this.f117707m = null;
        this.f117708n = null;
        this.f117709o = null;
        this.f117710p = null;
        this.f117711q = 0;
        this.f117712r = new ReentrantLock();
        this.f117713s = 0;
        this.f117707m = C46036ad.m144236a();
        this.f117699e = 1;
        this.f117705k = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    /* renamed from: d */
    public final void mo112183d() {
        this.f117712r.lock();
        try {
            if (this.f117699e == 1) {
                C46123h.m144547c("DataLoaderHelper", "DataLoader not started, not need close");
                return;
            }
            this.f117696a = null;
            this.f117704j.close();
            m144311j();
            this.f117699e = 1;
            this.f117712r.unlock();
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: e */
    public final void mo112185e() {
        this.f117712r.lock();
        try {
            if (this.f117704j == null) {
                this.f117712r.unlock();
                return;
            }
            this.f117704j.clearNetinfoCache();
            this.f117712r.unlock();
        } catch (Throwable th) {
            this.f117712r.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo112187f() {
        if (!f117695b && this.f117699e != 0) {
            throw new AssertionError();
        } else if (this.f117704j == null || this.f117699e != 0) {
            C46123h.m144545a("DataLoaderHelper", "need start mdl first");
        } else {
            this.f117712r.lock();
            try {
                m144311j();
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
            this.f117712r.unlock();
        }
    }

    /* renamed from: g */
    public final void mo112189g() {
        if (this.f117699e == 0) {
            this.f117712r.lock();
            try {
                if (this.f117704j == null) {
                    C46123h.m144545a("DataLoaderHelper", "mInnerDataLoader == null");
                    this.f117712r.unlock();
                    return;
                }
                this.f117704j.clearAllCaches();
                this.f117712r.unlock();
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
    }

    /* renamed from: i */
    private boolean m144310i() {
        boolean z;
        boolean z2;
        if (this.f117704j != null) {
            return true;
        }
        if (!m144309h()) {
            C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("library load fail", new Object[0]));
            return false;
        }
        if (this.f117698d != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f117711q != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (AVMDLDataLoader.init(z, z2) != 0) {
            C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("library has not been loaded", new Object[0]));
            return false;
        }
        C46123h.m144547c("P2PLIB", C1642a.m8034a("loadertype:%d NeedDLLoadP2PLib:%d", new Object[]{Integer.valueOf(this.f117705k.mLoaderType), Integer.valueOf(this.f117711q)}));
        if (this.f117711q == 0 && this.f117705k.mLoaderType > 0 && this.f117696a != null) {
            C46123h.m144547c("P2PLIB", "try to load p2p lib");
            C46123h.m144547c("P2PLIB", C1642a.m8034a("load p2p lib result:%d", new Object[]{Integer.valueOf(this.f117696a.mo105048b("avmdlp2p") ? 1 : 0)}));
        }
        try {
            this.f117704j = new AVMDLDataLoader(this.f117705k);
            this.f117704j.setListener(this);
            this.f117710p = new C46063c();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:10|(1:12)|13|14|15|(1:17)|18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(1:32)|33|34|(3:36|37|38)(3:39|40|41)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0 A[SYNTHETIC, Splitter:B:39:0x00b0] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112178b() throws java.lang.Exception {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f117712r
            r0.lock()
            int r0 = r3.f117699e     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "DataLoader has started not need start"
            com.p280ss.ttvideoengine.p1816i.C46123h.m144547c(r0, r1)     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.locks.ReentrantLock r0 = r3.f117712r
            r0.unlock()
            return
        L_0x0016:
            boolean r0 = r3.m144310i()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            com.ss.ttvideoengine.d$f r0 = r3.f117701g     // Catch:{ all -> 0x00c0 }
            r1 = 4
            r0.f117755a = r1     // Catch:{ all -> 0x00c0 }
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r3.f117705k     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x002c
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = com.p280ss.mediakit.medialoader.AVMDLDataLoaderConfigure.getDefaultonfigure()     // Catch:{ all -> 0x00c0 }
            r3.f117705k = r0     // Catch:{ all -> 0x00c0 }
        L_0x002c:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00c0 }
            r0.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = com.p280ss.ttvideoengine.C46029a.f117584d     // Catch:{ JSONException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0088 }
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "app_channel"
            java.lang.String r2 = com.p280ss.ttvideoengine.C46029a.f117584d     // Catch:{ JSONException -> 0x0088 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
        L_0x0040:
            java.lang.String r1 = com.p280ss.ttvideoengine.C46029a.f117583c     // Catch:{ JSONException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0088 }
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = "app_name"
            java.lang.String r2 = com.p280ss.ttvideoengine.C46029a.f117583c     // Catch:{ JSONException -> 0x0088 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
        L_0x004f:
            java.lang.String r1 = com.p280ss.ttvideoengine.C46029a.f117586f     // Catch:{ JSONException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0088 }
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = "device_id"
            java.lang.String r2 = com.p280ss.ttvideoengine.C46029a.f117586f     // Catch:{ JSONException -> 0x0088 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
        L_0x005e:
            java.lang.String r1 = com.p280ss.ttvideoengine.C46029a.f117585e     // Catch:{ JSONException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0088 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "app_version"
            java.lang.String r2 = com.p280ss.ttvideoengine.C46029a.f117585e     // Catch:{ JSONException -> 0x0088 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
        L_0x006d:
            int r1 = com.p280ss.ttvideoengine.C46029a.f117582b     // Catch:{ JSONException -> 0x0088 }
            if (r1 < 0) goto L_0x0078
            java.lang.String r1 = "app_id"
            int r2 = com.p280ss.ttvideoengine.C46029a.f117582b     // Catch:{ JSONException -> 0x0088 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0088 }
        L_0x0078:
            java.lang.String r1 = "app_id"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0088 }
            if (r1 == 0) goto L_0x0088
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r1 = r3.f117705k     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0088 }
            r1.mAppInfo = r0     // Catch:{ JSONException -> 0x0088 }
        L_0x0088:
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r3.f117704j     // Catch:{ all -> 0x00c0 }
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r1 = r3.f117705k     // Catch:{ all -> 0x00c0 }
            r0.setConfigure(r1)     // Catch:{ all -> 0x00c0 }
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r3.f117704j     // Catch:{ all -> 0x00c0 }
            int r0 = r0.start()     // Catch:{ all -> 0x00c0 }
            if (r0 < 0) goto L_0x00b0
            com.ss.ttvideoengine.d$c r0 = r3.f117710p     // Catch:{ all -> 0x00c0 }
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r3.f117704j     // Catch:{ all -> 0x00c0 }
            int r2 = r3.f117713s     // Catch:{ all -> 0x00c0 }
            r0.mo112196a(r1, r2)     // Catch:{ all -> 0x00c0 }
            r0 = 0
            r3.f117699e = r0     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "DataLoaderHelper"
            java.lang.String r1 = "DataLoader start."
            com.p280ss.ttvideoengine.p1816i.C46123h.m144547c(r0, r1)     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.locks.ReentrantLock r0 = r3.f117712r
            r0.unlock()
            return
        L_0x00b0:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "start data loader fail"
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00b8:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "init data loader fail"
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r3.f117712r
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.C46059d.mo112178b():void");
    }

    /* renamed from: k */
    private void m144312k() {
        String str;
        String str2;
        C46037a a;
        if (this.f117704j == null) {
            C46123h.m144545a("DataLoaderHelper", "need load mdl first.");
            return;
        }
        C46065d a2 = this.f117700f.mo112200a();
        if (a2 != null && this.f117701g.mo112201a(a2)) {
            this.f117700f.mo112203b();
            if (a2.f117730d == null && a2.f117741o == null) {
                HashMap hashMap = new HashMap();
                if (a2.f117736j != null && a2.f117736j.f118679e) {
                    hashMap.put("codec_type", "1");
                }
                if (a2.f117736j != null && a2.f117736j.f118680f) {
                    hashMap.put("format_type", "dash");
                }
                if (a2.f117736j != null && a2.f117736j.f118681g) {
                    hashMap.put("ssl", "1");
                }
                if (a2.f117736j == null || a2.f117736j.f118688n == null) {
                    str2 = null;
                    str = null;
                } else {
                    str2 = a2.f117736j.f118688n.mo112468a(hashMap, a2.f117728b, a2.f117736j.f118678d);
                    str = a2.f117736j.f118688n.mo112467a(a2.f117728b, a2.f117736j.f118678d);
                    a2.f117737k = str2;
                }
                if (this.f117696a != null && TextUtils.isEmpty(a2.f117737k)) {
                    a2.f117737k = null;
                    str2 = null;
                    str = null;
                }
                synchronized (C46160o.class) {
                    a = this.f117707m.mo112121a(a2.f117728b, str2);
                }
                if (a == null || a.f117601c) {
                    if (a2.f117736j != null) {
                        a2.f117734h = new C46050b(this.f117706l, a2.f117736j.f118687m);
                        a2.mo112198a();
                        a2.f117734h.f117667f = a2.f117736j.f118686l;
                        a2.f117734h.f117668g = a2.f117736j.f118675a;
                        a2.f117734h.mo112147a(true);
                        a2.f117734h.mo112145a(str2, str, a2.f117736j.f118678d);
                    }
                    return;
                }
                a2.f117730d = a.f117599a;
                C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("get videoModel ,key is %s; videoId = %s", new Object[]{a2.f117727a, a2.f117728b}));
                mo112163a(a2);
                return;
            }
            mo112163a(a2);
        }
    }

    /* renamed from: c */
    public final long mo112180c(String str) {
        return mo112194l(str);
    }

    /* renamed from: h */
    public final void mo112190h(String str) {
        mo112191i(C46122g.m144524a(this.f117706l, str));
    }

    public String getCheckSumInfo(String str) {
        try {
            if (this.f117696a == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f117696a.mo105042a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final C46061a mo112195m(String str) {
        C46062b e = mo112184e(str);
        if (e == null) {
            return null;
        }
        C46061a aVar = new C46061a();
        aVar.f117715b = e.f117718a;
        aVar.f117716c = e.f117719b;
        aVar.f117714a = e.f117720c;
        return aVar;
    }

    /* renamed from: b */
    public final void mo112179b(String str) {
        if (!TextUtils.isEmpty(str) && this.f117704j != null) {
            this.f117712r.lock();
            try {
                this.f117704j.makeFileAutoDeleteFlag(str, 0);
            } finally {
                this.f117712r.unlock();
            }
        }
    }

    /* renamed from: d */
    public final String mo112182d(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f117712r.lock();
        try {
            if (this.f117704j != null) {
                str2 = this.f117704j.getStringValueByStr(str, 1010);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f117712r.unlock();
            throw th;
        }
        this.f117712r.unlock();
        return str2;
    }

    /* renamed from: e */
    public final C46062b mo112184e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f117712r.lock();
        try {
            if (this.f117704j != null) {
                if (this.f117699e == 0) {
                    C46062b n = m144313n(this.f117704j.getStringCacheInfo(str));
                    this.f117712r.unlock();
                    return n;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: f */
    public final C46062b mo112186f(String str) {
        this.f117712r.lock();
        try {
            if (this.f117704j == null) {
                return null;
            }
            C46062b n = m144313n(this.f117704j.getStringCacheInfo(C46122g.m144524a(this.f117706l, str), str));
            this.f117712r.unlock();
            return n;
        } catch (Throwable unused) {
            return null;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: g */
    public final long mo112188g(String str) {
        this.f117712r.lock();
        long j = 0;
        try {
            if (this.f117704j == null) {
                return 0;
            }
            long cacheSize = this.f117704j.getCacheSize(C46122g.m144524a(this.f117706l, str), str);
            if (cacheSize > 0) {
                j = cacheSize;
            }
            this.f117712r.unlock();
            return j;
        } catch (Throwable unused) {
            return 0;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo112193k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f117712r.lock();
            try {
                if (this.f117704j == null) {
                    C46123h.m144545a("DataLoaderHelper", "mInnerDataLoader == null");
                    this.f117712r.unlock();
                    return;
                }
                this.f117704j.forceRemoveFileCache(str);
                this.f117712r.unlock();
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final long mo112194l(String str) {
        long j = 0;
        if (this.f117699e != 0) {
            return 0;
        }
        this.f117712r.lock();
        try {
            if (this.f117704j == null) {
                return 0;
            }
            long cacheSize = this.f117704j.getCacheSize(str);
            if (cacheSize > 0) {
                j = cacheSize;
            }
            this.f117712r.unlock();
            return j;
        } catch (Throwable unused) {
            return 0;
        } finally {
            this.f117712r.unlock();
        }
    }

    /* renamed from: n */
    private C46062b m144313n(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        C46062b bVar = new C46062b();
        bVar.f117720c = split[3];
        if (!TextUtils.isEmpty(split[0])) {
            bVar.f117719b = Long.valueOf(split[0]).longValue();
        }
        if (!TextUtils.isEmpty(split[1])) {
            bVar.f117718a = Long.valueOf(split[1]).longValue();
        }
        C46123h.m144545a("DataLoaderHelper", "get cache info.");
        return bVar;
    }

    /* renamed from: o */
    private static boolean m144314o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://127.0.0.1") || lowerCase.startsWith("http://localhost") || lowerCase.startsWith("file://") || lowerCase.startsWith("/") || lowerCase.endsWith(".mpd") || lowerCase.contains(".mpd?") || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo112191i(String str) {
        if (!f117695b && this.f117699e != 0) {
            throw new AssertionError();
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f117704j == null || this.f117699e != 0) {
                C46123h.m144545a("DataLoaderHelper", "need start mdl first");
                return;
            }
            this.f117712r.lock();
            try {
                this.f117704j.cancel(str);
                this.f117703i.mo112205c(str);
                C46065d c = this.f117701g.mo112205c(str);
                if (c == null) {
                    c = this.f117700f.mo112205c(str);
                }
                if (c == null) {
                    this.f117712r.unlock();
                    return;
                }
                if (c.f117734h != null) {
                    c.f117734h.mo112143a();
                }
                this.f117712r.unlock();
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final void mo112192j(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f117712r.lock();
            try {
                if (this.f117704j == null) {
                    C46123h.m144545a("DataLoaderHelper", "mInnerDataLoader == null");
                    this.f117712r.unlock();
                    return;
                }
                this.f117704j.removeFileCache(str);
                this.f117712r.unlock();
            } catch (Throwable th) {
                this.f117712r.unlock();
                throw th;
            }
        }
    }

    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null) {
            switch (aVMDLDataLoaderNotifyInfo.what) {
                case 0:
                    if (this.f117696a != null) {
                        this.f117696a.mo105044a(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    break;
                case 1:
                    if (this.f117696a != null) {
                        this.f117696a.mo105044a(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    break;
                case 2:
                    if (this.f117696a != null) {
                        this.f117696a.mo105043a(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    break;
                case 3:
                    C46067e a = m144300a(aVMDLDataLoaderNotifyInfo.logInfo, false);
                    if (!(this.f117696a == null || a == null)) {
                        this.f117696a.mo105045a(a);
                    }
                    return;
                case 4:
                    StringBuilder sb = new StringBuilder("log = ");
                    sb.append(aVMDLDataLoaderNotifyInfo.logInfo);
                    sb.append("code = ");
                    sb.append((int) aVMDLDataLoaderNotifyInfo.code);
                    C46123h.m144545a("DataLoaderHelper", sb.toString());
                    C46067e a2 = m144300a(aVMDLDataLoaderNotifyInfo.logInfo, true);
                    if (!(this.f117696a == null || a2 == null)) {
                        this.f117696a.mo105045a(a2);
                    }
                    return;
                case 5:
                    if (this.f117696a != null) {
                        this.f117696a.mo105043a(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                        return;
                    }
                    break;
                case 6:
                    try {
                        JSONObject a3 = C46114a.m144500a(aVMDLDataLoaderNotifyInfo.jsonLog);
                        if (a3 != null) {
                            this.f117696a.mo105047a(a3);
                            C46123h.m144545a("avmdlcdnlog", C1642a.m8034a("receive log %s json:%s", new Object[]{a3, aVMDLDataLoaderNotifyInfo.jsonLog.toString()}));
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 7:
                    if (this.f117696a != null) {
                        this.f117696a.mo105044a(3, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                    }
                    StringBuilder sb2 = new StringBuilder("heart beat msg: ");
                    sb2.append(aVMDLDataLoaderNotifyInfo.logInfo);
                    C46123h.m144545a("DataLoaderHelper", sb2.toString());
                    return;
                case 8:
                    if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                        StringBuilder sb3 = new StringBuilder("log = ");
                        sb3.append(aVMDLDataLoaderNotifyInfo.logInfo);
                        sb3.append("code = ");
                        sb3.append(aVMDLDataLoaderNotifyInfo.code);
                        sb3.append("logtype = ");
                        sb3.append(aVMDLDataLoaderNotifyInfo.parameter);
                        C46123h.m144545a("DataLoaderHelper", sb3.toString());
                        String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                        if (split.length > 0) {
                            String str = split[0];
                            C46065d b = this.f117703i.mo112204b(str);
                            if (b != null && aVMDLDataLoaderNotifyInfo.code == -1002) {
                                this.f117703i.mo112205c(str);
                                if (this.f117696a != null) {
                                    C46067e eVar = new C46067e();
                                    eVar.f117753i = 2;
                                    eVar.f117745a = b.f117727a;
                                    if (!(b.f117741o == null || b.f117741o.f118668b == null)) {
                                        eVar.f117747c = b.f117741o.f118668b;
                                        eVar.f117745a = null;
                                    }
                                    eVar.f117746b = b.f117728b;
                                    this.f117696a.mo105045a(eVar);
                                    break;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private static String[] m144307a(C46065d dVar, String[] strArr) {
        boolean z;
        if (dVar.f117736j != null) {
            z = dVar.f117736j.f118682h;
        } else if (dVar.f117740n != null) {
            z = dVar.f117740n.f118695d;
        } else {
            z = false;
        }
        if (!z) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = C46122g.m144527a(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    /* renamed from: a */
    private C46067e m144300a(String str, boolean z) {
        C46068f fVar;
        C46065d dVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        try {
            long longValue = Long.valueOf(split[0]).longValue();
            long longValue2 = Long.valueOf(split[1]).longValue();
            if (longValue2 <= 0 && !z) {
                return null;
            }
            String str2 = split[2];
            String str3 = split[3];
            C46067e eVar = new C46067e();
            eVar.f117749e = longValue;
            eVar.f117748d = longValue2;
            eVar.f117745a = str2;
            eVar.f117747c = str3;
            if (z) {
                dVar = this.f117703i.mo112204b(str2);
                if (dVar == null) {
                    return null;
                }
                fVar = this.f117703i;
                eVar.f117753i = 2;
            } else {
                dVar = this.f117702h.mo112204b(str2);
                if (dVar == null) {
                    return null;
                }
                fVar = this.f117702h;
                eVar.f117753i = 1;
            }
            if (dVar == null) {
                return null;
            }
            eVar.f117746b = dVar.f117728b;
            eVar.f117750f = dVar.f117733g;
            eVar.f117751g = dVar.f117738l;
            eVar.f117752h = dVar.f117739m;
            if (longValue2 == longValue) {
                fVar.mo112205c(str2);
            }
            if (fVar == this.f117703i && longValue >= dVar.f117732f) {
                fVar.mo112205c(str2);
            }
            if (dVar.f117736j != null && dVar.f117736j.f118691q != null && fVar == this.f117703i) {
                new C46140l(2).f118059c = eVar;
            } else if (dVar.f117740n != null && dVar.f117740n.f118699h != null && fVar == this.f117703i) {
                new C46140l(2).f118059c = eVar;
            } else if (!(dVar.f117741o == null || dVar.f117741o.f118674h == null || fVar != this.f117703i)) {
                new C46140l(2).f118059c = eVar;
            }
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m144305a(com.p280ss.ttvideoengine.p1812e.C46082g r12, com.p280ss.ttvideoengine.C46059d.C46065d r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0153
            if (r13 != 0) goto L_0x0006
            goto L_0x0153
        L_0x0006:
            com.ss.ttvideoengine.o r0 = r13.f117736j
            r1 = 0
            if (r0 == 0) goto L_0x0011
            com.ss.ttvideoengine.o r0 = r13.f117736j
            int r0 = r0.f118685k
        L_0x000f:
            r10 = r0
            goto L_0x001b
        L_0x0011:
            com.ss.ttvideoengine.r r0 = r13.f117740n
            if (r0 == 0) goto L_0x001a
            com.ss.ttvideoengine.r r0 = r13.f117740n
            int r0 = r0.f118697f
            goto L_0x000f
        L_0x001a:
            r10 = 0
        L_0x001b:
            r0 = 16
            java.lang.String[] r0 = r12.mo112221c(r0)
            r2 = 15
            java.lang.String r2 = r12.mo112220b(r2)
            if (r0 == 0) goto L_0x014b
            int r3 = r0.length
            if (r3 > 0) goto L_0x002e
            goto L_0x014b
        L_0x002e:
            java.lang.String[] r7 = m144307a(r13, r0)
            com.ss.ttvideoengine.o r0 = r13.f117736j
            r3 = 0
            if (r0 == 0) goto L_0x0069
            com.ss.ttvideoengine.o r0 = r13.f117736j
            com.ss.ttvideoengine.m r0 = r0.f118690p
            if (r0 == 0) goto L_0x0069
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0069
            com.ss.ttvideoengine.o r0 = r13.f117736j
            com.ss.ttvideoengine.m r0 = r0.f118690p
            java.lang.String r4 = r13.f117728b
            java.lang.String r0 = r0.mo112466a(r4, r12)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0059
            boolean r4 = r0.contains(r2)
            if (r4 != 0) goto L_0x005a
        L_0x0059:
            r0 = r3
        L_0x005a:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0066
            android.content.Context r2 = r11.f117706l
            java.lang.String r2 = com.p280ss.ttvideoengine.p1816i.C46122g.m144524a(r2, r0)
        L_0x0066:
            r8 = r0
            r0 = r2
            goto L_0x009f
        L_0x0069:
            com.ss.ttvideoengine.r r0 = r13.f117740n
            if (r0 == 0) goto L_0x009d
            com.ss.ttvideoengine.r r0 = r13.f117740n
            com.ss.ttvideoengine.m r0 = r0.f118698g
            if (r0 == 0) goto L_0x009d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x009d
            com.ss.ttvideoengine.r r0 = r13.f117740n
            com.ss.ttvideoengine.m r0 = r0.f118698g
            java.lang.String r4 = r13.f117728b
            java.lang.String r0 = r0.mo112466a(r4, r12)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x008f
            boolean r4 = r0.contains(r2)
            if (r4 != 0) goto L_0x0090
        L_0x008f:
            r0 = r3
        L_0x0090:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0066
            android.content.Context r2 = r11.f117706l
            java.lang.String r2 = com.p280ss.ttvideoengine.p1816i.C46122g.m144524a(r2, r0)
            goto L_0x0066
        L_0x009d:
            r0 = r2
            r8 = r3
        L_0x009f:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 28
            java.lang.String r3 = r12.mo112220b(r3)
            if (r3 != 0) goto L_0x00ae
            java.lang.String r3 = ""
        L_0x00ae:
            r4 = 29
            java.lang.String r4 = r12.mo112220b(r4)
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = ""
        L_0x00b8:
            r5 = 3
            int r5 = r12.mo112216a(r5)
            java.lang.String r6 = "fileId="
            r2.append(r6)
            r2.append(r3)
            java.lang.String r3 = "&bitrate="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "&pcrc="
            r2.append(r3)
            java.lang.String r3 = com.p280ss.ttvideoengine.p1816i.C46122g.m144541h(r4)
            r2.append(r3)
            java.lang.String r4 = r13.f117728b
            r5 = 0
            java.lang.String r9 = r2.toString()
            r2 = r11
            r3 = r0
            java.lang.String r2 = r2.m144304a(r3, r4, r5, r7, r8, r9, r10)
            r13.f117729c = r2
            java.lang.String r2 = r13.f117729c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x014a
            com.ss.mediakit.medialoader.AVMDLDataLoader r2 = r11.f117704j
            java.lang.String r3 = r13.f117729c
            long r4 = r13.f117732f
            int r4 = (int) r4
            r2.preloadResource(r3, r4)
            r13.f117739m = r12
            r2 = 5
            java.lang.String r2 = r12.mo112220b(r2)
            r13.f117738l = r2
            r13.f117727a = r0
            com.ss.ttvideoengine.d$d r2 = new com.ss.ttvideoengine.d$d
            r2.<init>()
            r2.f117727a = r0
            java.lang.String r3 = r13.f117728b
            r2.f117728b = r3
            long r3 = r13.f117732f
            r2.f117732f = r3
            com.ss.ttvideoengine.Resolution r12 = r12.f117830b
            r2.f117733g = r12
            java.lang.String r12 = r13.f117738l
            r2.f117738l = r12
            com.ss.ttvideoengine.e.g r12 = r13.f117739m
            r2.f117739m = r12
            com.ss.ttvideoengine.o r12 = r13.f117736j
            r2.f117736j = r12
            com.ss.ttvideoengine.r r12 = r13.f117740n
            r2.f117740n = r12
            com.ss.ttvideoengine.d$f r12 = r11.f117703i
            r12.mo112205c(r0)
            com.ss.ttvideoengine.d$f r12 = r11.f117703i
            r12.mo112201a(r2)
            java.lang.String r12 = "DataLoaderHelper"
            java.lang.String r0 = "exect preload task ,key is %s; videoId = %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r13.f117727a
            r2[r1] = r3
            r1 = 1
            java.lang.String r13 = r13.f117728b
            r2[r1] = r13
            java.lang.String r13 = com.C1642a.m8034a(r0, r2)
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r12, r13)
        L_0x014a:
            return
        L_0x014b:
            java.lang.String r12 = "DataLoaderHelper"
            java.lang.String r13 = "urls info invalid"
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r12, r13)
            return
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.C46059d.m144305a(com.ss.ttvideoengine.e.g, com.ss.ttvideoengine.d$d):void");
    }

    /* renamed from: a */
    private static String m144302a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String h = C46122g.m144541h(str);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String h2 = C46122g.m144541h(str2);
        if (!TextUtils.isEmpty(h2)) {
            str = h2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(h);
        stringBuffer.append("&pv=");
        stringBuffer.append(1);
        return stringBuffer.toString();
    }

    public String getStringValue(int i, long j, String str) {
        C46065d dVar;
        if (i != 1506) {
            return null;
        }
        if (this.f117703i != null) {
            dVar = this.f117703i.mo112204b(str);
        } else {
            dVar = null;
        }
        if (dVar == null || dVar.f117741o == null || dVar.f117741o.f118673g == null) {
            return null;
        }
        String b = dVar.f117741o.f118673g.mo105052b();
        String a = m144303a(b, b, 0, dVar.f117741o.f118673g.mo105051a(), (String) null, (String) null);
        C46123h.m144545a("DataLoaderHelper", C1642a.m8034a("get proxxy url from url: %s", new Object[]{a}));
        return a;
    }

    /* renamed from: a */
    public final String mo112157a(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return mo112156a(str, str2, 0, strArr, resolution, str3, null, null, null);
    }

    /* renamed from: a */
    private String m144303a(String str, String str2, long j, String[] strArr, String str3, String str4) {
        return m144304a(str, str2, j, strArr, str3, str4, 0);
    }

    /* renamed from: a */
    private void m144306a(String str, String str2, long j, C46160o oVar, C46163r rVar, C46159n nVar) {
        if (TextUtils.isEmpty(str)) {
            C46123h.m144545a("DataLoaderHelper", "key invalid.");
        } else if (this.f117704j == null || this.f117699e != 0) {
            C46123h.m144545a("DataLoaderHelper", "need load mdl first.");
        } else if (!this.f117701g.mo112202a(str) && !this.f117700f.mo112202a(str)) {
            Resolution resolution = Resolution.Undefine;
            if (oVar != null && oVar.f118676b != null) {
                resolution = oVar.f118676b;
            } else if (!(rVar == null || rVar.f118693b == null)) {
                resolution = rVar.f118693b;
            }
            C46065d dVar = new C46065d();
            dVar.mo112199a(str, resolution, j);
            dVar.f117728b = str2;
            dVar.f117736j = oVar;
            dVar.f117740n = rVar;
            dVar.f117741o = nVar;
            if (rVar != null) {
                dVar.f117730d = rVar.f118692a;
            }
            if (dVar.f117736j != null) {
                dVar.f117735i = new C46070h(this);
            }
            this.f117700f.mo112201a(dVar);
            m144312k();
        }
    }

    /* renamed from: a */
    private String m144304a(String str, String str2, long j, String[] strArr, String str3, String str4, int i) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        if (j <= 0) {
            j = 0;
        }
        for (String o : strArr) {
            if (!m144314o(o)) {
                return null;
            }
        }
        String[] a = m144308a(strArr);
        String h = C46122g.m144541h(str);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        String h2 = C46122g.m144541h(str);
        if (TextUtils.isEmpty(h2)) {
            h2 = "videoId";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(h2);
        stringBuffer.append("&k=");
        stringBuffer.append(h);
        if (j > 0) {
            stringBuffer.append("&s=");
            stringBuffer.append(j);
        }
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            String h3 = C46122g.m144541h(str3);
            if (!TextUtils.isEmpty(h3)) {
                stringBuffer.append("&p=");
                stringBuffer.append(h3);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i2 = 0; i2 < a.length; i2++) {
            String h4 = C46122g.m144541h(a[i2]);
            StringBuffer stringBuffer3 = new StringBuffer();
            if (!TextUtils.isEmpty(h4)) {
                stringBuffer3.append("&u");
                stringBuffer3.append(i2);
                stringBuffer3.append("=");
                stringBuffer3.append(h4);
            }
            if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                break;
            }
            stringBuffer2.append(stringBuffer3);
        }
        if (stringBuffer2.length() <= 0) {
            return null;
        }
        stringBuffer.append(stringBuffer2);
        if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
            stringBuffer.append("&");
            stringBuffer.append(str4);
        }
        return stringBuffer.toString();
    }
}
