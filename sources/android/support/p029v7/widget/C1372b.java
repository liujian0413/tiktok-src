package android.support.p029v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.b */
class C1372b extends DataSetObservable {

    /* renamed from: a */
    static final String f5372a = "b";

    /* renamed from: e */
    private static final Object f5373e = new Object();

    /* renamed from: f */
    private static final Map<String, C1372b> f5374f = new HashMap();

    /* renamed from: b */
    final Context f5375b;

    /* renamed from: c */
    final String f5376c;

    /* renamed from: d */
    boolean f5377d = true;

    /* renamed from: g */
    private final Object f5378g = new Object();

    /* renamed from: h */
    private final List<C1373a> f5379h = new ArrayList();

    /* renamed from: i */
    private final List<C1376d> f5380i = new ArrayList();

    /* renamed from: j */
    private Intent f5381j;

    /* renamed from: k */
    private C1374b f5382k = new C1375c();

    /* renamed from: l */
    private int f5383l = 50;

    /* renamed from: m */
    private boolean f5384m = false;

    /* renamed from: n */
    private boolean f5385n = true;

    /* renamed from: o */
    private boolean f5386o = false;

    /* renamed from: p */
    private C1377e f5387p;

    /* renamed from: android.support.v7.widget.b$a */
    public static final class C1373a implements Comparable<C1373a> {

        /* renamed from: a */
        public final ResolveInfo f5388a;

        /* renamed from: b */
        public float f5389b;

