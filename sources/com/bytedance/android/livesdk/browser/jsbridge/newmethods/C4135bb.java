package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.base.model.user.C2377i;
import com.bytedance.android.live.core.network.p150b.C3176a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.bytedance.android.livesdk.browser.p195e.C3992d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9080r;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb */
public final class C4135bb extends C11152c<C4137a, C4138b> implements C3485a {

    /* renamed from: a */
    public Fragment f12135a;

    /* renamed from: b */
    public C7321c f12136b;

    /* renamed from: c */
    private C9080r f12137c;

    /* renamed from: d */
    private int f12138d;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb$a */
    static final class C4137a {
        @C6593c(mo15949a = "aspect_x")

        /* renamed from: a */
        int f12141a;
        @C6593c(mo15949a = "aspect_y")

        /* renamed from: b */
        int f12142b;
        @C6593c(mo15949a = "min_width")

        /* renamed from: c */
        int f12143c;
        @C6593c(mo15949a = "min_height")

        /* renamed from: d */
        int f12144d;
        @C6593c(mo15949a = "max_size")

        /* renamed from: e */
        int f12145e;

        C4137a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bb$b */
    static final class C4138b {
        @C6593c(mo15949a = "uri")

        /* renamed from: a */
        String f12146a;
        @C6593c(mo15949a = "url")

        /* renamed from: b */
        String f12147b;

        private C4138b(String str, String str2) {
            this.f12146a = str;
            this.f12147b = str2;
        }
    }

    /* renamed from: f_ */
    public final void mo9628f_() {
        mo11699b();
    }

    /* renamed from: b */
    public final void mo11699b() {
        if (this.f12137c != null) {
            this.f12137c.mo10472b();
            this.f12137c = null;
        }
        finishWithFailure();
    }

    public final void onTerminate() {
        if (this.f12136b != null) {
            this.f12136b.dispose();
        }
        this.f12135a = null;
        this.f12137c.mo10472b();
    }

    public C4135bb(Fragment fragment) {
        this.f12135a = fragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4137a aVar, CallContext callContext) throws Exception {
        int i;
        if (aVar.f12145e > 0) {
            i = aVar.f12145e;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f12138d = i;
        C9080r rVar = new C9080r(null, this.f12135a, "upload_photo_method", aVar.f12141a, aVar.f12142b, aVar.f12143c, aVar.f12144d, this);
        this.f12137c = rVar;
        this.f12137c.mo10473c();
    }

    /* renamed from: a */
    public final void mo11698a(C2377i iVar, String str) {
        if (this.f12137c != null) {
            this.f12137c.mo10472b();
            this.f12137c = null;
        }
        String str2 = iVar.f7827a;
        C9178j.m27302j().mo22375d().mo22384d();
        finishWithResult(new C4138b(str2, C3992d.m13988a(str)));
    }

    /* renamed from: a */
    public final void mo9627a(final String str, String str2) {
        this.f12137c.mo10470a();
        File file = new File(str);
        if (!file.exists()) {
            mo11699b();
        } else if (file.length() >= ((long) this.f12138d)) {
            C9049ap.m27028a(C3358ac.m12517a((int) R.string.eys, Integer.valueOf((this.f12138d / PreloadTask.BYTE_UNIT_NUMBER) / PreloadTask.BYTE_UNIT_NUMBER)));
        } else {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            ((UploadApi) C9178j.m27302j().mo22373b().mo10440a(UploadApi.class)).upload(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2377i>>() {
                public final void onSubscribe(C7321c cVar) {
                    C4135bb.this.f12136b = cVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C3479d<C2377i> dVar) {
                    ((C2377i) dVar.data).f7828b = str;
                    C4135bb.this.mo11698a((C2377i) dVar.data, str);
                }

                public final void onError(Throwable th) {
                    Context context = C4135bb.this.f12135a.getContext();
                    if (context != null) {
                        C3176a.m12015a(context, th);
                    }
                    C4135bb.this.mo11699b();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo11697a(int i, int i2, Intent intent) {
        if (this.f12137c != null) {
            this.f12137c.mo10471a(i, i2, intent);
        }
    }
}
