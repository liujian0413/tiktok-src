package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.internal.measurement.C16487dw;
import com.google.android.gms.internal.measurement.C16488dx;
import com.google.android.gms.internal.measurement.C16489dy;
import com.google.android.gms.internal.measurement.C16490dz;
import com.google.android.gms.internal.measurement.C16492ea;
import com.google.android.gms.internal.measurement.C16496ee;
import com.google.android.gms.internal.measurement.C16497ef;
import com.google.android.gms.internal.measurement.C16498eg;
import com.google.android.gms.internal.measurement.C16499eh;
import com.google.android.gms.internal.measurement.C16500ei;
import com.google.android.gms.internal.measurement.C16501ej;
import com.google.android.gms.internal.measurement.C16502ek;
import com.google.android.gms.internal.measurement.C16503el;
import com.google.android.gms.internal.measurement.C16504em;
import com.google.android.gms.internal.measurement.C16678ko;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.ej */
public final class C16919ej extends C16911ec {
    C16919ej(C16912ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43884a(C16504em emVar, Object obj) {
        C15267r.m44384a(obj);
        emVar.f46246c = null;
        emVar.f46247d = null;
        emVar.f46248e = null;
        if (obj instanceof String) {
            emVar.f46246c = (String) obj;
        } else if (obj instanceof Long) {
            emVar.f46247d = (Long) obj;
        } else if (obj instanceof Double) {
            emVar.f46248e = (Double) obj;
        } else {
            mo43585q().f47487a.mo44161a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43883a(C16499eh ehVar, Object obj) {
        C15267r.m44384a(obj);
        ehVar.f46189b = null;
        ehVar.f46190c = null;
        ehVar.f46191d = null;
        if (obj instanceof String) {
            ehVar.f46189b = (String) obj;
        } else if (obj instanceof Long) {
            ehVar.f46190c = (Long) obj;
        } else if (obj instanceof Double) {
            ehVar.f46191d = (Double) obj;
        } else {
            mo43585q().f47487a.mo44161a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo43887a(C16500ei eiVar) {
        try {
            byte[] bArr = new byte[eiVar.mo43168e()];
            C16678ko a = C16678ko.m54756a(bArr, 0, bArr.length);
            eiVar.mo42655a(a);
            a.mo43132a();
            return bArr;
        } catch (IOException e) {
            mo43585q().f47487a.mo44161a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    static C16499eh m55915a(C16498eg egVar, String str) {
        C16499eh[] ehVarArr;
        for (C16499eh ehVar : egVar.f46182a) {
            if (ehVar.f46188a.equals(str)) {
                return ehVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    static Object m55925b(C16498eg egVar, String str) {
        C16499eh a = m55915a(egVar, str);
        if (a != null) {
            if (a.f46189b != null) {
                return a.f46189b;
            }
            if (a.f46190c != null) {
                return a.f46190c;
            }
            if (a.f46191d != null) {
                return a.f46191d;
            }
        }
        return null;
    }

    /* renamed from: a */
    static C16499eh[] m55924a(C16499eh[] ehVarArr, String str, Object obj) {
        for (C16499eh ehVar : ehVarArr) {
            if (str.equals(ehVar.f46188a)) {
                ehVar.f46190c = null;
                ehVar.f46189b = null;
                ehVar.f46191d = null;
                if (obj instanceof Long) {
                    ehVar.f46190c = (Long) obj;
                }
                return ehVarArr;
            }
        }
        C16499eh[] ehVarArr2 = new C16499eh[(ehVarArr.length + 1)];
        System.arraycopy(ehVarArr, 0, ehVarArr2, 0, ehVarArr.length);
        C16499eh ehVar2 = new C16499eh();
        ehVar2.f46188a = str;
        if (obj instanceof Long) {
            ehVar2.f46190c = (Long) obj;
        }
        ehVarArr2[ehVarArr.length] = ehVar2;
        return ehVarArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo43889b(C16500ei eiVar) {
        C16501ej[] ejVarArr;
        int i;
        int i2;
        C16500ei eiVar2 = eiVar;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (eiVar2.f46193a != null) {
            for (C16501ej ejVar : eiVar2.f46193a) {
                if (!(ejVar == null || ejVar == null)) {
                    m55916a(sb, 1);
                    sb.append("bundle {\n");
                    m55920a(sb, 1, "protocol_version", (Object) ejVar.f46210a);
                    m55920a(sb, 1, "platform", (Object) ejVar.f46218i);
                    m55920a(sb, 1, "gmp_version", (Object) ejVar.f46226q);
                    m55920a(sb, 1, "uploading_gmp_version", (Object) ejVar.f46227r);
                    m55920a(sb, 1, "config_version", (Object) ejVar.f46199E);
                    m55920a(sb, 1, "gmp_app_id", (Object) ejVar.f46234y);
                    m55920a(sb, 1, "admob_app_id", (Object) ejVar.f46203I);
                    m55920a(sb, 1, "app_id", (Object) ejVar.f46224o);
                    m55920a(sb, 1, "app_version", (Object) ejVar.f46225p);
                    m55920a(sb, 1, "app_version_major", (Object) ejVar.f46197C);
                    m55920a(sb, 1, "firebase_instance_id", (Object) ejVar.f46196B);
                    m55920a(sb, 1, "dev_cert_hash", (Object) ejVar.f46231v);
                    m55920a(sb, 1, "app_store", (Object) ejVar.f46223n);
                    m55920a(sb, 1, "upload_timestamp_millis", (Object) ejVar.f46213d);
                    m55920a(sb, 1, "start_timestamp_millis", (Object) ejVar.f46214e);
                    m55920a(sb, 1, "end_timestamp_millis", (Object) ejVar.f46215f);
                    m55920a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) ejVar.f46216g);
                    m55920a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) ejVar.f46217h);
                    m55920a(sb, 1, "app_instance_id", (Object) ejVar.f46230u);
                    m55920a(sb, 1, "resettable_device_id", (Object) ejVar.f46228s);
                    m55920a(sb, 1, "device_id", (Object) ejVar.f46198D);
                    m55920a(sb, 1, "ds_id", (Object) ejVar.f46201G);
                    m55920a(sb, 1, "limited_ad_tracking", (Object) ejVar.f46229t);
                    m55920a(sb, 1, "os_version", (Object) ejVar.f46219j);
                    m55920a(sb, 1, "device_model", (Object) ejVar.f46220k);
                    m55920a(sb, 1, "user_default_language", (Object) ejVar.f46221l);
                    m55920a(sb, 1, "time_zone_offset_minutes", (Object) ejVar.f46222m);
                    m55920a(sb, 1, "bundle_sequential_index", (Object) ejVar.f46232w);
                    m55920a(sb, 1, "service_upload", (Object) ejVar.f46235z);
                    m55920a(sb, 1, "health_monitor", (Object) ejVar.f46233x);
                    if (!(ejVar.f46200F == null || ejVar.f46200F.longValue() == 0)) {
                        m55920a(sb, 1, "android_id", (Object) ejVar.f46200F);
                    }
                    if (ejVar.f46202H != null) {
                        m55920a(sb, 1, "retry_counter", (Object) ejVar.f46202H);
                    }
                    C16504em[] emVarArr = ejVar.f46212c;
                    if (emVarArr != null) {
                        for (C16504em emVar : emVarArr) {
                            if (emVar != null) {
                                m55916a(sb, 2);
                                sb.append("user_property {\n");
                                m55920a(sb, 2, "set_timestamp_millis", (Object) emVar.f46244a);
                                m55920a(sb, 2, "name", (Object) mo43582n().mo44155c(emVar.f46245b));
                                m55920a(sb, 2, "string_value", (Object) emVar.f46246c);
                                m55920a(sb, 2, "int_value", (Object) emVar.f46247d);
                                m55920a(sb, 2, "double_value", (Object) emVar.f46248e);
                                m55916a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C16496ee[] eeVarArr = ejVar.f46195A;
                    String str = ejVar.f46224o;
                    if (eeVarArr != null) {
                        int length = eeVarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            C16496ee eeVar = eeVarArr[i3];
                            if (eeVar != null) {
                                m55916a(sb, 2);
                                sb.append("audience_membership {\n");
                                m55920a(sb, 2, "audience_id", (Object) eeVar.f46174a);
                                m55920a(sb, 2, "new_audience", (Object) eeVar.f46177d);
                                StringBuilder sb2 = sb;
                                C16496ee eeVar2 = eeVar;
                                i2 = i3;
                                i = length;
                                String str2 = str;
                                m55919a(sb2, 2, "current_data", eeVar.f46175b, str2);
                                m55919a(sb2, 2, "previous_data", eeVar2.f46176c, str2);
                                m55916a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i2 = i3;
                                i = length;
                            }
                            i3 = i2 + 1;
                            length = i;
                        }
                    }
                    C16498eg[] egVarArr = ejVar.f46211b;
                    if (egVarArr != null) {
                        for (C16498eg egVar : egVarArr) {
                            if (egVar != null) {
                                m55916a(sb, 2);
                                sb.append("event {\n");
                                m55920a(sb, 2, "name", (Object) mo43582n().mo44153a(egVar.f46183b));
                                m55920a(sb, 2, "timestamp_millis", (Object) egVar.f46184c);
                                m55920a(sb, 2, "previous_timestamp_millis", (Object) egVar.f46185d);
                                m55920a(sb, 2, "count", (Object) egVar.f46186e);
                                C16499eh[] ehVarArr = egVar.f46182a;
                                if (ehVarArr != null) {
                                    for (C16499eh ehVar : ehVarArr) {
                                        if (ehVar != null) {
                                            m55916a(sb, 3);
                                            sb.append("param {\n");
                                            m55920a(sb, 3, "name", (Object) mo43582n().mo44154b(ehVar.f46188a));
                                            m55920a(sb, 3, "string_value", (Object) ehVar.f46189b);
                                            m55920a(sb, 3, "int_value", (Object) ehVar.f46190c);
                                            m55920a(sb, 3, "double_value", (Object) ehVar.f46191d);
                                            m55916a(sb, 3);
                                            sb.append("}\n");
                                        }
                                    }
                                }
                                m55916a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    m55916a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo43881a(C16487dw dwVar) {
        if (dwVar == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m55920a(sb, 0, "filter_id", (Object) dwVar.f46126a);
        m55920a(sb, 0, "event_name", (Object) mo43582n().mo44153a(dwVar.f46127b));
        m55918a(sb, 1, "event_count_filter", dwVar.f46129d);
        sb.append("  filters {\n");
        for (C16488dx a : dwVar.f46128c) {
            m55917a(sb, 2, a);
        }
        m55916a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo43882a(C16490dz dzVar) {
        if (dzVar == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m55920a(sb, 0, "filter_id", (Object) dzVar.f46144a);
        m55920a(sb, 0, "property_name", (Object) mo43582n().mo44155c(dzVar.f46145b));
        m55917a(sb, 1, dzVar.f46146c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m55919a(StringBuilder sb, int i, String str, C16502ek ekVar, String str2) {
        if (ekVar != null) {
            m55916a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (ekVar.f46237b != null) {
                m55916a(sb, 4);
                sb.append("results: ");
                long[] jArr = ekVar.f46237b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i2++;
                    i3 = i4;
                }
                sb.append(10);
            }
            if (ekVar.f46236a != null) {
                m55916a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = ekVar.f46236a;
                int length2 = jArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i5]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i5++;
                    i6 = i7;
                }
                sb.append(10);
            }
            if (mo43587s().mo44065k(str2)) {
                if (ekVar.f46238c != null) {
                    m55916a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    C16497ef[] efVarArr = ekVar.f46238c;
                    int length3 = efVarArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        C16497ef efVar = efVarArr[i8];
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(efVar.f46179a);
                        sb.append(":");
                        sb.append(efVar.f46180b);
                        i8++;
                        i9 = i10;
                    }
                    sb.append("}\n");
                }
                if (ekVar.f46239d != null) {
                    m55916a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    C16503el[] elVarArr = ekVar.f46239d;
                    int length4 = elVarArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length4) {
                        C16503el elVar = elVarArr[i11];
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(elVar.f46241a);
                        sb.append(": [");
                        long[] jArr3 = elVar.f46242b;
                        int length5 = jArr3.length;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < length5) {
                            long j = jArr3[i14];
                            int i16 = i15 + 1;
                            if (i15 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j);
                            i14++;
                            i15 = i16;
                        }
                        sb.append("]");
                        i11++;
                        i12 = i13;
                    }
                    sb.append("}\n");
                }
            }
            m55916a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m55918a(StringBuilder sb, int i, String str, C16489dy dyVar) {
        if (dyVar != null) {
            m55916a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (dyVar.f46138a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (dyVar.f46138a.intValue()) {
                    case 1:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                m55920a(sb, i, "comparison_type", (Object) str2);
            }
            m55920a(sb, i, "match_as_float", (Object) dyVar.f46139b);
            m55920a(sb, i, "comparison_value", (Object) dyVar.f46140c);
            m55920a(sb, i, "min_comparison_value", (Object) dyVar.f46141d);
            m55920a(sb, i, "max_comparison_value", (Object) dyVar.f46142e);
            m55916a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m55917a(StringBuilder sb, int i, C16488dx dxVar) {
        String[] strArr;
        if (dxVar != null) {
            m55916a(sb, i);
            sb.append("filter {\n");
            m55920a(sb, i, "complement", (Object) dxVar.f46136c);
            m55920a(sb, i, "param_name", (Object) mo43582n().mo44154b(dxVar.f46137d));
            int i2 = i + 1;
            String str = "string_filter";
            C16492ea eaVar = dxVar.f46134a;
            if (eaVar != null) {
                m55916a(sb, i2);
                sb.append(str);
                sb.append(" {\n");
                if (eaVar.f46153a != null) {
                    String str2 = "UNKNOWN_MATCH_TYPE";
                    switch (eaVar.f46153a.intValue()) {
                        case 1:
                            str2 = "REGEXP";
                            break;
                        case 2:
                            str2 = "BEGINS_WITH";
                            break;
                        case 3:
                            str2 = "ENDS_WITH";
                            break;
                        case 4:
                            str2 = "PARTIAL";
                            break;
                        case 5:
                            str2 = "EXACT";
                            break;
                        case 6:
                            str2 = "IN_LIST";
                            break;
                    }
                    m55920a(sb, i2, "match_type", (Object) str2);
                }
                m55920a(sb, i2, "expression", (Object) eaVar.f46154b);
                m55920a(sb, i2, "case_sensitive", (Object) eaVar.f46155c);
                if (eaVar.f46156d.length > 0) {
                    m55916a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : eaVar.f46156d) {
                        m55916a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m55916a(sb, i2);
                sb.append("}\n");
            }
            m55918a(sb, i2, "number_filter", dxVar.f46135b);
            m55916a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m55916a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m55920a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m55916a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo43585q().f47487a.mo44160a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo43880a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002b
        L_0x001c:
            com.google.android.gms.measurement.internal.r r5 = r4.mo43585q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.f47487a     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo44160a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16919ej.mo43880a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43886a(zzag zzag, zzk zzk) {
        C15267r.m44384a(zzag);
        C15267r.m44384a(zzk);
        return !TextUtils.isEmpty(zzk.f47531b) || !TextUtils.isEmpty(zzk.f47547r);
    }

    /* renamed from: a */
    static boolean m55921a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m55922a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i / 64]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long[] m55923a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43885a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo43580l().mo38684a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo43888a(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo43585q().f47487a.mo44161a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo43890b(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo43585q().f47487a.mo44161a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int[] mo43891e() {
        Map a = C16942h.m56208a(this.f47275a.mo43581m());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C16942h.f47400U.mo44132a()).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo43585q().f47490d.mo44161a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo43585q().f47490d.mo44161a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16919ej mo43639f() {
        return super.mo43639f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16927er mo43641g() {
        return super.mo43641g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16933ex mo43643h() {
        return super.mo43643h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
