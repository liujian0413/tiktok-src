package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectMicroAppsAdapter */
public final class CollectMicroAppsAdapter extends BaseAdapter<MicroAppInfo> {

    /* renamed from: a */
    public final Context f73079a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectMicroAppsAdapter$a */
    static final class C27712a extends C1293v {

        /* renamed from: a */
        public RemoteImageView f73080a;

        /* renamed from: b */
        public DmtTextView f73081b;

        public C27712a(View view) {
            C7573i.m23587b(view, "view");
            super(view);
            this.f73080a = (RemoteImageView) view.findViewById(R.id.byh);
            this.f73081b = (DmtTextView) view.findViewById(R.id.byj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectMicroAppsAdapter$b */
    public static final class C27713b extends C42939as {

        /* renamed from: a */
        final /* synthetic */ CollectMicroAppsAdapter f73082a;

        /* renamed from: b */
        final /* synthetic */ int f73083b;

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo18647a();
            if (a != null) {
                a.openMiniApp(this.f73082a.f73079a, (MicroAppInfo) this.f73082a.f67539l.get(this.f73083b), new C33472a().mo85791b("setting_page").mo85789a("recently").mo85792c("021001").mo85790a());
            }
        }

        C27713b(CollectMicroAppsAdapter collectMicroAppsAdapter, int i) {
            this.f73082a = collectMicroAppsAdapter;
            this.f73083b = i;
        }
    }

    public CollectMicroAppsAdapter(Context context) {
        this.f73079a = context;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f73079a).inflate(R.layout.xw, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…           parent, false)");
        return new C27712a(inflate);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int i2;
        String str;
        if (i >= 0) {
            List list = this.f67539l;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i < i2) {
                String str2 = null;
                if (!(vVar instanceof C27712a)) {
                    vVar = null;
                }
                C27712a aVar = (C27712a) vVar;
                if (aVar != null) {
                    RemoteImageView remoteImageView = aVar.f73080a;
                    if (remoteImageView != null) {
                        MicroAppInfo microAppInfo = (MicroAppInfo) this.f67539l.get(i);
                        if (microAppInfo != null) {
                            str = microAppInfo.getIcon();
                        } else {
                            str = null;
                        }
                        remoteImageView.setImageURI(str);
                    }
                    DmtTextView dmtTextView = aVar.f73081b;
                    if (dmtTextView != null) {
                        MicroAppInfo microAppInfo2 = (MicroAppInfo) this.f67539l.get(i);
                        if (microAppInfo2 != null) {
                            str2 = microAppInfo2.getName();
                        }
                        dmtTextView.setText(str2);
                        dmtTextView.setTypeface(dmtTextView.getTypeface(), 1);
                    }
                    C7167b b = C7167b.m22380b();
                    C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
                    IMiniAppService a = b.mo18647a();
                    if (a != null) {
                        Object obj = this.f67539l.get(i);
                        C7573i.m23582a(obj, "mItems[position]");
                        String appId = ((MicroAppInfo) obj).getAppId();
                        Object obj2 = this.f67539l.get(i);
                        C7573i.m23582a(obj2, "mItems[position]");
                        a.preloadMiniApp(appId, ((MicroAppInfo) obj2).getType());
                    }
                    aVar.itemView.setOnClickListener(new C27713b(this, i));
                }
            }
        }
    }
}
