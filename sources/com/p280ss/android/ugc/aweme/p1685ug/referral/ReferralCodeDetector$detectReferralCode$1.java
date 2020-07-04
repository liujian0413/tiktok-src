package com.p280ss.android.ugc.aweme.p1685ug.referral;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.ReferralCodeDetector$detectReferralCode$1 */
public final class ReferralCodeDetector$detectReferralCode$1 implements LegoTask {
    final /* synthetic */ ClipboardManager $cm;
    final /* synthetic */ WeakReference $weakRef;

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        String a = C42740a.m135670a(this.$cm);
        if (!TextUtils.isEmpty(a) && C7634n.m23721b(a, "TT", false)) {
            C42740a.m135673a(this.$weakRef, a);
        }
    }

    ReferralCodeDetector$detectReferralCode$1(ClipboardManager clipboardManager, WeakReference weakReference) {
        this.$cm = clipboardManager;
        this.$weakRef = weakReference;
    }
}
