package com.p280ss.android.ugc.aweme.tools;

import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: com.ss.android.ugc.aweme.tools.n */
public class C42568n extends C42249c {

    /* renamed from: a */
    public AVMusic f110702a;

    /* renamed from: b */
    public String f110703b;

    public String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicResultEvent{music=");
        sb.append(this.f110702a);
        sb.append(", localPath='");
        sb.append(this.f110703b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C42568n(AVMusic aVMusic, String str) {
        this.f110702a = aVMusic;
        this.f110703b = str;
    }
}
