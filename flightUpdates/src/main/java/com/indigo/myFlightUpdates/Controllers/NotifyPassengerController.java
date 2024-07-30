package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotifyPassengerController {

    @Autowired
    private NotificationService ;

    public boolean getUpdateToNotify(){

    }
}
