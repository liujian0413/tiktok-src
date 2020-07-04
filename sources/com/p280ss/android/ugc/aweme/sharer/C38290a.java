package com.p280ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.sharer.C38343b.C38344a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.a */
public abstract class C38290a implements C38343b {
    /* renamed from: f */
    public float mo95747f() {
        return 0.34f;
    }

    /* renamed from: g */
    public boolean mo95748g() {
        return false;
    }

    /* renamed from: e */
    public int mo95742e() {
        return C38344a.m122503a(this);
    }

    /* renamed from: a */
    public boolean mo95743a(Context context) {
        C7573i.m23587b(context, "context");
        return C38344a.m122505a(this, context);
    }

    /* renamed from: a */
    public void mo95741a(RemoteImageView remoteImageView, boolean z) {
        C7573i.m23587b(remoteImageView, "imageView");
        C38344a.m122504a(this, remoteImageView, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo95934a(Context context, Intent intent) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(intent, "intent");
        if (context.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        if (fVar instanceof C38356g) {
            return mo95738a((C38356g) fVar, context);
        }
        if (fVar instanceof C38358i) {
            return mo95745a((C38358i) fVar, context);
        }
        if (fVar instanceof C38357h) {
            return mo95744a((C38357h) fVar, context);
        }
        if (fVar instanceof C38359j) {
            return mo95746a((C38359j) fVar, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public boolean mo95738a(C38356g gVar, Context context) {
        C7573i.m23587b(gVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        return mo95745a((C38358i) gVar, context);
    }
}
