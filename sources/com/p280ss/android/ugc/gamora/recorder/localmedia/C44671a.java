package com.p280ss.android.ugc.gamora.recorder.localmedia;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a */
public final class C44671a extends C12629j {

    /* renamed from: i */
    public static final C44672a f115036i = new C44672a(null);

    /* renamed from: j */
    private ShortVideoContext f115037j;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$a */
    public static final class C44672a {
        private C44672a() {
        }

        public /* synthetic */ C44672a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Bundle m141058a(LocalMediaArgument localMediaArgument) {
            C7573i.m23587b(localMediaArgument, "argument");
            Bundle bundle = new Bundle();
            bundle.putParcelable("local_media_argument", localMediaArgument);
            return bundle;
        }
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
            this.f115037j = shortVideoContext;
            Bundle bundle2 = this.f33529g;
            if (bundle2 == null) {
                C7573i.m23580a();
            }
            Object obj = bundle2.get("local_media_argument");
            if (obj != null) {
                LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("key_support_flag", localMediaArgument.f115028c);
                bundle3.putBoolean("Key_enable_multi_video", localMediaArgument.f115029d);
                bundle3.putLong("Key_min_duration", localMediaArgument.f115031f);
                bundle3.putInt("key_photo_select_min_count", localMediaArgument.f115032g);
                bundle3.putInt("key_photo_select_max_count", localMediaArgument.f115033h);
                bundle3.putInt("key_video_select_min_count", localMediaArgument.f115034i);
                bundle3.putInt("key_video_select_max_count", localMediaArgument.f115035j);
                bundle3.putInt("key_choose_scene", localMediaArgument.f115030e);
                String str = "key_short_video_context";
                ShortVideoContext shortVideoContext2 = this.f115037j;
                if (shortVideoContext2 == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                bundle3.putParcelable(str, shortVideoContext2);
                bundle3.putInt("key_choose_request_code", localMediaArgument.f115026a);
                Intent intent = new Intent(this.f33526d_, MvChoosePhotoActivity.class);
                intent.putExtras(bundle3);
                if (localMediaArgument.f115027b > 0) {
                    Activity v = mo31015v();
                    intent.putExtra("key_start_activity_request_code", localMediaArgument.f115027b);
                    v.startActivityForResult(intent, localMediaArgument.f115027b);
                } else {
                    mo31015v().startActivity(intent);
                }
                mo31018y().mo31067b((C12629j) this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        return new View(viewGroup.getContext());
    }
}
