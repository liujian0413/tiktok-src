package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.C31846a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.x */
public final class C31923x {

    /* renamed from: a */
    private static final String f83396a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.x$a */
    public interface C31928a {
        /* renamed from: a */
        void mo80756a();

        /* renamed from: b */
        void mo80757b();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/");
        sb.append(C6399b.m19921a().getString(R.string.jf));
        sb.append("/");
        f83396a = sb.toString();
    }

    /* renamed from: b */
    private static void m103685b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            C6399b.m19921a().sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public static boolean m103684a(String str) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(f83396a);
        sb.append(C31846a.m103343a(".jpg"));
        String sb2 = sb.toString();
        if (!FileUtils.m28679c(sb2)) {
            z = FileUtils.m28675a(str, f83396a, new File(sb2).getName());
            if (!z) {
                return false;
            }
        } else {
            z = false;
        }
        m103685b(sb2);
        m103686c(sb2);
        return z;
    }

    /* renamed from: c */
    private static void m103686c(String str) {
        String str2 = Build.BRAND;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().equals("vivo")) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/相机/");
            sb.append(new File(str).getName());
            String sb2 = sb.toString();
            C7276d.m22820d(str, sb2);
            StringBuilder sb3 = new StringBuilder("vivo: ");
            sb3.append(sb2);
            C6921a.m21555a(sb3.toString());
            m103685b(sb2);
        }
    }

    /* renamed from: a */
    public static void m103683a(final UrlModel urlModel, final C31928a aVar) {
        if (!C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            C23323e.m76502a(urlModel, (C23328a) new C23328a() {
                /* renamed from: a */
                public final void mo60610a(Exception exc) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (aVar != null) {
                                aVar.mo80757b();
                            }
                        }
                    });
                }

                /* renamed from: a */
                public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                    String a = C23323e.m76499a(urlModel);
                    if (!C6319n.m19593a(a)) {
                        C31923x.m103684a(C23323e.m76498a(C6399b.m19921a(), a));
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    aVar.mo80756a();
                                }
                            }
                        });
                        return;
                    }
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (aVar != null) {
                                aVar.mo80757b();
                            }
                        }
                    });
                }
            });
        } else if (TextUtils.isEmpty(urlModel.getUri())) {
            aVar.mo80757b();
        } else if (m103684a(Uri.parse(urlModel.getUri()).getPath())) {
            aVar.mo80756a();
        } else {
            aVar.mo80757b();
        }
    }
}
