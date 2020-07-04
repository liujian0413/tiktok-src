package com.bytedance.android.livesdkapi.message;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.message.b */
public class C9500b {
    @C6593c(mo15949a = "create_time")

    /* renamed from: a */
    public long f25991a;
    @C6593c(mo15949a = "play_time")

    /* renamed from: b */
    public long f25992b;
    @C6593c(mo15949a = "room_id")

    /* renamed from: c */
    public long f25993c;
    @C6593c(mo15949a = "msg_id")

    /* renamed from: d */
    public long f25994d;
    @C6593c(mo15949a = "method")

    /* renamed from: e */
    public String f25995e;
    @C6593c(mo15949a = "describe")

    /* renamed from: f */
    public String f25996f;
    @C6593c(mo15949a = "is_show_msg")

    /* renamed from: g */
    public boolean f25997g;
    @C6593c(mo15949a = "to_dids")

    /* renamed from: h */
    public List<String> f25998h;
    @C6593c(mo15949a = "monitor")

    /* renamed from: i */
    public int f25999i;
    @C6593c(mo15949a = "display_text")

    /* renamed from: j */
    public C9505f f26000j;
    @C6593c(mo15949a = "fold_type")

    /* renamed from: k */
    public long f26001k;

    /* renamed from: a */
    public static C9500b m28035a(long j, boolean z) {
        C9500b bVar = new C9500b();
        bVar.f25991a = System.currentTimeMillis();
        bVar.f25993c = j;
        bVar.f25994d = -1;
        bVar.f25997g = true;
        return bVar;
    }
}
