package com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.b */
public final class C34013b extends BaseResponse {
    @C6593c(mo15949a = "cursor")

    /* renamed from: a */
    public final int f88712a;
    @C6593c(mo15949a = "has_more")

    /* renamed from: b */
    public final boolean f88713b;
    @C6593c(mo15949a = "music_list")

    /* renamed from: c */
    public final List<C34015d> f88714c;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f88715d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34013b) {
                C34013b bVar = (C34013b) obj;
                if (this.f88712a == bVar.f88712a) {
                    if (!(this.f88713b == bVar.f88713b) || !C7573i.m23585a((Object) this.f88714c, (Object) bVar.f88714c) || !C7573i.m23585a((Object) this.f88715d, (Object) bVar.f88715d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f88712a) * 31;
        boolean z = this.f88713b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        List<C34015d> list = this.f88714c;
        int i2 = 0;
        int hashCode2 = (i + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f88715d;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicListResponse(cursor=");
        sb.append(this.f88712a);
        sb.append(", hasMore=");
        sb.append(this.f88713b);
        sb.append(", musicList=");
        sb.append(this.f88714c);
        sb.append(", logPb=");
        sb.append(this.f88715d);
        sb.append(")");
        return sb.toString();
    }
}
