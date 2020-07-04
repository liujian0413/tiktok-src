package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.C2347g;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.media.e */
public final class C2359e {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f7756a;
    @C6593c(mo15949a = "id_str")

    /* renamed from: b */
    public String f7757b;
    @C6593c(mo15949a = "album")

    /* renamed from: c */
    public String f7758c;
    @C6593c(mo15949a = "title")

    /* renamed from: d */
    public String f7759d;
    @C6593c(mo15949a = "cover_hd")

    /* renamed from: e */
    public ImageModel f7760e;
    @C6593c(mo15949a = "cover_large")

    /* renamed from: f */
    public ImageModel f7761f;
    @C6593c(mo15949a = "cover_medium")

    /* renamed from: g */
    public ImageModel f7762g;
    @C6593c(mo15949a = "cover_thumb")

    /* renamed from: h */
    public ImageModel f7763h;
    @C6593c(mo15949a = "play_url")

    /* renamed from: i */
    public C2347g f7764i;
    @C6593c(mo15949a = "author")

    /* renamed from: j */
    public String f7765j;
    @C6593c(mo15949a = "schema_url")

    /* renamed from: k */
    public String f7766k;
    @C6593c(mo15949a = "source_platform")

    /* renamed from: l */
    public int f7767l;
    @C6593c(mo15949a = "start_time")

    /* renamed from: m */
    public int f7768m;
    @C6593c(mo15949a = "end_time")

    /* renamed from: n */
    public int f7769n;
    @C6593c(mo15949a = "duration")

    /* renamed from: o */
    public int f7770o;
    @C6593c(mo15949a = "status")

    /* renamed from: p */
    public int f7771p;
    @C6593c(mo15949a = "extra")

    /* renamed from: q */
    public String f7772q;
    @C6593c(mo15949a = "share_url")

    /* renamed from: r */
    public String f7773r;
    @C6593c(mo15949a = "share_title")

    /* renamed from: s */
    public String f7774s;
    @C6593c(mo15949a = "share_description")

    /* renamed from: t */
    public String f7775t;
    @C6593c(mo15949a = "original_user_id")

    /* renamed from: u */
    public long f7776u;
    @C6593c(mo15949a = "original_titel_tpl")

    /* renamed from: v */
    public String f7777v;
    @C6593c(mo15949a = "video_cnt")

    /* renamed from: w */
    public long f7778w;
    @C6593c(mo15949a = "is_user_favorite")

    /* renamed from: x */
    public boolean f7779x;
    @C6593c(mo15949a = "audio_track")

    /* renamed from: y */
    public ImageModel f7780y;

    /* renamed from: z */
    public String f7781z;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Music{id=");
        sb.append(this.f7756a);
        sb.append(", mid='");
        sb.append(this.f7757b);
        sb.append('\'');
        sb.append(", album='");
        sb.append(this.f7758c);
        sb.append('\'');
        sb.append(", musicName='");
        sb.append(this.f7759d);
        sb.append('\'');
        sb.append(", converHd=");
        sb.append(this.f7760e);
        sb.append(", coverLarge=");
        sb.append(this.f7761f);
        sb.append(", coverMedium=");
        sb.append(this.f7762g);
        sb.append(", coverThumb=");
        sb.append(this.f7763h);
        sb.append(", playUrl=");
        sb.append(this.f7764i);
        sb.append(", authorName='");
        sb.append(this.f7765j);
        sb.append('\'');
        sb.append(", schema='");
        sb.append(this.f7766k);
        sb.append('\'');
        sb.append(", source=");
        sb.append(this.f7767l);
        sb.append(", startTime=");
        sb.append(this.f7768m);
        sb.append(", endTime=");
        sb.append(this.f7769n);
        sb.append(", duration=");
        sb.append(this.f7770o);
        sb.append(", status=");
        sb.append(this.f7771p);
        sb.append(", extra='");
        sb.append(this.f7772q);
        sb.append('\'');
        sb.append(", shareUrl='");
        sb.append(this.f7773r);
        sb.append('\'');
        sb.append(", shareTitle='");
        sb.append(this.f7774s);
        sb.append('\'');
        sb.append(", shareDescription='");
        sb.append(this.f7775t);
        sb.append('\'');
        sb.append(", oroginalUserId=");
        sb.append(this.f7776u);
        sb.append(", originalTitelTpl='");
        sb.append(this.f7777v);
        sb.append('\'');
        sb.append(", songId='");
        sb.append(this.f7781z);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
