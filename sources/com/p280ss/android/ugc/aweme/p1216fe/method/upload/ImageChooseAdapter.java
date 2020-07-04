package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter */
public final class ImageChooseAdapter extends C1262a<C1293v> {

    /* renamed from: g */
    public static final C28018a f73786g = new C28018a(null);

    /* renamed from: a */
    public List<Integer> f73787a;

    /* renamed from: b */
    public List<String> f73788b;

    /* renamed from: c */
    public boolean f73789c;

    /* renamed from: d */
    public C7563m<? super View, ? super String, C7581n> f73790d;

    /* renamed from: e */
    public C7562b<? super List<String>, C7581n> f73791e;

    /* renamed from: f */
    public final int f73792f;

    /* renamed from: h */
    private final ArrayList<MediaModel> f73793h = new ArrayList<>();

    /* renamed from: i */
    private List<Integer> f73794i;

    /* renamed from: j */
    private final int f73795j;

    /* renamed from: k */
    private final Context f73796k;

    /* renamed from: l */
    private final Boolean f73797l;

    /* renamed from: m */
    private final double f73798m = 1.0d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$ViewHolder */
    public static final class ViewHolder extends C1293v {

        /* renamed from: a */
        public RemoteImageView f73799a;

        /* renamed from: b */
        public TextView f73800b;

        /* renamed from: c */
        public FrameLayout f73801c;

        /* renamed from: d */
        public View f73802d;

        /* renamed from: e */
        public String f73803e;

