package com.p280ss.android.ugc.aweme.ttuploader;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.ttuploader.api.UploadApi.C42631a;
import com.p280ss.android.ugc.aweme.ttuploader.model.C42648a;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.g */
public final class C42645g {

    /* renamed from: c */
    public static final C42646a f110822c = new C42646a(null);

    /* renamed from: a */
    public final String f110823a;

    /* renamed from: b */
    public final C42630a f110824b;

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.g$a */
    public static final class C42646a {
        private C42646a() {
        }

        public /* synthetic */ C42646a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.g$b */
    static final class C42647b<T> implements C7326g<C42648a> {

        /* renamed from: a */
        final /* synthetic */ C42645g f110825a;

        C42647b(C42645g gVar) {
            this.f110825a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C42648a aVar) {
            try {
                Keva.getRepo("upload_authkey_config").storeString(this.f110825a.f110823a, C42996by.m136485a(aVar));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private final C7492s<C42648a> m135460a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f110824b.f110796a != -1) {
            linkedHashMap.put("aweme_type", String.valueOf(this.f110824b.f110796a));
        }
        C7492s<C42648a> a = C42631a.m135443a().refreshUploadConfig(linkedHashMap).mo19304b(C7333a.m23044b()).mo19289a((C7326g<? super T>) new C42647b<Object>(this));
        C7573i.m23582a((Object) a, "UploadApi.create().refre…)\n            }\n        }");
        return a;
    }

    public C42645g(C42630a aVar) {
        C7573i.m23587b(aVar, "requestParam");
        this.f110824b = aVar;
        StringBuilder sb = new StringBuilder("key_upload_config_");
        sb.append(this.f110824b.f110796a);
        this.f110823a = sb.toString();
    }

    /* renamed from: a */
    public final C7492s<C42648a> mo104252a(boolean z) {
        C7492s<C42648a> sVar;
        if (z) {
            try {
                return m135460a();
            } catch (Exception e) {
                C7492s<C42648a> a = C7492s.m23289a((Throwable) e);
                C7573i.m23582a((Object) a, "Observable.error<UploadAuthKeyConfig>(e)");
                return a;
            }
        } else {
            String string = Keva.getRepo("upload_authkey_config").getString(this.f110823a, "");
            if (!TextUtils.isEmpty(string)) {
                sVar = C7492s.m23301b((C42648a) C42996by.m136484a(string, C42648a.class));
            } else {
                sVar = m135460a();
            }
            C7573i.m23582a((Object) sVar, "if (!TextUtils.isEmpty(c…onfig()\n                }");
            return sVar;
        }
    }
}
