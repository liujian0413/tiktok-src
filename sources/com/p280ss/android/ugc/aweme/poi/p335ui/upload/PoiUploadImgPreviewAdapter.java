package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SquareImageView;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImgPreviewAdapter */
public final class PoiUploadImgPreviewAdapter extends C1262a<PoiUploadImgPreviewViewHolder> {

    /* renamed from: a */
    public boolean f92933a = true;

    /* renamed from: b */
    private final List<String> f92934b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImgPreviewAdapter$PoiUploadImgPreviewViewHolder */
    public static final class PoiUploadImgPreviewViewHolder extends C1293v {

        /* renamed from: a */
        private SquareImageView f92935a;

        /* renamed from: b */
        private DmtTextView f92936b;

        /* renamed from: c */
        private View f92937c;

        /* renamed from: d */
        private View f92938d;

        public PoiUploadImgPreviewViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.chm);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.poi_upload_img)");
            this.f92935a = (SquareImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.e9u);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.user_nick_name)");
            this.f92936b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dm2);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.top_divider)");
            this.f92937c = findViewById3;
            View findViewById4 = view.findViewById(R.id.nt);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.bottom_divider)");
            this.f92938d = findViewById4;
        }

        /* renamed from: a */
        public final void mo90172a(boolean z) {
            if (z) {
                this.f92936b.setVisibility(0);
                DmtTextView dmtTextView = this.f92936b;
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                String string = view.getContext().getString(R.string.b_t);
                C7573i.m23582a((Object) string, "itemView.context.getStri….string.friends_nickname)");
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                User curUser = f.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a);
                return;
            }
            this.f92936b.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo90171a(String str, int i, int i2, boolean z) {
            float f;
            float f2;
            if (i == 0) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                f = C9738o.m28708b(view.getContext(), 16.0f);
            } else {
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                f = C9738o.m28708b(view2.getContext(), 8.0f);
            }
            LayoutParams layoutParams = this.f92937c.getLayoutParams();
            layoutParams.height = (int) f;
            this.f92937c.setLayoutParams(layoutParams);
            if (i == i2 - 1) {
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                f2 = C9738o.m28708b(view3.getContext(), 16.0f);
            } else {
                View view4 = this.itemView;
                C7573i.m23582a((Object) view4, "itemView");
                f2 = C9738o.m28708b(view4.getContext(), 8.0f);
            }
            LayoutParams layoutParams2 = this.f92938d.getLayoutParams();
            layoutParams2.height = (int) f2;
            this.f92938d.setLayoutParams(layoutParams2);
            if (str != null) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                C23323e.m76514a((RemoteImageView) this.f92935a, sb.toString());
            }
            if (z) {
                this.f92936b.setVisibility(0);
                DmtTextView dmtTextView = this.f92936b;
                View view5 = this.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                String string = view5.getContext().getString(R.string.b_t);
                C7573i.m23582a((Object) string, "itemView.context.getStri….string.friends_nickname)");
                IAccountUserService f3 = C6861a.m21337f();
                C7573i.m23582a((Object) f3, "AccountProxyService.userService()");
                User curUser = f3.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a);
                return;
            }
            this.f92936b.setVisibility(8);
        }
    }

    public final int getItemCount() {
        List<String> list = this.f92934b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public PoiUploadImgPreviewAdapter(List<String> list) {
        this.f92934b = list;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m114427a(viewGroup, i);
    }

    /* renamed from: a */
    private static PoiUploadImgPreviewViewHolder m114427a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a40, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new PoiUploadImgPreviewViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder, int i) {
        String str;
        C7573i.m23587b(poiUploadImgPreviewViewHolder, "holder");
        List<String> list = this.f92934b;
        if (list != null) {
            str = (String) list.get(i);
        } else {
            str = null;
        }
        poiUploadImgPreviewViewHolder.mo90171a(str, i, getItemCount(), this.f92933a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder, int i, List<Object> list) {
        C7573i.m23587b(poiUploadImgPreviewViewHolder, "holder");
        C7573i.m23587b(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(poiUploadImgPreviewViewHolder, i);
            return;
        }
        Object obj = list.get(0);
        if (obj != null) {
            poiUploadImgPreviewViewHolder.mo90172a(((Boolean) obj).booleanValue());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }
}
