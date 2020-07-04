package com.p280ss.android.ugc.aweme.anchor.binder.game;

import android.app.Activity;
import android.support.p022v4.util.ArrayMap;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22527b;
import com.p280ss.android.ugc.aweme.anchor.binder.base.BaseItemViewBinder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.anchor.binder.game.GameItemViewBinder */
public final class GameItemViewBinder extends BaseItemViewBinder<C22526a, GameHolder> {

    /* renamed from: c */
    public final String f60042c;

    /* renamed from: com.ss.android.ugc.aweme.anchor.binder.game.GameItemViewBinder$GameHolder */
    public final class GameHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f60043a;

        /* renamed from: b */
        public final DmtTextView f60044b;

        /* renamed from: c */
        public final DmtTextView f60045c;

        /* renamed from: d */
        public final Button f60046d;

        /* renamed from: e */
        final /* synthetic */ GameItemViewBinder f60047e;

        /* renamed from: com.ss.android.ugc.aweme.anchor.binder.game.GameItemViewBinder$GameHolder$a */
        static final class C22538a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GameHolder f60048a;

            /* renamed from: b */
            final /* synthetic */ C22526a f60049b;

            C22538a(GameHolder gameHolder, C22526a aVar) {
                this.f60048a = gameHolder;
                this.f60049b = aVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6907h.m21524a("gc_label_game_add", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("game_name", this.f60049b.f60002c).mo59973a("game_id", this.f60049b.f60000a).mo59973a("position", this.f60048a.f60047e.f60042c).f60753a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f60049b.f60000a);
                    jSONObject.put("name", this.f60049b.f60002c);
                    jSONObject.put("icon", this.f60049b.f60001b);
                    jSONObject.put("title", this.f60049b.f60002c);
                    jSONObject.put("description", this.f60049b.f60003d);
                    jSONObject.put("extra", this.f60049b.f60005f);
                    jSONObject.put(POIService.KEY_KEYWORD, this.f60049b.f60002c);
                } catch (JSONException e) {
                    C6921a.m21554a((Exception) e);
                }
                String a = C33336b.m107781a();
                Map arrayMap = new ArrayMap();
                arrayMap.put("anchor_content", jSONObject.toString());
                try {
                    jSONObject.put("url", C33336b.m107784a(a, arrayMap));
                } catch (JSONException e2) {
                    C6921a.m21554a((Exception) e2);
                }
                if (!TextUtils.isEmpty(this.f60049b.f60002c)) {
                    String str = this.f60049b.f60002c;
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    String jSONObject2 = jSONObject.toString();
                    C7573i.m23582a((Object) jSONObject2, "contentMap.toString()");
                    C33336b.m107787a(str, jSONObject2);
                }
                Activity activity = this.f60048a.f60047e.f60023b;
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.anchor.binder.game.GameItemViewBinder$GameHolder$b */
        static final class C22539b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22526a f60050a;

            C22539b(C22526a aVar) {
                this.f60050a = aVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f60050a.f60000a);
                } catch (JSONException e) {
                    C6921a.m21554a((Exception) e);
                }
                String a = C33336b.m107781a();
                Map arrayMap = new ArrayMap();
                arrayMap.put("anchor_content", jSONObject.toString());
                arrayMap.put("scene", "201014");
                String a2 = C33336b.m107784a(a, arrayMap);
                if (a2 == null) {
                    C7573i.m23580a();
                }
                C33336b.m107786a(a2);
            }
        }

        /* renamed from: a */
        public final void mo59146a(C22526a aVar) {
            String str;
            C7573i.m23587b(aVar, "cell");
            RemoteImageView remoteImageView = this.f60043a;
            C22527b bVar = aVar.f60001b;
            if (bVar != null) {
                str = bVar.f60006a;
            } else {
                str = null;
            }
            C23323e.m76514a(remoteImageView, str);
            DmtTextView dmtTextView = this.f60044b;
            C7573i.m23582a((Object) dmtTextView, "name");
            dmtTextView.setText(aVar.f60002c);
            DmtTextView dmtTextView2 = this.f60045c;
            C7573i.m23582a((Object) dmtTextView2, "summary");
            dmtTextView2.setText(aVar.f60003d);
            this.f60046d.setOnClickListener(new C22538a(this, aVar));
            this.itemView.setOnClickListener(new C22539b(aVar));
        }

        public GameHolder(GameItemViewBinder gameItemViewBinder, View view) {
            C7573i.m23587b(view, "itemView");
            this.f60047e = gameItemViewBinder;
            super(view);
            this.f60043a = (RemoteImageView) view.findViewById(R.id.axm);
            this.f60044b = (DmtTextView) view.findViewById(R.id.e6s);
            this.f60045c = (DmtTextView) view.findViewById(R.id.e6t);
            this.f60046d = (Button) view.findViewById(R.id.pp);
        }
    }

    public GameItemViewBinder(Activity activity, String str) {
        C7573i.m23587b(str, "fragmentType");
        super(activity);
        this.f60042c = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public GameHolder mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.sy, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ement_add, parent, false)");
        return new GameHolder(this, inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21966a(GameHolder gameHolder, C22526a aVar) {
        C7573i.m23587b(gameHolder, "holder");
        C7573i.m23587b(aVar, "cell");
        gameHolder.mo59146a(aVar);
        C6907h.m21524a("gc_label_game_show", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("game_name", aVar.f60002c).mo59973a("game_id", aVar.f60000a).mo59973a("position", this.f60042c).f60753a);
    }
}
