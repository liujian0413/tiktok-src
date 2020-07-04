package p045cn.p046a.p047a.p048a;

import android.media.MediaFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cn.a.a.a.b */
public final class C1626b {

    /* renamed from: a */
    public Map<String, Object> f6054a = new HashMap();

    public final String toString() {
        return this.f6054a.toString();
    }

    /* renamed from: b */
    public static final C1626b m7975b(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return m7971a(mediaFormat.getInteger("track-id"), mediaFormat.getString("language"));
    }

    /* renamed from: c */
    public static final C1626b m7976c(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return m7970a(mediaFormat.getInteger("track-id"), mediaFormat.getInteger("width"), mediaFormat.getInteger("height"), mediaFormat.getInteger("bitrate"));
    }

    /* renamed from: a */
    public static final C1626b m7972a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return m7969a(mediaFormat.getInteger("track-id"), mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    /* renamed from: a */
    private void m7974a(String str, String str2) {
        this.f6054a.put(str, str2);
    }

    /* renamed from: a */
    private static C1626b m7971a(int i, String str) {
        C1626b bVar = new C1626b();
        bVar.m7973a("track-id", i);
        bVar.m7974a("language", str);
        return bVar;
    }

    /* renamed from: a */
    private void m7973a(String str, int i) {
        this.f6054a.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static C1626b m7969a(int i, int i2, int i3) {
        C1626b bVar = new C1626b();
        bVar.m7973a("track-id", i);
        bVar.m7973a("sample-rate", i2);
        bVar.m7973a("channel-count", i3);
        return bVar;
    }

    /* renamed from: a */
    private static C1626b m7970a(int i, int i2, int i3, int i4) {
        C1626b bVar = new C1626b();
        bVar.m7973a("track-id", i);
        bVar.m7973a("width", i2);
        bVar.m7973a("height", i3);
        bVar.m7973a("bitrate", i4);
        return bVar;
    }
}
