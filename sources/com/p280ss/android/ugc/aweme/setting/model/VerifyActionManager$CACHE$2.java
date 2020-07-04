package com.p280ss.android.ugc.aweme.setting.model;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyActionManager$CACHE$2 */
final class VerifyActionManager$CACHE$2 extends Lambda implements C7561a<IVerifyActionCache> {
    public static final VerifyActionManager$CACHE$2 INSTANCE = new VerifyActionManager$CACHE$2();

    VerifyActionManager$CACHE$2() {
        super(0);
    }

    public final IVerifyActionCache invoke() {
        return (IVerifyActionCache) C23336d.m76560a(AwemeApplication.m21341a(), IVerifyActionCache.class);
    }
}
