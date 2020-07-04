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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.TextFontStyleData */
public final class TextFontStyleData extends Message<TextFontStyleData, Builder> {
    public static final DefaultValueProtoAdapter<TextFontStyleData> ADAPTER = new ProtoAdapter_TextFontStyleData();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer enable_bg_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer enable_maskblur_light_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer extra_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String font_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.TextFontStyleData$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<TextFontStyleData, Builder> {
        public Integer enable_bg_color;
        public Integer enable_maskblur_light_color;
        public Integer extra_type;
        public String font_name;
        public String title;
        public String url;

        public final TextFontStyleData build() {
            TextFontStyleData textFontStyleData = new TextFontStyleData(this.font_name, this.extra_type, this.url, this.title, this.enable_bg_color, this.enable_maskblur_light_color, super.buildUnknownFields());
            return textFontStyleData;
        }

        public final Builder enable_bg_color(Integer num) {
            this.enable_bg_color = num;
            return this;
        }

        public final Builder enable_maskblur_light_color(Integer num) {
            this.enable_maskblur_light_color = num;
            return this;
        }

        public final Builder extra_type(Integer num) {
            this.extra_type = num;
            return this;
        }

        public final Builder font_name(String str) {
            this.font_name = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.TextFontStyleData$ProtoAdapter_TextFontStyleData */
    static final class ProtoAdapter_TextFontStyleData extends DefaultValueProtoAdapter<TextFontStyleData> {
        public final TextFontStyleData redact(TextFontStyleData textFontStyleData) {
            return textFontStyleData;
        }

        public ProtoAdapter_TextFontStyleData() {
            super(FieldEncoding.LENGTH_DELIMITED, TextFontStyleData.class);
        }

        public final TextFontStyleData decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (TextFontStyleData) null);
        }

        public final int encodedSize(TextFontStyleData textFontStyleData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, textFontStyleData.font_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, textFontStyleData.extra_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, textFontStyleData.url) + ProtoAdapter.STRING.encodedSizeWithTag(4, textFontStyleData.title) + ProtoAdapter.INT32.encodedSizeWithTag(5, textFontStyleData.enable_bg_color) + ProtoAdapter.INT32.encodedSizeWithTag(6, textFontStyleData.enable_maskblur_light_color) + textFontStyleData.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, TextFontStyleData textFontStyleData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textFontStyleData.font_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textFontStyleData.extra_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textFontStyleData.url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, textFontStyleData.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, textFontStyleData.enable_bg_color);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, textFontStyleData.enable_maskblur_light_color);
            protoWriter.writeBytes(textFontStyleData.unknownFields());
        }

        public final TextFontStyleData decode(ProtoReader protoReader, TextFontStyleData textFontStyleData) throws IOException {
            Builder builder;
            TextFontStyleData textFontStyleData2 = (TextFontStyleData) C10938a.m32097a().mo26425a(TextFontStyleData.class, textFontStyleData);
            if (textFontStyleData2 != null) {
                builder = textFontStyleData2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.font_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.extra_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.enable_bg_color((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.enable_maskblur_light_color((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (textFontStyleData2 != null) {
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

    public final Integer getEnableBgColor() throws NullValueException {
        if (this.enable_bg_color != null) {
            return this.enable_bg_color;
        }
        throw new NullValueException();
    }

    public final Integer getEnableMaskblurLightColor() throws NullValueException {
        if (this.enable_maskblur_light_color != null) {
            return this.enable_maskblur_light_color;
        }
        throw new NullValueException();
    }

    public final Integer getExtraType() throws NullValueException {
        if (this.extra_type != null) {
            return this.extra_type;
        }
        throw new NullValueException();
    }

    public final String getFontName() throws NullValueException {
        if (this.font_name != null) {
            return this.font_name;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final String getUrl() throws NullValueException {
        if (this.url != null) {
            return this.url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.font_name = this.font_name;
        builder.extra_type = this.extra_type;
        builder.url = this.url;
        builder.title = this.title;
        builder.enable_bg_color = this.enable_bg_color;
        builder.enable_maskblur_light_color = this.enable_maskblur_light_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.font_name != null) {
            i = this.font_name.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.extra_type != null) {
            i2 = this.extra_type.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.url != null) {
            i3 = this.url.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.title != null) {
            i4 = this.title.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.enable_bg_color != null) {
            i5 = this.enable_bg_color.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.enable_maskblur_light_color != null) {
            i7 = this.enable_maskblur_light_color.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.font_name != null) {
            sb.append(", font_name=");
            sb.append(this.font_name);
        }
        if (this.extra_type != null) {
            sb.append(", extra_type=");
            sb.append(this.extra_type);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.enable_bg_color != null) {
            sb.append(", enable_bg_color=");
            sb.append(this.enable_bg_color);
        }
        if (this.enable_maskblur_light_color != null) {
            sb.append(", enable_maskblur_light_color=");
            sb.append(this.enable_maskblur_light_color);
        }
        StringBuilder replace = sb.replace(0, 2, "TextFontStyleData{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextFontStyleData)) {
            return false;
        }
        TextFontStyleData textFontStyleData = (TextFontStyleData) obj;
        if (!unknownFields().equals(textFontStyleData.unknownFields()) || !Internal.equals(this.font_name, textFontStyleData.font_name) || !Internal.equals(this.extra_type, textFontStyleData.extra_type) || !Internal.equals(this.url, textFontStyleData.url) || !Internal.equals(this.title, textFontStyleData.title) || !Internal.equals(this.enable_bg_color, textFontStyleData.enable_bg_color) || !Internal.equals(this.enable_maskblur_light_color, textFontStyleData.enable_maskblur_light_color)) {
            return false;
        }
        return true;
    }

    public TextFontStyleData(String str, Integer num, String str2, String str3, Integer num2, Integer num3) {
        this(str, num, str2, str3, num2, num3, ByteString.EMPTY);
    }

    public TextFontStyleData(String str, Integer num, String str2, String str3, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.font_name = str;
        this.extra_type = num;
        this.url = str2;
        this.title = str3;
        this.enable_bg_color = num2;
        this.enable_maskblur_light_color = num3;
    }
}
