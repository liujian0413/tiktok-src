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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WatermarkStruct */
public final class WatermarkStruct extends Message<WatermarkStruct, Builder> {
    public static final DefaultValueProtoAdapter<WatermarkStruct> ADAPTER = new ProtoAdapter_WatermarkStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String end_watermark_string;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String end_watermark_substring;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String fps;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String md5;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 1)
    public final UrlModel resource_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WatermarkStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WatermarkStruct, Builder> {
        public String end_watermark_string;
        public String end_watermark_substring;
        public String fps;
        public String md5;
        public UrlModel resource_url;

        public final WatermarkStruct build() {
            WatermarkStruct watermarkStruct = new WatermarkStruct(this.resource_url, this.md5, this.fps, this.end_watermark_string, this.end_watermark_substring, super.buildUnknownFields());
            return watermarkStruct;
        }

        public final Builder end_watermark_string(String str) {
            this.end_watermark_string = str;
            return this;
        }

        public final Builder end_watermark_substring(String str) {
            this.end_watermark_substring = str;
            return this;
        }

        public final Builder fps(String str) {
            this.fps = str;
            return this;
        }

        public final Builder md5(String str) {
            this.md5 = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WatermarkStruct$ProtoAdapter_WatermarkStruct */
    static final class ProtoAdapter_WatermarkStruct extends DefaultValueProtoAdapter<WatermarkStruct> {
        public final WatermarkStruct redact(WatermarkStruct watermarkStruct) {
            return watermarkStruct;
        }

        public ProtoAdapter_WatermarkStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, WatermarkStruct.class);
        }

        public final WatermarkStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (WatermarkStruct) null);
        }

        public final int encodedSize(WatermarkStruct watermarkStruct) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, watermarkStruct.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, watermarkStruct.md5) + ProtoAdapter.STRING.encodedSizeWithTag(3, watermarkStruct.fps) + ProtoAdapter.STRING.encodedSizeWithTag(4, watermarkStruct.end_watermark_string) + ProtoAdapter.STRING.encodedSizeWithTag(5, watermarkStruct.end_watermark_substring) + watermarkStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WatermarkStruct watermarkStruct) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, watermarkStruct.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, watermarkStruct.md5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, watermarkStruct.fps);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, watermarkStruct.end_watermark_string);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, watermarkStruct.end_watermark_substring);
            protoWriter.writeBytes(watermarkStruct.unknownFields());
        }

        public final WatermarkStruct decode(ProtoReader protoReader, WatermarkStruct watermarkStruct) throws IOException {
            Builder builder;
            WatermarkStruct watermarkStruct2 = (WatermarkStruct) C10938a.m32097a().mo26425a(WatermarkStruct.class, watermarkStruct);
            if (watermarkStruct2 != null) {
                builder = watermarkStruct2.newBuilder();
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
                            builder.md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.fps((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.end_watermark_string((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.end_watermark_substring((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (watermarkStruct2 != null) {
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

    public final String getEndWatermarkString() throws NullValueException {
        if (this.end_watermark_string != null) {
            return this.end_watermark_string;
        }
        throw new NullValueException();
    }

    public final String getEndWatermarkSubstring() throws NullValueException {
        if (this.end_watermark_substring != null) {
            return this.end_watermark_substring;
        }
        throw new NullValueException();
    }

    public final String getFps() throws NullValueException {
        if (this.fps != null) {
            return this.fps;
        }
        throw new NullValueException();
    }

    public final String getMd5() throws NullValueException {
        if (this.md5 != null) {
            return this.md5;
        }
        throw new NullValueException();
    }

    public final UrlModel getResourceUrl() throws NullValueException {
        if (this.resource_url != null) {
            return this.resource_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.md5 = this.md5;
        builder.fps = this.fps;
        builder.end_watermark_string = this.end_watermark_string;
        builder.end_watermark_substring = this.end_watermark_substring;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.resource_url != null) {
            i = this.resource_url.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.md5 != null) {
            i2 = this.md5.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.fps != null) {
            i3 = this.fps.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.end_watermark_string != null) {
            i4 = this.end_watermark_string.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.end_watermark_substring != null) {
            i6 = this.end_watermark_substring.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_url != null) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.md5 != null) {
            sb.append(", md5=");
            sb.append(this.md5);
        }
        if (this.fps != null) {
            sb.append(", fps=");
            sb.append(this.fps);
        }
        if (this.end_watermark_string != null) {
            sb.append(", end_watermark_string=");
            sb.append(this.end_watermark_string);
        }
        if (this.end_watermark_substring != null) {
            sb.append(", end_watermark_substring=");
            sb.append(this.end_watermark_substring);
        }
        StringBuilder replace = sb.replace(0, 2, "WatermarkStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WatermarkStruct)) {
            return false;
        }
        WatermarkStruct watermarkStruct = (WatermarkStruct) obj;
        if (!unknownFields().equals(watermarkStruct.unknownFields()) || !Internal.equals(this.resource_url, watermarkStruct.resource_url) || !Internal.equals(this.md5, watermarkStruct.md5) || !Internal.equals(this.fps, watermarkStruct.fps) || !Internal.equals(this.end_watermark_string, watermarkStruct.end_watermark_string) || !Internal.equals(this.end_watermark_substring, watermarkStruct.end_watermark_substring)) {
            return false;
        }
        return true;
    }

    public WatermarkStruct(UrlModel urlModel, String str, String str2, String str3, String str4) {
        this(urlModel, str, str2, str3, str4, ByteString.EMPTY);
    }

    public WatermarkStruct(UrlModel urlModel, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.md5 = str;
        this.fps = str2;
        this.end_watermark_string = str3;
        this.end_watermark_substring = str4;
    }
}
