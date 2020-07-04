package com.bytedance.framwork.core.p517a;

import android.content.Context;
import com.bytedance.framwork.core.p517a.p519b.C10208a;
import com.bytedance.framwork.core.p517a.p521d.C10219a;
import com.bytedance.framwork.core.p517a.p521d.C10219a.C10222b;
import com.bytedance.framwork.core.p517a.p522e.C10231c;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.a.d */
public final class C10218d implements C10222b {

    /* renamed from: a */
    public boolean f27795a = true;

    /* renamed from: b */
    private C10209c f27796b;

    /* renamed from: c */
    private final LinkedList<C10208a> f27797c = new LinkedList<>();

    /* renamed from: d */
    private final int f27798d = 5;

    /* renamed from: e */
    private long f27799e = 0;

    /* renamed from: f */
    private final int f27800f = 120000;

    /* renamed from: g */
    private String f27801g;

    /* renamed from: a */
    public final void mo24929a() {
        C10219a.m30335a().mo24931a((C10222b) this);
    }

    public final void onTimeEvent(long j) {
        if (this.f27795a) {
            m30332a(j, false);
        }
    }

    /* renamed from: a */
    private void m30331a(C10208a aVar) {
        if (this.f27797c.size() >= 2000) {
            this.f27797c.poll();
        }
        this.f27797c.add(aVar);
    }

    public C10218d(Context context, String str) {
        this.f27796b = C10209c.m30304a(context);
        this.f27801g = str;
    }

    /* renamed from: a */
    private boolean m30332a(long j, boolean z) {
        LinkedList linkedList;
        int size = this.f27797c.size();
        if (size <= 0 || (size < 5 && j - this.f27799e <= 120000)) {
            return false;
        }
        this.f27799e = j;
        synchronized (this.f27797c) {
            linkedList = new LinkedList(this.f27797c);
            this.f27797c.clear();
        }
        if (!C10231c.m30354a(linkedList)) {
            try {
                this.f27796b.mo24925a(this.f27801g, (List<C10208a>) linkedList);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo24930a(String str, String str2, JSONObject jSONObject) {
        if (this.f27795a && jSONObject != null) {
            C10208a aVar = new C10208a(this.f27801g, str, str2, jSONObject.toString(), System.currentTimeMillis());
            m30331a(aVar);
        }
    }
}
