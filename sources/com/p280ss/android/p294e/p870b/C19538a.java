package com.p280ss.android.p294e.p870b;

/* renamed from: com.ss.android.e.b.a */
public abstract class C19538a {

    /* renamed from: a */
    protected boolean f52848a;

    /* renamed from: b */
    protected int f52849b;

    /* renamed from: c */
    protected long f52850c;

    /* renamed from: a */
    public final boolean mo51676a() {
        return this.f52848a;
    }

    /* renamed from: c */
    public final void mo51678c() {
        this.f52848a = false;
    }

    /* renamed from: d */
    public final long mo51679d() {
        return this.f52850c;
    }

    /* renamed from: e */
    public final int mo51680e() {
        return this.f52849b;
    }

    /* renamed from: g */
    public abstract String mo51682g();

    /* renamed from: f */
    public final void mo51681f() {
        this.f52848a = false;
        this.f52849b = 0;
    }

    /* renamed from: b */
    public final boolean mo51677b() {
        if (mo51676a()) {
            return false;
        }
        this.f52848a = true;
        this.f52849b++;
        this.f52850c = System.currentTimeMillis();
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlackRoomItem{name=");
        sb.append(mo51682g());
        sb.append("lockedCount=");
        sb.append(this.f52849b);
        sb.append(", inBlackRoom=");
        sb.append(this.f52848a);
        sb.append('}');
        return sb.toString();
    }
}
