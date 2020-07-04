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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble */
public final class UgBubble extends Message<UgBubble, Builder> {
    public static final DefaultValueProtoAdapter<UgBubble> ADAPTER = new ProtoAdapter_UgBubble();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 3)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer seconds;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgBubble, Builder> {
        public UrlModel resource_url;
        public Integer seconds;
        public String text;

        public final UgBubble build() {
            return new UgBubble(this.text, this.resource_url, this.seconds, super.buildUnknownFields());
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder seconds(Integer num) {
            this.seconds = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble$ProtoAdapter_UgBubble */
    static final class ProtoAdapter_UgBubble extends DefaultValueProtoAdapter<UgBubble> {
        public final UgBubble redact(UgBubble ugBubble) {
            return ugBubble;
        }

        public ProtoAdapter_UgBubble() {
            super(FieldEncoding.LENGTH_DELIMITED, UgBubble.class);
        }

        public final UgBubble decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgBubble) null);
        }

        public final int encodedSize(UgBubble ugBubble) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, ugBubble.text) + UrlModel.ADAPTER.encodedSizeWithTag(3, ugBubble.resource_url) + ProtoAdapter.INT32.encodedSizeWithTag(4, ugBubble.seconds) + ugBubble.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgBubble ugBubble) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ugBubble.text);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 3, ugBubble.resource_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, ugBubble.seconds);
            protoWriter.writeBytes(ugBubble.unknownFields());
        }

        public final UgBubble decode(ProtoReader protoReader, UgBubble ugBubble) throws IOException {
            Builder builder;
            UgBubble ugBubble2 = (UgBubble) C10938a.m32097a().mo26425a(UgBubble.class, ugBubble);
            if (ugBubble2 != null) {
                builder = ugBubble2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.resource_url));
                            break;
                        case 4:
                            builder.seconds((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugBubble2 != null) {
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

    public final UrlModel getResourceUrl() throws NullValueException {
        if (this.resource_url != null) {
            return this.resource_url;
        }
        throw new NullValueException();
    }

    public final Integer getSeconds() throws NullValueException {
        if (this.seconds != null) {
            return this.seconds;
        }
        throw new NullValueException();
    }

    public final String getText() throws NullValueException {
        if (this.text != null) {
            return this.text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.resource_url = this.resource_url;
        builder.seconds = this.seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.text != null) {
            i = this.text.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.resource_url != null) {
            i2 = this.resource_url.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.seconds != null) {
            i4 = this.seconds.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.seconds != null) {
            sb.append(", seconds=");
            sb.append(this.seconds);
        }
        StringBuilder replace = sb.replace(0, 2, "UgBubble{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgBubble)) {
            return false;
        }
        UgBubble ugBubble = (UgBubble) obj;
        if (!unknownFields().equals(ugBubble.unknownFields()) || !Internal.equals(this.text, ugBubble.text) || !Internal.equals(this.resource_url, ugBubble.resource_url) || !Internal.equals(this.seconds, ugBubble.seconds)) {
            return false;
        }
        return true;
    }

    public UgBubble(String str, UrlModel urlModel, Integer num) {
        this(str, urlModel, num, ByteString.EMPTY);
    }

    public UgBubble(String str, UrlModel urlModel, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.resource_url = urlModel;
        this.seconds = num;
    }
}
