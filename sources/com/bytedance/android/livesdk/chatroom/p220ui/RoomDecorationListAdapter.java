package com.bytedance.android.livesdk.chatroom.p220ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p029v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C4883ap;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter */
public class RoomDecorationListAdapter extends C1262a<C5161a<C9379p>> {

    /* renamed from: a */
    public C5162b f15162a;

    /* renamed from: b */
    private List<C9379p> f15163b = new ArrayList();

    /* renamed from: c */
    private int f15164c = -1;

    /* renamed from: d */
    private int f15165d = -1;

    /* renamed from: e */
    private OnClickListener f15166e = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && RoomDecorationListAdapter.this.f15162a != null) {
                C9379p pVar = (C9379p) view.getTag();
                if (pVar.f25753h != DecorationWrapperWidget.m17241f() && pVar.f25753h != DecorationWrapperWidget.m17238d()) {
                    RoomDecorationListAdapter.this.f15162a.mo13409a(pVar);
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$a */
    static abstract class C5161a<T> extends C1293v {
        /* renamed from: a */
        public abstract void mo13408a(T t);

        C5161a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$b */
    interface C5162b {
        /* renamed from: a */
        void mo13409a(C9379p pVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$c */
    static class C5163c extends C5161a<C9379p> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo13408a(Object obj) {
        }

        C5163c(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$d */
    static class C5164d extends C5161a<C9379p> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo13408a(Object obj) {
        }

        C5164d(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$e */
    static class C5165e extends C5161a<C9379p> {

        /* renamed from: a */
        ImageView f15168a;

        /* renamed from: b */
        OnClickListener f15169b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo13408a(C9379p pVar) {
            boolean z;
            float f;
            if (pVar != null) {
                this.itemView.setTag(pVar);
                if (!(pVar.f25746a == null || pVar.f25746a.getUrls() == null || pVar.f25746a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().mo22371l().mo23192a(pVar.f25746a, (C9459c) new C9459c() {
                        /* renamed from: a */
                        public final void mo9922a(C9457a aVar) {
                        }

                        /* renamed from: a */
                        public final void mo9921a(Bitmap bitmap) {
                            if (bitmap != null) {
                                C5165e.this.f15168a.setImageBitmap(bitmap.copy(Config.ARGB_8888, false));
                                C5165e.this.itemView.setOnClickListener(C5165e.this.f15169b);
                            }
                        }
                    });
                }
                if (pVar.f25753h == DecorationWrapperWidget.m17238d()) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f15168a;
                if (z) {
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }
        }

        C5165e(View view, OnClickListener onClickListener) {
            super(view);
            this.f15168a = (ImageView) view.findViewById(R.id.a6p);
            this.f15169b = onClickListener;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter$f */
    static class C5167f extends C5161a<C9379p> {

        /* renamed from: a */
        ImageView f15171a;

        /* renamed from: b */
        OnClickListener f15172b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo13408a(C9379p pVar) {
            boolean z;
            float f;
            if (pVar != null) {
                this.itemView.setTag(pVar);
                if (!(pVar.f25746a == null || pVar.f25746a.getUrls() == null || pVar.f25746a.getUrls().size() <= 0)) {
                    TTLiveSDKContext.getHostService().mo22371l().mo23192a(pVar.f25746a, (C9459c) new C9459c() {
                        /* renamed from: a */
                        public final void mo9922a(C9457a aVar) {
                        }

                        /* renamed from: a */
                        public final void mo9921a(Bitmap bitmap) {
                            if (bitmap != null) {
                                C5167f.this.f15171a.setImageBitmap(bitmap.copy(Config.ARGB_8888, false));
                                C5167f.this.itemView.setOnClickListener(C5167f.this.f15172b);
                            }
                        }
                    });
                }
                if (pVar.f25753h == DecorationWrapperWidget.m17241f()) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f15171a;
                if (z) {
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }
        }

        C5167f(View view, OnClickListener onClickListener) {
            super(view);
            this.f15171a = (ImageView) view.findViewById(R.id.a6o);
            this.f15172b = onClickListener;
        }
    }

    public int getItemCount() {
        return this.f15163b.size();
    }

    /* renamed from: a */
    public final void mo13406a(C4883ap apVar) {
        this.f15163b.clear();
        m16742b(apVar);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        if (i == this.f15164c) {
            return 1;
        }
        if (i > this.f15164c && i < this.f15165d) {
            return 3;
        }
        if (i == this.f15165d) {
            return 2;
        }
        return 4;
    }

    /* renamed from: b */
    private void m16742b(C4883ap apVar) {
        if (apVar != null) {
            if (apVar.f13992b != null && apVar.f13992b.size() > 0) {
                this.f15163b.add(null);
                this.f15163b.addAll(apVar.f13992b);
                this.f15164c = (this.f15163b.size() - apVar.f13992b.size()) - 1;
            }
            if (apVar.f13991a != null && apVar.f13991a.size() > 0) {
                this.f15163b.add(null);
                this.f15163b.addAll(apVar.f13991a);
                this.f15165d = (this.f15163b.size() - apVar.f13991a.size()) - 1;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5161a<C9379p> aVar, int i) {
        aVar.mo13408a(this.f15163b.get(i));
    }

    public RoomDecorationListAdapter(C4883ap apVar, C5162b bVar) {
        m16742b(apVar);
        this.f15162a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5161a<C9379p> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        switch (i) {
            case 1:
                return new C5164d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ar7, viewGroup, false));
            case 2:
                return new C5163c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ar6, viewGroup, false));
            case 3:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amh, viewGroup, false);
                inflate.setLayoutParams(new LayoutParams(-1, -2));
                return new C5165e(inflate, this.f15166e);
            case 4:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amf, viewGroup, false);
                if (C3358ac.m12529f()) {
                    i2 = C3358ac.m12523c();
                } else {
                    i2 = C3358ac.m12510a(376.0f);
                }
                int i3 = i2 / 3;
                inflate2.setLayoutParams(new LayoutParams(i3, i3));
                return new C5167f(inflate2, this.f15166e);
            default:
                return null;
        }
    }
}
