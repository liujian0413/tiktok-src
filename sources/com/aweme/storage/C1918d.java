package com.aweme.storage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.d */
final class C1918d {

    /* renamed from: a */
    static long f6931a;

    /* renamed from: b */
    static long f6932b;

    /* renamed from: c */
    static List<String> f6933c;

    /* renamed from: com.aweme.storage.d$a */
    static class C1919a {

        /* renamed from: a */
        public long f6934a;

        /* renamed from: b */
        public List<C1919a> f6935b = new ArrayList();

        /* renamed from: c */
        private String f6936c;

        /* renamed from: d */
        private C1919a f6937d;

        /* renamed from: e */
        private String f6938e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo7536a() {
            if (this.f6934a > C1918d.f6931a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final String mo7538b() {
            if (this.f6938e != null) {
                return this.f6938e;
            }
            if (this.f6937d == null) {
                this.f6938e = this.f6936c;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6937d.mo7538b());
                sb.append(File.separator);
                sb.append(this.f6936c);
                this.f6938e = sb.toString();
            }
            return this.f6938e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final JSONObject mo7540c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f6936c);
                jSONObject.put("size", this.f6934a);
                if (this.f6935b != null && this.f6935b.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C1919a aVar : this.f6935b) {
                        if (aVar != null) {
                            jSONArray.put(aVar.mo7540c());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo7541c(C1919a aVar) {
            this.f6935b.add(aVar);
        }

        /* renamed from: a */
        public final boolean mo7537a(C1919a aVar) {
            return aVar.mo7538b().equals(mo7538b());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo7539b(C1919a aVar) {
            if (aVar != null && this.f6934a - aVar.f6934a > C1918d.f6931a) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        static C1919a m8879a(JSONObject jSONObject, C1919a aVar) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString("name");
                long optLong = jSONObject.optLong("size", 0);
                if (optString == null) {
                    return null;
                }
                C1919a aVar2 = new C1919a(optString, optLong, aVar);
                if (aVar != null) {
                    aVar.mo7541c(aVar2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            m8879a(jSONObject2, aVar2);
                        }
                    }
                }
                return aVar2;
            } catch (Exception unused) {
                return null;
            }
        }

        C1919a(String str, long j, C1919a aVar) {
            this.f6936c = str;
            this.f6934a = j;
            this.f6937d = aVar;
        }
    }

    /* renamed from: com.aweme.storage.d$b */
    enum C1920b {
        p,
        e
    }

    /* renamed from: a */
    private static boolean m8878a(File file) {
        if (file == null || file.isFile()) {
            return true;
        }
        if (f6933c == null || !f6933c.contains(file.getName())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0038 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.C1918d.C1919a m8874a(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0037, all -> 0x0031 }
            int r0 = r4.available()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.read(r0)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            java.lang.String r3 = "utf-8"
            r2.<init>(r0, r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r0.<init>(r2)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            com.aweme.storage.d$a r0 = com.aweme.storage.C1918d.C1919a.m8879a(r0, r1)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x0038, all -> 0x002f }
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return r0
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r1
        L_0x0033:
            r4.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r0
        L_0x0037:
            r4 = r1
        L_0x0038:
            r4.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C1918d.m8874a(java.lang.String):com.aweme.storage.d$a");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0045 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m8876a(com.aweme.storage.C1918d.C1919a r2, java.lang.String r3) {
        /*
            if (r2 == 0) goto L_0x004a
            if (r3 != 0) goto L_0x0005
            goto L_0x004a
        L_0x0005:
            org.json.JSONObject r2 = r2.mo7540c()
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
            boolean r3 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
            if (r3 != 0) goto L_0x0018
            r1.createNewFile()     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
        L_0x0018:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
            r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003e, Exception -> 0x0038, all -> 0x0033 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003f, Exception -> 0x0039, all -> 0x0030 }
            byte[] r2 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003f, Exception -> 0x0039, all -> 0x0030 }
            r3.write(r2)     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003f, Exception -> 0x0039, all -> 0x0030 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003f, Exception -> 0x0039, all -> 0x0030 }
            r3.close()     // Catch:{ Exception -> 0x002f }
            return
        L_0x002f:
            return
        L_0x0030:
            r2 = move-exception
            r0 = r3
            goto L_0x0034
        L_0x0033:
            r2 = move-exception
        L_0x0034:
            r0.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            throw r2
        L_0x0038:
            r3 = r0
        L_0x0039:
            r3.close()     // Catch:{ Exception -> 0x003d }
            return
        L_0x003d:
            return
        L_0x003e:
            r3 = r0
        L_0x003f:
            r3.close()     // Catch:{ Exception -> 0x0043 }
            return
        L_0x0043:
            return
        L_0x0044:
            r3 = r0
        L_0x0045:
            r3.close()     // Catch:{ Exception -> 0x0049 }
            return
        L_0x0049:
            return
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C1918d.m8876a(com.aweme.storage.d$a, java.lang.String):void");
    }

    /* renamed from: a */
    static void m8877a(File file, List<File> list) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile() && file2.length() > f6932b && !list.contains(file2)) {
                        list.add(file2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static C1919a m8873a(File file, C1919a aVar, C1920b bVar) {
        String str;
        if (file == null || !file.exists() || m8878a(file)) {
            return null;
        }
        if (aVar == null) {
            str = bVar.name();
        } else {
            str = file.getName();
        }
        C1919a aVar2 = new C1919a(str, C1921e.m8887a(file), aVar);
        if (aVar != null) {
            aVar.mo7541c(aVar2);
        }
        if (file.isFile()) {
            return null;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a : listFiles) {
                    m8873a(a, aVar2, bVar);
                }
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    static void m8875a(C1919a aVar, C1919a aVar2, List<C1919a> list) {
        if (aVar != null && aVar2 != null && list != null) {
            if (aVar2.mo7539b(aVar)) {
                list.add(aVar2);
            }
            List<C1919a> list2 = aVar2.f6935b;
            if (list2 != null && !list2.isEmpty()) {
                List<C1919a> list3 = aVar.f6935b;
                if (list3 == null || list3.isEmpty()) {
                    for (C1919a aVar3 : list2) {
                        if (aVar3 != null && aVar3.mo7536a()) {
                            list.add(aVar3);
                        }
                    }
                    return;
                }
                for (C1919a aVar4 : list2) {
                    if (aVar4 != null) {
                        int i = 0;
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C1919a aVar5 = (C1919a) it.next();
                            if (aVar5 != null && aVar5.mo7537a(aVar4)) {
                                m8875a(aVar5, aVar4, list);
                                break;
                            }
                            i++;
                        }
                        if (i >= list3.size() && aVar4 != null && aVar4.mo7536a()) {
                            list.add(aVar4);
                        }
                    }
                }
            }
        }
    }
}
