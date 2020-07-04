package com.p280ss.android.ugc.aweme.profile.edit.api;

import com.google.common.util.concurrent.C18253l;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42935ap;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi */
public final class YouTubeLinkingApi {

    /* renamed from: a */
    public static final YouTubeLinkingApi f93718a = new YouTubeLinkingApi();

    /* renamed from: b */
    private static final boolean f93719b = C7163a.m22363a();

    /* renamed from: c */
    private static final ServerApi f93720c;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi$ServerApi */
    public interface ServerApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/youtube/bind/")
        C18253l<C35749a> link(@C7727c(mo20417a = "youtube_refresh_token") String str, @C7727c(mo20417a = "google_account") String str2, @C7727c(mo20417a = "youtube_channel_id") String str3, @C7727c(mo20417a = "youtube_channel_title") String str4);

        @C7730f(mo20420a = "/aweme/v1/youtube/unbind/")
        C18253l<C35749a> unlink();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi$a */
    public static final class C35749a {
        @C6593c(mo15949a = "status_code")

        /* renamed from: a */
        public final int f93721a;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C35749a) {
                    if (this.f93721a == ((C35749a) obj).f93721a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f93721a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("YouTubeResponse(statusCode=");
            sb.append(this.f93721a);
            sb.append(")");
            return sb.toString();
        }
    }

    private YouTubeLinkingApi() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ServerApi.class);
        C7573i.m23582a(create, "ServiceManager.get().get…te(ServerApi::class.java)");
        f93720c = (ServerApi) create;
    }

    /* renamed from: a */
    public static final boolean m115487a() {
        String str;
        boolean z = false;
        try {
            C35749a aVar = (C35749a) f93720c.unlink().get();
            if (f93719b) {
                StringBuilder sb = new StringBuilder("Unlink ");
                if (aVar.f93721a == 0) {
                    str = "success";
                } else {
                    StringBuilder sb2 = new StringBuilder("failed (status code = ");
                    sb2.append(aVar.f93721a);
                    sb2.append(')');
                    str = sb2.toString();
                }
                sb.append(str);
            }
            StringBuilder sb3 = new StringBuilder("YouTubeLinkingApi.unlink => Response status_code: ");
            sb3.append(aVar.f93721a);
            C6921a.m21562b("youtube-debug", sb3.toString());
            if (aVar.f93721a == 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            C6921a.m21559a((Throwable) new Exception("youtube-debug-unlink", e));
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m115488a(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        if (str != null) {
            try {
                str5 = C42935ap.m136288a(str, "J?I7iAd=3j9AM1P=", "AES/CBC/PKCS7Padding", "J?I7iAd=3j9AM1P=");
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new Exception("youtube-debug-link", e));
                return false;
            }
        } else {
            str5 = null;
        }
        StringBuilder sb = new StringBuilder("YouTubeLinkingApi.link => ");
        sb.append("[refreshToken: ");
        sb.append(C23764b.m77913a(str));
        sb.append(", channelId: ");
        sb.append(C23764b.m77913a(str3));
        sb.append(", channelTitle: ");
        sb.append(C23764b.m77913a(str4));
        sb.append(", googleAccount: ");
        sb.append(C23764b.m77913a(str2));
        sb.append("]");
        C6921a.m21562b("youtube-debug", sb.toString());
        C35749a aVar = (C35749a) f93720c.link(str5, str2, str3, str4).get();
        if (f93719b) {
            StringBuilder sb2 = new StringBuilder("Link ");
            if (aVar.f93721a == 0) {
                str6 = "success";
            } else {
                StringBuilder sb3 = new StringBuilder("failed (status code = ");
                sb3.append(aVar.f93721a);
                sb3.append(')');
                str6 = sb3.toString();
            }
            sb2.append(str6);
        }
        StringBuilder sb4 = new StringBuilder("YouTubeLinkingApi.link => Response status_code: ");
        sb4.append(aVar.f93721a);
        C6921a.m21562b("youtube-debug", sb4.toString());
        if (aVar.f93721a == 0) {
            return true;
        }
        return false;
    }
}
