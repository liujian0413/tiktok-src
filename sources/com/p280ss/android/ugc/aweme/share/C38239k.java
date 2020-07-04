package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.share.k */
public final class C38239k extends C38028e {

    /* renamed from: k */
    public final Activity f99396k;

    /* renamed from: com.ss.android.ugc.aweme.share.k$a */
    static final class C38240a extends Lambda implements C7562b<C38343b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38239k f99397a;

        C38240a(C38239k kVar) {
            this.f99397a = kVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m122176a((C38343b) obj));
        }

        /* renamed from: a */
        private boolean m122176a(C38343b bVar) {
            C7573i.m23587b(bVar, "it");
            if (!bVar.mo95743a(this.f99397a.f99396k)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.k$b */
    public static final class C38241b implements C38379c {

        /* renamed from: a */
        final /* synthetic */ C38239k f99398a;

        C38241b(C38239k kVar) {
            this.f99398a = kVar;
        }

        /* renamed from: a */
        public final void mo63024a(C38343b bVar) {
            boolean z;
            C7573i.m23587b(bVar, "channel");
            SharePackage sharePackage = this.f99398a.f98991g.f99636i;
            Activity activity = this.f99398a.f98986b;
            C7573i.m23582a((Object) activity, "mContext");
            if (!sharePackage.mo18861a(bVar, (Context) activity)) {
                C38354f a = this.f99398a.f98991g.f99636i.mo18860a(bVar);
                Activity activity2 = this.f99398a.f98986b;
                C7573i.m23582a((Object) activity2, "mContext");
                z = bVar.mo71406a(a, (Context) activity2);
            } else {
                z = true;
            }
            C38386d dVar = this.f99398a.f98991g.f99639l;
            if (dVar != null) {
                SharePackage sharePackage2 = this.f99398a.f98991g.f99636i;
                Activity activity3 = this.f99398a.f98986b;
                C7573i.m23582a((Object) activity3, "mContext");
                dVar.mo67216a(bVar, z, sharePackage2, activity3);
            }
            this.f99398a.dismiss();
        }
    }

    /* renamed from: d */
    private final void m122175d() {
        if (this.f98991g.f99631d) {
            C7525m.m23480a(this.f98991g.f99628a, (C7562b<? super T, Boolean>) new C38240a<Object,Boolean>(this));
        }
        this.f98993i.mo95948a(this.f98991g.f99628a);
        this.f98993i.mo95947a((C38379c) new C38241b(this));
    }

    public C38239k(Activity activity, C38380c cVar) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(cVar, "config");
        super(activity, cVar);
        this.f99396k = activity;
        m122175d();
    }
}
