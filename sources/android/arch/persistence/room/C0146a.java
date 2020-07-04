package android.arch.persistence.room;

import android.arch.persistence.p009a.C0135c.C0139c;
import android.arch.persistence.room.RoomDatabase.C0144b;
import android.arch.persistence.room.RoomDatabase.C0145c;
import android.arch.persistence.room.RoomDatabase.JournalMode;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* renamed from: android.arch.persistence.room.a */
public final class C0146a {

    /* renamed from: a */
    public final C0139c f305a;

    /* renamed from: b */
    public final Context f306b;

    /* renamed from: c */
    public final String f307c;

    /* renamed from: d */
    public final C0145c f308d;

    /* renamed from: e */
    public final List<C0144b> f309e;

    /* renamed from: f */
    public final boolean f310f;

    /* renamed from: g */
    public final JournalMode f311g;

    /* renamed from: h */
    public final boolean f312h;

    /* renamed from: i */
    private final Set<Integer> f313i;

    /* renamed from: a */
    public final boolean mo326a(int i) {
        if (!this.f312h || (this.f313i != null && this.f313i.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }

    public C0146a(Context context, String str, C0139c cVar, C0145c cVar2, List<C0144b> list, boolean z, JournalMode journalMode, boolean z2, Set<Integer> set) {
        this.f305a = cVar;
        this.f306b = context;
        this.f307c = str;
        this.f308d = cVar2;
        this.f309e = list;
        this.f310f = z;
        this.f311g = journalMode;
        this.f312h = z2;
        this.f313i = set;
    }
}
