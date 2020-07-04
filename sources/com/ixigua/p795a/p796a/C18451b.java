package com.ixigua.p795a.p796a;

import android.os.AsyncTask;
import com.bytedance.common.utility.p254b.C9709a;
import com.ixigua.downloader.pojo.Task;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ixigua.a.a.b */
class C18451b {

    /* renamed from: b */
    private static C18451b f50016b;

    /* renamed from: a */
    public Map<Task, C18452a> f50017a = new ConcurrentHashMap();

    /* renamed from: com.ixigua.a.a.b$a */
    class C18452a extends AsyncTask<Object, Object, Integer> {

        /* renamed from: b */
        private Task f50019b;

        /* renamed from: c */
        private Map<String, String> f50020c;

        /* renamed from: d */
        private boolean f50021d;

        /* renamed from: e */
        private boolean f50022e;

        /* renamed from: f */
        private C18456d f50023f;

        /* renamed from: g */
        private C18450a f50024g;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void onCancelled(Integer num) {
            super.onCancelled(num);
            if (this.f50019b != null) {
                C18451b.this.f50017a.remove(this.f50019b);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            if (this.f50019b != null) {
                C18451b.this.f50017a.remove(this.f50019b);
                if (this.f50024g != null) {
                    if (C18461g.m60788a(num.intValue())) {
                        this.f50024g.mo21506a(this.f50023f, this.f50019b.path, this.f50020c);
                        return;
                    }
                    if (this.f50020c != null) {
                        this.f50020c.put("result_code", String.valueOf(num));
                    }
                    this.f50024g.mo21505a(this.f50023f, C18458f.m60786b(this.f50019b.path), num.intValue(), this.f50020c);
                }
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
            if (r3.delete() == false) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
            if (r1.renameTo(r3) == false) goto L_0x007b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Object[] r6) {
            /*
                r5 = this;
                boolean r6 = r5.f50021d
                if (r6 == 0) goto L_0x0016
                java.io.File r6 = new java.io.File
                com.ixigua.downloader.pojo.Task r0 = r5.f50019b
                java.lang.String r0 = r0.path
                r6.<init>(r0)
                boolean r6 = com.ixigua.p795a.p796a.C18458f.m60784a(r6)
                if (r6 != 0) goto L_0x0016
                r6 = 100
                goto L_0x0017
            L_0x0016:
                r6 = 0
            L_0x0017:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.ixigua.downloader.pojo.Task r1 = r5.f50019b
                java.lang.String r1 = r1.path
                r0.append(r1)
                java.lang.String r1 = "_temp"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                boolean r1 = com.ixigua.p795a.p796a.C18461g.m60788a(r6)
                r2 = 101(0x65, float:1.42E-43)
                if (r1 == 0) goto L_0x007d
                boolean r1 = r5.f50022e
                if (r1 == 0) goto L_0x007d
                com.ixigua.downloader.pojo.Task r1 = r5.f50019b
                java.lang.String r1 = r1.path
                boolean r1 = com.ixigua.downloader.p797a.C18464b.m60811c(r1)
                if (r1 != 0) goto L_0x007d
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x007b }
                com.ixigua.downloader.pojo.Task r3 = r5.f50019b     // Catch:{ Exception -> 0x007b }
                java.lang.String r3 = r3.path     // Catch:{ Exception -> 0x007b }
                r1.<init>(r3)     // Catch:{ Exception -> 0x007b }
                com.ixigua.downloader.p797a.C18464b.m60802a(r1, r0)     // Catch:{ Exception -> 0x007b }
                com.ixigua.downloader.pojo.Task r1 = r5.f50019b     // Catch:{ Exception -> 0x007b }
                java.lang.String r1 = r1.path     // Catch:{ Exception -> 0x007b }
                com.ixigua.downloader.p797a.C18464b.m60817f(r1)     // Catch:{ Exception -> 0x007b }
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x007b }
                r1.<init>(r0)     // Catch:{ Exception -> 0x007b }
                boolean r3 = r1.exists()     // Catch:{ Exception -> 0x007b }
                if (r3 == 0) goto L_0x007b
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x007b }
                com.ixigua.downloader.pojo.Task r4 = r5.f50019b     // Catch:{ Exception -> 0x007b }
                java.lang.String r4 = r4.path     // Catch:{ Exception -> 0x007b }
                r3.<init>(r4)     // Catch:{ Exception -> 0x007b }
                boolean r4 = r3.exists()     // Catch:{ Exception -> 0x007b }
                if (r4 == 0) goto L_0x0075
                boolean r4 = r3.delete()     // Catch:{ Exception -> 0x007b }
                if (r4 == 0) goto L_0x007b
            L_0x0075:
                boolean r1 = r1.renameTo(r3)     // Catch:{ Exception -> 0x007b }
                if (r1 != 0) goto L_0x007d
            L_0x007b:
                r6 = 101(0x65, float:1.42E-43)
            L_0x007d:
                boolean r1 = com.ixigua.p795a.p796a.C18461g.m60788a(r6)
                if (r1 == 0) goto L_0x008b
                com.ixigua.downloader.pojo.Task r0 = r5.f50019b
                java.lang.String r0 = r0.path
                com.ixigua.p795a.p796a.C18458f.m60783a(r0)
                goto L_0x0095
            L_0x008b:
                com.ixigua.downloader.pojo.Task r1 = r5.f50019b
                java.lang.String r1 = r1.path
                com.ixigua.downloader.p797a.C18464b.m60817f(r1)
                com.ixigua.downloader.p797a.C18464b.m60814e(r0)
            L_0x0095:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ixigua.p795a.p796a.C18451b.C18452a.doInBackground(java.lang.Object[]):java.lang.Integer");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47914a(C18456d dVar, C18450a aVar) {
            this.f50023f = dVar;
            this.f50024g = aVar;
        }

        C18452a(C18456d dVar, C18450a aVar, Task task, Map<String, String> map) {
            this.f50019b = task;
            this.f50020c = map;
            this.f50023f = dVar;
            this.f50024g = aVar;
            this.f50022e = dVar.f50035d;
            this.f50021d = dVar.f50036e;
        }
    }

    private C18451b() {
    }

    /* renamed from: a */
    static C18451b m60753a() {
        if (f50016b == null) {
            synchronized (C18451b.class) {
                if (f50016b == null) {
                    f50016b = new C18451b();
                }
            }
        }
        return f50016b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47913a(C18456d dVar, C18450a aVar, Task task, Map<String, String> map) {
        if (task != null) {
            C18452a aVar2 = (C18452a) this.f50017a.get(task);
            if (aVar2 == null) {
                C18452a aVar3 = new C18452a(dVar, aVar, task, map);
                C9709a.m28647a(aVar3, new Object[0]);
                this.f50017a.put(task, aVar3);
                return;
            }
            aVar2.mo47914a(dVar, aVar);
        }
    }

    /* renamed from: a */
    static void m60754a(C18456d dVar, C18450a aVar, Task task, int i, Map<String, String> map) {
        String str;
        if (aVar != null) {
            if (task != null) {
                str = C18458f.m60786b(task.path);
            } else {
                str = null;
            }
            aVar.mo21505a(dVar, str, i, map);
        }
    }
}
