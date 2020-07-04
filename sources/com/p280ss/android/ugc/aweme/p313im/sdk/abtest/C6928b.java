package com.p280ss.android.ugc.aweme.p313im.sdk.abtest;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.p534b.C10296b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.b */
public final class C6928b implements C6943d {

    /* renamed from: a */
    public C6943d f19617a;

    /* renamed from: b */
    private Context f19618b;

    public final void sendMsg() {
        int a = C30573f.m99861a();
        if (a == 10) {
            if (this.f19617a != null) {
                this.f19617a.sendMsg();
            }
        } else if (a == 20) {
            C30569a.m99847a(this.f19618b, this.f19618b.getResources().getString(R.string.bh9), this.f19618b.getResources().getString(R.string.bh8), R.string.bih, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (C6928b.this.f19617a != null) {
                        C6928b.this.f19617a.sendMsg();
                    }
                }
            }, R.string.bh5, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C30569a.m99846a();
                }
            });
        } else if (a == 21) {
            C10296b a2 = C10296b.m30493a(this.f19618b);
            if (!a2.mo25024a("im_fake_bind_phone_key", false)) {
                a2.mo25021a("im_fake_bind_phone_key", (Object) Boolean.valueOf(true)).mo25023a();
                C30569a.m99847a(this.f19618b, this.f19618b.getResources().getString(R.string.bh9), this.f19618b.getResources().getString(R.string.bh8), R.string.bih, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (C6928b.this.f19617a != null) {
                            C6928b.this.f19617a.sendMsg();
                        }
                    }
                }, R.string.bh5, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C30569a.m99846a();
                    }
                });
            } else if (this.f19617a != null) {
                this.f19617a.sendMsg();
            }
        } else if (a == 30) {
            C30569a.m99847a(this.f19618b, this.f19618b.getResources().getString(R.string.bh9), this.f19618b.getResources().getString(R.string.bh8), R.string.bih, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (C6928b.this.f19617a != null) {
                        C6928b.this.f19617a.sendMsg();
                    }
                }
            }, R.string.bh5, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C30569a.m99846a();
                }
            });
        } else if (a == 40) {
            C30569a.m99847a(this.f19618b, this.f19618b.getResources().getString(R.string.bh9), this.f19618b.getResources().getString(R.string.bh7), R.string.bih, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }, R.string.bh5, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C30569a.m99846a();
                }
            });
        }
    }

    public C6928b(Context context, C6943d dVar) {
        this.f19618b = context;
        this.f19617a = dVar;
    }
}
