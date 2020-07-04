package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerAdapter */
public class SearchInfoStickerAdapter extends AbstractInfoStickerAdapter<C40816v> {

    /* renamed from: c */
    protected FragmentActivity f105753c;

    /* renamed from: b */
    public final int mo100755b(int i) {
        return 1;
    }

    SearchInfoStickerAdapter(FragmentActivity fragmentActivity) {
        this.f105753c = fragmentActivity;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == -2) {
            return m130064c(viewGroup, i);
        }
        return super.mo58032a(viewGroup, i);
    }

    /* renamed from: b */
    public final void mo100757b(C1293v vVar, int i) {
        ((SearchInfoStickerHolder) vVar).mo100830a(this.f105753c, (C40816v) mo100758c(i), i);
    }

    /* renamed from: c */
    private static C1293v m130064c(ViewGroup viewGroup, int i) {
        return new C40817w(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g2, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (mo58029a(i) == -2) {
            m130065c(vVar, i);
        } else {
            super.mo58033a(vVar, i);
        }
    }

    /* renamed from: b */
    public final C1293v mo100756b(ViewGroup viewGroup, int i) {
        SearchInfoStickerHolder searchInfoStickerHolder = new SearchInfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g9, viewGroup, false));
        searchInfoStickerHolder.f105763a = this.f105635b;
        return searchInfoStickerHolder;
    }

    /* renamed from: c */
    private void m130065c(C1293v vVar, int i) {
        int i2;
        C40817w wVar = (C40817w) vVar;
        C0052o<Boolean> oVar = ((SearchInfoStickerViewModel) C0069x.m159a(this.f105753c).mo147a(SearchInfoStickerViewModel.class)).f105788a;
        TextView textView = wVar.f106149a;
        if (oVar.getValue() == null || !((Boolean) oVar.getValue()).booleanValue()) {
            i2 = R.string.dk1;
        } else {
            i2 = R.string.dk0;
        }
        textView.setText(i2);
    }
}
