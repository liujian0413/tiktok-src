package com.bytedance.android.livesdk.chatroom.p220ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.ImageModel.Content;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FraternityInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p212e.C4340a;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.chatroom.p212e.C4347d;
import com.bytedance.android.livesdk.chatroom.p212e.C4348e;
import com.bytedance.android.livesdk.chatroom.p212e.C4356k;
import com.bytedance.android.livesdk.chatroom.p212e.C4358l;
import com.bytedance.android.livesdk.chatroom.p212e.C4363p;
import com.bytedance.android.livesdk.chatroom.p212e.C4370w;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5358p;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.p409n.C8703a;
import com.bytedance.android.livesdk.utils.C9033ac;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.android.livesdk.widget.NoMoreSpaceTextView;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.datasource.C13346c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter */
public class MessageListAdapter extends C1262a<MessageViewHolder> {

    /* renamed from: a */
    public LayoutInflater f15108a;

    /* renamed from: b */
    public List<C4343b> f15109b;

    /* renamed from: c */
    public Room f15110c;

    /* renamed from: d */
    private boolean f15111d = true;

    /* renamed from: e */
    private OnClickListener f15112e = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() instanceof C4340a) {
                ((C4340a) view.getTag()).mo12061a(view.getContext(), MessageListAdapter.this.f15110c);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter$MessageViewHolder */
    public static abstract class MessageViewHolder extends C1293v {
        /* renamed from: a */
        public abstract void mo13386a(C4343b<?> bVar, int i);

        MessageViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter$a */
    static class C5151a extends MessageViewHolder {

        /* renamed from: a */
        private ImageView f15114a;

        /* renamed from: b */
        private ImageView f15115b;

        /* renamed from: c */
        private TextView f15116c;

        /* renamed from: d */
        private View f15117d;

        /* renamed from: e */
        private OnClickListener f15118e;

        C5151a(View view, OnClickListener onClickListener) {
            super(view);
            this.f15114a = (ImageView) view.findViewById(R.id.ax9);
            this.f15115b = (ImageView) view.findViewById(R.id.ct_);
            this.f15116c = (TextView) view.findViewById(R.id.a1q);
            this.f15117d = view.findViewById(R.id.c7w);
            this.f15118e = onClickListener;
        }

        /* renamed from: a */
        public final void mo13386a(C4343b<?> bVar, int i) {
            if (bVar instanceof C4340a) {
                C4340a aVar = (C4340a) bVar;
                if (aVar.mo12060a() != null) {
                    C5343e.m17032a(this.f15114a, aVar.mo12060a(), this.f15114a.getWidth(), this.f15114a.getHeight());
                } else if (aVar.mo12062b() > 0) {
                    this.f15114a.setImageResource(aVar.mo12062b());
                } else {
                    this.f15114a.setBackgroundResource(R.drawable.c9q);
                }
                if (aVar.mo12063c() != null) {
                    this.f15115b.setBackground(null);
                    C5343e.m17030a(this.f15115b, aVar.mo12063c());
                }
                if (!aVar.mo12064d()) {
                    this.f15115b.setVisibility(8);
                }
                if (!TextUtils.isEmpty(aVar.mo12075n())) {
                    this.f15116c.setText(aVar.mo12075n());
                } else {
                    this.f15116c.setText("");
                }
                if (aVar.mo12068h() != null) {
                    C5358p.m17090a(aVar.mo12068h(), this.itemView, C3519c.m12965a(C3358ac.m12528e()), null);
                } else if (!TextUtils.isEmpty(aVar.mo12067g())) {
                    try {
                        ((GradientDrawable) this.f15117d.getBackground()).setColor(Color.parseColor(aVar.mo12067g()));
                    } catch (Exception unused) {
                    }
                }
                if (aVar.mo12064d()) {
                    this.itemView.setTag(aVar);
                    this.itemView.setOnClickListener(this.f15118e);
                    return;
                }
                this.itemView.setOnClickListener(null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter$b */
    interface C5152b {
        /* renamed from: a */
        Room mo13387a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter$c */
    static class C5153c extends MessageViewHolder {

        /* renamed from: d */
        public static float f15119d;

        /* renamed from: f */
        private static Paint f15120f;

        /* renamed from: g */
        private static Paint f15121g;

        /* renamed from: a */
        TextView f15122a;

        /* renamed from: b */
        View f15123b;

        /* renamed from: c */
        C5152b f15124c;

        /* renamed from: e */
        private final OnLongClickListener f15125e;

        /* renamed from: h */
        private Spannable f15126h;

        /* renamed from: i */
        private Spannable f15127i;

        /* renamed from: a */
        public final void mo13386a(C4343b<?> bVar, int i) {
            this.f15122a.setMovementMethod(C5257cs.m16901a());
            this.f15122a.setOnLongClickListener(this.f15125e);
            this.f15122a.setTag(R.id.dp0, bVar);
            this.f15126h = bVar.mo12075n();
            this.f15127i = null;
            if (C9290a.f25466a && C3519c.m12965a(C3358ac.m12528e()) && VERSION.SDK_INT >= 17) {
                this.f15122a.setTextDirection(2);
            }
            if (this.f15126h != null) {
                this.f15122a.setText(this.f15126h);
                if (this.f15122a instanceof NoMoreSpaceTextView) {
                    ((NoMoreSpaceTextView) this.f15122a).setAlwaysInvalidate(false);
                }
                if (bVar instanceof C4348e) {
                    C4348e eVar = (C4348e) bVar;
                    if (eVar.mo12060a()) {
                        eVar.mo12080a(this.f15122a, this.f15124c.mo13387a(), new C5280dm(this));
                    }
                }
                if (bVar instanceof C4358l) {
                    ((C4358l) bVar).mo12083a(new C5281dn(this));
                } else if (bVar instanceof C4356k) {
                    ((C4356k) bVar).mo12082a(new C5282do(this));
                }
                m16696a(this.f15122a, this.f15126h, bVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13389a(Spannable spannable) {
            if (spannable != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15122a.getText());
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append(spannable);
                this.f15122a.setText(spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f15126h);
                spannableStringBuilder2.append(" ");
                this.f15126h = spannableStringBuilder2.append(spannable);
            }
        }

        /* renamed from: a */
        public final void mo13390a(SparseArray<ImageSpan> sparseArray, List<ImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < sparseArray.size(); i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                this.f15127i = spannableStringBuilder.append(this.f15126h);
                this.f15122a.setText(this.f15127i);
            }
        }

        /* renamed from: a */
        static final /* synthetic */ boolean m16700a(View view) {
            Object tag = view.getTag(R.id.dp0);
            if (tag instanceof C4343b) {
                return ((C4343b) tag).mo12071a(view.getContext());
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo13388a(Bitmap bitmap) {
            if (bitmap != null) {
                int lastIndexOf = this.f15126h.toString().lastIndexOf(" . ");
                if (lastIndexOf != -1) {
                    C4374z.m14748a(this.f15126h, bitmap, lastIndexOf + 1, lastIndexOf + 2);
                }
                if (this.f15127i != null) {
                    int lastIndexOf2 = this.f15127i.toString().lastIndexOf(" . ");
                    if (lastIndexOf2 != -1) {
                        C4374z.m14748a(this.f15127i, bitmap, lastIndexOf2 + 1, lastIndexOf2 + 2);
                    }
                    this.f15122a.setText(this.f15127i);
                    return;
                }
                this.f15122a.setText(this.f15126h);
            }
        }

        /* renamed from: c */
        private static boolean m16705c(C4343b<?> bVar) {
            bVar.mo12065e();
            if ((bVar instanceof C4347d) && ((C8680m) bVar.f12647a).f23628e != null && !C6311g.m19573a(((C8680m) bVar.f12647a).f23628e.getUrls())) {
                return true;
            }
            if ((bVar instanceof C4363p) && ((C8514bj) bVar.f12647a).f23402n != null && !C6311g.m19573a(((C8514bj) bVar.f12647a).f23402n.getUrls())) {
                return true;
            }
            if (!(bVar instanceof C4370w) || ((C8548cj) bVar.f12647a).f23548g == null || C6311g.m19573a(((C8548cj) bVar.f12647a).f23548g.getUrls())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m16697a(C4343b<?> bVar) {
            if (bVar != null && bVar.mo12065e() != null) {
                List badgeImageList = bVar.mo12065e().getBadgeImageList();
                if (badgeImageList != null && !badgeImageList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i = 0; i < badgeImageList.size(); i++) {
                        ImageModel imageModel = (ImageModel) badgeImageList.get(i);
                        if (imageModel != null) {
                            if (imageModel.isAnimated()) {
                                try {
                                    Drawable b = C5343e.m17042b(imageModel);
                                    if (b != null) {
                                        m16695a(b, i, sparseArray, badgeImageList);
                                    } else {
                                        sparseArray.put(i, null);
                                        mo13390a(sparseArray, badgeImageList);
                                    }
                                } catch (Exception e) {
                                    sparseArray.put(i, null);
                                    mo13390a(sparseArray, badgeImageList);
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("event_name", "message gif badge load error");
                                    hashMap.put("error_msg", e.getMessage());
                                    C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
                                }
                            } else {
                                C9456c l = TTLiveSDKContext.getHostService().mo22371l();
                                final SparseArray sparseArray2 = sparseArray;
                                final int i2 = i;
                                final List list = badgeImageList;
                                final ImageModel imageModel2 = imageModel;
                                C51552 r0 = new C9459c() {
                                    /* renamed from: a */
                                    public final void mo9922a(C9457a aVar) {
                                        String str;
                                        sparseArray2.put(i2, null);
                                        C5153c.this.mo13390a(sparseArray2, list);
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("event_name", "message badges load error");
                                        String str2 = "error_msg";
                                        if (aVar.f25912a != null) {
                                            str = aVar.f25912a.getMessage();
                                        } else {
                                            str = "";
                                        }
                                        hashMap.put(str2, str);
                                        C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
                                    }

                                    /* renamed from: a */
                                    public final void mo9921a(Bitmap bitmap) {
                                        if (bitmap == null) {
                                            sparseArray2.put(i2, null);
                                            C5153c.this.mo13390a(sparseArray2, list);
                                            return;
                                        }
                                        Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                        float width = ((float) bitmap.getWidth()) * C5153c.f15119d;
                                        float height = ((float) bitmap.getHeight()) * C5153c.f15119d;
                                        try {
                                            if (imageModel2.getImageType() == 6) {
                                                if (imageModel2.getImageContent() != null && imageModel2.getImageContent().f7650c > 0 && !TextUtils.isEmpty(imageModel2.getImageContent().f7649b)) {
                                                    C8703a.m26017a(C5153c.this.f15122a.getContext(), Color.parseColor(imageModel2.getImageContent().f7649b), copy, String.valueOf(imageModel2.getImageContent().f7650c));
                                                }
                                            } else if (imageModel2.getImageType() == 5 && Content.m9954a(imageModel2.getImageContent())) {
                                                C5153c.m16704b(imageModel2.getImageContent().f7648a, Color.parseColor(imageModel2.getImageContent().f7649b), bitmap, copy);
                                            } else if (imageModel2.getImageType() == 7 && Content.m9954a(imageModel2.getImageContent())) {
                                                C5153c.m16698a(imageModel2.getImageContent().f7648a, Color.parseColor(imageModel2.getImageContent().f7649b), bitmap, copy);
                                            }
                                            BitmapDrawable bitmapDrawable = new BitmapDrawable(C5153c.this.f15122a.getResources(), copy);
                                            bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                                            sparseArray2.put(i2, new C9238b(bitmapDrawable));
                                            C5153c.this.mo13390a(sparseArray2, list);
                                        } catch (Exception e) {
                                            sparseArray2.put(i2, null);
                                            C5153c.this.mo13390a(sparseArray2, list);
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("event_name", "add text to badge error!");
                                            hashMap.put("error_msg", e.getMessage());
                                            C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
                                        }
                                    }
                                };
                                l.mo23192a(imageModel, (C9459c) r0);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        private void m16703b(C4343b<?> bVar) {
            boolean z;
            FansClubData fansClubData;
            if (bVar != null) {
                ArrayList arrayList = new ArrayList();
                if (bVar.mo12065e() != null && !TextUtils.isEmpty(bVar.mo12065e().getSpecialId())) {
                    arrayList.add(new TextImageModel(C9033ac.ci6));
                }
                if (!C6307b.m19566a((Collection<T>) bVar.mo12074k())) {
                    for (Integer intValue : bVar.mo12074k()) {
                        arrayList.add(new TextImageModel(intValue.intValue()));
                    }
                }
                if (bVar.mo12073j() != null) {
                    z = false;
                    for (ImageModel textImageModel : bVar.mo12073j()) {
                        arrayList.add(new TextImageModel(textImageModel, 0));
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    User e = bVar.mo12065e();
                    if (e != null) {
                        FraternityInfo fraternityInfo = e.getFraternityInfo();
                        if (fraternityInfo != null && fraternityInfo.isValid()) {
                            TextImageModel textImageModel2 = new TextImageModel(fraternityInfo.getBackground(), 4);
                            textImageModel2.f25535a = fraternityInfo.getName();
                            try {
                                textImageModel2.f25536b = Color.parseColor(fraternityInfo.getFontColor());
                            } catch (Exception e2) {
                                textImageModel2.f25536b = -16777216;
                                C8444d.m25673b();
                                C8444d.m11969a(5, e2.getStackTrace());
                            }
                            arrayList.add(textImageModel2);
                        }
                    }
                }
                if (bVar.mo12072i() != null && bVar.mo12072i().getUrls() != null && bVar.mo12072i().getUrls().size() > 0 && !TextUtils.isEmpty((CharSequence) bVar.mo12072i().getUrls().get(0))) {
                    arrayList.add(new TextImageModel(bVar.mo12072i(), 0));
                }
                if (!(!m16701a((C8538c) bVar.f12647a) || bVar.mo12065e() == null || bVar.mo12065e().getFansClub() == null)) {
                    if (FansClubData.isValid(bVar.mo12065e().getFansClub().getData())) {
                        fansClubData = bVar.mo12065e().getFansClub().getData();
                    } else if (bVar.mo12065e().getFansClub().getPreferData() != null) {
                        fansClubData = (FansClubData) bVar.mo12065e().getFansClub().getPreferData().get(Integer.valueOf(1));
                    } else {
                        fansClubData = null;
                    }
                    if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                        ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                        if (imageModel != null) {
                            TextImageModel textImageModel3 = new TextImageModel(imageModel, 1);
                            textImageModel3.f25535a = fansClubData.clubName;
                            arrayList.add(textImageModel3);
                        }
                    }
                }
                m16699a((List<TextImageModel>) arrayList);
            }
        }

        /* renamed from: a */
        private void m16699a(final List<TextImageModel> list) {
            if (!list.isEmpty()) {
                final SparseArray sparseArray = new SparseArray();
                for (final int i = 0; i < list.size(); i++) {
                    if (((TextImageModel) list.get(i)).f25537c == 2) {
                        Bitmap a = C9033ac.m26989a(this.f15122a.getContext(), ((TextImageModel) list.get(i)).f25538d);
                        if (a != null && !a.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f15122a.getResources(), a);
                            bitmapDrawable.setBounds(0, 0, a.getWidth(), a.getHeight());
                            sparseArray.put(i, new C9238b(bitmapDrawable));
                            mo13391b(sparseArray, list);
                        }
                    } else {
                        TTLiveSDKContext.getHostService().mo22371l().mo23192a((ImageModel) list.get(i), (C9459c) new C9459c() {
                            /* renamed from: a */
                            public final void mo9922a(C9457a aVar) {
                                String str;
                                sparseArray.put(i, null);
                                C5153c.this.mo13391b(sparseArray, list);
                                HashMap hashMap = new HashMap();
                                hashMap.put("event_name", "message badges load error");
                                String str2 = "error_msg";
                                if (aVar.f25912a != null) {
                                    str = aVar.f25912a.getMessage();
                                } else {
                                    str = "";
                                }
                                hashMap.put(str2, str);
                                C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
                            }

                            /* renamed from: a */
                            public final void mo9921a(Bitmap bitmap) {
                                if (bitmap == null || bitmap.isRecycled()) {
                                    sparseArray.put(i, null);
                                    C5153c.this.mo13391b(sparseArray, list);
                                    return;
                                }
                                TextImageModel textImageModel = (TextImageModel) list.get(i);
                                Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                float width = ((float) bitmap.getWidth()) * C5153c.f15119d;
                                float height = ((float) bitmap.getHeight()) * C5153c.f15119d;
                                if (!TextUtils.isEmpty(textImageModel.f25535a) && textImageModel.f25537c == 1) {
                                    C5153c.m16698a(textImageModel.f25535a, -1, bitmap, copy);
                                } else if (!TextUtils.isEmpty(textImageModel.f25535a) && textImageModel.f25537c == 3) {
                                    C8703a.m26017a(C5153c.this.f15122a.getContext(), -1, copy, textImageModel.f25535a);
                                }
                                if (textImageModel.f25537c == 4) {
                                    C5153c.m16704b(textImageModel.f25535a, textImageModel.f25536b, bitmap, copy);
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(C5153c.this.f15122a.getResources(), copy);
                                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                                sparseArray.put(i, new C9238b(bitmapDrawable));
                                C5153c.this.mo13391b(sparseArray, list);
                            }
                        });
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m16701a(C8538c cVar) {
            if (cVar == null || (this.f15124c.mo13387a() != null && this.f15124c.mo13387a().getOrientation() == 2)) {
                return false;
            }
            if (cVar instanceof C8514bj) {
                long a = ((C8514bj) cVar).mo21658a();
                if (5 == a || 6 == a || 3 == a || 10 == a || 9 == a || 4 == a || 7 == a || 11 == a) {
                    return false;
                }
            }
            return true;
        }

        C5153c(View view, C5152b bVar) {
            super(view);
            this.f15122a = (TextView) view.findViewById(R.id.text);
            this.f15123b = view.findViewById(R.id.bgc);
            this.f15124c = bVar;
            if (f15119d <= 0.0f) {
                f15119d = view.getResources().getDisplayMetrics().density / 3.0f;
            }
            this.f15122a.setMovementMethod(C5257cs.m16901a());
            this.f15125e = C5279dl.f15443a;
            if (f15120f == null) {
                Paint paint = new Paint();
                f15120f = paint;
                paint.setColor(-1);
                f15120f.setStyle(Style.FILL_AND_STROKE);
                f15120f.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            }
            if (f15121g == null) {
                Paint paint2 = new Paint();
                f15121g = paint2;
                paint2.setStyle(Style.FILL_AND_STROKE);
                f15121g.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            }
        }

        /* renamed from: b */
        public final void mo13391b(SparseArray<ImageSpan> sparseArray, List<TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < sparseArray.size(); i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                this.f15127i = spannableStringBuilder.append(this.f15126h);
                this.f15122a.setText(this.f15127i);
            }
        }

        /* renamed from: a */
        private void m16696a(final TextView textView, Spannable spannable, C4343b<?> bVar) {
            ImageModel imageModel;
            textView.setBackgroundResource(R.drawable.buk);
            if (m16705c(bVar)) {
                if (bVar instanceof C4347d) {
                    imageModel = ((C8680m) bVar.f12647a).f23628e;
                } else if (bVar instanceof C4370w) {
                    imageModel = ((C8548cj) bVar.f12647a).f23548g;
                } else if (bVar instanceof C4363p) {
                    imageModel = ((C8514bj) bVar.f12647a).f23402n;
                } else {
                    imageModel = null;
                }
                if (imageModel != null) {
                    final long messageId = bVar.f12647a.getMessageId();
                    C5358p.m17090a(imageModel, textView, C3519c.m12965a(C3358ac.m12528e()), new Runnable() {
                        public final void run() {
                            Object tag = textView.getTag(R.id.dp0);
                            if (tag instanceof C4343b) {
                                C4343b bVar = (C4343b) tag;
                                if (bVar.f12647a != null) {
                                    if (messageId != bVar.f12647a.getMessageId()) {
                                        textView.setBackgroundResource(R.drawable.buk);
                                    }
                                }
                            }
                        }
                    });
                }
            } else if (!TextUtils.isEmpty(bVar.mo12067g())) {
                textView.setBackgroundResource(R.drawable.buk);
                try {
                    ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor(bVar.mo12067g()));
                } catch (Exception unused) {
                }
            }
            List<C13346c> list = (List) textView.getTag(R.id.dp2);
            if (list != null) {
                for (C13346c cVar : list) {
                    if (cVar != null && !cVar.mo32635a()) {
                        cVar.mo32644g();
                    }
                }
            }
            textView.setTag(R.id.dp2, null);
            if (((Boolean) LiveSettingKeys.LIVE_COMMENT_MESSAGE_BADGE_V2_ENABLE.mo10240a()).booleanValue()) {
                m16697a(bVar);
            } else {
                m16703b(bVar);
            }
        }

        /* renamed from: a */
        private void m16695a(Drawable drawable, int i, SparseArray<ImageSpan> sparseArray, List<ImageModel> list) {
            if (this.f15122a instanceof NoMoreSpaceTextView) {
                ((NoMoreSpaceTextView) this.f15122a).setAlwaysInvalidate(true);
            }
            drawable.setBounds(0, 0, (int) (((float) this.f15122a.getLineHeight()) * ((((float) drawable.getIntrinsicWidth()) * 1.0f) / ((float) drawable.getIntrinsicHeight()))), this.f15122a.getLineHeight());
            sparseArray.put(i, new C9238b(drawable));
            mo13390a(sparseArray, list);
        }

        /* renamed from: a */
        public static void m16698a(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f15120f.setTextSize(0.53f * height);
            f15120f.setColor(i);
            float measureText = f15120f.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f15120f.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) / 2.0f), ((height - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), f15120f);
        }

        /* renamed from: b */
        public static void m16704b(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f15121g.setTextSize(0.47f * height);
            f15121g.setColor(i);
            float measureText = f15121g.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f15121g.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) * 0.4f), ((height - (fontMetrics.descent - fontMetrics.ascent)) * 0.65f) + Math.abs(fontMetrics.ascent), f15121g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Room mo13384a() {
        return this.f15110c;
    }

    public int getItemCount() {
        if (this.f15109b == null) {
            return 0;
        }
        return this.f15109b.size();
    }

    public int getItemViewType(int i) {
        return ((C4343b) this.f15109b.get(i)).f12648b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MessageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C5153c(this.f15108a.inflate(R.layout.ark, viewGroup, false), new C5278dk(this));
            case 1:
                return new C5151a(this.f15108a.inflate(R.layout.ava, viewGroup, false), this.f15112e);
            default:
                throw new IllegalArgumentException("unknown message view type");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MessageViewHolder messageViewHolder, int i) {
        C4343b bVar = (C4343b) this.f15109b.get(i);
        messageViewHolder.mo13386a(bVar, i);
        if (this.f15111d) {
            this.f15111d = false;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "ON_FIRST_MSG_SHOW");
            hashMap.put("msg_id", Long.valueOf(bVar.f12647a.getMessageId()));
            hashMap.put("method", bVar.f12647a.getMessageType().getWsMethod());
            C8444d.m25673b().mo10001b("ttlive_msg", (Map<String, ?>) hashMap);
        }
    }
}
