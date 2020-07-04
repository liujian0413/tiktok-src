package com.p280ss.android.common.util;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.util.a */
public class C6772a implements C6310a, Runnable {

    /* renamed from: j */
    private static C6772a f19267j;

    /* renamed from: u */
    private static NotificationManager f19268u;

    /* renamed from: v */
    private static int f19269v;

    /* renamed from: a */
    public String f19270a;

    /* renamed from: b */
    public boolean f19271b;

    /* renamed from: c */
    public boolean f19272c = false;

    /* renamed from: d */
    public String f19273d;

    /* renamed from: e */
    public String f19274e = "";

    /* renamed from: f */
    long f19275f;

    /* renamed from: g */
    private BlockingQueue<JSONObject> f19276g = new LinkedBlockingQueue();

    /* renamed from: h */
    private final List<String> f19277h = new ArrayList();

    /* renamed from: i */
    private C6304f f19278i;

    /* renamed from: k */
    private String f19279k;

    /* renamed from: l */
    private String f19280l;

    /* renamed from: m */
    private List<String> f19281m;

    /* renamed from: n */
    private List<String> f19282n;

    /* renamed from: o */
    private boolean f19283o = true;

    /* renamed from: p */
    private Context f19284p;

    /* renamed from: q */
    private String f19285q;

    /* renamed from: r */
    private Handler f19286r = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: s */
    private Queue<String> f19287s = new LinkedList();

    /* renamed from: t */
    private Toast f19288t;

    /* renamed from: a */
    public final synchronized void mo16564a(boolean z) {
        if (this.f19271b != z) {
            this.f19271b = z;
            if (!this.f19271b || f19267j == null) {
                this.f19278i = null;
                return;
            }
            this.f19278i = new C6304f(f19267j, "EventSender", true);
            this.f19278i.start();
        }
    }

    /* renamed from: a */
    public static C6772a m20923a() {
        if (f19267j == null) {
            synchronized (C6772a.class) {
                if (f19267j == null) {
                    f19267j = new C6772a();
                }
            }
        }
        return f19267j;
    }

