package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c.C42604a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47521z;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b */
public final class C39505b implements C47521z {
    /* renamed from: a */
    public static void m126187a(Activity activity, int i, C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar) {
        C35563c.f93246i.mo103854a(activity, (int) OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, C42604a.m135390a(activity.getString(R.string.zm), 0, false, null, "", ""), bVar, aVar);
    }

    /* renamed from: a */
    public final void mo98359a(Activity activity, int i, String str, String str2, String str3, boolean z, String str4, String str5, C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar) {
        mo98360a(activity, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, str, str2, str3, z, str4, str5, false, false, bVar, aVar);
    }

    /* renamed from: a */
    public final void mo98360a(Activity activity, int i, String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar) {
        String str6 = str3;
        Bundle bundle = new Bundle();
        if (C39360dw.m125725a().f102247b.size() > 0) {
            bundle.putString("challenge", ((AVChallenge) C39360dw.m125725a().f102247b.get(0)).cid);
        } else if (str6 != null) {
            bundle.putString("challenge", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            String str7 = str;
            bundle.putString("first_sticker_music_ids", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            String str8 = str2;
            bundle.putString("first_sticker_id", str2);
        }
        bundle.putBoolean("has_lyric", z2);
        bundle.putBoolean("show_lyric_tip", z3);
        Activity activity2 = activity;
        C35563c.f93246i.mo103854a(activity, i, C42604a.m135390a(activity.getString(R.string.zm), 0, z, bundle, str4, str5), bVar, aVar);
    }
}
