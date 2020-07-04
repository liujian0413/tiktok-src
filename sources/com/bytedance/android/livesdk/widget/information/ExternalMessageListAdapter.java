package com.bytedance.android.livesdk.widget.information;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p409n.C8703a;
import com.bytedance.android.livesdk.utils.C9033ac;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.android.livesdk.widget.information.C9261a.C9262a;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class ExternalMessageListAdapter extends C1262a<MessageViewHolder> {

    /* renamed from: b */
    public static final float f25394b = 3.0f;

    /* renamed from: c */
    public static final float f25395c = 0.53f;

    /* renamed from: d */
    public static final float f25396d = 0.47f;

    /* renamed from: e */
    public static final float f25397e = 0.4f;

    /* renamed from: f */
    public static final float f25398f = 0.65f;

    /* renamed from: g */
    public static int f25399g;

    /* renamed from: h */
    public static final C9254a f25400h = new C9254a(null);

    /* renamed from: a */
    public Room f25401a;

    /* renamed from: i */
    private LayoutInflater f25402i;

    /* renamed from: j */
    private List<? extends C9261a> f25403j;

    public static abstract class MessageViewHolder extends C1293v {
        /* renamed from: a */
        public abstract void mo22732a(C9261a aVar, int i);

        public MessageViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$a */
    public static final class C9254a {
        private C9254a() {
        }

        /* renamed from: a */
        public static float m27542a() {
            return ExternalMessageListAdapter.f25395c;
        }

        public /* synthetic */ C9254a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$b */
    interface C9255b {
        /* renamed from: a */
        Room mo22733a();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$c */
    static final class C9256c extends MessageViewHolder {

        /* renamed from: c */
        public static float f25404c;

        /* renamed from: d */
        public static final C9257a f25405d = new C9257a(null);

        /* renamed from: f */
        private static Paint f25406f = new Paint();

        /* renamed from: g */
        private static Paint f25407g = new Paint();

        /* renamed from: a */
        public TextView f25408a;

        /* renamed from: b */
        public C9255b f25409b;

        /* renamed from: e */
        private Spannable f25410e;

        /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$c$a */
        public static final class C9257a {
            private C9257a() {
            }

            public /* synthetic */ C9257a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$c$b */
        static final class C9258b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C9256c f25411a;

            C9258b(C9256c cVar) {
                this.f25411a = cVar;
            }

            public final void run() {
                if (this.f25411a.f25408a != null) {
                    ExternalMessageListAdapter.f25399g = this.f25411a.f25408a.getHeight();
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$c$c */
        public static final class C9259c implements C9459c {

            /* renamed from: a */
            final /* synthetic */ C9256c f25412a;

            /* renamed from: b */
            final /* synthetic */ SparseArray f25413b;

            /* renamed from: c */
            final /* synthetic */ int f25414c;

            /* renamed from: d */
            final /* synthetic */ List f25415d;

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
                if (r4 == null) goto L_0x002b;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo9922a(com.bytedance.android.livesdkapi.host.C9456c.C9457a r4) {
                /*
                    r3 = this;
                    android.util.SparseArray r0 = r3.f25413b
                    int r1 = r3.f25414c
                    r2 = 0
                    r0.put(r1, r2)
                    com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$c r0 = r3.f25412a
                    android.util.SparseArray r1 = r3.f25413b
                    java.util.List r2 = r3.f25415d
                    r0.mo22734a(r1, r2)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.String r1 = "event_name"
                    java.lang.String r2 = "message badges load error"
                    r0.put(r1, r2)
                    java.lang.String r1 = "error_msg"
                    java.lang.Throwable r4 = r4.f25912a
                    if (r4 == 0) goto L_0x002b
                    java.lang.String r4 = r4.getMessage()
                    if (r4 != 0) goto L_0x002d
                L_0x002b:
                    java.lang.String r4 = ""
                L_0x002d:
                    r0.put(r1, r4)
                    com.bytedance.android.livesdk.log.d r4 = com.bytedance.android.livesdk.log.C8444d.m25673b()
                    java.lang.String r1 = "ttlive_msg"
                    r4.mo10001b(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter.C9256c.C9259c.mo9922a(com.bytedance.android.livesdkapi.host.c$a):void");
            }

            /* renamed from: a */
            public final void mo9921a(Bitmap bitmap) {
                if (bitmap == null) {
                    this.f25413b.put(this.f25414c, null);
                    this.f25412a.mo22734a(this.f25413b, this.f25415d);
                    return;
                }
                TextImageModel textImageModel = (TextImageModel) this.f25415d.get(this.f25414c);
                Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                float width = ((float) bitmap.getWidth()) * C9256c.f25404c;
                float height = ((float) bitmap.getHeight()) * C9256c.f25404c;
                if (!TextUtils.isEmpty(textImageModel.f25535a) && textImageModel.f25537c == 1) {
                    String str = textImageModel.f25535a;
                    C7573i.m23582a((Object) str, "textImageModel.content");
                    C7573i.m23582a((Object) copy, "bmpCopy");
                    C9256c.m27545a(str, -1, bitmap, copy);
                } else if (!TextUtils.isEmpty(textImageModel.f25535a) && textImageModel.f25537c == 3) {
                    C8703a.m26017a(this.f25412a.f25408a.getContext(), -1, copy, textImageModel.f25535a);
                }
                if (textImageModel.f25537c == 4) {
                    String str2 = textImageModel.f25535a;
                    C7573i.m23582a((Object) str2, "textImageModel.content");
                    int i = textImageModel.f25536b;
                    C7573i.m23582a((Object) copy, "bmpCopy");
                    C9256c.m27547b(str2, i, bitmap, copy);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f25412a.f25408a.getResources(), copy);
                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                this.f25413b.put(this.f25414c, new C9238b(bitmapDrawable));
                this.f25412a.mo22734a(this.f25413b, this.f25415d);
            }

            C9259c(C9256c cVar, SparseArray sparseArray, int i, List list) {
                this.f25412a = cVar;
                this.f25413b = sparseArray;
                this.f25414c = i;
                this.f25415d = list;
            }
        }

        /* renamed from: a */
        private final void m27544a() {
            FansClubData fansClubData;
            ArrayList arrayList = new ArrayList();
            Room a = this.f25409b.mo22733a();
            if (a != null) {
                User owner = a.getOwner();
                if (owner != null) {
                    FansClubMember fansClub = owner.getFansClub();
                    if (fansClub != null) {
                        if (FansClubData.isValid(fansClub.getData())) {
                            fansClubData = fansClub.getData();
                        } else {
                            fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(1));
                        }
                        if (FansClubData.isValid(fansClubData) && fansClubData != null) {
                            ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                            if (imageModel != null) {
                                TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                                textImageModel.f25535a = fansClubData.clubName;
                                arrayList.add(textImageModel);
                            }
                        }
                    }
                }
            }
            m27546a(arrayList);
        }

        /* renamed from: a */
        private final void m27546a(List<? extends TextImageModel> list) {
            if (!list.isEmpty()) {
                SparseArray sparseArray = new SparseArray();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((TextImageModel) list.get(i)).f25537c == 2) {
                        Bitmap a = C9033ac.m26989a(this.f25408a.getContext(), ((TextImageModel) list.get(i)).f25538d);
                        if (a != null && !a.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f25408a.getResources(), a);
                            bitmapDrawable.setBounds(0, 0, a.getWidth(), a.getHeight());
                            sparseArray.put(i, new C9238b(bitmapDrawable));
                            mo22734a(sparseArray, list);
                        }
                    } else {
                        TTLiveSDKContext.getHostService().mo22371l().mo23192a((ImageModel) list.get(i), (C9459c) new C9259c(this, sparseArray, i, list));
                    }
                }
            }
        }

        public C9256c(View view, C9255b bVar) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(bVar, "mRoomGetter");
            super(view);
            this.f25409b = bVar;
            View findViewById = view.findViewById(R.id.text);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.text)");
            this.f25408a = (TextView) findViewById;
            if (f25404c <= 0.0f) {
                Resources resources = view.getResources();
                C7573i.m23582a((Object) resources, "itemView.resources");
                f25404c = resources.getDisplayMetrics().density / ExternalMessageListAdapter.f25394b;
            }
            f25406f.setColor(-1);
            f25406f.setStyle(Style.FILL_AND_STROKE);
            f25406f.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            f25407g.setStyle(Style.FILL_AND_STROKE);
            f25407g.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        }

        /* renamed from: a */
        public final void mo22734a(SparseArray<ImageSpan> sparseArray, List<? extends TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                spannableStringBuilder.append(this.f25410e);
                this.f25408a.setText(spannableStringBuilder);
            }
        }

        /* renamed from: a */
        public final void mo22732a(C9261a aVar, int i) {
            Spannable spannable;
            if (aVar != null) {
                spannable = aVar.mo22737b();
            } else {
                spannable = null;
            }
            this.f25410e = spannable;
            this.f25408a.setText(this.f25410e);
            this.f25408a.setBackgroundResource(R.drawable.buk);
            this.f25408a.setTextColor(C3358ac.m12521b((int) R.color.amj));
            if (aVar != null && aVar.mo22736a() == C9262a.m27555a()) {
                m27544a();
            }
            this.f25408a.post(new C9258b(this));
        }

        /* renamed from: b */
        public static void m27547b(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f25407g.setTextSize(ExternalMessageListAdapter.f25396d * height);
            f25407g.setColor(i);
            float measureText = f25407g.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f25407g.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) * ExternalMessageListAdapter.f25397e), ((height - (fontMetrics.descent - fontMetrics.ascent)) * ExternalMessageListAdapter.f25398f) + Math.abs(fontMetrics.ascent), f25407g);
        }

        /* renamed from: a */
        public static void m27545a(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f25406f.setTextSize(C9254a.m27542a() * height);
            f25407g.setColor(-1);
            float measureText = f25406f.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f25406f.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) / 2.0f), ((height - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), f25406f);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.information.ExternalMessageListAdapter$d */
    public static final class C9260d implements C9255b {

        /* renamed from: a */
        final /* synthetic */ ExternalMessageListAdapter f25416a;

        /* renamed from: a */
        public final Room mo22733a() {
            return this.f25416a.f25401a;
        }

        C9260d(ExternalMessageListAdapter externalMessageListAdapter) {
            this.f25416a = externalMessageListAdapter;
        }
    }

    public final int getItemCount() {
        List<? extends C9261a> list = this.f25403j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getItemViewType(int i) {
        List<? extends C9261a> list = this.f25403j;
        if (list != null) {
            C9261a aVar = (C9261a) list.get(i);
            if (aVar != null) {
                return aVar.mo22736a();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MessageViewHolder messageViewHolder, int i) {
        C9261a aVar;
        C7573i.m23587b(messageViewHolder, "holder");
        List<? extends C9261a> list = this.f25403j;
        if (list != null) {
            aVar = (C9261a) list.get(i);
        } else {
            aVar = null;
        }
        messageViewHolder.mo22732a(aVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MessageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        LayoutInflater layoutInflater = this.f25402i;
        if (layoutInflater == null) {
            C7573i.m23580a();
        }
        View inflate = layoutInflater.inflate(R.layout.ark, viewGroup, false);
        C7573i.m23582a((Object) inflate, "mLayoutInflater!!.inflat…essage_v2, parent, false)");
        return new C9256c(inflate, new C9260d(this));
    }
}
