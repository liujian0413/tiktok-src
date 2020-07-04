package com.p280ss.android.message.p885a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.message.a.a */
public final class C19810a {

    /* renamed from: a */
    public List<C19812b> f53764a = new ArrayList();

    /* renamed from: b */
    public String f53765b;

    /* renamed from: c */
    public String f53766c;

    /* renamed from: d */
    public String f53767d;

    /* renamed from: e */
    public String f53768e;

    /* renamed from: com.ss.android.message.a.a$a */
    public static class C19811a {

        /* renamed from: a */
        public C19810a f53769a;

        /* renamed from: d */
        public static C19811a m65411d(String str) {
            return new C19811a(str);
        }

        /* renamed from: a */
        public final C19811a mo53156a(C19812b bVar) {
            this.f53769a.f53764a.add(bVar);
            return this;
        }

        /* renamed from: b */
        public final C19811a mo53158b(String str) {
            this.f53769a.f53767d = str;
            return this;
        }

        /* renamed from: c */
        public final C19811a mo53159c(String str) {
            this.f53769a.f53768e = str;
            return this;
        }

        private C19811a(String str) {
            this.f53769a = new C19810a(str);
        }

        /* renamed from: a */
        public final C19811a mo53157a(String str) {
            this.f53769a.f53766c = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.message.a.a$b */
    public static class C19812b {

        /* renamed from: a */
        List<String> f53770a;

        /* renamed from: b */
        List<String> f53771b;

        /* renamed from: c */
        Uri f53772c;

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (this.f53770a != null) {
                i = this.f53770a.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f53771b != null) {
                i2 = this.f53771b.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (this.f53772c != null) {
                i3 = this.f53772c.hashCode();
            }
            return i5 + i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntentFilter{actions=");
            sb.append(this.f53770a);
            sb.append(", categories=");
            sb.append(this.f53771b);
            sb.append(", data=");
            sb.append(this.f53772c);
            sb.append('}');
            return sb.toString();
        }

        public C19812b(List<String> list) {
            this(list, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19812b)) {
                return false;
            }
            C19812b bVar = (C19812b) obj;
            if (this.f53770a == null ? bVar.f53770a != null : !this.f53770a.equals(bVar.f53770a)) {
                return false;
            }
            if (this.f53771b == null ? bVar.f53771b != null : !this.f53771b.equals(bVar.f53771b)) {
                return false;
            }
            if (this.f53772c != null) {
                return this.f53772c.equals(bVar.f53772c);
            }
            if (bVar.f53772c == null) {
                return true;
            }
            return false;
        }

        public C19812b(List<String> list, List<String> list2) {
            this.f53770a = list;
            this.f53771b = list2;
        }

        public C19812b(List<String> list, List<String> list2, Uri uri) {
            this.f53770a = list;
            this.f53771b = null;
            this.f53772c = uri;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f53764a != null) {
            i = this.f53764a.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f53765b != null) {
            i2 = this.f53765b.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f53766c != null) {
            i3 = this.f53766c.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f53767d != null) {
            i4 = this.f53767d.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f53768e != null) {
            i5 = this.f53768e.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component{name='");
        sb.append(this.f53765b);
        sb.append('\'');
        sb.append(", intentFilter=");
        sb.append(this.f53764a);
        sb.append(", processName='");
        sb.append(this.f53766c);
        sb.append('\'');
        sb.append(", permission='");
        sb.append(this.f53767d);
        sb.append('\'');
        sb.append(", authorities='");
        sb.append(this.f53768e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C19810a(String str) {
        this.f53765b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19810a)) {
            return false;
        }
        C19810a aVar = (C19810a) obj;
        if (this.f53764a == null ? aVar.f53764a != null : !this.f53764a.equals(aVar.f53764a)) {
            return false;
        }
        if (this.f53765b == null ? aVar.f53765b != null : !this.f53765b.equals(aVar.f53765b)) {
            return false;
        }
        if (this.f53766c == null ? aVar.f53766c != null : !this.f53766c.equals(aVar.f53766c)) {
            return false;
        }
        if (this.f53767d == null ? aVar.f53767d != null : !this.f53767d.equals(aVar.f53767d)) {
            return false;
        }
        if (this.f53768e == null ? aVar.f53768e == null : this.f53768e.equals(aVar.f53768e)) {
            return true;
        }
        return false;
    }
}
