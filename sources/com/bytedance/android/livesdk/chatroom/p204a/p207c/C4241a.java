package com.bytedance.android.livesdk.chatroom.p204a.p207c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FraternityInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5358p;
import com.bytedance.android.livesdk.gift.effect.normal.utils.C8057a;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.ugc.live.barrage.p1824a.C46196c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.a */
public final class C4241a {

    /* renamed from: a */
    public final View f12391a;

    /* renamed from: b */
    public C46196c f12392b;

    /* renamed from: c */
    public final ImageView f12393c;

    /* renamed from: d */
    public final ImageView f12394d;

    /* renamed from: e */
    public final ImageView f12395e;

    /* renamed from: f */
    private final ImageView f12396f;

    /* renamed from: g */
    private final TextView f12397g;

    /* renamed from: h */
    private final ImageView f12398h;

    /* renamed from: i */
    private final TextView f12399i;

    /* renamed from: j */
    private final TextView f12400j;

    /* renamed from: k */
    private final ImageView f12401k;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11803a() {
        if (this.f12392b != null) {
            this.f12392b.mo114143a(this.f12391a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11806a(Throwable th) throws Exception {
        this.f12398h.setVisibility(8);
        this.f12399i.setVisibility(8);
        C8444d.m25673b();
        C8444d.m11969a(5, th.getStackTrace());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11807b(Throwable th) throws Exception {
        this.f12396f.setVisibility(8);
        this.f12397g.setVisibility(8);
        C8444d.m25673b();
        C8444d.m11969a(5, th.getStackTrace());
    }

    /* renamed from: a */
    public static Bitmap m14383a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawOval(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11804a(FansClubData fansClubData, Bitmap bitmap) throws Exception {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f12396f.setVisibility(8);
            this.f12397g.setVisibility(8);
            return;
        }
        this.f12396f.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
        this.f12397g.setText(fansClubData.clubName);
        this.f12396f.setVisibility(0);
        this.f12397g.setVisibility(0);
        if (this.f12392b != null) {
            this.f12392b.mo114143a(this.f12391a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11805a(TextImageModel textImageModel, Bitmap bitmap) throws Exception {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f12398h.setVisibility(8);
            this.f12399i.setVisibility(8);
            return;
        }
        this.f12398h.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
        this.f12399i.setText(textImageModel.f25535a);
        this.f12399i.setTextColor(textImageModel.f25536b);
        this.f12398h.setVisibility(0);
        this.f12399i.setVisibility(0);
        if (this.f12392b != null) {
            this.f12392b.mo114143a(this.f12391a);
        }
    }

    public C4241a(View view, C8548cj cjVar, LiveWidget liveWidget) {
        FansClubData fansClubData;
        this.f12391a = view;
        this.f12400j = (TextView) view.findViewById(R.id.dsf);
        this.f12400j.setText(cjVar.f23543b);
        if (C9290a.f25466a && VERSION.SDK_INT >= 17 && !C3519c.m12965a(C3358ac.m12528e())) {
            this.f12400j.setTextDirection(3);
        }
        this.f12393c = (ImageView) view.findViewById(R.id.aum);
        this.f12394d = (ImageView) view.findViewById(R.id.b_5);
        this.f12396f = (ImageView) view.findViewById(R.id.aii);
        this.f12397g = (TextView) view.findViewById(R.id.aij);
        this.f12398h = (ImageView) view.findViewById(R.id.apc);
        this.f12399i = (TextView) view.findViewById(R.id.apd);
        this.f12395e = (ImageView) view.findViewById(R.id.lu);
        TextView textView = (TextView) view.findViewById(R.id.dyh);
        this.f12401k = (ImageView) view.findViewById(R.id.d95);
        TTLiveSDKContext.getHostService().mo22371l().mo23192a(cjVar.f23544c.getAvatarThumb(), (C9459c) new C9459c() {
            /* renamed from: a */
            public final void mo9922a(C9457a aVar) {
            }

            /* renamed from: a */
            public final void mo9921a(Bitmap bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap a = C8057a.m24688a(bitmap);
                    if (a != null && !a.isRecycled()) {
                        C4241a.this.f12393c.setImageBitmap(a);
                        if (C4241a.this.f12392b != null) {
                            C4241a.this.f12392b.mo114143a(C4241a.this.f12391a);
                        }
                    }
                }
            }
        });
        if (cjVar.f23544c.getUserHonor() == null || cjVar.f23544c.getUserHonor().mo8710n() <= 0) {
            this.f12394d.setVisibility(8);
        } else {
            this.f12394d.setVisibility(8);
            TTLiveSDKContext.getHostService().mo22371l().mo23192a(cjVar.f23544c.getUserHonor().mo8708l(), (C9459c) new C9459c() {
                /* renamed from: a */
                public final void mo9922a(C9457a aVar) {
                }

                /* renamed from: a */
                public final void mo9921a(Bitmap bitmap) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        C4241a.this.f12394d.setImageBitmap(C4241a.m14383a(bitmap));
                        C4241a.this.f12394d.setVisibility(0);
                        if (C4241a.this.f12392b != null) {
                            C4241a.this.f12392b.mo114143a(C4241a.this.f12391a);
                        }
                    }
                }
            });
        }
        textView.setText(cjVar.f23544c.getNickName());
        textView.measure(0, 0);
        this.f12400j.measure(0, 0);
        if (this.f12400j.getMeasuredWidth() < textView.getMeasuredWidth()) {
            this.f12400j.setWidth(textView.getMeasuredWidth());
        }
        if (cjVar.f23547f != null) {
            if (!(cjVar.f23547f.f23620a == null || cjVar.f23547f.f23620a.getUrls() == null)) {
                C5358p.m17090a(cjVar.f23547f.f23620a, this.f12400j, C3519c.m12965a(C3358ac.m12528e()), new C4245b(this));
            }
            if (!(cjVar.f23547f.f23621b == null || this.f12395e == null)) {
                TTLiveSDKContext.getHostService().mo22371l().mo23192a(cjVar.f23547f.f23621b, (C9459c) new C9459c() {
                    /* renamed from: a */
                    public final void mo9922a(C9457a aVar) {
                    }

                    /* renamed from: a */
                    public final void mo9921a(Bitmap bitmap) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            C4241a.this.f12395e.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
                            if (C4241a.this.f12392b != null) {
                                C4241a.this.f12392b.mo114143a(C4241a.this.f12391a);
                            }
                        }
                    }
                });
            }
        }
        User user = cjVar.f23544c;
        if (user != null) {
            boolean z = true;
            if (user.getFansClub() != null) {
                if (FansClubData.isValid(user.getFansClub().getData())) {
                    fansClubData = user.getFansClub().getData();
                } else if (user.getFansClub().getPreferData() != null) {
                    fansClubData = (FansClubData) user.getFansClub().getPreferData().get(Integer.valueOf(1));
                } else {
                    fansClubData = null;
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                    if (imageModel != null) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f25535a = fansClubData.clubName;
                        C5343e.m17028a(textImageModel).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4246c<Object>(this, fansClubData), (C7326g<? super Throwable>) new C4247d<Object>(this));
                    }
                } else if (this.f12396f != null) {
                    this.f12396f.setVisibility(8);
                    this.f12397g.setVisibility(8);
                }
            }
            FraternityInfo fraternityInfo = user.getFraternityInfo();
            if (!(this.f12398h == null || this.f12399i == null)) {
                if (fraternityInfo != null && fraternityInfo.isValid()) {
                    ImageModel background = fraternityInfo.getBackground();
                    if (background != null) {
                        TextImageModel textImageModel2 = new TextImageModel(background, 4);
                        textImageModel2.f25535a = fraternityInfo.getName();
                        try {
                            textImageModel2.f25536b = Color.parseColor(fraternityInfo.getFontColor());
                        } catch (IllegalArgumentException e) {
                            C3166a.m11958a("BarrageViewHolder", (Throwable) e);
                        }
                        C5343e.m17028a(textImageModel2).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4248e<Object>(this, textImageModel2), (C7326g<? super Throwable>) new C4249f<Object>(this));
                        z = false;
                    }
                }
                if (z) {
                    this.f12398h.setVisibility(8);
                    this.f12399i.setVisibility(8);
                }
            }
        }
        if (cjVar.f23544c == null || TextUtils.isEmpty(cjVar.f23544c.getSpecialId())) {
            this.f12401k.setVisibility(8);
        } else {
            this.f12401k.setVisibility(0);
        }
        this.f12392b = new C46196c(this.f12391a);
        this.f12392b.f118760j = cjVar.mo21674a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(cjVar.f23544c);
        userProfileEvent.mSource = UserProfileEvent.SOURCE_BARRAGE;
        this.f12392b.f118758h = new C4250g(userProfileEvent);
    }
}
