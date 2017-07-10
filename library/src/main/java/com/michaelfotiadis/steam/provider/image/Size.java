package com.michaelfotiadis.steam.provider.image;

public enum Size {
    // 1) tiny horizontal portrait - 35x20px
    // <suffix> = eb.png
    // 2) small horizontal portrait - 59x33px
    // <suffix> = sb.png
    // 3) large horizontal portrait - 205x11px
    // <suffix> = lg.png
    // 4) full quality horizontal portrait - 256x114px
    // <suffix> = full.png
    // 5) full quality vertical portrait - 234x272px
    // <suffix> = vert.jpg
    SMALL_HORIZONTAL("sb.png"),
    LARGE_HORIZONTAL("lg.png"),
    FULL_HORIZONTAL("full.png"),
    FULL_VERTICAL("vert.jpg");

    private final String text;

    Size(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return this.text;
    }

    public static Size fromString(final String text) {
        if (text == null || text.length() == 0) {
            return SMALL_HORIZONTAL;
        }
        for (final Size size : Size.values()) {
            if (size.toString().equals(text)) {
                return size;
            }
        }
        return SMALL_HORIZONTAL;

    }
}