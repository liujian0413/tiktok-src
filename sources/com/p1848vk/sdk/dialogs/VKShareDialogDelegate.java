package com.p1848vk.sdk.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p1848vk.sdk.C47218d;
import com.p1848vk.sdk.VKSdk;
import com.p1848vk.sdk.api.C47116a;
import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.api.C47123e;
import com.p1848vk.sdk.api.VKParameters;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.VKRequest.C47115a;
import com.p1848vk.sdk.api.httpClient.C47135a;
import com.p1848vk.sdk.api.httpClient.C47147f;
import com.p1848vk.sdk.api.httpClient.C47147f.C47150a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation;
import com.p1848vk.sdk.api.model.VKApiLink;
import com.p1848vk.sdk.api.model.VKApiPhoto;
import com.p1848vk.sdk.api.model.VKAttachments;
import com.p1848vk.sdk.api.model.VKAttachments.VKApiAttachment;
import com.p1848vk.sdk.api.model.VKPhotoArray;
import com.p1848vk.sdk.api.photo.C47215b;
import com.p1848vk.sdk.api.photo.VKUploadImage;
import com.p1848vk.sdk.p1849a.C47108b;
import com.p1848vk.sdk.p1849a.C47109c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate */
class VKShareDialogDelegate {

    /* renamed from: f */
    static final /* synthetic */ boolean f121357f = (!VKShareDialogDelegate.class.desiredAssertionStatus());

    /* renamed from: a */
    public VKUploadImage[] f121358a;

    /* renamed from: b */
    public VKPhotoArray f121359b;

    /* renamed from: c */
    public CharSequence f121360c;

    /* renamed from: d */
    public final C47227a f121361d;

    /* renamed from: e */
    OnClickListener f121362e = new OnClickListener() {
        public final void onClick(View view) {
            VKShareDialogDelegate.this.mo118692a(true);
            if (VKShareDialogDelegate.this.f121358a == null || VKSdk.m147268c() == null) {
                VKShareDialogDelegate.this.mo118689a((VKAttachments) null);
                return;
            }
            new C47215b(VKShareDialogDelegate.this.f121358a, Long.valueOf(Long.parseLong(VKSdk.m147268c().f120885c)).longValue(), 0).mo118390a((C47115a) new C47115a() {
                /* renamed from: a */
                public final void mo118376a(C47121c cVar) {
                    VKShareDialogDelegate.this.mo118692a(false);
                }

                /* renamed from: a */
                public final void mo118377a(C47123e eVar) {
                    VKShareDialogDelegate.this.mo118689a(new VKAttachments((List<? extends VKApiAttachment>) (VKPhotoArray) eVar.f120933d));
                }
            });
        }
    };

    /* renamed from: g */
    private EditText f121363g;

    /* renamed from: h */
    private Button f121364h;

    /* renamed from: i */
    private ProgressBar f121365i;

    /* renamed from: j */
    private LinearLayout f121366j;

    /* renamed from: k */
    private HorizontalScrollView f121367k;

    /* renamed from: l */
    private UploadingLink f121368l;

    /* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate$UploadingLink */
    static class UploadingLink implements Parcelable {
        public static final Creator<UploadingLink> CREATOR = new Creator<UploadingLink>() {
            /* renamed from: a */
            private static UploadingLink[] m147696a(int i) {
                return new UploadingLink[i];
            }

            /* renamed from: a */
            private static UploadingLink m147695a(Parcel parcel) {
                return new UploadingLink(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m147695a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m147696a(i);
            }
        };

        /* renamed from: a */
        public String f121378a;

        /* renamed from: b */
        public String f121379b;

        public int describeContents() {
            return 0;
        }

        private UploadingLink(Parcel parcel) {
            this.f121378a = parcel.readString();
            this.f121379b = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f121378a);
            parcel.writeString(this.f121379b);
        }
    }

    /* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate$a */
    public interface C47227a {
        /* renamed from: a */
        Activity mo118685a();

        void dismissAllowingStateLoss();

