package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30898i;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.d */
public final class C30842d {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.d$a */
    public static class C30846a {

        /* renamed from: a */
        String f80791a;

        /* renamed from: b */
        String f80792b;
    }

    /* renamed from: a */
    public static void m100513a(final Activity activity) {
        C30898i.m100632a().mo80818a(activity, new C6892b<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void run(Boolean bool) {
                if (bool.booleanValue()) {
                    Intent intent = new Intent(activity, PhotoSelectActivity.class);
                    intent.putExtra("album_action", 1);
                    activity.startActivity(intent);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m100514a(final PhotoParam photoParam, final C30981y yVar) {
        if (!C30847e.m100518a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.bna).mo25750a();
            if (yVar != null) {
                yVar.mo18259a("");
            }
            return;
        }
        C1592h.m7855a((Callable<TResult>) new Callable<C30846a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C30846a call() {
                C30846a aVar = new C30846a();
                File file = new File(photoParam.getPath());
                if (FileUtils.m28673a(file)) {
                    if (file.length() > 1048576) {
                        aVar.f80792b = C6399b.m19921a().getResources().getString(R.string.bjq);
                    } else {
                        aVar.f80791a = photoParam.getPath();
                    }
                    return aVar;
                }
                String a = C31932z.m103701a(photoParam.getPath());
                if (C31932z.m103698a(photoParam.getPath(), a, (int) C34943c.f91128x, (int) C34943c.f91128x) == 2) {
                    aVar.f80792b = C6399b.m19921a().getResources().getString(R.string.bi6);
                } else {
                    aVar.f80791a = a;
                }
                return aVar;
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C30846a, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<C30846a> hVar) {
                C30846a aVar = (C30846a) hVar.mo6890e();
                if (aVar != null) {
                    if (!TextUtils.isEmpty(aVar.f80791a)) {
                        C30963v.m100755a().mo81335a(aVar.f80791a, yVar);
                    } else if (yVar != null) {
                        yVar.mo18259a(aVar.f80792b);
                    }
                } else if (yVar != null) {
                    yVar.mo18259a("");
                }
                return null;
            }
        }, C1592h.f5958b);
    }
}
