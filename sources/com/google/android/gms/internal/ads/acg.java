package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.util.C15333p;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class acg implements acf {

    /* renamed from: a */
    private final Object f39971a = new Object();

    /* renamed from: b */
    private boolean f39972b;

    /* renamed from: c */
    private final List<Runnable> f39973c = new ArrayList();

    /* renamed from: d */
    private agj<?> f39974d;

    /* renamed from: e */
    private bux f39975e = null;

    /* renamed from: f */
    private SharedPreferences f39976f;

    /* renamed from: g */
    private Editor f39977g;

    /* renamed from: h */
    private boolean f39978h = false;

    /* renamed from: i */
    private boolean f39979i = true;

    /* renamed from: j */
    private String f39980j;

    /* renamed from: k */
    private String f39981k;

    /* renamed from: l */
    private boolean f39982l = false;

    /* renamed from: m */
    private String f39983m = "";

    /* renamed from: n */
    private long f39984n = 0;

    /* renamed from: o */
    private long f39985o = 0;

    /* renamed from: p */
    private long f39986p = 0;

    /* renamed from: q */
    private int f39987q = -1;

    /* renamed from: r */
    private int f39988r = 0;

    /* renamed from: s */
    private Set<String> f39989s = Collections.emptySet();

    /* renamed from: t */
    private JSONObject f39990t = new JSONObject();

    /* renamed from: u */
    private boolean f39991u = true;

    /* renamed from: v */
    private boolean f39992v = true;

    /* renamed from: w */
    private String f39993w = null;

    /* renamed from: a */
    public final void mo39165a(Context context, String str, boolean z) {
        this.f39974d = acj.m45508a((Runnable) new ach(this, context, "admob"));
        this.f39972b = true;
    }

    /* renamed from: p */
    private final void m45473p() {
        if (this.f39974d != null && !this.f39974d.isDone()) {
            try {
                this.f39974d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                acd.m45780c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                acd.m45778b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: q */
    private final Bundle m45474q() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f39971a) {
            bundle.putBoolean("use_https", this.f39979i);
            bundle.putBoolean("content_url_opted_out", this.f39991u);
            bundle.putBoolean("content_vertical_opted_out", this.f39992v);
            bundle.putBoolean("auto_collect_location", this.f39982l);
            bundle.putInt("version_code", this.f39988r);
            bundle.putStringArray("never_pool_slots", (String[]) this.f39989s.toArray(new String[0]));
            bundle.putString("app_settings_json", this.f39983m);
            bundle.putLong("app_settings_last_update_ms", this.f39984n);
            bundle.putLong("app_last_background_time_ms", this.f39985o);
            bundle.putInt("request_in_session_count", this.f39987q);
            bundle.putLong("first_ad_req_time_ms", this.f39986p);
            bundle.putString("native_advanced_settings", this.f39990t.toString());
            bundle.putString("display_cutout", this.f39993w);
            if (this.f39980j != null) {
                bundle.putString("content_url_hashes", this.f39980j);
            }
            if (this.f39981k != null) {
                bundle.putString("content_vertical_hashes", this.f39981k);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private final void m45472a(Bundle bundle) {
        acj.f39998a.execute(new aci(this));
    }

    /* renamed from: a */
    public final bux mo39133a() {
        if (!this.f39972b) {
            return null;
        }
        if (mo39146c() && mo39150e()) {
            return null;
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43743Q)).booleanValue()) {
            return null;
        }
        synchronized (this.f39971a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f39975e == null) {
                this.f39975e = new bux();
            }
            this.f39975e.mo41374a();
            acd.m45781d("start fetching content...");
            bux bux = this.f39975e;
            return bux;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39138a(boolean r4) {
        /*
            r3 = this;
            r3.m45473p()
            java.lang.Object r0 = r3.f39971a
            monitor-enter(r0)
            boolean r1 = r3.f39979i     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f39979i = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f39978h     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.m45472a(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acg.mo39138a(boolean):void");
    }

    /* renamed from: b */
    public final boolean mo39143b() {
        boolean z;
        m45473p();
        synchronized (this.f39971a) {
            if (!this.f39979i) {
                if (!this.f39978h) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo39142b(boolean z) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39991u != z) {
                this.f39991u = z;
                if (this.f39977g != null) {
                    this.f39977g.putBoolean("content_url_opted_out", z);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f39991u);
                bundle.putBoolean("content_vertical_opted_out", this.f39992v);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo39146c() {
        boolean z;
        m45473p();
        synchronized (this.f39971a) {
            z = this.f39991u;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39136a(java.lang.String r4) {
        /*
            r3 = this;
            r3.m45473p()
            java.lang.Object r0 = r3.f39971a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f39980j     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f39980j = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m45472a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acg.mo39136a(java.lang.String):void");
    }

    /* renamed from: d */
    public final String mo39147d() {
        String str;
        m45473p();
        synchronized (this.f39971a) {
            str = this.f39980j;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo39145c(boolean z) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39992v != z) {
                this.f39992v = z;
                if (this.f39977g != null) {
                    this.f39977g.putBoolean("content_vertical_opted_out", z);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f39991u);
                bundle.putBoolean("content_vertical_opted_out", this.f39992v);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo39150e() {
        boolean z;
        m45473p();
        synchronized (this.f39971a) {
            z = this.f39992v;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39141b(java.lang.String r4) {
        /*
            r3 = this;
            r3.m45473p()
            java.lang.Object r0 = r3.f39971a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f39981k     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f39981k = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f39977g     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m45472a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acg.mo39141b(java.lang.String):void");
    }

    /* renamed from: f */
    public final String mo39152f() {
        String str;
        m45473p();
        synchronized (this.f39971a) {
            str = this.f39981k;
        }
        return str;
    }

    /* renamed from: d */
    public final void mo39149d(boolean z) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39982l != z) {
                this.f39982l = z;
                if (this.f39977g != null) {
                    this.f39977g.putBoolean("auto_collect_location", z);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo39155g() {
        boolean z;
        m45473p();
        synchronized (this.f39971a) {
            z = this.f39982l;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo39134a(int i) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39988r != i) {
                this.f39988r = i;
                if (this.f39977g != null) {
                    this.f39977g.putInt("version_code", i);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: h */
    public final int mo39156h() {
        int i;
        m45473p();
        synchronized (this.f39971a) {
            i = this.f39988r;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo39144c(String str) {
        m45473p();
        synchronized (this.f39971a) {
            if (!this.f39989s.contains(str)) {
                this.f39989s.add(str);
                if (this.f39977g != null) {
                    this.f39977g.putStringSet("never_pool_slots", this.f39989s);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f39989s.toArray(new String[0]));
                m45472a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo39148d(String str) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39989s.contains(str)) {
                this.f39989s.remove(str);
                if (this.f39977g != null) {
                    this.f39977g.putStringSet("never_pool_slots", this.f39989s);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f39989s.toArray(new String[0]));
                m45472a(bundle);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo39151e(String str) {
        boolean contains;
        m45473p();
        synchronized (this.f39971a) {
            contains = this.f39989s.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39153f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m45473p()
            java.lang.Object r0 = r5.f39971a
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ all -> 0x0060 }
            long r1 = r1.mo38684a()     // Catch:{ all -> 0x0060 }
            r5.f39984n = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.f39983m     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.f39983m = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f39977g     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f39977g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f39977g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f39977g     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.m45472a(r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.f39973c     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acg.mo39153f(java.lang.String):void");
    }

    /* renamed from: i */
    public final abn mo39157i() {
        abn abn;
        m45473p();
        synchronized (this.f39971a) {
            abn = new abn(this.f39983m, this.f39984n);
        }
        return abn;
    }

    /* renamed from: a */
    public final void mo39135a(long j) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39985o != j) {
                this.f39985o = j;
                if (this.f39977g != null) {
                    this.f39977g.putLong("app_last_background_time_ms", j);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: j */
    public final long mo39158j() {
        long j;
        m45473p();
        synchronized (this.f39971a) {
            j = this.f39985o;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo39139b(int i) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39987q != i) {
                this.f39987q = i;
                if (this.f39977g != null) {
                    this.f39977g.putInt("request_in_session_count", i);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: k */
    public final int mo39159k() {
        int i;
        m45473p();
        synchronized (this.f39971a) {
            i = this.f39987q;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo39140b(long j) {
        m45473p();
        synchronized (this.f39971a) {
            if (this.f39986p != j) {
                this.f39986p = j;
                if (this.f39977g != null) {
                    this.f39977g.putLong("first_ad_req_time_ms", j);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m45472a(bundle);
            }
        }
    }

    /* renamed from: l */
    public final long mo39160l() {
        long j;
        m45473p();
        synchronized (this.f39971a) {
            j = this.f39986p;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo39137a(String str, String str2, boolean z) {
        m45473p();
        synchronized (this.f39971a) {
            JSONArray optJSONArray = this.f39990t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C14793ay.m42901g().mo38684a());
                optJSONArray.put(length, jSONObject);
                this.f39990t.put(str, optJSONArray);
            } catch (JSONException e) {
                acd.m45780c("Could not update native advanced settings", e);
            }
            if (this.f39977g != null) {
                this.f39977g.putString("native_advanced_settings", this.f39990t.toString());
                this.f39977g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f39990t.toString());
            m45472a(bundle);
        }
    }

    /* renamed from: m */
    public final JSONObject mo39161m() {
        JSONObject jSONObject;
        m45473p();
        synchronized (this.f39971a) {
            jSONObject = this.f39990t;
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final void mo39162n() {
        m45473p();
        synchronized (this.f39971a) {
            this.f39990t = new JSONObject();
            if (this.f39977g != null) {
                this.f39977g.remove("native_advanced_settings");
                this.f39977g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m45472a(bundle);
        }
    }

    /* renamed from: o */
    public final String mo39163o() {
        String str;
        m45473p();
        synchronized (this.f39971a) {
            str = this.f39993w;
        }
        return str;
    }

    /* renamed from: g */
    public final void mo39154g(String str) {
        m45473p();
        synchronized (this.f39971a) {
            if (!TextUtils.equals(this.f39993w, str)) {
                this.f39993w = str;
                if (this.f39977g != null) {
                    this.f39977g.putString("display_cutout", str);
                    this.f39977g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                m45472a(bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39164a(Context context, String str) {
        boolean z = false;
        SharedPreferences a = C7285c.m22838a(context, str, 0);
        Editor edit = a.edit();
        synchronized (this.f39971a) {
            this.f39976f = a;
            this.f39977g = edit;
            if (C15333p.m44601h() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.f39978h = z;
            this.f39979i = this.f39976f.getBoolean("use_https", this.f39979i);
            this.f39991u = this.f39976f.getBoolean("content_url_opted_out", this.f39991u);
            this.f39980j = this.f39976f.getString("content_url_hashes", this.f39980j);
            this.f39982l = this.f39976f.getBoolean("auto_collect_location", this.f39982l);
            this.f39992v = this.f39976f.getBoolean("content_vertical_opted_out", this.f39992v);
            this.f39981k = this.f39976f.getString("content_vertical_hashes", this.f39981k);
            this.f39988r = this.f39976f.getInt("version_code", this.f39988r);
            this.f39983m = this.f39976f.getString("app_settings_json", this.f39983m);
            this.f39984n = this.f39976f.getLong("app_settings_last_update_ms", this.f39984n);
            this.f39985o = this.f39976f.getLong("app_last_background_time_ms", this.f39985o);
            this.f39987q = this.f39976f.getInt("request_in_session_count", this.f39987q);
            this.f39986p = this.f39976f.getLong("first_ad_req_time_ms", this.f39986p);
            this.f39989s = this.f39976f.getStringSet("never_pool_slots", this.f39989s);
            this.f39993w = this.f39976f.getString("display_cutout", this.f39993w);
            try {
                this.f39990t = new JSONObject(this.f39976f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                acd.m45780c("Could not convert native advanced settings to json object", e);
            }
            m45472a(m45474q());
        }
    }
}
