package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect.StickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerHolder */
public class SearchInfoStickerHolder extends C1293v implements C0053p<LiveDataWrapper<ProviderEffect>> {

    /* renamed from: a */
    public boolean f105763a;

    /* renamed from: b */
    public C40816v f105764b;

    /* renamed from: c */
    private StickerImageView f105765c;

    /* renamed from: d */
    private FragmentActivity f105766d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100831a(boolean z) {
        this.f105765c.mo100256a(z);
    }

    SearchInfoStickerHolder(View view) {
        super(view);
        this.f105765c = (StickerImageView) view.findViewById(R.id.db2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(LiveDataWrapper<ProviderEffect> liveDataWrapper) {
        switch (liveDataWrapper.f88768b) {
            case ERROR:
                this.f105764b.f106147b = 3;
                this.f105765c.mo100260c();
                C10761a.m31399c((Context) this.f105766d, (int) R.string.b23).mo25750a();
                return;
            case SUCCESS:
                this.f105764b.f106147b = 1;
                this.f105765c.mo100249a();
                C0052o d = C40805n.m130407a(this.f105766d).mo100823d();
                new C40695d();
                d.setValue(C40695d.m130138a((ProviderEffect) liveDataWrapper.f88767a));
                return;
            case PROGRESS:
                this.f105764b.f106147b = 5;
                int i = liveDataWrapper.f88769c;
                this.f105764b.f106148c = i;
                if (((ProviderEffect) liveDataWrapper.f88767a).f113502id.equals(this.f105764b.f106146a.f113502id) && i > 0) {
                    this.f105765c.mo100250a(i);
                    break;
                }
        }
    }

    /* renamed from: a */
    public final void mo100829a(FragmentActivity fragmentActivity, C40816v vVar) {
        if (vVar != null && vVar.f106146a != null) {
            if (vVar.f106147b == 1 || C40816v.m130434a(vVar.f106146a)) {
                C0052o d = C40805n.m130407a(fragmentActivity).mo100823d();
                new C40695d();
                d.setValue(C40695d.m130138a(vVar.f106146a));
                return;
            }
            vVar.f106147b = 2;
            this.f105765c.mo100258b();
            C40805n.m130407a(fragmentActivity).mo100810a(vVar.f106146a).observe(fragmentActivity, this);
        }
    }

    /* renamed from: a */
    public final void mo100830a(FragmentActivity fragmentActivity, C40816v vVar, int i) {
        this.f105766d = fragmentActivity;
        if (vVar != null && vVar.f106146a != null) {
            this.f105764b = vVar;
            this.f105765c.mo100251a(vVar.f106147b, vVar.f106148c);
            StickerBean stickerBean = vVar.f106146a.sticker;
            if (stickerBean != null && !C6319n.m19593a(stickerBean.url)) {
                this.f105765c.setIconImageViewScaleType(C13423b.f35595c);
                this.f105765c.mo100255a(stickerBean.url, Config.ARGB_8888);
            }
            final VideoPublishEditModel videoPublishEditModel = C40805n.m130407a(fragmentActivity).f105747b;
            final C0052o<Boolean> oVar = ((SearchInfoStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(SearchInfoStickerViewModel.class)).f105788a;
            View view = this.itemView;
            final FragmentActivity fragmentActivity2 = fragmentActivity;
            final C40816v vVar2 = vVar;
            final int i2 = i;
            C406711 r1 = new C42939as() {
                /* renamed from: a */
                public final void mo70606a(View view) {
                    String str;
                    String str2;
                    SearchInfoStickerHolder.this.mo100829a(fragmentActivity2, vVar2);
                    C42962b bVar = C42962b.f111525a;
                    String str3 = "prop_click";
                    C38511bc a = C38511bc.m123103a().mo96483a("scene_id", 1002).mo96485a("tab_name", "贴图").mo96485a("prop_id", vVar2.f106146a.f113502id).mo96485a("enter_method", "click_main_panel").mo96485a("creation_id", videoPublishEditModel.creationId).mo96485a("shoot_way", videoPublishEditModel.mShootWay).mo96483a("draft_id", videoPublishEditModel.draftId);
                    String str4 = "enter_from";
                    if (SearchInfoStickerHolder.this.f105763a) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    C38511bc a2 = a.mo96485a(str4, str).mo96483a("impr_position", i2);
                    String str5 = "after_search";
                    if (oVar.getValue() == null || !((Boolean) oVar.getValue()).booleanValue()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    bVar.mo104671a(str3, a2.mo96485a(str5, str2).f100112a);
                    if (vVar2.f106146a.click_url != null) {
                        OkHttpClient oKHttpClient = C35574k.m114859a().mo70078L().getOKHttpClient();
                        Builder builder = new Builder();
                        builder.get().url(vVar2.f106146a.click_url);
                        oKHttpClient.newCall(builder.build()).enqueue(new Callback() {
                            public final void onFailure(Call call, IOException iOException) {
                                call.cancel();
                            }

                            public final void onResponse(Call call, Response response) throws IOException {
                                call.cancel();
                            }
                        });
                    }
                }
            };
            view.setOnClickListener(r1);
        }
    }
}
