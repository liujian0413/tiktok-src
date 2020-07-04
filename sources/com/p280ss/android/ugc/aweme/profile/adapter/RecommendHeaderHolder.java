package com.p280ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.RecommendHeaderHolder */
public final class RecommendHeaderHolder extends C1293v {

    /* renamed from: a */
    public final ImageView f93648a;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.RecommendHeaderHolder$a */
    static final class C35707a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendHeaderHolder f93649a;

        /* renamed from: b */
        final /* synthetic */ String f93650b;

        C35707a(RecommendHeaderHolder recommendHeaderHolder, String str) {
            this.f93649a = recommendHeaderHolder;
            this.f93650b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("click_privacy_tips", (Map) C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("enter_from", this.f93650b)}));
            String g = ((C34320a) C34324a.m111010a(C34320a.class)).mo60344g();
            if (!TextUtils.isEmpty(g)) {
                SchemaPageHelper schemaPageHelper = (SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class);
                ImageView imageView = this.f93649a.f93648a;
                C7573i.m23582a((Object) imageView, "mInfo");
                Context context = imageView.getContext();
                C7573i.m23582a((Object) context, "mInfo.context");
                schemaPageHelper.openCrossPlatformActivity(context, true, false, g);
            }
        }
    }

    public RecommendHeaderHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f93648a = (ImageView) view.findViewById(R.id.b0v);
    }

    /* renamed from: a */
    public final void mo90556a(int i, String str) {
        C7573i.m23587b(str, "enterFrom");
        ImageView imageView = this.f93648a;
        C7573i.m23582a((Object) imageView, "mInfo");
        imageView.setVisibility(0);
        this.f93648a.setOnClickListener(new C35707a(this, str));
    }
}
