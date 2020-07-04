package com.bytedance.android.livesdk.adapter;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.paging.adapter.PagingAdapter;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.model.C4905g.C4906a;
import com.bytedance.android.livesdk.chatroom.model.C4909h;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class FansClubAutoLightAdapter extends PagingAdapter<C4906a> {

    /* renamed from: com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter$a */
    class C3874a extends BaseViewHolder<C4906a> {

        /* renamed from: b */
        public FansClubApi f11575b = ((FansClubApi) C9178j.m27302j().mo22373b().mo10440a(FansClubApi.class));

        /* renamed from: d */
        private HSImageView f11577d;

        /* renamed from: e */
        private HSImageView f11578e;

        /* renamed from: f */
        private TextView f11579f;

        /* renamed from: g */
        private TextView f11580g;

        /* renamed from: h */
        private ImageView f11581h;

        C3874a(View view) {
            super(view);
            this.f11577d = (HSImageView) view.findViewById(R.id.b64);
            this.f11579f = (TextView) view.findViewById(R.id.dyg);
            this.f11578e = (HSImageView) view.findViewById(R.id.b_l);
            this.f11580g = (TextView) view.findViewById(R.id.dub);
            this.f11581h = (ImageView) view.findViewById(R.id.bcw);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo10072a(C4906a aVar, int i) {
            int i2;
            if (aVar != null) {
                if (aVar.f14027b != null) {
                    C3393m.m12633b(this.f11577d, aVar.f14027b.getAvatarThumb());
                    this.f11579f.setText(aVar.f14027b.getNickName());
                }
                if (!(aVar.f14026a == null || aVar.f14026a.f14033e == null)) {
                    this.f11580g.setText(aVar.f14026a.f14033e.f14034a);
                    C3393m.m12633b(this.f11578e, aVar.f14026a.f14033e.f14035b);
                    int i3 = aVar.f14026a.f14032d;
                    ImageView imageView = this.f11581h;
                    if (i3 == 1) {
                        i2 = R.drawable.c6d;
                    } else {
                        i2 = R.drawable.c6b;
                    }
                    imageView.setImageResource(i2);
                    this.f11581h.setOnClickListener(new C3878a(this, i3, aVar));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo11413a(final int i, final C4906a aVar, View view) {
            int i2;
            int i3;
            C9249a a = new C9249a(this.itemView.getContext()).mo22710a((int) R.string.era);
            if (i == 1) {
                i2 = R.string.erb;
            } else {
                i2 = R.string.ere;
            }
            C9249a b = a.mo22718b(i2);
            if (i == 1) {
                i3 = R.string.fdn;
            } else {
                i3 = R.string.fdo;
            }
            b.mo22722b(0, i3, (OnClickListener) new OnClickListener() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo11416a(ProgressDialog progressDialog, Throwable th) throws Exception {
                    String str;
                    progressDialog.dismiss();
                    if (th instanceof ApiServerException) {
                        ApiServerException apiServerException = (ApiServerException) th;
                        if (!TextUtils.isEmpty(apiServerException.getPrompt())) {
                            str = apiServerException.getPrompt();
                        } else if (TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                            str = "";
                        } else {
                            str = apiServerException.getErrorMsg();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C3517a.m12962a(C3874a.this.itemView.getContext(), str);
                        }
                    }
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    dialogInterface.dismiss();
                    Context context = C3874a.this.itemView.getContext();
                    int i2 = 1;
                    if (i == 1) {
                        str = C3358ac.m12515a((int) R.string.er_);
                    } else {
                        str = C3358ac.m12515a((int) R.string.erg);
                    }
                    ProgressDialog a = C9044al.m27010a(context, str);
                    C3874a aVar = C3874a.this;
                    FansClubApi fansClubApi = C3874a.this.f11575b;
                    long id = aVar.f14027b.getId();
                    if (i == 1) {
                        i2 = 0;
                    }
                    aVar.mo10318a(fansClubApi.editAutoLight(id, i2).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3879b<Object>(this, a, aVar), (C7326g<? super Throwable>) new C3880c<Object>(this, a)));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo11415a(ProgressDialog progressDialog, C4906a aVar, C3479d dVar) throws Exception {
                    int i;
                    int i2;
                    progressDialog.dismiss();
                    if (dVar == null || dVar.data == null || ((C4909h) dVar.data).f14036a == null) {
                        i = 0;
                    } else {
                        i = ((C4909h) dVar.data).f14036a.f14032d;
                        aVar.f14026a = ((C4909h) dVar.data).f14036a;
                    }
                    if (i == 1) {
                        i2 = R.string.erf;
                    } else {
                        i2 = R.string.erc;
                    }
                    C9049ap.m27022a(i2);
                    FansClubAutoLightAdapter.this.notifyDataSetChanged();
                }
            }).mo22722b(1, (int) R.string.ecm, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo22729d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter$b */
    static class C3877b extends C1147c<C4906a> {
        private C3877b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
            return false;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo10064a() {
        return R.layout.aph;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo10065a(int i, Object obj) {
        return 0;
    }

    public FansClubAutoLightAdapter() {
        super(new C3877b());
    }

    /* renamed from: a */
    public final C1293v mo10066a(ViewGroup viewGroup, int i) {
        return new C3874a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.arr, viewGroup, false));
    }
}
