package com.p280ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel.C6904a;
import kotlin.jvm.internal.C7573i;

@C6381a(mo15284a = "aweme_ad_rank")
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.AwemeAdRankAb */
public final class AwemeAdRankAb {
    @C6382b(mo15285a = true)
    private static final AwemeAdRankAbModel DISABLE = C6904a.m21508a();
    @C6382b
    private static final AwemeAdRankAbModel ENABLE = C6904a.m21509b();
    public static final AwemeAdRankAb INSTANCE = new AwemeAdRankAb();
    @C6382b
    private static final AwemeAdRankAbModel TEST_ONLY = C6904a.m21510c();

    private AwemeAdRankAb() {
    }

    public final AwemeAdRankAbModel getDISABLE() {
        return DISABLE;
    }

    public final AwemeAdRankAbModel getENABLE() {
        return ENABLE;
    }

    public final AwemeAdRankAbModel getTEST_ONLY() {
        return TEST_ONLY;
    }

    public static final AwemeAdRankAbModel get() {
        try {
            Object a = C6384b.m19835a().mo15290a(AwemeAdRankAb.class, true, "aweme_ad_rank", (Object) C6384b.m19835a().mo15295d().aweme_ad_rank, AwemeAdRankAbModel.class);
            C7573i.m23582a(a, "ABManager.getInstance().…wemeAdRankAb::class.java)");
            return (AwemeAdRankAbModel) a;
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}