        Dialog getDialog();

        Resources getResources();
    }

    /* renamed from: b */
    private void m147677b() {
        ArrayList arrayList = new ArrayList(this.f121359b.size());
        Iterator it = this.f121359b.iterator();
        while (it.hasNext()) {
            VKApiPhoto vKApiPhoto = (VKApiPhoto) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(vKApiPhoto.f121105c);
            sb.append('_');
            sb.append(vKApiPhoto.f121103a);
            arrayList.add(sb.toString());
        }
        new VKRequest("photos.getById", VKParameters.from("photo_sizes", Integer.valueOf(1), "photos", C47108b.m147300a((Collection<?>) arrayList, ",")), VKPhotoArray.class).mo118390a((C47115a) new C47115a() {
            /* renamed from: a */
            public final void mo118376a(C47121c cVar) {
            }

            /* renamed from: a */
            public final void mo118377a(C47123e eVar) {
                Iterator it = ((VKPhotoArray) eVar.f120933d).iterator();
                while (it.hasNext()) {
                    VKApiPhoto vKApiPhoto = (VKApiPhoto) it.next();
                    if (vKApiPhoto.f121116n.mo118655a('q') != null) {
                        VKShareDialogDelegate.this.mo118690a(vKApiPhoto.f121116n.mo118655a('q'));
                    } else if (vKApiPhoto.f121116n.mo118655a('p') != null) {
                        VKShareDialogDelegate.this.mo118690a(vKApiPhoto.f121116n.mo118655a('p'));
                    } else if (vKApiPhoto.f121116n.mo118655a('m') != null) {
                        VKShareDialogDelegate.this.mo118690a(vKApiPhoto.f121116n.mo118655a('m'));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo118687a() {
        int i;
        if (VERSION.SDK_INT >= 13) {
            Display defaultDisplay = ((WindowManager) this.f121361d.mo118685a().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x - (this.f121361d.getResources().getDimensionPixelSize(R.dimen.xg) * 2);
        } else {
            i = -2;
        }
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(this.f121361d.getDialog().getWindow().getAttributes());
        layoutParams.height = -2;
        layoutParams.width = i;
        this.f121361d.getDialog().getWindow().setAttributes(layoutParams);
    }

    /* renamed from: a */
    public final void mo118690a(String str) {
        mo118691a(str, 0);
    }

    public VKShareDialogDelegate(C47227a aVar) {
        this.f121361d = aVar;
    }

    /* renamed from: a */
    public final void mo118692a(boolean z) {
        if (z) {
            this.f121364h.setVisibility(8);
            this.f121365i.setVisibility(0);
            this.f121363g.setEnabled(false);
            this.f121366j.setEnabled(false);
            return;
        }
        this.f121364h.setVisibility(0);
        this.f121365i.setVisibility(8);
        this.f121363g.setEnabled(true);
        this.f121366j.setEnabled(true);
    }

    /* renamed from: b */
    public final void mo118693b(Bundle bundle) {
        bundle.putString("ShareText", this.f121363g.getText().toString());
        if (this.f121368l != null) {
            bundle.putParcelable("ShareLink", this.f121368l);
        }
        if (this.f121358a != null) {
            bundle.putParcelableArray("ShareImages", this.f121358a);
        }
        if (this.f121359b != null) {
            bundle.putParcelable("ShareUploadedImages", this.f121359b);
        }
    }

    /* renamed from: a */
    public final void mo118688a(Bitmap bitmap) {
        int i;
        if (this.f121361d.mo118685a() != null) {
            Bitmap a = C47218d.m147674a(bitmap, 100, 3);
            if (a != null) {
                ImageView imageView = new ImageView(this.f121361d.mo118685a());
                imageView.setImageBitmap(a);
                imageView.setAdjustViewBounds(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.f121366j.getChildCount() > 0) {
                    i = 10;
                } else {
                    i = 0;
                }
                layoutParams.setMargins(i, 0, 0, 0);
                this.f121366j.addView(imageView, layoutParams);
                this.f121366j.invalidate();
                this.f121367k.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final Dialog mo118686a(Bundle bundle) {
        Activity a = this.f121361d.mo118685a();
        View inflate = View.inflate(a, R.layout.b59, null);
        if (f121357f || inflate != null) {
            inflate.findViewById(R.id.xd).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    VKShareDialogDelegate.this.f121361d.dismissAllowingStateLoss();
                }
            });
            this.f121364h = (Button) inflate.findViewById(R.id.d2t);
            this.f121365i = (ProgressBar) inflate.findViewById(R.id.d2w);
            this.f121366j = (LinearLayout) inflate.findViewById(R.id.ayl);
            this.f121363g = (EditText) inflate.findViewById(R.id.d4j);
            this.f121367k = (HorizontalScrollView) inflate.findViewById(R.id.aym);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.hc);
            this.f121364h.setOnClickListener(this.f121362e);
            if (bundle != null) {
                this.f121363g.setText(bundle.getString("ShareText"));
                this.f121368l = (UploadingLink) bundle.getParcelable("ShareLink");
                this.f121358a = (VKUploadImage[]) bundle.getParcelableArray("ShareImages");
                this.f121359b = (VKPhotoArray) bundle.getParcelable("ShareUploadedImages");
            } else if (this.f121360c != null) {
                this.f121363g.setText(this.f121360c);
            }
            this.f121366j.removeAllViews();
            if (this.f121358a != null) {
                for (VKUploadImage vKUploadImage : this.f121358a) {
                    mo118688a(vKUploadImage.f121348a);
                }
                this.f121366j.setVisibility(0);
            }
            if (this.f121359b != null) {
                m147677b();
            }
            if (this.f121359b == null && this.f121358a == null) {
                this.f121366j.setVisibility(8);
            }
            if (this.f121368l != null) {
                TextView textView = (TextView) linearLayout.findViewById(R.id.bmf);
                ((TextView) linearLayout.findViewById(R.id.bmg)).setText(this.f121368l.f121378a);
                textView.setText(C47109c.m147311c(this.f121368l.f121379b));
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            Dialog dialog = new Dialog(a);
            dialog.requestWindowFeature(1);
            dialog.setContentView(inflate);
            dialog.setCancelable(true);
            return dialog;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo118689a(VKAttachments vKAttachments) {
        if (vKAttachments == null) {
            vKAttachments = new VKAttachments();
        }
        if (this.f121359b != null) {
            vKAttachments.addAll(this.f121359b);
        }
        if (this.f121368l != null) {
            vKAttachments.add(new VKApiLink(this.f121368l.f121379b));
        }
        String obj = this.f121363g.getText().toString();
        Long valueOf = Long.valueOf(Long.parseLong(VKSdk.m147268c().f120885c));
        C47116a.m147338a().mo118412a(VKParameters.from("owner_id", valueOf, "message", obj, "attachments", vKAttachments.mo118610a())).mo118390a((C47115a) new C47115a() {
            /* renamed from: a */
            public final void mo118376a(C47121c cVar) {
                VKShareDialogDelegate.this.mo118692a(false);
            }

            /* renamed from: a */
            public final void mo118377a(C47123e eVar) {
                VKShareDialogDelegate.this.mo118692a(false);
                VKShareDialogDelegate.this.f121361d.dismissAllowingStateLoss();
            }
        });
    }

    /* renamed from: a */
    public final void mo118691a(final String str, final int i) {
        if (i <= 10) {
            C47147f fVar = new C47147f(str);
            fVar.mo118436a(new C47150a() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo118401a(VKAbstractOperation vKAbstractOperation, C47121c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo118402a(C47147f fVar, Bitmap bitmap) {
                    if (bitmap == null) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            public final void run() {
                                VKShareDialogDelegate.this.mo118691a(str, i + 1);
                            }
                        }, 1000);
                    } else {
                        VKShareDialogDelegate.this.mo118688a(bitmap);
                    }
                }
            });
            C47135a.m147382a((VKAbstractOperation) fVar);
        }
    }
}
