package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton */
public final class UgProfileActivityButton extends Message<UgProfileActivityButton, Builder> {
    public static final DefaultValueProtoAdapter<UgProfileActivityButton> ADAPTER = new ProtoAdapter_UgProfileActivityButton();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", label = 0, tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String tab_bubble_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer time_limit;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgProfileActivityButton, Builder> {
        public String h5_link;
        public UrlModel resource_url;
        public String tab_bubble_text;
        public Integer time_limit;

        public final UgProfileActivityButton build() {
            if (this.resource_url == null || this.h5_link == null) {
                throw C10939b.m32101a(this.resource_url, "resource_url", this.h5_link, "h5_link");
            }
            UgProfileActivityButton ugProfileActivityButton = new UgProfileActivityButton(this.resource_url, this.h5_link, this.tab_bubble_text, this.time_limit, super.buildUnknownFields());
            return ugProfileActivityButton;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder tab_bubble_text(String str) {
            this.tab_bubble_text = str;
            return this;
        }

        public final Builder time_limit(Integer num) {
            this.time_limit = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton$ProtoAdapter_UgProfileActivityButton */
    static final class ProtoAdapter_UgProfileActivityButton extends DefaultValueProtoAdapter<UgProfileActivityButton> {
        public final UgProfileActivityButton redact(UgProfileActivityButton ugProfileActivityButton) {
            return ugProfileActivityButton;
        }

        public ProtoAdapter_UgProfileActivityButton() {
            super(FieldEncoding.LENGTH_DELIMITED, UgProfileActivityButton.class);
        }

        public final UgProfileActivityButton decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgProfileActivityButton) null);
        }

        public final int encodedSize(UgProfileActivityButton ugProfileActivityButton) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, ugProfileActivityButton.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugProfileActivityButton.h5_link) + ProtoAdapter.STRING.encodedSizeWithTag(3, ugProfileActivityButton.tab_bubble_text) + ProtoAdapter.INT32.encodedSizeWithTag(4, ugProfileActivityButton.time_limit) + ugProfileActivityButton.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgProfileActivityButton ugProfileActivityButton) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, ugProfileActivityButton.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ugProfileActivityButton.h5_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ugProfileActivityButton.tab_bubble_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, ugProfileActivityButton.time_limit);
            protoWriter.writeBytes(ugProfileActivityButton.unknownFields());
        }

        public final UgProfileActivityButton decode(ProtoReader protoReader, UgProfileActivityButton ugProfileActivityButton) throws IOException {
            Builder builder;
            UgProfileActivityButton ugProfileActivityButton2 = (UgProfileActivityButton) C10938a.m32097a().mo26425a(UgProfileActivityButton.class, ugProfileActivityButton);
            if (ugProfileActivityButton2 != null) {
                builder = ugProfileActivityButton2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.resource_url));
                            break;
                        case 2:
                            builder.h5_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.tab_bubble_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.time_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugProfileActivityButton2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getH5Link() {
        return this.h5_link;
    }

    public final UrlModel getResourceUrl() {
        return this.resource_url;
    }

    public final String getTabBubbleText() throws NullValueException {
        if (this.tab_bubble_text != null) {
            return this.tab_bubble_text;
        }
        throw new NullValueException();
    }

    public final Integer getTimeLimit() throws NullValueException {
        if (this.time_limit != null) {
            return this.time_limit;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.h5_link = this.h5_link;
        builder.tab_bubble_text = this.tab_bubble_text;
        builder.time_limit = this.time_limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((unknownFields().hashCode() * 37) + this.resource_url.hashCode()) * 37) + this.h5_link.hashCode()) * 37;
        int i3 = 0;
        if (this.tab_bubble_text != null) {
            i = this.tab_bubble_text.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.time_limit != null) {
            i3 = this.time_limit.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", resource_url=");
        sb.append(this.resource_url);
        sb.append(", h5_link=");
        sb.append(this.h5_link);
        if (this.tab_bubble_text != null) {
            sb.append(", tab_bubble_text=");
            sb.append(this.tab_bubble_text);
        }
        if (this.time_limit != null) {
            sb.append(", time_limit=");
            sb.append(this.time_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "UgProfileActivityButton{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgProfileActivityButton)) {
            return false;
        }
        UgProfileActivityButton ugProfileActivityButton = (UgProfileActivityButton) obj;
        if (!unknownFields().equals(ugProfileActivityButton.unknownFields()) || !this.resource_url.equals(ugProfileActivityButton.resource_url) || !this.h5_link.equals(ugProfileActivityButton.h5_link) || !Internal.equals(this.tab_bubble_text, ugProfileActivityButton.tab_bubble_text) || !Internal.equals(this.time_limit, ugProfileActivityButton.time_limit)) {
            return false;
        }
        return true;
    }

    public UgProfileActivityButton(UrlModel urlModel, String str, String str2, Integer num) {
        this(urlModel, str, str2, num, ByteString.EMPTY);
    }

    public UgProfileActivityButton(UrlModel urlModel, String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.h5_link = str;
        this.tab_bubble_text = str2;
        this.time_limit = num;
    }
}
