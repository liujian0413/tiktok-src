package com.p280ss.android.ugc.aweme.profile.presenter;

import android.net.Uri;
import android.net.Uri.Builder;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ag */
public final class C36007ag extends C25652b<C25640a<C36010ah>, C36045s> {

    /* renamed from: a */
    public final String f94195a;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ag$a */
    public static final class C36008a extends C25640a<C36010ah> {

        /* renamed from: a */
        final /* synthetic */ C36007ag f94196a;

        /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ag$a$a */
        static final class C36009a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ Builder f94197a;

            C36009a(Builder builder) {
                this.f94197a = builder;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C36010ah call() {
                return C35731g.m115440a(this.f94197a.toString());
            }
        }

        C36008a(C36007ag agVar) {
            this.f94196a = agVar;
        }

        public final boolean checkParams(Object... objArr) {
            C7573i.m23587b(objArr, "params");
            if (objArr.length == 1) {
                return true;
            }
            return false;
        }

        public final boolean sendRequest(Object... objArr) {
            C7573i.m23587b(objArr, "params");
            if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                return false;
            }
            String str = objArr[0];
            if (str != null) {
                String str2 = str;
                Builder buildUpon = Uri.parse(this.f94196a.f94195a).buildUpon();
                buildUpon.appendQueryParameter("id", str2);
                C23397p.m76735a().mo60807a(this.mHandler, new C36009a(buildUpon), 0);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: e */
    private void m115997e() {
        mo66536a(new C36008a(this));
    }

    public C36007ag() {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append("/aweme/v1/user/uniqueid");
        this.f94195a = sb.toString();
        m115997e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56977b() {
        /*
            r3 = this;
            super.mo56977b()
            com.ss.android.ugc.aweme.common.a r0 = r3.f67571b
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.profile.presenter.ah r0 = (com.p280ss.android.ugc.aweme.profile.presenter.C36010ah) r0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f94198a
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            com.ss.android.ugc.aweme.common.a r2 = r3.f67571b
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.profile.presenter.ah r2 = (com.p280ss.android.ugc.aweme.profile.presenter.C36010ah) r2
            if (r2 == 0) goto L_0x0022
            java.lang.String r1 = r2.f94199b
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.common.e r2 = r3.f67572c
            com.ss.android.ugc.aweme.profile.presenter.s r2 = (com.p280ss.android.ugc.aweme.profile.presenter.C36045s) r2
            r2.mo91735a(r0, r1)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36007ag.mo56977b():void");
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        ((C36045s) this.f67572c).mo91734a();
    }
}
