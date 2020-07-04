package com.p280ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiPhoto;
import com.p280ss.android.ugc.aweme.poi.preview.C35135a;
import com.p280ss.android.ugc.aweme.poi.preview.C35142b;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendImageAdapter */
public class RecommendImageAdapter extends C1262a<CoverViewHolder> implements C35013b {

    /* renamed from: a */
    private Context f91443a;

    /* renamed from: b */
    private List<PoiPhoto> f91444b;

    /* renamed from: c */
    private C35142b f91445c;

    /* renamed from: d */
    private RecyclerView f91446d;

    /* renamed from: e */
    private PoiSimpleBundle f91447e;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.RecommendImageAdapter$CoverViewHolder */
    protected static class CoverViewHolder extends C1293v {

        /* renamed from: a */
        private RemoteImageView f91448a;

        /* renamed from: b */
        private TextView f91449b;

        /* renamed from: c */
        private TextView f91450c;

        /* renamed from: d */
        private C35013b f91451d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo88774a(int i, View view) {
            if (this.f91451d != null) {
                this.f91451d.mo88773a(i);
            }
        }

        public CoverViewHolder(View view, C35013b bVar) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f91451d = bVar;
            this.f91449b = (TextView) view.findViewById(R.id.cf4);
            this.f91448a = (RemoteImageView) view.findViewById(R.id.cf2);
            this.f91450c = (TextView) view.findViewById(R.id.cf3);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo88775a(PoiPhoto poiPhoto, int i) {
            if (poiPhoto != null) {
                C23323e.m76506a(this.f91448a, poiPhoto.getPicMedium(), (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 270);
                this.f91449b.setText(poiPhoto.title);
                this.f91448a.setOnClickListener(new C35016e(this, i));
                if (TextUtils.isEmpty(poiPhoto.getTagName())) {
                    this.f91450c.setVisibility(8);
                    return;
                }
                this.f91450c.setVisibility(0);
                this.f91450c.setText(poiPhoto.getTagName());
            }
        }
    }

    public int getItemCount() {
        if (this.f91444b == null) {
            return 0;
        }
        return this.f91444b.size();
    }

    /* renamed from: a */
    public final void mo88773a(int i) {
        C35135a.m113347a("recommend", ((PoiPhoto) this.f91444b.get(i)).getTagType(), this.f91447e);
        if (this.f91445c == null) {
            this.f91445c = C35142b.m113365a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (PoiPhoto poiPhoto : this.f91444b) {
                arrayList.add(poiPhoto.getMedium());
                arrayList2.add(poiPhoto.getLarge());
                arrayList3.add(poiPhoto.title);
                sb.append(poiPhoto.getTagType());
                sb.append("-");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", this.f91447e.getPoiId());
            hashMap.put("page_type", "recommend");
            hashMap.put("poi_type", this.f91447e.getPoiType());
            hashMap.put("group_id", this.f91447e.getAwemeId());
            hashMap.put("previous_page", this.f91447e.getPreviousPage());
            hashMap.put("pic_tag", sb.toString());
            C35454m.m114530a(hashMap, this.f91447e);
            this.f91445c.mo89432a(this.f91443a, arrayList, arrayList2, arrayList3, this.f91446d, R.id.cf2, this.f91447e.getPoiId(), "recommend", hashMap, true, true);
        }
        this.f91445c.mo89434a("tag_poi_picture", i, getItemCount());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(CoverViewHolder coverViewHolder, int i) {
        coverViewHolder.mo88775a((PoiPhoto) this.f91444b.get(i), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public CoverViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0j, viewGroup, false), this);
    }

    public RecommendImageAdapter(Context context, RecyclerView recyclerView, List<PoiPhoto> list, PoiSimpleBundle poiSimpleBundle) {
        this.f91443a = context;
        this.f91444b = list;
        this.f91446d = recyclerView;
        this.f91447e = poiSimpleBundle;
    }
}
