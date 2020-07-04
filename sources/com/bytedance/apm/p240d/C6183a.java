package com.bytedance.apm.p240d;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.p253n.C6283a;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d.a */
public final class C6183a {

    /* renamed from: a */
    public int f18174a;

    /* renamed from: b */
    public boolean f18175b;

    /* renamed from: c */
    public long f18176c;

    /* renamed from: d */
    public C6283a f18177d;

    /* renamed from: e */
    public boolean f18178e;

    /* renamed from: f */
    public long f18179f;

    /* renamed from: g */
    public int f18180g;

    /* renamed from: h */
    public long f18181h;

    /* renamed from: i */
    public String f18182i;

    /* renamed from: j */
    public String f18183j;

    /* renamed from: com.bytedance.apm.d.a$a */
    public static final class C6184a {

        /* renamed from: a */
        public int f18184a;

        /* renamed from: b */
        public boolean f18185b;

        /* renamed from: c */
        public long f18186c;

        /* renamed from: d */
        public C6283a f18187d;

        /* renamed from: e */
        public boolean f18188e;

        /* renamed from: f */
        public long f18189f;

        /* renamed from: g */
        public String f18190g;

        /* renamed from: h */
        public int f18191h;

        /* renamed from: i */
        public long f18192i;

        /* renamed from: j */
        public String f18193j;

        /* renamed from: k */
        public boolean f18194k;

        private C6184a() {
            this.f18184a = 1000;
            this.f18186c = 20000;
            this.f18189f = 1000;
            this.f18192i = 30000;
        }

        /* renamed from: a */
        public final C6183a mo14897a() {
            return new C6183a(this);
        }

        /* renamed from: a */
        public final C6184a mo14894a(long j) {
            this.f18186c = j;
            return this;
        }

        /* renamed from: b */
        public final C6184a mo14898b(long j) {
            this.f18189f = j;
            return this;
        }

        /* renamed from: a */
        public final C6184a mo14895a(C6283a aVar) {
            this.f18187d = aVar;
            return this;
        }

        /* renamed from: b */
        public final C6184a mo14899b(boolean z) {
            this.f18188e = z;
            return this;
        }

        /* renamed from: a */
        public final C6184a mo14896a(boolean z) {
            this.f18185b = z;
            return this;
        }
    }

    /* renamed from: a */
    public static C6184a m19176a() {
        return new C6184a();
    }

    public C6183a(C6184a aVar) {
        this.f18174a = aVar.f18184a;
        this.f18175b = aVar.f18185b;
        this.f18176c = aVar.f18186c;
        this.f18177d = aVar.f18187d;
        this.f18178e = aVar.f18188e;
        this.f18179f = aVar.f18189f;
        this.f18181h = aVar.f18192i;
        this.f18180g = aVar.f18191h;
        this.f18182i = aVar.f18193j;
        this.f18183j = aVar.f18190g;
        C6174c.m19139a(aVar.f18194k);
    }

    /* renamed from: a */
    public final void mo14893a(JSONObject jSONObject) {
        if (!jSONObject.isNull("drop_frame_block_threshold")) {
            this.f18179f = jSONObject.optLong("drop_frame_block_threshold");
        }
        if (!jSONObject.isNull("drop_frame_report_stack_switch")) {
            this.f18178e = jSONObject.optBoolean("drop_frame_report_stack_switch");
        }
    }
}
