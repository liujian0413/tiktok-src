package com.p280ss.android.ugc.aweme.shortvideo.publish;

import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.g */
public final class C40241g {

    /* renamed from: a */
    public static final C40241g f104572a = new C40241g();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.g$a */
    static final class C40242a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ boolean f104573a;

        C40242a(boolean z) {
            this.f104573a = z;
        }

        public final /* synthetic */ Object call() {
            m128588a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m128588a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                String str2 = "zipUrlIsNull";
                if (this.f104573a) {
                    str = "0";
                } else {
                    str = "1";
                }
                jSONObject.put(str2, str);
                C6379c.m19823a("hash_tag_zip_url", 0, C6869c.m21382a(jSONObject).mo16888b());
            } catch (Exception unused) {
            }
        }
    }

    private C40241g() {
    }

    /* renamed from: a */
    public static void m128587a(boolean z) {
        if (C35563c.f93231M.mo93306b(Property.RecommentMusicByAIPolicy) != 0) {
            C1592h.m7855a((Callable<TResult>) new C40242a<TResult>(z), (Executor) C6907h.m21516a());
        }
    }
}
