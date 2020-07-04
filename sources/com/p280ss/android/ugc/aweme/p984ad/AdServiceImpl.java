package com.p280ss.android.ugc.aweme.p984ad;

import android.app.Application;
import android.content.Context;
import android.text.style.ReplacementSpan;
import android.widget.Toast;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p280ss.android.ugc.aweme.commercialize.adapter.AdCommentViewHolder;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.views.AdCommentView;
import com.p280ss.android.ugc.aweme.commercialize.views.SearchAdCommentView;
import com.p280ss.android.ugc.aweme.p984ad.comment.C22410a;
import com.p280ss.android.ugc.aweme.p984ad.comment.CommentAdWidget;
import com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentAdViewHolder;
import com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView;
import com.p280ss.android.ugc.aweme.p984ad.comment.NewCommonCommentAdViewHolder;
import com.p280ss.android.ugc.aweme.p984ad.comment.NewSpecialCommentAdViewHolder;
import com.p280ss.android.ugc.aweme.p984ad.comment.NewSpecialCommentView;
import com.p280ss.android.ugc.aweme.p984ad.model.p990a.C22461a;
import com.p280ss.android.ugc.aweme.p984ad.model.p991b.C22462a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p988d.C22448a;
import com.p280ss.android.ugc.aweme.p984ad.services.C22463a;
import com.p280ss.android.ugc.aweme.p984ad.services.IAdService;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22465a;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22466b;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22467c;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22468d;
import com.p280ss.android.ugc.aweme.p984ad.view.IAdViewHolder;

/* renamed from: com.ss.android.ugc.aweme.ad.AdServiceImpl */
public class AdServiceImpl implements IAdService {
    public void test(Context context) {
        C22374a.m74073a(Toast.makeText(context, "this is ad_impl component", 1));
    }

    private void initDepend(C22463a aVar) {
        C22375a.m74074a().f59707a = aVar.f59893a;
        C22375a.m74074a().f59708b = aVar.f59894b;
        C22375a.m74074a().f59707a = aVar.f59893a;
        C22375a.m74074a().f59709c = aVar.f59895c;
        C22375a.m74074a().f59711e = aVar.f59897e;
        C22375a.m74074a().f59710d = aVar.f59896d;
        C22375a.m74074a().f59713g = aVar.f59899g;
        C22375a.m74074a().f59712f = aVar.f59898f;
        C22375a.m74074a().f59714h = aVar.f59900h;
    }

    public void init(Application application, C22463a aVar) {
        initDepend(aVar);
    }

    public ReplacementSpan getSpan(Context context, C22465a aVar) {
        return C22448a.m74302a(context, ((C22462a) aVar).f59892a);
    }

    public Widget getWidgetForType(Context context, C22467c cVar) {
        return new CommentAdWidget(((C22461a) cVar).f59891a);
    }

    public IAdViewHolder getViewHolderForType(Context context, C22466b bVar) {
        int a = bVar.mo59045a();
        if (a == 256) {
            C22468d dVar = (C22468d) bVar;
            AdCommentViewHolder adCommentViewHolder = new AdCommentViewHolder(new AdCommentView(context), dVar.f59917i);
            adCommentViewHolder.mo64308a(dVar.f59915g);
            return adCommentViewHolder;
        } else if (a == 257) {
            C22468d dVar2 = (C22468d) bVar;
            AdCommentViewHolder adCommentViewHolder2 = new AdCommentViewHolder(new SearchAdCommentView(context), dVar2.f59917i);
            adCommentViewHolder2.mo64308a(dVar2.f59915g);
            return adCommentViewHolder2;
        } else if (bVar.mo59045a() == 258) {
            if (bVar instanceof C22468d) {
                LinkData linkData = ((C22468d) bVar).f59909a;
                if (linkData != null) {
                    if (linkData.buttonStyle == 1) {
                        if (linkData.backgroundType == 1) {
                            return new NewCommonCommentAdViewHolder(new C22410a(context, true));
                        }
                        return new NewCommonCommentAdViewHolder(new C22410a(context, false));
                    } else if (linkData.buttonStyle == 2) {
                        return new NewSpecialCommentAdViewHolder(new NewSpecialCommentView(context));
                    }
                }
            }
            return new CommonCommentAdViewHolder(new CommonCommentView(context));
        } else {
            StringBuilder sb = new StringBuilder("type");
            sb.append(bVar.mo59045a());
            sb.append("is illegal");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
