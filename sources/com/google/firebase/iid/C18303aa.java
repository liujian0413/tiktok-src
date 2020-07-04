package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.util.ArrayMap;
import android.util.Log;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.aa */
final class C18303aa {

    /* renamed from: a */
    private final SharedPreferences f49750a;

    /* renamed from: b */
    private final Context f49751b;

    /* renamed from: c */
    private final C18331bb f49752c;

    /* renamed from: d */
    private final Map<String, C18332bc> f49753d;

    public C18303aa(Context context) {
        this(context, new C18331bb());
    }

    private C18303aa(Context context, C18331bb bbVar) {
        this.f49753d = new ArrayMap();
        this.f49751b = context;
        this.f49750a = C7285c.m22838a(context, "com.google.android.gms.appid", 0);
        this.f49752c = bbVar;
        File file = new File(C0683b.m2911b(this.f49751b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m60360c()) {
                    mo47208b();
                    FirebaseInstanceId.m60321a().mo47194h();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return;
                    }
                    new String(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo47204a() {
        return this.f49750a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void mo47205a(String str) {
        this.f49750a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    private final synchronized boolean m60360c() {
        return this.f49750a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m60359b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    static String m60358a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo47208b() {
        this.f49753d.clear();
        C18331bb.m60419a(this.f49751b);
        this.f49750a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized C18304ab mo47203a(String str, String str2, String str3) {
        return C18304ab.m60368a(this.f49750a.getString(m60359b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void mo47206a(String str, String str2, String str3, String str4, String str5) {
        String a = C18304ab.m60370a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f49750a.edit();
            edit.putString(m60359b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.bb.b(android.content.Context, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.google.firebase.iid.FirebaseInstanceId.m60321a().mo47194h();
        r0 = r2.f49752c.mo47244b(r2.f49751b, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.firebase.iid.C18332bc mo47207b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.firebase.iid.bc> r0 = r2.f49753d     // Catch:{ all -> 0x002c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.bc r0 = (com.google.firebase.iid.C18332bc) r0     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)
            return r0
        L_0x000d:
            com.google.firebase.iid.bb r0 = r2.f49752c     // Catch:{ e -> 0x0016 }
            android.content.Context r1 = r2.f49751b     // Catch:{ e -> 0x0016 }
            com.google.firebase.iid.bc r0 = r0.mo47243a(r1, r3)     // Catch:{ e -> 0x0016 }
            goto L_0x0025
        L_0x0016:
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.m60321a()     // Catch:{ all -> 0x002c }
            r0.mo47194h()     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.bb r0 = r2.f49752c     // Catch:{ all -> 0x002c }
            android.content.Context r1 = r2.f49751b     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.bc r0 = r0.mo47244b(r1, r3)     // Catch:{ all -> 0x002c }
        L_0x0025:
            java.util.Map<java.lang.String, com.google.firebase.iid.bc> r1 = r2.f49753d     // Catch:{ all -> 0x002c }
            r1.put(r3, r0)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)
            return r0
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C18303aa.mo47207b(java.lang.String):com.google.firebase.iid.bc");
    }

    /* renamed from: c */
    public final synchronized void mo47209c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f49750a.edit();
        for (String str2 : this.f49750a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
