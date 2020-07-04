package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.CleanDeletedAwemeDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.profile.util.n */
public final class C36743n {

    /* renamed from: a */
    public static final C36743n f96432a = new C36743n();

    private C36743n() {
    }

    /* renamed from: a */
    public static boolean m118430a(int i, boolean z) {
        if (C6399b.m19944t() || i != 1 || z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m118431b(int i, boolean z) {
        if (C6399b.m19944t() || i != 1 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m118428a(Context context, Aweme aweme, C7561a<C7581n> aVar) {
        C7573i.m23587b(context, "context");
        CleanDeletedAwemeDialog cleanDeletedAwemeDialog = new CleanDeletedAwemeDialog(context);
        cleanDeletedAwemeDialog.f96014c = aweme;
        cleanDeletedAwemeDialog.f96013b = aVar;
        cleanDeletedAwemeDialog.show();
    }

    /* renamed from: a */
    public final boolean mo93063a(C25674b<?> bVar, int i, boolean z) {
        C25673a aVar;
        if (bVar != null) {
            aVar = (C25673a) bVar.mo66539h();
        } else {
            aVar = null;
        }
        if (!(aVar instanceof C36018b)) {
            return false;
        }
        C25673a aVar2 = (C25673a) bVar.mo66539h();
        if (aVar2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.presenter.AwemeModel");
        } else if (!((C36018b) aVar2).mo91664b() || !m118430a(i, z)) {
            return false;
        } else {
            return true;
        }
    }
}