        public final int hashCode() {
            return Float.floatToIntBits(this.f5389b) + 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f5388a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f5389b));
            sb.append("]");
            return sb.toString();
        }

        public C1373a(ResolveInfo resolveInfo) {
            this.f5388a = resolveInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C1373a aVar) {
            return Float.floatToIntBits(aVar.f5389b) - Float.floatToIntBits(this.f5389b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (Float.floatToIntBits(this.f5389b) != Float.floatToIntBits(((C1373a) obj).f5389b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.b$b */
    public interface C1374b {
        /* renamed from: a */
        void mo6430a(Intent intent, List<C1373a> list, List<C1376d> list2);
    }

    /* renamed from: android.support.v7.widget.b$c */
    static final class C1375c implements C1374b {

        /* renamed from: a */
        private final Map<ComponentName, C1373a> f5390a = new HashMap();

        C1375c() {
        }

        /* renamed from: a */
        public final void mo6430a(Intent intent, List<C1373a> list, List<C1376d> list2) {
            Map<ComponentName, C1373a> map = this.f5390a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1373a aVar = (C1373a) list.get(i);
                aVar.f5389b = 0.0f;
                map.put(new ComponentName(aVar.f5388a.activityInfo.packageName, aVar.f5388a.activityInfo.name), aVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C1376d dVar = (C1376d) list2.get(size2);
                C1373a aVar2 = (C1373a) map.get(dVar.f5391a);
                if (aVar2 != null) {
                    aVar2.f5389b += dVar.f5393c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: android.support.v7.widget.b$d */
    public static final class C1376d {

        /* renamed from: a */
        public final ComponentName f5391a;

        /* renamed from: b */
        public final long f5392b;

        /* renamed from: c */
        public final float f5393c;

        public final int hashCode() {
            int i;
            if (this.f5391a == null) {
                i = 0;
            } else {
                i = this.f5391a.hashCode();
            }
            return ((((i + 31) * 31) + ((int) (this.f5392b ^ (this.f5392b >>> 32)))) * 31) + Float.floatToIntBits(this.f5393c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f5391a);
            sb.append("; time:");
            sb.append(this.f5392b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f5393c));
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1376d dVar = (C1376d) obj;
            if (this.f5391a == null) {
                if (dVar.f5391a != null) {
                    return false;
                }
            } else if (!this.f5391a.equals(dVar.f5391a)) {
                return false;
            }
            if (this.f5392b == dVar.f5392b && Float.floatToIntBits(this.f5393c) == Float.floatToIntBits(dVar.f5393c)) {
                return true;
            }
            return false;
        }

        public C1376d(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C1376d(ComponentName componentName, long j, float f) {
            this.f5391a = componentName;
            this.f5392b = j;
            this.f5393c = f;
        }
    }

    /* renamed from: android.support.v7.widget.b$e */
    public interface C1377e {
        /* renamed from: a */
        boolean mo6434a(C1372b bVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.b$f */
    final class C1378f extends AsyncTask<Object, Void, Void> {
        C1378f() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r12 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
            if (r12 == null) goto L_0x0098;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.b r4 = android.support.p029v7.widget.C1372b.this     // Catch:{ FileNotFoundException -> 0x0099 }
                android.content.Context r4 = r4.f5375b     // Catch:{ FileNotFoundException -> 0x0099 }
                java.io.FileOutputStream r12 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x0099 }
                org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
                r4.setOutput(r12, r3)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r5 = "historical-records"
                r4.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r6 = 0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                android.support.v7.widget.b$d r7 = (android.support.p029v7.widget.C1372b.C1376d) r7     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "historical-record"
                r4.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f5391a     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "time"
                long r9 = r7.f5392b     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r8 = "weight"
                float r7 = r7.f5393c     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                java.lang.String r7 = "historical-record"
                r4.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r4.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                r4.endDocument()     // Catch:{ IllegalArgumentException -> 0x0090, IllegalStateException -> 0x0088, IOException -> 0x0080, all -> 0x0075 }
                android.support.v7.widget.b r0 = android.support.p029v7.widget.C1372b.this
                r0.f5377d = r2
                if (r12 == 0) goto L_0x0098
            L_0x0071:
                r12.close()     // Catch:{ IOException -> 0x0098 }
                goto L_0x0098
            L_0x0075:
                r0 = move-exception
                android.support.v7.widget.b r1 = android.support.p029v7.widget.C1372b.this
                r1.f5377d = r2
                if (r12 == 0) goto L_0x007f
                r12.close()     // Catch:{ IOException -> 0x007f }
            L_0x007f:
                throw r0
            L_0x0080:
                android.support.v7.widget.b r0 = android.support.p029v7.widget.C1372b.this
                r0.f5377d = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0088:
                android.support.v7.widget.b r0 = android.support.p029v7.widget.C1372b.this
                r0.f5377d = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0090:
                android.support.v7.widget.b r0 = android.support.p029v7.widget.C1372b.this
                r0.f5377d = r2
                if (r12 == 0) goto L_0x0098
                goto L_0x0071
            L_0x0098:
                return r3
            L_0x0099:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1372b.C1378f.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: e */
    private void m6784e() {
        boolean g = m6786g() | m6787h();
        m6788i();
        if (g) {
            m6785f();
            notifyChanged();
        }
    }

    /* renamed from: h */
    private boolean m6787h() {
        if (!this.f5377d || !this.f5385n || TextUtils.isEmpty(this.f5376c)) {
            return false;
        }
        this.f5377d = false;
        this.f5384m = true;
        m6789j();
        return true;
    }

    /* renamed from: i */
    private void m6788i() {
        int size = this.f5380i.size() - this.f5383l;
        if (size > 0) {
            this.f5385n = true;
            for (int i = 0; i < size; i++) {
                this.f5380i.remove(0);
            }
        }
    }

    /* renamed from: c */
    public final int mo6424c() {
        int size;
        synchronized (this.f5378g) {
            m6784e();
            size = this.f5380i.size();
        }
        return size;
    }

    /* renamed from: d */
    private void m6783d() {
        if (!this.f5384m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f5385n) {
            this.f5385n = false;
            if (!TextUtils.isEmpty(this.f5376c)) {
                new C1378f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f5380i), this.f5376c});
            }
        }
    }

    /* renamed from: f */
    private boolean m6785f() {
        if (this.f5382k == null || this.f5381j == null || this.f5379h.isEmpty() || this.f5380i.isEmpty()) {
            return false;
        }
        this.f5382k.mo6430a(this.f5381j, this.f5379h, Collections.unmodifiableList(this.f5380i));
        return true;
    }

    /* renamed from: g */
    private boolean m6786g() {
        if (!this.f5386o || this.f5381j == null) {
            return false;
        }
        this.f5386o = false;
        this.f5379h.clear();
        List queryIntentActivities = this.f5375b.getPackageManager().queryIntentActivities(this.f5381j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f5379h.add(new C1373a((ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: b */
    public final ResolveInfo mo6423b() {
        synchronized (this.f5378g) {
            m6784e();
            if (this.f5379h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C1373a) this.f5379h.get(0)).f5388a;
            return resolveInfo;
        }
    }

    /* renamed from: a */
    public final int mo6419a() {
        int size;
        synchronized (this.f5378g) {
            m6784e();
            size = this.f5379h.size();
        }
        return size;
    }

    /* renamed from: j */
    private void m6789j() {
        try {
            boolean openFileInput = this.f5375b.openFileInput(this.f5376c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                openFileInput = "historical-records".equals(newPullParser.getName());
                if (openFileInput) {
                    List<C1376d> list = this.f5380i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new C1376d(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused) {
                            }
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (XmlPullParserException unused2) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (IOException unused4) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
            } finally {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused6) {
                    }
                }
            }
        } catch (FileNotFoundException unused7) {
        }
    }

    /* renamed from: a */
    private boolean m6782a(C1376d dVar) {
        boolean add = this.f5380i.add(dVar);
        if (add) {
            this.f5385n = true;
            m6788i();
            m6783d();
            m6785f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public final Intent mo6422b(int i) {
        synchronized (this.f5378g) {
            if (this.f5381j == null) {
                return null;
            }
            m6784e();
            C1373a aVar = (C1373a) this.f5379h.get(i);
            ComponentName componentName = new ComponentName(aVar.f5388a.activityInfo.packageName, aVar.f5388a.activityInfo.name);
            Intent intent = new Intent(this.f5381j);
            intent.setComponent(componentName);
            if (this.f5387p != null) {
                if (this.f5387p.mo6434a(this, new Intent(intent))) {
                    return null;
                }
            }
            m6782a(new C1376d(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: c */
    public final void mo6425c(int i) {
        float f;
        synchronized (this.f5378g) {
            m6784e();
            C1373a aVar = (C1373a) this.f5379h.get(i);
            C1373a aVar2 = (C1373a) this.f5379h.get(0);
            if (aVar2 != null) {
                f = (aVar2.f5389b - aVar.f5389b) + 5.0f;
            } else {
                f = 1.0f;
            }
            m6782a(new C1376d(new ComponentName(aVar.f5388a.activityInfo.packageName, aVar.f5388a.activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* renamed from: a */
    public final int mo6420a(ResolveInfo resolveInfo) {
        synchronized (this.f5378g) {
            m6784e();
            List<C1373a> list = this.f5379h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C1373a) list.get(i)).f5388a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final ResolveInfo mo6421a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f5378g) {
            m6784e();
            resolveInfo = ((C1373a) this.f5379h.get(i)).f5388a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public static C1372b m6781a(Context context, String str) {
        C1372b bVar;
        synchronized (f5373e) {
            bVar = (C1372b) f5374f.get(str);
            if (bVar == null) {
                bVar = new C1372b(context, str);
                f5374f.put(str, bVar);
            }
        }
        return bVar;
    }

    private C1372b(Context context, String str) {
        this.f5375b = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f5376c = str;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".xml");
        this.f5376c = sb.toString();
    }
}
