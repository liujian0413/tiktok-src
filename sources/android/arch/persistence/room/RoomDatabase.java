package android.arch.persistence.room;

import android.app.ActivityManager;
import android.arch.p005a.p006a.C0002a;
import android.arch.persistence.p009a.C0125a;
import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0135c;
import android.arch.persistence.p009a.C0135c.C0139c;
import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.p009a.p010a.C0131c;
import android.arch.persistence.room.p011a.C0147a;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0597b;
import android.support.p022v4.util.C0905l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public abstract class RoomDatabase {

    /* renamed from: a */
    public volatile C0134b f286a;

    /* renamed from: b */
    public C0135c f287b;

    /* renamed from: c */
    public final C0156d f288c = mo305a();

    /* renamed from: d */
    boolean f289d;

    /* renamed from: e */
    public List<C0144b> f290e;

    /* renamed from: f */
    public final ReentrantLock f291f = new ReentrantLock();

    /* renamed from: g */
    private boolean f292g;

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: 0000 */
        public final JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            if (VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && !C0597b.m2482a(activityManager)) {
                    return WRITE_AHEAD_LOGGING;
                }
            }
            return TRUNCATE;
        }
    }

    /* renamed from: android.arch.persistence.room.RoomDatabase$a */
    public static class C0143a<T extends RoomDatabase> {

        /* renamed from: a */
        private final Class<T> f293a;

        /* renamed from: b */
        private final String f294b;

        /* renamed from: c */
        private final Context f295c;

        /* renamed from: d */
        private ArrayList<C0144b> f296d;

        /* renamed from: e */
        private C0139c f297e;

        /* renamed from: f */
        private boolean f298f;

        /* renamed from: g */
        private JournalMode f299g = JournalMode.AUTOMATIC;

        /* renamed from: h */
        private boolean f300h = true;

        /* renamed from: i */
        private final C0145c f301i = new C0145c();

        /* renamed from: j */
        private Set<Integer> f302j;

        /* renamed from: k */
        private Set<Integer> f303k;

        /* renamed from: a */
        public final C0143a<T> mo318a() {
            this.f298f = true;
            return this;
        }

        /* renamed from: b */
        public final C0143a<T> mo321b() {
            this.f300h = false;
            return this;
        }

        /* renamed from: c */
        public final T mo322c() {
            if (this.f295c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f293a != null) {
                if (!(this.f303k == null || this.f302j == null)) {
                    for (Integer num : this.f303k) {
                        if (this.f302j.contains(num)) {
                            StringBuilder sb = new StringBuilder("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                            sb.append(num);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                if (this.f297e == null) {
                    this.f297e = new C0131c();
                }
                C0146a aVar = new C0146a(this.f295c, this.f294b, this.f297e, this.f301i, this.f296d, this.f298f, this.f299g.resolve(this.f295c), this.f300h, this.f302j);
                T t = (RoomDatabase) C0160e.m442a(this.f293a, "_Impl");
                t.mo309a(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: a */
        public final C0143a<T> mo319a(C0144b bVar) {
            if (this.f296d == null) {
                this.f296d = new ArrayList<>();
            }
            this.f296d.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C0143a<T> mo320a(C0147a... aVarArr) {
            if (this.f303k == null) {
                this.f303k = new HashSet();
            }
            for (C0147a aVar : aVarArr) {
                this.f303k.add(Integer.valueOf(aVar.f314a));
                this.f303k.add(Integer.valueOf(aVar.f315b));
            }
            this.f301i.mo325a(aVarArr);
            return this;
        }

        C0143a(Context context, Class<T> cls, String str) {
            this.f295c = context;
            this.f293a = cls;
            this.f294b = str;
        }
    }

    /* renamed from: android.arch.persistence.room.RoomDatabase$b */
    public static abstract class C0144b {
        /* renamed from: a */
        public void mo323a(C0134b bVar) {
        }
    }

    /* renamed from: android.arch.persistence.room.RoomDatabase$c */
    public static class C0145c {

        /* renamed from: a */
        private C0905l<C0905l<C0147a>> f304a = new C0905l<>();

        /* renamed from: a */
        public final void mo325a(C0147a... aVarArr) {
            for (C0147a a : aVarArr) {
                m405a(a);
            }
        }

        /* renamed from: a */
        private void m405a(C0147a aVar) {
            int i = aVar.f314a;
            int i2 = aVar.f315b;
            C0905l lVar = (C0905l) this.f304a.mo3433a(i);
            if (lVar == null) {
                lVar = new C0905l();
                this.f304a.mo3437b(i, lVar);
            }
            lVar.mo3440c(i2, aVar);
        }

        /* renamed from: a */
        public final List<C0147a> mo324a(int i, int i2) {
            boolean z;
            if (i == i2) {
                return Collections.emptyList();
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return m404a(new ArrayList(), z, i, i2);
        }

        /* renamed from: a */
        private List<C0147a> m404a(List<C0147a> list, boolean z, int i, int i2) {
            int i3;
            boolean z2;
            int i4;
            int i5;
            boolean z3;
            if (z) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                C0905l lVar = (C0905l) this.f304a.mo3433a(i);
                if (lVar != null) {
                    int b = lVar.mo3435b();
                    z2 = false;
                    if (z) {
                        i5 = b - 1;
                        i4 = -1;
                    } else {
                        i4 = b;
                        i5 = 0;
                    }
                    while (true) {
                        if (i5 == i4) {
                            break;
                        }
                        int d = lVar.mo3442d(i5);
                        if (!z ? d < i2 || d >= i : d > i2 || d <= i) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            list.add(lVar.mo3443e(i5));
                            i = d;
                            z2 = true;
                            continue;
                            break;
                        }
                        i5 += i3;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0156d mo305a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0135c mo310b(C0146a aVar);

    /* renamed from: b */
    public final boolean mo311b() {
        C0134b bVar = this.f286a;
        if (bVar == null || !bVar.mo273e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo315f() {
        this.f287b.mo277a().mo269c();
    }

    /* renamed from: g */
    public final boolean mo316g() {
        return this.f287b.mo277a().mo272d();
    }

    /* renamed from: c */
    public final void mo312c() {
        if (!this.f292g && C0002a.m4a().mo17d()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: d */
    public final void mo313d() {
        mo312c();
        C0134b a = this.f287b.mo277a();
        this.f288c.mo352b(a);
        a.mo266a();
    }

    /* renamed from: e */
    public final void mo314e() {
        this.f287b.mo277a().mo268b();
        if (!mo316g()) {
            this.f288c.mo351b();
        }
    }

    /* renamed from: a */
    public final void mo308a(C0134b bVar) {
        this.f288c.mo349a(bVar);
    }

    /* renamed from: a */
    public final C0142f mo304a(String str) {
        mo312c();
        return this.f287b.mo277a().mo264a(str);
    }

    /* renamed from: a */
    public final Cursor mo306a(C0141e eVar) {
        mo312c();
        return this.f287b.mo277a().mo265a(eVar);
    }

    /* renamed from: a */
    public final void mo309a(C0146a aVar) {
        this.f287b = mo310b(aVar);
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            if (aVar.f311g == JournalMode.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f287b.mo278a(z);
        }
        this.f290e = aVar.f309e;
        this.f292g = aVar.f310f;
        this.f289d = z;
    }

    /* renamed from: a */
    public final Cursor mo307a(String str, Object[] objArr) {
        return this.f287b.mo277a().mo265a((C0141e) new C0125a(str, objArr));
    }
}
