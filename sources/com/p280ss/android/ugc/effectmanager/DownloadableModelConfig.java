package com.p280ss.android.ugc.effectmanager;

import android.content.res.AssetManager;
import com.p280ss.android.ugc.effectmanager.C43681b.C43687a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.p280ss.android.ugc.effectmanager.p1725c.C43701a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig */
public final class DownloadableModelConfig {

    /* renamed from: a */
    public final AssetManager f113034a;

    /* renamed from: b */
    public final String f113035b;

    /* renamed from: c */
    public final C43720b f113036c;

    /* renamed from: d */
    public final List<Host> f113037d;

    /* renamed from: e */
    public final C43721c f113038e;

    /* renamed from: f */
    public final Executor f113039f;

    /* renamed from: g */
    public final String f113040g;

    /* renamed from: h */
    public final String f113041h;

    /* renamed from: i */
    public final Pattern f113042i;

    /* renamed from: j */
    public final C43687a f113043j;

    /* renamed from: k */
    public final C43834g f113044k;

    /* renamed from: l */
    public final ModelFileEnv f113045l;

    /* renamed from: m */
    public final String f113046m;

    /* renamed from: n */
    public final String f113047n;

    /* renamed from: o */
    public final C43722d f113048o;

    /* renamed from: p */
    public final FetchModelType f113049p;

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig$ModelFileEnv */
    public enum ModelFileEnv {
        TEST,
        ONLINE
    }

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig$a */
    public static final class C43678a {

        /* renamed from: a */
        AssetManager f113050a;

        /* renamed from: b */
        String f113051b;

        /* renamed from: c */
        C43720b f113052c;

        /* renamed from: d */
        List<Host> f113053d = new ArrayList();

        /* renamed from: e */
        C43721c f113054e;

        /* renamed from: f */
        Executor f113055f;

        /* renamed from: g */
        String f113056g;

        /* renamed from: h */
        String f113057h;

        /* renamed from: i */
        String f113058i;

        /* renamed from: j */
        String f113059j;

        /* renamed from: k */
        C43722d f113060k;

        /* renamed from: l */
        Pattern f113061l;

        /* renamed from: m */
        C43687a f113062m;

        /* renamed from: n */
        ModelFileEnv f113063n;

        /* renamed from: o */
        FetchModelType f113064o;

        /* renamed from: p */
        C43834g f113065p;

        /* renamed from: a */
        public final C43678a mo105666a(Executor executor) {
            this.f113055f = executor;
            return this;
        }

        /* renamed from: a */
        public final DownloadableModelConfig mo105667a() {
            return new DownloadableModelConfig(this);
        }

        /* renamed from: a */
        public final C43678a mo105656a(AssetManager assetManager) {
            this.f113050a = assetManager;
            return this;
        }

        /* renamed from: b */
        public final C43678a mo105668b(String str) {
            this.f113056g = str;
            return this;
        }

        /* renamed from: c */
        public final C43678a mo105669c(String str) {
            this.f113057h = str;
            return this;
        }

        /* renamed from: d */
        public final C43678a mo105670d(String str) {
            this.f113058i = str;
            return this;
        }

        /* renamed from: e */
        public final C43678a mo105671e(String str) {
            this.f113059j = str;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105657a(ModelFileEnv modelFileEnv) {
            this.f113063n = modelFileEnv;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105658a(FetchModelType fetchModelType) {
            this.f113064o = fetchModelType;
            return this;
        }

        /* renamed from: f */
        public final C43678a mo105672f(String str) {
            if (str == null) {
                this.f113061l = null;
            } else {
                this.f113061l = Pattern.compile(str);
            }
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105659a(C43687a aVar) {
            this.f113062m = aVar;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105660a(C43720b bVar) {
            this.f113052c = bVar;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105661a(C43721c cVar) {
            this.f113054e = cVar;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105662a(C43722d dVar) {
            this.f113060k = dVar;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105663a(C43834g gVar) {
            this.f113065p = gVar;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105664a(String str) {
            this.f113051b = str;
            return this;
        }

        /* renamed from: a */
        public final C43678a mo105665a(List<Host> list) {
            this.f113053d.addAll(list);
            return this;
        }
    }

    private DownloadableModelConfig(C43678a aVar) {
        ModelFileEnv modelFileEnv;
        FetchModelType fetchModelType;
        this.f113034a = (AssetManager) C43701a.m138484a(aVar.f113050a);
        this.f113035b = (String) C43701a.m138484a(aVar.f113051b);
        this.f113036c = (C43720b) C43701a.m138484a(aVar.f113052c);
        this.f113037d = Collections.unmodifiableList(aVar.f113053d);
        this.f113038e = (C43721c) C43701a.m138484a(aVar.f113054e);
        this.f113039f = (Executor) C43701a.m138484a(aVar.f113055f);
        this.f113040g = (String) C43701a.m138484a(aVar.f113056g);
        this.f113041h = (String) C43701a.m138484a(aVar.f113057h);
        this.f113046m = (String) C43701a.m138484a(aVar.f113058i);
        this.f113047n = (String) C43701a.m138484a(aVar.f113059j);
        this.f113048o = aVar.f113060k;
        this.f113042i = aVar.f113061l;
        this.f113043j = aVar.f113062m;
        if (aVar.f113063n == null) {
            modelFileEnv = ModelFileEnv.ONLINE;
        } else {
            modelFileEnv = aVar.f113063n;
        }
        this.f113045l = modelFileEnv;
        if (aVar.f113064o == null) {
            fetchModelType = FetchModelType.ORIGIN;
        } else {
            fetchModelType = aVar.f113064o;
        }
        this.f113049p = fetchModelType;
        this.f113044k = aVar.f113065p;
    }
}
