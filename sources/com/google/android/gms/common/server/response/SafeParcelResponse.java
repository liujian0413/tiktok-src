package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C15319b;
import com.google.android.gms.common.util.C15320c;
import com.google.android.gms.common.util.C15330m;
import com.google.android.gms.common.util.C15331n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Creator<SafeParcelResponse> CREATOR = new C15306m();

    /* renamed from: a */
    private final int f39531a;

    /* renamed from: b */
    private final Parcel f39532b;

    /* renamed from: c */
    private final int f39533c = 2;

    /* renamed from: d */
    private final zak f39534d;

    /* renamed from: e */
    private final String f39535e;

    /* renamed from: f */
    private int f39536f;

    /* renamed from: g */
    private int f39537g;

    SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.f39531a = i;
        this.f39532b = (Parcel) C15267r.m44384a(parcel);
        this.f39534d = zak;
        if (this.f39534d == null) {
            this.f39535e = null;
        } else {
            this.f39535e = this.f39534d.f39538a;
        }
        this.f39536f = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39531a);
        C15269a.m44451a(parcel, 2, m44526b(), false);
        switch (this.f39533c) {
            case 0:
                zak = null;
                break;
            case 1:
                zak = this.f39534d;
                break;
            case 2:
                zak = this.f39534d;
                break;
            default:
                int i2 = this.f39533c;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        C15269a.m44452a(parcel, 3, (Parcelable) zak, i, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: b */
    private final Parcel m44526b() {
        switch (this.f39536f) {
            case 0:
                this.f39537g = C15269a.m44442a(this.f39532b);
                break;
            case 1:
                break;
        }
        C15269a.m44443a(this.f39532b, this.f39537g);
        this.f39536f = 2;
        return this.f39532b;
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo38038a() {
        if (this.f39534d == null) {
            return null;
        }
        return this.f39534d.mo38665a(this.f39535e);
    }

    /* renamed from: a */
    public final Object mo38643a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: b */
    public final boolean mo38644b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C15267r.m44385a(this.f39534d, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m44526b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m44525a(sb, this.f39534d.mo38665a(this.f39535e), b);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m44525a(StringBuilder sb, Map<String, Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((Field) entry.getValue()).f39511f, entry);
        }
        sb.append('{');
        int b = SafeParcelReader.m44414b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            Entry entry2 = (Entry) sparseArray.get(SafeParcelReader.m44407a(a));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                Field field = (Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.mo38647a()) {
                    switch (field.f39508c) {
                        case 0:
                            m44524a(sb, field, m44501a(field, Integer.valueOf(SafeParcelReader.m44419d(parcel, a))));
                            break;
                        case 1:
                            m44524a(sb, field, m44501a(field, SafeParcelReader.m44423h(parcel, a)));
                            break;
                        case 2:
                            m44524a(sb, field, m44501a(field, Long.valueOf(SafeParcelReader.m44421f(parcel, a))));
                            break;
                        case 3:
                            m44524a(sb, field, m44501a(field, Float.valueOf(SafeParcelReader.m44424i(parcel, a))));
                            break;
                        case 4:
                            m44524a(sb, field, m44501a(field, Double.valueOf(SafeParcelReader.m44426k(parcel, a))));
                            break;
                        case 5:
                            m44524a(sb, field, m44501a(field, SafeParcelReader.m44428m(parcel, a)));
                            break;
                        case 6:
                            m44524a(sb, field, m44501a(field, Boolean.valueOf(SafeParcelReader.m44415b(parcel, a))));
                            break;
                        case 7:
                            m44524a(sb, field, m44501a(field, SafeParcelReader.m44429n(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m44524a(sb, field, m44501a(field, SafeParcelReader.m44432q(parcel, a)));
                            break;
                        case 10:
                            Bundle p = SafeParcelReader.m44431p(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str2 : p.keySet()) {
                                hashMap.put(str2, p.getString(str2));
                            }
                            m44524a(sb, field, m44501a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f39508c;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f39509d) {
                    sb.append("[");
                    switch (field.f39508c) {
                        case 0:
                            C15319b.m44551a(sb, SafeParcelReader.m44434s(parcel, a));
                            break;
                        case 1:
                            C15319b.m44553a(sb, (T[]) SafeParcelReader.m44436u(parcel, a));
                            break;
                        case 2:
                            C15319b.m44552a(sb, SafeParcelReader.m44435t(parcel, a));
                            break;
                        case 3:
                            C15319b.m44550a(sb, SafeParcelReader.m44437v(parcel, a));
                            break;
                        case 4:
                            C15319b.m44549a(sb, SafeParcelReader.m44438w(parcel, a));
                            break;
                        case 5:
                            C15319b.m44553a(sb, (T[]) SafeParcelReader.m44439x(parcel, a));
                            break;
                        case 6:
                            C15319b.m44555a(sb, SafeParcelReader.m44433r(parcel, a));
                            break;
                        case 7:
                            C15319b.m44554a(sb, SafeParcelReader.m44440y(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] C = SafeParcelReader.m44404C(parcel, a);
                            int length = C.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                C[i2].setDataPosition(0);
                                m44525a(sb, field.mo38648b(), C[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f39508c) {
                        case 0:
                            sb.append(SafeParcelReader.m44419d(parcel, a));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m44423h(parcel, a));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m44421f(parcel, a));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m44424i(parcel, a));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m44426k(parcel, a));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m44428m(parcel, a));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m44415b(parcel, a));
                            break;
                        case 7:
                            String n = SafeParcelReader.m44429n(parcel, a);
                            sb.append("\"");
                            sb.append(C15330m.m44591a(n));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] q = SafeParcelReader.m44432q(parcel, a);
                            sb.append("\"");
                            sb.append(C15320c.m44559a(q));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] q2 = SafeParcelReader.m44432q(parcel, a);
                            sb.append("\"");
                            sb.append(C15320c.m44560b(q2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle p2 = SafeParcelReader.m44431p(parcel, a);
                            Set<String> keySet = p2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(C15330m.m44591a(p2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel B = SafeParcelReader.m44403B(parcel, a);
                            B.setDataPosition(0);
                            m44525a(sb, field.mo38648b(), B);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b);
        throw new ParseException(sb3.toString(), parcel);
    }

    /* renamed from: a */
    private static void m44524a(StringBuilder sb, Field<?, ?> field, Object obj) {
        if (field.f39507b) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m44523a(sb, field.f39506a, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m44523a(sb, field.f39506a, obj);
    }

    /* renamed from: a */
    private static void m44523a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C15330m.m44591a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C15320c.m44559a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C15320c.m44560b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C15331n.m44592a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
