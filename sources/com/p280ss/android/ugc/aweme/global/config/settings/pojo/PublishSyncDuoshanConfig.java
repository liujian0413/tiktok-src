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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig */
public final class PublishSyncDuoshanConfig extends Message<PublishSyncDuoshanConfig, Builder> {
    public static final DefaultValueProtoAdapter<PublishSyncDuoshanConfig> ADAPTER = new ProtoAdapter_PublishSyncDuoshanConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String h5_str;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String h5_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PublishSyncDuoshanConfig, Builder> {
        public String content;
        public String h5_str;
        public String h5_url;
        public String title;

        public final PublishSyncDuoshanConfig build() {
            PublishSyncDuoshanConfig publishSyncDuoshanConfig = new PublishSyncDuoshanConfig(this.title, this.content, this.h5_str, this.h5_url, super.buildUnknownFields());
            return publishSyncDuoshanConfig;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder h5_str(String str) {
            this.h5_str = str;
            return this;
        }

        public final Builder h5_url(String str) {
            this.h5_url = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig$ProtoAdapter_PublishSyncDuoshanConfig */
    static final class ProtoAdapter_PublishSyncDuoshanConfig extends DefaultValueProtoAdapter<PublishSyncDuoshanConfig> {
        public final PublishSyncDuoshanConfig redact(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            return publishSyncDuoshanConfig;
        }

        public ProtoAdapter_PublishSyncDuoshanConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PublishSyncDuoshanConfig.class);
        }

        public final PublishSyncDuoshanConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PublishSyncDuoshanConfig) null);
        }

        public final int encodedSize(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, publishSyncDuoshanConfig.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, publishSyncDuoshanConfig.content) + ProtoAdapter.STRING.encodedSizeWithTag(3, publishSyncDuoshanConfig.h5_str) + ProtoAdapter.STRING.encodedSizeWithTag(4, publishSyncDuoshanConfig.h5_url) + publishSyncDuoshanConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PublishSyncDuoshanConfig publishSyncDuoshanConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, publishSyncDuoshanConfig.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, publishSyncDuoshanConfig.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, publishSyncDuoshanConfig.h5_str);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, publishSyncDuoshanConfig.h5_url);
            protoWriter.writeBytes(publishSyncDuoshanConfig.unknownFields());
        }

        public final PublishSyncDuoshanConfig decode(ProtoReader protoReader, PublishSyncDuoshanConfig publishSyncDuoshanConfig) throws IOException {
            Builder builder;
            PublishSyncDuoshanConfig publishSyncDuoshanConfig2 = (PublishSyncDuoshanConfig) C10938a.m32097a().mo26425a(PublishSyncDuoshanConfig.class, publishSyncDuoshanConfig);
            if (publishSyncDuoshanConfig2 != null) {
                builder = publishSyncDuoshanConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.h5_str((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.h5_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (publishSyncDuoshanConfig2 != null) {
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

    public final String getContent() throws NullValueException {
        if (this.content != null) {
            return this.content;
        }
        throw new NullValueException();
    }

    public final String getH5Str() throws NullValueException {
        if (this.h5_str != null) {
            return this.h5_str;
        }
        throw new NullValueException();
    }

    public final String getH5Url() throws NullValueException {
        if (this.h5_url != null) {
            return this.h5_url;
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
        builder.title = this.title;
        builder.content = this.content;
        builder.h5_str = this.h5_str;
        builder.h5_url = this.h5_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.content != null) {
            i2 = this.content.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.h5_str != null) {
            i3 = this.h5_str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.h5_url != null) {
            i5 = this.h5_url.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.h5_str != null) {
            sb.append(", h5_str=");
            sb.append(this.h5_str);
        }
        if (this.h5_url != null) {
            sb.append(", h5_url=");
            sb.append(this.h5_url);
        }
        StringBuilder replace = sb.replace(0, 2, "PublishSyncDuoshanConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublishSyncDuoshanConfig)) {
            return false;
        }
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = (PublishSyncDuoshanConfig) obj;
        if (!unknownFields().equals(publishSyncDuoshanConfig.unknownFields()) || !Internal.equals(this.title, publishSyncDuoshanConfig.title) || !Internal.equals(this.content, publishSyncDuoshanConfig.content) || !Internal.equals(this.h5_str, publishSyncDuoshanConfig.h5_str) || !Internal.equals(this.h5_url, publishSyncDuoshanConfig.h5_url)) {
            return false;
        }
        return true;
    }

    public PublishSyncDuoshanConfig(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public PublishSyncDuoshanConfig(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.content = str2;
        this.h5_str = str3;
        this.h5_url = str4;
    }
}
