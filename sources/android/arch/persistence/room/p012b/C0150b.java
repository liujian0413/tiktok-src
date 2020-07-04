package android.arch.persistence.room.p012b;

import android.arch.persistence.p009a.C0134b;
import android.database.Cursor;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: android.arch.persistence.room.b.b */
public final class C0150b {

    /* renamed from: a */
    public final String f317a;

    /* renamed from: b */
    public final Map<String, C0151a> f318b;

    /* renamed from: c */
    public final Set<C0152b> f319c;

    /* renamed from: d */
    public final Set<C0154d> f320d;

    /* renamed from: android.arch.persistence.room.b.b$a */
    public static class C0151a {

        /* renamed from: a */
        public final String f321a;

        /* renamed from: b */
        public final String f322b;

        /* renamed from: c */
        public final int f323c;

        /* renamed from: d */
        public final boolean f324d;

        /* renamed from: e */
        public final int f325e;

        /* renamed from: a */
        private boolean m423a() {
            if (this.f325e > 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = ((this.f321a.hashCode() * 31) + this.f323c) * 31;
            if (this.f324d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f325e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f321a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.f322b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.f323c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.f324d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f325e);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        private static int m422a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            if (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) {
                return 4;
            }
            return 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0151a aVar = (C0151a) obj;
            if (VERSION.SDK_INT >= 20) {
                if (this.f325e != aVar.f325e) {
                    return false;
                }
            } else if (m423a() != aVar.m423a()) {
                return false;
            }
            if (this.f321a.equals(aVar.f321a) && this.f324d == aVar.f324d && this.f323c == aVar.f323c) {
                return true;
            }
            return false;
        }

        public C0151a(String str, String str2, boolean z, int i) {
            this.f321a = str;
            this.f322b = str2;
            this.f324d = z;
            this.f325e = i;
            this.f323c = m422a(str2);
        }
    }

    /* renamed from: android.arch.persistence.room.b.b$b */
    public static class C0152b {

        /* renamed from: a */
        public final String f326a;

        /* renamed from: b */
        public final String f327b;

        /* renamed from: c */
        public final String f328c;

        /* renamed from: d */
        public final List<String> f329d;

        /* renamed from: e */
        public final List<String> f330e;

        public final int hashCode() {
            return (((((((this.f326a.hashCode() * 31) + this.f327b.hashCode()) * 31) + this.f328c.hashCode()) * 31) + this.f329d.hashCode()) * 31) + this.f330e.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.f326a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.f327b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.f328c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.f329d);
            sb.append(", referenceColumnNames=");
            sb.append(this.f330e);
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0152b bVar = (C0152b) obj;
            if (this.f326a.equals(bVar.f326a) && this.f327b.equals(bVar.f327b) && this.f328c.equals(bVar.f328c) && this.f329d.equals(bVar.f329d)) {
                return this.f330e.equals(bVar.f330e);
            }
            return false;
        }

        public C0152b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f326a = str;
            this.f327b = str2;
            this.f328c = str3;
            this.f329d = Collections.unmodifiableList(list);
            this.f330e = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: android.arch.persistence.room.b.b$c */
    static class C0153c implements Comparable<C0153c> {

        /* renamed from: a */
        final int f331a;

        /* renamed from: b */
        final int f332b;

        /* renamed from: c */
        final String f333c;

        /* renamed from: d */
        final String f334d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C0153c cVar) {
            int i = this.f331a - cVar.f331a;
            if (i == 0) {
                return this.f332b - cVar.f332b;
            }
            return i;
        }

        C0153c(int i, int i2, String str, String str2) {
            this.f331a = i;
            this.f332b = i2;
            this.f333c = str;
            this.f334d = str2;
        }
    }

    /* renamed from: android.arch.persistence.room.b.b$d */
    public static class C0154d {

        /* renamed from: a */
        public final String f335a;

        /* renamed from: b */
        public final boolean f336b;

        /* renamed from: c */
        public final List<String> f337c;

        public final int hashCode() {
            int i;
            if (this.f335a.startsWith("index_")) {
                i = "index_".hashCode();
            } else {
                i = this.f335a.hashCode();
            }
            return (((i * 31) + (this.f336b ? 1 : 0)) * 31) + this.f337c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.f335a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.f336b);
            sb.append(", columns=");
            sb.append(this.f337c);
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0154d dVar = (C0154d) obj;
            if (this.f336b != dVar.f336b || !this.f337c.equals(dVar.f337c)) {
                return false;
            }
            if (this.f335a.startsWith("index_")) {
                return dVar.f335a.startsWith("index_");
            }
            return this.f335a.equals(dVar.f335a);
        }

        public C0154d(String str, boolean z, List<String> list) {
            this.f335a = str;
            this.f336b = z;
            this.f337c = list;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f317a != null) {
            i = this.f317a.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        if (this.f318b != null) {
            i2 = this.f318b.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.f319c != null) {
            i3 = this.f319c.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.f317a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.f318b);
        sb.append(", foreignKeys=");
        sb.append(this.f319c);
        sb.append(", indices=");
        sb.append(this.f320d);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0150b bVar = (C0150b) obj;
        if (this.f317a == null ? bVar.f317a != null : !this.f317a.equals(bVar.f317a)) {
            return false;
        }
        if (this.f318b == null ? bVar.f318b != null : !this.f318b.equals(bVar.f318b)) {
            return false;
        }
        if (this.f319c == null ? bVar.f319c != null : !this.f319c.equals(bVar.f319c)) {
            return false;
        }
        if (this.f320d == null || bVar.f320d == null) {
            return true;
        }
        return this.f320d.equals(bVar.f320d);
    }

    /* renamed from: a */
    private static List<C0153c> m418a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0153c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static C0150b m417a(C0134b bVar, String str) {
        return new C0150b(str, m420c(bVar, str), m419b(bVar, str), m421d(bVar, str));
    }

    /* renamed from: c */
    private static Map<String, C0151a> m420c(C0134b bVar, String str) {
        boolean z;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo267b(sb.toString());
        HashMap hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex("name");
                int columnIndex2 = b.getColumnIndex("type");
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    String string2 = b.getString(columnIndex2);
                    if (b.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new C0151a(string, string2, z, b.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private static Set<C0154d> m421d(C0134b bVar, String str) {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo267b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("name");
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b.moveToNext()) {
                        if ("c".equals(b.getString(columnIndex2))) {
                            String string = b.getString(columnIndex);
                            boolean z = true;
                            if (b.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0154d a = m416a(bVar, string, z);
                            if (a == null) {
                                b.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    b.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    private static Set<C0152b> m419b(C0134b bVar, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo267b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<C0153c> a = m418a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0153c cVar : a) {
                        if (cVar.f331a == i2) {
                            arrayList.add(cVar.f333c);
                            arrayList2.add(cVar.f334d);
                        }
                    }
                    C0152b bVar2 = new C0152b(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2);
                    hashSet.add(bVar2);
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C0154d m416a(C0134b bVar, String str, boolean z) {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        Cursor b = bVar.mo267b(sb.toString());
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b.moveToNext()) {
                        if (b.getInt(columnIndex2) >= 0) {
                            int i = b.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0154d dVar = new C0154d(str, z, arrayList);
                    b.close();
                    return dVar;
                }
            }
            b.close();
            return null;
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    public C0150b(String str, Map<String, C0151a> map, Set<C0152b> set, Set<C0154d> set2) {
        Set<C0154d> set3;
        this.f317a = str;
        this.f318b = Collections.unmodifiableMap(map);
        this.f319c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f320d = set3;
    }
}
