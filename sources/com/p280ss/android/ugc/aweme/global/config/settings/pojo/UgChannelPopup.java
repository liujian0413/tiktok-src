package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup */
public final class UgChannelPopup extends Message<UgChannelPopup, Builder> {
    public static final DefaultValueProtoAdapter<UgChannelPopup> ADAPTER = new ProtoAdapter_UgChannelPopup();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String button_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 8)
    public final List<String> campaign_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String campaign_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer image_style;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String link_schema;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public final Boolean show_for_all;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgChannelPopup, Builder> {
        public String button_text;
        public List<String> campaign_list = Internal.newMutableList();
        public String campaign_name;
        public String content;
        public String h5_link;
        public Integer image_style;
        public String link_schema;
        public UrlModel resource_url;
        public Boolean show_for_all;
        public String title;

        public final UgChannelPopup build() {
            UgChannelPopup ugChannelPopup = new UgChannelPopup(this.resource_url, this.title, this.content, this.button_text, this.h5_link, this.link_schema, this.campaign_name, this.campaign_list, this.image_style, this.show_for_all, super.buildUnknownFields());
            return ugChannelPopup;
        }

        public final Builder button_text(String str) {
            this.button_text = str;
            return this;
        }

        public final Builder campaign_name(String str) {
            this.campaign_name = str;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder image_style(Integer num) {
            this.image_style = num;
            return this;
        }

        public final Builder link_schema(String str) {
            this.link_schema = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder show_for_all(Boolean bool) {
            this.show_for_all = bool;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder campaign_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.campaign_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup$ProtoAdapter_UgChannelPopup */
    static final class ProtoAdapter_UgChannelPopup extends DefaultValueProtoAdapter<UgChannelPopup> {
        public final UgChannelPopup redact(UgChannelPopup ugChannelPopup) {
            return ugChannelPopup;
        }

        public ProtoAdapter_UgChannelPopup() {
            super(FieldEncoding.LENGTH_DELIMITED, UgChannelPopup.class);
        }

        public final UgChannelPopup decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgChannelPopup) null);
        }

        public final int encodedSize(UgChannelPopup ugChannelPopup) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, ugChannelPopup.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugChannelPopup.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, ugChannelPopup.content) + ProtoAdapter.STRING.encodedSizeWithTag(4, ugChannelPopup.button_text) + ProtoAdapter.STRING.encodedSizeWithTag(5, ugChannelPopup.h5_link) + ProtoAdapter.STRING.encodedSizeWithTag(6, ugChannelPopup.link_schema) + ProtoAdapter.STRING.encodedSizeWithTag(7, ugChannelPopup.campaign_name) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, ugChannelPopup.campaign_list) + ProtoAdapter.INT32.encodedSizeWithTag(9, ugChannelPopup.image_style) + ProtoAdapter.BOOL.encodedSizeWithTag(10, ugChannelPopup.show_for_all) + ugChannelPopup.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgChannelPopup ugChannelPopup) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, ugChannelPopup.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ugChannelPopup.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ugChannelPopup.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ugChannelPopup.button_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, ugChannelPopup.h5_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, ugChannelPopup.link_schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, ugChannelPopup.campaign_name);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, ugChannelPopup.campaign_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, ugChannelPopup.image_style);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, ugChannelPopup.show_for_all);
            protoWriter.writeBytes(ugChannelPopup.unknownFields());
        }

        public final UgChannelPopup decode(ProtoReader protoReader, UgChannelPopup ugChannelPopup) throws IOException {
            Builder builder;
            UgChannelPopup ugChannelPopup2 = (UgChannelPopup) C10938a.m32097a().mo26425a(UgChannelPopup.class, ugChannelPopup);
            if (ugChannelPopup2 != null) {
                builder = ugChannelPopup2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.resource_url));
                            break;
                        case 2:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.button_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.h5_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.link_schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.campaign_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.image_style((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.show_for_all((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugChannelPopup2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.campaign_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getCampaignList() {
        return this.campaign_list;
    }

    public final String getButtonText() throws NullValueException {
        if (this.button_text != null) {
            return this.button_text;
        }
        throw new NullValueException();
    }

    public final String getCampaignName() throws NullValueException {
        if (this.campaign_name != null) {
            return this.campaign_name;
        }
        throw new NullValueException();
    }

    public final String getContent() throws NullValueException {
        if (this.content != null) {
            return this.content;
        }
        throw new NullValueException();
    }

    public final String getH5Link() throws NullValueException {
        if (this.h5_link != null) {
            return this.h5_link;
        }
        throw new NullValueException();
    }

    public final Integer getImageStyle() throws NullValueException {
        if (this.image_style != null) {
            return this.image_style;
        }
        throw new NullValueException();
    }

    public final String getLinkSchema() throws NullValueException {
        if (this.link_schema != null) {
            return this.link_schema;
        }
        throw new NullValueException();
    }

    public final UrlModel getResourceUrl() throws NullValueException {
        if (this.resource_url != null) {
            return this.resource_url;
        }
        throw new NullValueException();
    }

    public final Boolean getShowForAll() throws NullValueException {
        if (this.show_for_all != null) {
            return this.show_for_all;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.title = this.title;
        builder.content = this.content;
        builder.button_text = this.button_text;
        builder.h5_link = this.h5_link;
        builder.link_schema = this.link_schema;
        builder.campaign_name = this.campaign_name;
        builder.campaign_list = Internal.copyOf("campaign_list", this.campaign_list);
        builder.image_style = this.image_style;
        builder.show_for_all = this.show_for_all;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.resource_url != null) {
            i = this.resource_url.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.content != null) {
            i3 = this.content.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.button_text != null) {
            i4 = this.button_text.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.h5_link != null) {
            i5 = this.h5_link.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.link_schema != null) {
            i6 = this.link_schema.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.campaign_name != null) {
            i7 = this.campaign_name.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = (((i16 + i7) * 37) + this.campaign_list.hashCode()) * 37;
        if (this.image_style != null) {
            i8 = this.image_style.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (hashCode2 + i8) * 37;
        if (this.show_for_all != null) {
            i10 = this.show_for_all.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.button_text != null) {
            sb.append(", button_text=");
            sb.append(this.button_text);
        }
        if (this.h5_link != null) {
            sb.append(", h5_link=");
            sb.append(this.h5_link);
        }
        if (this.link_schema != null) {
            sb.append(", link_schema=");
            sb.append(this.link_schema);
        }
        if (this.campaign_name != null) {
            sb.append(", campaign_name=");
            sb.append(this.campaign_name);
        }
        if (!this.campaign_list.isEmpty()) {
            sb.append(", campaign_list=");
            sb.append(this.campaign_list);
        }
        if (this.image_style != null) {
            sb.append(", image_style=");
            sb.append(this.image_style);
        }
        if (this.show_for_all != null) {
            sb.append(", show_for_all=");
            sb.append(this.show_for_all);
        }
        StringBuilder replace = sb.replace(0, 2, "UgChannelPopup{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgChannelPopup)) {
            return false;
        }
        UgChannelPopup ugChannelPopup = (UgChannelPopup) obj;
        if (!unknownFields().equals(ugChannelPopup.unknownFields()) || !Internal.equals(this.resource_url, ugChannelPopup.resource_url) || !Internal.equals(this.title, ugChannelPopup.title) || !Internal.equals(this.content, ugChannelPopup.content) || !Internal.equals(this.button_text, ugChannelPopup.button_text) || !Internal.equals(this.h5_link, ugChannelPopup.h5_link) || !Internal.equals(this.link_schema, ugChannelPopup.link_schema) || !Internal.equals(this.campaign_name, ugChannelPopup.campaign_name) || !this.campaign_list.equals(ugChannelPopup.campaign_list) || !Internal.equals(this.image_style, ugChannelPopup.image_style) || !Internal.equals(this.show_for_all, ugChannelPopup.show_for_all)) {
            return false;
        }
        return true;
    }

    public UgChannelPopup(UrlModel urlModel, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Integer num, Boolean bool) {
        this(urlModel, str, str2, str3, str4, str5, str6, list, num, bool, ByteString.EMPTY);
    }

    public UgChannelPopup(UrlModel urlModel, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.title = str;
        this.content = str2;
        this.button_text = str3;
        this.h5_link = str4;
        this.link_schema = str5;
        this.campaign_name = str6;
        this.campaign_list = Internal.immutableCopyOf("campaign_list", list);
        this.image_style = num;
        this.show_for_all = bool;
    }
}
