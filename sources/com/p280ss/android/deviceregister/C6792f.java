package com.p280ss.android.deviceregister;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.deviceregister.p290b.p291a.C6784a;

/* renamed from: com.ss.android.deviceregister.f */
public class C6792f {

    /* renamed from: a */
    private static C6784a f19369a;

    /* renamed from: b */
    private static String f19370b;

    /* renamed from: c */
    private static AccountManager f19371c;

    /* renamed from: d */
    private static Account f19372d;

    /* renamed from: e */
    private static Account f19373e;

    /* renamed from: a */
    private static boolean m21101a() {
        if (TextUtils.isEmpty(f19370b)) {
            f19370b = C6781d.m20990f();
        }
        return "local_test".equals(f19370b);
    }

    /* renamed from: b */
    public static boolean m21102b(Context context) {
        if (context == null || !m21101a()) {
            return false;
        }
        if (f19372d == null) {
            f19372d = m21103c(context);
        }
        if (f19372d == null || f19371c == null) {
            return false;
        }
        return Boolean.valueOf(f19371c.getUserData(f19372d, "new_user")).booleanValue();
    }

    /* renamed from: c */
    private static Account m21103c(Context context) {
        Account account = null;
        try {
            f19371c = AccountManager.get(context);
            String packageName = context.getPackageName();
            String string = context.getString(context.getApplicationInfo().labelRes);
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(packageName)) {
                    Account[] accountsByType = f19371c.getAccountsByType(packageName);
                    int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Account account2 = accountsByType[i];
                        if (account2 != null && string.equals(account2.name)) {
                            account = account2;
                            break;
                        }
                        i++;
                    }
                    return account;
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|(3:12|13|14)|15|16|(2:18|(1:20))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.deviceregister.p290b.p291a.C6784a m21098a(android.content.Context r6) throws java.lang.IllegalArgumentException {
        /*
            boolean r0 = com.p280ss.android.deviceregister.C6789d.m21069a()
            if (r0 == 0) goto L_0x0060
            com.ss.android.deviceregister.b.a.a r0 = f19369a
            if (r0 != 0) goto L_0x005d
            java.lang.Class<com.ss.android.deviceregister.f> r0 = com.p280ss.android.deviceregister.C6792f.class
            monitor-enter(r0)
            com.ss.android.deviceregister.b.a.a r1 = f19369a     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            if (r6 == 0) goto L_0x0050
            boolean r1 = m21102b(r6)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = "com.ss.android.deviceregister.newuser.DeviceParamsProvider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0037 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0037 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0037 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ Exception -> 0x0037 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0037 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0037 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ Exception -> 0x0037 }
            com.ss.android.deviceregister.b.a.a r1 = (com.p280ss.android.deviceregister.p290b.p291a.C6784a) r1     // Catch:{ Exception -> 0x0037 }
            f19369a = r1     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            com.ss.android.deviceregister.b.a.a r1 = f19369a     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            com.ss.android.deviceregister.c r1 = new com.ss.android.deviceregister.c     // Catch:{ all -> 0x005a }
            r1.<init>(r6)     // Catch:{ all -> 0x005a }
            f19369a = r1     // Catch:{ all -> 0x005a }
            android.accounts.Account r6 = f19373e     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x0058
            com.ss.android.deviceregister.b.a.a r6 = f19369a     // Catch:{ all -> 0x005a }
            com.ss.android.deviceregister.c r6 = (com.p280ss.android.deviceregister.C6788c) r6     // Catch:{ all -> 0x005a }
            android.accounts.Account r1 = f19373e     // Catch:{ all -> 0x005a }
            r6.mo16594a(r1)     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0050:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "context == null"
            r6.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r6     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r6
        L_0x005d:
            com.ss.android.deviceregister.b.a.a r6 = f19369a
            return r6
        L_0x0060:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "please init TeaAgent first"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C6792f.m21098a(android.content.Context):com.ss.android.deviceregister.b.a.a");
    }

    /* renamed from: a */
    public static void m21099a(Context context, Account account) {
        if (f19369a instanceof C6788c) {
            ((C6788c) f19369a).mo16594a(account);
        } else {
            f19373e = account;
        }
    }

    /* renamed from: a */
    public static void m21100a(Context context, boolean z) {
        if (context != null && m21101a()) {
            if (f19372d == null) {
                f19372d = m21103c(context);
            }
            if (f19372d != null && f19371c != null) {
                try {
                    f19371c.setUserData(f19372d, "new_user", String.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }
}
