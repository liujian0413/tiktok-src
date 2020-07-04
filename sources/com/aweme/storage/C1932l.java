package com.aweme.storage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.aweme.storage.l */
class C1932l {

    /* renamed from: a */
    private static volatile StorageDatabase f6957a;

    C1932l() {
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.C1927j m8920a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.aweme.storage.StorageDatabase r1 = f6957a
            if (r1 != 0) goto L_0x0022
            java.lang.Class<com.aweme.storage.l> r1 = com.aweme.storage.C1932l.class
            monitor-enter(r1)
            java.lang.Class<com.aweme.storage.StorageDatabase> r2 = com.aweme.storage.StorageDatabase.class
            java.lang.String r3 = "storage_db"
            android.arch.persistence.room.RoomDatabase$a r4 = android.arch.persistence.room.C0160e.m441a(r4, r2, r3)     // Catch:{ Exception -> 0x001e }
            android.arch.persistence.room.RoomDatabase r4 = r4.mo322c()     // Catch:{ Exception -> 0x001e }
            com.aweme.storage.StorageDatabase r4 = (com.aweme.storage.StorageDatabase) r4     // Catch:{ Exception -> 0x001e }
            f6957a = r4     // Catch:{ Exception -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x0022
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r4
        L_0x0022:
            com.aweme.storage.StorageDatabase r4 = f6957a
            if (r4 == 0) goto L_0x002d
            com.aweme.storage.StorageDatabase r4 = f6957a
            com.aweme.storage.j r4 = r4.mo7527h()
            return r4
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C1932l.m8920a(android.content.Context):com.aweme.storage.j");
    }

    /* renamed from: a */
    static void m8921a(Context context, List<C1934m> list, int i) {
        if (context != null) {
            C1927j a = m8920a(context);
            if (a != null) {
                List<C1934m> a2 = a.mo7548a();
                ArrayList arrayList = new ArrayList();
                if (a2.size() > 0) {
                    C1934m[] mVarArr = new C1934m[a2.size()];
                    a2.toArray(mVarArr);
                    a.mo7550b(mVarArr);
                    for (C1934m mVar : a2) {
                        if (!(mVar == null || mVar.f6959b == null || !new File(mVar.f6959b).exists())) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= list.size()) {
                                    break;
                                }
                                C1934m mVar2 = (C1934m) list.get(i2);
                                if (mVar2 != null && mVar2.f6959b != null && mVar2.f6959b.equals(mVar.f6959b)) {
                                    mVar2.f6962e = mVar.f6962e + 1;
                                    mVar2.f6961d = mVar.f6961d;
                                    break;
                                }
                                i2++;
                            }
                            if (i2 >= list.size()) {
                                mVar.f6962e++;
                                arrayList.add(mVar);
                            }
                        }
                    }
                }
                list.addAll(arrayList);
                Collections.sort(list, new Comparator<C1934m>() {
                    /* renamed from: a */
                    private static int m8922a(C1934m mVar, C1934m mVar2) {
                        return mVar.mo7552a(mVar2);
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        return m8922a((C1934m) obj, (C1934m) obj2);
                    }
                });
                if (list.size() > i) {
                    list = list.subList(0, i);
                }
                C1934m[] mVarArr2 = new C1934m[list.size()];
                list.toArray(mVarArr2);
                a.mo7549a(mVarArr2);
            }
        }
    }
}
