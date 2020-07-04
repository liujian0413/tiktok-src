package com.p280ss.android.ugc.effectmanager.effect.model;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffect */
public class ProviderEffect {
    public String click_url;

    /* renamed from: id */
    public String f113502id;
    public String path;
    public StickerBean sticker;
    public StickerBean thumbnail_sticker;
    public String title;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffect$StickerBean */
    public class StickerBean {
        public String height;
        public String size;
        public String url;
        public String width;

        public String toString() {
            StringBuilder sb = new StringBuilder("StickerBean{url='");
            sb.append(this.url);
            sb.append('\'');
            sb.append(", width='");
            sb.append(this.width);
            sb.append('\'');
            sb.append(", height='");
            sb.append(this.height);
            sb.append('\'');
            sb.append(", size='");
            sb.append(this.size);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public StickerBean() {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StickerListBean{id='");
        sb.append(this.f113502id);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", thumbnail_sticker=");
        sb.append(this.thumbnail_sticker);
        sb.append(", sticker=");
        sb.append(this.sticker);
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
