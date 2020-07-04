package com.p280ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.discover.mob.DiscoveryMetricsParam;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.feed.C28676s;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C37286v;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.p1585o.C40202a;
import com.p280ss.android.ugc.aweme.utils.C42917ae;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder */
public class BannerViewHolder extends C1293v implements C6310a {

    /* renamed from: a */
    protected Banner f69416a;

    /* renamed from: b */
    private int f69417b;

    /* renamed from: c */
    private C6309f f69418c;

    /* renamed from: d */
    private String f69419d = "";
    SmartImageView mSdCover;

    /* renamed from: a */
    private static int[] m86733a() {
        return C43012cg.m136513a(600);
    }

    public void clickCover() {
        if (!C43122ff.m136767b() && this.f69416a != null && !TextUtils.isEmpty(this.f69416a.getSchema())) {
            StringBuilder sb = new StringBuilder();
            String schema = this.f69416a.getSchema();
            IMiniAppService a = C7167b.m22380b().mo18647a();
            if (C42722c.m135620a(this.itemView.getContext(), schema, "discover")) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trySetJumpToFissionH5(schema);
                m86732a(schema);
                return;
            }
            if (schema.startsWith("https://") || schema.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(schema, "ISO-8859-1"));
                    sb.append("&title=");
                    sb.append(URLEncoder.encode(this.f69416a.getTitle(), "UTF-8"));
                } catch (Exception unused) {
                }
                Context context = this.itemView.getContext();
                Intent a2 = C25833b.m84945a(context, Uri.parse(sb.toString()));
                a2.setClass(context, CrossPlatformActivity.class);
                a2.putExtra("hide_more", false);
                a2.putExtra("enter_from", "banner");
                context.startActivity(a2);
            } else if (schema.startsWith("sslocal://studio/task/create")) {
                if (this.itemView.getContext() instanceof Activity) {
                    this.itemView.getContext().startActivity(C40202a.f104498a.mo100000a((Activity) this.itemView.getContext(), Uri.parse(schema)));
                }
            } else if (schema.startsWith("sslocal://live")) {
                Uri parse = Uri.parse(schema);
                C35732h.m115451a().mo90593a(this.f69418c, parse.getQueryParameter("user_id"), parse.getQueryParameter("sec_user_id"), "", 0);
            } else if (schema.startsWith("sslocal://showcaseh5")) {
                C25371n.m83481d(this.itemView.getContext(), schema);
            } else if (C33447f.m108191d(schema)) {
                a.openMiniApp(this.itemView.getContext(), schema, new C33472a().mo85791b("banner").mo85790a());
            } else {
                sb.append(schema);
                C7203u a3 = C7203u.m22460a(sb.toString()).mo18694a("enter_from", "banner");
                if (C37286v.m119758a("aweme://challenge/detail/:id", sb.toString())) {
                    this.f69419d = UUID.randomUUID().toString();
                    a3.mo18694a("process_id", this.f69419d);
                }
                C7195s.m22438a().mo18682a(a3.mo18695a());
            }
            m86732a(sb.toString());
        }
    }

    public BannerViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69418c = new C6309f(Looper.getMainLooper(), this);
    }

    public void handleMsg(Message message) {
        Context context = this.itemView.getContext();
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ExecutionException) {
            obj = ((ExecutionException) obj).getCause();
        }
        if (obj instanceof ApiServerException) {
            C10761a.m31403c(context, ((ApiServerException) obj).getErrorMsg()).mo25750a();
        } else if (obj instanceof Exception) {
            C10761a.m31399c(context, (int) R.string.cjt).mo25750a();
        } else {
            if (i == 0 && (obj instanceof User)) {
                User user = (User) message.obj;
                Bundle bundle = new Bundle();
                bundle.putString("live.intent.extra.REQUEST_ID", this.f69416a.getRequestId());
                C28676s.m94345a(context, user, null, "discovery", bundle);
            }
        }
    }

    /* renamed from: a */
    private void m86732a(String str) {
        C6907h.m21518a((Context) null, "banner_click", "click", Long.toString(this.f69416a.getCreativeId()), (long) (this.f69417b + 1));
        C6907h.m21524a("banner_click", (Map) new DiscoveryMetricsParam().setBannerId(this.f69416a.getBid()).setClientOrder(this.f69417b + 1).setTagId(C42917ae.m136252a(str)).buildParams());
        if (this.f69416a.isAd()) {
            C24976t.m82041a(this.itemView.getContext(), this.f69416a, this.f69417b + 1);
        }
        if (C37286v.m119758a("aweme://challenge/detail/:id", str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "banner");
                jSONObject.put("enter_method", "click_banner");
                jSONObject.put("process_id", this.f69419d);
                jSONObject.put("tag_id", str.substring(str.lastIndexOf(47) + 1));
                jSONObject.put("scene_id", "1008");
                Banner banner = this.f69416a;
                if (banner != null) {
                    String bid = banner.getBid();
                    if (bid != null) {
                        jSONObject.put("banner_id", bid);
                    }
                }
                C6907h.m21525a("enter_tag_detail", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo67908a(Banner banner, int i) {
        if (banner != null && banner != this.f69416a) {
            this.f69416a = banner;
            String schema = this.f69416a.getSchema();
            if (!TextUtils.isEmpty(schema)) {
                C7167b.m22380b().mo18647a().preloadMiniApp(schema);
            }
            this.f69417b = i;
            if (this.f69416a.getBannerUrl() != null && !C6307b.m19566a((Collection<T>) this.f69416a.getBannerUrl().getUrlList())) {
                C12133n.m35299a(C23400r.m76741a(this.f69416a.getBannerUrl())).mo29853b(C43012cg.m136513a(600)).mo29847a(m86733a()).mo29846a(true).mo29845a("BannerViewHolder").mo29844a((C12128i) this.mSdCover).mo29848a();
            }
            C24510b bVar = new C24510b((float) C23486n.m77122a(4.0d), this.itemView.getContext().getResources().getColor(R.color.a77));
            bVar.setAlpha(76);
            DmtTextView dmtTextView = (DmtTextView) this.itemView.findViewById(R.id.zy);
            if (dmtTextView != null) {
                dmtTextView.setBackgroundDrawable(bVar);
                if (this.f69416a.getAdData() == null || this.f69416a.getAdData().getAdLabel() == null) {
                    dmtTextView.setVisibility(8);
                } else {
                    dmtTextView.setText(this.f69416a.getAdData().getAdLabel().text);
                    dmtTextView.setVisibility(0);
                }
            }
        }
    }
}
