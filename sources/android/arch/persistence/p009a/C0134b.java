package android.arch.persistence.p009a;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: android.arch.persistence.a.b */
public interface C0134b extends Closeable {
    /* renamed from: a */
    C0142f mo264a(String str);

    /* renamed from: a */
    Cursor mo265a(C0141e eVar);

    /* renamed from: a */
    void mo266a();

    /* renamed from: b */
    Cursor mo267b(String str);

    /* renamed from: b */
    void mo268b();

    /* renamed from: c */
    void mo269c();

    /* renamed from: c */
    void mo270c(String str) throws SQLException;

    /* renamed from: d */
    boolean mo272d();

    /* renamed from: e */
    boolean mo273e();

    /* renamed from: f */
    String mo274f();

    /* renamed from: g */
    List<Pair<String, String>> mo275g();
}
