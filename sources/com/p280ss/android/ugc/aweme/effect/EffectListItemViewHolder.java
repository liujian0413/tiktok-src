package com.p280ss.android.ugc.aweme.effect;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.share.C38275x.C38283a;
import com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectListItemViewHolder */
public final class EffectListItemViewHolder extends C1293v implements OnClickListener {

    /* renamed from: g */
    public static final C27334a f72118g = new C27334a(null);

    /* renamed from: a */
    public TextView f72119a;

    /* renamed from: b */
    public TextView f72120b;

    /* renamed from: c */
    public TextView f72121c;

    /* renamed from: d */
    public RemoteImageView f72122d;

    /* renamed from: e */
    public NewFaceSticker f72123e;

    /* renamed from: f */
    public final boolean f72124f;

    /* renamed from: h */
    private final Context f72125h;

    /* renamed from: com.ss.android.ugc.aweme.effect.EffectListItemViewHolder$a */
    public static final class C27334a {
        private C27334a() {
        }

        public /* synthetic */ C27334a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m89621a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "viewGroup");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uz, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(view…layout, viewGroup, false)");
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.EffectListItemViewHolder$b */
    static final class C27335b implements C38283a {

        /* renamed from: a */
        final /* synthetic */ EffectListItemViewHolder f72126a;

        C27335b(EffectListItemViewHolder effectListItemViewHolder) {
            this.f72126a = effectListItemViewHolder;
        }

