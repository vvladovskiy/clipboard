package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSecondWindowPage extends BasePage {

    @FindBy(xpath = "//h1[.=' About this item ']")
    public WebElement aboutThisItemSection;

    @FindBy(xpath = "//*[.=' Resolution : 4K Ultra HD (3840 x 2160) Resolution || Refresh Rate : 100 Hertz  ']")
    public WebElement text01;
    @FindBy(xpath = "//*[.=' Connectivity: 4 HDMI ports to connect set top box || Blu-ray speakers or a gaming console || 2 USB ports to connect hard drives or other USB devices  ']")
    public WebElement text02;
    @FindBy(xpath = "//*[.=' Sound: 60 Watts Output - 4.2.2 Ch|| Powerful Speakers with Dolby Atmos || Surround Sound || Active Voice Amplifier || Adaptive Sound+  ']")
    public WebElement text03;
    @FindBy(xpath = "//*[.=' Smart TV Features : Mirroring || Tap View ||Multi-View || Music Wall || Mobile Camera Support || Wireless Dex || Auto Game Mode (ALLM) || Game Motion Plus || Dynamic Black EQ || Surround Sound || Super Ultra Wide Game View ||Mini Map Zoom || FreeSync Premium Pro || HGiG  ']")
    public WebElement text04;
    @FindBy(xpath = "//*[.=' Display: Matte Display || One Billion Color || PQI 4600 || 100% Colour Volume with Quantum Dot || Wide Viewing Angle || AI Upscale || Neo Quantum Processor 4K || Quantum Matrix Technology || Motion Xcelerator Turbo Pro || Real Depth Enhancer || LED Clear Motion  ']")
    public WebElement text05;
    @FindBy(xpath = "//*[.=' Warranty Information: 1 year comprehensive warranty plus additional 1 years on panel by brand from date of invoice  ']")
    public WebElement text06;
    @FindBy(xpath = "//*[starts-with(.,' Installation: TV Table stand is not included in the box with this model. customer may ask for Table Top Stand or Wall Mount which will be provided to the customer at the time of installation, please directly call Samsung support on [Please visit brand website for tollfree numbers] and provide product')]")
    public WebElement text07;
    @FindBy(xpath = "//*[.=' Easy Returns: This product is eligible for replacement within 10 days of delivery in case of any product defects, damage or features not matching the description  ']")
    public WebElement text08;



}