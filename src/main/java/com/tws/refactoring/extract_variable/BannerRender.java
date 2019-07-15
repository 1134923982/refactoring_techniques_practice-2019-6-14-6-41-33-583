package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean doesPlatformContainMAC = platform.toUpperCase().contains("MAC");
        final boolean doesBrowserContainIE = browser.toUpperCase().contains("IE");
        if (doesPlatformContainMAC && doesBrowserContainIE) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
