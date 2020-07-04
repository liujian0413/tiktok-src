package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40182c;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedAdapter */
public final class VideoImageMixedAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public C40182c f104392a;

    /* renamed from: b */
    private final ArrayList<MyMediaModel> f104393b = new ArrayList<>();

    /* renamed from: c */
    private int f104394c = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedAdapter$VideoImageMixedViewHolder */
    public final class VideoImageMixedViewHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f104395a = ((RemoteImageView) this.itemView.findViewById(R.id.eaf));

        /* renamed from: b */
        final /* synthetic */ VideoImageMixedAdapter f104396b;

        /* renamed from: c */
        private TextView f104397c;

        /* renamed from: d */
        private final RelativeLayout f104398d;

        /* renamed from: e */
        private final ImageView f104399e;

        /* renamed from: f */
        private final View f104400f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedAdapter$VideoImageMixedViewHolder$a */
        static final class C40162a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VideoImageMixedViewHolder f104401a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f104402b;

            C40162a(VideoImageMixedViewHolder videoImageMixedViewHolder, MyMediaModel myMediaModel) {
                this.f104401a = videoImageMixedViewHolder;
                this.f104402b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C40182c cVar = this.f104401a.f104396b.f104392a;
                if (cVar != null) {
                    cVar.mo99831a(this.f104402b);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedAdapter$VideoImageMixedViewHolder$b */
        static final class C40163b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ VideoImageMixedViewHolder f104403a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f104404b;

            C40163b(VideoImageMixedViewHolder videoImageMixedViewHolder, MyMediaModel myMediaModel) {
                this.f104403a = videoImageMixedViewHolder;
                this.f104404b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C40182c cVar = this.f104403a.f104396b.f104392a;
                if (cVar != null) {
                    cVar.mo99832a(this.f104404b, view);
                }
            }
        }

        /* renamed from: a */
        public final void mo99916a() {
            if (this.f104398d != null) {
                this.f104398d.setScaleX(1.0f);
                this.f104398d.setScaleY(1.0f);
            }
        }

        /* renamed from: b */
        public final void mo99918b() {
            if (this.f104398d != null) {
                this.f104398d.setScaleY(1.0f);
                this.f104398d.setScaleX(1.0f);
            }
        }

        public VideoImageMixedViewHolder(VideoImageMixedAdapter videoImageMixedAdapter, ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            this.f104396b = videoImageMixedAdapter;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3y, viewGroup, false));
            View findViewById = this.itemView.findViewById(R.id.abt);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.duration_text)");
            this.f104397c = (TextView) findViewById;
            this.f104398d = (RelativeLayout) this.itemView.findViewById(R.id.cws);
            this.f104399e = (ImageView) this.itemView.findViewById(R.id.a75);
            this.f104400f = this.itemView.findViewById(R.id.a76);
            float a = C20505c.m68010a(viewGroup.getContext(), 2.0f);
            Drawable a2 = C38501ax.m123068a(0, 1275068416, 0, new float[]{0.0f, 0.0f, a, a, 0.0f, 0.0f, a, a});
            RelativeLayout relativeLayout = this.f104398d;
            if (relativeLayout == null) {
                C7573i.m23580a();
            }
            if (C43127fh.m136806a(relativeLayout.getContext())) {
                a2 = C38501ax.m123068a(0, 1275068416, 0, new float[]{a, a, 0.0f, 0.0f, a, a, 0.0f, 0.0f});
            }
            ImageView imageView = this.f104399e;
            if (imageView != null) {
                imageView.setBackground(a2);
            }
        }

        /* renamed from: a */
        public final void mo99917a(MyMediaModel myMediaModel, VideoImageMixedViewHolder videoImageMixedViewHolder, int i) {
            C7573i.m23587b(videoImageMixedViewHolder, "holder");
            if (myMediaModel != null) {
                String str = myMediaModel.f88162h;
                C7573i.m23582a((Object) str, "mediaModel.thumbnail");
                VideoImageMixedAdapter.m128315a(videoImageMixedViewHolder, str);
                if (myMediaModel.mo86201c()) {
                    this.f104397c.setText(VideoImageMixedAdapter.m128314a(Math.round((((float) myMediaModel.f88159e) * 1.0f) / 1000.0f)));
                    this.f104397c.setVisibility(0);
                } else {
                    this.f104397c.setVisibility(8);
                }
            }
            View view = this.f104400f;
            if (view != null) {
                view.setOnClickListener(new C40162a(this, myMediaModel));
            }
            RelativeLayout relativeLayout = this.f104398d;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new C40163b(this, myMediaModel));
            }
        }
    }

    public final int getItemCount() {
        return this.f104393b.size();
    }

    /* renamed from: a */
    public static ViewPropertyAnimator m128313a(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        ViewPropertyAnimator scaleY = vVar.itemView.animate().scaleX(1.0f).scaleY(1.0f);
        C7573i.m23582a((Object) scaleY, "holder.itemView.animate(…scaleX(1.0f).scaleY(1.0f)");
        return scaleY;
    }

    /* renamed from: b */
    public final void mo99915b(MyMediaModel myMediaModel) {
        C7573i.m23587b(myMediaModel, "mediaModel");
        notifyItemInserted(getItemCount());
        this.f104393b.add(myMediaModel);
    }

    /* renamed from: a */
    public static String m128314a(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            Locale locale = Locale.CHINA;
            C7573i.m23582a((Object) locale, "Locale.CHINA");
            String a = C1642a.m8035a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            return a;
        }
        Locale locale2 = Locale.CHINA;
        C7573i.m23582a((Object) locale2, "Locale.CHINA");
        String a2 = C1642a.m8035a(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
        return a2;
    }

    /* renamed from: a */
    public final void mo99914a(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f104393b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = this.f104393b.get(i);
                C7573i.m23582a(obj, "mediaModelList[i]");
                if (C7573i.m23585a((Object) ((MyMediaModel) obj).f88156b, (Object) myMediaModel.f88156b)) {
                    notifyItemRemoved(i);
                    break;
                }
                i++;
            }
            this.f104393b.remove(myMediaModel);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        return new VideoImageMixedViewHolder(this, viewGroup);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "viewHolder");
        VideoImageMixedViewHolder videoImageMixedViewHolder = (VideoImageMixedViewHolder) vVar;
        videoImageMixedViewHolder.mo99917a((MyMediaModel) this.f104393b.get(i), videoImageMixedViewHolder, i);
    }

    /* renamed from: a */
    public final void mo99911a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        ((VideoImageMixedViewHolder) vVar).mo99916a();
        this.f104394c = vVar.getAdapterPosition();
    }

    /* renamed from: a */
    public static void m128315a(VideoImageMixedViewHolder videoImageMixedViewHolder, String str) {
        C13386a aVar;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        ImageRequest b = ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33468a(new C13596d(C23486n.m77122a(52.0d), C23486n.m77122a(52.0d))).mo33476b();
        C13382e a = C13380c.m39166a();
        RemoteImageView remoteImageView = videoImageMixedViewHolder.f104395a;
        if (remoteImageView != null) {
            aVar = remoteImageView.getController();
        } else {
            aVar = null;
        }
        C13396a c = ((C13382e) ((C13382e) a.mo32729b(aVar)).mo32748b(b)).mo32730f();
        RemoteImageView remoteImageView2 = videoImageMixedViewHolder.f104395a;
        if (remoteImageView2 != null) {
            remoteImageView2.setController(c);
        }
        Drawable a2 = C38501ax.m123066a(0, 219551779, 0, 0);
        RemoteImageView remoteImageView3 = videoImageMixedViewHolder.f104395a;
        if (remoteImageView3 != null) {
            C13438a aVar2 = (C13438a) remoteImageView3.getHierarchy();
            if (aVar2 != null) {
                aVar2.mo32900b(a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo99912a(C1293v vVar, C1293v vVar2) {
        C7573i.m23587b(vVar, "sourceHolder");
        C7573i.m23587b(vVar2, "targetHolder");
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f104393b.size() && adapterPosition2 < this.f104393b.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            Object remove = this.f104393b.remove(adapterPosition);
            C7573i.m23582a(remove, "mediaModelList.removeAt(from)");
            this.f104393b.add(adapterPosition2, (MyMediaModel) remove);
        }
    }

    /* renamed from: a */
    public final void mo99913a(C1293v vVar, boolean z) {
        C7573i.m23587b(vVar, "holder");
        if (this.f104394c != -1) {
            ((VideoImageMixedViewHolder) vVar).mo99918b();
            int adapterPosition = vVar.getAdapterPosition();
            if (!(adapterPosition == this.f104394c || this.f104392a == null)) {
                C40182c cVar = this.f104392a;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                cVar.mo99830a(this.f104394c, adapterPosition);
            }
            this.f104394c = -1;
        }
    }
}
