package com.p280ss.android.ugc.aweme.port.p1479in;

import android.app.Service;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.ai */
public interface C35541ai {

    /* renamed from: com.ss.android.ugc.aweme.port.in.ai$a */
    public interface C35542a {
        /* renamed from: a */
        void mo88231a(String str);

        /* renamed from: d */
        String mo88234d();

        /* renamed from: e */
        String mo88235e();

        /* renamed from: f */
        boolean mo88236f();

        /* renamed from: g */
        void mo88237g();
    }

    /* renamed from: a */
    C18253l<? extends C38455ap> mo83273a(String str, LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: a */
    HashMap<String, String> mo83274a(Object obj);

    /* renamed from: a */
    List<C0902i<Class<?>, IAVPublishExtension<?>>> mo83275a(AVPublishContentType aVPublishContentType);

    /* renamed from: a */
    void mo83276a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap);

    /* renamed from: a */
    void mo83277a(BaseResponse baseResponse, int i);

    /* renamed from: a */
    void mo83278a(BaseResponse baseResponse, List<InteractStickerStruct> list);

    /* renamed from: a */
    void mo83279a(boolean z);

    /* renamed from: a */
    boolean mo83280a();

    /* renamed from: a */
    boolean mo83281a(FragmentActivity fragmentActivity, Intent intent, Class<? extends Service> cls, String str, String str2);

    /* renamed from: b */
    C18253l<? extends C38455ap> mo83282b(String str, LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: b */
    List<C40231c> mo83283b();
}
