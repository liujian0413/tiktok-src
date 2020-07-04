package com.p280ss.android.ugc.aweme.story.api;

import com.p280ss.android.ugc.aweme.story.api.model.LifeStory;

/* renamed from: com.ss.android.ugc.aweme.story.api.g */
public final class C41975g implements Cloneable {

    /* renamed from: a */
    public long f109036a;

    /* renamed from: b */
    public String f109037b;

    /* renamed from: c */
    public String f109038c;

    /* renamed from: d */
    public int f109039d;

    /* renamed from: e */
    public int f109040e;

    /* renamed from: f */
    public LifeStory f109041f;

    /* renamed from: g */
    public Exception f109042g;

    /* renamed from: h */
    public long f109043h;

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryPublishState{status=");
        sb.append(this.f109039d);
        sb.append(", progress=");
        sb.append(this.f109040e);
        sb.append(", successResult=");
        sb.append(this.f109041f);
        sb.append(", error=");
        sb.append(this.f109042g);
        sb.append(", taskPath=");
        sb.append(this.f109037b);
        sb.append(", uploadPath=");
        sb.append(this.f109038c);
        sb.append(", startTime=");
        sb.append(this.f109036a);
        sb.append(", errorTime=");
        sb.append(this.f109043h);
        sb.append("}");
        return sb.toString();
    }
}
