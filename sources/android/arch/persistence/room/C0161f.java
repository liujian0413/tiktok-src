package android.arch.persistence.room;

/* renamed from: android.arch.persistence.room.f */
public final class C0161f {
    /* renamed from: a */
    public static String m443a(String str) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"");
        sb.append(str);
        sb.append("\")");
        return sb.toString();
    }
}
