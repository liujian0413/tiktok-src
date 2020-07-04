package com.p280ss.android.ugc.aweme.video.local;

import android.os.SystemClock;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.video.local.c */
public final class C43252c {

    /* renamed from: e */
    public static final C43253a f111974e = new C43253a(null);

    /* renamed from: a */
    public final HashMap<String, LocalVideoUrlModel> f111975a = new HashMap<>();

    /* renamed from: b */
    public final List<String> f111976b = new ArrayList();

    /* renamed from: c */
    public long f111977c;

    /* renamed from: d */
    public final List<LocalVideoUrlModel> f111978d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$a */
    public static final class C43253a {
        private C43253a() {
        }

        public /* synthetic */ C43253a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$b */
    static final class C43254b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C43254b f111979a = new C43254b();

        C43254b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$c */
    static final class C43255c<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f111980a;

        C43255c(String str) {
            this.f111980a = str;
        }

        /* renamed from: a */
        private boolean m137236a() {
            return C7276d.m22816c(this.f111980a);
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m137236a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$d */
    static final class C43256d<TTaskResult, TContinuationResult> implements C1591g<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C43252c f111981a;

        /* renamed from: b */
        final /* synthetic */ String f111982b;

        /* renamed from: c */
        final /* synthetic */ C7561a f111983c;

        /* renamed from: d */
        final /* synthetic */ String f111984d;

        C43256d(C43252c cVar, String str, C7561a aVar, String str2) {
            this.f111981a = cVar;
            this.f111982b = str;
            this.f111983c = aVar;
            this.f111984d = str2;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m137237a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m137237a(C1592h<Boolean> hVar) {
            this.f111981a.f111976b.remove(this.f111982b);
            this.f111983c.invoke();
            StringBuilder sb = new StringBuilder("LocalVideoCache=>delete video cache,filePath:");
            sb.append(this.f111984d);
            C41530am.m132280a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$e */
    static final class C43257e<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C43252c f111985a;

        /* renamed from: b */
        final /* synthetic */ LocalVideoUrlModel f111986b;

        C43257e(C43252c cVar, LocalVideoUrlModel localVideoUrlModel) {
            this.f111985a = cVar;
            this.f111986b = localVideoUrlModel;
        }

        public final /* synthetic */ Object call() {
            m137238a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m137238a() {
            boolean z;
            if (this.f111985a.mo105009b(this.f111986b)) {
                C43252c cVar = this.f111985a;
                String sourceId = this.f111986b.getSourceId();
                C7573i.m23582a((Object) sourceId, "model.sourceId");
                cVar.m137226a(sourceId, this.f111986b.localPath, C43254b.f111979a);
                return;
            }
            LocalVideoUrlModel localVideoUrlModel = this.f111986b;
            if (TextUtils.isEmpty(this.f111986b.localPath) || TextUtils.isEmpty(this.f111986b.getSourceId())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                localVideoUrlModel = null;
            }
            if (localVideoUrlModel != null) {
                File file = new File(this.f111986b.localPath);
                if (file.exists()) {
                    Map map = this.f111985a.f111975a;
                    String sourceId2 = this.f111986b.getSourceId();
                    C7573i.m23582a((Object) sourceId2, "model.sourceId");
                    map.put(sourceId2, this.f111986b);
                    this.f111985a.f111978d.add(this.f111986b);
                    this.f111985a.f111977c += file.length();
                    StringBuilder sb = new StringBuilder("LocalVideoCache=>add cache,fileSize:");
                    sb.append(file.length());
                    sb.append(",totalSize:");
                    sb.append(this.f111985a.f111977c);
                    sb.append(",filePath:");
                    sb.append(file.getPath());
                    C41530am.m132280a(sb.toString());
                }
            }
            this.f111985a.mo105004a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$f */
    static final class C43258f<T> implements Comparator<LocalVideoUrlModel> {

        /* renamed from: a */
        public static final C43258f f111987a = new C43258f();

        C43258f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m137239a((LocalVideoUrlModel) obj, (LocalVideoUrlModel) obj2);
        }

        /* renamed from: a */
        private static int m137239a(LocalVideoUrlModel localVideoUrlModel, LocalVideoUrlModel localVideoUrlModel2) {
            C7573i.m23582a((Object) localVideoUrlModel, "o1");
            long createTime = localVideoUrlModel.getCreateTime();
            C7573i.m23582a((Object) localVideoUrlModel2, "o2");
            if (createTime == localVideoUrlModel2.getCreateTime()) {
                return 0;
            }
            if (localVideoUrlModel.getCreateTime() > localVideoUrlModel2.getCreateTime()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$g */
    static final class C43259g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ LocalVideoUrlModel f111988a;

        /* renamed from: b */
        final /* synthetic */ C43252c f111989b;

        /* renamed from: c */
        final /* synthetic */ String f111990c;

        C43259g(LocalVideoUrlModel localVideoUrlModel, C43252c cVar, String str) {
            this.f111988a = localVideoUrlModel;
            this.f111989b = cVar;
            this.f111990c = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m137240a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m137240a() {
            this.f111989b.f111975a.remove(this.f111990c);
            this.f111989b.f111978d.remove(this.f111988a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.c$h */
    static final class C43260h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ LocalVideoUrlModel f111991a;

        /* renamed from: b */
        final /* synthetic */ C43252c f111992b;

        C43260h(LocalVideoUrlModel localVideoUrlModel, C43252c cVar) {
            this.f111991a = localVideoUrlModel;
            this.f111992b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m137241a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m137241a() {
            this.f111992b.f111978d.remove(this.f111991a);
            this.f111992b.f111975a.remove(this.f111991a.getSourceId());
        }
    }

    /* renamed from: b */
    private static int m137227b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            return a.getLocalVideoCacheMaxAge().intValue() * 60 * 1000;
        } catch (NullValueException unused) {
            return 259200000;
        }
    }

    /* renamed from: c */
    private static int m137228c() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            return a.getLocalVideoCacheMaxLength().intValue() * PreloadTask.BYTE_UNIT_NUMBER * PreloadTask.BYTE_UNIT_NUMBER;
        } catch (NullValueException unused) {
            return 157286400;
        }
    }

    /* renamed from: a */
    public final void mo105004a() {
        if (m137228c() != 0 && this.f111977c > ((long) m137228c())) {
            mo105007a(this.f111977c - ((long) m137228c()));
        }
    }

    /* renamed from: a */
    public final LocalVideoUrlModel mo105003a(String str) {
        C7573i.m23587b(str, "sourceId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (LocalVideoUrlModel) this.f111975a.get(str);
    }

    /* renamed from: b */
    public final LocalVideoUrlModel mo105008b(String str) {
        C7573i.m23587b(str, "sourceId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) this.f111975a.get(str);
        if (localVideoUrlModel == null) {
            return null;
        }
        C7573i.m23582a((Object) localVideoUrlModel, "model");
        String sourceId = localVideoUrlModel.getSourceId();
        C7573i.m23582a((Object) sourceId, "model.sourceId");
        this.f111977c -= m137226a(sourceId, localVideoUrlModel.localPath, new C43259g(localVideoUrlModel, this, str));
        return localVideoUrlModel;
    }

    /* renamed from: b */
    public final boolean mo105009b(LocalVideoUrlModel localVideoUrlModel) {
        if (localVideoUrlModel == null || SystemClock.elapsedRealtime() - localVideoUrlModel.getCreateTime() > ((long) m137227b()) || TextUtils.isEmpty(localVideoUrlModel.localPath) || !new File(localVideoUrlModel.localPath).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo105005a(LocalVideoUrlModel localVideoUrlModel) {
        C7573i.m23587b(localVideoUrlModel, "model");
        if (localVideoUrlModel.getSourceId() != null) {
            C1592h.m7855a((Callable<TResult>) new C43257e<TResult>(this, localVideoUrlModel), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo105006a(Collection<? extends LocalVideoUrlModel> collection) {
        C7573i.m23587b(collection, "cacheList");
        for (LocalVideoUrlModel a : C7525m.m23494a((Iterable<? extends T>) collection, (Comparator<? super T>) C43258f.f111987a)) {
            mo105005a(a);
        }
    }

    /* renamed from: a */
    public final boolean mo105007a(long j) {
        long j2;
        List<LocalVideoUrlModel> arrayList = new ArrayList<>();
        long j3 = 0;
        int i = 0;
        while (j3 < j && i < this.f111978d.size()) {
            int i2 = i + 1;
            LocalVideoUrlModel localVideoUrlModel = (LocalVideoUrlModel) this.f111978d.get(i);
            File file = new File(localVideoUrlModel.localPath);
            if (file.exists()) {
                j2 = file.length();
            } else {
                j2 = 0;
            }
            arrayList.add(localVideoUrlModel);
            j3 += j2;
            this.f111977c -= j2;
            i = i2;
        }
        for (LocalVideoUrlModel localVideoUrlModel2 : arrayList) {
            String sourceId = localVideoUrlModel2.getSourceId();
            C7573i.m23582a((Object) sourceId, "model.sourceId");
            m137226a(sourceId, localVideoUrlModel2.localPath, new C43260h(localVideoUrlModel2, this));
        }
        if (this.f111977c > j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final long m137226a(String str, String str2, C7561a<C7581n> aVar) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || this.f111976b.contains(str)) {
            return 0;
        }
        File file = new File(str2);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        this.f111976b.add(str);
        C1592h.m7855a((Callable<TResult>) new C43255c<TResult>(str2), (Executor) C7258h.m22730c()).mo6876a((C1591g<TResult, TContinuationResult>) new C43256d<TResult,TContinuationResult>(this, str, aVar, str2), C1592h.f5958b);
        return length;
    }
}
