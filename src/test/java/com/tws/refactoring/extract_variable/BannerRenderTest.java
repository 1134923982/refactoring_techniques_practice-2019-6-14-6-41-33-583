package com.tws.refactoring.extract_variable;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Assert;
import org.junit.Test;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_is_mac_browser_is_IE() {
        BannerRender bannerRender = new BannerRender();
        String platform = "MAC";
        String browser = "IE";
        String result = "IE on Mac?";
        String actualResult = bannerRender.renderBanner(platform, browser);

        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_platform_not_is_mac_browser_is_IE() {
        BannerRender bannerRender = new BannerRender();
        String platform = "Windows";
        String browser = "IE";
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);

        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_platform_is_mac_browser_not_is_IE() {
        BannerRender bannerRender = new BannerRender();
        String platform = "MAC";
        String browser = "Chrome";
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);

        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_platform_not_is_mac_browser_not_is_IE() {
        BannerRender bannerRender = new BannerRender();
        String platform = "Windows";
        String browser = "Chrome";
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);

        Assert.assertSame(result,actualResult);
    }
}