        /* renamed from: a */
        public final void mo71469a() {
            TextView textView = this.f73800b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f73800b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.ne);
            }
        }

        public ViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }

        /* renamed from: a */
        public final void mo71470a(int i) {
            TextView textView = this.f73800b;
            if (textView != null) {
                textView.setText(String.valueOf(i + 1));
            }
            TextView textView2 = this.f73800b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.nf);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$a */
    public static final class C28018a {
        private C28018a() {
        }

        public /* synthetic */ C28018a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m91631a(MediaModel mediaModel) {
            if (((float) mediaModel.f88163i) <= ((float) mediaModel.f88164j) * 2.2f && ((float) mediaModel.f88164j) <= ((float) mediaModel.f88163i) * 2.2f) {
                return true;
            }
            C10761a.m31409e((Context) C29960a.m98230a(), (int) R.string.dsl).mo25750a();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$b */
    static final class C28019b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f73804a;

        /* renamed from: b */
        final /* synthetic */ ImageChooseAdapter f73805b;

        /* renamed from: c */
        final /* synthetic */ int f73806c;

        C28019b(View view, ImageChooseAdapter imageChooseAdapter, int i) {
            this.f73804a = view;
            this.f73805b = imageChooseAdapter;
            this.f73806c = i;
        }

        public final void run() {
            this.f73804a.setVisibility(4);
            this.f73804a.setAlpha(1.0f);
            this.f73805b.notifyItemChanged(this.f73806c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$c */
    static final class C28020c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageChooseAdapter f73807a;

        /* renamed from: b */
        final /* synthetic */ int f73808b;

        /* renamed from: c */
        final /* synthetic */ int f73809c;

        C28020c(ImageChooseAdapter imageChooseAdapter, int i, int i2) {
            this.f73807a = imageChooseAdapter;
            this.f73808b = i;
            this.f73809c = i2;
        }

        public final void run() {
            if (this.f73808b == this.f73807a.f73792f) {
                this.f73807a.notifyDataSetChanged();
            } else {
                this.f73807a.notifyItemChanged(this.f73809c);
            }
            C7562b<? super List<String>, C7581n> bVar = this.f73807a.f73791e;
            if (bVar != null) {
                bVar.invoke(this.f73807a.f73788b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$d */
    static final class C28021d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseAdapter f73810a;

        /* renamed from: b */
        final /* synthetic */ int f73811b;

        /* renamed from: c */
        final /* synthetic */ String f73812c;

        C28021d(ImageChooseAdapter imageChooseAdapter, int i, String str) {
            this.f73810a = imageChooseAdapter;
            this.f73811b = i;
            this.f73812c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r3)
                com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter r0 = r2.f73810a
                boolean r0 = r0.f73789c
                if (r0 == 0) goto L_0x000a
                return
            L_0x000a:
                int r0 = r2.f73811b
                if (r0 >= 0) goto L_0x0023
                com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter r0 = r2.f73810a
                java.util.List<java.lang.Integer> r0 = r0.f73787a
                if (r0 != 0) goto L_0x0017
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0017:
                int r0 = r0.size()
                com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter r1 = r2.f73810a
                int r1 = r1.f73792f
                if (r0 < r1) goto L_0x0023
                r0 = 1
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                if (r0 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter r0 = r2.f73810a
                kotlin.jvm.a.m<? super android.view.View, ? super java.lang.String, kotlin.n> r0 = r0.f73790d
                if (r0 == 0) goto L_0x0037
                java.lang.String r1 = "v"
                kotlin.jvm.internal.C7573i.m23582a(r3, r1)
                java.lang.String r1 = r2.f73812c
                r0.invoke(r3, r1)
                return
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.upload.ImageChooseAdapter.C28021d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseAdapter$e */
    static final class C28022e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseAdapter f73813a;

        /* renamed from: b */
        final /* synthetic */ ViewHolder f73814b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f73815c;

        C28022e(ImageChooseAdapter imageChooseAdapter, ViewHolder viewHolder, MediaModel mediaModel) {
            this.f73813a = imageChooseAdapter;
            this.f73814b = viewHolder;
            this.f73815c = mediaModel;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f73813a.f73789c) {
                this.f73813a.mo71467a(this.f73814b, this.f73814b.getAdapterPosition(), this.f73815c);
            }
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemCount() {
        return this.f73793h.size();
    }

    /* renamed from: a */
    public final void mo71468a(Collection<? extends MediaModel> collection) {
        C7573i.m23587b(collection, "mediaTotal");
        this.f73793h.clear();
        this.f73793h.addAll(collection);
        m91623a(this.f73793h.size());
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private final void m91623a(int i) {
        if (this.f73787a == null) {
            this.f73787a = new ArrayList();
        } else {
            List<Integer> list = this.f73787a;
            if (list != null) {
                list.clear();
            }
        }
        if (this.f73794i == null) {
            this.f73794i = new ArrayList();
        } else {
            List<Integer> list2 = this.f73794i;
            if (list2 != null) {
                list2.clear();
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            List<Integer> list3 = this.f73794i;
            if (list3 != null) {
                list3.add(Integer.valueOf(-1));
            }
        }
    }

    /* renamed from: a */
    private final void m91625a(View view) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams == null || layoutParams.width == this.f73795j)) {
                int i = layoutParams.height;
                double d = (double) this.f73795j;
                double d2 = this.f73798m;
                Double.isNaN(d);
                if (i != ((int) (d * d2))) {
                    layoutParams.width = this.f73795j;
                    double d3 = (double) this.f73795j;
                    double d4 = this.f73798m;
                    Double.isNaN(d3);
                    layoutParams.height = (int) (d3 * d4);
                }
            }
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        m91626a((ViewHolder) vVar, i);
    }

    /* renamed from: a */
    private final void m91624a(int i, ViewHolder viewHolder) {
        float f;
        int i2 = 0;
        float f2 = 1.0f;
        if (i >= 0) {
            viewHolder.mo71470a(i);
            View view = viewHolder.f73802d;
            if (view != null) {
                view.setVisibility(0);
            }
            f = 1.0f;
            f2 = 1.1f;
        } else {
            viewHolder.mo71469a();
            View view2 = viewHolder.f73802d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            List<Integer> list = this.f73787a;
            if (list != null) {
                i2 = list.size();
            }
            if (i2 >= this.f73792f) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        RemoteImageView remoteImageView = viewHolder.f73799a;
        if (remoteImageView != null) {
            if (remoteImageView.getAlpha() != f) {
                remoteImageView.setAlpha(f);
            }
            if (remoteImageView.getScaleX() != f2) {
                remoteImageView.setScaleX(f2);
                remoteImageView.setScaleY(f2);
            }
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f73796k).inflate(R.layout.v_, viewGroup, false);
        C7573i.m23582a((Object) inflate, "convertView");
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f73799a = (RemoteImageView) inflate.findViewById(R.id.bxo);
        viewHolder.f73800b = (TextView) inflate.findViewById(R.id.ayi);
        viewHolder.f73801c = (FrameLayout) inflate.findViewById(R.id.amg);
        viewHolder.f73802d = inflate.findViewById(R.id.d4f);
        return viewHolder;
    }

    /* renamed from: a */
    private final void m91626a(ViewHolder viewHolder, int i) {
        m91625a((View) viewHolder.f73799a);
        m91625a(viewHolder.f73802d);
        Object obj = this.f73793h.get(i);
        C7573i.m23582a(obj, "mMediaTotal[position]");
        MediaModel mediaModel = (MediaModel) obj;
        List<Integer> list = this.f73794i;
        if (list == null) {
            C7573i.m23580a();
        }
        int intValue = ((Number) list.get(i)).intValue();
        m91624a(intValue, viewHolder);
        StringBuilder sb = new StringBuilder("file://");
        sb.append(mediaModel.f88156b);
        String sb2 = sb.toString();
        if (!TextUtils.equals(viewHolder.f73803e, sb2)) {
            viewHolder.f73803e = sb2;
            C23323e.m76525b(viewHolder.f73799a, viewHolder.f73803e, this.f73795j, this.f73795j);
        }
        viewHolder.itemView.setOnClickListener(new C28021d(this, intValue, sb2));
        FrameLayout frameLayout = viewHolder.f73801c;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new C28022e(this, viewHolder, mediaModel));
        }
    }

    /* renamed from: a */
    public final void mo71467a(ViewHolder viewHolder, int i, MediaModel mediaModel) {
        int i2;
        if (!(i < 0 || this.f73787a == null || this.f73794i == null)) {
            List<Integer> list = this.f73794i;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i < i2) {
                List<Integer> list2 = this.f73787a;
                if (list2 == null) {
                    C7573i.m23580a();
                }
                int indexOf = list2.indexOf(Integer.valueOf(i));
                if (indexOf >= 0) {
                    List<Integer> list3 = this.f73794i;
                    if (list3 == null) {
                        C7573i.m23580a();
                    }
                    list3.set(i, Integer.valueOf(-1));
                    viewHolder.mo71469a();
                    View view = viewHolder.f73802d;
                    if (view != null) {
                        view.animate().alpha(0.0f).setDuration(300).withEndAction(new C28019b(view, this, i)).start();
                    }
                    RemoteImageView remoteImageView = viewHolder.f73799a;
                    if (remoteImageView != null) {
                        remoteImageView.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                    }
                    List<String> list4 = this.f73788b;
                    if (list4 != null) {
                        list4.remove(indexOf);
                    }
                    List<Integer> list5 = this.f73787a;
                    if (list5 != null) {
                        list5.remove(Integer.valueOf(i));
                    }
                    List<Integer> list6 = this.f73787a;
                    if (list6 == null) {
                        C7573i.m23580a();
                    }
                    int size = list6.size();
                    while (indexOf < size) {
                        List<Integer> list7 = this.f73787a;
                        if (list7 == null) {
                            C7573i.m23580a();
                        }
                        int intValue = ((Number) list7.get(indexOf)).intValue();
                        if (intValue >= 0) {
                            List<Integer> list8 = this.f73794i;
                            if (list8 == null) {
                                C7573i.m23580a();
                            }
                            if (intValue < list8.size()) {
                                List<Integer> list9 = this.f73794i;
                                if (list9 == null) {
                                    C7573i.m23580a();
                                }
                                list9.set(intValue, Integer.valueOf(indexOf));
                            }
                        }
                        if (size != this.f73792f - 1) {
                            notifyItemChanged(intValue);
                        }
                        indexOf++;
                    }
                    if (size == this.f73792f - 1) {
                        notifyDataSetChanged();
                    }
                    C7562b<? super List<String>, C7581n> bVar = this.f73791e;
                    if (bVar != null) {
                        bVar.invoke(this.f73788b);
                    }
                } else {
                    List<Integer> list10 = this.f73787a;
                    if (list10 == null) {
                        C7573i.m23580a();
                    }
                    if (list10.size() >= this.f73792f) {
                        C10761a.m31403c(this.f73796k, this.f73796k.getString(R.string.a3x, new Object[]{Integer.valueOf(this.f73792f)})).mo25750a();
                    } else if (C28018a.m91631a(mediaModel)) {
                        if (this.f73788b == null) {
                            this.f73788b = new ArrayList();
                        }
                        List<String> list11 = this.f73788b;
                        if (list11 != null) {
                            String str = mediaModel.f88156b;
                            if (str == null) {
                                str = "";
                            }
                            list11.add(str);
                        }
                        List<Integer> list12 = this.f73787a;
                        if (list12 != null) {
                            list12.add(Integer.valueOf(i));
                        }
                        List<Integer> list13 = this.f73787a;
                        if (list13 == null) {
                            C7573i.m23580a();
                        }
                        viewHolder.mo71470a(list13.size() - 1);
                        List<Integer> list14 = this.f73787a;
                        if (list14 == null) {
                            C7573i.m23580a();
                        }
                        int size2 = list14.size();
                        List<Integer> list15 = this.f73794i;
                        if (list15 == null) {
                            C7573i.m23580a();
                        }
                        list15.set(i, Integer.valueOf(size2 - 1));
                        RemoteImageView remoteImageView2 = viewHolder.f73799a;
                        if (remoteImageView2 != null) {
                            remoteImageView2.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new C28020c(this, size2, i)).start();
                        }
                        View view2 = viewHolder.f73802d;
                        if (view2 != null) {
                            view2.setAlpha(0.0f);
                            view2.setVisibility(0);
                            view2.animate().alpha(1.0f).setDuration(300).start();
                        }
                    }
                }
            }
        }
    }

    public ImageChooseAdapter(Context context, int i, int i2, Boolean bool, double d, float f, int i3) {
        C7573i.m23587b(context, "mContext");
        this.f73796k = context;
        this.f73792f = i2;
        this.f73797l = bool;
        this.f73796k.getResources().getDimensionPixelOffset(R.dimen.im);
        this.f73795j = ((C9738o.m28691a(this.f73796k) - ((i - 1) * ((int) C9738o.m28708b(this.f73796k, 1.5f)))) + 0) / i;
    }
}
