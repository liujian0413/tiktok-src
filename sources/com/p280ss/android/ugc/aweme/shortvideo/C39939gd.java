package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.ttuploader.TTVideoUploader;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gd */
public final class C39939gd {

    /* renamed from: a */
    private static C39941a f103727a = new C39942b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gd$a */
    public interface C39941a {
        /* renamed from: a */
        void mo99359a(TTVideoUploader tTVideoUploader, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gd$b */
    static class C39942b implements C39941a {
        private C39942b() {
        }

        /* renamed from: a */
        public final void mo99359a(TTVideoUploader tTVideoUploader, int i) {
            tTVideoUploader.setEnableHttps(i);
        }
    }

    /* renamed from: a */
    public static void m127757a(TTVideoUploader tTVideoUploader, int i) {
        f103727a.mo99359a(tTVideoUploader, i);
    }
}
