package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.feed.event.C28327j;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c.C35486a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a */
public abstract class C40769a implements C40722d {

    /* renamed from: a */
    public C35481c f106012a;

    /* renamed from: b */
    public Runnable f106013b;

    /* renamed from: c */
    public InteractStickerStruct f106014c;

    /* renamed from: d */
    public List<? extends NormalTrackTimeStamp> f106015d;

    /* renamed from: e */
    public final int f106016e;

    /* renamed from: f */
    public Context f106017f;

    /* renamed from: g */
    public final View f106018g;

    /* renamed from: h */
    public C41850e f106019h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$a */
    static final class C40771a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40769a f106020a;

        /* renamed from: b */
        final /* synthetic */ float f106021b;

        /* renamed from: c */
        final /* synthetic */ float f106022c;

        C40771a(C40769a aVar, float f, float f2) {
            this.f106020a = aVar;
            this.f106021b = f;
            this.f106022c = f2;
        }

        public final void run() {
            LayoutParams layoutParams;
            if (this.f106020a.f106012a == null) {
                C40769a aVar = this.f106020a;
                Context context = this.f106020a.f106017f;
                if (context != null) {
                    aVar.f106012a = new C35481c((Activity) context, false);
                    C35481c cVar = this.f106020a.f106012a;
                    if (cVar != null) {
                        cVar.f93104l = 300;
                    }
                    C35481c cVar2 = this.f106020a.f106012a;
                    if (cVar2 != null) {
                        cVar2.mo90258a(false);
                    }
                    C35481c cVar3 = this.f106020a.f106012a;
                    if (cVar3 != null) {
                        cVar3.f93098f = true;
                    }
                    C35481c cVar4 = this.f106020a.f106012a;
                    if (cVar4 != null) {
                        cVar4.f93099g = true;
                    }
                    C35481c cVar5 = this.f106020a.f106012a;
                    if (cVar5 != null) {
                        cVar5.mo90254a(this.f106020a.mo101012f());
                    }
                    C40769a aVar2 = this.f106020a;
                    C35481c cVar6 = this.f106020a.f106012a;
                    if (cVar6 == null) {
                        C7573i.m23580a();
                    }
                    aVar2.mo101009a(cVar6);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            C35481c cVar7 = this.f106020a.f106012a;
            if (cVar7 != null) {
                cVar7.mo90274e(this.f106020a.f106017f.getResources().getColor(R.color.v));
            }
            C35481c cVar8 = this.f106020a.f106012a;
            if (cVar8 != null) {
                cVar8.mo90275f();
            }
            if (this.f106020a.f106012a != null) {
                C35481c cVar9 = this.f106020a.f106012a;
                if (cVar9 == null) {
                    C7573i.m23580a();
                }
                if (((float) cVar9.mo90266c()) > ((float) C23482j.m77098b(this.f106020a.f106017f)) - C9738o.m28708b(this.f106020a.f106017f, 32.0f)) {
                    C35481c cVar10 = this.f106020a.f106012a;
                    if (cVar10 == null) {
                        C7573i.m23580a();
                    }
                    cVar10.mo90262b((int) (((float) C23482j.m77098b(this.f106020a.f106017f)) - C9738o.m28708b(this.f106020a.f106017f, 32.0f)));
                    C35481c cVar11 = this.f106020a.f106012a;
                    if (cVar11 == null) {
                        C7573i.m23580a();
                    }
                    View contentView = cVar11.getContentView();
                    if (contentView != null) {
                        View childAt = ((ViewGroup) contentView).getChildAt(0);
                        if (childAt != null) {
                            layoutParams = childAt.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.leftMargin = (int) C9738o.m28708b(this.f106020a.f106017f, 12.0f);
                        }
                        if (layoutParams2 != null) {
                            layoutParams2.rightMargin = (int) C9738o.m28708b(this.f106020a.f106017f, 12.0f);
                        }
                        C35481c cVar12 = this.f106020a.f106012a;
                        if (cVar12 == null) {
                            C7573i.m23580a();
                        }
                        View contentView2 = cVar12.getContentView();
                        if (contentView2 != null) {
                            View childAt2 = ((ViewGroup) contentView2).getChildAt(0);
                            if (childAt2 != null) {
                                childAt2.setLayoutParams(layoutParams2);
                            }
                            C35481c cVar13 = this.f106020a.f106012a;
                            if (cVar13 != null) {
                                cVar13.mo90275f();
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            }
            final int[] iArr = new int[2];
            this.f106020a.f106018g.getLocationOnScreen(iArr);
            C35481c cVar14 = this.f106020a.f106012a;
            if (cVar14 != null) {
                cVar14.f93106n = new C23321d<Point>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40771a f106023a;

                    {
                        this.f106023a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public Point mo60607a() {
                        return new Point(((int) this.f106023a.f106021b) + iArr[0], ((int) this.f106023a.f106022c) + iArr[1]);
                    }
                };
            }
            C35481c cVar15 = this.f106020a.f106012a;
            if (cVar15 != null) {
                cVar15.f93107o = new C35486a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40771a f106025a;

                    {
                        this.f106025a = r1;
                    }

                    /* renamed from: a */
                    public final void mo62392a() {
                        C35481c cVar = this.f106025a.f106020a.f106012a;
                        if (cVar != null) {
                            cVar.dismiss();
                        }
                        this.f106025a.f106020a.mo101013g();
                    }
                };
            }
            C35481c cVar16 = this.f106020a.f106012a;
            if (cVar16 != null) {
                cVar16.setOnDismissListener(new OnDismissListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40771a f106026a;

                    {
                        this.f106026a = r1;
                    }

                    public final void onDismiss() {
                        C41850e eVar = this.f106026a.f106020a.f106019h;
                        if (eVar != null) {
                            C41841a aVar = eVar.f108859l;
                            if (aVar != null) {
                                aVar.mo71723a(this.f106026a.f106020a.mo100902c(), false);
                            }
                        }
                    }
                });
            }
            C35481c cVar17 = this.f106020a.f106012a;
            if (cVar17 != null) {
                cVar17.f93102j = -1;
            }
            C35481c cVar18 = this.f106020a.f106012a;
            if (cVar18 != null) {
                cVar18.mo90268c(this.f106020a.f106018g);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$b */
    static final class C40775b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40769a f106027a;

        C40775b(C40769a aVar) {
            this.f106027a = aVar;
        }

        public final void run() {
            C6726a.m20844b(this.f106027a.f106013b);
        }
    }

    /* renamed from: a */
    public void mo100897a() {
    }

    /* renamed from: a */
    public void mo101009a(C35481c cVar) {
        C7573i.m23587b(cVar, "popWindow");
    }

    /* renamed from: b */
    public void mo100898b() {
    }

    /* renamed from: d */
    public final InteractStickerStruct mo100903d() {
        return this.f106014c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo101011e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract View mo101012f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo101013g();

    /* renamed from: a */
    public void mo100901a(InteractStickerStruct interactStickerStruct) {
        this.f106014c = interactStickerStruct;
    }

    /* renamed from: a */
    public void mo100893a(C41850e eVar) {
        C7573i.m23587b(eVar, "interactStickerParams");
        this.f106019h = eVar;
    }

    /* renamed from: b */
    public void mo100899b(int i) {
        if (this.f106013b != null) {
            C6726a.m20845c(this.f106013b);
            this.f106013b = null;
        }
        C35481c cVar = this.f106012a;
        if (cVar != null) {
            cVar.mo90269d();
        }
        this.f106012a = null;
    }

    /* renamed from: c */
    public final void mo100900c(int i) {
        if (this.f106013b != null) {
            C6726a.m20845c(this.f106013b);
            this.f106013b = null;
        }
        if (this.f106012a != null) {
            C35481c cVar = this.f106012a;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f106012a = null;
        }
        C41850e eVar = this.f106019h;
        if (eVar != null) {
            C41841a aVar = eVar.f108859l;
            if (aVar != null) {
                aVar.mo71723a(mo100902c(), false);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo101010a(float f, float f2) {
        C42961az.m136380a(new C28327j(mo100902c()));
        C35481c cVar = this.f106012a;
        if (cVar == null || !cVar.isShowing()) {
            mo101011e();
            this.f106013b = new C40771a(this, f, f2);
            this.f106018g.post(new C40775b(this));
            return true;
        }
        C42961az.m136380a(new C28327j());
        return false;
    }

    public C40769a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C41850e eVar) {
        String str;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "contentView");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        this.f106016e = i;
        this.f106017f = context;
        this.f106018g = view;
        this.f106019h = eVar;
        this.f106014c = interactStickerStruct;
        try {
            C6600e a = C10944e.m32113a();
            InteractStickerStruct interactStickerStruct2 = this.f106014c;
            if (interactStickerStruct2 != null) {
                str = interactStickerStruct2.getTrackList();
            } else {
                str = null;
            }
            this.f106015d = (List) a.mo15975a(str, new C6597a<List<? extends NormalTrackTimeStamp>>() {
            }.type);
        } catch (JsonSyntaxException unused) {
        }
    }
}
