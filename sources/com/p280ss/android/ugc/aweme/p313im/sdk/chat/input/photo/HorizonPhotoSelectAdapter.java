package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.HorizonPhotoSelectAdapter */
public class HorizonPhotoSelectAdapter extends C1262a<C30874a> {

    /* renamed from: a */
    public int f80833a;

    /* renamed from: b */
    public int f80834b;

    /* renamed from: c */
    public List<C30897h> f80835c;

    /* renamed from: d */
    private C30872j f80836d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.HorizonPhotoSelectAdapter$a */
    class C30874a extends BaseViewHolder<C30897h> {

        /* renamed from: c */
        private TextView f80838c;

        /* renamed from: d */
        private RemoteImageView f80839d;

        /* renamed from: e */
        private ImageView f80840e;

        /* renamed from: f */
        private View f80841f;

        /* renamed from: g */
        private View f80842g;

        /* renamed from: c */
        public final void mo80311c() {
            C30872j.m100536a((OnClickListener) this.f80274a, this.f80840e, this.f80839d);
        }

        /* renamed from: b */
        public final void mo80310b() {
            if (HorizonPhotoSelectAdapter.this.f80833a == 0) {
                HorizonPhotoSelectAdapter.this.f80833a = this.itemView.getResources().getDimensionPixelSize(R.dimen.i0);
            }
            this.f80838c = (TextView) this.itemView.findViewById(R.id.d2b);
            this.f80839d = (RemoteImageView) this.itemView.findViewById(R.id.cb9);
            this.f80840e = (ImageView) this.itemView.findViewById(R.id.d2a);
            this.f80841f = this.itemView.findViewById(R.id.cba);
            this.f80842g = this.itemView.findViewById(R.id.d2c);
        }

        /* renamed from: b */
        public final void mo80746b(C30897h hVar) {
            if (hVar.f80945b) {
                C30913u.m100638a().mo80829a(this.f80839d, this.f80842g, this.f80838c, this.f80840e, this.f80841f, hVar.f80944a.f52149b);
                hVar.f80945b = false;
                return;
            }
            C30913u.m100638a().mo80830a(this.f80838c, this.f80840e, this.f80841f, hVar.f80944a.f52149b);
        }

        /* renamed from: a */
        public final void mo80308a(C30897h hVar) {
            LayoutParams layoutParams = this.f80839d.getLayoutParams();
            layoutParams.height = HorizonPhotoSelectAdapter.this.f80834b;
            float b = (float) hVar.mo80815b();
            layoutParams.width = Math.min((int) ((((float) HorizonPhotoSelectAdapter.this.f80834b) * ((float) hVar.mo80814a())) / b), HorizonPhotoSelectAdapter.this.f80833a);
            this.f80839d.setLayoutParams(layoutParams);
            this.f80841f.setLayoutParams(layoutParams);
            StringBuilder sb = new StringBuilder("file://");
            sb.append(hVar.f80944a.f52149b);
            C23323e.m76525b(this.f80839d, sb.toString(), layoutParams.width, layoutParams.height);
            mo80746b(hVar);
            this.f80840e.setTag(hVar);
            this.f80839d.setTag(hVar);
        }

        private C30874a(View view, C30872j jVar) {
            super(view, jVar);
        }
    }

    public int getItemCount() {
        return this.f80835c.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C30874a aVar, int i) {
        aVar.mo80308a((C30897h) this.f80835c.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C30874a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30874a(View.inflate(viewGroup.getContext(), R.layout.a0c, null), this.f80836d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C30874a aVar, int i, List<Object> list) {
        if (list.isEmpty() || !TextUtils.equals((String) list.get(0), "selectedStateChanged")) {
            onBindViewHolder(aVar, i);
        } else {
            aVar.mo80746b((C30897h) this.f80835c.get(i));
        }
    }
}
