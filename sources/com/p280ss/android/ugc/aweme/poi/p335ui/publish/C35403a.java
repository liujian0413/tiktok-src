package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.C35075d;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C43014ci;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.a */
public final class C35403a implements C35075d {
    /* renamed from: a */
    public final String mo88919a(Context context) {
        C7573i.m23587b(context, "context");
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).detectIsFromEditOrStory(context);
    }

    /* renamed from: b */
    public final Map<Object, Object> mo88921b(Context context) {
        C7573i.m23587b(context, "context");
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getTrickyMapByActivity(context);
    }

    /* renamed from: a */
    public final void mo88920a(Context context, OnClickListener onClickListener) {
        C43014ci.m136518a(context, onClickListener);
    }
}
