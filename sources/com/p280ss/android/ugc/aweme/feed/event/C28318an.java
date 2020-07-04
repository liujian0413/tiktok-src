package com.p280ss.android.ugc.aweme.feed.event;

/* renamed from: com.ss.android.ugc.aweme.feed.event.an */
public class C28318an {

    /* renamed from: a */
    public int f74631a;

    /* renamed from: b */
    public Object f74632b;

    /* renamed from: c */
    public int f74633c;

    /* renamed from: d */
    public String f74634d;

    /* renamed from: e */
    public String f74635e;

    /* renamed from: f */
    public long f74636f;

    /* renamed from: g */
    public int f74637g;

    /* renamed from: h */
    public int f74638h = -1;

    /* renamed from: i */
    public long f74639i;

    /* renamed from: j */
    public boolean f74640j;

    /* renamed from: k */
    public boolean f74641k;

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoEvent{type=");
        sb.append(this.f74631a);
        sb.append(", param=");
        sb.append(this.f74632b);
        sb.append(", videoType=");
        sb.append(this.f74633c);
        sb.append(", from='");
        sb.append(this.f74634d);
        sb.append(", currentPosition='");
        sb.append(this.f74639i);
        sb.append(", isPlaying='");
        sb.append(this.f74640j);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C28318an(int i) {
        this.f74631a = i;
    }

    public C28318an(int i, Object obj) {
        this.f74631a = i;
        this.f74632b = obj;
    }
}
