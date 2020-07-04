package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.favorites.adapter.CollectStickerAdapter;
import com.p280ss.android.ugc.aweme.favorites.model.C27767e;
import com.p280ss.android.ugc.aweme.favorites.p1211b.C27742a;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.StickersCollectListFragment */
public class StickersCollectListFragment extends BaseCollectListFragment {

    /* renamed from: j */
    private boolean f73311j;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter mo71264n() {
        return new CollectStickerAdapter();
    }

    public void onResume() {
        super.onResume();
        m91186k();
    }

    /* renamed from: k */
    private void m91186k() {
        if (this.f73311j) {
            this.f73311j = false;
            mo71261g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
        if (this.f73219i != null) {
            this.f73219i.mo66536a(new C27767e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo71261g() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo71262i() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(4));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo71268r() {
        if (getActivity() == null) {
            return null;
        }
        if (!C6399b.m19944t()) {
            return super.mo71268r();
        }
        C10805b bVar = new C10806a(getActivity()).mo25990b((int) R.string.b4i).mo25993c(R.string.b4h).mo25985a((int) R.drawable.ax0).f29135a;
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        a.setStatus(bVar);
        return a;
    }

    @C7709l
    public void onStickerCollectEvent(C27742a aVar) {
        if (isViewValid()) {
            List items = ((C25673a) this.f73219i.mo66539h()).getItems();
            NewFaceStickerBean newFaceStickerBean = aVar.f73177a;
            if (items != null && !items.isEmpty() && newFaceStickerBean != null) {
                if (!newFaceStickerBean.isFavorite) {
                    int size = items.size();
                    Iterator it = items.iterator();
                    while (it.hasNext()) {
                        NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) it.next();
                        if (newFaceStickerBean2 != null && TextUtils.equals(newFaceStickerBean2.f108868id, newFaceStickerBean.f108868id)) {
                            this.f73311j = false;
                            it.remove();
                        }
                    }
                    if (size != items.size()) {
                        this.f73215e.notifyDataSetChanged();
                    } else {
                        this.f73311j = true;
                    }
                    if (items.isEmpty()) {
                        ae_();
                    }
                    return;
                }
                this.f73311j = true;
            }
        }
    }
}
