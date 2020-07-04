package com.p280ss.android.deviceregister;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.deviceregister.p290b.p291a.C6784a;
import com.p280ss.android.deviceregister.p290b.p291a.p292a.C19299a;
import com.p280ss.android.deviceregister.p290b.p291a.p292a.C19301b;
import com.p280ss.android.deviceregister.p290b.p291a.p292a.C19312e;
import com.p280ss.android.deviceregister.p855c.C19318b;
import com.p280ss.android.deviceregister.p855c.C19319c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.UUID;

/* renamed from: com.ss.android.deviceregister.c */
public final class C6788c implements C6784a {

    /* renamed from: d */
    private static String f19354d;

    /* renamed from: e */
    private static String f19355e;

    /* renamed from: f */
    private static String f19356f;

    /* renamed from: g */
    private static volatile String f19357g;

    /* renamed from: h */
    private static String[] f19358h;

    /* renamed from: i */
    private static String f19359i;

    /* renamed from: a */
    private final Context f19360a;

    /* renamed from: b */
    private C19301b f19361b = new C19312e(this.f19360a);

    /* renamed from: c */
    private final C19299a f19362c = new C19299a(this.f19360a);

    /* renamed from: b */
    public final String mo16577b() {
        if (!C6319n.m19593a(f19359i)) {
            return f19359i;
        }
        try {
            String d = this.f19361b.mo51207d(null, C19319c.m63342a());
            f19359i = d;
            return d;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String[] mo16578c() {
        if (f19358h != null && f19358h.length > 0) {
            return f19358h;
        }
        try {
            String[] a = this.f19361b.mo51204a((String[]) null, (String[]) null);
            if (a == null) {
                a = new String[0];
            }
            f19358h = a;
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo16579d() {
        if (!C6319n.m19593a(f19356f)) {
            return f19356f;
        }
        try {
            String e = this.f19361b.mo51208e(null, C19319c.m63348b(this.f19360a));
            f19356f = e;
            return e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final String mo16580e() {
        if (!C6319n.m19593a(f19357g)) {
            return f19357g;
        }
        String f = this.f19361b.mo51209f("", "");
        f19357g = f;
        return f;
    }

    /* renamed from: a */
    public final String mo16574a() {
        if (!TextUtils.isEmpty(f19355e)) {
            return f19355e;
        }
        try {
            SharedPreferences a = C7285c.m22838a(this.f19360a, C6778a.m20964c(), 0);
            String string = a.getString("clientudid", null);
            if (!C19318b.m63341a(string)) {
                string = UUID.randomUUID().toString();
                String c = this.f19362c.mo51206c(m21045a("clientudid.dat", (String) null), string);
                if (C19318b.m63341a(c)) {
                    string = c;
                }
                Editor edit = a.edit();
                edit.putString("clientudid", string);
                edit.commit();
            } else {
                this.f19362c.mo51206c(string, null);
            }
            f19355e = string;
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo16594a(Account account) {
        this.f19362c.mo51198a(account);
    }

    /* renamed from: a */
    public final void mo16576a(String str) {
        if (!NetUtil.isBadId(str) && !C6319n.m19594a(str, f19357g)) {
            f19357g = this.f19361b.mo51209f(str, f19357g);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6788c(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            android.content.Context r6 = r6.getApplicationContext()
            r5.f19360a = r6
            com.ss.android.deviceregister.b r6 = new com.ss.android.deviceregister.b
            r6.<init>()
            com.ss.android.deviceregister.b.a.a.e r0 = new com.ss.android.deviceregister.b.a.a.e
            android.content.Context r1 = r5.f19360a
            r0.<init>(r1)
            r5.f19361b = r0
            com.ss.android.deviceregister.b.a.a.a r0 = new com.ss.android.deviceregister.b.a.a.a
            android.content.Context r1 = r5.f19360a
            r0.<init>(r1)
            r5.f19362c = r0
            com.ss.android.deviceregister.b.a.a.b r0 = r5.f19361b
            com.ss.android.deviceregister.b.a.a.a r1 = r5.f19362c
            r0.f52206c = r1
            com.ss.android.deviceregister.b.a.a.a r0 = r5.f19362c
            r1 = 1
            boolean r2 = com.p280ss.android.deviceregister.p289a.C6778a.m20963b()     // Catch:{ Exception -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "device_id"
            goto L_0x0036
        L_0x0032:
            java.lang.String r2 = com.p280ss.android.deviceregister.p290b.p291a.p292a.C6785c.m21010a()     // Catch:{ Exception -> 0x0061 }
        L_0x0036:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r3.<init>()     // Catch:{ Exception -> 0x0061 }
            android.content.Context r4 = r5.f19360a     // Catch:{ Exception -> 0x0061 }
            java.io.File r4 = r4.getExternalCacheDir()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = r4.getParent()     // Catch:{ Exception -> 0x0061 }
            r3.append(r4)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ Exception -> 0x0061 }
            r3.append(r2)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0061 }
            com.ss.android.deviceregister.b.a.a.d r3 = new com.ss.android.deviceregister.b.a.a.d     // Catch:{ Exception -> 0x0061 }
            android.content.Context r4 = r5.f19360a     // Catch:{ Exception -> 0x0061 }
            r3.<init>(r4, r1, r2)     // Catch:{ Exception -> 0x0061 }
            r0.f52206c = r3     // Catch:{ Exception -> 0x0061 }
            r6.mo51195a(r2)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0062
        L_0x0061:
            r3 = r0
        L_0x0062:
            boolean r0 = com.p280ss.android.deviceregister.p289a.C6778a.m20963b()
            r0 = r0 ^ r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r1.<init>()     // Catch:{ Exception -> 0x0091 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0091 }
            r1.append(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = "L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9ieXRlZGFuY2U="
            java.lang.String r2 = com.p280ss.android.deviceregister.p290b.p291a.p292a.C6785c.m21011a(r2)     // Catch:{ Exception -> 0x0091 }
            r1.append(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0091 }
            com.ss.android.deviceregister.b.a.a.d r2 = new com.ss.android.deviceregister.b.a.a.d     // Catch:{ Exception -> 0x0091 }
            android.content.Context r4 = r5.f19360a     // Catch:{ Exception -> 0x0091 }
            r2.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x0091 }
            r3.f52206c = r2     // Catch:{ Exception -> 0x0091 }
            r6.mo51195a(r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r1.<init>()     // Catch:{ Exception -> 0x00be }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00be }
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = com.p280ss.android.deviceregister.p290b.p291a.p292a.C6785c.m21010a()     // Catch:{ Exception -> 0x00be }
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00be }
            com.ss.android.deviceregister.b.a.a.d r3 = new com.ss.android.deviceregister.b.a.a.d     // Catch:{ Exception -> 0x00be }
            android.content.Context r4 = r5.f19360a     // Catch:{ Exception -> 0x00be }
            r3.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x00be }
            r2.f52206c = r3     // Catch:{ Exception -> 0x00be }
            r6.mo51195a(r1)     // Catch:{ Exception -> 0x00be }
        L_0x00be:
            boolean r0 = com.p280ss.android.deviceregister.p289a.C6778a.m20963b()
            if (r0 != 0) goto L_0x00c7
            r6.mo51194a()
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C6788c.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16575a(boolean r8) {
        /*
            r7 = this;
            java.lang.String r8 = f19354d
            boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r8)
            if (r8 != 0) goto L_0x000b
            java.lang.String r8 = f19354d
            return r8
        L_0x000b:
            android.content.Context r8 = r7.f19360a
            java.lang.String r8 = com.p280ss.android.deviceregister.p855c.C19319c.m63345a(r8)
            r0 = 13
            r1 = 0
            if (r8 == 0) goto L_0x0031
            java.lang.String r2 = "9774d56d682e549c"
            boolean r2 = r8.equals(r2)     // Catch:{ Exception -> 0x002e }
            if (r2 != 0) goto L_0x0031
            int r2 = r8.length()     // Catch:{ Exception -> 0x002e }
            if (r2 >= r0) goto L_0x0025
            goto L_0x0031
        L_0x0025:
            com.ss.android.deviceregister.b.a.a.b r0 = r7.f19361b     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r0.mo51205b(r1, r8)     // Catch:{ Exception -> 0x002e }
        L_0x002b:
            r8 = r0
            goto L_0x00ab
        L_0x002e:
            goto L_0x00ab
        L_0x0031:
            android.content.Context r2 = r7.f19360a     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = com.p280ss.android.deviceregister.p289a.C6778a.m20964c()     // Catch:{ Exception -> 0x002e }
            r4 = 0
            android.content.SharedPreferences r2 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r3, r4)     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = "openudid"
            java.lang.String r3 = r2.getString(r3, r1)     // Catch:{ Exception -> 0x002e }
            boolean r5 = com.p280ss.android.deviceregister.p855c.C19318b.m63341a(r3)     // Catch:{ Exception -> 0x002e }
            if (r5 != 0) goto L_0x00a5
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ Exception -> 0x002e }
            r3.<init>()     // Catch:{ Exception -> 0x002e }
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ Exception -> 0x002e }
            r6 = 80
            r5.<init>(r6, r3)     // Catch:{ Exception -> 0x002e }
            r3 = 16
            java.lang.String r3 = r5.toString(r3)     // Catch:{ Exception -> 0x002e }
            char r4 = r3.charAt(r4)     // Catch:{ Exception -> 0x002e }
            r5 = 45
            if (r4 != r5) goto L_0x0067
            r4 = 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x002e }
        L_0x0067:
            int r4 = r3.length()     // Catch:{ Exception -> 0x002e }
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x0084
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e }
            r4.<init>()     // Catch:{ Exception -> 0x002e }
        L_0x0073:
            if (r0 <= 0) goto L_0x007d
            r5 = 70
            r4.append(r5)     // Catch:{ Exception -> 0x002e }
            int r0 = r0 + -1
            goto L_0x0073
        L_0x007d:
            r4.append(r3)     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x002e }
        L_0x0084:
            java.lang.String r0 = "openudid.dat"
            java.lang.String r0 = m21045a(r0, r1)     // Catch:{ Exception -> 0x002e }
            com.ss.android.deviceregister.b.a.a.a r1 = r7.f19362c     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r1.mo51205b(r0, r3)     // Catch:{ Exception -> 0x002e }
            boolean r1 = com.p280ss.android.deviceregister.p855c.C19318b.m63341a(r0)     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r0 = r3
        L_0x0098:
            android.content.SharedPreferences$Editor r1 = r2.edit()     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "openudid"
            r1.putString(r2, r0)     // Catch:{ Exception -> 0x002e }
            r1.commit()     // Catch:{ Exception -> 0x002e }
            goto L_0x002b
        L_0x00a5:
            com.ss.android.deviceregister.b.a.a.a r0 = r7.f19362c     // Catch:{ Exception -> 0x002e }
            r0.mo51205b(r3, r1)     // Catch:{ Exception -> 0x002e }
            r8 = r3
        L_0x00ab:
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r8)
            if (r0 != 0) goto L_0x00b3
            f19354d = r8
        L_0x00b3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C6788c.mo16575a(boolean):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:19|20)|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:29|30)|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:35|36|37|(2:39|40)|41|42|43) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00aa */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9 A[SYNTHETIC, Splitter:B:53:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC, Splitter:B:57:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c6 A[SYNTHETIC, Splitter:B:65:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb A[SYNTHETIC, Splitter:B:69:0x00cb] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21045a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r7 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r7 = r0.equals(r7)
            r0 = 0
            if (r7 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.<init>()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.append(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = "L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9jYWNoZQ=="
            java.lang.String r1 = com.p280ss.android.deviceregister.p290b.p291a.p292a.C6785c.m21011a(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.append(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.<init>()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.append(r6)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            boolean r7 = r1.exists()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            if (r7 != 0) goto L_0x004b
            return r0
        L_0x004b:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = "rwd"
            r6.<init>(r7, r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.nio.channels.FileChannel r1 = r6.getChannel()     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            boolean r7 = r7.isFile()     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r7 == 0) goto L_0x0088
            r7 = 161(0xa1, float:2.26E-43)
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r3 = 0
            int r4 = r6.read(r2, r3, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r4 <= 0) goto L_0x0088
            if (r4 >= r7) goto L_0x0088
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            java.lang.String r5 = "UTF-8"
            r7.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            boolean r2 = com.p280ss.android.deviceregister.p855c.C19318b.m63341a(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r2 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0084
            r1.release()     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r6.close()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            return r7
        L_0x0088:
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r7 == 0) goto L_0x0097
            if (r1 == 0) goto L_0x0093
            r1.release()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            r6.close()     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            return r0
        L_0x0097:
            java.lang.String r7 = "UTF-8"
            byte[] r7 = r0.getBytes(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r2 = 0
            r6.setLength(r2)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r6.write(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r1 == 0) goto L_0x00aa
            r1.release()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r6.close()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            return r0
        L_0x00ae:
            r7 = move-exception
            r0 = r1
            goto L_0x00b7
        L_0x00b1:
            r7 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r1 = r0
            goto L_0x00c4
        L_0x00b5:
            r7 = move-exception
            r6 = r0
        L_0x00b7:
            if (r0 == 0) goto L_0x00bc
            r0.release()     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            if (r6 == 0) goto L_0x00c1
            r6.close()     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            throw r7
        L_0x00c2:
            r6 = r0
            r1 = r6
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r1.release()     // Catch:{ Exception -> 0x00c9 }
        L_0x00c9:
            if (r6 == 0) goto L_0x00ce
            r6.close()     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C6788c.m21045a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo16595a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f19357g = null;
            StringBuilder sb = new StringBuilder("clear_key_prefix");
            sb.append(str);
            String sb2 = sb.toString();
            SharedPreferences a = C6778a.m20959a(context);
            if (!a.getBoolean(sb2, false)) {
                Editor edit = a.edit();
                edit.putBoolean(sb2, true);
                if (a.contains("device_id")) {
                    edit.remove("device_id");
                }
                if (a.contains("install_id")) {
                    edit.remove("install_id");
                }
                edit.apply();
                this.f19361b.mo51202c("device_id");
            }
        }
    }
}
