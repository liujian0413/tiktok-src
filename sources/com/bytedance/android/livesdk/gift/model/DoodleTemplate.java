package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

public class DoodleTemplate {
    @C6593c(mo15949a = "template_id")

    /* renamed from: id */
    public long f22200id;
    @C6593c(mo15949a = "image")
    public ImageModel image;
    public boolean selected;

    public long getId() {
        return this.f22200id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j) {
        this.f22200id = j;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
