package com.p280ss.android.ugc.aweme.share.improve.p1540c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.support.p022v4.app.ActivityCompat;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.share.improve.C38152c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.c */
public final class C38159c {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a */
    static final class C38160a implements C22480b {

        /* renamed from: a */
        final /* synthetic */ Activity f99281a;

        /* renamed from: b */
        final /* synthetic */ Context f99282b;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a$a */
        static final class C38161a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C38160a f99283a;

            C38161a(C38160a aVar) {
                this.f99283a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C42969bc.m136401a(this.f99283a.f99282b);
            }
        }

        C38160a(Activity activity, Context context) {
            this.f99281a = activity;
            this.f99282b = context;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            C7573i.m23582a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1 && !ActivityCompat.m2242a(this.f99281a, strArr[0])) {
                C42951au.m136341a(this.f99282b, R.string.lb, R.string.w_, null, R.string.afp, new C38161a(this)).show();
            }
        }
    }

    /* renamed from: a */
    public static final Context m121910a() {
        return C6399b.m19921a();
    }

    /* renamed from: a */
    public static final UrlModel m121913a(Aweme aweme) {
        if (aweme != null) {
            List imageInfos = aweme.getImageInfos();
            if (imageInfos != null) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    return imageInfo.getLabelThumb();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m121915a(Context context) {
        Activity activity;
        C7573i.m23587b(context, "context");
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = C6405d.m19984g();
        }
        if (activity != null) {
            C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C38160a(activity, context));
        }
    }

    /* renamed from: a */
    public static final Uri m121911a(String str, Context context) {
        C7573i.m23587b(str, "$this$pathToUri");
        C7573i.m23587b(context, "context");
        Uri a = C42972bf.m136419a(context, new File(str));
        C7573i.m23582a((Object) a, "FileProviderUtils.getFil…rUri(context, File(this))");
        return a;
    }

    /* renamed from: a */
    public static final String m121914a(String str, C38343b bVar) {
        C7573i.m23587b(str, "$this$enhanceAppParams");
        C7573i.m23587b(bVar, "channel");
        return C38152c.m121901a(str, bVar.mo95739b(), true);
    }
}
