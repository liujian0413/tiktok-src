package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15265q.C15266a;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C15320c;
import com.google.android.gms.common.util.C15330m;
import com.google.android.gms.common.util.C15331n;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C15302i CREATOR = new C15302i();

        /* renamed from: a */
        protected final int f39506a;

        /* renamed from: b */
        protected final boolean f39507b;

        /* renamed from: c */
        protected final int f39508c;

        /* renamed from: d */
        protected final boolean f39509d;

        /* renamed from: e */
        protected final String f39510e;

        /* renamed from: f */
        public final int f39511f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f39512g;

        /* renamed from: h */
        public zak f39513h;

        /* renamed from: i */
        private final int f39514i;

        /* renamed from: j */
        private final String f39515j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C15292a<I, O> f39516k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f39514i = i;
            this.f39506a = i2;
            this.f39507b = z;
            this.f39508c = i3;
            this.f39509d = z2;
            this.f39510e = str;
            this.f39511f = i4;
            if (str2 == null) {
                this.f39512g = null;
                this.f39515j = null;
            } else {
                this.f39512g = SafeParcelResponse.class;
                this.f39515j = str2;
            }
            if (zaa == null) {
                this.f39516k = null;
            } else {
                this.f39516k = zaa.mo38641a();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C15292a<I, O> aVar) {
            this.f39514i = 1;
            this.f39506a = i;
            this.f39507b = z;
            this.f39508c = i2;
            this.f39509d = z2;
            this.f39510e = str;
            this.f39511f = i3;
            this.f39512g = cls;
            if (cls == null) {
                this.f39515j = null;
            } else {
                this.f39515j = cls.getCanonicalName();
            }
            this.f39516k = null;
        }

        /* renamed from: c */
        private final String m44514c() {
            if (this.f39515j == null) {
                return null;
            }
            return this.f39515j;
        }

        /* renamed from: a */
        public final boolean mo38647a() {
            return this.f39516k != null;
        }

        /* renamed from: d */
        private final zaa m44515d() {
            if (this.f39516k == null) {
                return null;
            }
            return zaa.m44499a(this.f39516k);
        }

        /* renamed from: b */
        public final Map<String, Field<?, ?>> mo38648b() {
            C15267r.m44384a(this.f39515j);
            C15267r.m44384a(this.f39513h);
            return this.f39513h.mo38665a(this.f39515j);
        }

        /* renamed from: a */
        public final I mo38646a(O o) {
            return this.f39516k.mo38632a(o);
        }

        /* renamed from: a */
        public static Field<Integer, Integer> m44508a(String str, int i) {
            Field field = new Field(0, false, 0, false, str, 3, null, null);
            return field;
        }

        /* renamed from: b */
        public static Field<String, String> m44511b(String str, int i) {
            Field field = new Field(7, false, 7, false, str, i, null, null);
            return field;
        }

        /* renamed from: c */
        public static Field<ArrayList<String>, ArrayList<String>> m44513c(String str, int i) {
            Field field = new Field(7, true, 7, true, str, i, null, null);
            return field;
        }

        /* renamed from: d */
        public static Field<byte[], byte[]> m44516d(String str, int i) {
            Field field = new Field(8, false, 8, false, str, 4, null, null);
            return field;
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m44509a(String str, int i, Class<T> cls) {
            Field field = new Field(11, false, 11, false, str, i, cls, null);
            return field;
        }

        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m44512b(String str, int i, Class<T> cls) {
            Field field = new Field(11, true, 11, true, str, 2, cls, null);
            return field;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C15269a.m44442a(parcel);
            C15269a.m44447a(parcel, 1, this.f39514i);
            C15269a.m44447a(parcel, 2, this.f39506a);
            C15269a.m44459a(parcel, 3, this.f39507b);
            C15269a.m44447a(parcel, 4, this.f39508c);
            C15269a.m44459a(parcel, 5, this.f39509d);
            C15269a.m44457a(parcel, 6, this.f39510e, false);
            C15269a.m44447a(parcel, 7, this.f39511f);
            C15269a.m44457a(parcel, 8, m44514c(), false);
            C15269a.m44452a(parcel, 9, (Parcelable) m44515d(), i, false);
            C15269a.m44443a(parcel, a);
        }

        public String toString() {
            C15266a a = C15265q.m44380a((Object) this).mo38611a("versionCode", Integer.valueOf(this.f39514i)).mo38611a("typeIn", Integer.valueOf(this.f39506a)).mo38611a("typeInArray", Boolean.valueOf(this.f39507b)).mo38611a("typeOut", Integer.valueOf(this.f39508c)).mo38611a("typeOutArray", Boolean.valueOf(this.f39509d)).mo38611a("outputFieldName", this.f39510e).mo38611a("safeParcelFieldId", Integer.valueOf(this.f39511f)).mo38611a("concreteTypeName", m44514c());
            Class<? extends FastJsonResponse> cls = this.f39512g;
            if (cls != null) {
                a.mo38611a("concreteType.class", cls.getCanonicalName());
            }
            if (this.f39516k != null) {
                a.mo38611a("converterName", this.f39516k.getClass().getCanonicalName());
            }
            return a.toString();
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C15292a<I, O> {
        /* renamed from: a */
        I mo38632a(O o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo38643a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo38038a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo38644b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo38039a(Field field) {
        if (field.f39508c != 11) {
            return mo38644b(field.f39510e);
        }
        if (field.f39509d) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: a */
    protected static <O, I> I m44501a(Field<I, O> field, Object obj) {
        return field.f39516k != null ? field.mo38646a(obj) : obj;
    }

    public String toString() {
        Map a = mo38038a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo38039a(field)) {
                Object a2 = m44501a(field, mo38040b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f39508c) {
                        case 8:
                            sb.append("\"");
                            sb.append(C15320c.m44559a((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C15320c.m44560b((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 10:
                            C15331n.m44592a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f39507b) {
                                m44502a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m44502a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo38040b(Field field) {
        String str = field.f39510e;
        if (field.f39512g == null) {
            return mo38643a(field.f39510e);
        }
        mo38643a(field.f39510e);
        C15267r.m44392a(true, "Concrete field shouldn't be value object: %s", field.f39510e);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m44502a(StringBuilder sb, Field field, Object obj) {
        if (field.f39506a == 11) {
            sb.append(((FastJsonResponse) field.f39512g.cast(obj)).toString());
        } else if (field.f39506a == 7) {
            sb.append("\"");
            sb.append(C15330m.m44591a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