    private C6772a() {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:45:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r4.f19271b     // Catch:{ Exception -> 0x00dd }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r4.f19270a     // Catch:{ Exception -> 0x00dd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r3 = r4.f19272c     // Catch:{ Exception -> 0x00dd }
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r4.f19273d     // Catch:{ Exception -> 0x00dd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00dd }
            if (r3 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            if (r1 == 0) goto L_0x00dc
        L_0x0029:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r2 = r4.f19276g     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r2 = r2.take()     // Catch:{ Exception -> 0x00dd }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0038
            r4.m20931b(r2)     // Catch:{ Exception -> 0x00dd }
        L_0x0038:
            java.lang.String r1 = "__demandName__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "__demandName__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x0045:
            java.lang.String r1 = "__demandSendTime__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "__demandSendTime__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x0052:
            java.lang.String r1 = "__demandTestUserName__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "__demandTestUserName__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x005f:
            java.lang.String r1 = "__demandNotThisDemand__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "__demandNotThisDemand__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x006c:
            if (r0 == 0) goto L_0x0000
            java.lang.String r0 = r4.f19270a     // Catch:{ Exception -> 0x0000 }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r4.f19270a     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0000 }
            if (r0 == 0) goto L_0x0098
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0000 }
            r0.<init>()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = r4.f19270a     // Catch:{ Exception -> 0x0000 }
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0000 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0000 }
            goto L_0x00b5
        L_0x0098:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "https://"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = r4.f19270a     // Catch:{ Exception -> 0x0000 }
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0000 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0000 }
        L_0x00b5:
            java.lang.String r1 = "parameter"
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0000 }
            r0.appendQueryParameter(r1, r2)     // Catch:{ Exception -> 0x0000 }
            com.bytedance.common.utility.k r1 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r1.mo15150a(r0)     // Catch:{ Exception -> 0x0000 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0000 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = "success"
            java.lang.String r2 = "data"
            java.lang.Object r1 = r1.opt(r2)     // Catch:{ Exception -> 0x0000 }
            r0.equals(r1)     // Catch:{ Exception -> 0x0000 }
            goto L_0x0000
        L_0x00dc:
            return
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.C6772a.run():void");
    }

    /* renamed from: a */
    private void m20924a(String str) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = str;
        this.f19286r.sendMessage(obtain);
    }

    /* renamed from: d */
    private boolean m20933d(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(this.f19285q) || TextUtils.isEmpty(this.f19279k) || TextUtils.isEmpty(this.f19280l)) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.optString("tag"))) {
                return false;
            }
            String str = this.f19279k;
            String str2 = this.f19280l;
            jSONObject.put("__demandId__", str);
            jSONObject.put("__demandName__", str2);
            jSONObject.put("__demandSendTime__", System.currentTimeMillis());
            jSONObject.put("__demandNotThisDemand__", false);
            jSONObject.put("__demandTestUserName__", this.f19285q);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[Catch:{ Exception -> 0x0074 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20934e(org.json.JSONObject r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0075
            java.lang.String r1 = r6.f19279k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = r6.f19280l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = r6.f19285q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.util.List<java.lang.String> r1 = r6.f19282n
            if (r1 == 0) goto L_0x0075
            java.util.List<java.lang.String> r1 = r6.f19282n
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
            goto L_0x0075
        L_0x0028:
            java.lang.String r1 = "tag"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x0074 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0074 }
            if (r2 == 0) goto L_0x0035
            return r0
        L_0x0035:
            java.util.List<java.lang.String> r2 = r6.f19282n     // Catch:{ Exception -> 0x0074 }
            r3 = 1
            if (r2 == 0) goto L_0x0052
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0074 }
        L_0x003e:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0074 }
            boolean r4 = r1.equals(r4)     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x003e
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r6.f19279k     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = r6.f19280l     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "__demandId__"
            r7.put(r4, r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandName__"
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandSendTime__"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0074 }
            r7.put(r1, r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandTestUserName__"
            java.lang.String r2 = r6.f19285q     // Catch:{ Exception -> 0x0074 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0074 }
            return r3
        L_0x0074:
            return r0
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.C6772a.m20934e(org.json.JSONObject):boolean");
    }

    /* renamed from: c */
    private boolean m20932c(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null || TextUtils.isEmpty(this.f19279k) || TextUtils.isEmpty(this.f19280l) || TextUtils.isEmpty(this.f19285q) || this.f19281m == null || this.f19281m.isEmpty()) {
            return false;
        }
        try {
            String optString = jSONObject.optString("tag");
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            if (!this.f19279k.equals(jSONObject.optString("__demandId__")) && this.f19283o) {
                return false;
            }
            List<String> list = this.f19281m;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (optString.equals((String) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                String str = this.f19279k;
                String str2 = this.f19280l;
                jSONObject.put("__demandId__", str);
                jSONObject.put("__demandName__", str2);
                jSONObject.put("__demandSendTime__", System.currentTimeMillis());
                jSONObject.put("__demandTestUserName__", this.f19285q);
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m20931b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            String str = null;
            if (jSONObject2.has("tag")) {
                str = jSONObject2.optString("tag");
                jSONObject2.put("event", str);
                jSONObject2.remove("tag");
            }
            String str2 = str;
            String optString = jSONObject2.optString("__demandId__");
            String optString2 = jSONObject2.optString("__demandName__");
            if (optString2 != null) {
                jSONObject2.remove("__demandName__");
            }
            long optLong = jSONObject2.optLong("__demandSendTime__");
            if (jSONObject2.has("__demandSendTime__")) {
                jSONObject2.remove("__demandSendTime__");
            }
            boolean optBoolean = jSONObject2.optBoolean("__demandNotThisDemand__", true);
            if (jSONObject2.has("__demandNotThisDemand__")) {
                jSONObject2.remove("__demandNotThisDemand__");
            }
            String optString3 = jSONObject2.optString("__demandTestUserName__");
            if (jSONObject2.has("__demandTestUserName__")) {
                jSONObject2.remove("__demandTestUserName__");
            }
            if (!this.f19277h.contains(str2) && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                Builder buildUpon = Uri.parse(this.f19273d).buildUpon();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("parameter", jSONObject2.toString()));
                arrayList.add(new Pair("demandID", optString));
                arrayList.add(new Pair("demandName", optString2));
                arrayList.add(new Pair("userName", optString3));
                StringBuilder sb = new StringBuilder();
                sb.append(optLong);
                arrayList.add(new Pair("clientSendTime", sb.toString()));
                if (!TextUtils.isEmpty(this.f19274e)) {
                    arrayList.add(new Pair("appID", this.f19274e));
                }
                if ("event_v3".equals(jSONObject2.optString("category"))) {
                    m20925a(str2, buildUpon.toString(), arrayList, true, optBoolean);
                    return;
                }
                m20925a(str2, buildUpon.toString(), arrayList, false, optBoolean);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r4v0, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v7
      assigns: []
      uses: []
      mth insns count: 126
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x002a
            int r0 = r8.what
            if (r0 != r1) goto L_0x000b
            goto L_0x002a
        L_0x000b:
            int r0 = r8.what
            r1 = 3
            if (r0 != r1) goto L_0x0135
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r8.obj
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0135
            java.lang.Object r8 = r8.obj
            java.lang.String r8 = (java.lang.String) r8
            java.util.Queue<java.lang.String> r0 = r7.f19287s
            r0.offer(r8)
            android.os.Handler r8 = r7.f19286r
            r8.sendEmptyMessage(r2)
            goto L_0x0135
        L_0x002a:
            android.os.Handler r8 = r7.f19286r
            r8.removeMessages(r2)
            android.content.Context r8 = r7.f19284p
            if (r8 == 0) goto L_0x0135
            boolean r8 = r7.f19272c
            if (r8 == 0) goto L_0x0135
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f19275f
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0135
            java.util.Queue<java.lang.String> r8 = r7.f19287s
            java.lang.Object r8 = r8.poll()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0134
            r0 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x006e }
            r3.<init>(r8)     // Catch:{ Exception -> 0x006e }
            java.lang.String r8 = "toast"
            java.lang.String r8 = r3.optString(r8)     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = "raw"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r5 = "event"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x006a }
            java.lang.String r0 = "v3"
            boolean r0 = r3.optBoolean(r0, r2)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0072
        L_0x006a:
            r5 = r0
            goto L_0x0071
        L_0x006c:
            r4 = r0
            goto L_0x0070
        L_0x006e:
            r8 = r0
            r4 = r8
        L_0x0070:
            r5 = r4
        L_0x0071:
            r0 = 1
        L_0x0072:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0081
            android.content.Context r3 = r7.f19284p
            r6 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r8, r6)
            r7.f19288t = r3
        L_0x0081:
            android.app.NotificationManager r3 = f19268u
            if (r3 == 0) goto L_0x0121
            if (r4 == 0) goto L_0x0121
            if (r8 == 0) goto L_0x0121
            int r3 = f19269v
            int r3 = r3 + r2
            int r3 = r3 % 512
            f19269v = r3
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r6 = "ttmain_applog_verify_result_action"
            r3.setAction(r6)
            java.lang.String r6 = "android.intent.category.DEFAULT"
            r3.addCategory(r6)
            java.lang.String r6 = "json"
            java.lang.String r4 = r4.toString()
            r3.putExtra(r6, r4)
            java.lang.String r4 = "toast"
            r3.putExtra(r4, r8)
            java.lang.String r4 = "v3"
            r3.putExtra(r4, r0)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "event: "
            r4.<init>(r6)
            if (r5 != 0) goto L_0x00c2
            java.lang.String r5 = ""
        L_0x00c2:
            r4.append(r5)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = ""
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = "(1.0 埋点)"
        L_0x00cc:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 16
            if (r4 < r5) goto L_0x0121
            android.content.Context r4 = r7.f19284p
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.ComponentName r4 = r3.resolveActivity(r4)
            if (r4 == 0) goto L_0x0121
            android.content.Context r4 = r7.f19284p
            int r5 = f19269v
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r4, r5, r3, r6)
            android.app.Notification$Builder r4 = new android.app.Notification$Builder
            android.content.Context r5 = r7.f19284p
            r4.<init>(r5)
            android.app.Notification$Builder r0 = r4.setContentTitle(r0)
            android.app.Notification$BigTextStyle r4 = new android.app.Notification$BigTextStyle
            r4.<init>()
            android.app.Notification$BigTextStyle r8 = r4.bigText(r8)
            android.app.Notification$Builder r8 = r0.setStyle(r8)
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            android.app.Notification$Builder r8 = r8.setSmallIcon(r0)
            android.app.Notification$Builder r8 = r8.setContentIntent(r3)
            android.app.Notification$Builder r8 = r8.setAutoCancel(r2)
            android.app.Notification r8 = r8.build()
            android.app.NotificationManager r0 = f19268u
            int r2 = f19269v
            r0.notify(r2, r8)
        L_0x0121:
            android.widget.Toast r8 = r7.f19288t
            com.p280ss.android.common.util.C19287b.m63206a(r8)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r4
            r7.f19275f = r2
            android.os.Handler r8 = r7.f19286r
            r8.sendEmptyMessageDelayed(r1, r4)
        L_0x0134:
            return
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.C6772a.handleMsg(android.os.Message):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040 A[Catch:{ Exception -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16563a(org.json.JSONObject r4) {
        /*
            r3 = this;
            boolean r0 = r3.f19271b
            if (r0 != 0) goto L_0x0009
            boolean r0 = r3.f19272c
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r0 = r3.f19272c
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r3.f19273d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "__demandId__"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0043 }
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.f19283o     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x0027
            goto L_0x003a
        L_0x0027:
            java.lang.String r0 = "category"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "event_v3"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x003e
            boolean r1 = r3.m20934e(r4)     // Catch:{ Exception -> 0x0043 }
            goto L_0x003e
        L_0x003a:
            boolean r1 = r3.m20932c(r4)     // Catch:{ Exception -> 0x0043 }
        L_0x003e:
            if (r1 != 0) goto L_0x0043
            r3.m20933d(r4)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r3.f19276g
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.C6772a.mo16563a(org.json.JSONObject):void");
    }

    /* renamed from: b */
    private void m20930b(String str, JSONObject jSONObject) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (1.0 埋点) ");
        m20926a(str, sb.toString(), jSONObject, false);
    }

    /* renamed from: a */
    private void m20927a(String str, JSONObject jSONObject) throws Exception {
        JSONObject optJSONObject = jSONObject.optJSONObject("matchResult");
        if (optJSONObject != null) {
            if ("success".equals(optJSONObject.optString("check"))) {
                m20929a(str, optJSONObject, jSONObject, true);
            } else {
                m20928a(str, optJSONObject, jSONObject);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" : error");
            m20926a(str, sb.toString(), jSONObject, true);
        }
    }

    /* renamed from: a */
    private void m20928a(String str, JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONArray optJSONArray = jSONObject.optJSONArray("check");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : 错误已发送至验证平台");
        arrayList.add(sb2.toString());
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (!"check".equals(str2) && !"platform".equals(str2) && !"warning".equals(str2)) {
                Object opt = jSONObject.opt(str2);
                if (opt != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(" : ");
                    sb3.append(opt);
                    arrayList.add(sb3.toString());
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("warning");
        if (optJSONArray2 != null) {
            arrayList.add("warning:");
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList.add(optJSONArray2.getString(i2));
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb.append((String) arrayList.get(i3));
            if (i3 != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        m20926a(str, sb.toString(), jSONObject2, true);
    }

    /* renamed from: a */
    private void m20926a(String str, String str2, JSONObject jSONObject, boolean z) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("toast", str2);
            jSONObject2.put("raw", jSONObject);
            jSONObject2.put("event", str);
            jSONObject2.put("v3", z);
            m20924a(jSONObject2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m20929a(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) throws Exception {
        StringBuilder sb = new StringBuilder();
        Iterator keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (!"check".equals(str2) && !"platform".equals(str2)) {
                Object opt = jSONObject.opt(str2);
                if (opt != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(" : ");
                    sb2.append(opt);
                    arrayList.add(sb2.toString());
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" : success \n");
        sb3.append(sb.toString());
        m20926a(str, sb3.toString(), jSONObject2, true);
    }

    /* renamed from: a */
    private void m20925a(String str, String str2, List<Pair<String, String>> list, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject(C6317k.m19580a().mo15151a(str2, list));
            if (z2) {
                if (z) {
                    m20927a(str, jSONObject);
                    return;
                }
                m20930b(str, jSONObject);
            }
        } catch (Exception unused) {
            if (z2) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" : error");
                    m20926a(str, sb.toString(), (JSONObject) null, true);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(1.0 埋点) : error");
                m20926a(str, sb2.toString(), (JSONObject) null, false);
            }
        }
    }
}
