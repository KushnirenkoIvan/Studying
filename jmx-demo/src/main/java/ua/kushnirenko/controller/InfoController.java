package ua.kushnirenko.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import ua.kushnirenko.service.ApplicationLogic;

import java.util.Iterator;

@Controller
public class InfoController {

    static final Logger LOG = Logger.getLogger(InfoController.class);

    @Autowired
    private ApplicationLogic appLogic;

    private String updatingResource = "-";

    public String getUpdatingResource() {
        return updatingResource;
    }

    public void setUpdatingResource(String updatingResource) {
        this.updatingResource = updatingResource;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect() {
        return "forward:/html/index.html";
    }

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getServerInfo(WebRequest webRequest) {
        LOG.info("Request received.");

        appLogic.start();

        StringBuilder sb = new StringBuilder("Last time the end of the schedulers work: " + updatingResource + "\n");

        sb.append("\nReceived request{");
        sb.append("\n\tdescription: " + webRequest.getDescription(true));
        sb.append("\n\tcontext path: " + webRequest.getContextPath());
        sb.append("\n\tHeaders{ ");
        Iterator<String> iter = webRequest.getHeaderNames();
        while (iter.hasNext()) {
            String headerName = iter.next();
            sb.append("\n\t\t" + headerName + ": " + webRequest.getHeader(headerName));
        }
        sb.append("\n\t\t}\n\t}");

        return sb.toString();
    }

}
