package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.C2377i;
import com.bytedance.android.live.core.network.p150b.C3176a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3364ai;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.browser.p195e.C3992d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf */
public final class C4145bf extends C11152c<JSONObject, C4150a> {

    /* renamed from: a */
    public C7321c f12172a;

    /* renamed from: b */
    public Fragment f12173b;

    /* renamed from: c */
    private ProgressDialog f12174c;

    /* renamed from: d */
    private CallContext f12175d;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf$a */
    static final class C4150a {
        @C6593c(mo15949a = "code")

        /* renamed from: a */
        int f12185a;
        @C6593c(mo15949a = "uri")

        /* renamed from: b */
        String f12186b;
        @C6593c(mo15949a = "url")

        /* renamed from: c */
        String f12187c;

        private C4150a(int i, String str, String str2) {
            this.f12185a = i;
            this.f12186b = str;
            this.f12187c = str2;
        }
    }

    /* renamed from: a */
    public final void mo11705a() {
        if (this.f12174c != null) {
            this.f12174c.dismiss();
            this.f12174c = null;
        }
        finishWithFailure();
    }

    public final void onTerminate() {
        if (this.f12172a != null) {
            this.f12172a.dispose();
        }
        this.f12173b = null;
        this.f12175d = null;
    }

    public C4145bf(Fragment fragment) {
        this.f12173b = fragment;
    }

    /* renamed from: a */
    public final void mo11708a(File file) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
        final String absolutePath = file.getAbsolutePath();
        ((UploadApi) C9178j.m27302j().mo22373b().mo10440a(UploadApi.class)).upload(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2377i>>() {
            public final void onSubscribe(C7321c cVar) {
                C4145bf.this.f12172a = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2377i> dVar) {
                C4145bf.this.mo11707a((C2377i) dVar.data, absolutePath);
            }

            public final void onError(Throwable th) {
                if (C4145bf.this.f12173b != null) {
                    Context context = C4145bf.this.f12173b.getContext();
                    if (context != null) {
                        C3176a.m12015a(context, th);
                    }
                }
                C4145bf.this.mo11705a();
            }
        });
    }

    /* renamed from: a */
    public final void mo11707a(C2377i iVar, String str) {
        if (this.f12174c != null) {
            this.f12174c.dismiss();
            this.f12174c = null;
        }
        try {
            String str2 = iVar.f7827a;
            C9178j.m27302j().mo22375d().mo22384d();
            C4150a aVar = new C4150a(str2, C3992d.m13988a(str));
            this.f12175d.mo27138a("H5_uploadVideoStatus", aVar);
            finishWithResult(aVar);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(final JSONObject jSONObject, final CallContext callContext) throws Exception {
        this.f12175d = callContext;
        int optInt = jSONObject.optInt("action_type", 0);
        if (optInt == 0) {
            C8735f.m26105a((Activity) callContext.f30265a).mo21743a(new C8721d() {
                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                    C9738o.m28694a(callContext.f30265a, (int) R.drawable.bzp, (int) R.string.efv);
                    C4145bf.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    int optInt = jSONObject.optInt("duration_limit", 10);
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C4145bf.this.f12173b.getActivity() == null) {
                        C4145bf.this.finishWithFailure();
                    } else {
                        C4145bf.this.f12173b.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
            return;
        }
        if (optInt == 1) {
            C8735f.m26105a((Activity) callContext.f30265a).mo21743a(new C8721d() {
                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                    C9738o.m28694a(callContext.f30265a, (int) R.drawable.bzp, (int) R.string.efv);
                    C4145bf.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("video/*");
                    if (C4145bf.this.f12173b.getActivity() == null) {
                        C4145bf.this.finishWithFailure();
                    } else {
                        C4145bf.this.f12173b.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* renamed from: a */
    public final void mo11706a(int i, int i2, Intent intent) {
        String str;
        if (9001 == i || 9002 == i) {
            if (-1 != i2 || intent == null || intent.getData() == null) {
                mo11705a();
                return;
            }
            FragmentActivity activity = this.f12173b.getActivity();
            if (activity == null) {
                mo11705a();
                return;
            }
            Uri data = intent.getData();
            if (TextUtils.equals(C38347c.f99553h, data.getScheme())) {
                str = C3364ai.m12544a((Context) this.f12173b.getActivity(), data);
            } else {
                str = intent.getData().getPath();
            }
            if (TextUtils.isEmpty(str)) {
                mo11705a();
                return;
            }
            final File file = new File(str);
            if (!file.exists()) {
                mo11705a();
                return;
            }
            this.f12174c = ProgressDialog.show(activity, C3358ac.m12515a((int) R.string.f29), C3358ac.m12515a((int) R.string.f28), true, false);
            if (!file.exists()) {
                mo11705a();
                return;
            }
            C8735f.m26105a(this.f12173b.getActivity()).mo21743a(new C8721d() {
                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                }

                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    C4145bf.this.mo11708a(file);
                }
            }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
