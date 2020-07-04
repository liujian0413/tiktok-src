package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.C13318c;
import com.facebook.common.memory.C13319d;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.imagepipeline.memory.ab */
public final class C13799ab {

    /* renamed from: a */
    public final C13803ad f36609a;

    /* renamed from: b */
    public final C13804ae f36610b;

    /* renamed from: c */
    public final C13803ad f36611c;

    /* renamed from: d */
    public final C13318c f36612d;

    /* renamed from: e */
    public final C13803ad f36613e;

    /* renamed from: f */
    public final C13804ae f36614f;

    /* renamed from: g */
    public final C13803ad f36615g;

    /* renamed from: h */
    public final C13804ae f36616h;

    /* renamed from: i */
    public final String f36617i;

    /* renamed from: j */
    public final int f36618j;

    /* renamed from: k */
    public final int f36619k;

    /* renamed from: com.facebook.imagepipeline.memory.ab$a */
    public static class C13801a {

        /* renamed from: a */
        public C13803ad f36620a;

        /* renamed from: b */
        public C13804ae f36621b;

        /* renamed from: c */
        public C13803ad f36622c;

        /* renamed from: d */
        public C13318c f36623d;

        /* renamed from: e */
        public C13803ad f36624e;

        /* renamed from: f */
        public C13804ae f36625f;

        /* renamed from: g */
        public C13803ad f36626g;

        /* renamed from: h */
        public C13804ae f36627h;

        /* renamed from: i */
        public String f36628i;

        /* renamed from: j */
        public int f36629j;

        /* renamed from: k */
        public int f36630k;

        private C13801a() {
        }

        /* renamed from: a */
        public final C13799ab mo33426a() {
            return new C13799ab(this);
        }

        /* renamed from: a */
        public final C13801a mo33425a(C13318c cVar) {
            this.f36623d = cVar;
            return this;
        }
    }

    /* renamed from: a */
    public static C13801a m40732a() {
        return new C13801a();
    }

    private C13799ab(C13801a aVar) {
        C13803ad adVar;
        C13804ae aeVar;
        C13803ad adVar2;
        C13318c cVar;
        C13803ad adVar3;
        C13804ae aeVar2;
        C13803ad adVar4;
        C13804ae aeVar3;
        String str;
        int i;
        if (C13783b.m40665b()) {
            C13783b.m40664a("PoolConfig()");
        }
        if (aVar.f36620a == null) {
            adVar = C13815j.m40784a();
        } else {
            adVar = aVar.f36620a;
        }
        this.f36609a = adVar;
        if (aVar.f36621b == null) {
            aeVar = C13832y.m40855a();
        } else {
            aeVar = aVar.f36621b;
        }
        this.f36610b = aeVar;
        if (aVar.f36622c == null) {
            adVar2 = C13817l.m40788a();
        } else {
            adVar2 = aVar.f36622c;
        }
        this.f36611c = adVar2;
        if (aVar.f36623d == null) {
            cVar = C13319d.m38972a();
        } else {
            cVar = aVar.f36623d;
        }
        this.f36612d = cVar;
        if (aVar.f36624e == null) {
            adVar3 = C13818m.m40789a();
        } else {
            adVar3 = aVar.f36624e;
        }
        this.f36613e = adVar3;
        if (aVar.f36625f == null) {
            aeVar2 = C13832y.m40855a();
        } else {
            aeVar2 = aVar.f36625f;
        }
        this.f36614f = aeVar2;
        if (aVar.f36626g == null) {
            adVar4 = C13816k.m40786a();
        } else {
            adVar4 = aVar.f36626g;
        }
        this.f36615g = adVar4;
        if (aVar.f36627h == null) {
            aeVar3 = C13832y.m40855a();
        } else {
            aeVar3 = aVar.f36627h;
        }
        this.f36616h = aeVar3;
        if (aVar.f36628i == null) {
            str = "legacy";
        } else {
            str = aVar.f36628i;
        }
        this.f36617i = str;
        this.f36618j = aVar.f36629j;
        if (aVar.f36630k > 0) {
            i = aVar.f36630k;
        } else {
            i = 4194304;
        }
        this.f36619k = i;
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }
}
