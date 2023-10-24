package swayam.collections.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    public String sayHello(){
        return "sayHello";
    }

    @RequestMapping("about-section")
    public String aboutSection(){
        return "aboutSection";
    }

    @RequestMapping("contact-section")
    public String contactSection(){
        return "contactSection";
    }

    @RequestMapping("wedding-ceremony")
    public String weddingCeremony(){
        return "weddingCeremony";
    }

    @RequestMapping("roka-ceremony")
    public String rokaCeremony(){
        return "rokaCeremony";
    }
    @RequestMapping("engagement-ceremony")
    public String engagementCeremony(){
        return "engagementCeremony";
    }

    @RequestMapping("haldi-ceremony")
    public String haldiCeremony(){
        return "haldiCeremony";
    }
    @RequestMapping("event-gifting")
    public String eventGifting() {
        return "eventGifting";
    }
    @RequestMapping("corporate-gifting")
    public String corporateGifting(){
        return "corporateGifting";
    }

    @RequestMapping("floral-jewellery")
    public String floralJewellery(){
        return "floralJewellery";
    }

    @RequestMapping("floral-jewellery")
    public String floralJewellery(){
        return "floralJewellery";
    }
}
