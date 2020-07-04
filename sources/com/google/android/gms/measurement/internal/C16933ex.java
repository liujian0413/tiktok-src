package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16486dv;
import com.google.android.gms.internal.measurement.C16487dw;
import com.google.android.gms.internal.measurement.C16490dz;
import com.google.android.gms.internal.measurement.C16498eg;
import com.google.android.gms.internal.measurement.C16499eh;
import com.google.android.gms.internal.measurement.C16501ej;
import com.google.android.gms.internal.measurement.C16678ko;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ex */
final class C16933ex extends C16911ec {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f47360b = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String[] f47361c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f47362d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String[] f47363e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f47364f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f47365g = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: h */
    private final C16937fa f47366h = new C16937fa(this, mo43581m(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C16906dy f47367i = new C16906dy(mo43580l());

    C16933ex(C16912ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        return false;
    }

    /* renamed from: e */
    public final void mo44108e() {
        mo43843j();
        mo44115w().beginTransaction();
    }

    /* renamed from: u */
    public final void mo44113u() {
        mo43843j();
        mo44115w().setTransactionSuccessful();
    }

    /* renamed from: v */
    public final void mo44114v() {
        mo43843j();
        mo44115w().endTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m56150b(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.mo44115w()
            r1 = 0
            android.database.Cursor r5 = r0.rawQuery(r4, r5)     // Catch:{ SQLiteException -> 0x002a }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r5 == 0) goto L_0x0019
            r5.close()
        L_0x0019:
            return r0
        L_0x001a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            throw r0     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0037
        L_0x0024:
            r0 = move-exception
            r1 = r5
            goto L_0x002b
        L_0x0027:
            r4 = move-exception
            r5 = r1
            goto L_0x0037
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            com.google.android.gms.measurement.internal.r r5 = r3.mo43585q()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.measurement.internal.t r5 = r5.f47487a     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "Database error"
            r5.mo44162a(r2, r4, r0)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0037:
            if (r5 == 0) goto L_0x003c
            r5.close()
        L_0x003c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.m56150b(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m56143a(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.mo44115w()
            r1 = 0
            android.database.Cursor r4 = r0.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0028 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r0 == 0) goto L_0x001a
            r5 = 0
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r4 == 0) goto L_0x0019
            r4.close()
        L_0x0019:
            return r5
        L_0x001a:
            if (r4 == 0) goto L_0x001f
            r4.close()
        L_0x001f:
            return r5
        L_0x0020:
            r3 = move-exception
            r1 = r4
            goto L_0x0035
        L_0x0023:
            r5 = move-exception
            r1 = r4
            goto L_0x0029
        L_0x0026:
            r3 = move-exception
            goto L_0x0035
        L_0x0028:
            r5 = move-exception
        L_0x0029:
            com.google.android.gms.measurement.internal.r r4 = r2.mo43585q()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Database error"
            r4.mo44162a(r6, r3, r5)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.m56143a(java.lang.String, java.lang.String[], long):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final SQLiteDatabase mo44115w() {
        mo43571c();
        try {
            return this.f47366h.getWritableDatabase();
        } catch (SQLiteException e) {
            mo43585q().f47490d.mo44161a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C16881d mo44083a(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r15 = r24
            com.google.android.gms.common.internal.C15267r.m44386a(r23)
            com.google.android.gms.common.internal.C15267r.m44386a(r24)
            r22.mo43571c()
            r22.mo43843j()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r22.mo44115w()     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r2 = "events"
            r0 = 8
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "lifetime_count"
            r9 = 0
            r3[r9] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "current_bundle_count"
            r10 = 1
            r3[r10] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_fire_timestamp"
            r11 = 2
            r3[r11] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_bundled_timestamp"
            r12 = 3
            r3[r12] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_bundled_day"
            r13 = 4
            r3[r13] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_sampled_complex_event_id"
            r14 = 5
            r3[r14] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_sampling_rate"
            r8 = 6
            r3[r8] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r0 = "last_exempt_from_sampling"
            r7 = 7
            r3[r7] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            r5[r9] = r23     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            r6 = 0
            r0 = 0
            r17 = 0
            r7 = r0
            r0 = 6
            r8 = r17
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x010c, all -> 0x0108 }
            boolean r1 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r1 != 0) goto L_0x0062
            if (r8 == 0) goto L_0x0061
            r8.close()
        L_0x0061:
            return r16
        L_0x0062:
            long r4 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            long r6 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            long r19 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            boolean r1 = r8.isNull(r12)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r1 == 0) goto L_0x0078
            r1 = 0
        L_0x0076:
            r11 = r1
            goto L_0x007d
        L_0x0078:
            long r1 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            goto L_0x0076
        L_0x007d:
            boolean r1 = r8.isNull(r13)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r1 == 0) goto L_0x0086
            r13 = r16
            goto L_0x008f
        L_0x0086:
            long r1 = r8.getLong(r13)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r13 = r1
        L_0x008f:
            boolean r1 = r8.isNull(r14)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r1 == 0) goto L_0x0098
            r14 = r16
            goto L_0x00a1
        L_0x0098:
            long r1 = r8.getLong(r14)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r14 = r1
        L_0x00a1:
            boolean r1 = r8.isNull(r0)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r1 == 0) goto L_0x00ab
            r0 = r16
        L_0x00a9:
            r1 = 7
            goto L_0x00b4
        L_0x00ab:
            long r0 = r8.getLong(r0)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            goto L_0x00a9
        L_0x00b4:
            boolean r2 = r8.isNull(r1)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            if (r2 != 0) goto L_0x00cc
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r17 = 1
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            r9 = 1
        L_0x00c5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r17 = r1
            goto L_0x00ce
        L_0x00cc:
            r17 = r16
        L_0x00ce:
            com.google.android.gms.measurement.internal.d r18 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r1 = r18
            r2 = r23
            r3 = r24
            r21 = r8
            r8 = r19
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r0
            r15 = r17
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x00fe }
            boolean r0 = r21.moveToNext()     // Catch:{ SQLiteException -> 0x00fe }
            if (r0 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.r r0 = r22.mo43585q()     // Catch:{ SQLiteException -> 0x00fe }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteException -> 0x00fe }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C16953r.m56340a(r23)     // Catch:{ SQLiteException -> 0x00fe }
            r0.mo44161a(r1, r2)     // Catch:{ SQLiteException -> 0x00fe }
        L_0x00f8:
            if (r21 == 0) goto L_0x00fd
            r21.close()
        L_0x00fd:
            return r18
        L_0x00fe:
            r0 = move-exception
            goto L_0x010f
        L_0x0100:
            r0 = move-exception
            r21 = r8
            goto L_0x012f
        L_0x0104:
            r0 = move-exception
            r21 = r8
            goto L_0x010f
        L_0x0108:
            r0 = move-exception
            r21 = r16
            goto L_0x012f
        L_0x010c:
            r0 = move-exception
            r21 = r16
        L_0x010f:
            com.google.android.gms.measurement.internal.r r1 = r22.mo43585q()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r23)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.p r4 = r22.mo43582n()     // Catch:{ all -> 0x012e }
            r5 = r24
            java.lang.String r4 = r4.mo44153a(r5)     // Catch:{ all -> 0x012e }
            r1.mo44163a(r2, r3, r4, r0)     // Catch:{ all -> 0x012e }
            if (r21 == 0) goto L_0x012d
            r21.close()
        L_0x012d:
            return r16
        L_0x012e:
            r0 = move-exception
        L_0x012f:
            if (r21 == 0) goto L_0x0134
            r21.close()
        L_0x0134:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44083a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* renamed from: a */
    public final void mo44090a(C16881d dVar) {
        C15267r.m44384a(dVar);
        mo43571c();
        mo43843j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", dVar.f47190a);
        contentValues.put("name", dVar.f47191b);
        contentValues.put("lifetime_count", Long.valueOf(dVar.f47192c));
        contentValues.put("current_bundle_count", Long.valueOf(dVar.f47193d));
        contentValues.put("last_fire_timestamp", Long.valueOf(dVar.f47194e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(dVar.f47195f));
        contentValues.put("last_bundled_day", dVar.f47196g);
        contentValues.put("last_sampled_complex_event_id", dVar.f47197h);
        contentValues.put("last_sampling_rate", dVar.f47198i);
        contentValues.put("last_exempt_from_sampling", (dVar.f47199j == null || !dVar.f47199j.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo44115w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo43585q().f47487a.mo44161a("Failed to insert/update event aggregates (got -1). appId", C16953r.m56340a(dVar.f47190a));
            }
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Error storing event aggregates. appId", C16953r.m56340a(dVar.f47190a), e);
        }
    }

    /* renamed from: b */
    public final void mo44101b(String str, String str2) {
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        mo43571c();
        mo43843j();
        try {
            mo43585q().f47495i.mo44161a("Deleted user attribute rows", Integer.valueOf(mo44115w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44163a("Error deleting user attribute. appId", C16953r.m56340a(str), mo43582n().mo44155c(str2), e);
        }
    }

    /* renamed from: a */
    public final boolean mo44096a(C16921el elVar) {
        C15267r.m44384a(elVar);
        mo43571c();
        mo43843j();
        if (mo44103c(elVar.f47315a, elVar.f47317c) == null) {
            if (C16922em.m55963a(elVar.f47317c)) {
                if (m56150b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{elVar.f47315a}) >= 25) {
                    return false;
                }
            } else {
                if (m56150b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{elVar.f47315a, elVar.f47316b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", elVar.f47315a);
        contentValues.put("origin", elVar.f47316b);
        contentValues.put("name", elVar.f47317c);
        contentValues.put("set_timestamp", Long.valueOf(elVar.f47318d));
        m56146a(contentValues, "value", elVar.f47319e);
        try {
            if (mo44115w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo43585q().f47487a.mo44161a("Failed to insert/update user property (got -1). appId", C16953r.m56340a(elVar.f47315a));
            }
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Error storing user property. appId", C16953r.m56340a(elVar.f47315a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C16921el mo44103c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C15267r.m44386a(r19)
            com.google.android.gms.common.internal.C15267r.m44386a(r20)
            r18.mo43571c()
            r18.mo43843j()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo44115w()     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007d, all -> 0x0079 }
            if (r0 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0043
            r10.close()
        L_0x0043:
            return r9
        L_0x0044:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007d, all -> 0x0079 }
            r11 = r18
            java.lang.Object r7 = r11.m56145a(r10, r2)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.el r0 = new com.google.android.gms.measurement.internal.el     // Catch:{ SQLiteException -> 0x0077 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0077 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0071
            com.google.android.gms.measurement.internal.r r1 = r18.mo43585q()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r19)     // Catch:{ SQLiteException -> 0x0077 }
            r1.mo44161a(r2, r3)     // Catch:{ SQLiteException -> 0x0077 }
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r10.close()
        L_0x0076:
            return r0
        L_0x0077:
            r0 = move-exception
            goto L_0x008a
        L_0x0079:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x007d:
            r0 = move-exception
            r11 = r18
            goto L_0x008a
        L_0x0081:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a8
        L_0x0086:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x008a:
            com.google.android.gms.measurement.internal.r r1 = r18.mo43585q()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r19)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.p r4 = r18.mo43582n()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.mo44155c(r8)     // Catch:{ all -> 0x00a7 }
            r1.mo44163a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            return r9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44103c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.el");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C16921el> mo44086a(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.C15267r.m44386a(r23)
            r22.mo43571c()
            r22.mo43843j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.mo44115w()     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            r6[r11] = r23     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            if (r3 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r18 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            r3 = r22
            java.lang.Object r21 = r3.m56145a(r2, r14)     // Catch:{ SQLiteException -> 0x0089 }
            if (r21 != 0) goto L_0x0072
            com.google.android.gms.measurement.internal.r r4 = r22.mo43585q()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C16953r.m56340a(r23)     // Catch:{ SQLiteException -> 0x0089 }
            r4.mo44161a(r5, r6)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x007d
        L_0x0072:
            com.google.android.gms.measurement.internal.el r4 = new com.google.android.gms.measurement.internal.el     // Catch:{ SQLiteException -> 0x0089 }
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SQLiteException -> 0x0089 }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r4 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0088
            r2.close()
        L_0x0088:
            return r0
        L_0x0089:
            r0 = move-exception
            goto L_0x009c
        L_0x008b:
            r0 = move-exception
            r3 = r22
            goto L_0x00b2
        L_0x008f:
            r0 = move-exception
            r3 = r22
            goto L_0x009c
        L_0x0093:
            r0 = move-exception
            r3 = r22
            r2 = r1
            goto L_0x00b2
        L_0x0098:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L_0x009c:
            com.google.android.gms.measurement.internal.r r4 = r22.mo43585q()     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C16953r.m56340a(r23)     // Catch:{ all -> 0x00b1 }
            r4.mo44162a(r5, r6, r0)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            return r1
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()
        L_0x00b7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44086a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0123, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r14 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C16921el> mo44088a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C15267r.m44386a(r22)
            r21.mo43571c()
            r21.mo43843j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0123, all -> 0x011f }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x011f }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x011f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x011b, all -> 0x011f }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x011b, all -> 0x011f }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x011b, all -> 0x011f }
            if (r5 != 0) goto L_0x0037
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            r14 = r21
            goto L_0x012a
        L_0x0037:
            r5 = r23
        L_0x0039:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
        L_0x0051:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo44115w()     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r13 = "user_attributes"
            r2 = 4
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r2 = "name"
            r10 = 0
            r14[r10] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r2 = "set_timestamp"
            r8 = 1
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r2 = "value"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r2 = "origin"
            r14[r3] = r2     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0032, all -> 0x011f }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            if (r4 != 0) goto L_0x0097
            if (r2 == 0) goto L_0x0096
            r2.close()
        L_0x0096:
            return r0
        L_0x0097:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00b1
            com.google.android.gms.measurement.internal.r r3 = r21.mo43585q()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            r3.mo44161a(r4, r6)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            r14 = r21
            goto L_0x00fc
        L_0x00b1:
            java.lang.String r7 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            long r12 = r2.getLong(r8)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0113 }
            r14 = r21
            java.lang.Object r15 = r14.m56145a(r2, r9)     // Catch:{ SQLiteException -> 0x0111 }
            java.lang.String r6 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0111 }
            if (r15 != 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.r r4 = r21.mo43585q()     // Catch:{ SQLiteException -> 0x00de }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ SQLiteException -> 0x00de }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r22)     // Catch:{ SQLiteException -> 0x00de }
            r12 = r24
            r4.mo44163a(r5, r7, r6, r12)     // Catch:{ SQLiteException -> 0x00de }
            r16 = r6
            r12 = 0
            r17 = 1
            r18 = 2
            goto L_0x00f6
        L_0x00de:
            r0 = move-exception
            r5 = r6
            goto L_0x012b
        L_0x00e1:
            com.google.android.gms.measurement.internal.el r5 = new com.google.android.gms.measurement.internal.el     // Catch:{ SQLiteException -> 0x010b }
            r4 = r5
            r3 = r5
            r5 = r22
            r16 = r6
            r17 = 1
            r18 = 2
            r8 = r12
            r12 = 0
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0109 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0109 }
        L_0x00f6:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0109 }
            if (r3 != 0) goto L_0x0102
        L_0x00fc:
            if (r2 == 0) goto L_0x0101
            r2.close()
        L_0x0101:
            return r0
        L_0x0102:
            r5 = r16
            r3 = 3
            r8 = 1
            r9 = 2
            r10 = 0
            goto L_0x0097
        L_0x0109:
            r0 = move-exception
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            r16 = r6
        L_0x010e:
            r5 = r16
            goto L_0x012b
        L_0x0111:
            r0 = move-exception
            goto L_0x012b
        L_0x0113:
            r0 = move-exception
            r14 = r21
            goto L_0x0141
        L_0x0117:
            r0 = move-exception
            r14 = r21
            goto L_0x012b
        L_0x011b:
            r0 = move-exception
            r14 = r21
            goto L_0x0128
        L_0x011f:
            r0 = move-exception
            r14 = r21
            goto L_0x0142
        L_0x0123:
            r0 = move-exception
            r14 = r21
            r11 = r22
        L_0x0128:
            r5 = r23
        L_0x012a:
            r2 = r1
        L_0x012b:
            com.google.android.gms.measurement.internal.r r3 = r21.mo43585q()     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C16953r.m56340a(r22)     // Catch:{ all -> 0x0140 }
            r3.mo44163a(r4, r6, r5, r0)     // Catch:{ all -> 0x0140 }
            if (r2 == 0) goto L_0x013f
            r2.close()
        L_0x013f:
            return r1
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            r1 = r2
        L_0x0142:
            if (r1 == 0) goto L_0x0147
            r1.close()
        L_0x0147:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44088a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo44097a(zzo zzo) {
        C15267r.m44384a(zzo);
        mo43571c();
        mo43843j();
        if (mo44103c(zzo.f47548a, zzo.f47550c.f47522a) == null) {
            if (m56150b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzo.f47548a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzo.f47548a);
        contentValues.put("origin", zzo.f47549b);
        contentValues.put("name", zzo.f47550c.f47522a);
        m56146a(contentValues, "value", zzo.f47550c.mo44178a());
        contentValues.put("active", Boolean.valueOf(zzo.f47552e));
        contentValues.put("trigger_event_name", zzo.f47553f);
        contentValues.put("trigger_timeout", Long.valueOf(zzo.f47555h));
        mo43583o();
        contentValues.put("timed_out_event", C16922em.m55966a((Parcelable) zzo.f47554g));
        contentValues.put("creation_timestamp", Long.valueOf(zzo.f47551d));
        mo43583o();
        contentValues.put("triggered_event", C16922em.m55966a((Parcelable) zzo.f47556i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzo.f47550c.f47523b));
        contentValues.put("time_to_live", Long.valueOf(zzo.f47557j));
        mo43583o();
        contentValues.put("expired_event", C16922em.m55966a((Parcelable) zzo.f47558k));
        try {
            if (mo44115w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo43585q().f47487a.mo44161a("Failed to insert/update conditional user property (got -1)", C16953r.m56340a(zzo.f47548a));
            }
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Error storing conditional user property", C16953r.m56340a(zzo.f47548a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzo mo44104d(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r7 = r34
            com.google.android.gms.common.internal.C15267r.m44386a(r33)
            com.google.android.gms.common.internal.C15267r.m44386a(r34)
            r32.mo43571c()
            r32.mo43843j()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r32.mo44115w()     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r10 = "conditional_properties"
            r0 = 11
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "origin"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "value"
            r2 = 1
            r11[r2] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "active"
            r3 = 2
            r11[r3] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "trigger_event_name"
            r4 = 3
            r11[r4] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "trigger_timeout"
            r5 = 4
            r11[r5] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "timed_out_event"
            r6 = 5
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r11[r14] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r11[r13] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "time_to_live"
            r12 = 9
            r11[r12] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "expired_event"
            r6 = 10
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            java.lang.String r0 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            r13[r1] = r33     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = 9
            r12 = r0
            r0 = 8
            r6 = 7
            r14 = r16
            r0 = 6
            r15 = r17
            r16 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x012b, all -> 0x0126 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            if (r10 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9.close()
        L_0x007d:
            return r8
        L_0x007e:
            java.lang.String r19 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            r10 = r32
            java.lang.Object r11 = r10.m56145a(r9, r2)     // Catch:{ SQLiteException -> 0x011c }
            int r3 = r9.getInt(r3)     // Catch:{ SQLiteException -> 0x011c }
            if (r3 == 0) goto L_0x0091
            r23 = 1
            goto L_0x0093
        L_0x0091:
            r23 = 0
        L_0x0093:
            java.lang.String r24 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x011c }
            long r26 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ej r1 = r32.mo43639f()     // Catch:{ SQLiteException -> 0x011c }
            r2 = 5
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r3 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r1 = r1.mo43880a(r2, r3)     // Catch:{ SQLiteException -> 0x011c }
            r25 = r1
            com.google.android.gms.measurement.internal.zzag r25 = (com.google.android.gms.measurement.internal.zzag) r25     // Catch:{ SQLiteException -> 0x011c }
            long r21 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ej r0 = r32.mo43639f()     // Catch:{ SQLiteException -> 0x011c }
            byte[] r1 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r2 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r0 = r0.mo43880a(r1, r2)     // Catch:{ SQLiteException -> 0x011c }
            r28 = r0
            com.google.android.gms.measurement.internal.zzag r28 = (com.google.android.gms.measurement.internal.zzag) r28     // Catch:{ SQLiteException -> 0x011c }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011c }
            r0 = 9
            long r29 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ej r0 = r32.mo43639f()     // Catch:{ SQLiteException -> 0x011c }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r2 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r0 = r0.mo43880a(r1, r2)     // Catch:{ SQLiteException -> 0x011c }
            r31 = r0
            com.google.android.gms.measurement.internal.zzag r31 = (com.google.android.gms.measurement.internal.zzag) r31     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.zzfv r20 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x011c }
            r1 = r20
            r2 = r34
            r5 = r11
            r6 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.zzo r0 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x011c }
            r17 = r0
            r18 = r33
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r31)     // Catch:{ SQLiteException -> 0x011c }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x011c }
            if (r1 == 0) goto L_0x0116
            com.google.android.gms.measurement.internal.r r1 = r32.mo43585q()     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ SQLiteException -> 0x011c }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r33)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.p r4 = r32.mo43582n()     // Catch:{ SQLiteException -> 0x011c }
            java.lang.String r4 = r4.mo44155c(r7)     // Catch:{ SQLiteException -> 0x011c }
            r1.mo44162a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x011c }
        L_0x0116:
            if (r9 == 0) goto L_0x011b
            r9.close()
        L_0x011b:
            return r0
        L_0x011c:
            r0 = move-exception
            goto L_0x012f
        L_0x011e:
            r0 = move-exception
            r10 = r32
            goto L_0x014d
        L_0x0122:
            r0 = move-exception
            r10 = r32
            goto L_0x012f
        L_0x0126:
            r0 = move-exception
            r10 = r32
            r9 = r8
            goto L_0x014d
        L_0x012b:
            r0 = move-exception
            r10 = r32
            r9 = r8
        L_0x012f:
            com.google.android.gms.measurement.internal.r r1 = r32.mo43585q()     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x014c }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r33)     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.p r4 = r32.mo43582n()     // Catch:{ all -> 0x014c }
            java.lang.String r4 = r4.mo44155c(r7)     // Catch:{ all -> 0x014c }
            r1.mo44163a(r2, r3, r4, r0)     // Catch:{ all -> 0x014c }
            if (r9 == 0) goto L_0x014b
            r9.close()
        L_0x014b:
            return r8
        L_0x014c:
            r0 = move-exception
        L_0x014d:
            if (r9 == 0) goto L_0x0152
            r9.close()
        L_0x0152:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44104d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    /* renamed from: e */
    public final int mo44106e(String str, String str2) {
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        mo43571c();
        mo43843j();
        try {
            return mo44115w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44163a("Error deleting conditional property", C16953r.m56340a(str), mo43582n().mo44155c(str2), e);
            return 0;
        }
    }

    /* renamed from: b */
    public final List<zzo> mo44100b(String str, String str2, String str3) {
        C15267r.m44386a(str);
        mo43571c();
        mo43843j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo44089a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x016f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.zzo> mo44089a(java.lang.String r40, java.lang.String[] r41) {
        /*
            r39 = this;
            r39.mo43571c()
            r39.mo43843j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r39.mo44115w()     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "app_id"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "name"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "active"
            r15 = 4
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "trigger_event_name"
            r10 = 5
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "trigger_timeout"
            r9 = 6
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "timed_out_event"
            r8 = 7
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "creation_timestamp"
            r7 = 8
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "triggered_event"
            r6 = 9
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "triggered_timestamp"
            r1 = 10
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "time_to_live"
            r1 = 11
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            java.lang.String r5 = "expired_event"
            r1 = 12
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "1001"
            r5 = r40
            r1 = 9
            r6 = r41
            r1 = 8
            r7 = r19
            r1 = 7
            r8 = r20
            r1 = 6
            r9 = r21
            r1 = 5
            r10 = r22
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0154, all -> 0x0151 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            if (r3 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x0085
            r2.close()
        L_0x0085:
            return r0
        L_0x0086:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x009f
            com.google.android.gms.measurement.internal.r r1 = r39.mo43585q()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            java.lang.String r3 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r1.mo44161a(r3, r4)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            goto L_0x0142
        L_0x009f:
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            java.lang.String r10 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r9 = r39
            java.lang.Object r8 = r9.m56145a(r2, r14)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            int r4 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            if (r4 == 0) goto L_0x00ba
            r22 = 1
            goto L_0x00bc
        L_0x00ba:
            r22 = 0
        L_0x00bc:
            java.lang.String r28 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r6 = 6
            long r29 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.ej r4 = r39.mo43639f()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r7 = 7
            byte[] r1 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r6 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable r1 = r4.mo43880a(r1, r6)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzag r1 = (com.google.android.gms.measurement.internal.zzag) r1     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r6 = 8
            long r20 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.ej r4 = r39.mo43639f()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable r4 = r4.mo43880a(r6, r7)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r27 = r4
            com.google.android.gms.measurement.internal.zzag r27 = (com.google.android.gms.measurement.internal.zzag) r27     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r6 = 10
            long r16 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r7 = 11
            long r34 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.ej r4 = r39.mo43639f()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r7 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            android.os.Parcelable r4 = r4.mo43880a(r6, r7)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r38 = r4
            com.google.android.gms.measurement.internal.zzag r38 = (com.google.android.gms.measurement.internal.zzag) r38     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzfv r19 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r4 = r19
            r31 = 6
            r32 = 7
            r33 = 8
            r36 = 10
            r37 = 11
            r6 = r16
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzo r4 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r16 = r4
            r17 = r3
            r18 = r10
            r23 = r28
            r24 = r1
            r25 = r29
            r28 = r34
            r30 = r38
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            boolean r1 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x014e, all -> 0x014c }
            if (r1 != 0) goto L_0x0148
        L_0x0142:
            if (r2 == 0) goto L_0x0147
            r2.close()
        L_0x0147:
            return r0
        L_0x0148:
            r1 = 5
            r11 = 0
            goto L_0x0086
        L_0x014c:
            r0 = move-exception
            goto L_0x016d
        L_0x014e:
            r0 = move-exception
            r1 = r2
            goto L_0x0156
        L_0x0151:
            r0 = move-exception
            r2 = 0
            goto L_0x016d
        L_0x0154:
            r0 = move-exception
            r1 = 0
        L_0x0156:
            com.google.android.gms.measurement.internal.r r2 = r39.mo43585q()     // Catch:{ all -> 0x016b }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ all -> 0x016b }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.mo44161a(r3, r0)     // Catch:{ all -> 0x016b }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x016b }
            if (r1 == 0) goto L_0x016a
            r1.close()
        L_0x016a:
            return r0
        L_0x016b:
            r0 = move-exception
            r2 = r1
        L_0x016d:
            if (r2 == 0) goto L_0x0172
            r2.close()
        L_0x0172:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44089a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x017e A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0182 A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01b6 A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01b9 A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01c8 A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01f9 A[Catch:{ SQLiteException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0239  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C16924eo mo44099b(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r20
            com.google.android.gms.common.internal.C15267r.m44386a(r20)
            r19.mo43571c()
            r19.mo43843j()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r19.mo44115w()     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r4 = "apps"
            r0 = 26
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "app_instance_id"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "gmp_app_id"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "last_bundle_index"
            r14 = 3
            r5[r14] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r5[r9] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "app_store"
            r8 = 7
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 9
            java.lang.String r6 = "dev_cert_hash"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "measurement_enabled"
            r6 = 10
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 11
            java.lang.String r16 = "day"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 12
            java.lang.String r16 = "daily_public_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 13
            java.lang.String r16 = "daily_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 14
            java.lang.String r16 = "daily_conversions_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 15
            java.lang.String r16 = "config_fetched_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 16
            java.lang.String r16 = "failed_config_fetch_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 18
            java.lang.String r16 = "firebase_instance_id"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 19
            java.lang.String r16 = "daily_error_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 20
            java.lang.String r16 = "daily_realtime_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 21
            java.lang.String r16 = "health_monitor_sample"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "android_id"
            r15 = 22
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "ssaid_reporting_enabled"
            r15 = 24
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r0 = 25
            java.lang.String r16 = "admob_app_id"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            java.lang.String r0 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            r16 = 0
            r17 = 0
            r18 = 0
            r15 = 10
            r6 = r0
            r0 = 8
            r15 = 7
            r8 = r16
            r0 = 6
            r9 = r17
            r15 = 5
            r10 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x021d, all -> 0x0218 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            if (r4 != 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00d3
            r3.close()
        L_0x00d3:
            return r2
        L_0x00d4:
            com.google.android.gms.measurement.internal.eo r4 = new com.google.android.gms.measurement.internal.eo     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            r5 = r19
            com.google.android.gms.measurement.internal.ed r6 = r5.f47275a     // Catch:{ SQLiteException -> 0x020e }
            com.google.android.gms.measurement.internal.ay r6 = r6.f47278a     // Catch:{ SQLiteException -> 0x020e }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x020e }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43931a(r6)     // Catch:{ SQLiteException -> 0x020e }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43935b(r6)     // Catch:{ SQLiteException -> 0x020e }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43943d(r6)     // Catch:{ SQLiteException -> 0x020e }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43948f(r6)     // Catch:{ SQLiteException -> 0x020e }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43930a(r6)     // Catch:{ SQLiteException -> 0x020e }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43934b(r6)     // Catch:{ SQLiteException -> 0x020e }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43949f(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43952g(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 8
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43942d(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 9
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43945e(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 10
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r6 != 0) goto L_0x013c
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r0 = 0
            goto L_0x013d
        L_0x013c:
            r0 = 1
        L_0x013d:
            r4.mo43932a(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 11
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43957i(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 12
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43959j(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 13
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43961k(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 14
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43963l(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 15
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43951g(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 16
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43954h(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 17
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r6 == 0) goto L_0x0182
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0187
        L_0x0182:
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x020e }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x020e }
        L_0x0187:
            r4.mo43938c(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 18
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43946e(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 19
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43967n(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 20
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43965m(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 21
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43955h(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 22
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r6 == 0) goto L_0x01b9
            r6 = 0
            goto L_0x01bd
        L_0x01b9:
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x020e }
        L_0x01bd:
            r4.mo43968o(r6)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 23
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r6 != 0) goto L_0x01d1
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            r0 = 0
            goto L_0x01d2
        L_0x01d1:
            r0 = 1
        L_0x01d2:
            r4.mo43936b(r0)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 24
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r6 != 0) goto L_0x01e3
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x01e4
        L_0x01e3:
            r11 = 1
        L_0x01e4:
            r4.mo43940c(r11)     // Catch:{ SQLiteException -> 0x020e }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43939c(r0)     // Catch:{ SQLiteException -> 0x020e }
            r4.mo43929a()     // Catch:{ SQLiteException -> 0x020e }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x0208
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ SQLiteException -> 0x020e }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteException -> 0x020e }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C16953r.m56340a(r20)     // Catch:{ SQLiteException -> 0x020e }
            r0.mo44161a(r6, r7)     // Catch:{ SQLiteException -> 0x020e }
        L_0x0208:
            if (r3 == 0) goto L_0x020d
            r3.close()
        L_0x020d:
            return r4
        L_0x020e:
            r0 = move-exception
            goto L_0x0221
        L_0x0210:
            r0 = move-exception
            r5 = r19
            goto L_0x0237
        L_0x0214:
            r0 = move-exception
            r5 = r19
            goto L_0x0221
        L_0x0218:
            r0 = move-exception
            r5 = r19
            r3 = r2
            goto L_0x0237
        L_0x021d:
            r0 = move-exception
            r5 = r19
            r3 = r2
        L_0x0221:
            com.google.android.gms.measurement.internal.r r4 = r19.mo43585q()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x0236 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C16953r.m56340a(r20)     // Catch:{ all -> 0x0236 }
            r4.mo44162a(r6, r1, r0)     // Catch:{ all -> 0x0236 }
            if (r3 == 0) goto L_0x0235
            r3.close()
        L_0x0235:
            return r2
        L_0x0236:
            r0 = move-exception
        L_0x0237:
            if (r3 == 0) goto L_0x023c
            r3.close()
        L_0x023c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44099b(java.lang.String):com.google.android.gms.measurement.internal.eo");
    }

    /* renamed from: a */
    public final void mo44091a(C16924eo eoVar) {
        C15267r.m44384a(eoVar);
        mo43571c();
        mo43843j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eoVar.mo43933b());
        contentValues.put("app_instance_id", eoVar.mo43937c());
        contentValues.put("gmp_app_id", eoVar.mo43941d());
        contentValues.put("resettable_device_id_hash", eoVar.mo43947f());
        contentValues.put("last_bundle_index", Long.valueOf(eoVar.mo43970p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(eoVar.mo43953h()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(eoVar.mo43956i()));
        contentValues.put("app_version", eoVar.mo43958j());
        contentValues.put("app_store", eoVar.mo43962l());
        contentValues.put("gmp_version", Long.valueOf(eoVar.mo43964m()));
        contentValues.put("dev_cert_hash", Long.valueOf(eoVar.mo43966n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(eoVar.mo43969o()));
        contentValues.put("day", Long.valueOf(eoVar.mo43974t()));
        contentValues.put("daily_public_events_count", Long.valueOf(eoVar.mo43975u()));
        contentValues.put("daily_events_count", Long.valueOf(eoVar.mo43976v()));
        contentValues.put("daily_conversions_count", Long.valueOf(eoVar.mo43977w()));
        contentValues.put("config_fetched_time", Long.valueOf(eoVar.mo43971q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(eoVar.mo43972r()));
        contentValues.put("app_version_int", Long.valueOf(eoVar.mo43960k()));
        contentValues.put("firebase_instance_id", eoVar.mo43950g());
        contentValues.put("daily_error_events_count", Long.valueOf(eoVar.mo43979y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(eoVar.mo43978x()));
        contentValues.put("health_monitor_sample", eoVar.mo43980z());
        contentValues.put("android_id", Long.valueOf(eoVar.mo43926B()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(eoVar.mo43927C()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(eoVar.mo43928D()));
        contentValues.put("admob_app_id", eoVar.mo43944e());
        try {
            SQLiteDatabase w = mo44115w();
            if (((long) w.update("apps", contentValues, "app_id = ?", new String[]{eoVar.mo43933b()})) == 0 && w.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo43585q().f47487a.mo44161a("Failed to insert/update app (got -1). appId", C16953r.m56340a(eoVar.mo43933b()));
            }
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Error storing app. appId", C16953r.m56340a(eoVar.mo43933b()), e);
        }
    }

    /* renamed from: c */
    public final long mo44102c(String str) {
        C15267r.m44386a(str);
        mo43571c();
        mo43843j();
        try {
            return (long) mo44115w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(C28539a.f75176k, mo43587s().mo44049b(str, C16942h.f47456x))))});
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Error deleting over the limit events. appId", C16953r.m56340a(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0135  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C16934ey mo44084a(long r20, java.lang.String r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r19 = this;
            com.google.android.gms.common.internal.C15267r.m44386a(r22)
            r19.mo43571c()
            r19.mo43843j()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
            r2[r3] = r22
            com.google.android.gms.measurement.internal.ey r4 = new com.google.android.gms.measurement.internal.ey
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r14 = r19.mo44115w()     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r7 = "apps"
            r6 = 6
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "day"
            r8[r3] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "daily_events_count"
            r8[r0] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "daily_public_events_count"
            r15 = 2
            r8[r15] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "daily_conversions_count"
            r13 = 3
            r8[r13] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "daily_error_events_count"
            r12 = 4
            r8[r12] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r6 = "daily_realtime_events_count"
            r11 = 5
            r8[r11] = r6     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            java.lang.String r9 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            r10[r3] = r22     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = r14
            r5 = 5
            r11 = r16
            r5 = 4
            r12 = r17
            r5 = 3
            r13 = r18
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0117 }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r22)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.mo44161a(r2, r3)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            if (r6 == 0) goto L_0x006d
            r6.close()
        L_0x006d:
            return r4
        L_0x006e:
            long r7 = r6.getLong(r3)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            int r3 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x0096
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r4.f47369b = r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            long r7 = r6.getLong(r15)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r4.f47368a = r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            long r7 = r6.getLong(r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r4.f47370c = r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 4
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r4.f47371d = r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 5
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r4.f47372e = r7     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x0096:
            r7 = 1
            if (r23 == 0) goto L_0x00a0
            long r11 = r4.f47369b     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 0
            long r11 = r11 + r7
            r4.f47369b = r11     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x00a0:
            if (r24 == 0) goto L_0x00a8
            long r11 = r4.f47368a     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 0
            long r11 = r11 + r7
            r4.f47368a = r11     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x00a8:
            if (r25 == 0) goto L_0x00b0
            long r11 = r4.f47370c     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 0
            long r11 = r11 + r7
            r4.f47370c = r11     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x00b0:
            if (r26 == 0) goto L_0x00b8
            long r11 = r4.f47371d     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 0
            long r11 = r11 + r7
            r4.f47371d = r11     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x00b8:
            if (r27 == 0) goto L_0x00c0
            long r11 = r4.f47372e     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0 = 0
            long r11 = r11 + r7
            r4.f47372e = r11     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
        L_0x00c0:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "day"
            java.lang.Long r5 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "daily_public_events_count"
            long r7 = r4.f47368a     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "daily_events_count"
            long r7 = r4.f47369b     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "daily_conversions_count"
            long r7 = r4.f47370c     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "daily_error_events_count"
            long r7 = r4.f47371d     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "daily_realtime_events_count"
            long r7 = r4.f47372e     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            r0.put(r3, r5)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r14.update(r3, r0, r5, r2)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0112 }
            if (r6 == 0) goto L_0x0111
            r6.close()
        L_0x0111:
            return r4
        L_0x0112:
            r0 = move-exception
            goto L_0x0133
        L_0x0114:
            r0 = move-exception
            r5 = r6
            goto L_0x011c
        L_0x0117:
            r0 = move-exception
            r6 = 0
            goto L_0x0133
        L_0x011a:
            r0 = move-exception
            r5 = 0
        L_0x011c:
            com.google.android.gms.measurement.internal.r r2 = r19.mo43585q()     // Catch:{ all -> 0x0131 }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ all -> 0x0131 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C16953r.m56340a(r22)     // Catch:{ all -> 0x0131 }
            r2.mo44162a(r3, r1, r0)     // Catch:{ all -> 0x0131 }
            if (r5 == 0) goto L_0x0130
            r5.close()
        L_0x0130:
            return r4
        L_0x0131:
            r0 = move-exception
            r6 = r5
        L_0x0133:
            if (r6 == 0) goto L_0x0138
            r6.close()
        L_0x0138:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44084a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.ey");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo44105d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C15267r.m44386a(r12)
            r11.mo43571c()
            r11.mo43843j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.mo44115w()     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            r6[r9] = r12     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0056 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0056 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0056 }
            if (r3 == 0) goto L_0x0050
            com.google.android.gms.measurement.internal.r r3 = r11.mo43585q()     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ SQLiteException -> 0x0056 }
            r3.mo44161a(r4, r5)     // Catch:{ SQLiteException -> 0x0056 }
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()
        L_0x0055:
            return r2
        L_0x0056:
            r2 = move-exception
            goto L_0x005d
        L_0x0058:
            r12 = move-exception
            r1 = r0
            goto L_0x0073
        L_0x005b:
            r2 = move-exception
            r1 = r0
        L_0x005d:
            com.google.android.gms.measurement.internal.r r3 = r11.mo43585q()     // Catch:{ all -> 0x0072 }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ all -> 0x0072 }
            r3.mo44162a(r4, r12, r2)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r12 = move-exception
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44105d(java.lang.String):byte[]");
    }

    /* renamed from: a */
    public final boolean mo44094a(C16501ej ejVar, boolean z) {
        mo43571c();
        mo43843j();
        C15267r.m44384a(ejVar);
        C15267r.m44386a(ejVar.f46224o);
        C15267r.m44384a(ejVar.f46215f);
        mo44118z();
        long a = mo43580l().mo38684a();
        if (ejVar.f46215f.longValue() < a - C16930eu.m56088h() || ejVar.f46215f.longValue() > C16930eu.m56088h() + a) {
            mo43585q().f47490d.mo44163a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C16953r.m56340a(ejVar.f46224o), Long.valueOf(a), ejVar.f46215f);
        }
        try {
            byte[] bArr = new byte[ejVar.mo43168e()];
            C16678ko a2 = C16678ko.m54756a(bArr, 0, bArr.length);
            ejVar.mo42655a(a2);
            a2.mo43132a();
            byte[] b = mo43639f().mo43890b(bArr);
            mo43585q().f47495i.mo44161a("Saving bundle, size", Integer.valueOf(b.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ejVar.f46224o);
            contentValues.put("bundle_end_timestamp", ejVar.f46215f);
            contentValues.put("data", b);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (ejVar.f46202H != null) {
                contentValues.put("retry_count", ejVar.f46202H);
            }
            try {
                if (mo44115w().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo43585q().f47487a.mo44161a("Failed to insert bundle (got -1). appId", C16953r.m56340a(ejVar.f46224o));
                return false;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing bundle. appId", C16953r.m56340a(ejVar.f46224o), e);
                return false;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44162a("Data loss. Failed to serialize bundle. appId", C16953r.m56340a(ejVar.f46224o), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo44116x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo44115w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r2
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003d
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.r r3 = r6.mo43585q()     // Catch:{ all -> 0x003c }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo44161a(r4, r2)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            return r1
        L_0x003c:
            r1 = move-exception
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44116x():java.lang.String");
    }

    /* renamed from: y */
    public final boolean mo44117y() {
        return m56150b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.C16501ej, java.lang.Long>> mo44087a(java.lang.String r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r18
            r15.mo43571c()
            r15.mo43843j()
            r2 = 1
            r3 = 0
            if (r17 <= 0) goto L_0x000e
            r4 = 1
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            com.google.android.gms.common.internal.C15267r.m44394b(r4)
            if (r1 <= 0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.common.internal.C15267r.m44394b(r4)
            com.google.android.gms.common.internal.C15267r.m44386a(r16)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r15.mo44115w()     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r6 = "queue"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r8 = "rowid"
            r7[r3] = r8     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r8 = "data"
            r7[r2] = r8     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r8 = "retry_count"
            r14 = 2
            r7[r14] = r8     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d9 }
            r9[r3] = r16     // Catch:{ SQLiteException -> 0x00d9 }
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r13 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteException -> 0x00d9 }
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x00d9 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            if (r0 != 0) goto L_0x0056
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            if (r5 == 0) goto L_0x0055
            r5.close()
        L_0x0055:
            return r0
        L_0x0056:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r6 = 0
        L_0x005c:
            long r7 = r5.getLong(r3)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            byte[] r0 = r5.getBlob(r2)     // Catch:{ IOException -> 0x00b3 }
            com.google.android.gms.measurement.internal.ej r9 = r15.mo43639f()     // Catch:{ IOException -> 0x00b3 }
            byte[] r0 = r9.mo43888a(r0)     // Catch:{ IOException -> 0x00b3 }
            boolean r9 = r4.isEmpty()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            if (r9 != 0) goto L_0x0076
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            int r9 = r9 + r6
            if (r9 > r1) goto L_0x00cb
        L_0x0076:
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.internal.measurement.km r9 = com.google.android.gms.internal.measurement.C16676km.m54726a(r0, r3, r9)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.internal.measurement.ej r10 = new com.google.android.gms.internal.measurement.ej     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r10.mo42654a(r9)     // Catch:{ IOException -> 0x00a1 }
            boolean r9 = r5.isNull(r14)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            if (r9 != 0) goto L_0x0093
            int r9 = r5.getInt(r14)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r10.f46202H = r9     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
        L_0x0093:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            int r6 = r6 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            android.util.Pair r0 = android.util.Pair.create(r10, r0)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a1:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.r r0 = r15.mo43585q()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            java.lang.String r8 = "Failed to merge queued bundle. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r16)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r0.mo44162a(r8, r9, r7)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            goto L_0x00c3
        L_0x00b3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r7 = r15.mo43585q()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            com.google.android.gms.measurement.internal.t r7 = r7.f47487a     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            java.lang.String r8 = "Failed to unzip queued bundle. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C16953r.m56340a(r16)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            r7.mo44162a(r8, r9, r0)     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
        L_0x00c3:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x00d3, all -> 0x00d1 }
            if (r0 == 0) goto L_0x00cb
            if (r6 <= r1) goto L_0x005c
        L_0x00cb:
            if (r5 == 0) goto L_0x00d0
            r5.close()
        L_0x00d0:
            return r4
        L_0x00d1:
            r0 = move-exception
            goto L_0x00f3
        L_0x00d3:
            r0 = move-exception
            r4 = r5
            goto L_0x00da
        L_0x00d6:
            r0 = move-exception
            r5 = r4
            goto L_0x00f3
        L_0x00d9:
            r0 = move-exception
        L_0x00da:
            com.google.android.gms.measurement.internal.r r1 = r15.mo43585q()     // Catch:{ all -> 0x00d6 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C16953r.m56340a(r16)     // Catch:{ all -> 0x00d6 }
            r1.mo44162a(r2, r3, r0)     // Catch:{ all -> 0x00d6 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00d6 }
            if (r4 == 0) goto L_0x00f2
            r4.close()
        L_0x00f2:
            return r0
        L_0x00f3:
            if (r5 == 0) goto L_0x00f8
            r5.close()
        L_0x00f8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44087a(java.lang.String, int, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final void mo44118z() {
        mo43571c();
        mo43843j();
        if (m56142L()) {
            long a = mo43586r().f46920f.mo43614a();
            long b = mo43580l().mo38685b();
            if (Math.abs(b - a) > ((Long) C16942h.f47386G.mo44132a()).longValue()) {
                mo43586r().f46920f.mo43615a(b);
                mo43571c();
                mo43843j();
                if (m56142L()) {
                    int delete = mo44115w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo43580l().mo38684a()), String.valueOf(C16930eu.m56088h())});
                    if (delete > 0) {
                        mo43585q().f47495i.mo44161a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44093a(List<Long> list) {
        mo43571c();
        mo43843j();
        C15267r.m44384a(list);
        C15267r.m44383a(list.size());
        if (m56142L()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m56150b(sb3.toString(), (String[]) null) > 0) {
                mo43585q().f47490d.mo44160a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase w = mo44115w();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                w.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44161a("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44092a(String str, C16486dv[] dvVarArr) {
        boolean z;
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        C15267r.m44384a(dvVarArr);
        SQLiteDatabase w = mo44115w();
        w.beginTransaction();
        try {
            mo43843j();
            mo43571c();
            C15267r.m44386a(str);
            SQLiteDatabase w2 = mo44115w();
            w2.delete("property_filters", "app_id=?", new String[]{str});
            w2.delete("event_filters", "app_id=?", new String[]{str});
            for (C16486dv dvVar : dvVarArr) {
                mo43843j();
                mo43571c();
                C15267r.m44386a(str);
                C15267r.m44384a(dvVar);
                C15267r.m44384a(dvVar.f46122c);
                C15267r.m44384a(dvVar.f46121b);
                if (dvVar.f46120a == null) {
                    mo43585q().f47490d.mo44161a("Audience with no ID. appId", C16953r.m56340a(str));
                } else {
                    int intValue = dvVar.f46120a.intValue();
                    C16487dw[] dwVarArr = dvVar.f46122c;
                    int length = dwVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            C16490dz[] dzVarArr = dvVar.f46121b;
                            int length2 = dzVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    C16487dw[] dwVarArr2 = dvVar.f46122c;
                                    int length3 = dwVarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!m56147a(str, intValue, dwVarArr2[i3])) {
                                            z = false;
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        C16490dz[] dzVarArr2 = dvVar.f46121b;
                                        int length4 = dzVarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            } else if (!m56148a(str, intValue, dzVarArr2[i4])) {
                                                z = false;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        mo43843j();
                                        mo43571c();
                                        C15267r.m44386a(str);
                                        SQLiteDatabase w3 = mo44115w();
                                        w3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        w3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                } else if (dzVarArr[i2].f46144a == null) {
                                    mo43585q().f47490d.mo44162a("Property filter with no ID. Audience definition ignored. appId, audienceId", C16953r.m56340a(str), dvVar.f46120a);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        } else if (dwVarArr[i].f46126a == null) {
                            mo43585q().f47490d.mo44162a("Event filter with no ID. Audience definition ignored. appId, audienceId", C16953r.m56340a(str), dvVar.f46120a);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C16486dv dvVar2 : dvVarArr) {
                arrayList.add(dvVar2.f46120a);
            }
            m56149a(str, (List<Integer>) arrayList);
            w.setTransactionSuccessful();
        } finally {
            w.endTransaction();
        }
    }

    /* renamed from: a */
    private final boolean m56147a(String str, int i, C16487dw dwVar) {
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        C15267r.m44384a(dwVar);
        if (TextUtils.isEmpty(dwVar.f46127b)) {
            mo43585q().f47490d.mo44163a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C16953r.m56340a(str), Integer.valueOf(i), String.valueOf(dwVar.f46126a));
            return false;
        }
        try {
            byte[] bArr = new byte[dwVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            dwVar.mo42655a(a);
            a.mo43132a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", dwVar.f46126a);
            contentValues.put("event_name", dwVar.f46127b);
            contentValues.put("data", bArr);
            try {
                if (mo44115w().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    mo43585q().f47487a.mo44161a("Failed to insert event filter (got -1). appId", C16953r.m56340a(str));
                }
                return true;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing event filter. appId", C16953r.m56340a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44162a("Configuration loss. Failed to serialize event filter. appId", C16953r.m56340a(str), e2);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m56148a(String str, int i, C16490dz dzVar) {
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        C15267r.m44384a(dzVar);
        if (TextUtils.isEmpty(dzVar.f46145b)) {
            mo43585q().f47490d.mo44163a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C16953r.m56340a(str), Integer.valueOf(i), String.valueOf(dzVar.f46144a));
            return false;
        }
        try {
            byte[] bArr = new byte[dzVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            dzVar.mo42655a(a);
            a.mo43132a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", dzVar.f46144a);
            contentValues.put("property_name", dzVar.f46145b);
            contentValues.put("data", bArr);
            try {
                if (mo44115w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo43585q().f47487a.mo44161a("Failed to insert property filter (got -1). appId", C16953r.m56340a(str));
                return false;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing property filter. appId", C16953r.m56340a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44162a("Configuration loss. Failed to serialize property filter. appId", C16953r.m56340a(str), e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C16487dw>> mo44110f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo43843j()
            r12.mo43571c()
            com.google.android.gms.common.internal.C15267r.m44386a(r13)
            com.google.android.gms.common.internal.C15267r.m44386a(r14)
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo44115w()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.km r1 = com.google.android.gms.internal.measurement.C16676km.m54726a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.dw r2 = new com.google.android.gms.internal.measurement.dw     // Catch:{ SQLiteException -> 0x0095 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo42654a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo43585q()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo44162a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.r r1 = r12.mo43585q()     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C16953r.m56340a(r13)     // Catch:{ all -> 0x00b1 }
            r1.mo44162a(r2, r13, r0)     // Catch:{ all -> 0x00b1 }
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            return r9
        L_0x00b1:
            r13 = move-exception
        L_0x00b2:
            if (r14 == 0) goto L_0x00b7
            r14.close()
        L_0x00b7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44110f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C16490dz>> mo44111g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo43843j()
            r12.mo43571c()
            com.google.android.gms.common.internal.C15267r.m44386a(r13)
            com.google.android.gms.common.internal.C15267r.m44386a(r14)
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo44115w()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.km r1 = com.google.android.gms.internal.measurement.C16676km.m54726a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.dz r2 = new com.google.android.gms.internal.measurement.dz     // Catch:{ SQLiteException -> 0x0095 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo42654a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo43585q()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo44162a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.r r1 = r12.mo43585q()     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C16953r.m56340a(r13)     // Catch:{ all -> 0x00b1 }
            r1.mo44162a(r2, r13, r0)     // Catch:{ all -> 0x00b1 }
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            return r9
        L_0x00b1:
            r13 = move-exception
        L_0x00b2:
            if (r14 == 0) goto L_0x00b7
            r14.close()
        L_0x00b7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44111g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private final boolean m56149a(String str, List<Integer> list) {
        C15267r.m44386a(str);
        mo43843j();
        mo43571c();
        SQLiteDatabase w = mo44115w();
        try {
            long b = m56150b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, mo43587s().mo44049b(str, C16942h.f47393N)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return w.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44162a("Database error querying filters. appId", C16953r.m56340a(str), e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C16502ek> mo44107e(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo43843j()
            r11.mo43571c()
            com.google.android.gms.common.internal.C15267r.m44386a(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo44115w()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r4[r9] = r12     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return r8
        L_0x0036:
            android.support.v4.util.ArrayMap r1 = new android.support.v4.util.ArrayMap     // Catch:{ SQLiteException -> 0x0078 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0078 }
        L_0x003b:
            int r2 = r0.getInt(r9)     // Catch:{ SQLiteException -> 0x0078 }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ SQLiteException -> 0x0078 }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.internal.measurement.km r3 = com.google.android.gms.internal.measurement.C16676km.m54726a(r3, r9, r4)     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.internal.measurement.ek r4 = new com.google.android.gms.internal.measurement.ek     // Catch:{ SQLiteException -> 0x0078 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0078 }
            r4.mo42654a(r3)     // Catch:{ IOException -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x0078 }
            goto L_0x006c
        L_0x0058:
            r3 = move-exception
            com.google.android.gms.measurement.internal.r r4 = r11.mo43585q()     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r4.mo44163a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x006c:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0077
            r0.close()
        L_0x0077:
            return r1
        L_0x0078:
            r1 = move-exception
            goto L_0x007f
        L_0x007a:
            r12 = move-exception
            r0 = r8
            goto L_0x0095
        L_0x007d:
            r1 = move-exception
            r0 = r8
        L_0x007f:
            com.google.android.gms.measurement.internal.r r2 = r11.mo43585q()     // Catch:{ all -> 0x0094 }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C16953r.m56340a(r12)     // Catch:{ all -> 0x0094 }
            r2.mo44162a(r3, r12, r1)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            return r8
        L_0x0094:
            r12 = move-exception
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44107e(java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private static void m56146a(ContentValues contentValues, String str, Object obj) {
        C15267r.m44386a(str);
        C15267r.m44384a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    private final Object m56145a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo43585q().f47487a.mo44160a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                mo43585q().f47487a.mo44160a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                mo43585q().f47487a.mo44161a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    /* renamed from: A */
    public final long mo44076A() {
        return m56143a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo44112h(String str, String str2) {
        long j;
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        mo43571c();
        mo43843j();
        SQLiteDatabase w = mo44115w();
        w.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            j = m56143a(sb.toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Integer.valueOf(0));
                contentValues.put("previous_install_count", Integer.valueOf(0));
                if (w.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    mo43585q().f47487a.mo44162a("Failed to insert column (got -1). appId", C16953r.m56340a(str), str2);
                    w.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + j));
                if (((long) w.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    mo43585q().f47487a.mo44162a("Failed to update column (got 0). appId", C16953r.m56340a(str), str2);
                    w.endTransaction();
                    return -1;
                }
                w.setTransactionSuccessful();
                w.endTransaction();
                return j;
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo43585q().f47487a.mo44163a("Error inserting column. appId", C16953r.m56340a(str), str2, e);
                    return j;
                } finally {
                    w.endTransaction();
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            j = 0;
            mo43585q().f47487a.mo44163a("Error inserting column. appId", C16953r.m56340a(str), str2, e);
            return j;
        }
    }

    /* renamed from: B */
    public final long mo44077B() {
        return m56143a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: a */
    public final long mo44081a(C16501ej ejVar) throws IOException {
        long j;
        mo43571c();
        mo43843j();
        C15267r.m44384a(ejVar);
        C15267r.m44386a(ejVar.f46224o);
        try {
            byte[] bArr = new byte[ejVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            ejVar.mo42655a(a);
            a.mo43132a();
            C16919ej f = mo43639f();
            C15267r.m44384a(bArr);
            f.mo43583o().mo43571c();
            MessageDigest h = C16922em.m55977h();
            if (h == null) {
                f.mo43585q().f47487a.mo44160a("Failed to get MD5");
                j = 0;
            } else {
                j = C16922em.m55955a(h.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ejVar.f46224o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                mo44115w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing raw event metadata. appId", C16953r.m56340a(ejVar.f46224o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44162a("Data loss. Failed to serialize event metadata. appId", C16953r.m56340a(ejVar.f46224o), e2);
            throw e2;
        }
    }

    /* renamed from: C */
    public final boolean mo44078C() {
        return m56150b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: D */
    public final boolean mo44079D() {
        return m56150b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: f */
    public final long mo44109f(String str) {
        C15267r.m44386a(str);
        return m56143a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo44085a(long r5) {
        /*
            r4 = this;
            r4.mo43571c()
            r4.mo43843j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo44115w()     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003c }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.r r6 = r4.mo43585q()     // Catch:{ SQLiteException -> 0x003c }
            com.google.android.gms.measurement.internal.t r6 = r6.f47495i     // Catch:{ SQLiteException -> 0x003c }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo44160a(r1)     // Catch:{ SQLiteException -> 0x003c }
            if (r5 == 0) goto L_0x0031
            r5.close()
        L_0x0031:
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003c }
            if (r5 == 0) goto L_0x003b
            r5.close()
        L_0x003b:
            return r6
        L_0x003c:
            r6 = move-exception
            goto L_0x0043
        L_0x003e:
            r6 = move-exception
            r5 = r0
            goto L_0x0055
        L_0x0041:
            r6 = move-exception
            r5 = r0
        L_0x0043:
            com.google.android.gms.measurement.internal.r r1 = r4.mo43585q()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo44161a(r2, r6)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r0
        L_0x0054:
            r6 = move-exception
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44085a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0042  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo44080E() {
        /*
            r7 = this;
            r0 = -1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.mo44115w()     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x002e }
            boolean r2 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r2 != 0) goto L_0x0019
            if (r3 == 0) goto L_0x0018
            r3.close()
        L_0x0018:
            return r0
        L_0x0019:
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r3 == 0) goto L_0x0023
            r3.close()
        L_0x0023:
            return r4
        L_0x0024:
            r0 = move-exception
            r2 = r3
            goto L_0x0040
        L_0x0027:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            goto L_0x0040
        L_0x002e:
            r3 = move-exception
        L_0x002f:
            com.google.android.gms.measurement.internal.r r4 = r7.mo43585q()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Error querying raw events"
            r4.mo44161a(r5, r3)     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x003f
            r2.close()
        L_0x003f:
            return r0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44080E():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C16498eg, java.lang.Long> mo44082a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo43571c()
            r7.mo43843j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo44115w()     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.r r8 = r7.mo43585q()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.t r8 = r8.f47495i     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r9 = "Main event not found"
            r8.mo44160a(r9)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x0034
            r1.close()
        L_0x0034:
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x006e }
            long r5 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x006e }
            int r5 = r2.length     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.km r2 = com.google.android.gms.internal.measurement.C16676km.m54726a(r2, r4, r5)     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.eg r4 = new com.google.android.gms.internal.measurement.eg     // Catch:{ SQLiteException -> 0x006e }
            r4.<init>()     // Catch:{ SQLiteException -> 0x006e }
            r4.mo42654a(r2)     // Catch:{ IOException -> 0x0058 }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r8
        L_0x0058:
            r2 = move-exception
            com.google.android.gms.measurement.internal.r r3 = r7.mo43585q()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.t r3 = r3.f47487a     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C16953r.m56340a(r8)     // Catch:{ SQLiteException -> 0x006e }
            r3.mo44163a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            return r0
        L_0x006e:
            r8 = move-exception
            goto L_0x0075
        L_0x0070:
            r8 = move-exception
            r1 = r0
            goto L_0x0087
        L_0x0073:
            r8 = move-exception
            r1 = r0
        L_0x0075:
            com.google.android.gms.measurement.internal.r r9 = r7.mo43585q()     // Catch:{ all -> 0x0086 }
            com.google.android.gms.measurement.internal.t r9 = r9.f47487a     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Error selecting main event"
            r9.mo44161a(r2, r8)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            return r0
        L_0x0086:
            r8 = move-exception
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.close()
        L_0x008c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16933ex.mo44082a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo44098a(String str, Long l, long j, C16498eg egVar) {
        mo43571c();
        mo43843j();
        C15267r.m44384a(egVar);
        C15267r.m44386a(str);
        C15267r.m44384a(l);
        try {
            byte[] bArr = new byte[egVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            egVar.mo42655a(a);
            a.mo43132a();
            mo43585q().f47495i.mo44162a("Saving complex main event, appId, data size", mo43582n().mo44153a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (mo44115w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                mo43585q().f47487a.mo44161a("Failed to insert complex main event (got -1). appId", C16953r.m56340a(str));
                return false;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing complex main event. appId", C16953r.m56340a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44163a("Data loss. Failed to serialize event params/data. appId, eventId", C16953r.m56340a(str), l, e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo44095a(C16854c cVar, long j, boolean z) {
        mo43571c();
        mo43843j();
        C15267r.m44384a(cVar);
        C15267r.m44386a(cVar.f47103a);
        C16498eg egVar = new C16498eg();
        egVar.f46185d = Long.valueOf(cVar.f47106d);
        egVar.f46182a = new C16499eh[cVar.f47107e.mo44167a()];
        Iterator it = cVar.f47107e.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            C16499eh ehVar = new C16499eh();
            int i2 = i + 1;
            egVar.f46182a[i] = ehVar;
            ehVar.f46188a = str;
            mo43639f().mo43883a(ehVar, cVar.f47107e.mo44168a(str));
            i = i2;
        }
        try {
            byte[] bArr = new byte[egVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            egVar.mo42655a(a);
            a.mo43132a();
            mo43585q().f47495i.mo44162a("Saving event, name, data size", mo43582n().mo44153a(cVar.f47104b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", cVar.f47103a);
            contentValues.put("name", cVar.f47104b);
            contentValues.put("timestamp", Long.valueOf(cVar.f47105c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (mo44115w().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                mo43585q().f47487a.mo44161a("Failed to insert raw event (got -1). appId", C16953r.m56340a(cVar.f47103a));
                return false;
            } catch (SQLiteException e) {
                mo43585q().f47487a.mo44162a("Error storing raw event. appId", C16953r.m56340a(cVar.f47103a), e);
                return false;
            }
        } catch (IOException e2) {
            mo43585q().f47487a.mo44162a("Data loss. Failed to serialize event params/data. appId", C16953r.m56340a(cVar.f47103a), e2);
            return false;
        }
    }

    /* renamed from: L */
    private final boolean m56142L() {
        return mo43581m().getDatabasePath("google_app_measurement.db").exists();
    }
}
