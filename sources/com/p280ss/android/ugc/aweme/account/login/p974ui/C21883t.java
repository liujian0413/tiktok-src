package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.os.Bundle;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.account.util.C22349w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.t */
public final class C21883t {

    /* renamed from: a */
    private SparseArray<C21884a> f58584a = new SparseArray<>();

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.t$a */
    public static class C21884a {

        /* renamed from: a */
        public String f58585a;

        /* renamed from: b */
        public C22349w f58586b;

        /* renamed from: a */
        public final void mo58310a(Bundle bundle) {
            bundle.putString("phone_ticker_phone_number", this.f58585a);
            this.f58586b.mo58764a(bundle);
        }

        /* renamed from: b */
        public final void mo58311b(Bundle bundle) {
            this.f58585a = bundle.getString("phone_ticker_phone_number");
            this.f58586b.mo58767b(bundle);
        }

        public C21884a(String str, C22349w wVar) {
            this.f58585a = str;
            this.f58586b = wVar;
        }
    }

    /* renamed from: a */
    public final C22349w mo58305a(int i) {
        try {
            return ((C21884a) this.f58584a.get(i)).f58586b;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C21884a mo58308b(int i) {
        try {
            return (C21884a) this.f58584a.get(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58307a(Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.f58584a.size());
        for (int i = 0; i < this.f58584a.size(); i++) {
            if (this.f58584a.valueAt(i) != null) {
                Bundle bundle2 = new Bundle();
                ((C21884a) this.f58584a.valueAt(i)).mo58310a(bundle2);
                StringBuilder sb = new StringBuilder("ticker_");
                sb.append(this.f58584a.keyAt(i));
                bundle.putBundle(sb.toString(), bundle2);
                arrayList.add(Integer.valueOf(this.f58584a.keyAt(i)));
            }
        }
        if (arrayList.size() > 0) {
            bundle.putIntegerArrayList("ticker_types", arrayList);
        }
    }

    /* renamed from: b */
    public final void mo58309b(Bundle bundle) {
        ArrayList integerArrayList = bundle.getIntegerArrayList("ticker_types");
        if (integerArrayList != null) {
            Iterator it = integerArrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (this.f58584a.get(num.intValue()) != null) {
                    C21884a aVar = (C21884a) this.f58584a.get(num.intValue());
                    StringBuilder sb = new StringBuilder("ticker_");
                    sb.append(num);
                    aVar.mo58311b(bundle.getBundle(sb.toString()));
                } else {
                    C21884a aVar2 = new C21884a("", new C22349w(0, 0, null));
                    StringBuilder sb2 = new StringBuilder("ticker_");
                    sb2.append(num);
                    aVar2.mo58311b(bundle.getBundle(sb2.toString()));
                    this.f58584a.put(num.intValue(), aVar2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58306a(int r3, java.lang.String r4, long r5, int r7, com.p280ss.android.ugc.aweme.account.util.C22349w.C22350a r8) {
        /*
            r2 = this;
            android.util.SparseArray<com.ss.android.ugc.aweme.account.login.ui.t$a> r0 = r2.f58584a     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x001c }
            com.ss.android.ugc.aweme.account.login.ui.t$a r0 = (com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a) r0     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.f58585a     // Catch:{ Exception -> 0x001c }
            boolean r1 = android.text.TextUtils.equals(r1, r4)     // Catch:{ Exception -> 0x001c }
            if (r1 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.account.util.w r0 = r0.f58586b     // Catch:{ Exception -> 0x001c }
            goto L_0x001d
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.account.util.w r0 = r0.f58586b     // Catch:{ Exception -> 0x001c }
            r0.mo58762a()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.f59614c = r8
            return
        L_0x0022:
            com.ss.android.ugc.aweme.account.util.w r0 = new com.ss.android.ugc.aweme.account.util.w
            r0.<init>(r5, r7, r8)
            android.util.SparseArray<com.ss.android.ugc.aweme.account.login.ui.t$a> r5 = r2.f58584a
            com.ss.android.ugc.aweme.account.login.ui.t$a r6 = new com.ss.android.ugc.aweme.account.login.ui.t$a
            r6.<init>(r4, r0)
            r5.put(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.mo58306a(int, java.lang.String, long, int, com.ss.android.ugc.aweme.account.util.w$a):void");
    }
}
