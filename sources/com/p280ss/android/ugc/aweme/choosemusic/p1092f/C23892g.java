package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.g */
public final class C23892g {

    /* renamed from: a */
    public MusicModel f63043a;

    /* renamed from: b */
    public int f63044b;

    /* renamed from: c */
    public boolean f63045c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23892g) {
                C23892g gVar = (C23892g) obj;
                if (C7573i.m23585a((Object) this.f63043a, (Object) gVar.f63043a)) {
                    if (this.f63044b == gVar.f63044b) {
                        if (this.f63045c == gVar.f63045c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MusicModel musicModel = this.f63043a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f63044b) * 31;
        boolean z = this.f63045c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayMusicInfo(musicModel=");
        sb.append(this.f63043a);
        sb.append(", pageType=");
        sb.append(this.f63044b);
        sb.append(", isLoop=");
        sb.append(this.f63045c);
        sb.append(")");
        return sb.toString();
    }

    public C23892g(MusicModel musicModel, int i, boolean z) {
        this.f63043a = musicModel;
        this.f63044b = i;
        this.f63045c = z;
    }
}
