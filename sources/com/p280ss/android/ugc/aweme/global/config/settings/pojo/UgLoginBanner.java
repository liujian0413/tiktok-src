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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner */
public final class UgLoginBanner extends Message<UgLoginBanner, Builder> {
    public static final DefaultValueProtoAdapter<UgLoginBanner> ADAPTER = new ProtoAdapter_UgLoginBanner();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgLoginBanner, Builder> {
        public UrlModel resource_url;
        public String text;

        public final UgLoginBanner build() {
            return new UgLoginBanner(this.resource_url, this.text, super.buildUnknownFields());
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner$ProtoAdapter_UgLoginBanner */
    static final class ProtoAdapter_UgLoginBanner extends DefaultValueProtoAdapter<UgLoginBanner> {
        public final UgLoginBanner redact(UgLoginBanner ugLoginBanner) {
            return ugLoginBanner;
        }

        public ProtoAdapter_UgLoginBanner() {
            super(FieldEncoding.LENGTH_DELIMITED, UgLoginBanner.class);
        }

        public final UgLoginBanner decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgLoginBanner) null);
        }

        public final int encodedSize(UgLoginBanner ugLoginBanner) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, ugLoginBanner.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugLoginBanner.text) + ugLoginBanner.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgLoginBanner ugLoginBanner) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, ugLoginBanner.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ugLoginBanner.text);
            protoWriter.writeBytes(ugLoginBanner.unknownFields());
        }

        public final UgLoginBanner decode(ProtoReader protoReader, UgLoginBanner ugLoginBanner) throws IOException {
            Builder builder;
            UgLoginBanner ugLoginBanner2 = (UgLoginBanner) C10938a.m32097a().mo26425a(UgLoginBanner.class, ugLoginBanner);
            if (ugLoginBanner2 != null) {
                builder = ugLoginBanner2.newBuilder();
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
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugLoginBanner2 != null) {
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

    public final String getText() throws NullValueException {
        if (this.text != null) {
            return this.text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.resource_url != null) {
            i = this.resource_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.text != null) {
            i3 = this.text.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "UgLoginBanner{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgLoginBanner)) {
            return false;
        }
        UgLoginBanner ugLoginBanner = (UgLoginBanner) obj;
        if (!unknownFields().equals(ugLoginBanner.unknownFields()) || !Internal.equals(this.resource_url, ugLoginBanner.resource_url) || !Internal.equals(this.text, ugLoginBanner.text)) {
            return false;
        }
        return true;
    }

    public UgLoginBanner(UrlModel urlModel, String str) {
        this(urlModel, str, ByteString.EMPTY);
    }

    public UgLoginBanner(UrlModel urlModel, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.text = str;
    }
}
