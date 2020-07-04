package com.p280ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.BusiStickerShowLogger */
public class BusiStickerShowLogger extends C1281m implements C0053p<EffectCategoryModel>, C1278j, OnAttachStateChangeListener {

    /* renamed from: a */
    private String f111407a;

    /* renamed from: b */
    private Fragment f111408b;

    /* renamed from: c */
    private RecyclerView f111409c;

    /* renamed from: d */
    private GridLayoutManager f111410d;

    /* renamed from: e */
    private CategoryStickerAdapter f111411e;

    /* renamed from: f */
    private String f111412f;

    /* renamed from: g */
    private Map<String, Boolean> f111413g = new HashMap();

    /* renamed from: h */
    private List<String> f111414h = new ArrayList();

    /* renamed from: b */
    public final void mo5815b(View view) {
    }

    /* renamed from: a */
    public final void mo104602a() {
        this.f111409c.mo5528a((C1281m) this);
        this.f111409c.addOnAttachStateChangeListener(this);
        this.f111409c.mo5526a((C1278j) this);
    }

    /* renamed from: b */
    public final void mo104603b() {
        this.f111409c.mo5545b((C1281m) this);
        this.f111409c.removeOnAttachStateChangeListener(this);
        this.f111409c.mo5543b((C1278j) this);
    }

    /* renamed from: d */
    private void m136210d() {
        for (String put : this.f111413g.keySet()) {
            this.f111413g.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: c */
    private void m136209c() {
        int j = this.f111410d.mo5445j();
        int l = this.f111410d.mo5447l();
        this.f111414h.clear();
        int i = j + 1;
        while (true) {
            boolean z = false;
            if (i >= l + 1) {
                break;
            }
            StickerWrapper stickerWrapper = (StickerWrapper) this.f111411e.mo100733c(i);
            if (m136208a(stickerWrapper)) {
                String effectId = stickerWrapper.f104908a.getEffectId();
                Boolean bool = (Boolean) this.f111413g.get(effectId);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (!z) {
                    C43058dj.m136606b(stickerWrapper.f104908a);
                }
                this.f111413g.put(effectId, Boolean.valueOf(true));
                this.f111414h.add(effectId);
            }
            i++;
        }
        for (String str : this.f111413g.keySet()) {
            if (!this.f111414h.contains(str)) {
                this.f111413g.put(str, Boolean.valueOf(false));
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        m136210d();
    }

    public void onViewAttachedToWindow(View view) {
        if (this.f111408b.mUserVisibleHint) {
            m136209c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(EffectCategoryModel effectCategoryModel) {
        String str = effectCategoryModel.key;
        if (!TextUtils.equals(this.f111412f, str)) {
            if (TextUtils.equals(str, this.f111407a)) {
                m136209c();
            } else {
                m136210d();
            }
            this.f111412f = str;
        }
    }

    /* renamed from: a */
    private static boolean m136208a(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || stickerWrapper.f104908a == null || TextUtils.isEmpty(stickerWrapper.f104908a.getAdRawData())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5814a(View view) {
        if (this.f111408b.mUserVisibleHint) {
            StickerWrapper stickerWrapper = (StickerWrapper) this.f111411e.mo100733c(RecyclerView.m5892f(view) + 1);
            if (m136208a(stickerWrapper)) {
                String effectId = stickerWrapper.f104908a.getEffectId();
                boolean z = false;
                Boolean bool = (Boolean) this.f111413g.get(effectId);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (!z) {
                    C43058dj.m136606b(stickerWrapper.f104908a);
                }
                this.f111413g.put(effectId, Boolean.valueOf(true));
            }
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.f111409c.mo5543b((C1278j) this);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            m136209c();
        }
    }

    public BusiStickerShowLogger(String str, Fragment fragment, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, CategoryStickerAdapter categoryStickerAdapter) {
        this.f111407a = str;
        this.f111408b = fragment;
        this.f111409c = recyclerView;
        this.f111410d = gridLayoutManager;
        this.f111411e = categoryStickerAdapter;
        ((TabSelectViewModel) C0069x.m159a(fragment.getActivity()).mo147a(TabSelectViewModel.class)).f106556a.observe(fragment, this);
    }
}
