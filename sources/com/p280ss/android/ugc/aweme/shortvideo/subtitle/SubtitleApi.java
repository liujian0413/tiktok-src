package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import bolts.C1592h;
import com.bytedance.retrofit2.mime.TypedFile;
import okhttp3.MultipartBody.Part;
import retrofit2.p363b.C7725a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7735k;
import retrofit2.p363b.C7736l;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7741q;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi */
public interface SubtitleApi {

    /* renamed from: a */
    public static final C41022a f106737a = C41022a.f106738a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi$a */
    public static final class C41022a {

        /* renamed from: a */
        static final /* synthetic */ C41022a f106738a = new C41022a();

        private C41022a() {
        }
    }

    @C7735k(mo20426a = {"Content-Type: application/json"})
    @C7739o(mo20429a = "/api/v1/vc/feedback")
    C1592h<C41111e> feedback(@C7744t(mo20436a = "appid") String str, @C7744t(mo20436a = "token") String str2, @C7744t(mo20436a = "id") String str3, @C7725a C41107a aVar);

    @C7730f(mo20420a = "/api/v1/vc/query")
    C1592h<C41109c> queryAudio(@C7744t(mo20436a = "appid") String str, @C7744t(mo20436a = "token") String str2, @C7744t(mo20436a = "id") String str3);

    @C7739o(mo20429a = "/api/v1/vc/submit")
    @C7736l
    @C7735k(mo20426a = {"Content-Type: audio/m4a"})
    C1592h<C41111e> submitAudio(@C7744t(mo20436a = "appid") String str, @C7744t(mo20436a = "token") String str2, @C7744t(mo20436a = "words_per_line") int i, @C7744t(mo20436a = "max_lines") int i2, @C7741q TypedFile typedFile);

    @C7735k(mo20426a = {"Content-Type: application/json"})
    @C7739o(mo20429a = "/api/v1/vc/submit")
    C1592h<C41111e> submitAudio(@C7744t(mo20436a = "appid") String str, @C7744t(mo20436a = "token") String str2, @C7744t(mo20436a = "words_per_line") int i, @C7744t(mo20436a = "max_lines") int i2, @C7725a C41112f fVar);

    @C7739o
    @C7736l
    @C7735k(mo20426a = {"Content-Type: audio/m4a"})
    C1592h<C41111e> submitAudio(@C7748x String str, @C7741q Part part);
}
