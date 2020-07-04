package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.widget.CustomFontTextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.l */
public final class C8896l extends C48226c<C8857f, C8897a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.l$a */
    static class C8897a extends C1293v {

        /* renamed from: a */
        private ImageView f24245a;

        /* renamed from: b */
        private ImageView f24246b;

        /* renamed from: c */
        private TextView f24247c;

        /* renamed from: d */
        private HSImageView f24248d;

        /* renamed from: e */
        private CustomFontTextView f24249e;

        public C8897a(View view) {
            super(view);
            this.f24245a = (ImageView) view.findViewById(R.id.cnb);
            this.f24246b = (ImageView) view.findViewById(R.id.e8m);
            this.f24247c = (TextView) view.findViewById(R.id.e9m);
            this.f24248d = (HSImageView) view.findViewById(R.id.bp5);
            this.f24249e = (CustomFontTextView) view.findViewById(R.id.aij);
        }

        /* renamed from: a */
        public final void mo21988a(C8857f fVar) {
            FansClubData fansClubData;
            C5343e.m17043b(this.f24246b, fVar.f24097a.getAvatarThumb());
            this.f24247c.setText(fVar.f24097a.getNickName());
            if (fVar.f24097a.getNobleLevelInfo() != null) {
                C5343e.m17030a(this.f24245a, fVar.f24097a.getNobleLevelInfo().getNobleIcon());
            }
            if (!(fVar.f24097a == null || fVar.f24097a.getFansClub() == null)) {
                if (FansClubData.isValid(fVar.f24097a.getFansClub().getData())) {
                    fansClubData = fVar.f24097a.getFansClub().getData();
                } else {
                    fansClubData = null;
                }
                if (!FansClubData.isValid(fansClubData) || fansClubData.badge == null || fansClubData.badge.icons == null) {
                    this.f24248d.setVisibility(8);
                    this.f24249e.setVisibility(8);
                } else {
                    ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                    if (imageModel != null) {
                        this.f24248d.setVisibility(0);
                        this.f24249e.setVisibility(0);
                        C5343e.m17038a(this.f24248d, imageModel);
                        this.f24249e.setText(fansClubData.clubName);
                    }
                }
            }
            this.itemView.setOnClickListener(new C8898m(fVar));
        }

        /* renamed from: a */
        static final /* synthetic */ void m26620a(C8857f fVar, View view) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(fVar.f24097a.getId());
            userProfileEvent.setClickUserPosition("noble_rank");
            C9097a.m27146a().mo22267a((Object) userProfileEvent);
        }
    }

    /* renamed from: a */
    private static void m26616a(C8897a aVar, C8857f fVar) {
        aVar.mo21988a(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26617b(layoutInflater, viewGroup);
    }

    /* renamed from: b */
    private static C8897a m26617b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8897a(layoutInflater.inflate(R.layout.asp, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26616a((C8897a) vVar, (C8857f) obj);
    }
}