        /* renamed from: a */
        public final void mo70352a(String str, Effect effect) {
            String str2;
            C22984d a = C22984d.m75611a();
            String str3 = "enter_from";
            if (this.f72126a.f72124f) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            C22984d a2 = a.mo59973a(str3, str2).mo59973a("creation_id", str).mo59973a("scene_id", "1008").mo59973a("shoot_way", "prop_tab");
            String str4 = "prop_id";
            NewFaceSticker newFaceSticker = this.f72126a.f72123e;
            if (newFaceSticker == null) {
                C7573i.m23580a();
            }
            C22984d a3 = a2.mo59973a(str4, newFaceSticker.getEffectId());
            String str5 = "from_user_id";
            NewFaceSticker newFaceSticker2 = this.f72126a.f72123e;
            if (newFaceSticker2 == null) {
                C7573i.m23580a();
            }
            C6907h.m21524a("shoot", (Map) a3.mo59973a(str5, newFaceSticker2.getOwnerId()).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo70350a(NewFaceSticker newFaceSticker) {
        int i;
        if (newFaceSticker != null) {
            this.f72123e = newFaceSticker;
            TextView textView = this.f72119a;
            if (textView == null) {
                C7573i.m23580a();
            }
            NewFaceSticker newFaceSticker2 = this.f72123e;
            if (newFaceSticker2 == null) {
                C7573i.m23580a();
            }
            textView.setText(newFaceSticker2.getName());
            TextView textView2 = this.f72120b;
            if (textView2 == null) {
                C7573i.m23580a();
            }
            NewFaceSticker newFaceSticker3 = this.f72123e;
            if (newFaceSticker3 == null) {
                C7573i.m23580a();
            }
            if (TextUtils.isEmpty(newFaceSticker3.getDesc())) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
            TextView textView3 = this.f72120b;
            if (textView3 == null) {
                C7573i.m23580a();
            }
            NewFaceSticker newFaceSticker4 = this.f72123e;
            if (newFaceSticker4 == null) {
                C7573i.m23580a();
            }
            textView3.setText(newFaceSticker4.getDesc());
            TextView textView4 = this.f72121c;
            if (textView4 == null) {
                C7573i.m23580a();
            }
            Context context = this.f72125h;
            Object[] objArr = new Object[1];
            NewFaceSticker newFaceSticker5 = this.f72123e;
            if (newFaceSticker5 == null) {
                C7573i.m23580a();
            }
            objArr[0] = Integer.valueOf(newFaceSticker5.getUserCount());
            textView4.setText(context.getString(R.string.cri, objArr));
            RemoteImageView remoteImageView = this.f72122d;
            NewFaceSticker newFaceSticker6 = this.f72123e;
            if (newFaceSticker6 == null) {
                C7573i.m23580a();
            }
            C23323e.m76524b(remoteImageView, newFaceSticker6.getIconUrl());
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.bt2) {
            m89619a(view, "name");
        } else if (id == R.id.b8t) {
            m89619a(view, "head");
        } else {
            if (id == R.id.bde) {
                IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                    IAVService iAVService2 = (IAVService) ServiceManager.get().getService(IAVService.class);
                    C7573i.m23582a((Object) iAVService2, "avService");
                    if (iAVService2.getPublishService().checkIsAlreadyPublished(this.f72125h)) {
                        C38275x xVar = new C38275x(this.f72125h, "prop");
                        ArrayList arrayList = new ArrayList();
                        NewFaceSticker newFaceSticker = this.f72123e;
                        if (newFaceSticker == null) {
                            C7573i.m23580a();
                        }
                        if (!TextUtils.isEmpty(newFaceSticker.getEffectId())) {
                            NewFaceSticker newFaceSticker2 = this.f72123e;
                            if (newFaceSticker2 == null) {
                                C7573i.m23580a();
                            }
                            String effectId = newFaceSticker2.getEffectId();
                            if (effectId == null) {
                                C7573i.m23580a();
                            }
                            arrayList.add(effectId);
                            xVar.f99480j = new C27335b(this);
                            xVar.mo95915a(arrayList);
                        }
                    }
                } else {
                    String string = this.f72125h.getResources().getString(R.string.dtg);
                    Context context = this.f72125h;
                    if (context != null) {
                        C32656f.m105743a((Activity) context, "personal_homepage", "click_challenge_shoot", C42914ab.m136242a().mo104633a("login_title", string).f111445a);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    public EffectListItemViewHolder(View view, boolean z) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f72125h = context;
        this.f72124f = z;
        this.f72122d = (RemoteImageView) view.findViewById(R.id.b8t);
        this.f72121c = (TextView) view.findViewById(R.id.e4e);
        this.f72119a = (TextView) view.findViewById(R.id.dty);
        this.f72120b = (TextView) view.findViewById(R.id.dtw);
        OnClickListener onClickListener = this;
        view.findViewById(R.id.bt2).setOnClickListener(onClickListener);
        view.findViewById(R.id.bde).setOnClickListener(onClickListener);
        view.findViewById(R.id.b8t).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    private final void m89619a(View view, String str) {
        String str2;
        C22984d a = C22984d.m75611a();
        String str3 = "enter_from";
        if (this.f72124f) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        C22984d a2 = a.mo59973a(str3, str2).mo59973a("enter_method", str);
        String str4 = "prop_id";
        NewFaceSticker newFaceSticker = this.f72123e;
        if (newFaceSticker == null) {
            C7573i.m23580a();
        }
        C22984d a3 = a2.mo59973a(str4, newFaceSticker.getEffectId()).mo59973a("scene_id", "1001");
        String str5 = "from_user_id";
        NewFaceSticker newFaceSticker2 = this.f72123e;
        if (newFaceSticker2 == null) {
            C7573i.m23580a();
        }
        C22984d a4 = a3.mo59973a(str5, newFaceSticker2.getOwnerId());
        String str6 = "log_pb";
        NewFaceSticker newFaceSticker3 = this.f72123e;
        if (newFaceSticker3 == null) {
            C7573i.m23580a();
        }
        C6907h.m21524a("enter_prop_detail", (Map) a4.mo59972a(str6, (Object) newFaceSticker3.getLogPb()).f60753a);
        ArrayList arrayList = new ArrayList();
        NewFaceSticker newFaceSticker4 = this.f72123e;
        if (newFaceSticker4 == null) {
            C7573i.m23580a();
        }
        String effectId = newFaceSticker4.getEffectId();
        if (effectId == null) {
            C7573i.m23580a();
        }
        arrayList.add(effectId);
        StickerPropDetailActicity.m133129a(view.getContext(), null, null, null, arrayList);
    }
}
